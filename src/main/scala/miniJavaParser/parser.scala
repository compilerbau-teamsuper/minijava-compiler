package miniJavaParser
import AST.*
import AST.BinaryOperator.{Add, Subtract}
import miniJavaParser.*
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, ParserRuleContext}

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters.*

object JavaASTBuilder {

  def parseFromText(text: String): CompilationUnit = {
    val input = CharStreams.fromString(text)
    val lexer = new miniJavaLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new miniJavaParser(tokens)

    // Baue die AST-Root-Knoten
    val tree = parser.compilationUnit()

    // Besuch den Parse Tree und baue den AST
    val astBuilder = new ASTBuilderVisitor()
    astBuilder.visitCompilationUnit(tree)
  }

  def parseFromFile(path: String): CompilationUnit = {
    val input = CharStreams.fromFileName(path)
    val lexer = new miniJavaLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new miniJavaParser(tokens)

    // Baue die AST-Root-Knoten
    val tree = parser.compilationUnit()

    // Besuch den Parse Tree und baue den AST
    val astBuilder = new ASTBuilderVisitor()
    astBuilder.visitCompilationUnit(tree)
  }
}

// Visitor-Klasse zur Generierung des AST
class ASTBuilderVisitor extends miniJavaBaseVisitor[ASTNode] { // ToDo: Klasse private machen? Nicht so wichtig tho

  private var currentThis: String = ""
  private var currentSuper: AmbiguousName = AmbiguousName(List("Object"))
  private var currentFields: Map[String, ListBuffer[ExpressionStatement]] = Map.empty[String, ListBuffer[ExpressionStatement]]

  override def visitCompilationUnit(ctx: CompilationUnitContext): CompilationUnit = {
    val packageDeclaration = Option(ctx.packageDeclaration())
      .map(visitPackageDeclaration)
    val importDeclarations = ctx.importDeclaration().asScala.map(visitImportDeclaration).toList
    val typeDeclarations = ctx.typeDeclaration().asScala.map(visitTypeDeclaration).toList

    CompilationUnit(packageDeclaration, importDeclarations, typeDeclarations)
  }

  override def visitPackageDeclaration(ctx: PackageDeclarationContext): PackageDeclaration = {
    PackageDeclaration(ctx.qualifiedName().getText)
  }

  override def visitImportDeclaration(ctx: ImportDeclarationContext): ImportDeclaration = {
    ImportDeclaration(
      buildAmbiguousName(ctx.qualifiedName()),
      ctx.Static() != null,
      ctx.Wildcard() != null
    )
  }

  override def visitTypeDeclaration(ctx: TypeDeclarationContext): TypeDeclaration = {
    if (ctx.classDeclaration() != null) visitClassDeclaration(ctx.classDeclaration())
    else if (ctx.interfaceDeclaration() != null) visitInterfaceDeclaration(ctx.interfaceDeclaration())
    else null // Just Semikolon
  }

  override def visitClassDeclaration(ctx: ClassDeclarationContext): ClassDeclaration = {
    val modifiers = getModifiers(ctx)
    val name = ctx.Identifier().getText
    val oldCurrentThis = currentThis
    currentThis = name
    val superclass =  if ctx.superclass() != null then buildAmbiguousName(ctx.superclass().qualifiedName()) else AmbiguousName(List("Object"))
    val oldCurrentSuper = currentSuper
    currentSuper = superclass
    val interfaces = if ctx.superinterfaces() != null then ctx.superinterfaces().qualifiedName().asScala.map(buildAmbiguousName(_)).toList else List.empty
    var body = getClassBody(ctx.classBody(), name)
    currentThis = oldCurrentThis
    currentSuper = oldCurrentSuper
    val hasConstructor = body.exists(x => x match {
      case ConstructorDeclaration(_,_,_,_,_) => true
      case _ => false
    })
    val constructorModifiers = modifiers.intersect(List(Modifier.Public, Modifier.Protected, Modifier.Private))
    body = if !hasConstructor then body.::(buildStandardConstructor(constructorModifiers, name)) else body

    ClassDeclaration(modifiers, name, superclass, interfaces, body)
  }

