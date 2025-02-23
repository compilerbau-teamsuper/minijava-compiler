## Usage

1. [Install sbt](https://www.scala-sbt.org/download/)
2. Open the repository folder in the terminal and run the command `sbt`
3. After `sbt` has started, run the compiler with `run SRC DEST`, where `SRC` is the source file you want to compile, and `DEST` is the folder to which the class file will get written.

Examples:

```
sbt:minijava-compiler> run src/test/java/calculationsTest.java .
```

```
sbt:minijava-compiler> run src/test/java/calculationsTest.java src/test
```

## UML

Click on it to see more! For reference look at [this file](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/parserAST/src/main/scala/miniJavaParser/AST.scala).

![AST UML](http://www.plantuml.com/plantuml/proxy?cache=no&fmt=svg&src=https://raw.githubusercontent.com/compilerbau-teamsuper/minijava-compiler/parserAST/UML/UML.puml)

## Task Distribution

Luca Dürr was responsible for scanning and parsing. He wrote his own [mini java grammar](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/parserAST/src/main/java/miniJavaParser/miniJava.g4) and the [Abstract Syntax](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/parserAST/src/main/scala/miniJavaParser/AST.scala).
Using the generated ANTLR Recognizer, he wrote the [parser](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/parserAST/src/main/scala/miniJavaParser/parser.scala) in scala where he desugared some of the features of java: 
- Transformed for to while loops with support of continue statements
- Desugared assignments like "x += 1" to "x = x + 1"
- Removed unary expressions by converting them to binary expressions
- Converted multiple variable declaration in one line like "int x, y, z" to a list of variable declarations 
- Adding Object as superclass when not defined
- Adding Constructor when not defined
- Resolving this and super depending on context

He also wrote [tests](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/parserAST/src/test/scala/parserTest.scala) for the parser using the test [java files](https://github.com/compilerbau-teamsuper/minijava-compiler/tree/parserAST/src/test/java) he created.