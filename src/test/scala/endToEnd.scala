package test

import utest.*
import miniJavaParser.JavaASTBuilder
import miniJavaAnalysis.typecheck
import miniJavaBytecode.codeGen
import java.io.StringWriter
import java.lang.ClassLoader
import java.lang.reflect.Method

object Loader extends ClassLoader {
    def defineClass(name: String, bytecode: Array[Byte]): Class[?] = {
        defineClass(name, bytecode, 0, bytecode.length)
    }
}

case class MethodTest(
    name: String, 
    arguments: List[Object],
    argumentTypes: List[Class[?]], 
    expectedResult: Object
)

case class FieldTest(name: String, expectedValue: Object)

case class ClassTest(name: String, actions: List[MethodTest | FieldTest])

def isSame(result: Object, expected: Object): Boolean = (result, expected) match {
    case (r: Array[?], e: Array[?]) => r.sameElements(e) 
    case _ => result == expected
}

def endToEndFixture(toTest: ClassTest): Unit = {
    val srcPath = s"src/test/java/${toTest.name}.java"
    val ast = JavaASTBuilder.parseFromFile(srcPath)
    val typed = try {
        typecheck(ast)
    } catch {
        case e =>
            println(s"AST:\n$ast")
            throw e
    }
    
    val (bytecode, debug) = typed.codeGen()
    try {
        val clss = Loader.defineClass(toTest.name, bytecode)
        val constructor = clss.getDeclaredConstructor();
        constructor.setAccessible(true);
        val instance = constructor.newInstance();
        toTest.actions.foreach{ 
            case MethodTest(toCall, args, argTypes, expected) =>
                val method = try { 
                    clss.getDeclaredMethod(toCall, argTypes: _*) 
                } catch {
                    case e: java.lang.NoSuchMethodException =>
                        throw java.lang.NoSuchMethodException(
                            s"${e.getMessage()}. Available methods: " +
                            s"${clss.getDeclaredMethods().mkString(", ")}"
                        )
                }
                method.setAccessible(true)
                val result = method.invoke(instance, args: _*)
                if (!isSame(result, expected)) {
                    throw new java.lang.AssertionError(
                        s"Call of $toCall " +
                        (if args.nonEmpty then 
                            s"with arguments ${args.mkString(", ")}" 
                         else "") +
                        s"resulted in $result, expected $expected"
                    )
                }
            case FieldTest(name, expected) =>
                val field = clss.getDeclaredField(name)
                field.setAccessible(true)
                val result = field.get(instance)
                if (!isSame(result, expected)) {
                    throw new java.lang.AssertionError(
                        s"Access of field $name resulted in value $result, " +
                        s"expected $expected"
                    )
                }
        }
    } catch {
        case e =>
            println(s"Generated Class:\n$debug")
            println(s"AST:\n$ast")
            println(s"Typed AST:\n$typed")
            throw e
    }
}

object endToEnd extends TestSuite {
    val tests = Tests {
        test("simpleTypeTest") - endToEndFixture(ClassTest(
            "simpleTypeTest",
            List(
                MethodTest("noopTest", Nil, Nil, null),
                MethodTest("assignmentTest", Nil, Nil, Integer(1)),
                MethodTest("invokeGetField", Nil, Nil, Integer(0)),
                FieldTest("field", Integer(0))
            )
        ))
        test("SimpleIf") - endToEndFixture(ClassTest(
            "SimpleIf",
            List(
                MethodTest("answer", Nil, Nil, Integer(42))
            )
        ))
        test("SimpleWhile") - endToEndFixture(ClassTest(
            "SimpleWhile",
            List(
                MethodTest("six", Nil, Nil, Integer(6))
            )
        ))
        test("Loops") - endToEndFixture(ClassTest(
            "Loops",
            List(
                MethodTest("whileLoop", Nil, Nil, Integer(41)),
                MethodTest("forLoop", Nil, Nil, Integer(41))
            )
        ))
        test("break and continue") - endToEndFixture(ClassTest(
            "BreakContinue",
            List(
                MethodTest("loop", Nil, Nil, Integer(1))
            )
        ))
        test("Math") - endToEndFixture(ClassTest(
            "Math",
            List(
                MethodTest(
                    "facRec", 
                    List(Integer(4)), List(classOf[Int]), 
                    Integer(24)
                ),
                MethodTest(
                    "facImp", 
                    List(Integer(6)), List(classOf[Int]),
                    Integer(720)
                ),
                MethodTest(
                    "circleArea", 
                    List(java.lang.Float(5)), List(classOf[Float]), 
                    java.lang.Float(78.5f)
                )
            )
        ))
        test("Array") - endToEndFixture(ClassTest(
            "FullArray",
            List(
                MethodTest(
                    "setElement",
                    List(Integer(0), Integer(1)),
                    List(classOf[Int], classOf[Int]),
                    Integer(1)
                ),
                MethodTest(
                    "setElement",
                    List(Integer(1), Integer(2)),
                    List(classOf[Int], classOf[Int]),
                    Integer(2)
                ),
                MethodTest(
                    "setElement",
                    List(Integer(2), Integer(3)),
                    List(classOf[Int], classOf[Int]),
                    Integer(3)
                ),
                MethodTest(
                    "getElement",
                    List(Integer(1)),
                    List(classOf[Int]),
                    Integer(2)
                ),
                FieldTest(
                    "array", Array(1, 2, 3)
                )
            )
        ))
        test("Printing") - endToEndFixture(ClassTest(
            "Printing",
            List(
                MethodTest("print42", Nil, Nil, null)
            )
        ))
        test("Demo") - endToEndFixture(ClassTest(
            "Demo",
            List(
                MethodTest(
                    "isPrime", 
                    List(Integer(17)), List(classOf[Int]), 
                    java.lang.Boolean(true)
                ),
                MethodTest(
                    "isPrime", 
                    List(Integer(49)), List(classOf[Int]), 
                    java.lang.Boolean(false)
                ),
                MethodTest(
                    "fib",
                    List(Integer(7)), List(classOf[Int]),
                    Array(0, 1, 1 ,2, 3, 5, 8, 13)
                ),
                MethodTest("conversions", Nil, Nil, java.lang.Double(15.7d))
            )
        ))
    }
}