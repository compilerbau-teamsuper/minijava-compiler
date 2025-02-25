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
  private var currentSuper: AmbiguousName = AmbiguousName(List())

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
      buildAmbiguousName(ctx.qualifiedName().Identifier().asScala.map(_.getText).toList),
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
    currentThis = name
    val superclass =  if ctx.superclass() != null then buildAmbiguousName(ctx.superclass().qualifiedName().Identifier().asScala.map(_.getText).toList) else AmbiguousName(List("Object"))
    currentSuper = superclass
    val interfaces = if ctx.superinterfaces() != null then ctx.superinterfaces().qualifiedName().asScala.map(_.getText).toList else List.empty
    var body = getClassBody(ctx.classBody())
    val hasConstructor = body.exists(x => x match {
      case ConstructorDeclaration(_,_,_,_) => true
      case _ => false
    })
    val constructorModifiers = modifiers.intersect(List(Modifier.Public, Modifier.Protected, Modifier.Private))
    body = if !hasConstructor then body.::(ConstructorDeclaration(constructorModifiers, name, List(), Block(List(ReturnStatement(None))))) else body

    ClassDeclaration(modifiers, name, superclass, interfaces, body)
  }

  override def visitInterfaceDeclaration(ctx: InterfaceDeclarationContext): InterfaceDeclaration = {
    val modifiers: List[Modifier] = if ctx.Public() != null then List(Modifier.Public) else List.empty
    val name = ctx.Identifier().getText
    val superInterfaces = if ctx.extendsInterfaces() != null then ctx.extendsInterfaces().qualifiedName().asScala.map(x => buildAmbiguousName(x.Identifier().asScala.map(_.getText).toList)).toList else List.empty
    val body = getInterfaceBody(ctx.interfaceBody())

    InterfaceDeclaration(modifiers, name, superInterfaces, body)
  }

  private def getClassBody(ctx: ClassBodyContext): List[ClassMember] = {
    if !ctx.classBodyDeclaration().isEmpty then {
      val classBodyDecs : ListBuffer[ClassMember] = ListBuffer()
      ctx.classBodyDeclaration().asScala.toList.foreach(c => visitClassBodyDec(c) match {
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

  private def fieldAccessFromQualifiedName(ctx: QualifiedNameContext): VarOrFieldAccess = {
    val parts = ctx.Identifier().asScala.map(p => p.getText).toList
    buildFieldAccess(parts)
  }

  private def buildFieldAccess(parts: List[String]): VarOrFieldAccess = {
    parts.tail match {
      case Nil => VarOrFieldAccess(None, parts.head)
      case xs =>
        val last = parts.last
        VarOrFieldAccess(Option(ExpressionName(buildAmbiguousName(parts.slice(0, parts.length - 1)))), last)
    }
  }

  private def buildAmbiguousName(parts: List[String]): AmbiguousName = {
    def replaceThisSuper(parts: List[String]): List[String] = {
      parts match {
        case x :: xs => x match {
          case "this" => currentThis :: replaceThisSuper(xs)
          case "super" => currentSuper.components ::: replaceThisSuper(xs)
          case _ => x :: replaceThisSuper(xs)
        }
        case Nil => Nil
      }
    }
    AmbiguousName(replaceThisSuper(parts))
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

  private def visitClassBodyDec(ctx: ClassBodyDeclarationContext): ClassMember | List[ClassMember] = {
    if (ctx.block() != null) {
      visitBlock(ctx.block())
    }
    else if (ctx.memberDeclaration() != null) {
      visitMemberDec(ctx.memberDeclaration())
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
  private def visitMemberDec(ctx: MemberDeclarationContext): ClassMember | List[ClassMember] = {
    if (ctx.methodDeclaration() != null) {
      visitMethodDeclaration(ctx.methodDeclaration())
    } else if (ctx.fieldDeclaration() != null) {
      val f = visitFieldDec(ctx.fieldDeclaration())
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
      val f = visitFieldDec(ctx.fieldDeclaration())
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
  private def visitFieldDec(ctx: FieldDeclarationContext): List[VarOrFieldDeclaration] = {
    val modifiers = getModifiers(ctx.fieldModifier())
    val fieldType = getType(ctx.`type`())
    val variables = ctx.variableDeclarator().asScala.map { declarator =>
      val name = declarator.Identifier().getText
      val initializer = if declarator.variableInitializer() != null
        then visitVariableInitializer(declarator.variableInitializer())
        else standardInitializer(fieldType)
      (name, initializer)
    }.toList
    variables.map(v => VarOrFieldDeclaration(modifiers, fieldType, v(0), v(1)))
  }

  private def standardInitializer(t: Type) : Expression = {
    t match {
      case PrimitiveType.Int | ObjectType.Integer => AST.IntLiteral(0)
      case PrimitiveType.Boolean | ObjectType.Boolean => AST.BooleanLiteral(false)
      case PrimitiveType.Char | ObjectType.Character => AST.CharacterLiteral('0')
      case PrimitiveType.Short | ObjectType.Short => AST.ShortLiteral(0)
      case PrimitiveType.Long | ObjectType.Long => AST.LongLiteral(0)
      case PrimitiveType.Float | ObjectType.Float => AST.FloatLiteral(0)
      case PrimitiveType.Double | ObjectType.Double => AST.DoubleLiteral(0)
      case ObjectType.String => AST.StringLiteral("")
      case _ => throw new IllegalArgumentException("Custom Types must be initialized?!")
    }
  }

  // Methode: visitConstructorDeclaration
  override def visitConstructorDeclaration(ctx: ConstructorDeclarationContext): ConstructorDeclaration = {
    val modifiers = Option(ctx.accessModifier())
      .map(am => toModifier(am.getText))
      .toList
    val name = ctx.Identifier().getText
    val parameters = getFormalParameters(ctx.formalParameters())
    var body = visitBlock(ctx.block())
    if !body.statements.contains(ReturnStatement(None)) then body = Block(body.statements ::: List(ReturnStatement(None)))
    ConstructorDeclaration(modifiers, name, parameters, body)
  }

  private def getFormalParameters(ctx: FormalParametersContext): List[Parameter] = {
    if ctx == null then return List.empty
    (ctx.`type`().asScala zip ctx.Identifier().asScala).map{case (t, n) =>  Parameter(n.getText, getType(t))}.toList
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
    if ctx.`type`() != null then NewArray(getType(ctx.`type`()), visitExpression(ctx.expression(0)))
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
    val t = getType(ctx.`type`())
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
    ctx.getChild(0) match {
      case b: BlockContext => visitBlock(b)
      case m: MethodCallContext => ExpressionStatement(visitMethodCall(m))
      case a: AssignmentContext => ExpressionStatement(visitAssignment(a))
      case i: (IfThenContext | IfThenElseContext) => visitIfThenElse(i)
      case q: QualifiedNameContext =>
        ctx.calcUnOp().getText match {
          case "++" => ExpressionStatement(Assignment(fieldAccessFromQualifiedName(ctx.qualifiedName()), BinaryExpression(fieldAccessFromQualifiedName(ctx.qualifiedName()), Add, IntLiteral(1))))
          case "--" => ExpressionStatement(Assignment(fieldAccessFromQualifiedName(ctx.qualifiedName()), BinaryExpression(fieldAccessFromQualifiedName(ctx.qualifiedName()), Subtract, IntLiteral(1))))
        }
      case w: WhileStatementContext => visitWhileStatement(w)
      case r: ReturnContext => ReturnStatement(Option(visitExpression(r.expression())))
      case b: BreakContext => BreakStatement()
      case c: ContinueContext => ContinueStatement()
      case f: ForStatementContext => visitForStatement(f)
      case _ => throw new IllegalArgumentException("Unknown statement")
    }
  }

  override def visitAssignment(ctx: AssignmentContext): Assignment = {
    val left: VarOrFieldAccess | ArrayAccess = ctx.getChild(0) match {
      case v: QualifiedNameContext => fieldAccessFromQualifiedName(v)
      case a: ArrayAccessContext => visitArrayAccess(a)
    }
    val pre_right = visitExpression(ctx.expression())
    val right = ctx.assignmentType().getText match {
      case "=" => pre_right
      case "+=" => BinaryExpression(left, BinaryOperator.Add, pre_right)
      case "-=" => BinaryExpression(left, BinaryOperator.Subtract, pre_right)
      case "*=" => BinaryExpression(left, BinaryOperator.Multiply, pre_right)
      case "/=" => BinaryExpression(left, BinaryOperator.Divide, pre_right)
      case "%=" => BinaryExpression(left, BinaryOperator.Modulo, pre_right)
      case "&=" => BinaryExpression(left, BinaryOperator.And, pre_right)
      case "|=" =>BinaryExpression(left, BinaryOperator.Or, pre_right)
      case "^=" => BinaryExpression(left, BinaryOperator.Xor, pre_right)
    }
    Assignment(left, right)
  }

  override def visitMethodCall(ctx: MethodCallContext): MethodCall = {
    val parts = ctx.qualifiedName().Identifier().asScala.map(p => p.getText).toList
    val target =
      if ctx.expression() != null then
        Option(visitExpression(ctx.expression()))
      else
        if parts.sizeIs == 1 then None else Option(buildAmbiguousName(parts.slice(0, parts.length - 1)))

    if ctx.expressionList() != null then
      MethodCall(target, parts.last, ctx.expressionList().expression().asScala.map(visitExpression).toList)
    else
      MethodCall(target, parts.last, List())
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
    if forControl.statement() != null then
      stmts.addOne(WhileStatement(condition, visitForBodyStatement(ctx.statement(), visitStatement(forControl.statement()))))
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
      case v: ValueContext => visitValueOrPrimary(v)
      case o: NewObjectContext => visitNewObject(o)
      case b: BooleanFunctionContext => visitBooleanFunction(b)
      case c: CalcFunctionContext => visitCalcFunction(c)
    }
  }

  private def visitValueOrPrimary(ctx: ValueContext | PrimaryContext) : Expression = {
    ctx.getChild(0) match {
      case c: TerminalNodeImpl if c.toString == "(" => visitExpression(ctx.getChild(1) match {case e: ExpressionContext => e})
      case l: LiteralContext => visitLiteral(l)
      case q: QualifiedNameContext => fieldAccessFromQualifiedName(q)
      case m: MethodCallContext => visitMethodCall(m)
      case a: ArrayAccessContext => visitArrayAccess(a)
    }
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
    ArrayAccess(visitValueOrPrimary(ctx.primary()), i)
  }

  override def visitNewObject(ctx: NewObjectContext): Expression = {
    NewObject(visitMethodCall(ctx.methodCall()))
  }

  override def visitBooleanFunction(ctx: BooleanFunctionContext): Expression = {
    if ctx == null then return null
    if (ctx.getChild(1) != null) {
      val left = ctx.getChild(0) match {
        case c: CalcFunctionContext => visitCalcFunction(c)
        case v: ValueContext => visitValueOrPrimary(v)
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext) => getBoolFun(x)
      }
      val right = ctx.getChild(2) match {
        case c: CalcFunctionContext => visitCalcFunction(c)
        case v: ValueContext => visitValueOrPrimary(v)
        case b: BooleanFunctionContext => visitBooleanFunction(b)
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext) => getBoolFun(x)
      }
      buildBoolFun(left, ctx.getChild(1).getText, right)
    } else if (ctx.inverse() != null) {
      val expression = visitValueOrPrimary(ctx.inverse().value())
      BinaryExpression(expression, BinaryOperator.Xor, AST.BooleanLiteral(true))
    } else {
      throw new IllegalArgumentException("Invalid BooleanFunction structure")
    }

  }

  private def getBoolFun(ctx: BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext): Expression = {
    if (ctx.getChild(1) != null) {
      ctx.getChild(0) match {
        case c: CalcFunctionContext =>  buildBoolFun(visitCalcFunction(c), ctx.getChild(1).getText, getRightBoolFun(ctx))
        case v: ValueContext =>  buildBoolFun(visitValueOrPrimary(v), ctx.getChild(1).getText, getRightBoolFun(ctx))
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext) =>
          buildBoolFun(getBoolFun(x), ctx.getChild(1).getText, getRightBoolFun(ctx))
      }
    } else ctx.getChild(0) match {
      case v: ValueContext => visitValueOrPrimary(v)
      case i: InverseContext =>
        BinaryExpression(visitValueOrPrimary(i.value()), BinaryOperator.Xor, AST.BooleanLiteral(true))
    }
  }

  private def getRightBoolFun(ctx: BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext | BooleanFunUndergroundContext): Expression = {
    ctx.getChild(2) match {
      case i: InverseContext =>
        BinaryExpression(visitValueOrPrimary(i.value()), BinaryOperator.Xor, AST.BooleanLiteral(true))
      case c: CalcFunctionContext => visitCalcFunction(c)
      case v: ValueContext => visitValueOrPrimary(v)
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
      val left = visitValueOrPrimary(ctx.value()) // Left-hand side expression
      val right = visitTerm(ctx.term()) // Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    } else if (ctx.calcBinOpLower() != null) {
      val left = visitTerm(ctx.term()) // Left-hand side expression
      val right = if ctx.value != null then visitValueOrPrimary(ctx.value()) else visitCalcFunction(ctx.calcFunction())// Right-hand side expression
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
      val left = visitValueOrPrimary(ctx.value()) // Left-hand side expression
      val right = visitTerm(ctx.term()) // Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    else visitValueOrPrimary(ctx.value())
  }

  override def visitTypeOrVoid(ctx: TypeOrVoidContext): TypeOrVoid = {
    if (ctx.`type`() != null) {
      getType(ctx.`type`())
    } else {
      AST.VoidType
    }
  }

  private def getType(ctx: TypeContext | ArrayTypeContext): Type = {
    ctx.getChild(0) match {
      case t: (PrimitiveTypeContext | ObjectTypeContext) => toType(t.getText)
      case a: ArrayTypeContext => ArrayType(getType(a))
    }
  }

  private def toType(typeName: String): Type = typeName match {
    // Primitive Typen
    case "int" => PrimitiveType.Int
    case "boolean" => PrimitiveType.Boolean
    case "char" => PrimitiveType.Char
    case "short" => PrimitiveType.Short
    case "long" => PrimitiveType.Long
    case "float" => PrimitiveType.Float
    case "double" => PrimitiveType.Double

    // Objekt-Typen
    case "String" => ObjectType.String
    case "Short" => ObjectType.Short
    case "Long" => ObjectType.Long
    case "Integer" => ObjectType.Integer
    case "Float" => ObjectType.Float
    case "Double" => ObjectType.Double
    case "Boolean" => ObjectType.Boolean
    case "Character" => ObjectType.Character

    // Benutzerdefinierter Objekttyp
    case customType if customType.matches("[A-Za-z_][A-Za-z0-9_]*") =>
      ObjectType.Custom(customType)

    // Unbekannter Typ
    case _ => throw new IllegalArgumentException(s"Unknown type: $typeName")
  }
}

