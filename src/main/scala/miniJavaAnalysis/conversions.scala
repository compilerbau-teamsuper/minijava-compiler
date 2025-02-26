package miniJavaAnalysis.conversions

import miniJavaAnalysis.IR
import miniJavaAnalysis.error.*
import miniJavaAnalysis.Context

def is_subtype(ty: IR.Type, of: IR.Type)(ctx: Context): Boolean = ty == of || ((ty, of) match
    case (IR.PrimitiveType.Byte, IR.PrimitiveType.Short)
    | (_: IR.IntLikeType, IR.PrimitiveType.Int)
    | (_: IR.IntLikeType, IR.PrimitiveType.Long)
    | (_: IR.IntLikeType, IR.PrimitiveType.Float)
    | (_: IR.IntLikeType, IR.PrimitiveType.Double)
    | (IR.PrimitiveType.Long, IR.PrimitiveType.Float)
    | (IR.PrimitiveType.Long, IR.PrimitiveType.Double)
    | (IR.PrimitiveType.Float, IR.PrimitiveType.Double) => true
    case (IR.NullType, _: IR.ReferenceType)
    | (_: IR.ReferenceType, IR.LangTypes.Object) => true
    case (t: IR.ObjectType, _: IR.ObjectType) => (ctx.types(t).superclass.toList ++ ctx.types(t).interfaces).exists(is_subtype(_, of)(ctx))
    case (IR.ArrayType(t: IR.ReferenceType), IR.ArrayType(o: IR.ReferenceType)) => is_subtype(t, o)(ctx)
    case _ => false)

def assign(ty: IR.Type, expr: IR.TypedExpression)(ctx: Context): IR.TypedExpression = (expr.ty, ty) match
    case (got, expected) if got == expected => expr
    case (from: IR.PrimitiveType, to: IR.PrimitiveType) if is_subtype(from, to)(ctx) => IR.Convert(to, expr)
    case (from: IR.ReferenceType, to: IR.ReferenceType) if is_subtype(from, to)(ctx) => IR.Convert(to, expr)
    case (from: IR.PrimitiveType, to: IR.ReferenceType) => assign(ty, box(expr))(ctx)
    case (from: IR.ReferenceType, to: IR.PrimitiveType) => assign(ty, unbox(expr)(ctx))(ctx)
    case (got, expected) => throw TypeMismatch(got, expected)

private def box(expr: IR.TypedExpression): IR.TypedExpression = {
    val name = expr.ty match
        case IR.PrimitiveType.Boolean => IR.LangTypes.Boolean
        case IR.PrimitiveType.Byte => IR.LangTypes.Byte
        case IR.PrimitiveType.Short => IR.LangTypes.Short
        case IR.PrimitiveType.Char => IR.LangTypes.Character
        case IR.PrimitiveType.Int => IR.LangTypes.Integer
        case IR.PrimitiveType.Long => IR.LangTypes.Long
        case IR.PrimitiveType.Float => IR.LangTypes.Float
        case IR.PrimitiveType.Double => IR.LangTypes.Double
        case _ => ???
    
    IR.New(name.name, IR.MethodType(List(expr.ty), IR.VoidType), List(expr))
}

def unbox(expr: IR.TypedExpression)(ctx: Context): IR.TypedExpression = {
    val (of, name, ty) = expr.ty match
        case _: IR.PrimitiveType => return expr
        case t if is_subtype(t, IR.LangTypes.Boolean)(ctx) => (IR.LangTypes.Boolean, "booleanValue", IR.PrimitiveType.Boolean)
        case t if is_subtype(t, IR.LangTypes.Byte)(ctx) => (IR.LangTypes.Byte, "byteValue", IR.PrimitiveType.Byte)
        case t if is_subtype(t, IR.LangTypes.Short)(ctx) => (IR.LangTypes.Short, "shortValue", IR.PrimitiveType.Short)
        case t if is_subtype(t, IR.LangTypes.Character)(ctx) => (IR.LangTypes.Character, "charValue", IR.PrimitiveType.Char)
        case t if is_subtype(t, IR.LangTypes.Integer)(ctx) => (IR.LangTypes.Integer, "intValue", IR.PrimitiveType.Int)
        case t if is_subtype(t, IR.LangTypes.Long)(ctx) => (IR.LangTypes.Long, "longValue", IR.PrimitiveType.Long)
        case t if is_subtype(t, IR.LangTypes.Float)(ctx) => (IR.LangTypes.Float, "floatValue", IR.PrimitiveType.Float)
        case t if is_subtype(t, IR.LangTypes.Double)(ctx) => (IR.LangTypes.Double, "doubleValue", IR.PrimitiveType.Double)
        case t => throw ExpectedPrimitive(t)

    IR.InvokeVirtual(of.name, name, IR.MethodType(List.empty, ty), expr, List.empty)
}

def unary_numeric_promotion(v: IR.TypedExpression)(ctx: Context): IR.TypedExpression = unbox(v)(ctx).ty match
    case IR.PrimitiveType.Boolean => throw NonNumeric
    case _ => v

def binary_numeric_promotion(
    l: IR.TypedExpression,
    r: IR.TypedExpression
): (IR.NumericOperandType, IR.TypedExpression, IR.TypedExpression) = (r.ty, l.ty) match
    case (lty: IR.PrimitiveType, rty: IR.PrimitiveType) => (lty, rty) match
        case (IR.PrimitiveType.Boolean, _)
        | (_, IR.PrimitiveType.Boolean) => throw NonNumeric
        case (IR.PrimitiveType.Double, IR.PrimitiveType.Double) => (IR.PrimitiveType.Double, l, r)
        case (IR.PrimitiveType.Double, _) => (IR.PrimitiveType.Double, l, IR.Convert(IR.PrimitiveType.Double, r))
        case (_, IR.PrimitiveType.Double) => (IR.PrimitiveType.Double, IR.Convert(IR.PrimitiveType.Double, l), r)
        case (IR.PrimitiveType.Float, IR.PrimitiveType.Float) => (IR.PrimitiveType.Float, l, r)
        case (IR.PrimitiveType.Float, _) => (IR.PrimitiveType.Float, l, IR.Convert(IR.PrimitiveType.Float, r))
        case (_, IR.PrimitiveType.Float) => (IR.PrimitiveType.Float, IR.Convert(IR.PrimitiveType.Float, l), r)
        case (IR.PrimitiveType.Long, IR.PrimitiveType.Long) => (IR.PrimitiveType.Long, l, r)
        case (IR.PrimitiveType.Long, _) => (IR.PrimitiveType.Long, l, IR.Convert(IR.PrimitiveType.Long, r))
        case (_, IR.PrimitiveType.Long) => (IR.PrimitiveType.Long, IR.Convert(IR.PrimitiveType.Long, l), r)
        case (_, _) => (IR.PrimitiveType.Int, l, r)
    case _ => throw NonNumeric
