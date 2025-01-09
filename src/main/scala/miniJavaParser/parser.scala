package miniJavaParser
import AST.*

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, ParserRuleContext}

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters.*

object JavaASTBuilder {
  def main(args: Array[String]): Unit = {
    // Beispiel-Dateipfad (ersetzen mit dem Pfad zu deiner Java-Datei)
    val filePath = "G:\\Git\\minijava-compiler\\src\\main\\scala\\miniJavaParser\\test.java"

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
  override def visitCompilationUnit(ctx: miniJavaParser.CompilationUnitContext): CompilationUnit = {
    val packageDeclaration = Option(ctx.packageDeclaration())
      .map(visitPackageDeclaration)
    val importDeclarations = ctx.importDeclaration().asScala.map(visitImportDeclaration).toList
    val typeDeclarations = ctx.typeDeclaration().asScala.map(visitTypeDeclaration).toList

    CompilationUnit(packageDeclaration, importDeclarations, typeDeclarations)
  }

  override def visitPackageDeclaration(ctx: miniJavaParser.PackageDeclarationContext): PackageDeclaration = {
    PackageDeclaration(visitQualifiedName(ctx.qualifiedName()))
  }

  override def visitImportDeclaration(ctx: miniJavaParser.ImportDeclarationContext): ImportDeclaration = {
    ImportDeclaration(
      visitQualifiedName(ctx.qualifiedName()),
      ctx.Static() != null,
      ctx.Wildcard() != null
    )
  }

    def visitTypeDeclaration(ctx: miniJavaParser.TypeDeclarationContext): TypeDeclaration = {
    if (ctx.classDeclaration() != null) visitClassDeclaration(ctx.classDeclaration())
    else if (ctx.interfaceDeclaration() != null) visitInterfaceDeclaration(ctx.interfaceDeclaration())
    else null // Just Semikolon
  }

  override def visitClassDeclaration(ctx: miniJavaParser.ClassDeclarationContext): ClassDeclaration = {
    val modifiers: ListBuffer[Modifier] = if ctx.classModifier() != null then ListBuffer(toModifier(ctx.classModifier().getText)) else ListBuffer()
    if ctx.Public() != null then modifiers.addOne(Modifier.Public)
    val name = ctx.Identifier().getText
    val superclass =  if ctx.superclass() != null then Option(ctx.superclass()).map(sc => visitQualifiedName(sc.qualifiedName())) else None
    val interfaces = if ctx.superinterfaces() != null then ctx.superinterfaces().qualifiedName().asScala.map(visitQualifiedName).toList else List.empty
    val body = visitClassBody(ctx.classBody())

    ClassDeclaration(modifiers.toList, name, superclass, interfaces, body)
  }

  override def visitInterfaceDeclaration(ctx: miniJavaParser.InterfaceDeclarationContext): InterfaceDeclaration = {
    val modifiers: List[Modifier] = if ctx.Public() != null then List(Modifier.Public) else List.empty
    val name = ctx.Identifier().getText
    val superInterfaces = if ctx.extendsInterfaces() != null then ctx.extendsInterfaces().qualifiedName().asScala.map(visitQualifiedName).toList else List.empty
    val body = visitInterfaceBody(ctx.interfaceBody())

    InterfaceDeclaration(modifiers, name, superInterfaces, body)
  }

  override def visitClassBody(ctx: miniJavaParser.ClassBodyContext): ClassBody = {
    if !ctx.classBodyDeclaration().isEmpty then {
      ClassBody(ctx.classBodyDeclaration().asScala.toList.map(c => visitClassBodyDeclaration(c)))
    }
    else ClassBody(List.empty)
  }

  override def visitInterfaceBody(ctx: miniJavaParser.InterfaceBodyContext): InterfaceBody = {
    if !ctx.interfaceBodyDeclaration().isEmpty then {
      InterfaceBody(ctx.interfaceBodyDeclaration().asScala.toList.map(c => visitInterfaceBodyDeclaration(c)))
    }
    else InterfaceBody(List.empty)
  }

  override def visitQualifiedName(ctx: miniJavaParser.QualifiedNameContext): QualifiedName = {
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

  override def visitClassBodyDeclaration(ctx: miniJavaParser.ClassBodyDeclarationContext): ClassMember = {
    if (ctx.staticInitializer() != null) {
      visitBlock(ctx.staticInitializer().block(), true) match { case s: StaticBlock => s }
    } else if (ctx.block() != null) {
      visitBlock(ctx.staticInitializer().block(), false) match { case b: Block => b }
    }
    else if (ctx.memberDeclaration() != null) {
      visitMemberDeclaration(ctx.memberDeclaration())
    }
    else null
  }

  override def visitInterfaceBodyDeclaration(ctx: miniJavaParser.InterfaceBodyDeclarationContext): InterfaceMember = {
    if (ctx.interfaceMemberDeclaration() != null) {
      visitInterfaceMemberDeclaration(ctx.interfaceMemberDeclaration())
    }
    else null
  }

  // Hilfsfunktion für MemberDeclaration
  override def visitMemberDeclaration(ctx: miniJavaParser.MemberDeclarationContext): ClassMember = {
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

  override def visitInterfaceMemberDeclaration(ctx: miniJavaParser.InterfaceMemberDeclarationContext): InterfaceMember = {
    if (ctx.methodDeclaration() != null) {
      visitMethodDeclaration(ctx.methodDeclaration())
    } else if (ctx.fieldDeclaration() != null) {
      visitFieldDeclaration(ctx.fieldDeclaration())
    } else {
      throw new IllegalArgumentException("Unknown member declaration")
    }
  }

  // Methode: visitMethodDeclaration
  override def visitMethodDeclaration(ctx: miniJavaParser.MethodDeclarationContext): MethodDeclaration = {
    val modifiers = getModifiers(ctx.methodModifier()).:::(getModifiers(ctx.accessModifier()))
    val name = ctx.Identifier().getText
    val returnType = visitTypeOrVoid(ctx.typeOrVoid())
    val parameters = getFormalParameters(ctx.formalParameters())
    val body = visitMethodBody(ctx.methodBody())

    MethodDeclaration(modifiers, returnType, name, parameters, body)
  }

  // Methode: visitFieldDeclaration
  override def visitFieldDeclaration(ctx: miniJavaParser.FieldDeclarationContext): FieldDeclaration = {
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
  override def visitConstructorDeclaration(ctx: miniJavaParser.ConstructorDeclarationContext): ConstructorDeclaration = {
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

  private def getFormalParameters(ctx: miniJavaParser.FormalParametersContext): List[Parameter] = {
    if ctx == null then return List.empty
    (ctx.`type`().asScala zip ctx.Identifier().asScala).map{case (t, n) =>  Parameter(n.getText, visitType(t))}.toList
  }

  // Methode: visitVariableInitializer
  override def visitVariableInitializer(ctx: miniJavaParser.VariableInitializerContext): Expression = {
    if (ctx.expression() != null) {
      visitExpression(ctx.expression())
    } else if (ctx.arrayInitializer() != null) {
      visitArrayInitializer(ctx.arrayInitializer())
    } else {
      throw new IllegalArgumentException("Unknown variable initializer")
    }
  }

  // Methode: visitArrayInitializer
  override def visitArrayInitializer(ctx: miniJavaParser.ArrayInitializerContext): ArrayInitializer = {
    val initializers = ctx.variableInitializer().asScala.map(visitVariableInitializer).toList
    ArrayInitializer(initializers)
  }

  // Methode: visitMethodBody
  override def visitMethodBody(ctx: miniJavaParser.MethodBodyContext): Block = {
    val statements = ctx.methodBodyStatement().asScala.map(visitMethodBodyStatement).toList
    Block(statements) // ToDo: Methodbody = Block?
  }

  // Methode: visitBlock
  private def visitBlock(ctx: miniJavaParser.BlockContext, static: Boolean): Block | StaticBlock = {
    val statements = ctx.statement().asScala.map(visitStatement).toList
    if static then StaticBlock(statements) else Block(statements)
  }

  // Methode: visitMethodBodyStatement
  override def visitMethodBodyStatement(ctx: miniJavaParser.MethodBodyStatementContext): Statement = {
    if (ctx.statement() != null) {
      visitStatement(ctx.statement())
//    } else if (ctx.returnStatement() != null) {
//      val expression = Option(ctx.returnStatement().expression()).map(visitExpression)
//      Return(expression)
//    } else {
//      throw new IllegalArgumentException("Unknown method body statement")
    }
    else null
  }

  // Methode: visitStatement
  override def visitStatement(ctx: miniJavaParser.StatementContext): Statement = {
    if (ctx.block() != null) {
      visitBlock(ctx.block(), false) match {case b: Block => b}
//    } else if (ctx.assignment() != null) {
//      visitAssignment(ctx.assignment())
//    } else if (ctx.methodCall() != null) {
//      visitMethodCall(ctx.methodCall())
//    } else if (ctx.ifThen() != null) {
//      visitIfThen(ctx.ifThen())
//    } else if (ctx.ifThenElse() != null) {
//      visitIfThenElse(ctx.ifThenElse())
//    } else if (ctx.whileStatement() != null) {
//      visitWhile(ctx.whileStatement())
//    } else if (ctx.forStatement() != null) {
//      visitFor(ctx.forStatement())
//    } else if (ctx.breakStatement() != null) {
//      Break()
//    } else if (ctx.continueStatement() != null) {
//      Continue()
//    } else {
//      throw new IllegalArgumentException("Unknown statement")
    }
    else null
  }

  // Weitere Hilfsmethoden für Expressions, Typen und andere Knoten
  override def visitExpression(ctx: miniJavaParser.ExpressionContext): Expression = {
    // Implementiere den Besuch von Expressions (z. B. calcFunction, primary, booleanFunction)
    ???
  }

  override def visitTypeOrVoid(ctx: miniJavaParser.TypeOrVoidContext): TypeOrVoid = {
    if (ctx.`type`() != null) {
      visitType(ctx.`type`())
    } else {
      VoidType
    }
  }

  override def visitType(ctx: miniJavaParser.TypeContext): Type = {
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

