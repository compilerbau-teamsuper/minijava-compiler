package miniJavaAnalysis
import miniJavaParser.AST
import miniJavaParser.AST.QualifiedName
import miniJavaAnalysis.IR.ObjectType

sealed trait TypeError extends Throwable

case class ObjectInfo(
    name: QualifiedName,
    superclass: QualifiedName,
    methods: Map[String, MethodType],
    fields: Map[String, IR.Type],
)
case class MethodType(params: List[IR.Type], ret: IR.Type)

val prelude = Map(
    "Object" -> IR.LangTypes.Object,
    "String" -> IR.LangTypes.String,
)

case class Context(
    
)

def stringify(ty: IR.Type): String = ty match
    case ty: IR.PrimitiveType => ty match
        case IR.PrimitiveType.Int => "int"
        case IR.PrimitiveType.Boolean => "boolean"
        case IR.PrimitiveType.Char => "char"
        case IR.PrimitiveType.Double => "double"
        case IR.PrimitiveType.Float => "float"
        case IR.PrimitiveType.Long => "long"
        case IR.PrimitiveType.Short => "short"
        case IR.PrimitiveType.Byte => "byte"
    case _ => throw RuntimeException("TODO")

def is_subtype(ctx: Map[QualifiedName, ObjectInfo], ty: IR.Type, of: IR.Type): Boolean = (ty, of) match
    case (IR.ObjectType(sub), IR.ObjectType(sup)) if sub == sup => true
    case (IR.ObjectType(sub), IR.LangTypes.Object) => false
    case (IR.ObjectType(sub), IR.ObjectType(sup)) => is_subtype(ctx, IR.ObjectType(ctx(sub).superclass), of)
    case _ => false

def unbox(expr: IR.TypedExpression[IR.Type]): Option[IR.TypedExpression[IR.PrimitiveType]] = expr.ty match
    case ty: IR.PrimitiveType => Some(IR.Conversion(ty, expr))
    case _ => throw RuntimeException("TODO: unboxing")

def binary_numeric(
    left: IR.TypedExpression[IR.Type],
    operator: AST.BinaryOperator,
    right: IR.TypedExpression[IR.Type]
): IR.TypedExpression[IR.NumericOperandType] = {
    val l = unbox(left).get
    val r = unbox(right).get
    (l.ty, r.ty) match
        case (IR.PrimitiveType.Double, IR.PrimitiveType.Double) => IR.NumericBinaryExpression(???, operator, ???)
        case _ => throw RuntimeException("TODO: error")
}

def typecheck_expr(
    names: Map[String, QualifiedName],
    types: Map[QualifiedName, ObjectInfo],
)(expr: AST.Expression): IR.TypedExpression[IR.Type]  = expr match
    case literal: AST.Literal => literal match
        case AST.IntLiteral(value) => value match
            case _ if value.isValidByte => IR.ByteLiteral(value.toByte)
            case _ if value.isValidShort => IR.ShortLiteral(value.toShort)
            case _ if value.isValidInt => IR.IntLiteral(value.toInt)
            case _ => IR.LongLiteral(value)
        case AST.StringLiteral(value) => IR.StringLiteral(value)
        case AST.BooleanLiteral(value) => IR.BooleanLiteral(value)
        case AST.NullLiteral => IR.NullLiteral
    case AST.BinaryExpression(left, operator, right) => {
        val l = typecheck_expr(names, types)(left)
        val r = typecheck_expr(names, types)(right)
        operator match
            case AST.BinaryOperator.Add if is_subtype(types, l.ty, IR.LangTypes.String) || is_subtype(types, r.ty, IR.LangTypes.String) => {
                throw RuntimeException("TODO: string concatenation")
            }
            case AST.BinaryOperator.Add | AST.BinaryOperator.Subtract |
            AST.BinaryOperator.Multiply |
            AST.BinaryOperator.Divide |
            AST.BinaryOperator.Modulo => binary_numeric(l, operator, r)
            case AST.BinaryOperator.And | AST.BinaryOperator.Or => throw RuntimeException("TODO")
            case AST.BinaryOperator.Equals |
            AST.BinaryOperator.NotEquals => throw RuntimeException("TODO")

            case AST.BinaryOperator.Greater => throw RuntimeException("TODO")
            case AST.BinaryOperator.GreaterOrEqual => throw RuntimeException("TODO")
            case AST.BinaryOperator.Less => throw RuntimeException("TODO")
            case AST.BinaryOperator.LessOrEqual => throw RuntimeException("TODO")
    }
    case AST.UnaryExpression(operator, operand) => throw RuntimeException("TODO")
    case AST.MethodCall(target, arguments) => throw RuntimeException("TODO")
    case AST.FieldAccess(target) => throw RuntimeException("TODO")
    case AST.ArrayInitializer(initializers) => throw RuntimeException("TODO")

def typecheck(ast: AST.CompilationUnit): IR.CompilationUnit = {
    ast.packageDeclaration.get.name
    val names = prelude ++ ast.importDeclarations.map(decl => new RuntimeException("TODO: implement importing"))



    throw RuntimeException("TODO")
}
