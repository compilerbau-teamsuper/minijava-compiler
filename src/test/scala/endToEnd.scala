package test

import utest.*
import miniJavaParser.JavaASTBuilder
import miniJavaAnalysis.typecheck
import miniJavaBytecode.codeGen
import java.io.StringWriter
import java.lang.ClassLoader
import java.lang.reflect.Method

object Loader extends ClassLoader {
    def defineClass(name: String, bytecode: Array[Byte]): Class[?] = {
        defineClass(name, bytecode, 0, bytecode.length)
    }
}

case class MethodTest(
    methodsToCall: List[String],
    expectedResult: Object
)

def endToEndFixture(className: String, methodTests: List[MethodTest]): Unit = {
    val srcPath = s"src/test/java/${className}.java"
    val ast = JavaASTBuilder.parseFromFile(srcPath)
    val typed = typecheck(ast)
    val (bytecode, debug) = typed.codeGen()
    try {
        val clss = Loader.defineClass(className, bytecode)
        val constructor = clss.getDeclaredConstructor();
        constructor.setAccessible(true);
        methodTests.foreach{ case MethodTest(toCall, expected) =>
            val instance = constructor.newInstance();
            val result = toCall.foldLeft(new Object())((z, methodName) =>
                val method = clss.getDeclaredMethod(methodName)
                method.setAccessible(true)
                method.invoke(instance)
            )
            result ==> expected
        }
    } catch {
        case e =>
            println(s"Generated Class:\n$debug")
            println(s"AST:\n$ast")
            println(s"Typed AST:\n$typed")
            throw e
    }
}

object endToEnd extends TestSuite {
    val tests = Tests {
        test("simpleTypeTest") - endToEndFixture("simpleTypeTest", 
            List(
                MethodTest(List("noopTest"), null),
                MethodTest(List("assignmentTest"), Integer(1)),
                MethodTest(List("invokeGetField"), Integer(0))
            )
        )
    }
}