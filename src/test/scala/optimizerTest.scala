package test

import miniJavaAnalysis.IR.* 
import miniJavaOptimizer.*
import utest.*
import miniJavaParser.AST.BinaryOperator.*

object OptimizerTest extends TestSuite {
    val tests = Tests {
        test("simplify_expr_smoke") {
            val input = IBinOp(IntLiteral(1), Add, IntLiteral(1))
            val output = simplify_expr(input)
            val expected = IntLiteral(2)
            output ==> expected
        }
        test("remove_statement") {
            val input = Code(0, List(ExpressionStatement(BooleanLiteral(false))))
            val output = optimize(input)
            val expected = Code(0, List.empty)
            output ==> expected
        }
        /*test("simplify_if") {
            val input = Code(1, List(IfStatement(BooleanLiteral(false), List(ExpressionStatement(DupStoreLocal(0, IntLiteral(1)))), List.empty)))
            val output = optimize(input)
            val expected = Code(1, List.empty)
            output ==> expected
        }*/
    }
}
