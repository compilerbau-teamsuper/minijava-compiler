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
import java.io.ObjectOutputStream.PutField

def is_equivalent(a: TypedExpression, b: TypedExpression): Boolean = if (a == b) true else (a, b) match
    case (BooleanLiteral(a), BooleanLiteral(b)) => a == b
    case (ByteLiteral(a), ByteLiteral(b)) => a == b
    case (ShortLiteral(a), ShortLiteral(b)) => a == b
    case (CharLiteral(a), CharLiteral(b)) => a == b
    case (IntLiteral(a), IntLiteral(b)) => a == b
    case (LongLiteral(a), LongLiteral(b)) => a == b
    case (StringLiteral(a), StringLiteral(b)) => a == b
    case (NullLiteral, NullLiteral) => true
    case (Convert(aty, a), Convert(bty, b)) => aty == bty && is_equivalent(a, b)
    case (INeg(a), INeg(b)) => is_equivalent(a, b)
    case (IBinOp(la, opa, ra), IBinOp(lb, opb, rb)) => opa == opb && is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (LNeg(a), LNeg(b)) => is_equivalent(a, b)
    case (LBinOp(la, opa, ra), LBinOp(lb, opb, rb)) => opa == opb && is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (FNeg(a), FNeg(b)) => is_equivalent(a, b)
    case (FBinOp(la, opa, ra), FBinOp(lb, opb, rb)) => opa == opb && is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (DNeg(a), DNeg(b)) => is_equivalent(a, b)
    case (DBinOp(la, opa, ra), DBinOp(lb, opb, rb)) => opa == opb && is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (LCmp(la, ra), LCmp(lb, rb)) => is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (FCmpL(la, ra), FCmpL(lb, rb)) => is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (FCmpG(la, ra), FCmpG(lb, rb)) => is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (DCmpL(la, ra), DCmpL(lb, rb)) => is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (DCmpG(la, ra), DCmpG(lb, rb)) => is_equivalent(la, lb) && is_equivalent(ra, rb)
    case (LoadLocal(_, a), LoadLocal(_, b)) => a == b // In welformed IR, the types must be equal.
    case (DupStoreLocal(ia, a), DupStoreLocal(ib, b)) => ia == ib && is_equivalent(a, b)
    case (GetField(tya, ofa, na, ta), GetField(tyb, ofb, nb, tb)) => tya == tyb && ofa == ofb && na == nb && is_equivalent(ta, tb) // In welformed IR, the types must be equal.
    case (DupPutField(ofa, na, ta, a), DupPutField(ofb, nb, tb, b)) => ofa == ofb && na == nb && is_equivalent(ta, tb) && is_equivalent(a, b)
    case (InvokeSpecial(oa, na, ma, ta, aa), InvokeSpecial(ob, nb, mb, tb, ab)) => false // TODO
    case (Ternary(_, ca, la, ra, ya, na), Ternary(_, cb, lb, rb, yb, nb)) => false // TODO
    case (_, _) => false

