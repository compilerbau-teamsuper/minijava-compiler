package test

import miniJavaParser.JavaASTBuilder
import miniJavaAnalysis.typecheck
import miniJavaBytecode.codeGen
import java.io.StringWriter

def endToEndFixture(fileName: String): Unit = {
    def removeSpacesAndComments(str: String): String = {
        val noSpace = str.filterNot(_.isWhitespace)
        val lines = noSpace.linesWithSeparators
        lines.filter(_.startsWith("//")).mkString
    }
    val srcPath = s"src/test/java/$fileName.java"
    val expectedPath = s"src/test/out/$fileName.out"
    val ast = JavaASTBuilder.parseFromFile(srcPath)
    val (_, writer): (Array[Byte], StringWriter) = typecheck(ast).codeGen()
    val generatedClass = writer.toString()
    val expectedContents: String = os.read(expectedPath)
    assert(
        removeSpacesAndComments(generatedClass) == removeSpacesAndComments(expectedContents)
    )
}

object endToEnd extends TestSuite {
    val tests = Tests {
        test("simpleTypeTest") - endToEndFixture("simpleTypeTest")
    }
}