package test

import utest.*
import miniJavaParser.JavaASTBuilder
import miniJavaParser.AST.*

object ParserTest extends TestSuite {
    val tests = Tests {
        test("empty class parsing") {
            val ast = JavaASTBuilder.parseFromText("class HelloWorld { }")
            val expected = CompilationUnit(None,List(),List(ClassDeclaration(List(),"HelloWorld",QualifiedName(List(),"Object"),List(),ClassBody(List()))))

            ast ==> expected
        }
        test("method parsing") {
            val ast = JavaASTBuilder.parseFromFile("src/test/java/methodTest.java")
            val expected = CompilationUnit(None,List(), List(ClassDeclaration(List(Modifier.Public),"methodTest",QualifiedName(List(),"Object"),List(),
                ClassBody(List(
                    MethodDeclaration(List(Modifier.Private, Modifier.Static),PrimitiveType.Int,"plusOne",List(Parameter("x",PrimitiveType.Int)),
                        Block(List(ReturnStatement(Some(BinaryExpression(QualifiedName(List(),"x"),BinaryOperator.Add,IntLiteral(1))))))),
                    MethodDeclaration(List(Modifier.Public),VoidType,"doNothing",List(),
                        Block(List(ReturnStatement(None)))))))))

            ast ==> expected
        }
    }
}