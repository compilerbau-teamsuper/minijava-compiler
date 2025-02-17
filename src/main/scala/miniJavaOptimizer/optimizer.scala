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
    case NumericBinaryExpression(left, operator, right) => operator match 
        case Divide | Modulo => false
        case _ => is_sideeffect_free(left) && is_sideeffect_free(right)
    case _ => false

def simplify_expr(expr: TypedExpression): TypedExpression = expr match
    case Conversion(to, value) => {
        val v = simplify_expr(value)
        // TODO: more simplification.
        if (v.ty == to) v else Conversion(to, v)
    }
    case NumericBinaryExpression(left, operator, right) => {
        val l = simplify_expr(left)
        val r = simplify_expr(right)
        (l, r) match
            case (IntLiteral(i1), IntLiteral(i2)) => operator match
                case Add => IntLiteral(i1 + i2)
                case Subtract => IntLiteral(i1 - i2)
                case Multiply => IntLiteral(i1 * i2)
                case Divide => if (i2 != 0) IntLiteral(i1 / i2) else NumericBinaryExpression(l, Divide, r)
                case Modulo => if (i2 != 0) IntLiteral(i1 % i2) else NumericBinaryExpression(l, Modulo, r)
                case And => IntLiteral(i1 & i2)
                case Or => IntLiteral(i1 | i2)
                case Xor => IntLiteral(i1 ^ i2)
                case Equals => BooleanLiteral(i1 == i2)
                case Greater => BooleanLiteral(i1 > i2)
            case (LongLiteral(l1), LongLiteral(l2)) => operator match
                case Add => LongLiteral(l1 + l2)
                case Subtract => LongLiteral(l1 - l2)
                case Multiply => LongLiteral(l1 * l2)
                case Divide => if (l2 != 0) LongLiteral(l1 / l2) else NumericBinaryExpression(l, Divide, r)
                case Modulo => if (l2 != 0) LongLiteral(l1 % l2) else NumericBinaryExpression(l, Modulo, r)
                case And => LongLiteral(l1 & l2)
                case Or => LongLiteral(l1 | l2)
                case Xor => LongLiteral(l1 ^ l2)
                case Equals => BooleanLiteral(l1 == l2)
                case Greater => BooleanLiteral(l1 > l2)
            case _ => NumericBinaryExpression(l, operator, r)
    }
    case _ => expr

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
