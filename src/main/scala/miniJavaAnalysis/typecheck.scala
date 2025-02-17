package miniJavaAnalysis
import miniJavaParser.AST
import miniJavaAnalysis.IR.ObjectType

sealed trait TypeError extends Throwable

case class TypeMismatch(ty: IR.Type, expected: IR.Type) extends TypeError
case object LocalVoidVariable extends TypeError
case class NoSuchField(name: String, ty: Option[IR.Type]) extends TypeError
case class NoSuchMethod(name: String, ty: Option[IR.Type]) extends TypeError
case class ParameterCountMismatch(got: Int, expected: Int) extends TypeError
case object BreakOutsideLoop extends TypeError
case object ContinueOutsideLoop extends TypeError
case object NonNumeric extends TypeError
case object NonIntegral extends TypeError

case class ObjectInfo(
    supertypes: List[IR.ObjectType],
    methods: Map[String, IR.MethodType],
    fields: Map[String, IR.Type],
    constructor: Option[IR.MethodType]
)

val prelude = Map(
    "Object" -> IR.LangTypes.Object,
    "String" -> IR.LangTypes.String,
)

val langtypes = Map(
    IR.LangTypes.Object -> ObjectInfo(List.empty, Map.empty, Map.empty, None),
    IR.LangTypes.String -> ObjectInfo(List(IR.LangTypes.Object), Map.empty, Map.empty, None)
)

case class Local(ty: IR.Type, idx: Int)

case class Context(
    names: Map[String, IR.ObjectType],
    types: Map[IR.ObjectType, ObjectInfo],
    locals: Map[String, Local],
    this_type: Option[IR.ObjectType],
    return_type: IR.Type,
    inside_loop: Boolean,
)

def resolve(ty: AST.TypeOrVoid)(names: Map[String, IR.ObjectType]): IR.Type = ty match
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
    case AST.ObjectType.Custom(name) => names(name)
    case AST.ArrayType(arrayType) => ???
    case AST.VoidType => IR.VoidType

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

def local_size(ty: IR.Type): Int = ty match
    case IR.PrimitiveType.Long | IR.PrimitiveType.Double => 2
    case IR.VoidType => throw LocalVoidVariable
    case _ => 1

def is_subtype(ty: IR.Type, of: IR.Type)(ctx: Context): Boolean = (ty, of) match
    case (sub, sup) if sub == sup => true
    case (_, IR.LangTypes.Object) => true
    case (IR.NullType, _ @ IR.ObjectType(_)) => true
    case (sub @ IR.ObjectType(_), _ @ IR.ObjectType(_)) => ctx.types(sub).supertypes.exists(sup => is_subtype(sup, of)(ctx))
    case _ => false

def unbox(expr: IR.TypedExpression): IR.TypedExpression = expr.ty match
    case ty: IR.PrimitiveType => expr
    case _ => throw RuntimeException("TODO: unboxing")

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

def binary_numeric_operation(left: IR.TypedExpression, operator: IR.BinaryNumericOperator, right: IR.TypedExpression): IR.TypedExpression = {
    val (ty, l, r) = binary_numeric_promotion(unbox(left), unbox(right))
    ty match
        case IR.PrimitiveType.Int => IR.IBinOp(l, operator, r)
        case IR.PrimitiveType.Long => IR.LBinOp(l, operator, r)
        case IR.PrimitiveType.Float => IR.FBinOp(l, operator, r)
        case IR.PrimitiveType.Double => IR.DBinOp(l, operator, r)
}

def binary_integral_operation(left: IR.TypedExpression, operator: IR.BinaryIntegralOperator, right: IR.TypedExpression): IR.TypedExpression = {
    val (ty, l, r) = binary_numeric_promotion(unbox(left), unbox(right))
    ty match
        case IR.PrimitiveType.Int => IR.IBinOp(l, operator, r)
        case IR.PrimitiveType.Long => IR.LBinOp(l, operator, r)
        case IR.PrimitiveType.Float => throw NonIntegral
        case IR.PrimitiveType.Double => throw NonIntegral
}

