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

def is_assignable(to: IR.Type, ty: IR.Type)(ctx: Context): Boolean = (ty, to) match
    case (got, expected) if got == expected => true 
    case (from: IR.PrimitiveType, to: IR.PrimitiveType) if is_subtype(from, to)(ctx) => true
    case (from: IR.ReferenceType, to: IR.ReferenceType) if is_subtype(from, to)(ctx) => true
    case (from: IR.PrimitiveType, to: IR.ReferenceType) => is_assignable(to, boxed_ty(from))(ctx)
    case (from: IR.ReferenceType, to: IR.PrimitiveType) => unboxed_ty(from).exists(is_assignable(to, _)(ctx))
    case (got, expected) => false

def assign(ty: IR.Type, expr: IR.TypedExpression)(ctx: Context): IR.TypedExpression = (expr, ty) match {
    case (IR.IntLiteral(i), IR.PrimitiveType.Byte) if i >= -128 && i <= 127 =>
        IR.ByteLiteral(i.toByte)
    case (IR.IntLiteral(i), IR.PrimitiveType.Char) if i >= 0 && i <= 65535 =>
        IR.CharLiteral(i.toChar)
    case (IR.IntLiteral(i), IR.PrimitiveType.Short) if i >= -32768 && i <= 32767 =>
        IR.ShortLiteral(i.toShort)
    case _ => (expr.ty, ty) match {
        case (got, expected) if got == expected => expr 
        case (from: IR.PrimitiveType, to: IR.PrimitiveType) if is_subtype(from, to)(ctx) => IR.Convert(to, expr)
        case (from: IR.ReferenceType, to: IR.ReferenceType) if is_subtype(from, to)(ctx) => IR.Convert(to, expr)
        case (from: IR.PrimitiveType, to: IR.ReferenceType) => {
            val name = boxed_ty(from).name
            val boxed = IR.New(name, IR.MethodType(List(from), IR.VoidType), List(expr))
            assign(ty, boxed)(ctx)
        }
        case (from: IR.ReferenceType, to: IR.PrimitiveType) => assign(ty, unbox(expr))(ctx)
        case (got, expected) => throw TypeMismatch(got, expected)
    }
}

private def boxed_ty(ty: IR.PrimitiveType): IR.ObjectType = ty match
    case IR.PrimitiveType.Boolean => IR.LangTypes.Boolean
    case IR.PrimitiveType.Byte => IR.LangTypes.Byte
    case IR.PrimitiveType.Short => IR.LangTypes.Short
    case IR.PrimitiveType.Char => IR.LangTypes.Character
    case IR.PrimitiveType.Int => IR.LangTypes.Integer
    case IR.PrimitiveType.Long => IR.LangTypes.Long
    case IR.PrimitiveType.Float => IR.LangTypes.Float
    case IR.PrimitiveType.Double => IR.LangTypes.Double

private def unboxed_ty(ty: IR.Type): Option[IR.PrimitiveType] = ty match
    case IR.LangTypes.Boolean => Some(IR.PrimitiveType.Boolean)
    case IR.LangTypes.Byte => Some(IR.PrimitiveType.Byte)
    case IR.LangTypes.Short => Some(IR.PrimitiveType.Short)
    case IR.LangTypes.Character => Some(IR.PrimitiveType.Char)
    case IR.LangTypes.Integer => Some(IR.PrimitiveType.Int)
    case IR.LangTypes.Long => Some(IR.PrimitiveType.Long)
    case IR.LangTypes.Float => Some(IR.PrimitiveType.Float)
    case IR.LangTypes.Double => Some(IR.PrimitiveType.Double)
    case _ => None

def unbox(expr: IR.TypedExpression): IR.TypedExpression = {
    val (of, name, ty) = expr.ty match
        case _: IR.PrimitiveType => return expr
        case IR.LangTypes.Boolean => (IR.LangTypes.Boolean, "booleanValue", IR.PrimitiveType.Boolean)
        case IR.LangTypes.Byte => (IR.LangTypes.Byte, "byteValue", IR.PrimitiveType.Byte)
        case IR.LangTypes.Short => (IR.LangTypes.Short, "shortValue", IR.PrimitiveType.Short)
        case IR.LangTypes.Character => (IR.LangTypes.Character, "charValue", IR.PrimitiveType.Char)
        case IR.LangTypes.Integer => (IR.LangTypes.Integer, "intValue", IR.PrimitiveType.Int)
        case IR.LangTypes.Long => (IR.LangTypes.Long, "longValue", IR.PrimitiveType.Long)
        case IR.LangTypes.Float => (IR.LangTypes.Float, "floatValue", IR.PrimitiveType.Float)
        case IR.LangTypes.Double => (IR.LangTypes.Double, "doubleValue", IR.PrimitiveType.Double)
        case t => throw ExpectedPrimitive(t)

    IR.InvokeVirtual(of.name, name, IR.MethodType(List.empty, ty), expr, List.empty)
}

def unary_numeric_promotion(v: IR.TypedExpression): IR.TypedExpression = unbox(v).ty match
    case IR.PrimitiveType.Boolean => throw NonNumeric
    case _ => v

def binary_numeric_promotion(
    l: IR.TypedExpression,
    r: IR.TypedExpression
): (IR.NumericOperandType, IR.TypedExpression, IR.TypedExpression) = (l.ty, r.ty) match
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