  override def visitInterfaceDeclaration(ctx: InterfaceDeclarationContext): InterfaceDeclaration = {
    val modifiers: List[Modifier] = if ctx.Public() != null then List(Modifier.Public) else List.empty
    val name = ctx.Identifier().getText
    val superInterfaces = if ctx.extendsInterfaces() != null then ctx.extendsInterfaces().qualifiedName().asScala.map(x => buildAmbiguousName(x)).toList else List.empty
    val body = getInterfaceBody(ctx.interfaceBody())

    InterfaceDeclaration(modifiers, name, superInterfaces, body)
  }

  private def getClassBody(ctx: ClassBodyContext, currentClass: String): List[ClassMember] = {
    if !ctx.classBodyDeclaration().isEmpty then {
      val classBodyDecs : ListBuffer[ClassMember] = ListBuffer()
      ctx.classBodyDeclaration().asScala.toList.foreach(c => visitClassBodyDec(c, currentClass) match {
        case cm: ClassMember => classBodyDecs.addOne(cm)
        case cms: List[ClassMember] => classBodyDecs.addAll(cms)
      })
      classBodyDecs.toList
    }
    else List.empty
  }

  private def getInterfaceBody(ctx: InterfaceBodyContext): List[InterfaceMember] = {
    if !ctx.interfaceBodyDeclaration().isEmpty then {
      val interfaceBodyDecs: ListBuffer[InterfaceMember] = ListBuffer()
      ctx.interfaceBodyDeclaration().asScala.toList.foreach(i => visitInterfaceBodyDec(i) match {
        case im: InterfaceMember => interfaceBodyDecs.addOne(im)
        case ims: List[InterfaceMember] => interfaceBodyDecs.addAll(ims)
      })
      interfaceBodyDecs.toList
    }
    else List.empty
  }

  private def buildAmbiguousName(ctx: QualifiedNameContext): AmbiguousName = {
    AmbiguousName(ctx.Identifier().asScala.map(p => p.getText).toList)
  }

  private def getModifiers(ctx: ParserRuleContext): List[Modifier] = {
    if ctx == null then return List.empty
    val modifiers: ListBuffer[Modifier] = ListBuffer()
    for (i <- 0 until ctx.getChildCount)
      try modifiers.addOne(toModifier(ctx.getChild(i).getText))
      catch
        case _: IllegalArgumentException =>
    modifiers.toList
  }

  private def toModifier(modifier: String): Modifier = modifier match {
    case "public"      => Modifier.Public
    case "private"     => Modifier.Private
    case "protected"   => Modifier.Protected
    case "abstract"    => Modifier.Abstract
    case "static"      => Modifier.Static
    case "final"       => Modifier.Final
    case _             => throw new IllegalArgumentException(s"Unknown modifier: $modifier")
  }

  private def visitClassBodyDec(ctx: ClassBodyDeclarationContext, currentClass: String): ClassMember | List[ClassMember] = {
    if (ctx.block() != null) {
      visitBlock(ctx.block())
    }
    else if (ctx.memberDeclaration() != null) {
      visitMemberDec(ctx.memberDeclaration(), currentClass)
    }
    else null  // ToDo: None?
  }

  private def visitInterfaceBodyDec(ctx: InterfaceBodyDeclarationContext): InterfaceMember | List[InterfaceMember] = {
    if (ctx.interfaceMemberDeclaration() != null) {
      visitInterfaceMemberDec(ctx.interfaceMemberDeclaration())
    }
    else null // ToDo: None?
  }

  // Hilfsfunktion für MemberDeclaration
  private def visitMemberDec(ctx: MemberDeclarationContext, currentClass: String): ClassMember | List[ClassMember] = {
    if (ctx.methodDeclaration() != null) {
      visitMethodDeclaration(ctx.methodDeclaration())
    } else if (ctx.fieldDeclaration() != null) {
      val f = visitFieldDec(ctx.fieldDeclaration(), false)
      if f.sizeIs == 1 then f.head else f
    } else if (ctx.constructorDeclaration() != null) {
      visitConstructorDeclaration(ctx.constructorDeclaration())
    } else if (ctx.classDeclaration() != null) {
      visitClassDeclaration(ctx.classDeclaration()) // Nested class
    } else if (ctx.interfaceDeclaration() != null) {
      visitInterfaceDeclaration(ctx.interfaceDeclaration()) // Nested interface
    } else {
      throw new IllegalArgumentException("Unknown member declaration")
    }
  }

