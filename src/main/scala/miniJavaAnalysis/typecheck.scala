package miniJavaAnalysis
import miniJavaParser.AST
import miniJavaAnalysis.error.*
import miniJavaAnalysis.resolve.{PackageName, Root, Resolver}
import miniJavaParser.AST.ConstructorInvocation

case class ObjectInfo(
    superclass: Option[IR.ObjectType],
    interfaces: List[IR.ObjectType],
    methods: Map[String, MethodInfo],
    fields: Map[String, FieldInfo],
    constructors: Map[List[IR.Type], ConstructorInfo],
)

case class FieldInfo(mod: IR.Modifiers, ty: IR.Type)
case class MethodInfo(mod: IR.Modifiers, ty: IR.MethodType)
case class ConstructorInfo(mod: IR.Modifiers)

val prelude = Map(
    "Object" -> IR.LangTypes.Object,
    "String" -> IR.LangTypes.String,
)

val langtypes = Map(
    IR.LangTypes.Object -> ObjectInfo(
        None,
        List.empty,
        Map.empty,
        Map.empty,
        Map(List.empty -> ConstructorInfo(IR.Modifiers.empty)),
    ),
    IR.LangTypes.String -> ObjectInfo(
        Some(IR.LangTypes.Object),
        List.empty,
        Map.empty,
        Map.empty,
        Map.empty,
    )
)

case class Local(fin: Boolean, ty: IR.Type, idx: Int)

case class Context(
    resolver: Resolver,
    types: Map[IR.ObjectType, ObjectInfo],
    locals: Map[String, Local],
    this_type: IR.ObjectType,
    return_type: IR.Type,
    is_static: Boolean,
    inside_loop: Boolean,
)

def resolve_ty(ty: AST.TypeOrVoid)(resolver: Resolver): IR.Type = ty match
    case AST.PrimitiveType.Int => IR.PrimitiveType.Int
    case AST.PrimitiveType.Boolean => IR.PrimitiveType.Boolean
    case AST.PrimitiveType.Char => IR.PrimitiveType.Char
    case AST.PrimitiveType.Double => IR.PrimitiveType.Double
    case AST.PrimitiveType.Float => IR.PrimitiveType.Float
    case AST.PrimitiveType.Long => IR.PrimitiveType.Long
    case AST.PrimitiveType.Short => IR.PrimitiveType.Short
    case AST.ObjectType(name) => IR.ObjectType(resolver.resolve(name))
    case AST.ArrayType(arrayType) => ???
    case AST.VoidType => IR.VoidType

def local_size(ty: IR.Type): Int = ty match
    case IR.PrimitiveType.Long | IR.PrimitiveType.Double => 2
    case IR.VoidType => throw LocalVoidVariable
    case _ => 1

def is_subtype(ty: IR.Type, of: IR.Type)(ctx: Context): Boolean = (ty, of) match
    case (sub, sup) if sub == sup => true
    case (_, IR.LangTypes.Object) => true
    case (IR.NullType, _ @ IR.ObjectType(_)) => true
    case (sub @ IR.ObjectType(_), _ @ IR.ObjectType(_)) => ???
    case _ => false

def assign(ty: IR.Type, expr: IR.TypedExpression): IR.TypedExpression = expr.ty match
    case t if t == ty => expr
    case _ => ???

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

def get_field(target: IR.TypedExpression, name: String)(ctx: Context): IR.GetField = {
    target.ty match
        case c: IR.ObjectType => ctx.types(c).fields.get(name) match
            case Some(FieldInfo(mod, ty)) => {
                if (mod.stat) throw new StaticMember(c.name, name)
                IR.GetField(ty, c.name, name, target)
            }
            case None => throw NoSuchField(name, Some(target.ty))
        case _ => throw NoSuchField(name, Some(target.ty))
}

def put_field(target: IR.TypedExpression, name: String, value: IR.TypedExpression)(ctx: Context): IR.DupPutField = {
    target.ty match
        case c: IR.ObjectType => ctx.types(c).fields.get(name) match
            case Some(FieldInfo(mod, ty)) => {
                if (mod.stat) throw StaticMember(c.name, name)
                if (mod.fin) throw ModifyFinal(name, Some(c))
                IR.DupPutField(c.name, name, target, assign(ty, value))
            }
            case None => throw NoSuchField(name, Some(c))
        case _ => throw NoSuchField(name, Some(target.ty))
}

