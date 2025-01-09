package miniJavaParser

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import _root_.miniJavaParser.Modifier.Public
import _root_.miniJavaParser.Modifier.Abstract
import _root_.miniJavaParser.Modifier.Final
import _root_.miniJavaParser.Modifier.Private
import _root_.miniJavaParser.Modifier.Protected
import _root_.miniJavaParser.Modifier.Static

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
    val modifiers = classDec.modifiers.map(_.opCode).sum
    cw.visit(
        V1_4, modifiers, classDec.name,
        null, "java/lang/Object", new Array[String](0)
    )
    cw.visitEnd()
    cw.toByteArray()
}

extension (m: Modifier) {
  def opCode: Int = m match {
    case Abstract => ACC_ABSTRACT
    case Final => ACC_FINAL
    case Private => ACC_PRIVATE
    case Protected => ACC_PROTECTED
    case Public => ACC_PUBLIC
    case Static => ACC_STATIC
  }
}