  private def visitInterfaceMemberDec(ctx: InterfaceMemberDeclarationContext): InterfaceMember | List[InterfaceMember] = {
    if (ctx.interfaceMethodDeclaration() != null) {
      visitInterfaceMethodDeclaration(ctx.interfaceMethodDeclaration())
    } else if (ctx.fieldDeclaration() != null) {
      val f = visitFieldDec(ctx.fieldDeclaration(), true)
      if f.sizeIs == 1 then f.head else f
    } else {
      throw new IllegalArgumentException("Unknown member declaration")
    }
  }

  override def visitMethodDeclaration(ctx: MethodDeclarationContext): MethodDeclaration = {
    val modifiers = getModifiers(ctx)
    val name = ctx.Identifier().getText
    val returnType = visitTypeOrVoid(ctx.typeOrVoid())
    val parameters = getFormalParameters(ctx.formalParameters())
    val body =
      if modifiers.contains(Modifier.Abstract) then None
      else
        var body = visitMethodBody(ctx.methodBody())
        if returnType == AST.VoidType then if !body.statements.contains(ReturnStatement(None)) then body = Block(body.statements ::: List(ReturnStatement(None)))
        Option(body)

    MethodDeclaration(modifiers, returnType, name, parameters, body)
  }

  override def visitInterfaceMethodDeclaration(ctx: InterfaceMethodDeclarationContext): MethodDeclaration = {
    val modifiers = getModifiers(ctx).::(Modifier.Abstract)
    val name = ctx.Identifier().getText
    val returnType = visitTypeOrVoid(ctx.typeOrVoid())
    val parameters = getFormalParameters(ctx.formalParameters())

    MethodDeclaration(modifiers, returnType, name, parameters, None)
  }

  // Methode: visitFieldDeclaration
  private def visitFieldDec(ctx: FieldDeclarationContext, inInterface: Boolean): List[VarOrFieldDeclaration] = {
    val modifiers = getModifiers(ctx.fieldModifier())
    val fieldType = visitType(ctx.`type`())
    val variables = ctx.variableDeclarator().asScala.map { declarator =>
      val name = declarator.Identifier().getText
      val initializer = if declarator.variableInitializer() != null
        then Some(visitVariableInitializer(declarator.variableInitializer()))
        else None
      (name, initializer)
    }.toList
    variables.foreach(v =>
      v(1) match {
        case Some(x) => if !modifiers.contains(Modifier.Static) then currentFields.get(currentThis) match {
          case Some(l) => currentFields = currentFields + (currentThis -> l.addOne(ExpressionStatement(Assignment(ExpressionName(AmbiguousName(List(v._1))), x))))
          case None => currentFields = currentFields + (currentThis -> ListBuffer(ExpressionStatement(Assignment(ExpressionName(AmbiguousName(List(v._1))), x))))
        }
        case None =>
      }
    )
    if modifiers.contains(Modifier.Static) || inInterface then
      variables.map(v => VarOrFieldDeclaration(modifiers, fieldType, v(0), v(1) match {
        case Some(x) => x
        case None => standardInitializer(fieldType)
      }))
    else
      variables.map(v => VarOrFieldDeclaration(modifiers, fieldType, v(0), standardInitializer(fieldType)))
  }

  private def standardInitializer(t: Type) : Expression = {
    t match {
      case PrimitiveType.Int => AST.IntLiteral(0)
      case PrimitiveType.Boolean => AST.BooleanLiteral(false)
      case PrimitiveType.Char => AST.CharacterLiteral('\u0000')
      case PrimitiveType.Byte => AST.IntLiteral(0)
      case PrimitiveType.Short => AST.ShortLiteral(0)
      case PrimitiveType.Long => AST.LongLiteral(0)
      case PrimitiveType.Float => AST.FloatLiteral(0)
      case PrimitiveType.Double => AST.DoubleLiteral(0)
      case ArrayType(_) => AST.NullLiteral
      case ObjectType(_) => AST.NullLiteral
    }
  }

  private def buildStandardConstructor(modifiers: List[Modifier], name: String): ConstructorDeclaration = {
    val construct = ConstructorInvocation("super", List.empty)
    val ret = ReturnStatement(None)
    val body = currentFields.get(name).map(_.toList :+ ret).getOrElse(List(ret))
    ConstructorDeclaration(modifiers, name, List(), construct, body)
  }

