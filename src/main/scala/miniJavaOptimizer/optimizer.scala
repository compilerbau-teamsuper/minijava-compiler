package miniJavaOptimizer

import miniJavaAnalysis.IR.*
import miniJavaAnalysis.IR.BinaryOperator.*

def is_sideeffect_free(expr: TypedExpression): Boolean = expr match
    case ByteLiteral(_)
    | ShortLiteral(_)
    | CharacterLiteral(_)
    | IntLiteral(_)
    | LongLiteral(_)
    | StringLiteral(_)
    | BooleanLiteral(_)
    | NullLiteral
    | LoadLocal(_, _) => true
    case Convert(_, value) => is_sideeffect_free(value)
    case IBinOp(left, Div | Mod, right) => right match {
        case ByteLiteral(0)
        | ShortLiteral(0)
        | CharacterLiteral(0)
        | IntLiteral(0) => false
        case ByteLiteral(_)
        | ShortLiteral(_)
        | CharacterLiteral(_)
        | IntLiteral(_) => is_sideeffect_free(left)
        case _ => false
    }
    case IBinOp(left, _, right) => is_sideeffect_free(left) && is_sideeffect_free(right)
    case LBinOp(left, Div | Mod, right) => right match
        case LongLiteral(0) => false
        case LongLiteral(_) => is_sideeffect_free(left)
        case _ => false
    case LBinOp(left, _, right) => is_sideeffect_free(left) && is_sideeffect_free(right)
    case FBinOp(left, _, right) => is_sideeffect_free(left) && is_sideeffect_free(right)
    case DBinOp(left, _, right) => is_sideeffect_free(left) && is_sideeffect_free(right)
    case _ => false

def constant_int(expr: TypedExpression): Option[Int] = expr match
    case ByteLiteral(value) => Some(value)
    case ShortLiteral(value) => Some(value)
    case CharacterLiteral(value) => Some(value)
    case IntLiteral(value) => Some(value)
    case _ => None

