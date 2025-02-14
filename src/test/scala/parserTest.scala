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
                  VarOrFieldDeclaration(List(),ArrayType(PrimitiveType.Int), "res", ArrayInitializer(List(
                    MethodCall(QualifiedName(List(), "plusOne"), List(FieldAccess(QualifiedName(List(), "x")))),
                    MethodCall(QualifiedName(List(), "plusOne"), List(FieldAccess(QualifiedName(List(), "y"))))))),
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
                VarOrFieldDeclaration(List(Modifier.Private),PrimitiveType.Boolean,"why", BooleanLiteral(false)))))))),
            InterfaceDeclaration(List(), "interfaze", List(), InterfaceBody(List(
              VarOrFieldDeclaration(List(Modifier.Public),PrimitiveType.Int,"x", IntLiteral(2)),
              MethodDeclaration(List(Modifier.Abstract,Modifier.Public),VoidType,"nothing",List(),None))))))

          ast ==> expected
        }
        test("calculations parsing") {
          val ast = JavaASTBuilder.parseFromFile("src/test/java/calculationsTest.java")
          val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public),"calculationsTest",QualifiedName(List(),"Object"),List(),ClassBody(List(
            VarOrFieldDeclaration(List(),PrimitiveType.Boolean,"f", BinaryExpression(BooleanLiteral(true), BinaryOperator.Or, BooleanLiteral(false))),
            VarOrFieldDeclaration(List(),PrimitiveType.Boolean,"g",
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
                  BooleanLiteral(true)))),
            VarOrFieldDeclaration(List(),PrimitiveType.Int,"x",
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
                    IntLiteral(3))))),
            MethodDeclaration(List(),PrimitiveType.Boolean,"alwaysTrue",List(),
              Option(Block(List(ReturnStatement(Option(BinaryExpression(BooleanLiteral(true), BinaryOperator.And, BooleanLiteral(true)))))))),
            MethodDeclaration(List(),PrimitiveType.Int,"alwaysOne",List(),
              Option(Block(List(ReturnStatement(Option(IntLiteral(1))))))))))))

          ast ==> expected
        }
        test("statements parsing 1") {
          val ast = JavaASTBuilder.parseFromFile("src/test/java/statementsTest1.java")
          val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "statementsTest1", QualifiedName(List(), "Object"), List(), ClassBody(List(
            MethodDeclaration(List(), VoidType, "forTest", List(), Option(Block(List(
              ForStatement(
                Option(VarOrFieldDeclaration(List(), PrimitiveType.Int, "i", IntLiteral(0))),
                Option(BinaryExpression(IntLiteral(5), BinaryOperator.Greater, FieldAccess(QualifiedName(List(), "i")))),
                Option(BinaryExpression(FieldAccess(QualifiedName(List(), "i")), BinaryOperator.Add, IntLiteral(1))),
                Block(List(
                  Assignment(FieldAccess(QualifiedName(List(), "i")), BinaryExpression(FieldAccess(QualifiedName(List(), "i")), BinaryOperator.Subtract, IntLiteral(1))),
                  BreakStatement()))))))),
            MethodDeclaration(List(), VoidType, "whileTest", List(), Option(Block(List(
              VarOrFieldDeclaration(List(), PrimitiveType.Boolean, "loopVar", BooleanLiteral(true)),
              WhileStatement(
                FieldAccess(QualifiedName(List(), "loopVar")),
                Block(List(
                  MethodCall(QualifiedName(List(), "forTest"), List()),
                  Assignment(FieldAccess(QualifiedName(List(), "loopVar")), BinaryExpression(FieldAccess(QualifiedName(List(), "loopVar")), BinaryOperator.And, BooleanLiteral(false))),
                  ContinueStatement()
                )))))))
          )))))

          ast ==> expected
        }
        test("statements parsing 2") {
          val ast = JavaASTBuilder.parseFromFile("src/test/java/statementsTest2.java")
          val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "statementsTest2", QualifiedName(List(), "Object"), List(), ClassBody(List(
            MethodDeclaration(List(), VoidType, "ifTest", List(), Option(Block(List(
              IfStatement(
                BinaryExpression(BinaryExpression(IntLiteral(5), BinaryOperator.Greater, IntLiteral(4)), BinaryOperator.Or, BinaryExpression(IntLiteral(5), BinaryOperator.Equals, IntLiteral(4))),
                Block(List(Block(List()))),
                Option(Block(List(
                  IfStatement(BooleanLiteral(true), Block(List(ReturnStatement(None))), None)
                )))))))),
            MethodDeclaration(List(), VoidType, "assignmentTest", List(), Option(Block(List(
              VarOrFieldDeclaration(List(), PrimitiveType.Boolean, "b", BooleanLiteral(false)),
              Assignment(FieldAccess(QualifiedName(List(),"b")), BooleanLiteral(true)),
              Assignment(FieldAccess(QualifiedName(List(),"b")), BinaryExpression(FieldAccess(QualifiedName(List(),"b")), BinaryOperator.Or, BooleanLiteral(false))),
              VarOrFieldDeclaration(List(), PrimitiveType.Int, "x", IntLiteral(1)),
              Assignment(FieldAccess(QualifiedName(List(),"x")), BinaryExpression(FieldAccess(QualifiedName(List(),"x")), BinaryOperator.Multiply, IntLiteral(4))),
              Assignment(FieldAccess(QualifiedName(List(),"x")), BinaryExpression(FieldAccess(QualifiedName(List(),"x")), BinaryOperator.Modulo, IntLiteral(2))))))))))))

          ast ==> expected
        }
    }
}