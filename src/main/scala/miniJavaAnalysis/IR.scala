package miniJavaAnalysis.IR
import miniJavaParser.AST

case class ClassFile(
    name: String,
    fields: List[Field],
    methods: List[Method],
)

case class Field(
    name: String,
    ty: Type,
    value: TypedExpression,
)

case class Method(
    name: String,
    ty: MethodType,
    code: Option[Code],
)

case class Code(
    max_locals: Int,
    code: List[TypedStatement],
)

case class MethodType(params: List[Type], ret: Type)

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
case class ExpressionStatement(val expression: TypedExpression) extends TypedStatement
case class IfStatement(val condition: TypedExpression, val thenStmt: List[TypedStatement], val elseStmt: List[TypedStatement]) extends TypedStatement
case class WhileStatement(val condition: TypedExpression, val body: List[TypedStatement]) extends TypedStatement

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

case class LoadLocal(local_ty: Type, index: Int) extends TypedExpression(local_ty)
case class DupStoreLocal(index: Int, value: TypedExpression) extends TypedExpression(value.ty)
case class GetField(field_ty: Type, name: String, target: TypedExpression) extends TypedExpression(field_ty)
case class DupPutField(name: String, target: TypedExpression, value: TypedExpression) extends TypedExpression(value.ty)

case class InvokeSpecial(return_ty: Type, name: String, target: TypedExpression, args: List[TypedExpression]) extends TypedExpression(return_ty)
