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
case class PackageDeclaration(name: String) extends ASTNode
case class ImportDeclaration(name: AmbiguousName, isStatic: Boolean, isWildcard: Boolean) extends ASTNode

// Typ-Deklarationen (Klassen und Interfaces)
sealed trait TypeDeclaration extends ASTNode
case class ClassDeclaration(
                             modifiers: List[Modifier],
                             name: String,
                             superclass: AmbiguousName,
                             interfaces: List[AmbiguousName],
                             body: List[ClassMember]
                           ) extends TypeDeclaration with ClassMember
case class InterfaceDeclaration(
                                 modifiers: List[Modifier],
                                 name: String,
                                 superInterfaces: List[AmbiguousName],
                                 body: List[InterfaceMember]
                               ) extends TypeDeclaration with ClassMember

// Klassen- und Interface-Körper
sealed trait ClassMember extends ASTNode
sealed trait InterfaceMember extends ASTNode

// Methoden, Felder und Konstruktoren
case class MethodDeclaration(
                              modifiers: List[Modifier],
                              returnType: TypeOrVoid,
                              name: String,
                              parameters: List[Parameter],
                              body: Option[Block]
                            ) extends ClassMember with InterfaceMember
case class VarOrFieldDeclaration(
                             modifiers: List[Modifier],
                             fieldType: Type,
                             name: String,
                             initializer: Expression
                           ) extends ClassMember, InterfaceMember, Statement
case class ConstructorDeclaration(
                                   modifiers: List[Modifier],
                                   name: String,
                                   parameters: List[Parameter],
                                   body: Block
                                 ) extends ClassMember

// Parameter
case class Parameter(name: String, paramType: Type) extends ASTNode

// Blöcke und Statements
case class Block(statements: List[Statement]) extends Statement with ClassMember

sealed trait Statement extends ASTNode
case class ExpressionStatement(expression: Expression) extends Statement
case class IfStatement(condition: Expression, thenStmt: Statement, elseStmt: Option[Statement]) extends Statement
case class WhileStatement(condition: Expression, body: Statement) extends Statement
case class ReturnStatement(expression: Option[Expression]) extends Statement
case class BreakStatement() extends Statement
case class ContinueStatement() extends Statement


// Expressions
sealed trait Expression extends ASTNode
case class BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression) extends Expression
case class MethodCall(target: Option[Expression | AmbiguousName], name: String, args: List[Expression]) extends Expression  // ToDo: In UML eintragen
case class FieldAccess(target: Expression, name: String) extends Expression
case class ArrayInitializer(initializers: List[Expression]) extends Expression
case class NewArray(arrayType: Type, size: Expression) extends Expression
case class ArrayAccess(target: Expression, index: Expression) extends Expression // ToDo: Mehrdimensionale arrays
case class NewObject(constructorCall: MethodCall) extends Expression
case class Assignment(left: ExpressionName | FieldAccess | ArrayAccess, right: Expression) extends Expression
case class ExpressionName(name: AmbiguousName) extends Expression


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
sealed trait Comparison extends BinaryOperator
object BinaryOperator {
  case object Add extends BinaryOperator
  case object Subtract extends BinaryOperator
  case object Multiply extends BinaryOperator
  case object Divide extends BinaryOperator
  case object Modulo extends BinaryOperator
  case object And extends BinaryOperator
  case object Or extends BinaryOperator
  case object Xor extends BinaryOperator
  case object Equals extends Comparison
  case object Greater extends Comparison
  case object GreaterOrEqual extends Comparison
  case object Less extends Comparison
  case object LessOrEqual extends Comparison
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

sealed case class ObjectType(name: AmbiguousName) extends Type

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

case class AmbiguousName(components: List[String])
