package test

import miniJavaParser.{AST, JavaASTBuilder}
import miniJavaAnalysis.typecheck
import miniJavaAnalysis.IR.*
import utest.*

object TypecheckTest extends TestSuite {
    val tests = Tests {
        test("typecheck_smoke") {
            val input = AST.CompilationUnit(None, List.empty, List(AST.ClassDeclaration(List.empty, "HelloWorld", "Object", List.empty, List.empty)))
            val output = typecheck(input)
            val expected = ClassFile("HelloWorld", List.empty, List.empty)
      
            output ==> expected
        }
        test("typecheck_simple") {
            val ast = JavaASTBuilder.parseFromFile("src/test/java/simpleTypeTest.java")
            val ir = typecheck(ast)
            val expected = ClassFile(
                "simpleTypeTest",
                List(
                    Field("field",PrimitiveType.Int,IntLiteral(0))
                ),
                List(
                    Method("noopTest",
                        MethodType(List(),VoidType),
                        Some(Code(1,List(
                            ReturnStatement(None)
                        )))
                    ),
                    Method("assignmentTest",
                        MethodType(List(),PrimitiveType.Int),
                        Some(Code(2,List(
                            ExpressionStatement(DupStoreLocal(1,IntLiteral(0))),
                            ExpressionStatement(DupStoreLocal(1,IntLiteral(1))),
                            ReturnStatement(Some(LoadLocal(PrimitiveType.Int,1)))
                        )))
                    ),
                    Method("getField",
                        MethodType(List(),PrimitiveType.Int),
                        Some(Code(1,List(
                            ReturnStatement(Some(GetField(PrimitiveType.Int,"field",LoadLocal(ObjectType("simpleTypeTest"),0))))
                        )))
                    )
                ),
            )

            ir ==> expected
        }
    }
}
