// Generated from G:/Git/minijava-compiler/src/main/java/miniJavaParser/miniJava.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link miniJavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(miniJavaParser.StaticInitializerContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(miniJavaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(miniJavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#arrayRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRead(miniJavaParser.ArrayReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(miniJavaParser.NewObjectContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(miniJavaParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(miniJavaParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#modulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(miniJavaParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(miniJavaParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(miniJavaParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunction(miniJavaParser.BooleanFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#booleanFunNotEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunNotEqual(miniJavaParser.BooleanFunNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#greater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(miniJavaParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#greaterEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqual(miniJavaParser.GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#lesser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser(miniJavaParser.LesserContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#lesserEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserEqual(miniJavaParser.LesserEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(miniJavaParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#notEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(miniJavaParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#inverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverse(miniJavaParser.InverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#bitwiseFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseFunction(miniJavaParser.BitwiseFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(miniJavaParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(miniJavaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(miniJavaParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#shiftFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftFunction(miniJavaParser.ShiftFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#leftShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftShift(miniJavaParser.LeftShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#rightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShift(miniJavaParser.RightShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#unsignedRightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedRightShift(miniJavaParser.UnsignedRightShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(miniJavaParser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#forControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControlStatement(miniJavaParser.ForControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(miniJavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#forControlStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControlStatementList(miniJavaParser.ForControlStatementListContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(miniJavaParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by the {@code StringObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringObject(miniJavaParser.StringObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteObject(miniJavaParser.ByteObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortObject(miniJavaParser.ShortObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerObject(miniJavaParser.IntegerObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatObject(miniJavaParser.FloatObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleObject(miniJavaParser.DoubleObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanObject(miniJavaParser.BooleanObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharacterObject}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterObject(miniJavaParser.CharacterObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link miniJavaParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(miniJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteType(miniJavaParser.ByteTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortType(miniJavaParser.ShortTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(miniJavaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(miniJavaParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(miniJavaParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(miniJavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link miniJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(miniJavaParser.CharTypeContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(miniJavaParser.MethodModifierContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(miniJavaParser.LiteralContext ctx);
}