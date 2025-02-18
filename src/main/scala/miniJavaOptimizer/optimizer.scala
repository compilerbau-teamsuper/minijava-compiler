package miniJavaOptimizer

import miniJavaAnalysis.IR.*
import miniJavaAnalysis.IR.BinaryOperator.*
import miniJavaAnalysis.IR.Comparison.ACmpEq
import miniJavaAnalysis.IR.Comparison.ACmpNe
import miniJavaAnalysis.IR.Comparison.ICmpEq
import miniJavaAnalysis.IR.Comparison.ICmpGe
import miniJavaAnalysis.IR.Comparison.ICmpGt
import miniJavaAnalysis.IR.Comparison.ICmpLe
import miniJavaAnalysis.IR.Comparison.ICmpLt
import miniJavaAnalysis.IR.Comparison.ICmpNe

def is_sideeffect_free(expr: TypedExpression): Boolean = expr match
    case IntLikeLiteral(_, _)
    | LongLiteral(_)
    | StringLiteral(_)
    | NullLiteral
    | LoadLocal(_, _) => true
    case Convert(_, value) => is_sideeffect_free(value)
    case IBinOp(left, Div | Mod, right) => right match {
        case IntLikeLiteral(_, 0) => false
        case IntLikeLiteral(_, _) => is_sideeffect_free(left)
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

sealed trait SimplifiedComparison
case object DefiniteYes extends SimplifiedComparison
case object DefiniteNo extends SimplifiedComparison
case class DoCompare(cmp: Comparison, left: TypedExpression, right: TypedExpression) extends SimplifiedComparison

def invert_comparison(cmp: Comparison): Comparison = cmp match
    case ACmpEq => ACmpNe
    case ACmpNe => ACmpEq
    case ICmpEq => ICmpNe
    case ICmpGe => ICmpLt
    case ICmpGt => ICmpLe
    case ICmpLe => ICmpGt
    case ICmpLt => ICmpGe
    case ICmpNe => ICmpEq

def decide_comparison(cmp: Comparison, left: TypedExpression, right: TypedExpression): SimplifiedComparison = (left, right) match
    case (IntLikeLiteral(_, l), IntLikeLiteral(_, r)) => cmp match
        case ICmpEq => if (l == r) DefiniteYes else DefiniteNo
        case ICmpGe => if (l >= r) DefiniteYes else DefiniteNo
        case ICmpGt => if (l > r) DefiniteYes else DefiniteNo
        case ICmpLe => if (l <= r) DefiniteYes else DefiniteNo
        case ICmpLt => if (l < r) DefiniteYes else DefiniteNo
        case ICmpNe => if (l != r) DefiniteYes else DefiniteNo
        case ACmpEq | ACmpNe => ??? // Something has gone horribly wrong...
    case (Ternary(_, c, l, r, yesval, noval), cmpval) if decide_comparison(cmp, yesval, cmpval) == DefiniteYes && decide_comparison(cmp, noval, cmpval) == DefiniteNo => DoCompare(c, l, r)
    case (Ternary(_, c, l, r, yesval, noval), cmpval) if decide_comparison(cmp, yesval, cmpval) == DefiniteNo && decide_comparison(cmp, noval, cmpval) == DefiniteYes => DoCompare(invert_comparison(c), l, r)
    case (cmpval, Ternary(_, c, l, r, yesval, noval)) if decide_comparison(cmp, cmpval, yesval) == DefiniteYes && decide_comparison(cmp, cmpval, noval) == DefiniteNo => DoCompare(c, l, r)
    case (cmpval, Ternary(_, c, l, r, yesval, noval)) if decide_comparison(cmp, cmpval, yesval) == DefiniteNo && decide_comparison(cmp, cmpval, noval) == DefiniteYes => DoCompare(invert_comparison(c), l, r)
    case (l, r) => DoCompare(cmp, l, r)

def simplify_expr(expr: TypedExpression): TypedExpression = expr match
    case IntLikeLiteral(_, _)
    | LongLiteral(_)
    | FloatLiteral(_)
    | DoubleLiteral(_)
    | StringLiteral(_)
    | NullLiteral => expr
    case Convert(to, expr) => simplify_expr(expr) match
        case IntLikeLiteral(actual_ty, value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case LongLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case FloatLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value.toLong)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case DoubleLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value.toLong)
            case PrimitiveType.Float => FloatLiteral(value.toFloat)
            case PrimitiveType.Double => DoubleLiteral(value)
            case PrimitiveType.Boolean => ???
        case value => Convert(to, value)

    case INeg(value) => simplify_expr(value) match
        case IntLikeLiteral(ty, value) => IntLiteral(-value)
        case value => INeg(value)
    case IBinOp(left, op, right) => (op, simplify_expr(left), simplify_expr(right)) match {
        case (Add, IntLikeLiteral(_, a), IntLikeLiteral(_, b)) => IntLiteral(a + b)
        case (Add, l, IntLikeLiteral(_, 0)) => l
        case (Add, IntLikeLiteral(_, 0), r) => r
        case (Sub, IntLikeLiteral(_, a), IntLikeLiteral(_, b)) => IntLiteral(a - b)
        case (Sub, l, IntLikeLiteral(_, 0)) => l
        case (Sub, IntLikeLiteral(_, 0), r) => INeg(r)
        case (Mul, IntLikeLiteral(_, a), IntLikeLiteral(_, b)) => IntLiteral(a * b)
        case (Mul, l, IntLikeLiteral(_, 0)) if is_sideeffect_free(l) => IntLiteral(0)
        case (Mul, IntLikeLiteral(_, 0), r) if is_sideeffect_free(r) => IntLiteral(0)
        case (Mul, l, IntLikeLiteral(_, 1)) => l
        case (Mul, IntLikeLiteral(_, 1), r) => r
        case (Mul, l, IntLikeLiteral(_, -1)) => INeg(l)
        case (Mul, IntLikeLiteral(_, -1), r) => INeg(r)
        case (Div, IntLikeLiteral(_, a), IntLikeLiteral(_, b)) if b != 0 => IntLiteral(a / b)
        case (Div, l, IntLikeLiteral(_, 1)) => l
        case (Div, l, IntLikeLiteral(_, -1)) => INeg(l)
        // TODO: do more optimization.
        case (op, l, r) => IBinOp(l, op, r)
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

    case LCmp(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (LongLiteral(l), LongLiteral(r)) => IntLikeLiteral(PrimitiveType.Int, l.compare(r))
        case (l, r) => LCmp(l, r)
    case FCmp(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (FloatLiteral(l), FloatLiteral(r)) => IntLikeLiteral(PrimitiveType.Int, l.compare(r))
        case (l, r) => FCmp(l, r)
    case DCmp(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (DoubleLiteral(l), DoubleLiteral(r)) => IntLikeLiteral(PrimitiveType.Int, l.compare(r))
        case (l, r) => FCmp(l, r)

    case LoadLocal(_, _) => expr
    case DupStoreLocal(index, value) => DupStoreLocal(index, simplify_expr(value))
    case GetField(field_ty, name, target) => GetField(field_ty, name, simplify_expr(target))
    case DupPutField(name, target, value) => DupPutField(name, simplify_expr(target), simplify_expr(value))
    case InvokeSpecial(return_ty, name, target, args) => InvokeSpecial(return_ty, name, simplify_expr(target), args.map(simplify_expr))

    case Ternary(ty, cmp, left, right, yes, no) => decide_comparison(cmp, simplify_expr(left), simplify_expr(right)) match
        case DefiniteYes => simplify_expr(yes)
        case DefiniteNo => simplify_expr(no)
        case DoCompare(c, l, r) => Ternary(ty, c, l, r, simplify_expr(yes), simplify_expr(no))

def simplify_stmt(stmt: TypedStatement): List[TypedStatement] = stmt match
    case ReturnStatement(expression) => List(ReturnStatement(expression.map(simplify_expr)))
    case ExpressionStatement(expression) => {
        val expr = simplify_expr(expression)
        if (is_sideeffect_free(expr)) List.empty else List(ExpressionStatement(expr))
    }
    case IfStatement(cmp, left, right, thenStmt, elseStmt) => decide_comparison(cmp, simplify_expr(left), simplify_expr(right)) match
        case DefiniteYes => thenStmt.flatMap(simplify_stmt)
        case DefiniteNo => elseStmt.flatMap(simplify_stmt)
        case DoCompare(c, l, r) => (thenStmt.flatMap(simplify_stmt), elseStmt.flatMap(simplify_stmt)) match
            case (Nil, Nil) => (is_sideeffect_free(l), is_sideeffect_free(r)) match
                case (true, true) => List.empty
                case (false, true) => List(ExpressionStatement(l))
                case (true, false) => List(ExpressionStatement(r))
                case (false, false) => List(ExpressionStatement(l), ExpressionStatement(r))
            case (Nil, no) => List(IfStatement(invert_comparison(c), l, r, no, List.empty))
            case (yes, no) => List(IfStatement(c, l, r, yes, no))

    case WhileStatement(cmp, left, right, body) => decide_comparison(cmp, simplify_expr(left), simplify_expr(right)) match
        case DefiniteYes => List(InfiniteWhileStatement(body.flatMap(simplify_stmt)))
        case DefiniteNo => List.empty
        case DoCompare(c, l, r) => List(WhileStatement(c, l, r, body.flatMap(simplify_stmt)))
    case InfiniteWhileStatement(body) => List(InfiniteWhileStatement(body.flatMap(simplify_stmt)))

    case BreakStatement => List(BreakStatement)
    case ContinueStatement => List(ContinueStatement)

def optimize(code: Code): Code = {
    code.copy(code = code.code.flatMap(simplify_stmt))
}
