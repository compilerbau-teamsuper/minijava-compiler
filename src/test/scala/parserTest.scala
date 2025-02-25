package test

import utest.*
import miniJavaParser.JavaASTBuilder
import miniJavaParser.AST.*

object ParserTest extends TestSuite {
  val tests = Tests {
    test("empty class parsing") {
      val ast = JavaASTBuilder.parseFromText("class HelloWorld { }")
      val expected = CompilationUnit(None,List(),List(ClassDeclaration(List(),"HelloWorld", AmbiguousName(List("Object")), List(),List(
        ConstructorDeclaration(List(), "HelloWorld", List(), Block(List(ReturnStatement(None))))))))

      ast ==> expected
    }
    test("method parsing") { // ToDo: Hier evtl. signature Constructor Parsing mittesten (oder in extra Fields test mit this. Sachen!)
      val ast = JavaASTBuilder.parseFromFile("src/test/java/methodTest.java")
      val expected = CompilationUnit(None,List(), List(ClassDeclaration(List(Modifier.Public),"methodTest", AmbiguousName(List("Object")), List(),List(
        ConstructorDeclaration(List(Modifier.Public), "methodTest", List(), Block(List(ReturnStatement(None)))),
        MethodDeclaration(List(Modifier.Private, Modifier.Static),PrimitiveType.Int,"plusOne",List(Parameter("x",PrimitiveType.Int)),
          Option(Block(List(ReturnStatement(Option(BinaryExpression(VarOrFieldAccess(None, "x"), BinaryOperator.Add, IntLiteral(1)))))))),
        MethodDeclaration(List(Modifier.Public),VoidType,"doNothing",List(),
          Option(Block(List(ReturnStatement(None))))),
        MethodDeclaration(List(),ArrayType(PrimitiveType.Int),"doubleAddOne",List(Parameter("x",PrimitiveType.Int),Parameter("y",PrimitiveType.Int)),
          Option(Block(List(
            VarOrFieldDeclaration(List(),ArrayType(PrimitiveType.Int), "res", ArrayInitializer(List(
              MethodCall(None, "plusOne", List(VarOrFieldAccess(None, "x"))),
              MethodCall(None, "plusOne", List(VarOrFieldAccess(None, "y")))))),
            ReturnStatement(Option(VarOrFieldAccess(None, "res")))))))))))

      ast ==> expected
    }
    test("class/interface parsing") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/classInterfaceTest.java")
      val expected = CompilationUnit(None,List(),List(
        ClassDeclaration(List(),"classInterfaceTest", AmbiguousName(List("Object")), List(),List(
          ConstructorDeclaration(List(), "classInterfaceTest", List(), Block(List(ReturnStatement(None)))),
          ClassDeclaration(List(Modifier.Protected),"subClass", AmbiguousName(List("Object")), List("interfaze"),List(
            ConstructorDeclaration(List(Modifier.Protected), "subClass", List(), Block(List(ReturnStatement(None)))),
            MethodDeclaration(List(Modifier.Public),VoidType,"nothing",List(),
              Option(Block(List()))))),
        ClassDeclaration(List(),"extendClass",AmbiguousName(List("subClass")),List(),List(
          ConstructorDeclaration(List(), "extendClass", List(), Block(List(ReturnStatement(None)))),
          VarOrFieldDeclaration(List(Modifier.Private),PrimitiveType.Boolean,"why", BooleanLiteral(false)))))),
      InterfaceDeclaration(List(), "interfaze", List(), List(
        VarOrFieldDeclaration(List(Modifier.Public),PrimitiveType.Int,"x", IntLiteral(2)),
        MethodDeclaration(List(Modifier.Abstract,Modifier.Public),VoidType,"nothing",List(),None)))))

      ast ==> expected
    }
    test("fields parsing"){
      val ast = JavaASTBuilder.parseFromFile("src/test/java/fieldsTest.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public),"fieldsTest", AmbiguousName(List("Object")), List(),List(
        VarOrFieldDeclaration(List(Modifier.Private),PrimitiveType.Int,"x", IntLiteral(0)),
        VarOrFieldDeclaration(List(Modifier.Protected),PrimitiveType.Boolean,"nah", BooleanLiteral(false)),
        VarOrFieldDeclaration(List(Modifier.Static),ObjectType.String,"s", StringLiteral("s")),
        ConstructorDeclaration(List(), "fieldsTest", List(Parameter("x", PrimitiveType.Int), Parameter("nah", PrimitiveType.Boolean)), Block(List(
          ExpressionStatement(MethodCall(None,"super",List())),
          ExpressionStatement(Assignment(VarOrFieldAccess(Option(ExpressionName(AmbiguousName(List("fieldsTest")))), "x"), VarOrFieldAccess(None, "x"))),
          ExpressionStatement(Assignment(VarOrFieldAccess(Option(ExpressionName(AmbiguousName(List("fieldsTest")))), "nah"), VarOrFieldAccess(None, "nah"))),
          ReturnStatement(None))))))))

      ast ==> expected
    }
    test("calculations parsing") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/calculationsTest.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public),"calculationsTest", AmbiguousName(List("Object")), List(),List(
        ConstructorDeclaration(List(Modifier.Public), "calculationsTest", List(), Block(List(ReturnStatement(None)))),
        VarOrFieldDeclaration(List(),PrimitiveType.Boolean,"f", BinaryExpression(BooleanLiteral(true), BinaryOperator.Or, BooleanLiteral(false))),
        VarOrFieldDeclaration(List(),PrimitiveType.Boolean,"g",
          BinaryExpression(
            BinaryExpression(VarOrFieldAccess(None, "f"), BinaryOperator.Xor, BooleanLiteral(true)),
          BinaryOperator.Xor,
          BinaryExpression(
            BinaryExpression(
              MethodCall(None, "alwaysTrue", List()),
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
              MethodCall(None, "alwaysOne", List()),
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
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "statementsTest1", AmbiguousName(List("Object")), List(), List(
        ConstructorDeclaration(List(Modifier.Public), "statementsTest1", List(), Block(List(ReturnStatement(None)))),
        MethodDeclaration(List(), VoidType, "forTest", List(), Option(Block(List(
          Block(List(
            VarOrFieldDeclaration(List(), PrimitiveType.Int, "i", IntLiteral(0)),
            WhileStatement(
              BinaryExpression(VarOrFieldAccess(None, "i"), BinaryOperator.Less, IntLiteral(5)),
            Block(List(
              ExpressionStatement(Assignment(VarOrFieldAccess(None, "i"), BinaryExpression(VarOrFieldAccess(None, "i"), BinaryOperator.Subtract, IntLiteral(1)))),
            BreakStatement()))))),
          Block(List(
            VarOrFieldDeclaration(List(), PrimitiveType.Int, "i", IntLiteral(0)),
            WhileStatement(
              BinaryExpression(VarOrFieldAccess(None, "i"), BinaryOperator.Less, IntLiteral(5)),
            Block(List(
              IfStatement(
                BinaryExpression(VarOrFieldAccess(None, "i"), BinaryOperator.Equals , IntLiteral(2)),
              Block(List(
                ExpressionStatement(Assignment(VarOrFieldAccess(None, "i"), BinaryExpression(VarOrFieldAccess(None, "i"), BinaryOperator.Add, IntLiteral(1)))),
              ContinueStatement())),
            None),
            ExpressionStatement(Assignment(VarOrFieldAccess(None, "i"), BinaryExpression(VarOrFieldAccess(None, "i"), BinaryOperator.Add, IntLiteral(1))))))))))))),
      MethodDeclaration(List(), VoidType, "whileTest", List(), Option(Block(List(
        VarOrFieldDeclaration(List(), PrimitiveType.Boolean, "loopVar", BooleanLiteral(true)),
        WhileStatement(
          VarOrFieldAccess(None, "loopVar"),
          Block(List(
            ExpressionStatement(MethodCall(None, "forTest", List())),
            ExpressionStatement(Assignment(VarOrFieldAccess(None, "loopVar"), BinaryExpression(VarOrFieldAccess(None, "loopVar"), BinaryOperator.And, BooleanLiteral(false)))),
            ContinueStatement())))))))))))

      ast ==> expected
    }
    test("statements parsing 2") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/statementsTest2.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "statementsTest2", AmbiguousName(List("Object")), List(), List(
        ConstructorDeclaration(List(Modifier.Public), "statementsTest2", List(), Block(List(ReturnStatement(None)))),
        MethodDeclaration(List(), VoidType, "ifTest", List(), Option(Block(List(
          IfStatement(
            BinaryExpression(IntLiteral(5), BinaryOperator.GreaterOrEqual, IntLiteral(4)),
            Block(List(Block(List()))),
            Option(Block(List(
              IfStatement(BooleanLiteral(true), Block(List(ReturnStatement(None))), None)
            )))))))),
        MethodDeclaration(List(), VoidType, "assignmentTest", List(), Option(Block(List(
          VarOrFieldDeclaration(List(), PrimitiveType.Boolean, "b", BooleanLiteral(false)),
          ExpressionStatement(Assignment(VarOrFieldAccess(None, "b"), BooleanLiteral(true))),
          ExpressionStatement(Assignment(VarOrFieldAccess(None, "b"), BinaryExpression(VarOrFieldAccess(None, "b"), BinaryOperator.Or, BooleanLiteral(false)))),
          VarOrFieldDeclaration(List(), PrimitiveType.Int, "x", IntLiteral(1)),
          ExpressionStatement(Assignment(VarOrFieldAccess(None, "x"), BinaryExpression(VarOrFieldAccess(None, "x"), BinaryOperator.Multiply, IntLiteral(4)))),
        ExpressionStatement(Assignment(VarOrFieldAccess(None, "x"), BinaryExpression(VarOrFieldAccess(None, "x"), BinaryOperator.Modulo, IntLiteral(2))))))))))))

      ast ==> expected
    }
    test("array Test") {
      val ast = JavaASTBuilder.parseFromFile("src/test/java/arrayTest.java")
      val expected = CompilationUnit(None, List(), List(ClassDeclaration(List(Modifier.Public), "arrayTest", AmbiguousName(List("Object")), List(), List(
        ConstructorDeclaration(List(Modifier.Public), "arrayTest", List(), Block(List(ReturnStatement(None)))),
        VarOrFieldDeclaration(List(), ArrayType(PrimitiveType.Int), "numbers", ArrayInitializer(List(IntLiteral(1), IntLiteral(2), IntLiteral(3)))),
        VarOrFieldDeclaration(List(), ArrayType(ObjectType.String), "mail", NewArray(ObjectType.String, IntLiteral(3))),
        MethodDeclaration(List(), ArrayType(ObjectType.String), "makeMail", List(), Option(Block(List(
          VarOrFieldDeclaration(List(), ArrayType(ObjectType.String), "mailref", VarOrFieldAccess(None, "mail")),
          ExpressionStatement(Assignment(ArrayAccess(VarOrFieldAccess(None, "mailref"), IntLiteral(0)), StringLiteral("Servus"))),
          ExpressionStatement(Assignment(ArrayAccess(VarOrFieldAccess(None, "mailref"), IntLiteral(1)), StringLiteral("nix"))),
          ExpressionStatement(Assignment(ArrayAccess(VarOrFieldAccess(None, "mailref"), IntLiteral(2)), ArrayAccess(VarOrFieldAccess(None, "mailref"), IntLiteral(0)))),
          ReturnStatement(Option(VarOrFieldAccess(None, "mailref")))))))))))

      ast ==> expected
    }
  }
}