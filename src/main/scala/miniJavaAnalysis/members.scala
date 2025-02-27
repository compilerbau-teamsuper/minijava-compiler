package miniJavaAnalysis

import miniJavaParser.AST
import miniJavaAnalysis.IR
import miniJavaAnalysis.error.*
import miniJavaAnalysis.conversions.{is_subtype, is_assignable, assign}

def canditate_methods(of: IR.ObjectType, name: String)(ctx: Context): List[(IR.ObjectType, MethodInfo)] = {
    ctx.types(of).methods.get(name).toList.flatten.map(m => (of, m))
    ++ ctx.types(of).superclass.map(canditate_methods(_, name)(ctx)).toList.flatten
    ++ ctx.types(of).interfaces.map(canditate_methods(_, name)(ctx)).flatten
}

def potentially_applicable(
    of: IR.ObjectType,
    method: MethodInfo,
    args: List[IR.Type],
)(ctx: Context): Boolean = {
    (!method.mod.priv || ctx.this_type == of)
    && (!method.mod.prot || is_subtype(ctx.this_type, of)(ctx))
    && method.ty.params.length == args.length
}

def select_method(
    candidates: List[(IR.ObjectType, MethodInfo)],
    args: List[AST.Expression],
)(ctx: Context): (IR.ObjectType, MethodInfo, List[IR.TypedExpression]) = {
    val a = args.map(typecheck_expr(_)(ctx))
    val atys = a.map(_.ty)
    val potentials = candidates.filter((of, method) => potentially_applicable(of, method, atys)(ctx))

    val applicable = potentials.filter((_, method) => atys.zip(method.ty.params).forall(is_subtype(_, _)(ctx))) match
        case Nil => potentials.filter((_, method) => method.ty.params.zip(atys).forall(is_assignable(_, _)(ctx)))
        case by_subtyping => by_subtyping
    
    val (of, info) = applicable.sortWith((f, g) => more_specific(f._2.ty.params, g._2.ty.params)(ctx) && !more_specific(g._2.ty.params, f._2.ty.params)(ctx))
        match
            case best :: Nil => best
            case best :: next :: _ if !more_specific(next._2.ty.params, best._2.ty.params)(ctx) => best
            case best :: equal :: _ => throw Ambiguous(best._2.ty, equal._2.ty)
            case Nil => throw NoApplicableMethod

    (of, info, info.ty.params.zip(a).map(assign(_, _)(ctx)))
}

def more_specific(a: List[IR.Type], b: List[IR.Type])(ctx: Context): Boolean = {
    a.zip(b).forall(is_subtype(_, _)(ctx))
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
                IR.DupPutField(c.name, name, target, assign(ty, value)(ctx))
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
                        rest.foldLeft(
                            IR.GetStatic(ty, c, n) : AccessType
                        )(get_field(_, _)(ctx))
                    }
                    case None => throw NoSuchField(n, Some(IR.ObjectType(c)))
}