def relational_operation(left: IR.TypedExpression, operator: AST.Comparison, right: IR.TypedExpression): IR.TypedExpression = {
    (left.ty, right.ty) match
        case (IR.ObjectType(_), IR.ObjectType(_)) => operator match
            case AST.BinaryOperator.Equals => IR.Ternary(IR.PrimitiveType.Boolean, IR.Comparison.ACmpEq, left, right, IR.BooleanLiteral(true), IR.BooleanLiteral(false))
            case _ => throw NonNumeric
        case (_, _) => {
            val l = unbox(left)
            val r = unbox(right)
            
            val (a, b) = if (l.ty == IR.PrimitiveType.Boolean && r.ty == IR.PrimitiveType.Boolean) {
                if (operator != AST.BinaryOperator.Equals) throw NonNumeric
                (l, r)
            } else {
                binary_numeric_promotion(l, r) match
                    case (IR.PrimitiveType.Int, a, b) => (a, b)
                    case (IR.PrimitiveType.Long, a, b) => (IR.LCmp(a, b), IR.IntLiteral(0))
                    case (IR.PrimitiveType.Float, a, b) => (IR.FCmp(a, b), IR.IntLiteral(0))
                    case (IR.PrimitiveType.Double, a, b) => (IR.DCmp(a, b), IR.IntLiteral(0))
            }

            val op = operator match
                case AST.BinaryOperator.Equals => IR.Comparison.ICmpEq
                case AST.BinaryOperator.Greater => IR.Comparison.ICmpGt
            
            IR.Ternary(IR.PrimitiveType.Boolean, op, a, b, IR.BooleanLiteral(true), IR.BooleanLiteral(false))
        }
}

def typecheck_expr(expr: AST.Expression)(ctx: Context): IR.TypedExpression = expr match
    case AST.BooleanLiteral(value) => IR.BooleanLiteral(value)
    case AST.IntLiteral(value) => IR.IntLiteral(value)
    case AST.ShortLiteral(value) => IR.ShortLiteral(value)
    case AST.LongLiteral(value) => IR.LongLiteral(value)
    case AST.FloatLiteral(value) => IR.FloatLiteral(value)
    case AST.DoubleLiteral(value) => IR.DoubleLiteral(value)
    case AST.CharacterLiteral(value) => IR.CharLiteral(value)
    case AST.StringLiteral(value) => IR.StringLiteral(value)
    case AST.NullLiteral => IR.NullLiteral
    case AST.BinaryExpression(left, operator, right) => {
        val l = typecheck_expr(left)(ctx)
        val r = typecheck_expr(right)(ctx)
        operator match
            case AST.BinaryOperator.Add if is_subtype(l.ty, IR.LangTypes.String)(ctx) || is_subtype(r.ty, IR.LangTypes.String)(ctx) => ???
            case AST.BinaryOperator.Add => binary_numeric_operation(l, IR.BinaryOperator.Add, r)
            case AST.BinaryOperator.Subtract => binary_numeric_operation(l, IR.BinaryOperator.Sub, r)
            case AST.BinaryOperator.Multiply => binary_numeric_operation(l, IR.BinaryOperator.Mul, r)
            case AST.BinaryOperator.Divide => binary_numeric_operation(l, IR.BinaryOperator.Div, r)
            case AST.BinaryOperator.Modulo => binary_numeric_operation(l, IR.BinaryOperator.Mod, r)
            case AST.BinaryOperator.And => binary_integral_operation(l, IR.BinaryOperator.And, r)
            case AST.BinaryOperator.Or => binary_integral_operation(l, IR.BinaryOperator.Or, r)
            case AST.BinaryOperator.Xor => binary_integral_operation(l, IR.BinaryOperator.Xor, r)
            case AST.BinaryOperator.Equals => relational_operation(l, AST.BinaryOperator.Equals, r)
            case AST.BinaryOperator.Greater => relational_operation(l, AST.BinaryOperator.Greater, r)
    }
    case AST.MethodCall(name, target, arguments) => {
        val t = target match
            case None => ctx.this_type match
                case Some(this_type) => IR.LoadLocal(this_type, 0)
                case None => throw new NoSuchMethod(name, None)
            case Some(target) => typecheck_expr(target)(ctx)
        
        val method_type = t.ty match
            case object_type @ IR.ObjectType(_) => ctx.types(object_type).methods.get(name) match
                case Some(method_type) => method_type
                case None => throw new NoSuchField(name, Some(object_type))
            case ty => throw new NoSuchField(name, Some(ty))

        val args = arguments.map(arg => typecheck_expr(arg)(ctx))
        if (args.length != method_type.params.length) throw new ParameterCountMismatch(args.length, method_type.params.length)

        for ((arg, ty) <- args.zip(method_type.params)) {
            if (!is_subtype(arg.ty, ty)(ctx)) throw new TypeMismatch(arg.ty, ty)
        }

        IR.InvokeSpecial(method_type.ret, name, t, args)
    }
    case AST.FieldAccess(name, target) => {
        val t = target match
            case None => ctx.locals.get(name) match
                case Some(Local(ty, idx)) => return IR.LoadLocal(ty, idx)
                case None => ctx.this_type match
                    case Some(this_type) => IR.LoadLocal(this_type, 0)
                    case None => throw new NoSuchField(name, None)
            case Some(target) => typecheck_expr(target)(ctx)

        val field_type = t.ty match
            case object_type @ IR.ObjectType(_) => ctx.types(object_type).fields.get(name) match
                case Some(field_type) => field_type
                case None => throw new NoSuchField(name, Some(object_type))
            case ty => throw new NoSuchField(name, Some(ty))
        
        IR.GetField(field_type, name, t)
    }
    case AST.ArrayInitializer(initializers) => ???
    case AST.ArrayAccess(_, _) => ???
    case AST.NewObject(_) => ???
    case AST.Assignment(left, right) => {
        val r = typecheck_expr(right)(ctx)
        left match
            case AST.FieldAccess(name, target) => {
                val t = target match
                    case None => ctx.locals.get(name) match
                        case Some(Local(ty, idx)) => {
                            if (!is_subtype(r.ty, ty)(ctx)) throw new TypeMismatch(r.ty, ty)
                            return IR.DupStoreLocal(idx, r)
                        }
                        case None => ctx.this_type match
                            case Some(this_type) => IR.LoadLocal(this_type, 0)
                            case None => throw new NoSuchField(name, None)
                    case Some(target) => typecheck_expr(target)(ctx)

                val field_type = t.ty match
                    case object_type @ IR.ObjectType(_) => ctx.types(object_type).fields.get(name) match
                        case Some(field_type) => field_type
                        case None => throw new NoSuchField(name, Some(object_type))
                    case ty => throw new NoSuchField(name, Some(ty))

                if (!is_subtype(r.ty, field_type)(ctx)) throw new TypeMismatch(r.ty, field_type)
                IR.DupPutField(name, t, r)
            }
            case AST.ArrayAccess(target, index) => ???
    }

