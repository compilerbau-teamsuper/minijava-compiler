package AST

// Top-Level Trait für alle AST-Knoten
sealed trait ASTNode

// Die Kompilationseinheit (Root des ASTs)
case class CompilationUnit(
                            packageDeclaration: Option[PackageDeclaration],
                            importDeclarations: List[ImportDeclaration],
                            typeDeclarations: List[TypeDeclaration]
                          ) extends ASTNode

// Package und Import-Deklarationen
case class PackageDeclaration(name: QualifiedName) extends ASTNode
case class ImportDeclaration(name: QualifiedName, isStatic: Boolean, isWildcard: Boolean) extends ASTNode

// Typ-Deklarationen (Klassen und Interfaces)
sealed trait TypeDeclaration extends ASTNode
case class ClassDeclaration(
                             modifiers: List[Modifier],
                             name: String,
                             superclass: QualifiedName,
                             interfaces: List[QualifiedName],
                             body: ClassBody
                           ) extends TypeDeclaration with ClassMember
case class InterfaceDeclaration(
                                 modifiers: List[Modifier],
                                 name: String,
                                 superInterfaces: List[QualifiedName],
                                 body: InterfaceBody
                               ) extends TypeDeclaration with ClassMember

// Klassen- und Interface-Körper
case class ClassBody(members: List[ClassMember]) extends ASTNode
case class InterfaceBody(members: List[InterfaceMember]) extends ASTNode

sealed trait ClassMember extends ASTNode
sealed trait InterfaceMember extends ASTNode

// Methoden, Felder und Konstruktoren
case class MethodDeclaration(
                              modifiers: List[Modifier],
                              returnType: TypeOrVoid,
                              name: String,
                              parameters: List[Parameter],
                              body: Block
                            ) extends ClassMember with InterfaceMember
case class FieldDeclaration(
                             modifiers: List[Modifier],
                             fieldType: Type,
                             variables: List[VariableDeclarator]
                           ) extends ClassMember with InterfaceMember
case class ConstructorDeclaration(
                                   modifiers: List[Modifier],
                                   name: String,
                                   parameters: List[Parameter],
                                   body: Block
                                 ) extends ClassMember

// Variablen und Parameter
case class VariableDeclarator(name: String, initializer: Option[Expression]) extends ASTNode
case class Parameter(name: String, paramType: Type) extends ASTNode

// Blöcke und Statements
case class Block(statements: List[Statement]) extends Statement with ClassMember
case class StaticBlock(statements: List[Statement]) extends ClassMember

sealed trait Statement extends ASTNode
case class ExpressionStatement(expression: Expression) extends Statement
case class IfStatement(condition: Expression, thenStmt: Statement, elseStmt: Option[Statement]) extends Statement
case class WhileStatement(condition: Expression, body: Statement) extends Statement
case class ForStatement(init: Option[ForInit], condition: Option[Expression], update: List[Expression], body: Statement) extends Statement
case class ReturnStatement(expression: Option[Expression]) extends Statement
case class BreakStatement() extends Statement
case class ContinueStatement() extends Statement
case class Assignment(left: Expression, right: Expression) extends Statement
case class LocalVariableDeclaration(varType: Type, variables: List[VariableDeclarator]) extends Statement

sealed trait ForInit extends ASTNode
case class VariableDeclarationInit(variable: FieldDeclaration) extends ForInit // ToDo das richtig?
case class ExpressionListInit(expressions: List[Expression]) extends ForInit

// Expressions
sealed trait Expression extends ASTNode
case class Literal(value: LiteralValue) extends Expression
case class BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression) extends Expression
case class UnaryExpression(operator: UnaryOperator, operand: Expression) extends Expression
case class MethodCall(target: Option[Expression], methodName: String, arguments: List[Expression]) extends Expression
case class FieldAccess(target: Expression, fieldName: String) extends Expression
case class ArrayInitializer(initializers: List[Expression]) extends Expression
case class ArrayRead() extends Expression // ToDo: Argumente/Umsetzung

// Literals
sealed trait LiteralValue
case class IntLiteral(value: Int) extends LiteralValue
case class LongLiteral(value: Long) extends LiteralValue
case class FloatLiteral(value: Float) extends LiteralValue
case class DoubleLiteral(value: Double) extends LiteralValue
case class StringLiteral(value: String) extends LiteralValue
case class CharacterLiteral(value: Char) extends LiteralValue
case class BooleanLiteral(value: Boolean) extends LiteralValue
case object NullLiteral extends LiteralValue

// Operatoren
sealed trait BinaryOperator
object BinaryOperator {
  case object Add extends BinaryOperator
  case object Subtract extends BinaryOperator
  case object Multiply extends BinaryOperator
  case object Divide extends BinaryOperator
  case object Modulo extends BinaryOperator
  case object And extends BinaryOperator
  case object Or extends BinaryOperator
  case object Equals extends BinaryOperator
  case object NotEquals extends BinaryOperator
  case object Greater extends BinaryOperator
  case object GreaterOrEqual extends BinaryOperator
  case object Less extends BinaryOperator
  case object LessOrEqual extends BinaryOperator
}

sealed trait UnaryOperator
object UnaryOperator {
  case object Negate extends UnaryOperator // -x
  case object Not extends UnaryOperator    // !x
  case object Increment extends UnaryOperator
  case object Decrement extends UnaryOperator
}

// Typen
sealed trait TypeOrVoid extends ASTNode
case object VoidType extends TypeOrVoid
sealed trait Type extends TypeOrVoid
case class PrimitiveType(name: PrimitiveTypeName) extends Type
case class ObjectType(name: ObjectTypeName) extends Type

sealed trait PrimitiveTypeName
object PrimitiveTypeName {
  case object Int extends PrimitiveTypeName
  case object Boolean extends PrimitiveTypeName
  case object Char extends PrimitiveTypeName
  case object Double extends PrimitiveTypeName
  case object Float extends PrimitiveTypeName
  case object Long extends PrimitiveTypeName
  case object Short extends PrimitiveTypeName
  case object Byte extends PrimitiveTypeName
}

sealed trait ObjectTypeName
object ObjectTypeName {
  case object String extends ObjectTypeName
  case object Byte extends ObjectTypeName
  case object Short extends ObjectTypeName
  case object Integer extends ObjectTypeName
  case object Float extends ObjectTypeName
  case object Double extends ObjectTypeName
  case object Boolean extends ObjectTypeName
  case object Character extends ObjectTypeName
  case class Custom(name: String) extends ObjectTypeName // Für benutzerdefinierte Typen
}


// Modifiers
enum Modifier {
  case Public
  case Private
  case Protected
  case Abstract
  case Static
  case Final
}

// Hilfsklassen
case class QualifiedName(parts: List[String]) extends ASTNode

