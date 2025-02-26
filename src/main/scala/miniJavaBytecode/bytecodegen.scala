package miniJavaBytecode

import org.objectweb.asm.{ClassVisitor, ClassWriter, MethodVisitor}
import org.objectweb.asm.Type.*
import org.objectweb.asm.util.{CheckClassAdapter, TraceClassVisitor}
import org.objectweb.asm.Opcodes.*
import java.io.{PrintWriter, File, StringWriter}
import miniJavaAnalysis.IR.*
import miniJavaAnalysis.IR.Comparison.*
import miniJavaAnalysis.IR.BinaryOperator.*
import org.objectweb.asm.Label

val JAVA_VERSION = V1_4
val OBJECT = "java/lang/Object"
val NO_GENERICS = null
val NO_CONSTANT = null
val NO_INTERFACES = null
val NO_EXCEPTIONS = null
val NO_MODIFIERS = 0

extension(classfile: ClassFile) {
    def codeGen(): (Array[Byte], String) = {
        val cw = new ClassWriter(
            ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES
        )
        val sw = new StringWriter()
        val pw = new PrintWriter(sw)
        val cv = new TraceClassVisitor(cw, pw)
        //val cv = new CheckClassAdapter(trace)

        cv.visit(
            JAVA_VERSION, NO_MODIFIERS, classfile.name.internalName(), 
            NO_GENERICS, OBJECT, NO_INTERFACES
        )

        for(field <- classfile.fields) field.codeGen(cv)

        for(method <- classfile.methods) method.codeGen(cv)

        cv.visitEnd()
        pw.flush()

        return (cw.toByteArray(), sw.toString())
    }
}

extension(field: Field) {
    def codeGen(cv: ClassVisitor): Unit = {
        cv.visitField(
            field.mod.translate(), field.name, field.ty.descriptor(), 
            NO_GENERICS, NO_CONSTANT
        ).visitEnd()
    }
}

extension(method: Method) {
    def codeGen(cv: ClassVisitor): Unit = {
        val mv = cv.visitMethod(
            method.mod.translate(), method.name, method.ty.descriptor(), 
            NO_GENERICS, NO_EXCEPTIONS 
        )
        mv.visitCode()
        for(statement <- method.code.map(_.code).get) {
            statement.translate(mv, None, None)
        }
        //We have set the flag COMPUTE_MAXS, so the arguments here are ignored
        mv.visitMaxs(4, 2)
        mv.visitEnd()
    }
}

