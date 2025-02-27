// Generated from /Users/Jonas/src/minijava-compiler/src/main/java/miniJavaParser/miniJava.g4 by ANTLR 4.13.1
package miniJavaParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(miniJavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(miniJavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(miniJavaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(miniJavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(miniJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(miniJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(miniJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(miniJavaParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(miniJavaParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(miniJavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(miniJavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(miniJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(miniJavaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(miniJavaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(miniJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(miniJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(miniJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(miniJavaParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(miniJavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methodBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBodyStatement(miniJavaParser.MethodBodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(miniJavaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(miniJavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(miniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(miniJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(miniJavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(miniJavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(miniJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(miniJavaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(miniJavaParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(miniJavaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(miniJavaParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(miniJavaParser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(miniJavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#newArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(miniJavaParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(miniJavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#calcFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcFunction(miniJavaParser.CalcFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(miniJavaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL(miniJavaParser.MULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV(miniJavaParser.DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link miniJavaParser#calcBinOpHigher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOD(miniJavaParser.MODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link miniJavaParser#calcBinOpLower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(miniJavaParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link miniJavaParser#calcBinOpLower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUB(miniJavaParser.SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INC}
	 * labeled alternative in {@link miniJavaParser#calcUnOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINC(miniJavaParser.INCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link miniJavaParser#calcUnOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEC(miniJavaParser.DECContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(miniJavaParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunction(miniJavaParser.BooleanFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunHigh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunHigh(miniJavaParser.BooleanFunHighContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunMiddle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunMiddle(miniJavaParser.BooleanFunMiddleContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunLow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunLow(miniJavaParser.BooleanFunLowContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunUnderground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunUnderground(miniJavaParser.BooleanFunUndergroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#inverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverse(miniJavaParser.InverseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGT(miniJavaParser.GTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLT(miniJavaParser.LTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LE}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLE(miniJavaParser.LEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GE}
	 * labeled alternative in {@link miniJavaParser#booleanNumberOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGE(miniJavaParser.GEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQUAL}
	 * labeled alternative in {@link miniJavaParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQUAL(miniJavaParser.EQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTEQUAL}
	 * labeled alternative in {@link miniJavaParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTEQUAL(miniJavaParser.NOTEQUALContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(miniJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(miniJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(miniJavaParser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#ifThenElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(miniJavaParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(miniJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(miniJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(miniJavaParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(miniJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(miniJavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(miniJavaParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(miniJavaParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(miniJavaParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(miniJavaParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(miniJavaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(miniJavaParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(miniJavaParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignQualifiedName}
	 * labeled alternative in {@link miniJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignQualifiedName(miniJavaParser.AssignQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignFieldAccess}
	 * labeled alternative in {@link miniJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFieldAccess(miniJavaParser.AssignFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArrayAccess}
	 * labeled alternative in {@link miniJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayAccess(miniJavaParser.AssignArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#assignmentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentType(miniJavaParser.AssignmentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrVoid(miniJavaParser.TypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(miniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(miniJavaParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(miniJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(miniJavaParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Public}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic(miniJavaParser.PublicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Private}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate(miniJavaParser.PrivateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Protected}
	 * labeled alternative in {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected(miniJavaParser.ProtectedContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(miniJavaParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(miniJavaParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(miniJavaParser.QualifiedNameContext ctx);
}