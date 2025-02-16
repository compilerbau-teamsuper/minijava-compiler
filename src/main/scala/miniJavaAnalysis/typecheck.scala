package miniJavaAnalysis
import miniJavaParser.AST

sealed trait TypeError extends Throwable

case class TypeMismatch(ty: IR.Type, expected: IR.Type) extends TypeError
case object LocalVoidVariable extends TypeError

case class ObjectInfo(
    name: String,
    superclass: String,
    methods: Map[String, MethodType],
    fields: Map[String, IR.Type],
)
case class MethodType(params: List[IR.Type], ret: IR.Type)

val prelude = Map(
    "Object" -> IR.LangTypes.Object,
    "String" -> IR.LangTypes.String,
)

sealed trait Variable
case class LocalVariable(ty: IR.Type, idx: Int) extends Variable
case class ClassField(ty: IR.Type, name: String) extends Variable

case class Context(
    types: Map[String, ObjectInfo],
    variables: Map[String, Variable],
    return_type: IR.Type,
)

def resolve(ty: AST.Type)(ctx: Context): IR.Type = ty match
    case AST.PrimitiveType.Int => IR.PrimitiveType.Int
    case AST.PrimitiveType.Boolean => IR.PrimitiveType.Boolean
    case AST.PrimitiveType.Char => IR.PrimitiveType.Char
    case AST.PrimitiveType.Double => IR.PrimitiveType.Double
    case AST.PrimitiveType.Float => IR.PrimitiveType.Float
    case AST.PrimitiveType.Long => IR.PrimitiveType.Long
    case AST.PrimitiveType.Short => IR.PrimitiveType.Short
    case AST.ObjectType.String => IR.ObjectType("java.lang.String")
    case AST.ObjectType.Short => ???
    case AST.ObjectType.Long => ???
    case AST.ObjectType.Integer => ???
    case AST.ObjectType.Float => ???
    case AST.ObjectType.Double => ???
    case AST.ObjectType.Boolean => ???
    case AST.ObjectType.Character => ???
    case AST.ObjectType.Custom(name) => ???
    case AST.ArrayType(arrayType) => ???

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

def typecheck_expr(expr: AST.Expression)(ctx: Context): IR.TypedExpression = expr match
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
    case AST.MethodCall(name, target, arguments) => ???
    case AST.FieldAccess(name, target) => target match
        case None => ctx.variables(name) match
            case LocalVariable(ty, idx) => IR.LoadLocal(ty, idx)
            case ClassField(ty, name) => ???
        case Some(value) => ???
    case AST.ArrayInitializer(initializers) => ???
    case AST.ArrayAccess(_, _) => ???
    case AST.FloatLiteral(value) => ???
    case AST.DoubleLiteral(_) => ???
    case AST.CharacterLiteral(_) => ???
    case AST.NewObject(_) => ???
    case AST.Assignment(left, right) => {
        val r = typecheck_expr(right)(ctx)
        left match
            case AST.FieldAccess(name, None) => ctx.variables(name) match
                case LocalVariable(ty, idx) => {
                    if (!is_subtype(r.ty, ty)(ctx)) throw new TypeMismatch(r.ty, ty)
                    IR.DupStoreLocal(idx, r)
                }
                case ClassField(ty, name) => ???

            case AST.FieldAccess(name, Some(target)) => ???
            case AST.ArrayAccess(target, index) => ???
    }

def typecheck_stmts(prev: IR.Code, stmts: List[AST.Statement])(ctx: Context): IR.Code = stmts match
    case Nil => prev
    case head :: next => head match
        case AST.VarOrFieldDeclaration(modifiers, fieldType, name, initializer) => {
            assert(modifiers.isEmpty, "TODO: maybe support modifiers")
            val ty = resolve(fieldType)(ctx)

            val init = typecheck_expr(initializer)(ctx)
            if (!is_subtype(init.ty, ty)(ctx)) throw new TypeMismatch(init.ty, ty)

            val idx = prev.max_locals
            val variable = LocalVariable(ty, idx)
            val locals = ty match
                case IR.PrimitiveType.Long | IR.PrimitiveType.Double => 2
                case IR.VoidType => throw LocalVoidVariable
                case _ => 1

            val context = Context(ctx.types, ctx.variables + (name -> variable), ctx.return_type)
            val code = IR.Code(prev.max_locals + locals, prev.code :+ IR.ExpressionStatement(IR.DupStoreLocal(idx, init)))
            typecheck_stmts(code, next)(context)
        }
        case AST.Block(statements) => {
            val block = typecheck_stmts(prev, statements)(ctx)
            typecheck_stmts(block, next)(ctx)
        }
        case AST.ExpressionStatement(expression) => {
            val expr = typecheck_expr(expression)(ctx)
            val code = IR.Code(prev.max_locals, prev.code :+ IR.ExpressionStatement(expr))
            typecheck_stmts(code, next)(ctx)
        }
        case AST.IfStatement(condition, thenStmt, elseStmt) => {
            val cond = typecheck_expr(condition)(ctx)
            if (!is_subtype(cond.ty, IR.PrimitiveType.Boolean)(ctx)) throw new TypeMismatch(cond.ty, IR.PrimitiveType.Boolean)
            val cthen = typecheck_stmts(IR.Code(prev.max_locals, List.empty), List(thenStmt))(ctx)
            val celse = typecheck_stmts(IR.Code(cthen.max_locals, List.empty), elseStmt.toList)(ctx)
            val code = IR.Code(celse.max_locals, prev.code :+ IR.IfStatement(cond, cthen.code, celse.code))
            typecheck_stmts(code, next)(ctx)
        }
        case AST.WhileStatement(condition, body) => {
            val cond = typecheck_expr(condition)(ctx)
            if (!is_subtype(cond.ty, IR.PrimitiveType.Boolean)(ctx)) throw new TypeMismatch(cond.ty, IR.PrimitiveType.Boolean)
            val cbody = typecheck_stmts(IR.Code(prev.max_locals, List.empty), List(body))(ctx)
            val code = IR.Code(cbody.max_locals, prev.code :+ IR.WhileStatement(cond, cbody.code))
            typecheck_stmts(code, next)(ctx)
        }
        case AST.ForStatement(init, condition, update, body) => ???
        case AST.ReturnStatement(expression) => {
            val expr = expression.map(e => typecheck_expr(e)(ctx))
            val ty = expr.map(e => e.ty).getOrElse(IR.VoidType)
            if (!is_subtype(ty, ctx.return_type)(ctx)) throw new TypeMismatch(ty, ctx.return_type)
            val code = IR.Code(prev.max_locals, prev.code :+ IR.ReturnStatement(expr))
            typecheck_stmts(code, next)(ctx)
        }
        case AST.BreakStatement() => ???
        case AST.ContinueStatement() => ???

def typecheck(ast: AST.CompilationUnit): IR.CompilationUnit = {
    ast.packageDeclaration.get.name
    val names = prelude ++ ast.importDeclarations.map(decl => new RuntimeException("TODO: implement importing"))



    ???
}
