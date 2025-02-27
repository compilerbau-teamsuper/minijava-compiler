package main

import scala.io.Source.fromFile
import miniJavaParser.JavaASTBuilder
import miniJavaAnalysis.typecheck
import miniJavaBytecode.codeGen
import java.io.{DataOutputStream, FileOutputStream, File}
import miniJavaParser.AST.ClassDeclaration
import miniJavaParser.AST.InterfaceDeclaration
import miniJavaOptimizer.optimize

def getClassName(ast: miniJavaParser.AST.CompilationUnit): String = {
    ast.typeDeclarations.head match {
        case ClassDeclaration(_, name, _, _, _) => name
        case InterfaceDeclaration(_, name, _, _) => name
    }
}

@main
def main(sourcePath: String, compileFolder: String): Unit = {
    val ast = JavaASTBuilder.parseFromFile(sourcePath)
    val ir = typecheck(ast)
    val optimized = ir.copy(methods = ir.methods.map(m => m.copy(code = m.code.map(optimize))))
    val (bytecode, _) = optimized.codeGen()
    val slash = 
        if compileFolder.endsWith("/") || compileFolder.endsWith("\\") then "" 
        else if compileFolder.contains("/") then "/" else "\\"
    val outputPath = compileFolder ++ slash ++ getClassName(ast) ++ ".class"
    val outputStream = new FileOutputStream(new File(outputPath))
    outputStream.write(bytecode)
    outputStream.close()
}
