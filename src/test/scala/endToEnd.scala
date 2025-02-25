package test

import utest.*
import miniJavaParser.JavaASTBuilder
import miniJavaAnalysis.typecheck
import miniJavaBytecode.codeGen
import java.io.StringWriter

def endToEndFixture(fileName: String): Unit = {
    val srcPath = s"src/test/java/$fileName.java"
    val ast = JavaASTBuilder.parseFromFile(srcPath)
    val (bytecode, writer): (Array[Byte], StringWriter) = typecheck(ast).codeGen()
    //TODO
}

object endToEnd extends TestSuite {
    val tests = Tests {
        test("simpleTypeTest") - endToEndFixture("simpleTypeTest")
    }
}