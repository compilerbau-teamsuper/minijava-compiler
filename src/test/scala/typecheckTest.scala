package test

import miniJavaParser.{AST, JavaASTBuilder}
import miniJavaAnalysis.typecheck
import miniJavaAnalysis.IR.*
import utest.*

val NO_MODIFIERS = Modifiers(false, false, false, false, false, false)

object TypecheckTest extends TestSuite {
    val tests = Tests {
        test("typecheck_smoke") {
            val input = AST.CompilationUnit(None, List.empty, List(AST.ClassDeclaration(List.empty, "HelloWorld", AST.AmbiguousName(List("Object")), List.empty, List.empty)))
            val output = typecheck(input)
            val expected = ClassFile(ClassName(List("HelloWorld")), List.empty, List.empty)
      
            output ==> expected
        }
        test("typecheck_simple") {
            val ast = JavaASTBuilder.parseFromFile("src/test/java/simpleTypeTest.java")
            println(ast)
            val ir = typecheck(ast)
            val expected = ClassFile(
                ClassName(List("simpleTypeTest")),
                List(
                    Field(NO_MODIFIERS, "field", PrimitiveType.Int, IntLiteral(0))
                ),
                List(
                    Method(NO_MODIFIERS, "<init>",
                        MethodType(List(), VoidType),
                        Some(Code(1, List()))
                    ),
                    Method(NO_MODIFIERS, "noopTest",
                        MethodType(List(),VoidType),
                        Some(Code(1,List(
                            ReturnStatement(None)
                        )))
                    ),
                    Method(NO_MODIFIERS, "assignmentTest",
                        MethodType(List(),PrimitiveType.Int),
                        Some(Code(2,List(
                            ExpressionStatement(DupStoreLocal(1,IntLiteral(0))),
                            ExpressionStatement(DupStoreLocal(1,IntLiteral(1))),
                            ReturnStatement(Some(LoadLocal(PrimitiveType.Int,1)))
                        )))
                    ),
                    Method(NO_MODIFIERS, "getField",
                        MethodType(List(),PrimitiveType.Int),
                        Some(Code(1,List(
                            ReturnStatement(Some(GetField(PrimitiveType.Int,"field", LoadLocal(ObjectType(ClassName(List("simpleTypeTest"))), 0))))
                        )))
                    ),
                    Method(NO_MODIFIERS, "invokeGetField",
                        MethodType(List(),PrimitiveType.Int),
                        Some(Code(1,List(
                            ReturnStatement(Some(
                                InvokeSpecial(
                                    ClassName(List("simpleTypeTest")), "getField", MethodType(List(), PrimitiveType.Int),
                                    LoadLocal(
                                        ObjectType(ClassName(List("simpleTypeTest"))),
                                        0
                                    ), 
                                    List()
                                )
                            ))
                        )))
                    )
                )
            )

            ir ==> expected
        }
    }
}