def is_sideeffect_free(expr: TypedExpression): Boolean = expr match
    case BooleanLiteral(_)
    | ByteLiteral(_)
    | ShortLiteral(_)
    | CharLiteral(_)
    | IntLiteral(_)
    | LongLiteral(_)
    | StringLiteral(_)
    | NullLiteral
    | LoadLocal(_, _) => true
    case Convert(_, value) => is_sideeffect_free(value)
    case IBinOp(left, Div | Mod, right) => right match {
        case IntLiteral(0) => false
        case IntLiteral(_) => is_sideeffect_free(left)
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

def simplify_string_builder(expr: TypedExpression): Option[TypedExpression] = expr match
    case New(LangTypes.StringBuilder.name, MethodType(List(), VoidType), List()) => Some(expr)
    case New(LangTypes.StringBuilder.name, MethodType(List(LangTypes.String), VoidType), List(what)) => what match
        case InvokeVirtual(LangTypes.StringBuilder.name, "toString", MethodType(List(), LangTypes.StringBuilder), what, List()) => simplify_string_builder(what)
        case _ => Some(New(LangTypes.StringBuilder.name, MethodType(List(LangTypes.String), VoidType), List(simplify_expr(what))))
    case InvokeVirtual(LangTypes.StringBuilder.name, "append", mty, target, arg) => simplify_string_builder(target) match
        case Some(builder) => Some(InvokeVirtual(LangTypes.StringBuilder.name, "append", mty, builder, arg.map(simplify_expr)))
        case None => None
    case _ => None

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
    case (BooleanLiteral(l), BooleanLiteral(r)) => cmp match
        case ICmpEq => if (l == r) DefiniteYes else DefiniteNo
        case ICmpNe => if (l != r) DefiniteYes else DefiniteNo
        case _ => ???
    case (IntLiteral(l), IntLiteral(r)) => cmp match
        case ICmpEq => if (l == r) DefiniteYes else DefiniteNo
        case ICmpGe => if (l >= r) DefiniteYes else DefiniteNo
        case ICmpGt => if (l > r) DefiniteYes else DefiniteNo
        case ICmpLe => if (l <= r) DefiniteYes else DefiniteNo
        case ICmpLt => if (l < r) DefiniteYes else DefiniteNo
        case ICmpNe => if (l != r) DefiniteYes else DefiniteNo
        case ACmpEq | ACmpNe => ??? // Something has gone horribly wrong...
    case (tern @ Ternary(_, c, l, r, yesval, noval), cmpval) => (decide_comparison(cmp, yesval, cmpval), decide_comparison(cmp, noval, cmpval)) match
        case (DefiniteYes, DefiniteNo) => DoCompare(c, l, r)
        case (DefiniteNo, DefiniteYes) => DoCompare(invert_comparison(c), l, r)
        case (DefiniteYes, DefiniteYes) if is_sideeffect_free(l) && is_sideeffect_free(r) => DefiniteYes
        case (DefiniteNo, DefiniteNo) if is_sideeffect_free(l) && is_sideeffect_free(r) => DefiniteNo
        case (_, _) => DoCompare(cmp, tern, cmpval)
    case (cmpval, tern @ Ternary(_, c, l, r, yesval, noval)) => (decide_comparison(cmp, cmpval, yesval), decide_comparison(cmp, cmpval, noval)) match
        case (DefiniteYes, DefiniteNo) => DoCompare(c, l, r)
        case (DefiniteNo, DefiniteYes) => DoCompare(invert_comparison(c), l, r)
        case (DefiniteYes, DefiniteYes) if is_sideeffect_free(l) && is_sideeffect_free(r) => DefiniteYes
        case (DefiniteNo, DefiniteNo) if is_sideeffect_free(l) && is_sideeffect_free(r) => DefiniteNo
        case (_, _) => DoCompare(cmp, cmpval, tern)
    case (l, r) => DoCompare(cmp, l, r)

def simplify_expr(expr: TypedExpression): TypedExpression = expr match
    case BooleanLiteral(_)
    | ByteLiteral(_)
    | ShortLiteral(_)
    | CharLiteral(_)
    | IntLiteral(_)
    | LongLiteral(_)
    | FloatLiteral(_)
    | DoubleLiteral(_)
    | StringLiteral(_)
    | NullLiteral => expr
    case Convert(to, expr) => simplify_expr(expr) match
        case ByteLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value)
            case PrimitiveType.Short => ShortLiteral(value)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case ShortLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case CharLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value)
            case PrimitiveType.Int => IntLiteral(value)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case IntLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case LongLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case FloatLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value.toLong)
            case PrimitiveType.Float => FloatLiteral(value)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case DoubleLiteral(value) => to match
            case PrimitiveType.Byte => ByteLiteral(value.toByte)
            case PrimitiveType.Short => ShortLiteral(value.toShort)
            case PrimitiveType.Char => CharLiteral(value.toChar)
            case PrimitiveType.Int => IntLiteral(value.toInt)
            case PrimitiveType.Long => LongLiteral(value.toLong)
            case PrimitiveType.Float => FloatLiteral(value.toFloat)
            case PrimitiveType.Double => DoubleLiteral(value)
            case _ => ???
        case NullLiteral => NullLiteral
        case value if value.ty == to => value
        case value => Convert(to, value)

    case BBinOp(left, op, right) => (op, simplify_expr(left), simplify_expr(right)) match
        case (And, BooleanLiteral(a), BooleanLiteral(b)) => BooleanLiteral(a & b)
        case (And, BooleanLiteral(true), b) => b
        case (And, a, BooleanLiteral(true)) => a
        case (And, BooleanLiteral(false), b) if is_sideeffect_free(b) => BooleanLiteral(false)
        case (And, a, BooleanLiteral(false)) if is_sideeffect_free(a) => BooleanLiteral(false)
        case (Or, BooleanLiteral(a), BooleanLiteral(b)) => BooleanLiteral(a | b)
        case (Or, BooleanLiteral(true), b) if is_sideeffect_free(b) => BooleanLiteral(true)
        case (Or, a, BooleanLiteral(true)) if is_sideeffect_free(a) => BooleanLiteral(true)
        case (Or, BooleanLiteral(false), b) => b
        case (Or, a, BooleanLiteral(false)) => a
        case (Xor, BooleanLiteral(a), BooleanLiteral(b)) => BooleanLiteral(a ^ b)
        case (Xor, BooleanLiteral(false), b) => b
        case (Xor, a, BooleanLiteral(false)) => a
        case (op, a, b) => BBinOp(a, op, b)

    case INeg(value) => simplify_expr(value) match
        case IntLiteral(value) => IntLiteral(-value)
        case value => INeg(value)
    case IBinOp(left, op, right) => (op, simplify_expr(left), simplify_expr(right)) match {
        case (Add, IntLiteral(a), IntLiteral(b)) => IntLiteral(a + b)
        case (Add, l, IntLiteral(0)) => l
        case (Add, IntLiteral(0), r) => r
        case (Sub, IntLiteral(a), IntLiteral(b)) => IntLiteral(a - b)
        case (Sub, l, IntLiteral(0)) => l
        case (Sub, IntLiteral(0), r) => INeg(r)
        case (Mul, IntLiteral(a), IntLiteral(b)) => IntLiteral(a * b)
        case (Mul, l, IntLiteral(0)) if is_sideeffect_free(l) => IntLiteral(0)
        case (Mul, IntLiteral(0), r) if is_sideeffect_free(r) => IntLiteral(0)
        case (Mul, l, IntLiteral(1)) => l
        case (Mul, IntLiteral(1), r) => r
        case (Mul, l, IntLiteral(-1)) => INeg(l)
        case (Mul, IntLiteral(-1), r) => INeg(r)
        case (Div, IntLiteral(a), IntLiteral(b)) if b != 0 => IntLiteral(a / b)
        case (Div, l, IntLiteral(1)) => l
        case (Div, l, IntLiteral(-1)) => INeg(l)
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
        case (LongLiteral(l), LongLiteral(r)) => IntLiteral(l.compare(r))
        case (l, r) => LCmp(l, r)
    case FCmpL(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (FloatLiteral(l), r) if l.isNaN && is_sideeffect_free(r) => IntLiteral(-1)
        case (l, FloatLiteral(r)) if r.isNaN && is_sideeffect_free(l) => IntLiteral(-1)
        case (FloatLiteral(l), FloatLiteral(r)) => IntLiteral(l.compare(r))
        case (l, r) => FCmpL(l, r)
    case FCmpG(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (FloatLiteral(l), r) if l.isNaN && is_sideeffect_free(r) => IntLiteral(1)
        case (l, FloatLiteral(r)) if r.isNaN && is_sideeffect_free(l) => IntLiteral(1)
        case (FloatLiteral(l), FloatLiteral(r)) => IntLiteral(l.compare(r))
        case (l, r) => FCmpG(l, r)
    case DCmpL(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (DoubleLiteral(l), r) if l.isNaN && is_sideeffect_free(r) => IntLiteral(-1)
        case (l, DoubleLiteral(r)) if r.isNaN && is_sideeffect_free(l) => IntLiteral(-1)
        case (DoubleLiteral(l), DoubleLiteral(r)) => IntLiteral(l.compare(r))
        case (l, r) => DCmpL(l, r)
    case DCmpG(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (DoubleLiteral(l), r) if l.isNaN && is_sideeffect_free(r) => IntLiteral(1)
        case (l, DoubleLiteral(r)) if r.isNaN && is_sideeffect_free(l) => IntLiteral(1)
        case (DoubleLiteral(l), DoubleLiteral(r)) => IntLiteral(l.compare(r))
        case (l, r) => DCmpG(l, r)

    // Combine chained string concatenations.
    case InvokeVirtual(LangTypes.StringBuilder.name, "toString", MethodType(List(), LangTypes.String), builder, List()) => simplify_string_builder(builder) match
        case Some(builder) => InvokeVirtual(LangTypes.StringBuilder.name, "toString", MethodType(List(), VoidType), builder, List())
        case None => InvokeVirtual(LangTypes.StringBuilder.name, "toString", MethodType(List(), LangTypes.String), simplify_expr(builder), List())

    case LoadLocal(_, _) => expr
    case DupStoreLocal(index, value) => DupStoreLocal(index, simplify_expr(value))
    case LoadArray(element, target, index) => LoadArray(element, simplify_expr(target), simplify_expr(index))
    case DupStoreArray(target, index, value) => DupStoreArray(simplify_expr(target), simplify_expr(index), simplify_expr(value))
    case GetField(field_ty, of, name, target) => GetField(field_ty, of, name, simplify_expr(target))
    case DupPutField(of, name, target, value) => DupPutField(of, name, simplify_expr(target), simplify_expr(value))
    case GetStatic(field_ty, of, name) => GetStatic(field_ty, of, name)
    case DupPutStatic(of, name, value) => DupPutStatic(of, name, simplify_expr(value))
    case InvokeStatic(of, name, mty, args) => InvokeStatic(of, name, mty, args.map(simplify_expr))
    case InvokeSpecial(of, name, mty, target, args) => InvokeSpecial(of, name, mty, simplify_expr(target), args.map(simplify_expr))
    case InvokeInterface(of, name, mty, target, args) => InvokeInterface(of, name, mty, simplify_expr(target), args.map(simplify_expr))
    case InvokeVirtual(of, name, mty, target, args) => InvokeVirtual(of, name, mty, simplify_expr(target), args.map(simplify_expr))

    case New(of, mty, args) => New(of, mty, args.map(simplify_expr))
    case NewArray(element, size) => NewArray(element, simplify_expr(size))

    case Ternary(ty, cmp, left, right, yes, no) => decide_comparison(cmp, simplify_expr(left), simplify_expr(right)) match
        case DefiniteYes => simplify_expr(yes)
        case DefiniteNo => simplify_expr(no)
        case DoCompare(c, l, r) => {
            val y = simplify_expr(yes)
            val n = simplify_expr(no)
            if (is_sideeffect_free(l) && is_sideeffect_free(r) && is_equivalent(yes, no)) yes
            else Ternary(ty, c, l, r, y, n)
        }

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
