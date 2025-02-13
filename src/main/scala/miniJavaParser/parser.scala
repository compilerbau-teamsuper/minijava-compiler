package miniJavaParser
import AST.*
import AST.BinaryOperator.{Add, Subtract}
import miniJavaParser.*
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, ParserRuleContext}

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters.*

object JavaASTBuilder {

  def main(args: Array[String]): Unit = {
    val filePath = "src/main/java/test.java"
    val ast = parseFromFile(filePath)
    println(ast)
  }

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
  private var currentSuper: QualifiedName = QualifiedName(List(), "")

  override def visitCompilationUnit(ctx: CompilationUnitContext): CompilationUnit = {
    val packageDeclaration = Option(ctx.packageDeclaration())
      .map(visitPackageDeclaration)
    val importDeclarations = ctx.importDeclaration().asScala.map(visitImportDeclaration).toList
    val typeDeclarations = ctx.typeDeclaration().asScala.map(visitTypeDeclaration).toList

    CompilationUnit(packageDeclaration, importDeclarations, typeDeclarations)
  }

  override def visitPackageDeclaration(ctx: PackageDeclarationContext): PackageDeclaration = {
    PackageDeclaration(visitQualifiedName(ctx.qualifiedName()))
  }

  override def visitImportDeclaration(ctx: ImportDeclarationContext): ImportDeclaration = {
    ImportDeclaration(
      visitQualifiedName(ctx.qualifiedName()),
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
    val superclass =  if ctx.superclass() != null then visitQualifiedName(ctx.superclass().qualifiedName()) else QualifiedName(List(), "Object")
    currentSuper = superclass
    val interfaces = if ctx.superinterfaces() != null then ctx.superinterfaces().qualifiedName().asScala.map(visitQualifiedName).toList else List.empty
    val body = visitClassBody(ctx.classBody())

    ClassDeclaration(modifiers, name, superclass, interfaces, body)
  }

  override def visitInterfaceDeclaration(ctx: InterfaceDeclarationContext): InterfaceDeclaration = {
    val modifiers: List[Modifier] = if ctx.Public() != null then List(Modifier.Public) else List.empty
    val name = ctx.Identifier().getText
    val superInterfaces = if ctx.extendsInterfaces() != null then ctx.extendsInterfaces().qualifiedName().asScala.map(visitQualifiedName).toList else List.empty
    val body = visitInterfaceBody(ctx.interfaceBody())

    InterfaceDeclaration(modifiers, name, superInterfaces, body)
  }

  override def visitClassBody(ctx: ClassBodyContext): ClassBody = {
    if !ctx.classBodyDeclaration().isEmpty then {
      val classBodyDecs : ListBuffer[ClassMember] = ListBuffer()
      ctx.classBodyDeclaration().asScala.toList.foreach(c => visitClassBodyDec(c) match {
        case cm: ClassMember => classBodyDecs.addOne(cm)
        case cms: List[ClassMember] => classBodyDecs.addAll(cms)
      })
      ClassBody(classBodyDecs.toList)
    }
    else ClassBody(List.empty)
  }

  override def visitInterfaceBody(ctx: InterfaceBodyContext): InterfaceBody = {
    if !ctx.interfaceBodyDeclaration().isEmpty then {
      val interfaceBodyDecs: ListBuffer[InterfaceMember] = ListBuffer()
      ctx.interfaceBodyDeclaration().asScala.toList.foreach(i => visitInterfaceBodyDec(i) match {
        case im: InterfaceMember => interfaceBodyDecs.addOne(im)
        case ims: List[InterfaceMember] => interfaceBodyDecs.addAll(ims)
      })
      InterfaceBody(interfaceBodyDecs.toList)
    }
    else InterfaceBody(List.empty)
  }

  override def visitQualifiedName(ctx: QualifiedNameContext): QualifiedName = {
    val parts = ctx.Identifier().asScala.map(_.getText)
    if (parts.head.equals("this")) { // ToDo: This und so auch an anderen Stellen im Qualified Name möglich?
      parts.remove(0)
      parts.insert(0, currentThis) // ToDo: Passt das so für Bitcodegen?
    }
    else if (parts.head.equals("super")) {
      parts.remove(0)
      parts.insertAll(0, currentSuper.target :+ currentSuper.name)
    }
    val last = parts.last
    parts.remove(parts.length - 1)
    QualifiedName(parts.toList, last)
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
      if f.length == 1 then f.head else f
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
      if f.length == 1 then f.head else f
    } else {
      throw new IllegalArgumentException("Unknown member declaration")
    }
  }

  override def visitMethodDeclaration(ctx: MethodDeclarationContext): MethodDeclaration = {
    val modifiers = getModifiers(ctx)
    val name = ctx.Identifier().getText
    val returnType = visitTypeOrVoid(ctx.typeOrVoid())
    val parameters = getFormalParameters(ctx.formalParameters())
    val body = if modifiers.contains(Modifier.Abstract) then None else Option(visitMethodBody(ctx.methodBody()))

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
      VariableDeclarator(name, initializer) 
    }.toList
    variables.map(v => VarOrFieldDeclaration(modifiers, fieldType, v))
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
    val body = visitBlock(ctx.block())

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
  override def visitArrayInitializer(ctx: ArrayInitializerContext): ArrayInitializer = {
    val initializers = ctx.variableInitializer().asScala.map(visitVariableInitializer).toList
    ArrayInitializer(initializers)
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
    ctx.blockStatement().asScala.foreach(s => visitBlockStmt(s) match {
      case sm: Statement => statements.addOne(sm)
      case sms: List[Statement] => statements.addAll(sms)
    })
    Block(statements.toList)
  }

