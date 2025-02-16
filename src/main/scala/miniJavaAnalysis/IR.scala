package miniJavaAnalysis.IR
import miniJavaParser.AST

case class CompilationUnit()

sealed trait Type
sealed trait PrimitiveType extends Type
sealed trait NumericType extends PrimitiveType
sealed trait NumericOperandType extends NumericType
object PrimitiveType {
    case object Byte extends NumericType
    case object Short extends NumericType
    case object Int extends NumericOperandType
    case object Long extends NumericOperandType
    case object Float extends NumericOperandType
    case object Double extends NumericOperandType
    case object Char extends PrimitiveType
    case object Boolean extends PrimitiveType
}

case class ObjectType(name: String) extends Type
case object NullType extends Type

case object VoidType extends Type

object LangTypes {
    val Object = ObjectType("java.lang.Object")
    val String = ObjectType("java.lang.String")
}

sealed trait TypedStatement

case class ReturnStatement(val expression: Option[TypedExpression]) extends TypedStatement
case class Block(val statements: List[TypedStatement]) extends TypedStatement
case class ExpressionStatement(val expression: TypedExpression) extends TypedStatement
case class IfStatement(val condition: TypedExpression, val thenStmt: TypedStatement, val elseStmt: Option[TypedStatement]) extends TypedStatement
case class WhileStatement(val condition: TypedExpression, val body: TypedStatement) extends TypedStatement

sealed trait TypedExpression(val ty: Type)

// Literals
case class ByteLiteral(value: Byte) extends TypedExpression(PrimitiveType.Byte)
case class ShortLiteral(value: Short) extends TypedExpression(PrimitiveType.Short)
case class IntLiteral(value: Int) extends TypedExpression(PrimitiveType.Int)
case class LongLiteral(value: Long) extends TypedExpression(PrimitiveType.Long)
case class StringLiteral(value: String) extends TypedExpression(LangTypes.String)
case class BooleanLiteral(value: Boolean) extends TypedExpression(PrimitiveType.Boolean)
case object NullLiteral extends TypedExpression(NullType)

case class Conversion(to: PrimitiveType, value: TypedExpression) extends TypedExpression(to)

// Binary expressions
case class NumericBinaryExpression(
    left: TypedExpression,
    operator: AST.BinaryOperator,
    right: TypedExpression,
) extends TypedExpression(left.ty)
