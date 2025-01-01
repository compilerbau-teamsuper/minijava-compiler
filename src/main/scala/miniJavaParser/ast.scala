package miniJavaParser

import miniJavaParser.*
import scala.jdk.CollectionConverters._

class Program(classDec: ClassDec) {
    def getClassDec(): ClassDec = classDec
    override def toString(): String = s"Program(${classDec})"
}

class ClassDec(id: String, body: ClassBody) {
    def getId(): String = id
    def getBody(): ClassBody = body
    override def toString(): String = s"ClassDec(${id}, ${body})"
}

class ClassBody() {
    override def toString(): String = s"ClassBody()"
}

def buildAST(program: CompilationUnitContext): Program = {
    val classDec = program.classDeclaration(0)
    Program(classDecAST(classDec))
}

def classDecAST(classDecCtx: ClassDeclarationContext): ClassDec = {
    val id = classDecCtx.Identifier().getSymbol().getText()
    ClassDec(id, ClassBody())
}