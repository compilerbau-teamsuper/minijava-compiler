package miniJavaAnalysis.predefined

import miniJavaAnalysis.resolve.{Root, pkg}
import miniJavaAnalysis.IR.*
import miniJavaAnalysis.*

val types = Map(
    LangTypes.Object -> ObjectInfo(
        None,
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers.empty, MethodType(List.empty, VoidType))),
    ),
    LangTypes.String -> ObjectInfo(
        Some(LangTypes.Object),
        List.empty,
        Map.empty,
        Map.empty,
        List.empty,
    ),
    LangTypes.System -> ObjectInfo(
        Some(LangTypes.Object),
        List.empty,
        Map.empty,
        Map(
            "out" -> FieldInfo(Modifiers(false, false, false, false, true, false), LangTypes.PrintStream),
            "err" -> FieldInfo(Modifiers(false, false, false, false, true, false), LangTypes.PrintStream),
        ),
        List.empty,
    ),
    LangTypes.PrintStream -> ObjectInfo(
        Some(LangTypes.Object),
        List.empty,
        Map("println" -> List(
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(PrimitiveType.Boolean), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(PrimitiveType.Char), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(ArrayType(PrimitiveType.Char)), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(PrimitiveType.Double), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(PrimitiveType.Float), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(PrimitiveType.Int), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(PrimitiveType.Long), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(LangTypes.Object), VoidType)),
            MethodInfo(Modifiers(false, false, false, false, false, false), MethodType(List(LangTypes.String), VoidType)),
        )),
        Map.empty,
        List.empty,
    ),
    LangTypes.Number -> ObjectInfo(
        Some(LangTypes.Object),
        List.empty,
        Map.empty,
        Map.empty,
        List.empty,
    ),
    LangTypes.Boolean -> ObjectInfo(
        Some(LangTypes.Object),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Boolean), VoidType))),
    ),
    LangTypes.Byte -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Byte), VoidType))),
    ),
    LangTypes.Short -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Short), VoidType))),
    ),
    LangTypes.Character -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Char), VoidType))),
    ),
    LangTypes.Integer -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Int), VoidType))),
    ),
    LangTypes.Long -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Long), VoidType))),
    ),
    LangTypes.Float -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Float), VoidType))),
    ),
    LangTypes.Double -> ObjectInfo(
        Some(LangTypes.Number),
        List.empty,
        Map.empty,
        Map.empty,
        List(MethodInfo(Modifiers(true, false, false, false, false, false), MethodType(List(PrimitiveType.Double), VoidType))),
    ),
)

val root = types.keys.foldLeft(Root())((r, c) => r.define(c.name.pkg(), c.name.name))
