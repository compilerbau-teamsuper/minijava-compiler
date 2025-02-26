package test

import miniJavaParser.{AST, JavaASTBuilder}
import miniJavaAnalysis.typecheck
import miniJavaAnalysis.IR.*
import utest.*

object TypecheckTest extends TestSuite {
    val tests = Tests {
        test("typecheck_smoke") {
            val input = AST.CompilationUnit(None, List.empty, List(AST.ClassDeclaration(List.empty, "HelloWorld", AST.AmbiguousName(List("Object")), List.empty, List.empty)))
            val output = typecheck(input)
            val expected = ClassFile(ClassName(List("HelloWorld")),ClassName(List("java", "lang", "Object")),List(),
                List(),
                List(Method(Modifiers(true,false,false,false,true,true),"<clinit>",MethodType(List(),VoidType),Some(Code(0,List(
                    ReturnStatement(None)))))))
            output ==> expected
        }
        test("typecheck_simple") {
            val ast = JavaASTBuilder.parseFromFile("src/test/java/simpleTypeTest.java")
            println(ast)
            val ir = typecheck(ast)
            val expected = ClassFile(
                ClassName(List("simpleTypeTest")),
                ClassName(List("java", "lang", "Object")),
                List(),
                List(Field(Modifiers.empty,"field",PrimitiveType.Int)),
                List(
                    Method(Modifiers(true,false,false,false,true,true),"<clinit>",MethodType(List(),VoidType),Some(Code(0,List(
                        ReturnStatement(None))))),
                    Method(Modifiers.empty,"<init>",MethodType(List(),VoidType),Some(Code(1,List(
                        ExpressionStatement(DupPutField(ClassName(List("simpleTypeTest")),"field",LoadLocal(ObjectType(ClassName(List("simpleTypeTest"))),0),IntLikeLiteral(PrimitiveType.Int,0))),
                        ExpressionStatement(InvokeSpecial(ClassName(List("java", "lang", "Object")),"<init>",MethodType(List(),VoidType),LoadLocal(ObjectType(ClassName(List("simpleTypeTest"))),0),List())),
                        ReturnStatement(None))))),
                    Method(Modifiers.empty,"noopTest",MethodType(List(),VoidType),Some(Code(1,List(
                        ReturnStatement(None))))),
                    Method(Modifiers.empty,"assignmentTest",MethodType(List(),PrimitiveType.Int),Some(Code(2,List(
                        ExpressionStatement(DupStoreLocal(1,IntLikeLiteral(PrimitiveType.Int,0))),
                        ExpressionStatement(DupStoreLocal(1,IntLikeLiteral(PrimitiveType.Int,1))),
                        ReturnStatement(Some(LoadLocal(PrimitiveType.Int,1))))))),
                    Method(Modifiers.empty,"getField",MethodType(List(),PrimitiveType.Int),Some(Code(1,List(
                        ReturnStatement(Some(GetField(PrimitiveType.Int,ClassName(List("simpleTypeTest")),"field",LoadLocal(ObjectType(ClassName(List("simpleTypeTest"))),0)))))))),
                    Method(Modifiers.empty,"invokeGetField",MethodType(List(),PrimitiveType.Int),Some(Code(1,List(
                        ReturnStatement(Some(InvokeSpecial(ClassName(List("simpleTypeTest")),"getField",MethodType(List(),PrimitiveType.Int),LoadLocal(ObjectType(ClassName(List("simpleTypeTest"))),0),List())))))))))

            ir ==> expected
        }
    }
}