  override def visitConstructorDeclaration(ctx: ConstructorDeclarationContext): ConstructorDeclaration = {
    val modifiers = Option(ctx.accessModifier())
      .map(am => toModifier(am.getText))
      .toList
    val name = ctx.Identifier().getText
    val parameters = getFormalParameters(ctx.formalParameters())
  
    val construct = if ctx.constructorBody().explicitConstructorInvocation() != null
      then visitExplicitConstructorInvocation(ctx.constructorBody().explicitConstructorInvocation())
      else ConstructorInvocation("super", List.empty)

    val body: ListBuffer[Statement] = ListBuffer()
    ctx.constructorBody().methodBodyStatement().asScala.foreach(s => visitMethodBodyStmt(s) match {
      case sm: Statement => body.addOne(sm)
      case sms: List[Statement] => body.addAll(sms)
    })
    if !body.contains(ReturnStatement(None)) then body.addOne(ReturnStatement(None))
  
    ConstructorDeclaration(modifiers, name, parameters, construct, body.toList)
  }

  private def getFormalParameters(ctx: FormalParametersContext): List[Parameter] = {
    if ctx == null then return List.empty
    (ctx.`type`().asScala zip ctx.Identifier().asScala).map{case (t, n) =>  Parameter(n.getText, visitType(t))}.toList
  }

  // Methode: visitVariableInitializer
  override def visitVariableInitializer(ctx: VariableInitializerContext): Expression = {
    if (ctx.expression() != null) {
      visitExpression(ctx.expression())
    } else if (ctx.arrayInitializer() != null) {
      visitArrayInitializer(ctx.arrayInitializer())
    } else {
      throw new IllegalArgumentException("Unknown variable initializer")
    }
  }

  // Methode: visitArrayInitializer
  override def visitArrayInitializer(ctx: ArrayInitializerContext): ArrayInitializer | NewArray = {
    if ctx.newArray() != null then visitNewArray(ctx.newArray())
    else ArrayInitializer(ctx.expression().asScala.map(visitExpression).toList)
  }

  // Methode: visitMethodBody
  override def visitMethodBody(ctx: MethodBodyContext): Block = {
    val statements: ListBuffer[Statement] = ListBuffer()
    ctx.methodBodyStatement().asScala.foreach(s => visitMethodBodyStmt(s) match {
      case sm: Statement => statements.addOne(sm)
      case sms: List[Statement] => statements.addAll(sms)
    })
    Block(statements.toList)
  }

  override def visitExplicitConstructorInvocation(ctx: ExplicitConstructorInvocationContext): ConstructorInvocation = {
    val target: "this" | "super" = ctx.getChild(0).getText() match
      case t: ("this" | "super") => t
      case _ => ???

    val args = if ctx.expressionList() != null then
      ctx.expressionList().expression().asScala.map(visitExpression).toList
    else
      List.empty

    ConstructorInvocation(target, args)
  }

  // Methode: visitBlock
  override def visitBlock(ctx: BlockContext): Block = {
    val statements: ListBuffer[Statement] = ListBuffer()
    ctx.blockStatement().asScala.foreach(s => visitBlockStmt(s, None) match {
      case sm: Statement => statements.addOne(sm)
      case sms: List[Statement] => statements.addAll(sms)
    })
    Block(statements.toList)
  }

  private def maybeInsertUpdateStmt(stmt: Statement, update_stmt: Statement): Statement = {
    stmt match {
      case IfStatement(c, t, e) => e match {
        case Some(el) => IfStatement(c, maybeInsertUpdateStmt(t, update_stmt), Option(maybeInsertUpdateStmt(el, update_stmt)))
        case None => IfStatement(c, maybeInsertUpdateStmt(t, update_stmt), None)
      }
      case Block(stmts) =>
        Block(stmts.flatMap(s => s match {
          case ContinueStatement() => List(update_stmt, ContinueStatement())
          case st => List(st)
        }))
      case ContinueStatement() => Block(List(update_stmt, ContinueStatement()))
      case s => s
    }
  }

  private def visitBlockStmt(ctx: BlockStatementContext, update_stmt: Option[Statement]): Statement | List[Statement] = {
    if (ctx.localVariableDeclaration() != null) {
      val f = visitLocalVariableDec(ctx.localVariableDeclaration())
      if f.sizeIs == 1 then f.head else f
    }
    else if (ctx.statement() != null) {
      val stmt = visitStatement(ctx.statement())
      update_stmt match {
        case Some(up) => maybeInsertUpdateStmt(stmt, up)
        case None => stmt
      }
    }
    else {throw new IllegalArgumentException("Unknown block statement")}
  }

