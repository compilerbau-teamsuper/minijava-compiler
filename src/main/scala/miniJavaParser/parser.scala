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
    // Beispiel-Dateipfad (ersetzen mit dem Pfad zu deiner Java-Datei)
    val filePath = "src/main/java/test.java"

    // Parse die Datei
    val input = CharStreams.fromFileName(filePath)
    val lexer = new miniJavaLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new miniJavaParser(tokens)

    // Baue die AST-Root-Knoten
    val tree = parser.compilationUnit()

    // Besuch den Parse Tree und baue den AST
    val astBuilder = new ASTBuilderVisitor()
    val ast = astBuilder.visitCompilationUnit(tree)

    // Gib den AST aus (als Beispiel in JSON-ähnlicher Struktur)
    println(ast)
  }
}

// Visitor-Klasse zur Generierung des AST
class ASTBuilderVisitor extends miniJavaBaseVisitor[ASTNode] {
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
    val modifiers: ListBuffer[Modifier] = if ctx.classModifier() != null then ListBuffer(toModifier(ctx.classModifier().getText)) else ListBuffer()
    if ctx.Public() != null then modifiers.addOne(Modifier.Public)
    val name = ctx.Identifier().getText
    val superclass =  if ctx.superclass() != null then visitQualifiedName(ctx.superclass().qualifiedName()) else QualifiedName(List("Object"))
    val interfaces = if ctx.superinterfaces() != null then ctx.superinterfaces().qualifiedName().asScala.map(visitQualifiedName).toList else List.empty
    val body = visitClassBody(ctx.classBody())

