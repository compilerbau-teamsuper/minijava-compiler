package miniJavaParser

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*

def codeGen(program: Program): Array[Byte] = {
    val byteArray = codeGen(program.getClassDec())
    byteArray
}

def codeGen(classDec: ClassDec): Array[Byte] = {
    val cw = new ClassWriter(0)
    cw.visit(
        V1_4, ACC_PUBLIC, classDec.getId(), 
        null, "java/lang/Object", new Array[String](0)
    )
    cw.visitEnd()
    cw.toByteArray()
}