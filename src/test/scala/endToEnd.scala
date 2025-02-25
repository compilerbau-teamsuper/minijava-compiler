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

def endToEndFixture(className: String, methodsToTest: List[(String, Any)]): Unit = {
    val srcPath = s"src/test/java/$className.java"
    val ast = JavaASTBuilder.parseFromFile(srcPath)
    val typed = typecheck(ast)
    val (bytecode, debug) = typed.codeGen()
    try {
        val clss = Loader.defineClass(className, bytecode)
        methodsToTest.foreach((name, expected) =>
            val method = clss.getMethod(name)
            val result = method.invoke(clss.getConstructor().newInstance())
            result ==> expected
        )
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
        test("simpleTypeTest") 
        - endToEndFixture("simpleTypeTest", List(("noopTest", null)))
    }
}