    ClassDeclaration(modifiers.toList, name, superclass, interfaces, body)
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
      ClassBody(ctx.classBodyDeclaration().asScala.toList.map(c => visitClassBodyDeclaration(c)))
    }
    else ClassBody(List.empty)
  }

  override def visitInterfaceBody(ctx: InterfaceBodyContext): InterfaceBody = {
    if !ctx.interfaceBodyDeclaration().isEmpty then {
      InterfaceBody(ctx.interfaceBodyDeclaration().asScala.toList.map(c => visitInterfaceBodyDeclaration(c)))
    }
    else InterfaceBody(List.empty)
  }

  override def visitQualifiedName(ctx: QualifiedNameContext): QualifiedName = {
    QualifiedName(ctx.Identifier().asScala.map(_.getText).toList)
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

  override def visitClassBodyDeclaration(ctx: ClassBodyDeclarationContext): ClassMember = {
    if (ctx.staticInitializer() != null) {
      visitBlock(ctx.staticInitializer().block(), true) match { case s: StaticBlock => s }
    } else if (ctx.block() != null) {
      visitBlock(ctx.block(), false) match { case b: Block => b }
    }
    else if (ctx.memberDeclaration() != null) {
      visitMemberDeclaration(ctx.memberDeclaration())
    }
    else null
  }

  override def visitInterfaceBodyDeclaration(ctx: InterfaceBodyDeclarationContext): InterfaceMember = {
    if (ctx.interfaceMemberDeclaration() != null) {
      visitInterfaceMemberDeclaration(ctx.interfaceMemberDeclaration())
    }
    else null
  }

  // Hilfsfunktion für MemberDeclaration
  override def visitMemberDeclaration(ctx: MemberDeclarationContext): ClassMember = {
    if (ctx.methodDeclaration() != null) {
      visitMethodDeclaration(ctx.methodDeclaration())
    } else if (ctx.fieldDeclaration() != null) {
      visitFieldDeclaration(ctx.fieldDeclaration())
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

  override def visitInterfaceMemberDeclaration(ctx: InterfaceMemberDeclarationContext): InterfaceMember = {
    if (ctx.methodDeclaration() != null) {
      visitMethodDeclaration(ctx.methodDeclaration())
    } else if (ctx.fieldDeclaration() != null) {
      visitFieldDeclaration(ctx.fieldDeclaration())
    } else {
      throw new IllegalArgumentException("Unknown member declaration")
    }
  }

  // Methode: visitMethodDeclaration
  override def visitMethodDeclaration(ctx: MethodDeclarationContext): MethodDeclaration = {
    val modifiers = getModifiers(ctx.methodModifier()).:::(getModifiers(ctx.accessModifier()))
    val name = ctx.Identifier().getText
    val returnType = visitTypeOrVoid(ctx.typeOrVoid())
    val parameters = getFormalParameters(ctx.formalParameters())
    val body = visitMethodBody(ctx.methodBody())

    MethodDeclaration(modifiers, returnType, name, parameters, body)
  }

  // Methode: visitFieldDeclaration
  override def visitFieldDeclaration(ctx: FieldDeclarationContext): FieldDeclaration = {
    val modifiers = getModifiers(ctx.fieldModifier())
    val fieldType = visitType(ctx.`type`())
    val variables = ctx.variableDeclarator().asScala.map { declarator =>
      val name = declarator.Identifier().getText
      val initializer = Option(declarator.variableInitializer())
        .map(visitVariableInitializer)
      VariableDeclarator(name, initializer) 
    }.toList
    FieldDeclaration(modifiers, fieldType, variables)
  }

  // Methode: visitConstructorDeclaration
  override def visitConstructorDeclaration(ctx: ConstructorDeclarationContext): ConstructorDeclaration = {
    val modifiers = Option(ctx.accessModifier())
      .map(am => toModifier(am.getText))
      .toList
    val name = ctx.Identifier().getText
//    val parameters = Option(ctx.formalParameters())
//      .map(_.formalParameter().asScala.map(visitFormalParameter).toList)
//      .getOrElse(List.empty)
    val body = visitBlock(ctx.block(), false)

    ConstructorDeclaration(modifiers, name, List(), body match {case b: Block => b}) // ToDo
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
  override def visitArrayInitializer(ctx: ArrayInitializerContext): ArrayInitializer = {
    val initializers = ctx.variableInitializer().asScala.map(visitVariableInitializer).toList
    ArrayInitializer(initializers)
  }

  // Methode: visitMethodBody
  override def visitMethodBody(ctx: MethodBodyContext): Block = {
    val statements = ctx.methodBodyStatement().asScala.map(visitMethodBodyStatement).toList
    Block(statements) // ToDo: Methodbody = Block?
  }

  // Methode: visitBlock
  private def visitBlock(ctx: BlockContext, static: Boolean): Block | StaticBlock = {
    val statements = ctx.blockStatement().asScala.map(visitBlockStatement).toList
    if static then StaticBlock(statements) else Block(statements)
  }

  override def visitBlockStatement(ctx: BlockStatementContext): Statement= {
    if ctx.localVariableDeclaration() != null then visitLocalVariableDeclaration(ctx.localVariableDeclaration())
    else if ctx.statement() != null then visitStatement(ctx.statement())
    else throw new IllegalArgumentException("Unknown block statement")
  }

  override def visitLocalVariableDeclaration(ctx: LocalVariableDeclarationContext): LocalVariableDeclaration = {
    LocalVariableDeclaration(visitType(ctx.`type`()), ctx.variableDeclarator().asScala.map(visitVariableDeclarator).toList)
  }

  override def visitVariableDeclarator(ctx: VariableDeclaratorContext): VariableDeclarator = {
    if ctx.variableInitializer() != null then
      VariableDeclarator(ctx.Identifier().getText, Option(visitVariableInitializer(ctx.variableInitializer())))
    else
      VariableDeclarator(ctx.Identifier().getText, None)
  }


  // Methode: visitMethodBodyStatement
  override def visitMethodBodyStatement(ctx: MethodBodyStatementContext): Statement = {
    ctx.getChild(0) match {
      case s: StatementContext => visitStatement(s)
      case r: ReturnContext => ReturnStatement(Option(r.expression()).map(visitExpression))
      case l: LocalVariableDeclarationContext => visitLocalVariableDeclaration(l)
      case _ => throw new IllegalArgumentException("Unknown method body statement")
    }
  }

  // Methode: visitStatement
  override def visitStatement(ctx: StatementContext): Statement = {
    if ctx == null then return null
    if (ctx.block() != null) {
      visitBlock(ctx.block(), false) match {case b: Block => b}
    } else if (ctx.assignment() != null) {
      visitAssignment(ctx.assignment())
    } else if (ctx.methodCall() != null) {
      visitMethodCall(ctx.methodCall())
    } else if (ctx.ifThen() != null) {
      visitIfThenElse(ctx.ifThen())
    } else if (ctx.ifThenElse() != null) {
      visitIfThenElse(ctx.ifThenElse())
    } else if (ctx.whileStatement() != null) {
      visitWhileStatement(ctx.whileStatement())
//    } else if (ctx.forStatement() != null) {
//      visitFor(ctx.forStatement())
    } else if (ctx.break_ != null) {
      BreakStatement()
    } else if (ctx.continue_ != null) {
      ContinueStatement()
    } else {
      throw new IllegalArgumentException("Unknown statement")
    }
  }

  override def visitAssignment(ctx: AssignmentContext): Assignment = {
    Assignment(ArrayRead(), visitExpression(ctx.expression())) // ToDo ArrayRead() nur Platzhalter
  }

  override def visitMethodCall(ctx: MethodCallContext): MethodCall = { // ToDo
    // MethodCall(target: Option[Expression], methodName: String, arguments: List[Expression])
    // methodCall : qualifiedName '(' expressionList? ')' ';';
    val names = visitQualifiedName(ctx.qualifiedName()).parts
    // if names.length > 1 then MethodCall(Some(QualifiedName(names.)), names.last, visitExpressionList(ctx.expressionList()))
    // MethodCall
    null
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

  // Weitere Hilfsmethoden für Expressions, Typen und andere Knoten
  override def visitExpression(ctx: ExpressionContext): Expression = {
    // Implementiere den Besuch von Expressions (z. B. calcFunction, primary, booleanFunction)
    if ctx.value() != null then visitValue(ctx.value())
    else if ctx.newObject() != null then visitNewObject(ctx.newObject())
    else if ctx.booleanFunction() != null then visitBooleanFunction(ctx.booleanFunction())
    else if ctx.calcFunction() != null then visitCalcFunction(ctx.calcFunction())
    else throw new IllegalArgumentException("Unknown statement")
  }

  override def visitValue(ctx: ValueContext): Expression = visitValueOrPrimary(ctx)

  override def visitPrimary(ctx: PrimaryContext): Expression = visitValueOrPrimary(ctx)

  private def visitValueOrPrimary(ctx: ValueContext | PrimaryContext) : Expression = {
    ctx.getChild(0) match {
      case c: TerminalNodeImpl if c.toString == "(" => visitExpression(ctx.getChild(1) match {case e: ExpressionContext => e})
      case l: LiteralContext => visitLiteral(l)
      case q: QualifiedNameContext => visitQualifiedName(q)
      case i: IdentifierContext => QualifiedName(List(i.Identifier().getText))
      //case m: MethodCallContext => visitMethodCall(m)
      // ToDo: Rest der Fälle
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

  override def visitArrayRead(ctx: ArrayReadContext): ArrayRead = {
    ArrayRead() // ToDo
  }

  override def visitNewObject(ctx: NewObjectContext): Expression = {
    ???
  }

  override def visitBooleanFunction(ctx: BooleanFunctionContext): Expression = {
    // BooleanFunction:
    // - Either involves a comparison (`booleanNumberOp`) between two values/calcFunctions
    // - Or involves a logical operation (`AND`, `OR`) between other boolean functions
    // - Could also include a negation (inverse)

    if (ctx.booleanNumberOp() != null || ctx.booleanOp() != null) {
      // Case 1: Comparison operation
      val left = ctx.getChild(0) match {
        case c: CalcFunctionContext => visitCalcFunction(c)
        case v: ValueContext => visitValue(v)
        case h: BooleanFunHighContext => getLeftBoolFun(h)
        case m: BooleanFunMiddleContext => getLeftBoolFun(m)
        case l: BooleanFunLowContext => getLeftBoolFun(l)
      }
      val right = ctx.getChild(2) match {
        case c: CalcFunctionContext => visitCalcFunction(c)
        case v: ValueContext => visitValue(v)
        case b: BooleanFunctionContext => visitBooleanFunction(b)
      }
      val operator = getBoolOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    } else if (ctx.inverse() != null) {
      // Case 3: Negation (inverse)
      val expression = visitExpression(ctx.inverse().expression()) // Negated expression
      UnaryExpression(UnaryOperator.Not, expression)
    } else {
      throw new IllegalArgumentException("Invalid BooleanFunction structure")
    }
  }

  private def getBoolOperator(op: String): BinaryOperator = {
    op match {
      case ">" => BinaryOperator.Greater
      case "<" => BinaryOperator.Less
      case ">=" => BinaryOperator.GreaterOrEqual
      case "<=" => BinaryOperator.LessOrEqual
      case "&&" => BinaryOperator.And
      case "||" => BinaryOperator.Or
    }
  }

  private def getLeftBoolFun(ctx: BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext): Expression = {
    if (ctx.getChild(1) != null) {
      ctx.getChild(0) match {
        case c: CalcFunctionContext => BinaryExpression(visitCalcFunction(c), getBoolOperator(ctx.getChild(1).getText), getRightBoolFun(ctx))
        case v: ValueContext => BinaryExpression(visitValue(v), getBoolOperator(ctx.getChild(1).getText), getRightBoolFun(ctx))
        case h: BooleanFunHighContext => BinaryExpression(getLeftBoolFun(h), getBoolOperator(ctx.getChild(1).getText), getRightBoolFun(ctx))
        case m: BooleanFunMiddleContext => BinaryExpression(getLeftBoolFun(m), getBoolOperator(ctx.getChild(1).getText), getRightBoolFun(ctx))
      }
    } else ctx.getChild(0) match {case v: ValueContext => visitValue(v)}
  }

  private def getRightBoolFun(ctx: BooleanFunHighContext | BooleanFunMiddleContext | BooleanFunLowContext): Expression = {
    ctx.getChild(2) match {
      case b: BooleanFunctionContext => visitBooleanFunction(b)
      case v: ValueContext => visitValue(v)
    }
  }

  override def visitCalcFunction(ctx: CalcFunctionContext): Expression = {
    if (ctx.calcBinOpHigher() != null) {
      val left = visitValue(ctx.value()) // Left-hand side expression
      val right = visitTerm(ctx.term()) // Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    } else if (ctx.calcBinOpLower() != null) {
      val left = visitTerm(ctx.term()) // Left-hand side expression
      val right = if ctx.value != null then visitValue(ctx.value()) else visitCalcFunction(ctx.calcFunction())// Right-hand side expression
      val operator = getCalcOperator(ctx.getChild(1).getText)
      BinaryExpression(left, operator, right)
    } else if (ctx.calcUnOp() != null) {
      // Case 2: Unary operation
      ctx.getChild(1).getText match {
        case "++" => BinaryExpression(visitQualifiedName(ctx.qualifiedName()), Add, IntLiteral(1))
        case "--" => BinaryExpression(visitQualifiedName(ctx.qualifiedName()), Subtract, IntLiteral(1))
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
      val left = visitValue(ctx.value()) // Left-hand side expression
      val right = visitTerm(ctx.term()) // Right-hand side expression
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
    if ctx.arrayType() != null then toType(ctx.arrayType().getText)
    else if ctx.objectType() != null then toType(ctx.objectType().getText)
    else if ctx.primitiveType() != null then toType(ctx.primitiveType().getText)
    else throw new IllegalArgumentException("No Type given!")
  }

  private def toType(typeName: String): Type = typeName match {
    // Primitive Typen
    case "int" => PrimitiveType(PrimitiveTypeName.Int)
    case "boolean" => PrimitiveType(PrimitiveTypeName.Boolean)
    case "char" => PrimitiveType(PrimitiveTypeName.Char)
    case "byte" => PrimitiveType(PrimitiveTypeName.Byte)
    case "short" => PrimitiveType(PrimitiveTypeName.Short)
    case "float" => PrimitiveType(PrimitiveTypeName.Float)
    case "double" => PrimitiveType(PrimitiveTypeName.Double)

    // Objekt-Typen
    case "String" => ObjectType(ObjectTypeName.String)
    case "Byte" => ObjectType(ObjectTypeName.Byte)
    case "Short" => ObjectType(ObjectTypeName.Short)
    case "Integer" => ObjectType(ObjectTypeName.Integer)
    case "Float" => ObjectType(ObjectTypeName.Float)
    case "Double" => ObjectType(ObjectTypeName.Double)
    case "Boolean" => ObjectType(ObjectTypeName.Boolean)
    case "Character" => ObjectType(ObjectTypeName.Character)

    // Benutzerdefinierter Objekttyp
    case customType if customType.matches("[A-Za-z_][A-Za-z0-9_]*") =>
      ObjectType(ObjectTypeName.Custom(customType))

    // Unbekannter Typ
    case _ => throw new IllegalArgumentException(s"Unknown type: $typeName")
  }


}

