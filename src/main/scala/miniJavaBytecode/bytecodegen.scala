package miniJavaBytecode

import org.objectweb.asm.{ClassVisitor, ClassWriter, MethodVisitor}
import org.objectweb.asm.Type.*
import org.objectweb.asm.util.{CheckClassAdapter, TraceClassVisitor}
import org.objectweb.asm.Opcodes.*
import java.io.{PrintWriter, File}
import miniJavaAnalysis.IR.*
import miniJavaAnalysis.IR.Comparison.*

val JAVA_VERSION = V1_4
val OBJECT = "java/lang/Object"
val NO_GENERICS = null
val NO_CONSTANT = null
val NO_INTERFACES = null
val NO_EXCEPTIONS = null

//TODO: Modifiers

extension(classfile: ClassFile) {
    def codeGen(): (Array[Byte], PrintWriter) = {
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

        cv.visitEnd()

        return (cw.toByteArray(), pw)
    }
}

extension(field: Field) {
    def codeGen(cv: ClassVisitor): Unit = {
        cv.visitField(
            ACC_PUBLIC, field.name, field.ty.descriptor(), NO_GENERICS, NO_CONSTANT
        ).visitEnd()
    }
}

extension(method: Method) {
    def codeGen(cv: ClassVisitor): Unit = {
        val mv = cv.visitMethod(
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
        case ExpressionStatement(expression) => 
            expression.translate(mv)
            val popInsn = if expression.ty.isCategoryTwo() then POP2 else POP
            mv.visitInsn(popInsn)
        case ReturnStatement(expression) => expression match {
            case Some(expression) => 
                expression.translate(mv)
                val instruction = 
                    expression.ty.asmType().getOpcode(IRETURN)
                mv.visitInsn(instruction)
            case None => mv.visitInsn(RETURN)
        }
    }
}

extension(expression: TypedExpression) {
    def translate(mv: MethodVisitor): Unit = expression match {
        case LoadLocal(local_ty, index) =>
            val instruction = local_ty.asmType().getOpcode(ILOAD)
            mv.visitVarInsn(instruction, index)
        case DupStoreLocal(index, value) =>
            value.translate(mv)
            val dupInsn = if value.ty.isCategoryTwo() then DUP2 else DUP
            mv.visitInsn(dupInsn)
            val storeInsn = value.ty.asmType().getOpcode(ISTORE)
            mv.visitVarInsn(storeInsn, index)
        case GetField(field_ty, name, target) => 
            target.translate(mv)
            mv.visitFieldInsn(
                GETFIELD, target.ty.internalName(),
                name, field_ty.descriptor()
            )
        case DupPutField(name, target, value) =>
            target.translate(mv)
            value.translate(mv)
            val dupInsn = if value.ty.isCategoryTwo() then DUP2_X1 else DUP_X1
            mv.visitInsn(dupInsn) 
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
        case LongLiteral(value) => value match {
            case 0L => mv.visitInsn(LCONST_0)
            case 1L => mv.visitInsn(LCONST_1)
            case l => mv.visitLdcInsn(LDC, l) 
        }
        case FloatLiteral(value) => value match {
            case 0.0f => mv.visitInsn(FCONST_0)
            case 1.0f => mv.visitInsn(FCONST_1)
            case 2.0f => mv.visitInsn(FCONST_2)
            case f => mv.visitLdcInsn(LDC, f)
        }
        case DoubleLiteral(value) => value match {
            case 0.0d => mv.visitInsn(DCONST_0)
            case 1.0d => mv.visitInsn(DCONST_1)
            case d => mv.visitLdcInsn(LDC, d)
        }
    }
}

extension(typ: Type) {
    def descriptor(): String = typ.asmType().getDescriptor()

    def isCategoryTwo(): Boolean = typ match {
        case PrimitiveType.Long | PrimitiveType.Double => true
        case _ => false
    }

    def internalName(): String = typ.asmType().getInternalName()

    def asmType(): org.objectweb.asm.Type = typ match {
        case _: IntLikeType => INT_TYPE
        case PrimitiveType.Long => LONG_TYPE
        case PrimitiveType.Float => FLOAT_TYPE
        case PrimitiveType.Double => DOUBLE_TYPE 
        case VoidType => VOID_TYPE
        case ObjectType(name) => getObjectType(name.replace('.', '/'))
        case NullType => getType(s"L$OBJECT;")
    }
}

extension(methodType: MethodType) {
    def descriptor(): String = 
        getMethodDescriptor(
            methodType.ret.asmType(), 
            methodType.params.map(_.asmType()): _*
        )
}
