package miniJavaParser

import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams}

@main
def main(): Unit = {
  val source = CharStreams.fromString("class HelloWorld { }")
  val lexer = new miniJavaLexer(source)
  val tokens = new BufferedTokenStream(lexer)
  val parser = new miniJavaParser(tokens)
  val tree = parser.compilationUnit()
  println(tree.toStringTree(parser))
  
  val astBuilder = new ASTBuilderVisitor()
  val ast = astBuilder.visitCompilationUnit(tree)
  println(ast.toString())
  
  val byteArray = codeGen(ast)
  val wd = os.pwd/"out"
  os.write.over(wd/"HelloWorld.class", byteArray)
}