  private def visitBlockStmt(ctx: BlockStatementContext): Statement | List[Statement] = {
    if (ctx.localVariableDeclaration() != null) {
      val f = visitLocalVariableDec(ctx.localVariableDeclaration())
      if f.length == 1 then f.head else f
    }
    else if (ctx.statement() != null) { visitStatement(ctx.statement())}
    else {throw new IllegalArgumentException("Unknown block statement")}
  }

  private def visitLocalVariableDec(ctx: LocalVariableDeclarationContext): List[VarOrFieldDeclaration] = {
    val t = getType(ctx.`type`())
    val variables = ctx.variableDeclarator().asScala.map(v => visitVariableDeclarator(v, t)).toList
    variables.map(v => VarOrFieldDeclaration(List(), t, v))
  }

  private def visitVariableDeclarator(ctx: VariableDeclaratorContext, t: Type): VariableDeclarator = {
    VariableDeclarator(ctx.Identifier().getText,
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
      case a: AssignmentContext => visitAssignment(a)
      case m: MethodCallContext => visitMethodCall(m)
      case i: (IfThenContext | IfThenElseContext) => visitIfThenElse(i)
      // case s: SwitchContext => visitSwitch(s) // ToDo: Überhaupt notwendig?
      case w: WhileStatementContext => visitWhileStatement(w)
      case r: ReturnContext => ReturnStatement(Option(visitExpression(r.expression())))
      case b: BreakContext => BreakStatement()
      case c: ContinueContext => ContinueStatement()
      case f: ForStatementContext => visitForStatement(f)
      case _ => throw new IllegalArgumentException("Unknown statement")
    }
  }

  override def visitAssignment(ctx: AssignmentContext): Assignment = {
    val left = ctx.getChild(0) match {
      case v: ValueContext => visitValueOrPrimary(v)
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
    }
    Assignment(left, right)
  }

  override def visitMethodCall(ctx: MethodCallContext): MethodCall = {
    if ctx.expressionList() != null then
      MethodCall(visitQualifiedName(ctx.qualifiedName()), ctx.expressionList().expression().asScala.map(visitExpression).toList)
    else
      MethodCall(visitQualifiedName(ctx.qualifiedName()), List())
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

  override def visitForStatement(ctx: ForStatementContext): ForStatement = {
    val forControl = ctx.forControl()
    val init = if forControl.localVariableDeclaration() != null then Option(visitLocalVariableDec(forControl.localVariableDeclaration()).head) else None
    val condition = if forControl.booleanFunction() != null then Option(visitBooleanFunction(forControl.booleanFunction())) else None
    val update = if forControl.calcFunction() != null then Option(visitCalcFunction(forControl.calcFunction())) else None
    ForStatement(init, condition, update, visitStatement(ctx.statement()))
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
      case q: QualifiedNameContext => FieldAccess(visitQualifiedName(q))
      case m: MethodCallContext => visitMethodCall(m)
      case a: ArrayAccessContext => visitArrayAccess(a)
    }
  }

  override def visitLiteral(ctx: LiteralContext): Literal = {
    if ctx.NullLiteral() != null then AST.NullLiteral
    else if ctx.StringLiteral() != null then AST.StringLiteral(ctx.StringLiteral().toString)
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
    val m = visitMethodCall(ctx.methodCall())
    NewObject(m.target, m.arguments)
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
      buildDesugaredBoolFun(left, ctx.getChild(1).getText, right)
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
        case c: CalcFunctionContext =>  buildDesugaredBoolFun(visitCalcFunction(c), ctx.getChild(1).getText, getRightBoolFun(ctx))
        case v: ValueContext =>  buildDesugaredBoolFun(visitValueOrPrimary(v), ctx.getChild(1).getText, getRightBoolFun(ctx))
        case x: (BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext) =>
          buildDesugaredBoolFun(getBoolFun(x), ctx.getChild(1).getText, getRightBoolFun(ctx))
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

  private def buildDesugaredBoolFun(l: Expression, op: String, r: Expression) : BinaryExpression = {
    op match {
      case ">" => BinaryExpression(l, BinaryOperator.Greater, r)
      case "<" => BinaryExpression(r, BinaryOperator.Greater, l)
      case ">=" => BinaryExpression(BinaryExpression(l, BinaryOperator.Greater, r), BinaryOperator.Or, BinaryExpression(l, BinaryOperator.Equals, r))
      case "<=" => BinaryExpression(BinaryExpression(r, BinaryOperator.Greater, l), BinaryOperator.Or, BinaryExpression(l, BinaryOperator.Equals, r))
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
    } else if (ctx.calcUnOp() != null) {
      // Case 2: Unary operation
      ctx.getChild(1).getText match {
        case "++" => BinaryExpression(FieldAccess(visitQualifiedName(ctx.qualifiedName())), Add, IntLiteral(1))
        case "--" => BinaryExpression(FieldAccess(visitQualifiedName(ctx.qualifiedName())), Subtract, IntLiteral(1))
      }
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

