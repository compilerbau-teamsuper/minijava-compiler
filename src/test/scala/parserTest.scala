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
            val expected = CompilationUnit(None,List(), List(ClassDeclaration(List(Modifier.Public),"methodTest",QualifiedName(List(),"Object"),List(),ClassBody(List(
              MethodDeclaration(List(Modifier.Private, Modifier.Static),PrimitiveType.Int,"plusOne",List(Parameter("x",PrimitiveType.Int)),
                Option(Block(List(ReturnStatement(Option(BinaryExpression(FieldAccess(QualifiedName(List(), "x")), BinaryOperator.Add, IntLiteral(1)))))))),
              MethodDeclaration(List(Modifier.Public),VoidType,"doNothing",List(),
                Option(Block(List(ReturnStatement(None))))),
              MethodDeclaration(List(),ArrayType(PrimitiveType.Int),"doubleAddOne",List(Parameter("x",PrimitiveType.Int),Parameter("y",PrimitiveType.Int)),
                Option(Block(List(
                  LocalVariableDeclaration(ArrayType(PrimitiveType.Int), VariableDeclarator("res", ArrayInitializer(List(
                    MethodCall(QualifiedName(List(), "plusOne"), List(FieldAccess(QualifiedName(List(), "x")))),
                    MethodCall(QualifiedName(List(), "plusOne"), List(FieldAccess(QualifiedName(List(), "y")))))))),
                  ReturnStatement(Option(FieldAccess(QualifiedName(List(), "res")))))))))))))

            ast ==> expected
        }
        test("class/interface parsing") {
          val ast = JavaASTBuilder.parseFromFile("src/test/java/classInterfaceTest.java")
          val expected = CompilationUnit(None,List(),List(
            ClassDeclaration(List(),"classInterfaceTest",QualifiedName(List(),"Object"),List(),ClassBody(List(
              ClassDeclaration(List(Modifier.Protected),"subClass",QualifiedName(List(),"Object"),List(QualifiedName(List(),"interfaze")),ClassBody(List(
                MethodDeclaration(List(Modifier.Public),VoidType,"nothing",List(),
                  Option(Block(List())))))),
              ClassDeclaration(List(),"extendClass",QualifiedName(List(),"subClass"),List(),ClassBody(List(
                FieldDeclaration(List(Modifier.Private),PrimitiveType.Boolean,VariableDeclarator("why", BooleanLiteral(false))))))))),
            InterfaceDeclaration(List(), "interfaze", List(), InterfaceBody(List(
              FieldDeclaration(List(Modifier.Public),PrimitiveType.Int,VariableDeclarator("x", IntLiteral(2))),
              MethodDeclaration(List(Modifier.Abstract,Modifier.Public),VoidType,"nothing",List(),None))))))

          ast ==> expected
        }
        test("calculations parsing") {
          val ast = JavaASTBuilder.parseFromFile("src/test/java/calculationsTest.java")
          val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public),"calculationsTest",QualifiedName(List(),"Object"),List(),ClassBody(List(
            FieldDeclaration(List(),PrimitiveType.Boolean,VariableDeclarator("f", BinaryExpression(BooleanLiteral(true), BinaryOperator.Or, BooleanLiteral(false)))),
            FieldDeclaration(List(),PrimitiveType.Boolean,VariableDeclarator("g",
              BinaryExpression(
                BinaryExpression(FieldAccess(QualifiedName(List(),"f")), BinaryOperator.Xor, BooleanLiteral(true)),
                BinaryOperator.Xor,
                BinaryExpression(
                  BinaryExpression(
                    MethodCall(QualifiedName(List(), "alwaysTrue"), List()),
                    BinaryOperator.Equals,
                    BinaryExpression(
                      BooleanLiteral(true),
                      BinaryOperator.Equals,
                      BinaryExpression(
                        IntLiteral(4),
                        BinaryOperator.Greater,
                        IntLiteral(5)))),
                  BinaryOperator.Xor,
                  BooleanLiteral(true))))),
            FieldDeclaration(List(),PrimitiveType.Int,VariableDeclarator("x",
              BinaryExpression(
                IntLiteral(0),
                BinaryOperator.Subtract,
                BinaryExpression(
                  MethodCall(QualifiedName(List(), "alwaysOne"), List()),
                  BinaryOperator.Subtract,
                  BinaryExpression(
                    BinaryExpression(
                      IntLiteral(5),
                      BinaryOperator.Multiply,
                      BinaryExpression(
                        IntLiteral(2),
                        BinaryOperator.Divide,
                        IntLiteral(4))),
                    BinaryOperator.Add,
                    IntLiteral(3)))))),
            MethodDeclaration(List(),PrimitiveType.Boolean,"alwaysTrue",List(),
              Option(Block(List(ReturnStatement(Option(BinaryExpression(BooleanLiteral(true), BinaryOperator.And, BooleanLiteral(true)))))))),
            MethodDeclaration(List(),PrimitiveType.Int,"alwaysOne",List(),
              Option(Block(List(ReturnStatement(Option(IntLiteral(1))))))))))))

          ast ==> expected
        }
    }
}