def typecheck_stmts(prev: IR.Code, stmts: List[AST.Statement])(ctx: Context): IR.Code = stmts match
    case Nil => prev
    case head :: next => head match
        case AST.VarOrFieldDeclaration(modifiers, fieldType, name, initializer) => {
            assert(modifiers.isEmpty, "TODO: maybe support modifiers")
            val ty = resolve(fieldType)(ctx.names)

            val init = typecheck_expr(initializer)(ctx)
            if (!is_subtype(init.ty, ty)(ctx)) throw new TypeMismatch(init.ty, ty)

            val idx = prev.max_locals
            val local = Local(ty, idx)

            val context = ctx.copy(locals = ctx.locals + (name -> local))
            val code = IR.Code(prev.max_locals + local_size(ty), prev.code :+ IR.ExpressionStatement(IR.DupStoreLocal(idx, init)))
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
            val code = IR.Code(celse.max_locals, prev.code :+ IR.IfStatement(IR.Comparison.ICmpNe, cond, IR.BooleanLiteral(false), cthen.code, celse.code))
            typecheck_stmts(code, next)(ctx)
        }
        case AST.WhileStatement(condition, body) => {
            val cond = typecheck_expr(condition)(ctx)
            if (!is_subtype(cond.ty, IR.PrimitiveType.Boolean)(ctx)) throw new TypeMismatch(cond.ty, IR.PrimitiveType.Boolean)
            val cbody = typecheck_stmts(IR.Code(prev.max_locals, List.empty), List(body))(ctx.copy(inside_loop = true))
            val code = IR.Code(cbody.max_locals, prev.code :+ IR.WhileStatement(IR.Comparison.ICmpNe, cond, IR.BooleanLiteral(false), cbody.code))
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
        case AST.BreakStatement() => {
            if (!ctx.inside_loop) throw BreakOutsideLoop
            val code = IR.Code(prev.max_locals, prev.code :+ IR.BreakStatement)
            typecheck_stmts(code, next)(ctx)
        }
        case AST.ContinueStatement() => {
            if (!ctx.inside_loop) throw BreakOutsideLoop
            val code = IR.Code(prev.max_locals, prev.code :+ IR.ContinueStatement)
            typecheck_stmts(code, next)(ctx)
        }

def typecheck_method(
    modifiers: List[AST.Modifier],
    name: String,
    parameters: List[String],
    ty: IR.MethodType,
    this_type: IR.ObjectType,
    body: Option[AST.Block],
)(
    names: Map[String, IR.ObjectType],
    types: Map[IR.ObjectType, ObjectInfo],
): IR.Method = {
    assert(modifiers.isEmpty, "modifiers are unsupported")

    val b = body match
        case Some(b) => b
        case None => return IR.Method(name, ty, None)

    val this_param = 1
    val (max_locals, locals) = parameters.zip(ty.params).foldLeft((this_param, Map.empty[String, Local]))((_, _) match
        case ((idx, locals), (name, ty)) => (idx + local_size(ty), locals + (name -> Local(ty, idx)))
    )
    val ctx = Context(names, types, locals, Some(this_type), ty.ret, false)
    val code = typecheck_stmts(IR.Code(max_locals, List.empty), List(b))(ctx)
    IR.Method(name, ty, Some(code))
}

def typecheck_field(
    modifiers: List[AST.Modifier],
    name: String,
    ty: IR.Type,
    this_type: IR.ObjectType,
    initializer: AST.Expression,
)(
    names: Map[String, IR.ObjectType],
    types: Map[IR.ObjectType, ObjectInfo]
) = {
    val ctx = Context(names, types, Map.empty, Some(this_type), IR.VoidType, false)
    val init = typecheck_expr(initializer)(ctx)
    if (!is_subtype(init.ty, ty)(ctx)) throw TypeMismatch(init.ty, ty)
    IR.Field(name, ty, init)
}

def typecheck(ast: AST.CompilationUnit): IR.ClassFile = {
    val pkg = ast.packageDeclaration.map(p => p.name)
    val List(decl) = ast.typeDeclarations

    val name = decl match
        case AST.ClassDeclaration(modifiers, name, superclass, interfaces, body) => name
        case AST.InterfaceDeclaration(modifiers, name, superInterfaces, body) => name
    
    val this_type = IR.ObjectType(pkg.map(p => p + '.').getOrElse("") + name)
    val names = prelude + (name -> this_type)

    val (supertypes, members) = decl match
        case AST.ClassDeclaration(modifiers, name, superclass, interfaces, body) => (names(superclass) :: interfaces.map(i => names(i)), body)
        case AST.InterfaceDeclaration(modifiers, name, superInterfaces, body) => (superInterfaces.map(i => names(i)), body)

    var info = ObjectInfo(
        supertypes,
        Map.empty,
        Map.empty,
        None
    )
    var check_fields = List.empty[Map[IR.ObjectType, ObjectInfo] => IR.Field]
    var check_methods = List.empty[Map[IR.ObjectType, ObjectInfo] => IR.Method]
    for (member <- members) member match
        case AST.ClassDeclaration(modifiers, name, superclass, interfaces, body) => ???
        case AST.InterfaceDeclaration(modifiers, name, superInterfaces, body) => ???
        case AST.MethodDeclaration(modifiers, returnType, name, parameters, body) => {
            val ty = IR.MethodType(parameters.map(p => resolve(p.paramType)(names)), resolve(returnType)(names))
            val params = parameters.map(p => p.name)
            info = info.copy(methods = info.methods + (name -> ty))
            check_methods = check_methods :+ (types => typecheck_method(modifiers, name, params, ty, this_type, body)(names, types))
        }
        case AST.VarOrFieldDeclaration(modifiers, fieldType, name, initializer) => {
            val ty = resolve(fieldType)(names)
            info = info.copy(fields = info.fields + (name -> ty))
            check_fields = check_fields :+ (types => typecheck_field(modifiers, name, ty, this_type, initializer)(names, types))
        }
        case AST.ConstructorDeclaration(modifiers, name, parameters, body) => {
            assert(info.constructor.isEmpty, "classes may only have one constructor")
            val ty = IR.MethodType(parameters.map(p => resolve(p.paramType)(names)), IR.VoidType)
            val params = parameters.map(p => p.name)
            info = info.copy(constructor = Some(ty))
            check_methods = check_methods :+ (types => typecheck_method(modifiers, "<init>", params, ty, this_type, Some(body))(names, types))
        }
        case AST.Block(statements) => ???

    val types = langtypes + (this_type -> info)

    val fields = check_fields.map(check => check(types))
    val methods = check_methods.map(check => check(types))
    IR.ClassFile(name, fields, methods)
}
