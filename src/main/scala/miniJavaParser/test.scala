package miniJavaParser

import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams}

@main
def main(): Unit = {
  val source = CharStreams.fromString("if (true) return 1;")
  val lexer = new miniJavaLexer(source)
  val tokens = new BufferedTokenStream(lexer)
  val parser = new miniJavaParser(tokens)
  val tree = parser.statement()
  print(tree.toStringTree(parser))
}
