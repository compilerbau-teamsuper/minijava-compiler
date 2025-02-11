package miniJavaParser.AST

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
                             variables: VariableDeclarator
                           ) extends ClassMember with InterfaceMember
case class ConstructorDeclaration(
                                   modifiers: List[Modifier],
                                   name: String,
                                   parameters: List[Parameter],
                                   body: Block
                                 ) extends ClassMember

// Variablen und Parameter
case class VariableDeclarator(name: String, initializer: Expression) extends ASTNode
case class Parameter(name: String, paramType: Type) extends ASTNode

// Blöcke und Statements
case class Block(statements: List[Statement]) extends Statement with ClassMember

sealed trait Statement extends ASTNode
case class ExpressionStatement(expression: Expression) extends Statement
case class IfStatement(condition: Expression, thenStmt: Statement, elseStmt: Option[Statement]) extends Statement
case class WhileStatement(condition: Expression, body: Statement) extends Statement
case class ForStatement(init: Option[LocalVariableDeclaration], condition: Option[Expression], update: Option[Expression], body: Statement) extends Statement
case class ReturnStatement(expression: Option[Expression]) extends Statement
case class BreakStatement() extends Statement
case class ContinueStatement() extends Statement
case class Assignment(left: Expression, right: Expression) extends Statement
case class LocalVariableDeclaration(varType: Type, variable: VariableDeclarator) extends Statement

// Expressions
sealed trait Expression extends ASTNode
case class BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression) extends Expression
case class MethodCall(target: Expression, arguments: List[Expression]) extends Expression, Statement
case class FieldAccess(target: Expression) extends Expression
case class ArrayInitializer(initializers: List[Expression]) extends Expression
case class ArrayAccess(target: Expression, index: Option[Expression]) extends Expression // ToDo: Argumente/Umsetzung
case class NewObject(target: Expression, arguments: List[Expression]) extends Expression

// Literals
sealed trait Literal extends Expression
case class IntLiteral(value: Int) extends Literal
case class LongLiteral(value: Long) extends Literal
case class ShortLiteral(value: Short) extends Literal
case class FloatLiteral(value: Float) extends Literal
case class DoubleLiteral(value: Double) extends Literal
case class StringLiteral(value: String) extends Literal
case class CharacterLiteral(value: Char) extends Literal
case class BooleanLiteral(value: Boolean) extends Literal
case object NullLiteral extends Literal

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
  case object Xor extends BinaryOperator
  case object Equals extends BinaryOperator
  case object Greater extends BinaryOperator
}

// Typen
sealed trait TypeOrVoid extends ASTNode
case object VoidType extends TypeOrVoid
sealed trait Type extends TypeOrVoid

sealed trait PrimitiveType extends Type
object PrimitiveType {
  case object Int extends PrimitiveType
  case object Boolean extends PrimitiveType
  case object Char extends PrimitiveType
  case object Double extends PrimitiveType
  case object Float extends PrimitiveType
  case object Long extends PrimitiveType
  case object Short extends PrimitiveType
}

sealed trait ObjectType extends Type
object ObjectType {
  case object String extends ObjectType
  case object Short extends ObjectType
  case object Long extends PrimitiveType
  case object Integer extends ObjectType
  case object Float extends ObjectType
  case object Double extends ObjectType
  case object Boolean extends ObjectType
  case object Character extends ObjectType
  case class Custom(name: String) extends ObjectType // Für benutzerdefinierte Typen
}

case class ArrayType(arrayType: Type) extends Type

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
case class QualifiedName(target: List[String], name: String) extends ASTNode, Expression

