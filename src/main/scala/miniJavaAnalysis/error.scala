package miniJavaAnalysis.error

import miniJavaParser.AST
import miniJavaAnalysis.resolve.PackageName
import miniJavaAnalysis.IR

sealed trait TypeError extends Throwable

extension(ty: IR.Type) {
    def stringify: String = ty match
        case IR.PrimitiveType.Int => "int"
        case IR.PrimitiveType.Boolean => "boolean"
        case IR.PrimitiveType.Char => "char"
        case IR.PrimitiveType.Double => "double"
        case IR.PrimitiveType.Float => "float"
        case IR.PrimitiveType.Long => "long"
        case IR.PrimitiveType.Short => "short"
        case IR.PrimitiveType.Byte => "byte"
        case IR.ObjectType(name) => name.stringify
        case IR.ArrayType(element) => element.stringify + "[]"
        case IR.NullType => "null"
        case IR.VoidType => "void"
}

extension(name: AST.AmbiguousName) {
    def stringify: String = name.components.mkString(".")
}

extension(name: PackageName) {
    def stringify: String = name.path.mkString(".")
}

extension(name: IR.ClassName) {
    def stringify: String = name.path.mkString(".")
}

case class DuplicateDefinition(name: List[String]) extends Throwable("duplicate definition of " + name.mkString(".")) with TypeError
case class PackageNotFound(name: PackageName) extends Throwable("package not found: " + name.stringify) with TypeError
case class TypeNotFound(name: AST.AmbiguousName) extends Throwable("type not found: " + name.stringify) with TypeError

case object InvalidConstructor extends Throwable("constructor must have same name as class") with TypeError
case class NoApplicableConstructor(name: IR.ClassName) extends Throwable("no applicable constructor of class " + name.stringify) with TypeError
case class TypeMismatch(ty: IR.Type, expected: IR.Type) extends Throwable("type mismatch: got " + stringify(ty) + ", expected " + stringify(expected)) with TypeError
case class ExpectedPrimitive(ty: IR.Type) extends Throwable("expected a primitive type, got " + ty.stringify) with TypeError
case object LocalVoidVariable extends Throwable("local variables may not have type void") with TypeError
case class NoSuchField(name: String, ty: Option[IR.Type])
extends Throwable(ty match
  case Some(t) => "no such field on type " + stringify(t) + ": " + name
  case None => "no such variable: " + name
) with TypeError
case class NoSuchMethod(name: String, ty: IR.Type) extends Throwable("no such method on type " + stringify(ty) + ": " + name) with TypeError
case class ParameterCountMismatch(got: Int, expected: Int) extends Throwable("parameter count mismatch: got " + got + ", expected " + expected) with TypeError
case object BreakOutsideLoop extends Throwable("break statement outside loop") with TypeError
case object ContinueOutsideLoop extends Throwable("continue statement outside loop") with TypeError
case object NonNumeric extends Throwable("cannot perform numeric operation on non-numeric type") with TypeError
case object NonIntegral extends Throwable("cannot perform integer operation on non-integer type") with TypeError
case object NotAnArray extends Throwable("can only index on arrays") with TypeError
case class ModifierContradiction(m1: AST.Modifier, m2: AST.Modifier) extends Throwable("contradicting modifiers") with TypeError
case object InvalidVariableModifier extends Throwable("variables do not support modifiers other than final") with TypeError
case class ModifyFinal(name: String, ty: Option[IR.Type]) extends Throwable(ty match
    case None => "cannot modify final variable " + name
    case Some(t) => "cannot modify final field " + name + " of type " + stringify(t)
) with TypeError
case class NonStaticMember(of: IR.ClassName, name: String) extends Throwable("member " + name + " of class " + of.stringify + " is non-static") with TypeError
case class StaticMember(of: IR.ClassName, name: String) extends Throwable("member " + name + " of class " + of.stringify + "is static") with TypeError
case class NotAField(ty: IR.Type) extends Throwable("expected a field, found type " + ty.stringify) with TypeError
case object Ambiguous extends Throwable("method invocation is ambiguous") with TypeError
