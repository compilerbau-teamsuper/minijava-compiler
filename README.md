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

Click on it to see more! For reference look at [this file](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/main/scala/miniJavaParser/AST.scala).

![AST UML](http://www.plantuml.com/plantuml/proxy?cache=no&fmt=svg&src=https://raw.githubusercontent.com/compilerbau-teamsuper/minijava-compiler/main/UML/UML.puml)

## Task Distribution

Luca Dürr (Luceleven) was responsible for scanning and parsing. He wrote his own [mini java grammar](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/main/java/miniJavaParser/miniJava.g4) and the [Abstract Syntax](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/main/scala/miniJavaParser/AST.scala).
Using the generated ANTLR Recognizer, he wrote the [parser](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/main/scala/miniJavaParser/parser.scala) in scala where he desugared some of the features of java: 
- Transformed for to while loops with support of continue statements
- Desugared assignments like "x += 1" to "x = x + 1"
- Removed unary expressions by converting them to binary expressions
- Converted multiple variable declaration in one line like "int x, y, z" to a list of variable declarations 
- Adding Object as superclass when not defined
- Adding Constructor when not defined
- Resolving this and super depending on context
- Adding empty return statement to void methods and constructors
- Moving initializing of non-static fields into constructors

He also wrote [tests](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/test/scala/parserTest.scala) for the parser using test [java files](https://github.com/compilerbau-teamsuper/minijava-compiler/tree/main/src/test/java) he created (the files with Test at the end), and he made the UML with plantuml.


###### OriginalCpp (Martin Ilgner):
- [miniJavaBytecode](https://github.com/compilerbau-teamsuper/minijava-compiler/tree/main/src/main/scala/miniJavaBytecode) package
- whole [CLI](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/main/scala/main.scala)
- [user documentation](#Usage)
- [continuous integration](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/.github/workflows/scala.yaml) setup
- [end-to-end tests](https://github.com/compilerbau-teamsuper/minijava-compiler/blob/main/src/test/scala/endToEnd.scala)
- several fixes in the other packages (please see the commit history for this)