extension(statement: TypedStatement) {
    def translate(
        mv: MethodVisitor,
        continueLabel: Option[Label], 
        breakLabel: Option[Label]
    ): Unit = statement match {
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
        case IfStatement(cmp, left, right, thenStmt, elseStmt) =>
            val thenLabel = new Label()
            val endLabel = new Label()
            left.translate(mv)
            right.translate(mv)
            val cmpInsn = cmp.instruction()
            //Branch
            mv.visitJumpInsn(cmpInsn, thenLabel)
            //Else
            elseStmt.foreach(_.translate(mv, continueLabel, breakLabel))
            mv.visitJumpInsn(GOTO, endLabel)
            //Then
            mv.visitLabel(thenLabel)
            thenStmt.foreach(_.translate(mv, continueLabel, breakLabel))
            //End
            mv.visitLabel(endLabel)
        case BreakStatement =>
            mv.visitJumpInsn(GOTO, breakLabel.get)
        case ContinueStatement =>
            mv.visitJumpInsn(GOTO, continueLabel.get)
        case WhileStatement(cmp, left, right, body) =>
            val startLabel = new Label()
            val bodyLabel = new Label()
            val endLabel = new Label()
            left.translate(mv)
            right.translate(mv)
            val cmpInsn = cmp.instruction()
            mv.visitLabel(startLabel)
            mv.visitJumpInsn(cmpInsn, bodyLabel)
            mv.visitJumpInsn(GOTO, endLabel)
            mv.visitLabel(bodyLabel)
            body.foreach(_.translate(mv, Some(startLabel), Some(endLabel)))
            mv.visitJumpInsn(GOTO, startLabel)
            mv.visitLabel(endLabel)
        case InfiniteWhileStatement(body) => 
            val infiniteLabel = new Label()
            val breakOutLabel = new Label()
            mv.visitLabel(infiniteLabel)
            body.foreach(_.translate(mv, Some(infiniteLabel), Some(breakOutLabel)))
            mv.visitJumpInsn(GOTO, infiniteLabel)
            mv.visitLabel(breakOutLabel)
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
        case GetField(field_ty, of, name, target) => 
            target.translate(mv)
            mv.visitFieldInsn(
                GETFIELD, of.internalName(),
                name, field_ty.descriptor()
            )
        case DupPutField(of, name, target, value) =>
            target.translate(mv)
            value.translate(mv)
            val dupInsn = if value.ty.isCategoryTwo() then DUP2_X1 else DUP_X1
            mv.visitInsn(dupInsn) 
            mv.visitFieldInsn(
                PUTFIELD, of.internalName(),
                name, value.ty.descriptor()
            )
        case GetStatic(field_ty, of, name) =>
            mv.visitFieldInsn(
                GETSTATIC, of.internalName(),
                name, field_ty.descriptor()
            )
        case DupPutStatic(of, name, value) =>
            value.translate(mv)
            val dupInsn = if value.ty.isCategoryTwo() then DUP2 else DUP
            mv.visitInsn(dupInsn)
            mv.visitFieldInsn(
                PUTSTATIC, of.internalName(),
                name, value.ty.descriptor()
            )

        case InvokeStatic(of, name, mty, args) =>
            args.foreach(_.translate(mv))
            mv.visitMethodInsn(
                INVOKESTATIC, of.internalName(),
                name, mty.descriptor()
            )
            if (mty.ret == VoidType) then mv.visitInsn(ICONST_0)
        case InvokeSpecial(of, name, mty, target, args) =>
            target.translate(mv)
            args.foreach(_.translate(mv))
            mv.visitMethodInsn(
                INVOKESPECIAL, of.internalName(),
                name, mty.descriptor()
            )
            if (mty.ret == VoidType) then mv.visitInsn(ICONST_0)
        case InvokeInterface(of, name, mty, target, args) =>
            target.translate(mv)
            args.foreach(_.translate(mv))
            mv.visitMethodInsn(
                INVOKEINTERFACE, of.internalName(),
                name, mty.descriptor()
            )
        case InvokeVirtual(of, name, mty, target, args) =>
            target.translate(mv)
            args.foreach(_.translate(mv))
            mv.visitMethodInsn(
                INVOKEVIRTUAL, of.internalName(),
                name, mty.descriptor()
            )
        case New(of) => mv.visitTypeInsn(NEW, of.internalName())
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
            case i => mv.visitLdcInsn(i)
        }
        case LongLiteral(value) => value match {
            case 0L => mv.visitInsn(LCONST_0)
            case 1L => mv.visitInsn(LCONST_1)
            case l => mv.visitLdcInsn(l) 
        }
        case FloatLiteral(value) => value match {
            case 0.0f => mv.visitInsn(FCONST_0)
            case 1.0f => mv.visitInsn(FCONST_1)
            case 2.0f => mv.visitInsn(FCONST_2)
            case f => mv.visitLdcInsn(f)
        }
        case DoubleLiteral(value) => value match {
            case 0.0d => mv.visitInsn(DCONST_0)
            case 1.0d => mv.visitInsn(DCONST_1)
            case d => mv.visitLdcInsn(d)
        }
        case StringLiteral(value) =>
            mv.visitLdcInsn(value)
        case NullLiteral =>
            mv.visitInsn(ACONST_NULL)
        case Convert(to, value) =>
            def conversionError(): Nothing = {
                throw IllegalArgumentException(
                    s"Illegal conversion from ${value.ty} to $to"
                )
            }
            value.translate(mv)
            def intConversionInsn() = to match {
                case PrimitiveType.Byte => I2B
                case PrimitiveType.Char => I2C
                case PrimitiveType.Double => I2D
                case PrimitiveType.Float => I2F
                case PrimitiveType.Long => I2L
                case PrimitiveType.Short => I2S
                case PrimitiveType.Int => conversionError()
            }
            val instructions = value.ty match {
                case _: IntLikeType => List(intConversionInsn())
                case PrimitiveType.Long => to match {
                    case _: IntLikeType =>
                        List(L2I, intConversionInsn())
                    case PrimitiveType.Double => List(L2D)
                    case PrimitiveType.Float => List(L2F)
                    case PrimitiveType.Long => conversionError()
                }
                case PrimitiveType.Float => to match {
                    case _: IntLikeType =>
                        List(F2I, intConversionInsn())
                    case PrimitiveType.Double => List(F2D)
                    case PrimitiveType.Long => List(F2L)
                    case PrimitiveType.Float => conversionError()
                }
                case PrimitiveType.Double => to match {
                    case _: IntLikeType =>
                        List(D2I, intConversionInsn())
                    case PrimitiveType.Long => List(D2L)
                    case PrimitiveType.Float => List(D2F)
                    case PrimitiveType.Double => conversionError()
                }
                case ObjectType(name) => conversionError()
                case NullType => conversionError()
                case VoidType => conversionError()
            }
            instructions.foreach(insn => mv.visitInsn(insn))
        case INeg(value) => translateNeg(mv, value)
        case LNeg(value) => translateNeg(mv, value)
        case DNeg(value) => translateNeg(mv, value)
        case FNeg(value) => translateNeg(mv, value)
        case IBinOp(left, op, right) => translateBinOp(mv, left, op, right)
        case LBinOp(left, op, right) => translateBinOp(mv, left, op, right)
        case DBinOp(left, op, right) => translateBinOp(mv, left, op, right)
        case FBinOp(left, op, right) => translateBinOp(mv, left, op, right)
        case LCmp(left, right) => 
            left.translate(mv)
            right.translate(mv)
            mv.visitInsn(LCMP)
        case DCmpL(left, right) => 
            left.translate(mv)
            right.translate(mv)
            mv.visitInsn(DCMPL)
        case DCmpG(left, right) => 
            left.translate(mv)
            right.translate(mv)
            mv.visitInsn(DCMPG)
        case FCmpL(left, right) => 
            left.translate(mv)
            right.translate(mv)
            mv.visitInsn(FCMPL)
        case FCmpG(left, right) => 
            left.translate(mv)
            right.translate(mv)
            mv.visitInsn(FCMPG)
        case Ternary(_, cmp, left, right, yes, no) =>
            val yesLabel = new Label()
            val endLabel = new Label()
            left.translate(mv)
            right.translate(mv)
            val cmpInsn = cmp.instruction()
            //Branch
            mv.visitJumpInsn(cmpInsn, yesLabel)
            //no case
            no.translate(mv)
            mv.visitJumpInsn(GOTO, endLabel)
            //yes case
            mv.visitLabel(yesLabel)
            yes.translate(mv)
            //end
            mv.visitLabel(endLabel)
    }
}

