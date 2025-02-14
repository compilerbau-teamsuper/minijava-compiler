package miniJavaAnalysis
import miniJavaParser.AST
import miniJavaParser.AST.QualifiedName
import miniJavaAnalysis.IR.ObjectType
import miniJavaAnalysis.IR.TypedExpression
import miniJavaParser.AST.VarOrFieldDeclaration
import miniJavaParser.AST.Block
import miniJavaParser.AST.ExpressionStatement
import miniJavaParser.AST.IfStatement
import miniJavaParser.AST.WhileStatement
import miniJavaParser.AST.ForStatement
import miniJavaParser.AST.ReturnStatement
import miniJavaParser.AST.BreakStatement
import miniJavaParser.AST.ContinueStatement
import miniJavaParser.AST.Assignment
import miniJavaParser.AST.MethodCall

sealed trait TypeError extends Throwable

case class ReturnTypeMismatch(ty: IR.Type, expected: IR.Type) extends TypeError

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
    types: Map[QualifiedName, ObjectInfo],
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
    case _ => ???

def is_subtype(ty: IR.Type, of: IR.Type)(ctx: Context): Boolean = (ty, of) match
    case (IR.ObjectType(sub), IR.ObjectType(sup)) if sub == sup => true
    case (IR.ObjectType(sub), IR.LangTypes.Object) => true
    case (IR.ObjectType(sub), IR.ObjectType(sup)) => is_subtype(IR.ObjectType(ctx.types(sub).superclass), of)(ctx)
    case _ => false

def unbox(expr: IR.TypedExpression): Option[IR.TypedExpression] = expr.ty match
    case ty: IR.PrimitiveType => Some(expr)
    case _ => throw RuntimeException("TODO: unboxing")

def binary_numeric(
    left: IR.TypedExpression,
    operator: AST.BinaryOperator,
    right: IR.TypedExpression
): IR.TypedExpression = {
    val l = unbox(left).get
    val r = unbox(right).get
    (l.ty, r.ty) match
        case (IR.PrimitiveType.Double, IR.PrimitiveType.Double) => IR.NumericBinaryExpression(???, operator, ???)
        case _ => throw RuntimeException("TODO: error")
}

def typecheck_expr(expr: AST.Expression)(ctx: Context): IR.TypedExpression  = expr match
    case AST.BooleanLiteral(value) => IR.BooleanLiteral(value)
    case AST.IntLiteral(value) => IR.IntLiteral(value)
    case AST.ShortLiteral(value) => IR.ShortLiteral(value)
    case AST.LongLiteral(value) => IR.LongLiteral(value)
    case AST.StringLiteral(value) => IR.StringLiteral(value)
    case AST.NullLiteral => IR.NullLiteral
    case AST.BinaryExpression(left, operator, right) => {
        val l = typecheck_expr(left)(ctx)
        val r = typecheck_expr(right)(ctx)
        operator match
            case AST.BinaryOperator.Add if is_subtype(l.ty, IR.LangTypes.String)(ctx) || is_subtype(r.ty, IR.LangTypes.String)(ctx) => ???
            case AST.BinaryOperator.Add | AST.BinaryOperator.Subtract |
            AST.BinaryOperator.Multiply |
            AST.BinaryOperator.Divide |
            AST.BinaryOperator.Modulo => binary_numeric(l, operator, r)
            case AST.BinaryOperator.And | AST.BinaryOperator.Or => ???
            case AST.BinaryOperator.Equals => ???
            case AST.BinaryOperator.Greater => ???
            case AST.BinaryOperator.Xor => ???
    }
    case AST.MethodCall(target, arguments) => ???
    case AST.FieldAccess(target) => ???
    case AST.ArrayInitializer(initializers) => ???
    case AST.ArrayAccess(_, _) => ???
    case AST.FloatLiteral(value) => ???
    case AST.DoubleLiteral(_) => ???
    case AST.CharacterLiteral(_) => ???
    case AST.QualifiedName(_, _) => ???
    case AST.NewObject(_, _) => ???

def typecheck_stmts(stmts: List[AST.Statement], expected: IR.Type)(context: Context): List[IR.TypedStatement] = stmts match
    case Nil => Nil
    case head :: next => head match
        case VarOrFieldDeclaration(modifiers, fieldType, name, initializer) => ???
        case Block(statements) => ???
        case ExpressionStatement(expression) => ???
        case IfStatement(condition, thenStmt, elseStmt) => ???
        case WhileStatement(condition, body) => ???
        case ForStatement(init, condition, update, body) => ???
        case ReturnStatement(expression) => {
            val expr = expression.map(e => typecheck_expr(e)(context))
            val ty = expr.map(e => e.ty).getOrElse(IR.VoidType)
            if (!is_subtype(ty, expected)(context)) throw new ReturnTypeMismatch(ty, expected)
            IR.ReturnStatement(expr) :: typecheck_stmts(stmts, expected)(context)
        }
        case BreakStatement() => ???
        case ContinueStatement() => ???
        case Assignment(left, right) => ???
        case MethodCall(target, arguments) => ???
    
def typecheck(ast: AST.CompilationUnit): IR.CompilationUnit = {
    ast.packageDeclaration.get.name
    val names = prelude ++ ast.importDeclarations.map(decl => new RuntimeException("TODO: implement importing"))



    ???
}
