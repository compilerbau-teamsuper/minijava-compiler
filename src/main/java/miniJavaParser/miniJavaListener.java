// Generated from G:/Git/minijava-compiler/src/main/java/miniJavaParser/miniJava.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link miniJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(miniJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(miniJavaParser.InterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(miniJavaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(miniJavaParser.ValueContext ctx);
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
	 * Enter a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 */
	void enterMUL(miniJavaParser.MULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 */
	void exitMUL(miniJavaParser.MULContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 */
	void enterDIV(miniJavaParser.DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 */
	void exitDIV(miniJavaParser.DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 */
	void enterMOD(miniJavaParser.MODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 */
	void exitMOD(miniJavaParser.MODContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link miniJavaParser#calcBinOpLower}.
	 * @param ctx the parse tree
	 */
	void enterADD(miniJavaParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link miniJavaParser#calcBinOpLower}.
	 * @param ctx the parse tree
	 */
	void exitADD(miniJavaParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link miniJavaParser#calcBinOpLower}.
	 * @param ctx the parse tree
	 */
	void enterSUB(miniJavaParser.SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link miniJavaParser#calcBinOpLower}.
	 * @param ctx the parse tree
	 */
	void exitSUB(miniJavaParser.SUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INC}
	 * labeled alternative in {@link miniJavaParser#calcUnOp}.
	 * @param ctx the parse tree
	 */
	void enterINC(miniJavaParser.INCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INC}
	 * labeled alternative in {@link miniJavaParser#calcUnOp}.
	 * @param ctx the parse tree
	 */
	void exitINC(miniJavaParser.INCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link miniJavaParser#calcUnOp}.
	 * @param ctx the parse tree
	 */
	void enterDEC(miniJavaParser.DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link miniJavaParser#calcUnOp}.
	 * @param ctx the parse tree
	 */
	void exitDEC(miniJavaParser.DECContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(miniJavaParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(miniJavaParser.NegateContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#booleanFunHigh}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunHigh(miniJavaParser.BooleanFunHighContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#booleanFunHigh}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunHigh(miniJavaParser.BooleanFunHighContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#booleanFunMiddle}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunMiddle(miniJavaParser.BooleanFunMiddleContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#booleanFunMiddle}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunMiddle(miniJavaParser.BooleanFunMiddleContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#booleanFunLow}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunLow(miniJavaParser.BooleanFunLowContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#booleanFunLow}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunLow(miniJavaParser.BooleanFunLowContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#booleanFunUnderground}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunUnderground(miniJavaParser.BooleanFunUndergroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#booleanFunUnderground}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunUnderground(miniJavaParser.BooleanFunUndergroundContext ctx);
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
	 * Enter a parse tree produced by the {@code GT}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void enterGT(miniJavaParser.GTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void exitGT(miniJavaParser.GTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LT}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void enterLT(miniJavaParser.LTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void exitLT(miniJavaParser.LTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LE}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void enterLE(miniJavaParser.LEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LE}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void exitLE(miniJavaParser.LEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GE}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void enterGE(miniJavaParser.GEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GE}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 */
	void exitGE(miniJavaParser.GEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQUAL}
	 * labeled alternative in {@link miniJavaParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void enterEQUAL(miniJavaParser.EQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQUAL}
	 * labeled alternative in {@link miniJavaParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void exitEQUAL(miniJavaParser.EQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTEQUAL}
	 * labeled alternative in {@link miniJavaParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void enterNOTEQUAL(miniJavaParser.NOTEQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTEQUAL}
	 * labeled alternative in {@link miniJavaParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void exitNOTEQUAL(miniJavaParser.NOTEQUALContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(miniJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(miniJavaParser.BlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(miniJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(miniJavaParser.ForStatementContext ctx);
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