package miniJavaAnalysis.IR

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
sealed trait IntLikeType extends PrimitiveType
object PrimitiveType {
    case object Byte extends NumericType with IntLikeType
    case object Short extends NumericType with IntLikeType
    case object Int extends NumericOperandType with IntLikeType
    case object Long extends NumericOperandType
    case object Float extends NumericOperandType
    case object Double extends NumericOperandType
    case object Char extends NumericType with IntLikeType
    case object Boolean extends PrimitiveType with IntLikeType
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
case object BreakStatement extends TypedStatement
case object ContinueStatement extends TypedStatement

sealed trait Comparison
object Comparison {
    case object ACmpEq extends Comparison
    case object ACmpNe extends Comparison
    case object ICmpEq extends Comparison
    case object ICmpGe extends Comparison
    case object ICmpGt extends Comparison
    case object ICmpLe extends Comparison
    case object ICmpLt extends Comparison
    case object ICmpNe extends Comparison
}

case class IfStatement(val cmp: Comparison, val left: TypedExpression, val right: TypedExpression, val thenStmt: List[TypedStatement], val elseStmt: List[TypedStatement]) extends TypedStatement
case class WhileStatement(val cmp: Comparison, val left: TypedExpression, val right: TypedExpression, val body: List[TypedStatement]) extends TypedStatement
case class InfiniteWhileStatement(val body: List[TypedStatement]) extends TypedStatement

sealed trait TypedExpression(val ty: Type)

// Literals
/** A literal that is treated like an `int`. The `actual_ty` is only relevant for type checking. */
case class IntLikeLiteral(actual_ty: IntLikeType, value: Int) extends TypedExpression(actual_ty)
case class LongLiteral(value: Long) extends TypedExpression(PrimitiveType.Long)
case class FloatLiteral(value: Float) extends TypedExpression(PrimitiveType.Float)
case class DoubleLiteral(value: Double) extends TypedExpression(PrimitiveType.Double)
case class StringLiteral(value: String) extends TypedExpression(LangTypes.String)
case object NullLiteral extends TypedExpression(NullType)

def BooleanLiteral(value: Boolean): IntLikeLiteral = IntLikeLiteral(PrimitiveType.Boolean, if (value) 1 else 0)
def ByteLiteral(value: Byte): IntLikeLiteral = IntLikeLiteral(PrimitiveType.Byte, value)
def ShortLiteral(value: Short): IntLikeLiteral = IntLikeLiteral(PrimitiveType.Short, value)
def CharLiteral(value: Char): IntLikeLiteral = IntLikeLiteral(PrimitiveType.Char, value)
def IntLiteral(value: Int): IntLikeLiteral = IntLikeLiteral(PrimitiveType.Int, value)

// Conversion

/** Converts the primitive expression `value` to the primitive type `to` using
 * widening, rounding or truncating conversion.
 *
 * This corresponds to bytecode instructions like `i2l`. The specific instruction
 * can be determined from the type of `value` and `to`.
 */
case class Convert(val to: NumericType, value: TypedExpression) extends TypedExpression(to)

case class INeg(value: TypedExpression) extends TypedExpression(PrimitiveType.Int)
case class LNeg(value: TypedExpression) extends TypedExpression(PrimitiveType.Long)
case class FNeg(value: TypedExpression) extends TypedExpression(PrimitiveType.Float)
case class DNeg(value: TypedExpression) extends TypedExpression(PrimitiveType.Double)

// Binary expressions
sealed trait BinaryOperator
sealed trait BinaryNumericOperator extends BinaryOperator
sealed trait BinaryIntegralOperator extends BinaryOperator
object BinaryOperator {
    case object Add extends BinaryNumericOperator
    case object Sub extends BinaryNumericOperator
    case object Mul extends BinaryNumericOperator
    case object Div extends BinaryNumericOperator
    case object Mod extends BinaryNumericOperator
    case object And extends BinaryIntegralOperator
    case object Or extends BinaryIntegralOperator
    case object Xor extends BinaryIntegralOperator
}

case class IBinOp(left: TypedExpression, op: BinaryOperator, right: TypedExpression) extends TypedExpression(PrimitiveType.Int)
case class LBinOp(left: TypedExpression, op: BinaryOperator, right: TypedExpression) extends TypedExpression(PrimitiveType.Long)
case class FBinOp(left: TypedExpression, op: BinaryOperator, right: TypedExpression) extends TypedExpression(PrimitiveType.Float)
case class DBinOp(left: TypedExpression, op: BinaryOperator, right: TypedExpression) extends TypedExpression(PrimitiveType.Double)

case class LCmp(left: TypedExpression, right: TypedExpression) extends TypedExpression(PrimitiveType.Int)
case class FCmp(left: TypedExpression, right: TypedExpression) extends TypedExpression(PrimitiveType.Int)
case class DCmp(left: TypedExpression, right: TypedExpression) extends TypedExpression(PrimitiveType.Int)

case class LoadLocal(local_ty: Type, index: Int) extends TypedExpression(local_ty)
case class DupStoreLocal(index: Int, value: TypedExpression) extends TypedExpression(value.ty)
case class GetField(field_ty: Type, name: String, target: TypedExpression) extends TypedExpression(field_ty)
case class DupPutField(name: String, target: TypedExpression, value: TypedExpression) extends TypedExpression(value.ty)

case class InvokeSpecial(return_ty: Type, name: String, target: TypedExpression, args: List[TypedExpression]) extends TypedExpression(return_ty)

/** A ternary expression. `result_ty` is only used during type checking. */
case class Ternary(result_ty: Type, cmp: Comparison, left: TypedExpression, right: TypedExpression, yes: TypedExpression, no: TypedExpression) extends TypedExpression(result_ty)
