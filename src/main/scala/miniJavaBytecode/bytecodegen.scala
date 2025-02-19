package miniJavaBytecode

import miniJavaAnalysis.IR.*
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Type.*
import org.objectweb.asm.util.{CheckClassAdapter, TraceClassVisitor}
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.MethodVisitor
import java.io.{PrintWriter, File}

val JAVA_VERSION = V1_4
val OBJECT = "java/lang/Object"
val NO_GENERICS = null
val NO_CONSTANT = null
val NO_INTERFACES = null
val NO_EXCEPTIONS = null

extension(classfile: ClassFile) {
    def codeGen(): Array[Byte] = {
        val cw = new ClassWriter(
            ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES
        )
        val pw = new PrintWriter(new File("debug.txt"))
        val trace = new TraceClassVisitor(cw, pw)
        val cv = new CheckClassAdapter(trace)
        cv.visit(
            JAVA_VERSION, ACC_PUBLIC, classfile.name, 
            NO_GENERICS, OBJECT, NO_INTERFACES
        )
        
        for(field <- classfile.fields) field.codeGen(cv)

        for(method <- classfile.methods) method.codeGen(cv)

        return cw.toByteArray()
    }
}

extension(field: Field) {
    def codeGen(cw: CheckClassAdapter): Unit = {
        cw.visitField(
            ACC_PUBLIC, field.name, field.ty.descriptor(), NO_GENERICS, NO_CONSTANT
        ).visitEnd()
    }
}

extension(method: Method) {
    def codeGen(cw: CheckClassAdapter): Unit = {
        val mv = cw.visitMethod(
            ACC_PUBLIC, method.name, method.ty.descriptor(), 
            NO_GENERICS, NO_EXCEPTIONS 
        )
        mv.visitCode()
        for(instruction <- method.code.get.code) {
            instruction.translate(mv)
        }
        //We set the flag COMPUTE_MAXS, so the arguments here are ignored
        mv.visitMaxs(0, 0)
        mv.visitEnd()
    }
}

extension(statement: TypedStatement) {
    def translate(mv: MethodVisitor): Unit = statement match {
        case ExpressionStatement(expression) => expression.translate(mv)
        case ReturnStatement(expression) => expression match {
            case Some(expression) => 
                expression.translate(mv)
                val instruction = expression.ty match {
                    case PrimitiveType.Int => IRETURN
                    case _ => ???
                }
                mv.visitInsn(instruction)
            case None => mv.visitInsn(RETURN)
        }
        case _ => ???
    }
}

extension(expression: TypedExpression) {
    def translate(mv: MethodVisitor): Unit = expression match {
        case LoadLocal(local_ty, index) =>
            val instruction = local_ty match {
                case PrimitiveType.Int => ILOAD
                case ObjectType(_) => ALOAD 
                case _ => ???
            }
            mv.visitVarInsn(instruction, index)
        case DupStoreLocal(index, value) =>
            value.translate(mv) 
            val instruction = value.ty match {
                case PrimitiveType.Int => ISTORE
                case _ => ??? 
            }
            mv.visitVarInsn(instruction, index)
        case GetField(field_ty, name, target) => 
            target.translate(mv)
            mv.visitFieldInsn(
                GETFIELD, target.ty.internalName(),
                name, field_ty.descriptor()
            )
        case DupPutField(name, target, value) =>
            target.translate(mv)
            value.translate(mv)
            mv.visitFieldInsn(
                PUTFIELD, target.ty.internalName(),
                name, value.ty.descriptor()
            )
        case InvokeSpecial(return_ty, name, target, args) =>
            target.translate(mv)
            args.foreach(_.translate(mv))
            val argTypes = args.map(_.ty)
            mv.visitMethodInsn(
                INVOKESPECIAL, target.ty.internalName(),
                name, MethodType(argTypes, return_ty).descriptor()
            )
        case IntLikeLiteral(_, value) => value match {
            case -1 => mv.visitInsn(ICONST_M1)
            case 0 => mv.visitInsn(ICONST_0)
            case 1 => mv.visitInsn(ICONST_1)
            case 2 => mv.visitInsn(ICONST_2)
            case 3 => mv.visitInsn(ICONST_3)
            case 4 => mv.visitInsn(ICONST_4)
            case 5 => mv.visitInsn(ICONST_5)
            case i if i >= -128 && i <= 127 =>
                mv.visitIntInsn(BIPUSH, i)
            case i if i >= -32768 && i <= 32767 =>
                mv.visitIntInsn(SIPUSH, i)
            case i => mv.visitIntInsn(LDC, i)
        }
        case _ => ???
    }
}

extension(typ: Type) {
    def descriptor(): String = typ.asmType().getDescriptor()

    def internalName(): String = typ.asmType().getInternalName()

    def asmType(): org.objectweb.asm.Type = typ match {
        case PrimitiveType.Int => INT_TYPE
        case VoidType => VOID_TYPE
        case ObjectType(name) => getObjectType(name.replace('.', '/'))
        case _ => ???
    }
}

extension(methodType: MethodType) {
    def descriptor(): String = 
        getMethodDescriptor(
            methodType.ret.asmType(), 
            methodType.params.map(_.asmType()): _*
        )
}
