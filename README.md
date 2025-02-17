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