def translateNeg(mv: MethodVisitor, value: TypedExpression): Unit = {
    value.translate(mv)
    val instruction = value.ty.asmType().getOpcode(INEG)
    mv.visitInsn(instruction)
}

def translateBinOp(
    mv: MethodVisitor,
    left: TypedExpression, 
    op: BinaryOperator, 
    right: TypedExpression
): Unit = {
    left.translate(mv)
    right.translate(mv)
    val intInsn = op match {
        case Add => IADD
        case Sub => ISUB
        case Mul => IMUL
        case Div => IDIV
        case And => IAND
        case Or => IOR
        case Xor => IXOR
        case Mod => IREM
    }
    val instruction = left.ty.asmType().getOpcode(intInsn)
    mv.visitInsn(instruction)
}

extension(cmp: Comparison) {
    def instruction(): Int = cmp match {
        case ACmpEq => IF_ACMPEQ
        case ACmpNe => IF_ACMPNE
        case ICmpEq => IF_ICMPEQ
        case ICmpGe => IF_ICMPGE
        case ICmpGt => IF_ICMPGT
        case ICmpLe => IF_ICMPLE
        case ICmpLt => IF_ICMPLT
        case ICmpNe => IF_ICMPNE
    }
}

extension(name: ClassName) {
    def internalName(): String = name.path.mkString("/")
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
        case ObjectType(name) => getObjectType(name.internalName())
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

extension(mods: Modifiers) {
    def translate(): Int = {
        val modifiers = List(
            mods.pub, mods.priv, mods.prot,
            mods.abstr, mods.stat, mods.fin
        )
        val asmModifiers = List(
            ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, 
            ACC_ABSTRACT, ACC_STATIC, ACC_FINAL
        )
        modifiers.zip(asmModifiers).foldRight(0){
            case ((modFlag, asmFlag), z) =>
                z | (if modFlag then asmFlag else 0)
        }
    }
}
