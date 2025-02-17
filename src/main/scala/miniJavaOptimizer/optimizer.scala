package miniJavaOptimizer

import miniJavaAnalysis.IR.*
import miniJavaParser.AST.BinaryOperator.*

def is_sideeffect_free(expr: TypedExpression): Boolean = expr match
    case ByteLiteral(_)
    | ShortLiteral(_)
    | IntLiteral(_)
    | LongLiteral(_)
    | StringLiteral(_)
    | BooleanLiteral(_)
    | NullLiteral
    | LoadLocal(_, _) => true
    case I2B(value) => is_sideeffect_free(value)
    case I2S(value) => is_sideeffect_free(value)
    case I2C(value) => is_sideeffect_free(value)
    case I2L(value) => is_sideeffect_free(value)
    case I2F(value) => is_sideeffect_free(value)
    case I2D(value) => is_sideeffect_free(value)
    case L2I(value) => is_sideeffect_free(value)
    case L2F(value) => is_sideeffect_free(value)
    case L2D(value) => is_sideeffect_free(value)
    case F2I(value) => is_sideeffect_free(value)
    case F2L(value) => is_sideeffect_free(value)
    case F2D(value) => is_sideeffect_free(value)
    case D2I(value) => is_sideeffect_free(value)
    case D2L(value) => is_sideeffect_free(value)
    case D2F(value) => is_sideeffect_free(value)
    case IAdd(left, right) => is_sideeffect_free(left) && is_sideeffect_free(right)
    case LAdd(left, right) => is_sideeffect_free(left) && is_sideeffect_free(right)
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
    case I2B(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => I2B(v)
            case Some(i) => ByteLiteral(i.toByte)
    }
    case I2S(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => I2S(v)
            case Some(i) => ShortLiteral(i.toShort)
    }
    case I2C(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => I2C(v)
            case Some(i) => CharacterLiteral(i.toChar)
    }
    case I2L(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => I2L(v)
            case Some(i) => LongLiteral(i)
    }
    case I2F(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => I2F(v)
            case Some(i) => FloatLiteral(i)
    }
    case I2D(value) => {
        val v = simplify_expr(value)
        constant_int(v) match
            case None => I2D(v)
            case Some(i) => DoubleLiteral(i)
    }
    case L2I(value) => simplify_expr(value) match
        case LongLiteral(value) => IntLiteral(value.toInt)
        case expr => expr
    case L2F(value) => simplify_expr(value) match
        case LongLiteral(value) => FloatLiteral(value.toFloat)
        case expr => expr
    case L2D(value) => simplify_expr(value) match
        case LongLiteral(value) => DoubleLiteral(value.toDouble)
        case expr => expr
    case F2I(value) => simplify_expr(value) match
        case FloatLiteral(value) => IntLiteral(value.toInt)
        case expr => expr
    case F2L(value) => simplify_expr(value) match
        case FloatLiteral(value) => LongLiteral(value.toLong)
        case expr => expr
    case F2D(value) => simplify_expr(value) match
        case FloatLiteral(value) => DoubleLiteral(value.toDouble)
        case expr => expr
    case D2I(value) => simplify_expr(value) match
        case DoubleLiteral(value) => IntLiteral(value.toInt)
        case expr => expr
    case D2L(value) => simplify_expr(value) match
        case DoubleLiteral(value) => LongLiteral(value.toLong)
        case expr => expr
    case D2F(value) => simplify_expr(value) match
        case DoubleLiteral(value) => FloatLiteral(value.toFloat)
        case expr => expr

    case IAdd(left, right) => {
        val l = simplify_expr(left)
        val r = simplify_expr(right)
        (constant_int(l), constant_int(r)) match
            case (Some(l), Some(r)) => IntLiteral(l + r)
            case _ => IAdd(l, r)
    }
    case LAdd(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (LongLiteral(l), LongLiteral(r)) => LongLiteral(l + r)
        case (l, r) => LAdd(l, r)
    case FAdd(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (FloatLiteral(l), FloatLiteral(r)) => FloatLiteral(l + r)
        case (l, r) => FAdd(l, r)
    case DAdd(left, right) => (simplify_expr(left), simplify_expr(right)) match
        case (DoubleLiteral(l), DoubleLiteral(r)) => DoubleLiteral(l + r)
        case (l, r) => DAdd(l, r)

    case LoadLocal(_, _) => expr
    case DupStoreLocal(index, value) => DupStoreLocal(index, simplify_expr(value))
    case GetField(field_ty, name, target) => GetField(field_ty, name, simplify_expr(target))
    case DupPutField(name, target, value) => DupPutField(name, simplify_expr(target), simplify_expr(value))
    case InvokeSpecial(return_ty, name, target, args) => InvokeSpecial(return_ty, name, simplify_expr(target), args.map(simplify_expr))

def simplify_stmt(stmt: TypedStatement): List[TypedStatement] = stmt match
    case ReturnStatement(expression) => List(ReturnStatement(expression.map(simplify_expr)))
    case ExpressionStatement(expression) => {
        val expr = simplify_expr(expression)
        if (is_sideeffect_free(expr)) List.empty else List(ExpressionStatement(expr))
    }
    case IfStatement(condition, thenStmt, elseStmt) => {
        val cond = simplify_expr(condition)
        cond match
            case BooleanLiteral(true) => thenStmt.flatMap(simplify_stmt)
            case BooleanLiteral(false) => elseStmt.flatMap(simplify_stmt)
            case _ => {
                val thens = thenStmt.flatMap(simplify_stmt)
                val elses = elseStmt.flatMap(simplify_stmt)
                (thens.isEmpty, elses.isEmpty) match
                    case (true, true) => if (is_sideeffect_free(cond)) List.empty else List(ExpressionStatement(cond))
                    // TODO: case (0, _) => List(IfStatement(simplify_expr(Negate(cond)), elses, List.empty))
                    case _ => List(IfStatement(cond, thens, elses))
            }
    }
    case WhileStatement(condition, body) => {
        val cond = simplify_expr(condition)
        cond match
            case BooleanLiteral(false) => List.empty
            case _ => {
                val b = body.flatMap(simplify_stmt)
                if (b.isEmpty && is_sideeffect_free(cond)) List.empty else List(WhileStatement(cond, b))
            }
    }
    case BreakStatement => List(BreakStatement)
    case ContinueStatement => List(ContinueStatement)

def optimize(code: Code): Code = {
    code.copy(code = code.code.flatMap(simplify_stmt))
}
