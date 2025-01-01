package miniJavaParser

import miniJavaParser.*
import scala.jdk.CollectionConverters._

class Program(classDec: List[ClassDec]) {
    override def toString(): String = s"Program(${classDec.mkString(", ")})"
}

class ClassDec(id: String, body: ClassBody) {
    override def toString(): String = s"ClassDec(${id}, ${body})"
}

class ClassBody() {
    override def toString(): String = s"ClassBody()"
}

def buildAST(program: CompilationUnitContext): Program = {
    val classDecs = program.classDeclaration()
    val classDecASTs = classDecs.asScala.toList.map(classDecAST)
    Program(classDecASTs)
}

def classDecAST(classDecCtx: ClassDeclarationContext): ClassDec = {
    val id = classDecCtx.Identifier().getSymbol().getText()
    ClassDec(id, ClassBody())
}