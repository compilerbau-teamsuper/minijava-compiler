package miniJavaAnalysis.IR
import miniJavaParser.AST
import miniJavaParser.AST.QualifiedName
import miniJavaParser.AST.TypeOrVoid
import miniJavaParser.AST.Type

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

case class ObjectType(name: QualifiedName) extends Type
case object NullType extends Type

object LangTypes {
    val Object = ObjectType(QualifiedName(List("java", "lang"), "Object"))
    val String = ObjectType(QualifiedName(List("java", "lang"), "String"))
}

sealed trait TypedStatement[+T <: Type](val ty: T)

sealed trait TypedExpression[+T <: Type](val ty: T)

// Literals
case class ByteLiteral(value: Byte) extends TypedExpression(PrimitiveType.Byte)
case class ShortLiteral(value: Short) extends TypedExpression(PrimitiveType.Short)
case class IntLiteral(value: Int) extends TypedExpression(PrimitiveType.Int)
case class LongLiteral(value: Long) extends TypedExpression(PrimitiveType.Long)
case class StringLiteral(value: String) extends TypedExpression(LangTypes.String)
case class BooleanLiteral(value: Boolean) extends TypedExpression(PrimitiveType.Boolean)
case object NullLiteral extends TypedExpression(NullType)

case class Conversion[From <: Type, To <: PrimitiveType](to: To, value: TypedExpression[From]) extends TypedExpression[To](to)

// Binary expressions
case class NumericBinaryExpression[Ty <: NumericOperandType](
    left: TypedExpression[Ty],
    operator: AST.BinaryOperator,
    right: TypedExpression[Ty],
) extends TypedExpression[Ty](left.ty)
