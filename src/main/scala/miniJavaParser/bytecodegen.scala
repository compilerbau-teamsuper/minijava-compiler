package miniJavaParser
import AST.*

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import Modifier.Public
import Modifier.Abstract
import Modifier.Final
import Modifier.Private
import Modifier.Protected
import Modifier.Static

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