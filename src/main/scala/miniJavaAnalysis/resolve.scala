package miniJavaAnalysis.resolve

import miniJavaAnalysis.IR
import miniJavaAnalysis.IR.ClassName
import miniJavaParser.AST
import miniJavaParser.AST.AmbiguousName
import miniJavaAnalysis.error.*

case class PackageName(path: List[String] = List.empty)

extension(c: ClassName) {
    def pkg(): PackageName = PackageName(c.path.slice(0, c.path.length - 1))
}

private case class Package(name: PackageName = PackageName(), contents: Map[String, ClassName | Package] = Map.empty) {
    def resolve(name: AmbiguousName): Option[(ClassName, AmbiguousName) | Package] = name.components match
        case Nil => Some(this)
        case head :: rest => contents.get(head) match
            case None => None
            case Some(c: ClassName) => Some((c, AmbiguousName(rest)))
            case Some(p: Package) => p.resolve(AmbiguousName(rest))
}

class Root(private[resolve] val root: Package = Package()) {
    def define(pkg: PackageName, name: String): Root = {
        val n = ClassName(pkg.path :+ name)

        def create: (PackageName, List[String]) => Package = (p, remaining) => remaining match
            case Nil => Package(pkg, Map(name -> n))
            case head :: rest => Package(p, Map(head -> create(PackageName(p.path :+ head), rest)))
        
        def add: (Package, List[String]) => Package = (p, path) => path match
            case Nil => p.contents.get(name) match
                case None => p.copy(contents = p.contents + (name -> n))
                case Some(_) => throw DuplicateDefinition(n.path)
            case head :: rest => p.contents.get(head) match
                case None => p.copy(contents = p.contents + (head -> create(PackageName(p.name.path :+ head), rest)))
                case Some(n @ ClassName(_)) => throw DuplicateDefinition(n.path)
                case Some(subp @ Package(_, _)) => p.copy(contents = p.contents + (head -> add(subp, rest)))
        
        Root(add(root, pkg.path))
    }
}

class Resolver(val root: Root, val pkg: PackageName) {
    private val local: Package = root.root.resolve(AmbiguousName(pkg.path)) match
        case Some(p: Package) => p
        case _ => ???

    private var imports: Package = Package()

    private def resolve_item(name: AmbiguousName): ClassName | Package = {
        local.resolve(name).orElse(imports.resolve(name)).orElse(root.root.resolve(name)) match
            case Some((c: ClassName, AmbiguousName(Nil))) => c
            case Some(p: Package) => p
            case _ => throw new TypeNotFound(name)
            
    }

    def resolve(name: AmbiguousName): ClassName = resolve_item(name) match
        case c: ClassName => c
        case p: Package => throw new TypeNotFound(name)

    def resolve_split(name: AmbiguousName): (ClassName, AmbiguousName) = {
        local.resolve(name).orElse(imports.resolve(name)).orElse(root.root.resolve(name)) match
            case Some((c: ClassName, r: AmbiguousName)) => (c, r)
            case _ => throw new TypeNotFound(name)
    }

    def imp(name: AmbiguousName, glob: Boolean): Resolver = {
        resolve_item(name) match
            case p: Package => if (glob) {
                val out = Resolver(root, pkg)
                out.imports = imports.copy(contents = imports.contents ++ p.contents)
                out
            } else {
                if (local.contents.contains(name.components.last)) throw new DuplicateDefinition(List(name.components.last))
                val out = Resolver(root, pkg)
                out.imports = imports.copy(contents = imports.contents + (name.components.last -> p))
                out
            }
            case c: ClassName => {
                if (glob) ???
                if (local.contents.contains(name.components.last)) throw new DuplicateDefinition(List(name.components.last))
                val out = Resolver(root, pkg)
                out.imports = imports.copy(contents = imports.contents + (name.components.last -> c))
                out
            }
    }
}

def resolve_ty(ty: AST.TypeOrVoid)(resolver: Resolver): IR.Type = ty match
    case AST.PrimitiveType.Int => IR.PrimitiveType.Int
    case AST.PrimitiveType.Boolean => IR.PrimitiveType.Boolean
    case AST.PrimitiveType.Char => IR.PrimitiveType.Char
    case AST.PrimitiveType.Double => IR.PrimitiveType.Double
    case AST.PrimitiveType.Byte => IR.PrimitiveType.Byte
    case AST.PrimitiveType.Float => IR.PrimitiveType.Float
    case AST.PrimitiveType.Long => IR.PrimitiveType.Long
    case AST.PrimitiveType.Short => IR.PrimitiveType.Short
    case AST.ObjectType(name) => IR.ObjectType(resolver.resolve(name))
    case AST.ArrayType(arrayType) => IR.ArrayType(resolve_ty(arrayType)(resolver))
    case AST.VoidType => IR.VoidType
