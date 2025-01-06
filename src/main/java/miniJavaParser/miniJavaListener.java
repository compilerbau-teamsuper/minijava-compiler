// Generated from miniJava.g4 by ANTLR 4.13.2
package miniJavaParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(miniJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(miniJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(miniJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(miniJavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(miniJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(miniJavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(miniJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(miniJavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(miniJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(miniJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(miniJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(miniJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(miniJavaParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(miniJavaParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(miniJavaParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(miniJavaParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(miniJavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(miniJavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(miniJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(miniJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(miniJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(miniJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(miniJavaParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(miniJavaParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(miniJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(miniJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(miniJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(miniJavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(miniJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(miniJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(miniJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(miniJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(miniJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(miniJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyStatement(miniJavaParser.MethodBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyStatement(miniJavaParser.MethodBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(miniJavaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(miniJavaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(miniJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(miniJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(miniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(miniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(miniJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(miniJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(miniJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(miniJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(miniJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(miniJavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(miniJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(miniJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(miniJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(miniJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#arrayRead}.
	 * @param ctx the parse tree
	 */
	void enterArrayRead(miniJavaParser.ArrayReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#arrayRead}.
	 * @param ctx the parse tree
	 */
	void exitArrayRead(miniJavaParser.ArrayReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(miniJavaParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(miniJavaParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#calcFunction}.
	 * @param ctx the parse tree
	 */
	void enterCalcFunction(miniJavaParser.CalcFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#calcFunction}.
	 * @param ctx the parse tree
	 */
	void exitCalcFunction(miniJavaParser.CalcFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(miniJavaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(miniJavaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(miniJavaParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(miniJavaParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(miniJavaParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(miniJavaParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(miniJavaParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(miniJavaParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(miniJavaParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(miniJavaParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(miniJavaParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(miniJavaParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#booleanFunction}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunction(miniJavaParser.BooleanFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#booleanFunction}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunction(miniJavaParser.BooleanFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#booleanFunNotEqual}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunNotEqual(miniJavaParser.BooleanFunNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#booleanFunNotEqual}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunNotEqual(miniJavaParser.BooleanFunNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(miniJavaParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(miniJavaParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#greaterEqual}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqual(miniJavaParser.GreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#greaterEqual}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqual(miniJavaParser.GreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#lesser}.
	 * @param ctx the parse tree
	 */
	void enterLesser(miniJavaParser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#lesser}.
	 * @param ctx the parse tree
	 */
	void exitLesser(miniJavaParser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#lesserEqual}.
	 * @param ctx the parse tree
	 */
	void enterLesserEqual(miniJavaParser.LesserEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#lesserEqual}.
	 * @param ctx the parse tree
	 */
	void exitLesserEqual(miniJavaParser.LesserEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(miniJavaParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(miniJavaParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(miniJavaParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(miniJavaParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#inverse}.
	 * @param ctx the parse tree
	 */
	void enterInverse(miniJavaParser.InverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#inverse}.
	 * @param ctx the parse tree
	 */
	void exitInverse(miniJavaParser.InverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#bitwiseFunction}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseFunction(miniJavaParser.BitwiseFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#bitwiseFunction}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseFunction(miniJavaParser.BitwiseFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(miniJavaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(miniJavaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(miniJavaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(miniJavaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(miniJavaParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(miniJavaParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#shiftFunction}.
	 * @param ctx the parse tree
	 */
	void enterShiftFunction(miniJavaParser.ShiftFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#shiftFunction}.
	 * @param ctx the parse tree
	 */
	void exitShiftFunction(miniJavaParser.ShiftFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#leftShift}.
	 * @param ctx the parse tree
	 */
	void enterLeftShift(miniJavaParser.LeftShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#leftShift}.
	 * @param ctx the parse tree
	 */
	void exitLeftShift(miniJavaParser.LeftShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(miniJavaParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(miniJavaParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#unsignedRightShift}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedRightShift(miniJavaParser.UnsignedRightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#unsignedRightShift}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedRightShift(miniJavaParser.UnsignedRightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(miniJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(miniJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(miniJavaParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(miniJavaParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(miniJavaParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(miniJavaParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(miniJavaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(miniJavaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(miniJavaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(miniJavaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(miniJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(miniJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#forControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterForControlStatement(miniJavaParser.ForControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#forControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitForControlStatement(miniJavaParser.ForControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(miniJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(miniJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#forControlStatementList}.
	 * @param ctx the parse tree
	 */
	void enterForControlStatementList(miniJavaParser.ForControlStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#forControlStatementList}.
	 * @param ctx the parse tree
	 */
	void exitForControlStatementList(miniJavaParser.ForControlStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(miniJavaParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(miniJavaParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(miniJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(miniJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(miniJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(miniJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(miniJavaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(miniJavaParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(miniJavaParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(miniJavaParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(miniJavaParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(miniJavaParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(miniJavaParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(miniJavaParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(miniJavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(miniJavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(miniJavaParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(miniJavaParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(miniJavaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(miniJavaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(miniJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(miniJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#assignmentType}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentType(miniJavaParser.AssignmentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#assignmentType}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentType(miniJavaParser.AssignmentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrVoid(miniJavaParser.TypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrVoid(miniJavaParser.TypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterStringObject(miniJavaParser.StringObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitStringObject(miniJavaParser.StringObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ByteObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterByteObject(miniJavaParser.ByteObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ByteObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitByteObject(miniJavaParser.ByteObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterShortObject(miniJavaParser.ShortObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitShortObject(miniJavaParser.ShortObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerObject(miniJavaParser.IntegerObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerObject(miniJavaParser.IntegerObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterFloatObject(miniJavaParser.FloatObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitFloatObject(miniJavaParser.FloatObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleObject(miniJavaParser.DoubleObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleObject(miniJavaParser.DoubleObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanObject(miniJavaParser.BooleanObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanObject(miniJavaParser.BooleanObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterCharacterObject(miniJavaParser.CharacterObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitCharacterObject(miniJavaParser.CharacterObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(miniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(miniJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterByteType(miniJavaParser.ByteTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitByteType(miniJavaParser.ByteTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterShortType(miniJavaParser.ShortTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitShortType(miniJavaParser.ShortTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(miniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(miniJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(miniJavaParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(miniJavaParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(miniJavaParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(miniJavaParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(miniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(miniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(miniJavaParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(miniJavaParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(miniJavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(miniJavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Public}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterPublic(miniJavaParser.PublicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Public}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitPublic(miniJavaParser.PublicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Private}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterPrivate(miniJavaParser.PrivateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Private}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitPrivate(miniJavaParser.PrivateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Protected}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterProtected(miniJavaParser.ProtectedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Protected}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitProtected(miniJavaParser.ProtectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(miniJavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(miniJavaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(miniJavaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(miniJavaParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(miniJavaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(miniJavaParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(miniJavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(miniJavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(miniJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(miniJavaParser.LiteralContext ctx);
}