type AccessType = IR.GetField | IR.GetStatic | IR.LoadLocal
def resolve_name(name: AST.AmbiguousName)(ctx: Context): IR.ObjectType | IR.GetField | IR.GetStatic | IR.LoadLocal = {
    ctx.locals.get(name.components.head) match
        case Some(Local(_, ty, idx)) => name.components.tail.foldLeft(IR.LoadLocal(ty, idx) : AccessType)(get_field(_, _)(ctx))
        case None => ctx.types(ctx.this_type).fields.get(name.components.head) match
            case Some(FieldInfo(mod, ty)) => if (mod.stat) {
                name.components.tail.foldLeft(
                    IR.GetStatic(ty, ctx.this_type.name, name.components.head): AccessType
                )(get_field(_, _)(ctx))
            } else {
                if (ctx.is_static) throw new NonStaticMember(ctx.this_type.name, name.components.head)
                name.components.tail.foldLeft(
                    IR.GetField(ty, ctx.this_type.name, name.components.head, IR.LoadLocal(ctx.this_type, 0)): AccessType
                )(get_field(_, _)(ctx))
            }
            case None => ctx.resolver.resolve_split(name) match
                case (c: IR.ClassName, AST.AmbiguousName(Nil)) => IR.ObjectType(c)
                case (c: IR.ClassName, AST.AmbiguousName(n :: rest)) => ctx.types(IR.ObjectType(c)).fields.get(n) match
                    case Some(FieldInfo(mod, ty)) => {
                        if (!mod.stat) throw NonStaticMember(c, n)
                        name.components.tail.foldLeft(
                            IR.GetStatic(ty, c, n) : AccessType
                        )(get_field(_, _)(ctx))
                    }
                    case None => throw NoSuchField(n, Some(IR.ObjectType(c)))
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
    case AST.ThisExpression => {
        if ctx.is_static then ???
        IR.LoadLocal(ctx.this_type, 0)
    }
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
            case AST.BinaryOperator.GreaterOrEqual => relational_operation(l, AST.BinaryOperator.GreaterOrEqual, r)
            case AST.BinaryOperator.Less => relational_operation(l, AST.BinaryOperator.Less, r)
            case AST.BinaryOperator.LessOrEqual => relational_operation(l, AST.BinaryOperator.LessOrEqual, r)
    }
    case AST.ExpressionName(name) => resolve_name(name)(ctx) match
        case t: IR.TypedExpression => t
        case c: IR.ObjectType => throw NotAField(c)
    case AST.FieldAccess(target, name) => get_field(typecheck_expr(target)(ctx), name)(ctx)
    case AST.MethodCall(target, name, args) => {
        var a = args.map(typecheck_expr(_)(ctx))
        val (c, ty, t) = target match
            case None => ctx.types(ctx.this_type).methods.get(name) match
                case Some(MethodInfo(mod, ty)) => {
                    if (ctx.is_static && !mod.stat) throw NonStaticMember(ctx.this_type.name, name)
                    (ctx.this_type.name, ty, if (mod.stat) None else Some(IR.LoadLocal(ctx.this_type, 0)))
                }
                case None => throw NoSuchMethod(name, ctx.this_type)
            case Some(target) => {
                (target match
                    case e: AST.Expression => typecheck_expr(e)(ctx)
                    case n: AST.AmbiguousName => resolve_name(n)(ctx) match
                        case t: IR.TypedExpression => t
                        case c: IR.ObjectType => c
                ) match
                    case e: IR.TypedExpression => e.ty match
                        case c: IR.ObjectType => ctx.types(c).methods.get(name) match
                            case Some(MethodInfo(mod, ty)) => {
                                if (mod.stat) throw StaticMember(c.name, name)
                                (c.name, ty, Some(e))
                            }
                            case None => throw NoSuchMethod(name, c)
                        case _ => throw NoSuchMethod(name, e.ty)
                    case c: IR.ObjectType => ctx.types(c).methods.get(name) match
                        case Some(MethodInfo(mod, ty)) => {
                            if (!mod.stat) throw NonStaticMember(c.name, name)
                            (c.name, ty, None)
                        }
                        case None => throw NoSuchMethod(name, c)
            }
            
        if (a.length != ty.params.length) throw new ParameterCountMismatch(a.length, ty.params.length)
        a = ty.params.zip(a).map(assign)

        t match
            case Some(t) => IR.InvokeSpecial(c, name, ty, t, a)
            case None => IR.InvokeStatic(c, name, ty, a)
    }
    case AST.Assignment(left, right) => {
        val r = typecheck_expr(right)(ctx)
        left match
            case AST.ExpressionName(name) => name.components match
                case name :: Nil => ctx.locals.get(name) match
                    case Some(Local(fin, ty, idx)) => {
                        if (fin) throw ModifyFinal(name, None)
                        IR.DupStoreLocal(idx, assign(ty, r))
                    }
                    case None => ctx.types(ctx.this_type).fields.get(name) match
                        case Some(FieldInfo(mod, ty)) => {
                            if (mod.fin) throw ModifyFinal(name, Some(ctx.this_type))
                            if (mod.stat) IR.DupPutStatic(ctx.this_type.name, name, assign(ty, r))
                            else {
                                if (ctx.is_static) throw NonStaticMember(ctx.this_type.name, name)
                                IR.DupPutField(ctx.this_type.name, name, IR.LoadLocal(ctx.this_type, 0), assign(ty, r))
                            }
                        }
                        case None => throw NoSuchField(name, Some(ctx.this_type))
                    
                case ambiguous :+ name => resolve_name(AST.AmbiguousName(ambiguous)) match
                    case e: IR.TypedExpression => put_field(e, name, r)(ctx)
                    case c: IR.ObjectType => ctx.types(c).fields.get(name) match
                        case Some(FieldInfo(mod, ty)) => {
                            if (!mod.stat) throw NonStaticMember(c.name, name)
                            if (mod.fin) throw ModifyFinal(name, Some(c))
                            IR.DupPutStatic(c.name, name, assign(ty, r))
                        }
                        case None => throw NoSuchField(name, Some(c))
                case _ => ???

            case AST.FieldAccess(target, name) => put_field(typecheck_expr(target)(ctx), name, r)(ctx)
            case AST.ArrayAccess(target, index) => ???
    }
    case AST.ArrayInitializer(initializers) => ???
    case AST.ArrayAccess(_, _) => ???
    case AST.NewObject(_, _) => ???
    case AST.NewArray(_, _) => ???