def simplify_expr(expr: TypedExpression): TypedExpression = expr match
    case ByteLiteral(_)
    | ShortLiteral(_)
    | IntLiteral(_)
    | LongLiteral(_)
    | FloatLiteral(_)
    | DoubleLiteral(_)
    | CharacterLiteral(_)
    | StringLiteral(_)
    | BooleanLiteral(_)
    | NullLiteral => expr
    case Convert(to, expr) => simplify_expr(expr) match
        case LongLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharacterLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case FloatLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharacterLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value.toLong)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case DoubleLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharacterLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value.toLong)
            case PrimitiveType.Float => FloatLiteral(value.toFloat)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case value => constant_int(value) match
            case None => Convert(to, value)
            case Some(value) => to match
                case PrimitiveType.Byte => ByteLiteral(value.toByte)
                case PrimitiveType.Short => ShortLiteral(value.toShort)
                case PrimitiveType.Char => CharacterLiteral(value.toChar)
                case PrimitiveType.Int => IntLiteral(value)
                case PrimitiveType.Long => LongLiteral(value)
                case PrimitiveType.Float => FloatLiteral(value)
                case PrimitiveType.Double => DoubleLiteral(value)
                case PrimitiveType.Boolean => ???

    case INeg(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => INeg(v)
            case Some(value) => IntLiteral(-value)
    }
    case IBinOp(left, op, right) => {
        val l = simplify_expr(left)
        val r = simplify_expr(right)
        (op, constant_int(l), constant_int(r)) match
            case (Add, Some(a), Some(b)) => IntLiteral(a + b)
            case (Add, None, Some(0)) => l
            case (Add, Some(0), None) => r
            case (Sub, Some(a), Some(b)) => IntLiteral(a - b)
            case (Sub, None, Some(0)) => l
            case (Sub, Some(0), None) => INeg(r)
            case (Mul, Some(a), Some(b)) => IntLiteral(a * b)
            case (Mul, None, Some(0)) if is_sideeffect_free(l) => IntLiteral(0)
            case (Mul, Some(0), None) if is_sideeffect_free(r) => IntLiteral(0)
            case (Mul, None, Some(1)) => l
            case (Mul, Some(1), None) => r
            case (Mul, None, Some(-1)) => INeg(l)
            case (Mul, Some(-1), None) => INeg(r)
            case (Div, Some(a), Some(b)) if b != 0 => IntLiteral(a / b)
            case (Div, None, Some(1)) => l
            case (Div, None, Some(-1)) => INeg(l)
            // TODO: do more optimization.
            case (_, _, _) => IBinOp(l, op, r)
    }

    case LNeg(value) => simplify_expr(value) match
        case LongLiteral(value) => LongLiteral(-value)
        case value => LNeg(value)
    case LBinOp(left, op, right) => (op, simplify_expr(left), simplify_expr(right)) match
            case (Add, LongLiteral(a), LongLiteral(b)) => LongLiteral(a + b)
            case (Add, l, LongLiteral(0)) => l
            case (Add, LongLiteral(0), r) => r
            case (Sub, LongLiteral(a), LongLiteral(b)) => LongLiteral(a - b)
            case (Sub, l, LongLiteral(0)) => l
            case (Sub, LongLiteral(0), r) => LNeg(r)
            case (Mul, LongLiteral(a), LongLiteral(b)) => LongLiteral(a * b)
            case (Mul, l, LongLiteral(0)) if is_sideeffect_free(l) => LongLiteral(0)
            case (Mul, LongLiteral(0), r) if is_sideeffect_free(r) => LongLiteral(0)
            case (Mul, l, LongLiteral(1)) => l
            case (Mul, LongLiteral(1), r) => r
            case (Mul, l, LongLiteral(-1)) => LNeg(l)
            case (Mul, LongLiteral(-1), r) => LNeg(r)
            case (Div, LongLiteral(a), LongLiteral(b)) if b != 0 => LongLiteral(a / b)
            case (Div, l, LongLiteral(1)) => l
            case (Div, l, LongLiteral(-1)) => LNeg(l)
            // TODO: do more optimization.
            case (op, l, r) => LBinOp(l, op, r)
    
    case FNeg(value) => simplify_expr(value) match
        case FloatLiteral(value) => FloatLiteral(-value)
        case value => FNeg(value)
    case FBinOp(left, op, right) => (op, simplify_expr(left), simplify_expr(right)) match
        // TODO: do more optimization
        case (op, l, r) => FBinOp(l, op, r)

    case DNeg(value) => simplify_expr(value) match
        case DoubleLiteral(value) => DoubleLiteral(-value)
        case value => DNeg(value)
    case DBinOp(left, op, right) => (op, simplify_expr(left), simplify_expr(right)) match
        // TODO: do more optimization
        case (op, l, r) => DBinOp(l, op, r)

    case LCmp(left, right) => expr
    case FCmp(left, right) => expr
    case DCmp(left, right) => expr

    case LoadLocal(_, _) => expr
    case DupStoreLocal(index, value) => DupStoreLocal(index, simplify_expr(value))
    case GetField(field_ty, name, target) => GetField(field_ty, name, simplify_expr(target))
    case DupPutField(name, target, value) => DupPutField(name, simplify_expr(target), simplify_expr(value))
    case InvokeSpecial(return_ty, name, target, args) => InvokeSpecial(return_ty, name, simplify_expr(target), args.map(simplify_expr))

    case Ternary(_, _, _, _, _, _) => expr

def simplify_stmt(stmt: TypedStatement): List[TypedStatement] = stmt match
    case ReturnStatement(expression) => List(ReturnStatement(expression.map(simplify_expr)))
    case ExpressionStatement(expression) => {
        val expr = simplify_expr(expression)
        if (is_sideeffect_free(expr)) List.empty else List(ExpressionStatement(expr))
    }
    case IfStatement(_, _, _, thenStmt, elseStmt) => List(stmt)
    case WhileStatement(_, _, _, body) => List(stmt)
    case BreakStatement => List(BreakStatement)
    case ContinueStatement => List(ContinueStatement)

def optimize(code: Code): Code = {
    code.copy(code = code.code.flatMap(simplify_stmt))
}
