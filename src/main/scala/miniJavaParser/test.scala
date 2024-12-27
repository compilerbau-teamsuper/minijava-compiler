package miniJavaParser

import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams}

@main
def main(): Unit = {
  val source = CharStreams.fromString("class HelloWorld { }")
  val lexer = new miniJavaLexer(source)
  val tokens = new BufferedTokenStream(lexer)
  val parser = new miniJavaParser(tokens)
  val tree = parser.compilationUnit()
  print(tree.toStringTree(parser))
}