def typecheck_stmts(prev: IR.Code, stmts: List[AST.Statement])(ctx: Context): IR.Code = stmts match
    case Nil => prev
    case head :: next => head match
        case AST.VarOrFieldDeclaration(modifiers, fieldType, name, initializer) => {
            val fin = modifiers match
                case Nil => false
                case AST.Modifier.Final :: Nil => true
                case _ => throw InvalidVariableModifier

            val ty = resolve_ty(fieldType)(ctx.resolver)

            val init = assign(ty, typecheck_expr(initializer)(ctx))

            val idx = prev.max_locals
            val local = Local(fin, ty, idx)

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

def check_modifiers(modifiers: List[AST.Modifier]): IR.Modifiers = {
    val mod = modifiers.foldLeft(Set.empty[AST.Modifier])((s, m) => {
        if (s(m)) throw ModifierContradiction(m, m)
        s + m
    })

    val pub = mod(AST.Modifier.Public)
    val priv = mod(AST.Modifier.Private)
    val prot = mod(AST.Modifier.Protected)
    val abstr = mod(AST.Modifier.Abstract)
    val stat = mod(AST.Modifier.Static)
    val fin = mod(AST.Modifier.Final)

    if (pub && priv) throw ModifierContradiction(AST.Modifier.Public, AST.Modifier.Private)
    if (pub && prot) throw ModifierContradiction(AST.Modifier.Public, AST.Modifier.Protected)
    if (priv && prot) throw ModifierContradiction(AST.Modifier.Private, AST.Modifier.Protected)
    if (abstr) ???

    IR.Modifiers(
        pub,
        priv,
        prot,
        abstr,
        stat,
        fin,
    )
}

def context_from_args(
    stat: Boolean,
    parameters: List[String],
    ty: IR.MethodType,
    this_type: IR.ObjectType,
)(
    resolver: Resolver,
    types: Map[IR.ObjectType, ObjectInfo],
): (Context, IR.Code) = {
    val this_param = if stat then 0 else 1
    val (max_locals, locals) = parameters.zip(ty.params).foldLeft((this_param, Map.empty[String, Local]))((_, _) match
        case ((idx, locals), (name, ty)) => (idx + local_size(ty), locals + (name -> Local(false, ty, idx)))
    )
    (Context(resolver, types, locals, this_type, ty.ret, stat, false), IR.Code(max_locals, List.empty))
}

def typecheck_constructor(
    modifiers: IR.Modifiers,
    name: String,
    parameters: List[String],
    tys: List[IR.Type],
    this_type: IR.ObjectType,
    construct: AST.ConstructorInvocation,
    body: List[AST.Statement],
)(
    resolver: Resolver,
    types: Map[IR.ObjectType, ObjectInfo],
    initializers: List[IR.TypedStatement],
): IR.Method = {
    if name != this_type.name.path.last then throw InvalidConstructor

    val ty = IR.MethodType(tys, IR.VoidType)
    val (ctx, prev) = context_from_args(false, parameters, ty, this_type)(resolver, types)
    var code = prev
    construct match
        case ConstructorInvocation("super", args) => {
            if args.length != 0 then ???
            val superclass = types(this_type).superclass.get
            val constructor = types(superclass).constructors.get(List.empty) match
                case Some(c) => c
                case None => throw NoApplicableConstructor(superclass.name)
            
            code = code.copy(code = initializers
                :+ IR.ExpressionStatement(IR.InvokeSpecial(
                    superclass.name,
                    "<init>",
                    IR.MethodType(List.empty, IR.VoidType),
                    IR.LoadLocal(this_type, 0),
                    List.empty
                ))
            )
        }
        case ConstructorInvocation("this", args) => {
            if args.length != 0 then ???
            code = code.copy(code = List(IR.ExpressionStatement(IR.InvokeSpecial(
                this_type.name,
                "<init>",
                IR.MethodType(List.empty, IR.VoidType),
                IR.LoadLocal(this_type, 0),
                List.empty
            ))))
        }
    
    code = typecheck_stmts(code, body)(ctx)
    IR.Method(modifiers, "<init>", ty, Some(code))
}

def typecheck_method(
    modifiers: IR.Modifiers,
    name: String,
    parameters: List[String],
    ty: IR.MethodType,
    this_type: IR.ObjectType,
    body: Option[AST.Block],
)(
    resolver: Resolver,
    types: Map[IR.ObjectType, ObjectInfo],
): IR.Method = {
    val b = body match
        case Some(b) => b
        case None => ???
    
    val (ctx, prev) = context_from_args(modifiers.stat, parameters, ty, this_type)(resolver, types)
    val code = typecheck_stmts(prev, List(b))(ctx)
    IR.Method(modifiers, name, ty, Some(code))
}

def typecheck_field(
    modifiers: IR.Modifiers,
    name: String,
    ty: IR.Type,
    this_type: IR.ObjectType,
    initializer: AST.Expression,
)(
    resolver: Resolver,
    types: Map[IR.ObjectType, ObjectInfo]
): (IR.Field, IR.TypedStatement) = {
    val ctx = Context(resolver, types, Map.empty, this_type, IR.VoidType, modifiers.stat, false)
    val value = assign(ty, typecheck_expr(initializer)(ctx))
    val init = if modifiers.stat
        then IR.ExpressionStatement(IR.DupPutStatic(this_type.name, name, value))
        else IR.ExpressionStatement(IR.DupPutField(this_type.name, name, IR.LoadLocal(this_type, 0), value))
    (IR.Field(modifiers, name, ty), init)
}

def typecheck(ast: AST.CompilationUnit): IR.ClassFile = {
    var root = Root()
        .define(PackageName(List("java", "lang")), "Object")
        .define(PackageName(List("java", "lang")), "String")
        .define(PackageName(List("java", "io")), "System")

    val pkg = PackageName(ast.packageDeclaration.map(p => p.name).toList)
    val List(decl) = ast.typeDeclarations

    val name = decl match
        case AST.ClassDeclaration(modifiers, name, superclass, interfaces, body) => name
        case AST.InterfaceDeclaration(modifiers, name, superInterfaces, body) => name
    
    val class_name = IR.ClassName(pkg.path :+ name)
    root = root.define(pkg, name)
    val resolver = Resolver(root, pkg)
        .imp(AST.AmbiguousName(List("java", "lang")), true)
        .imp(AST.AmbiguousName(List("java", "io", "System")), false)

    val this_type = IR.ObjectType(class_name)

    val (superclass, interfaces, members) = decl match
        case AST.ClassDeclaration(modifiers, name, superclass, interfaces, body) => (Some(resolver.resolve(superclass)), interfaces.map(i => resolver.resolve(i)), body)
        case AST.InterfaceDeclaration(modifiers, name, superInterfaces, body) => (None, superInterfaces.map(i => resolver.resolve(i)), body)

    var info = ObjectInfo(
        superclass.map(IR.ObjectType(_)),
        interfaces.map(IR.ObjectType(_)),
        Map.empty,
        Map.empty,
        Map.empty,
    )
    var check_fields = List.empty[Map[IR.ObjectType, ObjectInfo] => (IR.Field, IR.TypedStatement)]
    var check_constructors = List.empty[(Map[IR.ObjectType, ObjectInfo], List[IR.TypedStatement]) => IR.Method]
    var check_methods = List.empty[Map[IR.ObjectType, ObjectInfo] => IR.Method]
    for (member <- members) member match
        case AST.ClassDeclaration(modifiers, name, superclass, interfaces, body) => ???
        case AST.InterfaceDeclaration(modifiers, name, superInterfaces, body) => ???
        case AST.MethodDeclaration(modifiers, returnType, name, parameters, body) => {
            val mod = check_modifiers(modifiers)
            val ty = IR.MethodType(parameters.map(p => resolve_ty(p.paramType)(resolver)), resolve_ty(returnType)(resolver))
            val params = parameters.map(p => p.name)
            info = info.copy(methods = info.methods + (name -> MethodInfo(mod, ty)))
            check_methods = check_methods :+ (types => typecheck_method(mod, name, params, ty, this_type, body)(resolver, types))
        }
        case AST.VarOrFieldDeclaration(modifiers, fieldType, name, initializer) => {
            val mod = check_modifiers(modifiers)
            val ty = resolve_ty(fieldType)(resolver)
            info = info.copy(fields = info.fields + (name -> FieldInfo(mod, ty)))
            check_fields = check_fields :+ (types => typecheck_field(mod, name, ty, this_type, initializer)(resolver, types))
        }
        case AST.ConstructorDeclaration(modifiers, name, parameters, construct, body) => {
            val mod = check_modifiers(modifiers)
            val tys = parameters.map(p => resolve_ty(p.paramType)(resolver))
            val params = parameters.map(p => p.name)
            if info.constructors.contains(tys) then throw DuplicateDefinition(List(class_name.path.last))
            info = info.copy(constructors = info.constructors + (tys -> ConstructorInfo(mod)))
            check_constructors = check_constructors :+ ((types, initializers) => typecheck_constructor(mod, name, params, tys, this_type, construct, body)(resolver, types, initializers))
        }
        case AST.Block(statements) => ???

    val types = langtypes + (this_type -> info)

    val (fields, initializers, static_initializers) = check_fields.map(check => check(types)).unzip3(
        (field, init) => if field.mod.stat
            then (field, None, Some(init))
            else (field, Some(init), None))

    val methods = IR.Method(IR.Modifiers(true, false, false, false, true, true), "<clinit>", IR.MethodType(List.empty, IR.VoidType), Some(IR.Code(0, static_initializers.flatten() :+ IR.ReturnStatement(None))))
        :: check_constructors.map(check => check(types, initializers.flatten()))
        ++ check_methods.map(check => check(types))
    IR.ClassFile(class_name, superclass.get, interfaces, fields, methods)
}
