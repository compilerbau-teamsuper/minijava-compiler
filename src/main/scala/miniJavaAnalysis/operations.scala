package miniJavaAnalysis.operations

import miniJavaAnalysis.IR
import miniJavaParser.AST
import miniJavaAnalysis.conversions.*
import miniJavaAnalysis.error.*
import miniJavaAnalysis.Context

def binary_numeric_operation(
    left: IR.TypedExpression,
    operator: IR.BinaryNumericOperator,
    right: IR.TypedExpression
)(ctx: Context): IR.TypedExpression = {
    val (ty, l, r) = binary_numeric_promotion(unbox(left)(ctx), unbox(right)(ctx))
    ty match
        case IR.PrimitiveType.Int => IR.IBinOp(l, operator, r)
        case IR.PrimitiveType.Long => IR.LBinOp(l, operator, r)
        case IR.PrimitiveType.Float => IR.FBinOp(l, operator, r)
        case IR.PrimitiveType.Double => IR.DBinOp(l, operator, r)
}

def binary_integral_operation(
    left: IR.TypedExpression,
    operator: IR.BinaryIntegralOperator,
    right: IR.TypedExpression
)(ctx: Context): IR.TypedExpression = {
    val l = unbox(left)(ctx)
    val r = unbox(right)(ctx)
    if l.ty == IR.PrimitiveType.Boolean && r.ty == IR.PrimitiveType.Boolean
    then 
        IR.BBinOp(l, operator, r)
    else
        binary_numeric_promotion(l, r) match
            case (IR.PrimitiveType.Int, a, b) => IR.IBinOp(a, operator, b)
            case (IR.PrimitiveType.Long, a, b) => IR.LBinOp(a, operator, b)
            case (IR.PrimitiveType.Float, a, b) => throw NonIntegral
            case (IR.PrimitiveType.Double, a, b) => throw NonIntegral
}

def relational_operation(
    left: IR.TypedExpression,
    operator: AST.Comparison,
    right: IR.TypedExpression
)(ctx: Context): IR.TypedExpression = {
    (left.ty, right.ty) match
        case (IR.ObjectType(_), IR.ObjectType(_)) => operator match
            case AST.BinaryOperator.Equals => IR.Ternary(IR.PrimitiveType.Boolean, IR.Comparison.ACmpEq, left, right, IR.BooleanLiteral(true), IR.BooleanLiteral(false))
            case _ => throw NonNumeric
        case (_, _) => {
            val l = unbox(left)(ctx)
            val r = unbox(right)(ctx)

            val (a, b) = if (l.ty == IR.PrimitiveType.Boolean && r.ty == IR.PrimitiveType.Boolean) {
                if (operator != AST.BinaryOperator.Equals) throw NonNumeric
                (l, r)
            } else {
                binary_numeric_promotion(l, r) match
                    case (IR.PrimitiveType.Int, a, b) => (a, b)
                    case (IR.PrimitiveType.Long, a, b) => (IR.LCmp(a, b), IR.IntLiteral(0))
                    case (IR.PrimitiveType.Float, a, b) => operator match
                        case AST.BinaryOperator.Equals
                        | AST.BinaryOperator.Greater
                        | AST.BinaryOperator.GreaterOrEqual => (IR.FCmpL(a, b), IR.IntLiteral(0))
                        case AST.BinaryOperator.Less
                        | AST.BinaryOperator.LessOrEqual => (IR.FCmpG(a, b), IR.IntLiteral(0))
                    case (IR.PrimitiveType.Double, a, b) => operator match
                        case AST.BinaryOperator.Equals
                        | AST.BinaryOperator.Greater
                        | AST.BinaryOperator.GreaterOrEqual => (IR.DCmpL(a, b), IR.IntLiteral(0))
                        case AST.BinaryOperator.Less
                        | AST.BinaryOperator.LessOrEqual => (IR.DCmpG(a, b), IR.IntLiteral(0))
            }

            val op = operator match
                case AST.BinaryOperator.Equals => IR.Comparison.ICmpEq
                case AST.BinaryOperator.Greater => IR.Comparison.ICmpGt
                case AST.BinaryOperator.GreaterOrEqual => IR.Comparison.ICmpGe
                case AST.BinaryOperator.Less => IR.Comparison.ICmpLt
                case AST.BinaryOperator.LessOrEqual => IR.Comparison.ICmpLe
            
            IR.Ternary(IR.PrimitiveType.Boolean, op, a, b, IR.BooleanLiteral(true), IR.BooleanLiteral(false))
        }
}

def string_concatenation(left: IR.TypedExpression, right: IR.TypedExpression): IR.TypedExpression = {
    def append(builder: IR.TypedExpression, value: IR.TypedExpression): IR.TypedExpression = {
        val ty = value.ty match
            case _: IR.PrimitiveType | IR.LangTypes.String | IR.ArrayType(IR.PrimitiveType.Char) => value.ty
            case _ => IR.LangTypes.Object

        IR.InvokeVirtual(IR.LangTypes.StringBuilder.name, "append", IR.MethodType(List(ty), IR.LangTypes.StringBuilder), builder, List(value))
    }

    val builder = left.ty match
        case IR.LangTypes.String => IR.New(IR.LangTypes.StringBuilder.name, IR.MethodType(List(IR.LangTypes.String), IR.VoidType), List(left))
        case IR.VoidType => throw new TypeMismatch(left.ty, IR.VoidType)
        case _ => append(IR.New(IR.LangTypes.StringBuilder.name, IR.MethodType(List.empty, IR.VoidType), List.empty), right)

    IR.InvokeVirtual(IR.LangTypes.StringBuilder.name, "toString", IR.MethodType(List.empty, IR.LangTypes.String), append(builder, right), List.empty)
}
