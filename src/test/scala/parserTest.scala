package test

import utest.*
import miniJavaParser.JavaASTBuilder
import miniJavaParser.AST.*

object ParserTest extends TestSuite {
  val tests = Tests {
    test("empty class parsing") {
      val ast = JavaASTBuilder.parseFromText("class HelloWorld { }")
      val expected = CompilationUnit(None,List(),List(ClassDeclaration(List(),"HelloWorld","Object",List(),List(
        ConstructorDeclaration(List(Modifier.Public), "HelloWorld", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List())))))
      ))))

      ast ==> expected
    }
    test("method parsing") { // ToDo: Hier evtl. signature Constructor Parsing mittesten (oder in extra Fields test mit this. Sachen!)
      val ast = JavaASTBuilder.parseFromFile("src/test/java/methodTest.java")
      val expected = CompilationUnit(None,List(), List(ClassDeclaration(List(Modifier.Public),"methodTest","Object",List(),List(
        ConstructorDeclaration(List(Modifier.Public), "methodTest", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List()))))),
        MethodDeclaration(List(Modifier.Private, Modifier.Static),PrimitiveType.Int,"plusOne",List(Parameter("x",PrimitiveType.Int)),
          Option(Block(List(ReturnStatement(Option(BinaryExpression(FieldAccess("x", None), BinaryOperator.Add, IntLiteral(1)))))))),
        MethodDeclaration(List(Modifier.Public),VoidType,"doNothing",List(),
          Option(Block(List(ReturnStatement(None))))),
        MethodDeclaration(List(),ArrayType(PrimitiveType.Int),"doubleAddOne",List(Parameter("x",PrimitiveType.Int),Parameter("y",PrimitiveType.Int)),
          Option(Block(List(
            VarOrFieldDeclaration(List(),ArrayType(PrimitiveType.Int), "res", ArrayInitializer(List(
              MethodCall("plusOne", None, List(FieldAccess("x", None))),
              MethodCall("plusOne", None, List(FieldAccess("y", None)))))),
            ReturnStatement(Option(FieldAccess("res", None)))))))))))

      ast ==> expected
    }
    test("class/interface parsing") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/classInterfaceTest.java")
      val expected = CompilationUnit(None,List(),List(
        ClassDeclaration(List(),"classInterfaceTest","Object",List(),List(
          ConstructorDeclaration(List(Modifier.Public), "classInterfaceTest", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List()))))),
          ClassDeclaration(List(Modifier.Protected),"subClass","Object",List("interfaze"),List(
            ConstructorDeclaration(List(Modifier.Public), "subClass", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List()))))),
            MethodDeclaration(List(Modifier.Public),VoidType,"nothing",List(),
              Option(Block(List()))))),
          ClassDeclaration(List(),"extendClass","subClass",List(),List(
            ConstructorDeclaration(List(Modifier.Public), "extendClass", List(), Block(List(ExpressionStatement(MethodCall("subClass", None, List()))))),
            VarOrFieldDeclaration(List(Modifier.Private),PrimitiveType.Boolean,"why", BooleanLiteral(false)))))),
        InterfaceDeclaration(List(), "interfaze", List(), List(
          VarOrFieldDeclaration(List(Modifier.Public),PrimitiveType.Int,"x", IntLiteral(2)),
          MethodDeclaration(List(Modifier.Abstract,Modifier.Public),VoidType,"nothing",List(),None)))))

      ast ==> expected
    }
    test("calculations parsing") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/calculationsTest.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public),"calculationsTest","Object",List(),List(
        ConstructorDeclaration(List(Modifier.Public), "calculationsTest", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List()))))),
        VarOrFieldDeclaration(List(),PrimitiveType.Boolean,"f", BinaryExpression(BooleanLiteral(true), BinaryOperator.Or, BooleanLiteral(false))),
        VarOrFieldDeclaration(List(),PrimitiveType.Boolean,"g",
          BinaryExpression(
            BinaryExpression(FieldAccess("f", None), BinaryOperator.Xor, BooleanLiteral(true)),
            BinaryOperator.Xor,
            BinaryExpression(
              BinaryExpression(
                MethodCall("alwaysTrue", None, List()),
                BinaryOperator.Equals,
                BinaryExpression(
                  BooleanLiteral(true),
                  BinaryOperator.Equals,
                  BinaryExpression(
                    IntLiteral(5),
                    BinaryOperator.Less,
                    IntLiteral(4)))),
              BinaryOperator.Xor,
              BooleanLiteral(true)))),
        VarOrFieldDeclaration(List(),PrimitiveType.Int,"x",
          BinaryExpression(
            IntLiteral(0),
            BinaryOperator.Subtract,
            BinaryExpression(
              MethodCall("alwaysOne", None, List()),
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
          Option(Block(List(ReturnStatement(Option(IntLiteral(1)))))))))))

      ast ==> expected
    }
    test("statements parsing 1") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/statementsTest1.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "statementsTest1", "Object", List(), List(
        ConstructorDeclaration(List(Modifier.Public), "statementsTest1", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List()))))),
        MethodDeclaration(List(), VoidType, "forTest", List(), Option(Block(List(
          ForStatement(
            Option(VarOrFieldDeclaration(List(), PrimitiveType.Int, "i", IntLiteral(0))),
            Option(BinaryExpression(FieldAccess("i", None), BinaryOperator.Less, IntLiteral(5))),
            Option(BinaryExpression(FieldAccess("i", None), BinaryOperator.Add, IntLiteral(1))),
            Block(List(
              ExpressionStatement(Assignment(FieldAccess("i", None), BinaryExpression(FieldAccess("i", None), BinaryOperator.Subtract, IntLiteral(1)))),
              BreakStatement()))))))),
        MethodDeclaration(List(), VoidType, "whileTest", List(), Option(Block(List(
          VarOrFieldDeclaration(List(), PrimitiveType.Boolean, "loopVar", BooleanLiteral(true)),
          WhileStatement(
            FieldAccess("loopVar", None),
            Block(List(
              ExpressionStatement(MethodCall("forTest", None, List())),
              ExpressionStatement(Assignment(FieldAccess("loopVar", None), BinaryExpression(FieldAccess("loopVar", None), BinaryOperator.And, BooleanLiteral(false)))),
              ContinueStatement()
            )))))))
      ))))

      ast ==> expected
    }
    test("statements parsing 2") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/statementsTest2.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "statementsTest2", "Object", List(), List(
        ConstructorDeclaration(List(Modifier.Public), "statementsTest2", List(), Block(List(ExpressionStatement(MethodCall("Object", None, List()))))),
        MethodDeclaration(List(), VoidType, "ifTest", List(), Option(Block(List(
          IfStatement(
            BinaryExpression(IntLiteral(5), BinaryOperator.GreaterOrEqual, IntLiteral(4)),
            Block(List(Block(List()))),
            Option(Block(List(
              IfStatement(BooleanLiteral(true), Block(List(ReturnStatement(None))), None)
            )))))))),
        MethodDeclaration(List(), VoidType, "assignmentTest", List(), Option(Block(List(
          VarOrFieldDeclaration(List(), PrimitiveType.Boolean, "b", BooleanLiteral(false)),
          ExpressionStatement(Assignment(FieldAccess("b", None), BooleanLiteral(true))),
          ExpressionStatement(Assignment(FieldAccess("b", None), BinaryExpression(FieldAccess("b", None), BinaryOperator.Or, BooleanLiteral(false)))),
          VarOrFieldDeclaration(List(), PrimitiveType.Int, "x", IntLiteral(1)),
          ExpressionStatement(Assignment(FieldAccess("x", None), BinaryExpression(FieldAccess("x", None), BinaryOperator.Multiply, IntLiteral(4)))),
          ExpressionStatement(Assignment(FieldAccess("x", None), BinaryExpression(FieldAccess("x", None), BinaryOperator.Modulo, IntLiteral(2))))))))))))

      ast ==> expected
    }
  }
}