  private def visitLocalVariableDec(ctx: LocalVariableDeclarationContext): List[VarOrFieldDeclaration] = {
    val t = visitType(ctx.`type`())
    val variables = ctx.variableDeclarator().asScala.map(v => visitVariableDeclarator(v, t)).toList
    variables.map(v => VarOrFieldDeclaration(List(), t, v(0), v(1)))
  }

  private def visitVariableDeclarator(ctx: VariableDeclaratorContext, t: Type): (String, Expression) = {
    (ctx.Identifier().getText,
      if ctx.variableInitializer() != null then visitVariableInitializer(ctx.variableInitializer()) else standardInitializer(t))
  }


  // Methode: visitMethodBodyStatement
  private def visitMethodBodyStmt(ctx: MethodBodyStatementContext): Statement | List[Statement] = {
    ctx.getChild(0) match {
      case s: StatementContext => visitStatement(s)
      case r: ReturnContext => ReturnStatement(Option(r.expression()).map(visitExpression))
      case l: LocalVariableDeclarationContext => visitLocalVariableDec(l)
      case _ => throw new IllegalArgumentException("Unknown method body statement")
    }
  }

  // Methode: visitStatement
  override def visitStatement(ctx: StatementContext): Statement = {
    if ctx == null then return null
    if ctx.calcUnOp() != null then ctx.calcUnOp().getText match {
      case "++" => ExpressionStatement(Assignment(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), BinaryExpression(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), BinaryOperator.Add, IntLiteral(1))))
      case "--" => ExpressionStatement(Assignment(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), BinaryExpression(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), BinaryOperator.Subtract, IntLiteral(1))))
    }
    ctx.getChild(0) match {
      case b: BlockContext => visitBlock(b)
      case e: ExpressionContext => ExpressionStatement(visitExpression(e))
      case i: (IfThenContext | IfThenElseContext) => visitIfThenElse(i)
      case w: WhileStatementContext => visitWhileStatement(w)
      case r: ReturnContext => ReturnStatement(Option(visitExpression(r.expression())))
      case b: BreakContext => BreakStatement()
      case c: ContinueContext => ContinueStatement()
      case f: ForStatementContext => visitForStatement(f)
      case _ => throw new IllegalArgumentException("Unknown statement")
    }
  }

  private def visitAssignment(a: AssignmentContext): Assignment = {
    val (left, ty, r) = a match
      case q: AssignQualifiedNameContext => (ExpressionName(buildAmbiguousName(q.qualifiedName())) : ExpressionName | FieldAccess | ArrayAccess, q.assignmentType(), q.expression())
      case f: AssignFieldAccessContext if f.newArray() != null => (FieldAccess(visitNewArray(f.newArray()), f.Identifier().getText()) : ExpressionName | FieldAccess | ArrayAccess, f.assignmentType(), f.expression())
      case f: AssignFieldAccessContext => (FieldAccess(visitPrimary(f.primary()), f.Identifier().getText) : ExpressionName | FieldAccess | ArrayAccess, f.assignmentType(), f.expression())
      case a: AssignArrayAccessContext if a.qualifiedName() != null => (ArrayAccess(ExpressionName(buildAmbiguousName(a.qualifiedName())), visitExpression(a.expression(0))) : ExpressionName | FieldAccess | ArrayAccess, a.assignmentType(), a.expression(1))
      case a: AssignArrayAccessContext if a.primary() != null => (ArrayAccess(visitPrimary(a.primary()), visitExpression(a.expression(0))) : ExpressionName | FieldAccess | ArrayAccess, a.assignmentType(), a.expression(1))
    val pre_right: Expression = visitExpression(r)
    val right = ty.getText match {
      case "=" => pre_right
      case "+=" => BinaryExpression(left, BinaryOperator.Add, pre_right)
      case "-=" => BinaryExpression(left, BinaryOperator.Subtract, pre_right)
      case "*=" => BinaryExpression(left, BinaryOperator.Multiply, pre_right)
      case "/=" => BinaryExpression(left, BinaryOperator.Divide, pre_right)
      case "%=" => BinaryExpression(left, BinaryOperator.Modulo, pre_right)
      case "&=" => BinaryExpression(left, BinaryOperator.And, pre_right)
      case "|=" => BinaryExpression(left, BinaryOperator.Or, pre_right)
      case "^=" => BinaryExpression(left, BinaryOperator.Xor, pre_right)
    }
    Assignment(left, right)
  }

  override def visitMethodCall(ctx: MethodCallContext): MethodCall = {
    val target = if ctx.qualifiedName() != null then
      Some(buildAmbiguousName(ctx.qualifiedName()))
    else if ctx.newArray() != null then
      Some(visitNewArray(ctx.newArray()))
    else if ctx.primary() != null then
      Some(visitPrimary(ctx.primary()))
    else
      None
    val name = ctx.Identifier().getText
    if ctx.expressionList() != null then
      MethodCall(target, name, ctx.expressionList().expression().asScala.map(visitExpression).toList)
    else
      MethodCall(target, name, List())
  }

  private def visitIfThenElse(ctx: IfThenContext | IfThenElseContext): IfStatement = {
    ctx match {
      case c: IfThenContext => IfStatement(visitExpression(c.expression()), visitStatement(c.statement()), None)
      case c: IfThenElseContext => IfStatement(visitExpression(c.expression()), visitStatement(c.statement(0)), Option(visitStatement(c.statement(1))))
    }
  }

  override def visitWhileStatement(ctx: WhileStatementContext): WhileStatement  = {
    WhileStatement(visitExpression(ctx.expression()), visitStatement(ctx.statement()))
  }

  override def visitForStatement(ctx: ForStatementContext): Statement = {
    val forControl = ctx.forControl()
    val stmts: ListBuffer[Statement] = ListBuffer()
    if forControl.localVariableDeclaration() != null then stmts.addOne(visitLocalVariableDec(forControl.localVariableDeclaration()).head)
    val condition = if forControl.booleanFunction() != null then visitBooleanFunction(forControl.booleanFunction()) else AST.BooleanLiteral(true)
    if forControl.expression() != null then
      stmts.addOne(WhileStatement(condition, visitForBodyStatement(ctx.statement(), ExpressionStatement(visitExpression(forControl.expression())))))
    else
      stmts.addOne(WhileStatement(condition, visitStatement(ctx.statement())))
    if stmts.sizeIs == 1 then stmts.head else Block(stmts.toList)
  }

  private def visitForBodyStatement(ctx: StatementContext, update_stmt: Statement): Statement = {
    ctx.getChild(0) match {
      case b: BlockContext =>
        val statements: ListBuffer[Statement] = ListBuffer()
        b.blockStatement().asScala.foreach(s => visitBlockStmt(s, Option(update_stmt)) match {
          case sm: Statement => statements.addOne(sm)
          case sms: List[Statement] => statements.addAll(sms)
        })
        if !statements.contains(update_stmt) && !statements.contains(BreakStatement()) then statements.addOne(update_stmt)
        Block(statements.toList)
      case c: ContinueContext => update_stmt
      case _ => visitStatement(ctx)
    }
  }

  override def visitExpression(ctx: ExpressionContext): Expression = {
    if ctx == null then return null
    ctx.getChild(0) match {
      case v: ValueContext => visitValue(v)
      case o: NewObjectContext => visitNewObject(o)
      case b: BooleanFunctionContext => visitBooleanFunction(b)
      case c: CalcFunctionContext => visitCalcFunction(c)
      case a: AssignmentContext => visitAssignment(a)
      case q: QualifiedNameContext =>
        ctx.calcUnOp().getText match {
          case "++" => Assignment(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), BinaryExpression(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), Add, IntLiteral(1)))
          case "--" => Assignment(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), BinaryExpression(ExpressionName(buildAmbiguousName(ctx.qualifiedName())), Subtract, IntLiteral(1)))
        }
      case _ => throw IllegalArgumentException("Illegal expression")
    }
  }

  override def visitValue(ctx: ValueContext) : Expression = {
    ctx.getChild(0) match {
      case p: PrimaryContext => visitPrimary(p)
      case a: NewArrayContext => visitNewArray(a)
      case e: QualifiedNameContext => ExpressionName(buildAmbiguousName(e))
    }
  }

  private def visitPrimary(ctx: PrimaryContext): Expression = {
    ctx match
      case l: LiteralContext => visitLiteral(l)
      case t: ThisContext => ThisExpression
      case n: NestedContext => visitExpression(n.expression())
      case c: NewObjectContext => visitNewObject(c)
      case f: FieldAccessContext => visitFieldAccess(f)
      case a: ArrayAccessContext => visitArrayAccess(a)
      case m: MethodCallContext => visitMethodCall(m)
  }

  override def visitLiteral(ctx: LiteralContext): Literal = {
    if ctx.NullLiteral() != null then AST.NullLiteral
    else if ctx.StringLiteral() != null then
      val str = ctx.StringLiteral.toString
      AST.StringLiteral(str.substring(1, str.length - 1))
    else if ctx.CharacterLiteral() != null then AST.CharacterLiteral(ctx.CharacterLiteral().toString.charAt(0))
    else if ctx.BooleanLiteral() != null then AST.BooleanLiteral(ctx.BooleanLiteral().toString.equals("true"))
    else if ctx.IntegerLiteral() != null then IntLiteral(ctx.IntegerLiteral().toString.toInt)
    else if ctx.LongLiteral() != null then
      AST.LongLiteral(ctx.LongLiteral().toString.replace("l","").replace("L","").toLong)
    else if ctx.FloatingPointLiteral() != null then
      FloatLiteral(ctx.FloatingPointLiteral().toString.toFloat)
    else if ctx.DoubleLiteral() != null then
      AST.DoubleLiteral(ctx.DoubleLiteral().toString.toDouble)
    else throw new IllegalArgumentException("Unknown literal")
  }

  override def visitArrayAccess(ctx: ArrayAccessContext): ArrayAccess = {
    val i = visitExpression(ctx.expression())
    val target = if ctx.qualifiedName() != null
      then ExpressionName(buildAmbiguousName(ctx.qualifiedName()))
      else visitPrimary(ctx.primary())
    ArrayAccess(target, i)
  }

  override def visitFieldAccess(ctx: FieldAccessContext): FieldAccess = {
    val target = if ctx.newArray() != null then
      visitNewArray(ctx.newArray())
    else
      visitPrimary(ctx.primary())
    val name = ctx.Identifier().getText()
    FieldAccess(target, name)
  }

  override def visitNewObject(ctx: NewObjectContext): Expression = {
    val name = buildAmbiguousName(ctx.qualifiedName())
    val args = if ctx.expressionList() != null then
      ctx.expressionList().expression().asScala.map(visitExpression).toList
    else
      List.empty
    NewObject(name, args)
  }

  override def visitNewArray(ctx: NewArrayContext): NewArray = {
    if ctx.primitiveType() != null then
      NewArray(visitPrimitiveType(ctx.primitiveType()), visitExpression(ctx.expression()))
    else
      NewArray(visitObjectType(ctx.objectType()), visitExpression(ctx.expression()))
  }

  override def visitBooleanFunction(ctx: BooleanFunctionContext): Expression = {
    if ctx == null then return null
    if (ctx.getChild(1) != null) {
      val left = ctx.getChild(0) match {
        case c: CalcFunctionContext => visitCalcFunction(c)
        case v: ValueContext => visitValue(v)
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext) => getBoolFun(x)
      }
      val right = ctx.getChild(2) match {
        case c: CalcFunctionContext => visitCalcFunction(c)
        case v: ValueContext => visitValue(v)
        case b: BooleanFunctionContext => visitBooleanFunction(b)
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext) => getBoolFun(x)
      }
      buildBoolFun(left, ctx.getChild(1).getText, right)
    } else if (ctx.inverse() != null) {
      val expression = visitValue(ctx.inverse().value())
      BinaryExpression(expression, BinaryOperator.Xor, AST.BooleanLiteral(true))
    } else {
      throw new IllegalArgumentException("Invalid BooleanFunction structure")
    }

  }

  private def getBoolFun(ctx: BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext): Expression = {
    if (ctx.getChild(1) != null) {
      ctx.getChild(0) match {
        case c: CalcFunctionContext =>  buildBoolFun(visitCalcFunction(c), ctx.getChild(1).getText, getRightBoolFun(ctx))
        case v: ValueContext =>  buildBoolFun(visitValue(v), ctx.getChild(1).getText, getRightBoolFun(ctx))
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext) =>
          buildBoolFun(getBoolFun(x), ctx.getChild(1).getText, getRightBoolFun(ctx))
      }
    } else ctx.getChild(0) match {
      case v: ValueContext => visitValue(v)
      case i: InverseContext =>
        BinaryExpression(visitValue(i.value()), BinaryOperator.Xor, AST.BooleanLiteral(true))
    }
  }

  private def getRightBoolFun(ctx: BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext): Expression = {
    ctx.getChild(2) match {
      case i: InverseContext =>
        BinaryExpression(visitValue(i.value()), BinaryOperator.Xor, AST.BooleanLiteral(true))
      case c: CalcFunctionContext => visitCalcFunction(c)
      case v: ValueContext => visitValue(v)
      case b: BooleanFunctionContext => visitBooleanFunction(b)
      case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext) => getBoolFun(x)
    }
  }

  private def buildBoolFun(l: Expression, op: String, r: Expression) : BinaryExpression = {
    op match {
      case ">" => BinaryExpression(l, BinaryOperator.Greater, r)
      case "<" => BinaryExpression(l, BinaryOperator.Less, r)
      case ">=" => BinaryExpression(l, BinaryOperator.GreaterOrEqual, r)
      case "<=" => BinaryExpression(l, BinaryOperator.LessOrEqual, r)
      case "==" => BinaryExpression(l, BinaryOperator.Equals, r)
      case "!=" => BinaryExpression(BinaryExpression(l, BinaryOperator.Equals, r), BinaryOperator.Xor, AST.BooleanLiteral(true))
      case "&&" => BinaryExpression(l, BinaryOperator.And, r)
      case "||" => BinaryExpression(l, BinaryOperator.Or, r)
      case "^" => BinaryExpression(l, BinaryOperator.Xor, r)
    }
  }

  override def visitCalcFunction(ctx: CalcFunctionContext): Expression = {
    if (ctx.calcBinOpHigher() != null) {
      val left = visitTerm(ctx.term()) // Left-hand side expression
      val right = visitValue(ctx.value()) // Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    } else if (ctx.calcBinOpLower() != null) {
      val left = if ctx.value != null then visitValue(ctx.value()) else visitCalcFunction(ctx.calcFunction()) // Left-hand side expression
      val right = visitTerm(ctx.term())// Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    } else if ctx.negate() != null then BinaryExpression(IntLiteral(0), Subtract, visitExpression(ctx.negate().expression()))
    else {
      throw new IllegalArgumentException("Invalid CalcFunction structure")
    }
  }

  private def getCalcOperator(op: String): BinaryOperator = {
    op match {
      case "+" => BinaryOperator.Add
      case "-" => BinaryOperator.Subtract
      case "*" => BinaryOperator.Multiply
      case "/" => BinaryOperator.Divide
      case "%" => BinaryOperator.Modulo
    }
  }

  override def visitTerm(ctx: TermContext): Expression = {
    if ctx.calcBinOpHigher() != null then
      val left = visitTerm(ctx.term()) // Left-hand side expression
      val right = visitValue(ctx.value()) // Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    else visitValue(ctx.value())
  }

  override def visitTypeOrVoid(ctx: TypeOrVoidContext): TypeOrVoid = {
    if (ctx.`type`() != null) {
      visitType(ctx.`type`())
    } else {
      AST.VoidType
    }
  }

  override def visitType(ctx: TypeContext): Type = {
    ctx.getChild(0) match {
      case p: PrimitiveTypeContext => visitPrimitiveType(p)
      case o: ObjectTypeContext => visitObjectType(o)
      case a: ArrayTypeContext if a.primitiveType() != null => ArrayType(visitPrimitiveType(a.primitiveType()))
      case a: ArrayTypeContext => ArrayType(visitObjectType(a.objectType()))
    }
  }

  override def visitObjectType(ctx: ObjectTypeContext): ObjectType = ObjectType(buildAmbiguousName(ctx.qualifiedName()))

  override def visitPrimitiveType(ctx: PrimitiveTypeContext): PrimitiveType = ctx.getText() match
    case "boolean" => PrimitiveType.Boolean
    case "byte" => PrimitiveType.Byte
    case "short" => PrimitiveType.Short
    case "char" => PrimitiveType.Char
    case "int" => PrimitiveType.Int
    case "long" => PrimitiveType.Long
    case "float" => PrimitiveType.Float
    case "double" => PrimitiveType.Double

}

