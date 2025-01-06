package miniJavaParser

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*

def codeGen(comp: CompilationUnit): Array[Byte] = {
    comp.typeDeclarations.find(x => x match {
      case _: ClassDeclaration => true
      case _ => false
    }) match
      case Some(v) => v match {case c: ClassDeclaration => codeGen(c)}
      case None => null
}

def codeGen(classDec: ClassDeclaration): Array[Byte] = {
    val cw = new ClassWriter(0)
    cw.visit(
        V1_4, ACC_PUBLIC, classDec.name,
        null, "java/lang/Object", new Array[String](0)
    )
    cw.visitEnd()
    cw.toByteArray()
}