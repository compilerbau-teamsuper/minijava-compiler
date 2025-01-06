package test

import utest.*
import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams}
import miniJavaParser.{miniJavaLexer, miniJavaParser}

object ParserTest extends TestSuite {
    val tests = Tests {
        test("empty class parsing") {
            val source = CharStreams.fromString("class HelloWorld { }")
            val lexer = new miniJavaLexer(source)
            val tokens = new BufferedTokenStream(lexer)
            val parser = new miniJavaParser(tokens)
            val tree = parser.compilationUnit()
            val expected = 
                "(compilationUnit (typeDeclaration " +
                "(classDeclaration class HelloWorld (classBody { }))) <EOF>)"

            tree.toStringTree(parser) ==> expected
        }
    }
}