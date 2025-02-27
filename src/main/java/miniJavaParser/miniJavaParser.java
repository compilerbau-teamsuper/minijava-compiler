// Generated from /Users/Jonas/src/minijava-compiler/src/main/java/miniJavaParser/miniJava.g4 by ANTLR 4.13.1
package miniJavaParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class miniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, Wildcard=58, XOR=59, 
		AND=60, OR=61, ASSIGN=62, ADD_ASSIGN=63, SUB_ASSIGN=64, MUL_ASSIGN=65, 
		DIV_ASSIGN=66, AND_ASSIGN=67, OR_ASSIGN=68, XOR_ASSIGN=69, MOD_ASSIGN=70, 
		LSHIFT_ASSIGN=71, RSHIFT_ASSIGN=72, URSHIFT_ASSIGN=73, VoidType=74, Public=75, 
		Abstract=76, Final=77, Static=78, BooleanLiteral=79, IntegerLiteral=80, 
		LongLiteral=81, NullLiteral=82, FloatingPointLiteral=83, DoubleLiteral=84, 
		CharacterLiteral=85, StringLiteral=86, WS=87, COMMENT=88, LINE_COMMENT=89, 
		Identifier=90;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_interfaceMethodDeclaration = 7, RULE_constructorDeclaration = 8, 
		RULE_superclass = 9, RULE_superinterfaces = 10, RULE_extendsInterfaces = 11, 
		RULE_classBody = 12, RULE_classBodyDeclaration = 13, RULE_memberDeclaration = 14, 
		RULE_interfaceBody = 15, RULE_interfaceBodyDeclaration = 16, RULE_interfaceMemberDeclaration = 17, 
		RULE_methodBody = 18, RULE_constructorBody = 19, RULE_explicitConstructorInvocation = 20, 
		RULE_methodBodyStatement = 21, RULE_return = 22, RULE_formalParameters = 23, 
		RULE_fieldDeclaration = 24, RULE_variableDeclarator = 25, RULE_variableInitializer = 26, 
		RULE_arrayInitializer = 27, RULE_expression = 28, RULE_value = 29, RULE_primary = 30, 
		RULE_newArray = 31, RULE_expressionList = 32, RULE_calcFunction = 33, 
		RULE_term = 34, RULE_calcBinOpHigher = 35, RULE_calcBinOpLower = 36, RULE_calcUnOp = 37, 
		RULE_negate = 38, RULE_booleanFunction = 39, RULE_booleanFunHigh = 40, 
		RULE_booleanFunMiddle = 41, RULE_booleanFunLow = 42, RULE_booleanFunUnderground = 43, 
		RULE_inverse = 44, RULE_booleanNumberOp = 45, RULE_booleanOp = 46, RULE_statement = 47, 
		RULE_blockStatement = 48, RULE_block = 49, RULE_localVariableDeclaration = 50, 
		RULE_ifThen = 51, RULE_ifThenElse = 52, RULE_whileStatement = 53, RULE_forStatement = 54, 
		RULE_forControl = 55, RULE_switch = 56, RULE_switchBlockStatementGroup = 57, 
		RULE_switchLabel = 58, RULE_switchBlock = 59, RULE_break = 60, RULE_continue = 61, 
		RULE_tryStatement = 62, RULE_catchClause = 63, RULE_finallyClause = 64, 
		RULE_throwStatement = 65, RULE_assignment = 66, RULE_assignmentType = 67, 
		RULE_typeOrVoid = 68, RULE_type = 69, RULE_objectType = 70, RULE_primitiveType = 71, 
		RULE_arrayType = 72, RULE_accessModifier = 73, RULE_classModifier = 74, 
		RULE_fieldModifier = 75, RULE_qualifiedName = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classDeclaration", "interfaceDeclaration", "methodDeclaration", "interfaceMethodDeclaration", 
			"constructorDeclaration", "superclass", "superinterfaces", "extendsInterfaces", 
			"classBody", "classBodyDeclaration", "memberDeclaration", "interfaceBody", 
			"interfaceBodyDeclaration", "interfaceMemberDeclaration", "methodBody", 
			"constructorBody", "explicitConstructorInvocation", "methodBodyStatement", 
			"return", "formalParameters", "fieldDeclaration", "variableDeclarator", 
			"variableInitializer", "arrayInitializer", "expression", "value", "primary", 
			"newArray", "expressionList", "calcFunction", "term", "calcBinOpHigher", 
			"calcBinOpLower", "calcUnOp", "negate", "booleanFunction", "booleanFunHigh", 
			"booleanFunMiddle", "booleanFunLow", "booleanFunUnderground", "inverse", 
			"booleanNumberOp", "booleanOp", "statement", "blockStatement", "block", 
			"localVariableDeclaration", "ifThen", "ifThenElse", "whileStatement", 
			"forStatement", "forControl", "switch", "switchBlockStatementGroup", 
			"switchLabel", "switchBlock", "break", "continue", "tryStatement", "catchClause", 
			"finallyClause", "throwStatement", "assignment", "assignmentType", "typeOrVoid", 
			"type", "objectType", "primitiveType", "arrayType", "accessModifier", 
			"classModifier", "fieldModifier", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'class'", "'interface'", "'('", 
			"')'", "'['", "']'", "'extends'", "'implements'", "','", "'{'", "'}'", 
			"'this'", "'super'", "'return'", "'new'", "'.'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'++'", "'--'", "'!'", "'>'", "'<'", "'<='", "'>='", "'=='", 
			"'!='", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", 
			"'default'", "'break'", "'continue'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'boolean'", "'byte'", "'short'", "'char'", "'int'", "'long'", 
			"'float'", "'double'", "'private'", "'protected'", null, "'^'", "'&&'", 
			"'||'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", "'void'", "'public'", "'abstract'", 
			"'final'", "'static'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Wildcard", 
			"XOR", "AND", "OR", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
			"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "VoidType", "Public", 
			"Abstract", "Final", "Static", "BooleanLiteral", "IntegerLiteral", "LongLiteral", 
			"NullLiteral", "FloatingPointLiteral", "DoubleLiteral", "CharacterLiteral", 
			"StringLiteral", "WS", "COMMENT", "LINE_COMMENT", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "miniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(miniJavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(154);
				packageDeclaration();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(157);
				importDeclaration();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 216172782113783860L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 7L) != 0)) {
				{
				{
				setState(163);
				typeDeclaration();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__0);
			setState(172);
			qualifiedName();
			setState(173);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode Static() { return getToken(miniJavaParser.Static, 0); }
		public TerminalNode Wildcard() { return getToken(miniJavaParser.Wildcard, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__2);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(176);
				match(Static);
				}
			}

			setState(179);
			qualifiedName();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Wildcard) {
				{
				setState(180);
				match(Wildcard);
				}
			}

			setState(183);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524291L) != 0)) {
				{
				setState(190);
				accessModifier();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(193);
				classModifier();
				}
			}

			setState(196);
			match(T__3);
			setState(197);
			match(Identifier);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(198);
				superclass();
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(201);
				superinterfaces();
				}
			}

			setState(204);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode Public() { return getToken(miniJavaParser.Public, 0); }
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(206);
				match(Public);
				}
			}

			setState(209);
			match(T__4);
			setState(210);
			match(Identifier);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(211);
				extendsInterfaces();
				}
			}

			setState(214);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Static() { return getToken(miniJavaParser.Static, 0); }
		public TerminalNode Final() { return getToken(miniJavaParser.Final, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Abstract() { return getToken(miniJavaParser.Abstract, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524291L) != 0)) {
					{
					setState(216);
					accessModifier();
					}
				}

				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(219);
						match(Final);
						}
					}

					setState(222);
					match(Static);
					}
					break;
				case 2:
					{
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(223);
						match(Static);
						}
					}

					setState(226);
					match(Final);
					}
					break;
				}
				setState(229);
				typeOrVoid();
				setState(230);
				match(Identifier);
				setState(231);
				match(T__5);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 4398046511359L) != 0)) {
					{
					setState(232);
					formalParameters();
					}
				}

				setState(235);
				match(T__6);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(236);
					match(T__7);
					setState(237);
					match(T__8);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				methodBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524291L) != 0)) {
					{
					setState(245);
					accessModifier();
					}
				}

				setState(248);
				match(Abstract);
				setState(249);
				typeOrVoid();
				setState(250);
				match(Identifier);
				setState(251);
				match(T__5);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 4398046511359L) != 0)) {
					{
					setState(252);
					formalParameters();
					}
				}

				setState(255);
				match(T__6);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(256);
					match(T__7);
					setState(257);
					match(T__8);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public TerminalNode Public() { return getToken(miniJavaParser.Public, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(267);
				match(Public);
				}
			}

			setState(270);
			typeOrVoid();
			setState(271);
			match(Identifier);
			setState(272);
			match(T__5);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 4398046511359L) != 0)) {
				{
				setState(273);
				formalParameters();
				}
			}

			setState(276);
			match(T__6);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(277);
				match(T__7);
				setState(278);
				match(T__8);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524291L) != 0)) {
				{
				setState(286);
				accessModifier();
				}
			}

			setState(289);
			match(Identifier);
			setState(290);
			match(T__5);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 4398046511359L) != 0)) {
				{
				setState(291);
				formalParameters();
				}
			}

			setState(294);
			match(T__6);
			setState(295);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperclassContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__9);
			setState(298);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperinterfacesContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_superinterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__10);
			setState(301);
			qualifiedName();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(302);
					match(T__11);
					setState(303);
					qualifiedName();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extendsInterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__9);
			setState(310);
			qualifiedName();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(311);
					match(T__11);
					setState(312);
					qualifiedName();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__12);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 287948901175009332L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 65567L) != 0)) {
				{
				{
				setState(319);
				classBodyDeclaration();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBodyDeclaration);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__1);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				block();
				}
				break;
			case T__3:
			case T__4:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_memberDeclaration);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__12);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 287948901175001092L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 65563L) != 0)) {
				{
				{
				setState(340);
				interfaceBodyDeclaration();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceBodyDeclaration);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(T__1);
				}
				break;
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case VoidType:
			case Public:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				interfaceMemberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceMemberDeclaration);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				interfaceMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				fieldDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<MethodBodyStatementContext> methodBodyStatement() {
			return getRuleContexts(MethodBodyStatementContext.class);
		}
		public MethodBodyStatementContext methodBodyStatement(int i) {
			return getRuleContext(MethodBodyStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__12);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71948141343449152L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				{
				setState(357);
				methodBodyStatement();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<MethodBodyStatementContext> methodBodyStatement() {
			return getRuleContexts(MethodBodyStatementContext.class);
		}
		public MethodBodyStatementContext methodBodyStatement(int i) {
			return getRuleContext(MethodBodyStatementContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__12);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(366);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71948141343449152L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				{
				setState(369);
				methodBodyStatement();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_explicitConstructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(378);
			match(T__5);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				setState(379);
				expressionList();
				}
			}

			setState(382);
			match(T__6);
			setState(383);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public MethodBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodBodyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodBodyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyStatementContext methodBodyStatement() throws RecognitionException {
		MethodBodyStatementContext _localctx = new MethodBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBodyStatement);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				localVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				return_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__16);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				setState(391);
				expression();
				}
			}

			setState(394);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(miniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(miniJavaParser.Identifier, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			type();
			setState(397);
			match(Identifier);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(398);
				match(T__11);
				setState(399);
				type();
				setState(400);
				match(Identifier);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public FieldModifierContext fieldModifier() {
			return getRuleContext(FieldModifierContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 6815747L) != 0)) {
				{
				setState(407);
				fieldModifier();
				}
			}

			setState(410);
			type();
			setState(411);
			variableDeclarator();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(412);
				match(T__11);
				setState(413);
				variableDeclarator();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(miniJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Identifier);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(422);
				match(ASSIGN);
				setState(423);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableInitializer);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(T__12);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
					{
					setState(431);
					expression();
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(432);
							match(T__11);
							setState(433);
							expression();
							}
							} 
						}
						setState(438);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(441);
					match(T__11);
					}
				}

				setState(444);
				match(T__13);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				newArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CalcUnOpContext calcUnOp() {
			return getRuleContext(CalcUnOpContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				calcFunction(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				qualifiedName();
				setState(451);
				calcUnOp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_value);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				primary(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				newArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				qualifiedName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjectContext extends PrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NewObjectContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitNewObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends PrimaryContext {
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FieldAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisContext extends PrimaryContext {
		public ThisContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends PrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArrayAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedContext extends PrimaryContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NestedContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends PrimaryContext {
		public TerminalNode IntegerLiteral() { return getToken(miniJavaParser.IntegerLiteral, 0); }
		public TerminalNode LongLiteral() { return getToken(miniJavaParser.LongLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(miniJavaParser.FloatingPointLiteral, 0); }
		public TerminalNode DoubleLiteral() { return getToken(miniJavaParser.DoubleLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(miniJavaParser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(miniJavaParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(miniJavaParser.NullLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(miniJavaParser.StringLiteral, 0); }
		public LiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends PrimaryContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(463);
				match(IntegerLiteral);
				}
				break;
			case 2:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(464);
				match(LongLiteral);
				}
				break;
			case 3:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(465);
				match(FloatingPointLiteral);
				}
				break;
			case 4:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466);
				match(DoubleLiteral);
				}
				break;
			case 5:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				match(CharacterLiteral);
				}
				break;
			case 6:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				match(BooleanLiteral);
				}
				break;
			case 7:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469);
				match(NullLiteral);
				}
				break;
			case 8:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(470);
				match(StringLiteral);
				}
				break;
			case 9:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(471);
				match(T__14);
				}
				break;
			case 10:
				{
				_localctx = new NestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				match(T__5);
				setState(473);
				expression();
				setState(474);
				match(T__6);
				}
				break;
			case 11:
				{
				_localctx = new NewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476);
				match(T__17);
				setState(477);
				qualifiedName();
				setState(478);
				match(T__5);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
					{
					setState(479);
					expressionList();
					}
				}

				setState(482);
				match(T__6);
				}
				break;
			case 12:
				{
				_localctx = new FieldAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(484);
				newArray();
				setState(485);
				match(T__18);
				setState(486);
				match(Identifier);
				}
				break;
			case 13:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(488);
				qualifiedName();
				setState(489);
				match(T__7);
				setState(490);
				expression();
				setState(491);
				match(T__8);
				}
				break;
			case 14:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493);
				match(Identifier);
				setState(494);
				match(T__5);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
					{
					setState(495);
					expressionList();
					}
				}

				setState(498);
				match(T__6);
				}
				break;
			case 15:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				qualifiedName();
				setState(500);
				match(T__18);
				setState(501);
				match(Identifier);
				setState(502);
				match(T__5);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
					{
					setState(503);
					expressionList();
					}
				}

				setState(506);
				match(T__6);
				}
				break;
			case 16:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				newArray();
				setState(509);
				match(T__18);
				setState(510);
				match(Identifier);
				setState(511);
				match(T__5);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
					{
					setState(512);
					expressionList();
					}
				}

				setState(515);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new FieldAccessContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(519);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(520);
						match(T__18);
						setState(521);
						match(Identifier);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(522);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(523);
						match(T__7);
						setState(524);
						expression();
						setState(525);
						match(T__8);
						}
						break;
					case 3:
						{
						_localctx = new MethodCallContext(new PrimaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(527);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(528);
						match(T__18);
						setState(529);
						match(Identifier);
						setState(530);
						match(T__5);
						setState(532);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
							{
							setState(531);
							expressionList();
							}
						}

						setState(534);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewArrayContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public NewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayContext newArray() throws RecognitionException {
		NewArrayContext _localctx = new NewArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_newArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__17);
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(541);
				objectType();
				}
				break;
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
				{
				setState(542);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(545);
			match(T__7);
			setState(546);
			expression();
			setState(547);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			expression();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(550);
				match(T__11);
				setState(551);
				expression();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcFunctionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CalcBinOpHigherContext calcBinOpHigher() {
			return getRuleContext(CalcBinOpHigherContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CalcBinOpLowerContext calcBinOpLower() {
			return getRuleContext(CalcBinOpLowerContext.class,0);
		}
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public CalcFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterCalcFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitCalcFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitCalcFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcFunctionContext calcFunction() throws RecognitionException {
		return calcFunction(0);
	}

	private CalcFunctionContext calcFunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcFunctionContext _localctx = new CalcFunctionContext(_ctx, _parentState);
		CalcFunctionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_calcFunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(558);
				term(0);
				setState(559);
				calcBinOpHigher();
				setState(560);
				value();
				}
				break;
			case 2:
				{
				setState(562);
				value();
				setState(563);
				calcBinOpLower();
				setState(564);
				term(0);
				}
				break;
			case 3:
				{
				setState(566);
				negate();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcFunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calcFunction);
					setState(569);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(570);
					calcBinOpLower();
					setState(571);
					term(0);
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CalcBinOpHigherContext calcBinOpHigher() {
			return getRuleContext(CalcBinOpHigherContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(579);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(581);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(582);
					calcBinOpHigher();
					setState(583);
					value();
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcBinOpHigherContext extends ParserRuleContext {
		public CalcBinOpHigherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcBinOpHigher; }
	 
		public CalcBinOpHigherContext() { }
		public void copyFrom(CalcBinOpHigherContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DIVContext extends CalcBinOpHigherContext {
		public DIVContext(CalcBinOpHigherContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterDIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitDIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MODContext extends CalcBinOpHigherContext {
		public MODContext(CalcBinOpHigherContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMOD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MULContext extends CalcBinOpHigherContext {
		public MULContext(CalcBinOpHigherContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMUL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMUL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMUL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcBinOpHigherContext calcBinOpHigher() throws RecognitionException {
		CalcBinOpHigherContext _localctx = new CalcBinOpHigherContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_calcBinOpHigher);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new MULContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new DIVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new MODContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcBinOpLowerContext extends ParserRuleContext {
		public CalcBinOpLowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcBinOpLower; }
	 
		public CalcBinOpLowerContext() { }
		public void copyFrom(CalcBinOpLowerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ADDContext extends CalcBinOpLowerContext {
		public ADDContext(CalcBinOpLowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SUBContext extends CalcBinOpLowerContext {
		public SUBContext(CalcBinOpLowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSUB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcBinOpLowerContext calcBinOpLower() throws RecognitionException {
		CalcBinOpLowerContext _localctx = new CalcBinOpLowerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_calcBinOpLower);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcUnOpContext extends ParserRuleContext {
		public CalcUnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcUnOp; }
	 
		public CalcUnOpContext() { }
		public void copyFrom(CalcUnOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DECContext extends CalcUnOpContext {
		public DECContext(CalcUnOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterDEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitDEC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitDEC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INCContext extends CalcUnOpContext {
		public INCContext(CalcUnOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterINC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitINC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitINC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcUnOpContext calcUnOp() throws RecognitionException {
		CalcUnOpContext _localctx = new CalcUnOpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_calcUnOp);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new INCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new DECContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegateContext negate() throws RecognitionException {
		NegateContext _localctx = new NegateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(T__23);
			setState(604);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFunctionContext extends ParserRuleContext {
		public BooleanNumberOpContext booleanNumberOp() {
			return getRuleContext(BooleanNumberOpContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public List<BooleanFunHighContext> booleanFunHigh() {
			return getRuleContexts(BooleanFunHighContext.class);
		}
		public BooleanFunHighContext booleanFunHigh(int i) {
			return getRuleContext(BooleanFunHighContext.class,i);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public List<BooleanFunMiddleContext> booleanFunMiddle() {
			return getRuleContexts(BooleanFunMiddleContext.class);
		}
		public BooleanFunMiddleContext booleanFunMiddle(int i) {
			return getRuleContext(BooleanFunMiddleContext.class,i);
		}
		public TerminalNode XOR() { return getToken(miniJavaParser.XOR, 0); }
		public List<BooleanFunLowContext> booleanFunLow() {
			return getRuleContexts(BooleanFunLowContext.class);
		}
		public BooleanFunLowContext booleanFunLow(int i) {
			return getRuleContext(BooleanFunLowContext.class,i);
		}
		public TerminalNode AND() { return getToken(miniJavaParser.AND, 0); }
		public BooleanFunUndergroundContext booleanFunUnderground() {
			return getRuleContext(BooleanFunUndergroundContext.class,0);
		}
		public TerminalNode OR() { return getToken(miniJavaParser.OR, 0); }
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public BooleanFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFunctionContext booleanFunction() throws RecognitionException {
		BooleanFunctionContext _localctx = new BooleanFunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_booleanFunction);
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(606);
					value();
					}
					break;
				case 2:
					{
					setState(607);
					calcFunction(0);
					}
					break;
				}
				setState(610);
				booleanNumberOp();
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(611);
					value();
					}
					break;
				case 2:
					{
					setState(612);
					calcFunction(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				booleanFunHigh();
				setState(616);
				booleanOp();
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(617);
					booleanFunHigh();
					}
					break;
				case 2:
					{
					setState(618);
					booleanFunMiddle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				booleanFunMiddle();
				setState(622);
				match(XOR);
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(623);
					booleanFunMiddle();
					}
					break;
				case 2:
					{
					setState(624);
					booleanFunLow();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				booleanFunLow();
				setState(628);
				match(AND);
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(629);
					booleanFunLow();
					}
					break;
				case 2:
					{
					setState(630);
					booleanFunUnderground();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				booleanFunUnderground();
				setState(634);
				match(OR);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(635);
					booleanFunction();
					}
					break;
				case 2:
					{
					setState(636);
					value();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				inverse();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFunHighContext extends ParserRuleContext {
		public BooleanNumberOpContext booleanNumberOp() {
			return getRuleContext(BooleanNumberOpContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public BooleanFunHighContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunHigh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanFunHigh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanFunHigh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanFunHigh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFunHighContext booleanFunHigh() throws RecognitionException {
		BooleanFunHighContext _localctx = new BooleanFunHighContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanFunHigh);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(642);
					value();
					}
					break;
				case 2:
					{
					setState(643);
					calcFunction(0);
					}
					break;
				}
				setState(646);
				booleanNumberOp();
				setState(649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(647);
					value();
					}
					break;
				case 2:
					{
					setState(648);
					calcFunction(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				inverse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFunMiddleContext extends ParserRuleContext {
		public BooleanNumberOpContext booleanNumberOp() {
			return getRuleContext(BooleanNumberOpContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public List<BooleanFunHighContext> booleanFunHigh() {
			return getRuleContexts(BooleanFunHighContext.class);
		}
		public BooleanFunHighContext booleanFunHigh(int i) {
			return getRuleContext(BooleanFunHighContext.class,i);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public BooleanFunMiddleContext booleanFunMiddle() {
			return getRuleContext(BooleanFunMiddleContext.class,0);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public BooleanFunMiddleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunMiddle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanFunMiddle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanFunMiddle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanFunMiddle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFunMiddleContext booleanFunMiddle() throws RecognitionException {
		BooleanFunMiddleContext _localctx = new BooleanFunMiddleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanFunMiddle);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(655);
					value();
					}
					break;
				case 2:
					{
					setState(656);
					calcFunction(0);
					}
					break;
				}
				setState(659);
				booleanNumberOp();
				setState(662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(660);
					value();
					}
					break;
				case 2:
					{
					setState(661);
					calcFunction(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				booleanFunHigh();
				setState(665);
				booleanOp();
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(666);
					booleanFunHigh();
					}
					break;
				case 2:
					{
					setState(667);
					booleanFunMiddle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				inverse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFunLowContext extends ParserRuleContext {
		public BooleanNumberOpContext booleanNumberOp() {
			return getRuleContext(BooleanNumberOpContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public List<BooleanFunHighContext> booleanFunHigh() {
			return getRuleContexts(BooleanFunHighContext.class);
		}
		public BooleanFunHighContext booleanFunHigh(int i) {
			return getRuleContext(BooleanFunHighContext.class,i);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public List<BooleanFunMiddleContext> booleanFunMiddle() {
			return getRuleContexts(BooleanFunMiddleContext.class);
		}
		public BooleanFunMiddleContext booleanFunMiddle(int i) {
			return getRuleContext(BooleanFunMiddleContext.class,i);
		}
		public TerminalNode XOR() { return getToken(miniJavaParser.XOR, 0); }
		public BooleanFunLowContext booleanFunLow() {
			return getRuleContext(BooleanFunLowContext.class,0);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public BooleanFunLowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunLow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanFunLow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanFunLow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanFunLow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFunLowContext booleanFunLow() throws RecognitionException {
		BooleanFunLowContext _localctx = new BooleanFunLowContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_booleanFunLow);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(674);
					value();
					}
					break;
				case 2:
					{
					setState(675);
					calcFunction(0);
					}
					break;
				}
				setState(678);
				booleanNumberOp();
				setState(681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(679);
					value();
					}
					break;
				case 2:
					{
					setState(680);
					calcFunction(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				booleanFunHigh();
				setState(684);
				booleanOp();
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(685);
					booleanFunHigh();
					}
					break;
				case 2:
					{
					setState(686);
					booleanFunMiddle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				booleanFunMiddle();
				setState(690);
				match(XOR);
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(691);
					booleanFunMiddle();
					}
					break;
				case 2:
					{
					setState(692);
					booleanFunLow();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				inverse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(696);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFunUndergroundContext extends ParserRuleContext {
		public BooleanNumberOpContext booleanNumberOp() {
			return getRuleContext(BooleanNumberOpContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public List<BooleanFunHighContext> booleanFunHigh() {
			return getRuleContexts(BooleanFunHighContext.class);
		}
		public BooleanFunHighContext booleanFunHigh(int i) {
			return getRuleContext(BooleanFunHighContext.class,i);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public List<BooleanFunMiddleContext> booleanFunMiddle() {
			return getRuleContexts(BooleanFunMiddleContext.class);
		}
		public BooleanFunMiddleContext booleanFunMiddle(int i) {
			return getRuleContext(BooleanFunMiddleContext.class,i);
		}
		public TerminalNode XOR() { return getToken(miniJavaParser.XOR, 0); }
		public List<BooleanFunLowContext> booleanFunLow() {
			return getRuleContexts(BooleanFunLowContext.class);
		}
		public BooleanFunLowContext booleanFunLow(int i) {
			return getRuleContext(BooleanFunLowContext.class,i);
		}
		public TerminalNode AND() { return getToken(miniJavaParser.AND, 0); }
		public BooleanFunUndergroundContext booleanFunUnderground() {
			return getRuleContext(BooleanFunUndergroundContext.class,0);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public BooleanFunUndergroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunUnderground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanFunUnderground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanFunUnderground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanFunUnderground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFunUndergroundContext booleanFunUnderground() throws RecognitionException {
		BooleanFunUndergroundContext _localctx = new BooleanFunUndergroundContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_booleanFunUnderground);
		try {
			int _alt;
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(699);
					value();
					}
					break;
				case 2:
					{
					setState(700);
					calcFunction(0);
					}
					break;
				}
				setState(703);
				booleanNumberOp();
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(704);
					value();
					}
					break;
				case 2:
					{
					setState(705);
					calcFunction(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				booleanFunHigh();
				setState(709);
				booleanOp();
				setState(711); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(710);
						booleanFunHigh();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(713); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				booleanFunMiddle();
				setState(716);
				match(XOR);
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(717);
					booleanFunMiddle();
					}
					break;
				case 2:
					{
					setState(718);
					booleanFunLow();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				booleanFunLow();
				setState(722);
				match(AND);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(723);
					booleanFunLow();
					}
					break;
				case 2:
					{
					setState(724);
					booleanFunUnderground();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				inverse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(728);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InverseContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public InverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInverse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseContext inverse() throws RecognitionException {
		InverseContext _localctx = new InverseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(T__26);
			setState(732);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanNumberOpContext extends ParserRuleContext {
		public BooleanNumberOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanNumberOp; }
	 
		public BooleanNumberOpContext() { }
		public void copyFrom(BooleanNumberOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LTContext extends BooleanNumberOpContext {
		public LTContext(BooleanNumberOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitLT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LEContext extends BooleanNumberOpContext {
		public LEContext(BooleanNumberOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitLE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GTContext extends BooleanNumberOpContext {
		public GTContext(BooleanNumberOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitGT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GEContext extends BooleanNumberOpContext {
		public GEContext(BooleanNumberOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanNumberOpContext booleanNumberOp() throws RecognitionException {
		BooleanNumberOpContext _localctx = new BooleanNumberOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_booleanNumberOp);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new GTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new LTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new LEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new GEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanOpContext extends ParserRuleContext {
		public BooleanOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOp; }
	 
		public BooleanOpContext() { }
		public void copyFrom(BooleanOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOTEQUALContext extends BooleanOpContext {
		public NOTEQUALContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterNOTEQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitNOTEQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitNOTEQUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EQUALContext extends BooleanOpContext {
		public EQUALContext(BooleanOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterEQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitEQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitEQUAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOpContext booleanOp() throws RecognitionException {
		BooleanOpContext _localctx = new BooleanOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_booleanOp);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new EQUALContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new NOTEQUALContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CalcUnOpContext calcUnOp() {
			return getRuleContext(CalcUnOpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public ContinueContext continue_() {
			return getRuleContext(ContinueContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				expression();
				setState(746);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				ifThenElse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				ifThen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(750);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(751);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(752);
				calcUnOp();
				setState(753);
				qualifiedName();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(755);
				qualifiedName();
				setState(756);
				calcUnOp();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(758);
				switch_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(759);
				break_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(760);
				continue_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(761);
				return_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(762);
				tryStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(763);
				throwStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_blockStatement);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(T__12);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71948141343449152L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				{
				setState(771);
				blockStatement();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			type();
			setState(780);
			variableDeclarator();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(781);
				match(T__11);
				setState(782);
				variableDeclarator();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIfThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenContext ifThen() throws RecognitionException {
		IfThenContext _localctx = new IfThenContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ifThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(T__33);
			setState(791);
			match(T__5);
			setState(792);
			expression();
			setState(793);
			match(T__6);
			setState(794);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(T__33);
			setState(797);
			match(T__5);
			setState(798);
			expression();
			setState(799);
			match(T__6);
			setState(800);
			statement();
			setState(801);
			match(T__34);
			setState(802);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__35);
			setState(805);
			match(T__5);
			setState(806);
			expression();
			setState(807);
			match(T__6);
			setState(808);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__36);
			setState(811);
			match(T__5);
			setState(812);
			forControl();
			setState(813);
			match(T__6);
			setState(814);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Identifier:
				{
				setState(816);
				localVariableDeclaration();
				}
				break;
			case T__1:
				{
				setState(817);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				setState(820);
				booleanFunction();
				}
			}

			setState(823);
			match(T__1);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 151289920L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2303L) != 0)) {
				{
				setState(824);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(T__37);
			setState(828);
			match(T__5);
			setState(829);
			expression();
			setState(830);
			match(T__6);
			setState(831);
			match(T__12);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38 || _la==T__40) {
				{
				{
				setState(832);
				switchBlockStatementGroup();
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(840);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(843); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(845);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_switchLabel);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(T__38);
				setState(848);
				expression();
				setState(849);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				match(T__40);
				setState(852);
				match(T__39);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(855);
					statement();
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(861);
				break_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__41);
			setState(865);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueContext extends ParserRuleContext {
		public ContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueContext continue_() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(T__42);
			setState(868);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(T__43);
			setState(871);
			block();
			setState(873); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(872);
				catchClause();
				}
				}
				setState(875); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__44 );
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(877);
				finallyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(T__44);
			setState(881);
			match(T__5);
			setState(882);
			type();
			setState(883);
			match(Identifier);
			setState(884);
			match(T__6);
			setState(885);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFinallyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFinallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(T__45);
			setState(888);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(T__46);
			setState(891);
			expression();
			setState(892);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignFieldAccessContext extends AssignmentContext {
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public AssignmentTypeContext assignmentType() {
			return getRuleContext(AssignmentTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AssignFieldAccessContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAssignFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAssignFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitAssignFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignArrayAccessContext extends AssignmentContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentTypeContext assignmentType() {
			return getRuleContext(AssignmentTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AssignArrayAccessContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAssignArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAssignArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitAssignArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignQualifiedNameContext extends AssignmentContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AssignmentTypeContext assignmentType() {
			return getRuleContext(AssignmentTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignQualifiedNameContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAssignQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAssignQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitAssignQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assignment);
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new AssignQualifiedNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				qualifiedName();
				setState(895);
				assignmentType();
				setState(896);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignFieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				newArray();
				setState(899);
				match(T__18);
				setState(900);
				match(Identifier);
				setState(901);
				assignmentType();
				setState(902);
				expression();
				}
				break;
			case 3:
				_localctx = new AssignFieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				primary(0);
				setState(905);
				match(T__18);
				setState(906);
				match(Identifier);
				setState(907);
				assignmentType();
				setState(908);
				expression();
				}
				break;
			case 4:
				_localctx = new AssignArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				qualifiedName();
				setState(911);
				match(T__7);
				setState(912);
				expression();
				setState(913);
				match(T__8);
				setState(914);
				assignmentType();
				setState(915);
				expression();
				}
				break;
			case 5:
				_localctx = new AssignArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(917);
				primary(0);
				setState(918);
				match(T__7);
				setState(919);
				expression();
				setState(920);
				match(T__8);
				setState(921);
				assignmentType();
				setState(922);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentTypeContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(miniJavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(miniJavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(miniJavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(miniJavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(miniJavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(miniJavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(miniJavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(miniJavaParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(miniJavaParser.MOD_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(miniJavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(miniJavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(miniJavaParser.URSHIFT_ASSIGN, 0); }
		public AssignmentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAssignmentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAssignmentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitAssignmentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentTypeContext assignmentType() throws RecognitionException {
		AssignmentTypeContext _localctx = new AssignmentTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignmentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 4095L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeOrVoidContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VoidType() { return getToken(miniJavaParser.VoidType, 0); }
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeOrVoid);
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				match(VoidType);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_type);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				objectType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_objectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 71776119061217280L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
				{
				setState(941);
				primitiveType();
				}
				break;
			case Identifier:
				{
				setState(942);
				objectType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(945);
			match(T__7);
			setState(946);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	 
		public AccessModifierContext() { }
		public void copyFrom(AccessModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProtectedContext extends AccessModifierContext {
		public ProtectedContext(AccessModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterProtected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitProtected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitProtected(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrivateContext extends AccessModifierContext {
		public PrivateContext(AccessModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterPrivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitPrivate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPrivate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PublicContext extends AccessModifierContext {
		public TerminalNode Public() { return getToken(miniJavaParser.Public, 0); }
		public PublicContext(AccessModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterPublic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitPublic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPublic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_accessModifier);
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				match(Public);
				}
				break;
			case T__55:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new ProtectedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(950);
				match(T__56);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(miniJavaParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(miniJavaParser.Final, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldModifierContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Static() { return getToken(miniJavaParser.Static, 0); }
		public TerminalNode Final() { return getToken(miniJavaParser.Final, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_fieldModifier);
		int _la;
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				accessModifier();
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(956);
						match(Final);
						}
					}

					setState(959);
					match(Static);
					}
					break;
				case 2:
					{
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(960);
						match(Static);
						}
					}

					setState(963);
					match(Final);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(966);
						match(Final);
						}
					}

					setState(969);
					match(Static);
					}
					break;
				case 2:
					{
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(970);
						match(Static);
						}
					}

					setState(973);
					match(Final);
					}
					break;
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524291L) != 0)) {
					{
					setState(976);
					accessModifier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(979);
						match(Final);
						}
					}

					setState(982);
					accessModifier();
					setState(983);
					match(Static);
					}
					break;
				case 2:
					{
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(985);
						match(Static);
						}
					}

					setState(988);
					accessModifier();
					setState(989);
					match(Final);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(miniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(miniJavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(995);
					match(Identifier);
					setState(996);
					match(T__18);
					}
					} 
				}
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(1002);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 33:
			return calcFunction_sempred((CalcFunctionContext)_localctx, predIndex);
		case 34:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean calcFunction_sempred(CalcFunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Z\u03ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0001\u0000\u0003\u0000\u009c\b\u0000\u0001\u0000"+
		"\u0005\u0000\u009f\b\u0000\n\u0000\f\u0000\u00a2\t\u0000\u0001\u0000\u0005"+
		"\u0000\u00a5\b\u0000\n\u0000\f\u0000\u00a8\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00b2\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b6\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00bd\b\u0003\u0001\u0004\u0003\u0004\u00c0\b\u0004\u0001\u0004"+
		"\u0003\u0004\u00c3\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00c8\b\u0004\u0001\u0004\u0003\u0004\u00cb\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0003\u0005\u00d0\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00d5\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u00da\b\u0006\u0001\u0006\u0003\u0006\u00dd\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00e1\b\u0006\u0001\u0006\u0003\u0006\u00e4\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ea"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ef\b\u0006"+
		"\n\u0006\f\u0006\u00f2\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00f7\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00fe\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0103\b\u0006\n\u0006\f\u0006\u0106\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u010a\b\u0006\u0001\u0007\u0003\u0007\u010d\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0113\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0118\b\u0007\n\u0007\f\u0007"+
		"\u011b\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u0120\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0125\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0131\b\n\n\n\f\n\u0134"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u013a"+
		"\b\u000b\n\u000b\f\u000b\u013d\t\u000b\u0001\f\u0001\f\u0005\f\u0141\b"+
		"\f\n\f\f\f\u0144\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u014b"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0152\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0156\b\u000f"+
		"\n\u000f\f\u000f\u0159\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u015f\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0163"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0167\b\u0012\n\u0012\f\u0012"+
		"\u016a\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0170\b\u0013\u0001\u0013\u0005\u0013\u0173\b\u0013\n\u0013\f\u0013\u0176"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u017d\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0185\b\u0015\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0189\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0193\b\u0017\n"+
		"\u0017\f\u0017\u0196\t\u0017\u0001\u0018\u0003\u0018\u0199\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u019f\b\u0018\n"+
		"\u0018\f\u0018\u01a2\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01a9\b\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01ad\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01b3\b\u001b\n\u001b\f\u001b\u01b6\t\u001b\u0003\u001b\u01b8\b"+
		"\u001b\u0001\u001b\u0003\u001b\u01bb\b\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01bf\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01c8\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01cd\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01e1\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01f1\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01f9\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0202\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0206"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0215\b\u001e\u0001\u001e\u0005\u001e\u0218"+
		"\b\u001e\n\u001e\f\u001e\u021b\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0220\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0005 \u0229\b \n \f \u022c\t \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0238\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u023e\b!\n!\f!\u0241\t!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u024a\b\"\n\"\f\"\u024d"+
		"\t\"\u0001#\u0001#\u0001#\u0003#\u0252\b#\u0001$\u0001$\u0003$\u0256\b"+
		"$\u0001%\u0001%\u0003%\u025a\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u0261\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u0266\b\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u026c\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u0272\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0278\b\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u027e\b\'\u0001\'\u0003\'\u0281\b\'\u0001"+
		"(\u0001(\u0003(\u0285\b(\u0001(\u0001(\u0001(\u0003(\u028a\b(\u0001(\u0001"+
		"(\u0003(\u028e\b(\u0001)\u0001)\u0003)\u0292\b)\u0001)\u0001)\u0001)\u0003"+
		")\u0297\b)\u0001)\u0001)\u0001)\u0001)\u0003)\u029d\b)\u0001)\u0001)\u0003"+
		")\u02a1\b)\u0001*\u0001*\u0003*\u02a5\b*\u0001*\u0001*\u0001*\u0003*\u02aa"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u02b0\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02b6\b*\u0001*\u0001*\u0003*\u02ba\b*\u0001+\u0001+\u0003+\u02be"+
		"\b+\u0001+\u0001+\u0001+\u0003+\u02c3\b+\u0001+\u0001+\u0001+\u0004+\u02c8"+
		"\b+\u000b+\f+\u02c9\u0001+\u0001+\u0001+\u0001+\u0003+\u02d0\b+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u02d6\b+\u0001+\u0001+\u0003+\u02da\b+\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u02e3\b-\u0001.\u0001"+
		".\u0003.\u02e7\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u02fd\b/\u00010\u00010\u00030\u0301\b0\u00011\u0001"+
		"1\u00051\u0305\b1\n1\f1\u0308\t1\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00052\u0310\b2\n2\f2\u0313\t2\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00037\u0333\b7\u00017\u00037\u0336\b7\u0001"+
		"7\u00017\u00037\u033a\b7\u00018\u00018\u00018\u00018\u00018\u00018\u0005"+
		"8\u0342\b8\n8\f8\u0345\t8\u00018\u00018\u00019\u00049\u034a\b9\u000b9"+
		"\f9\u034b\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u0356\b:\u0001;\u0005;\u0359\b;\n;\f;\u035c\t;\u0001;\u0003;\u035f\b"+
		";\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0004"+
		">\u036a\b>\u000b>\f>\u036b\u0001>\u0003>\u036f\b>\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0003B\u039d\bB\u0001C\u0001C\u0001D\u0001D\u0003D\u03a3\bD\u0001"+
		"E\u0001E\u0001E\u0003E\u03a8\bE\u0001F\u0001F\u0001G\u0001G\u0001H\u0001"+
		"H\u0003H\u03b0\bH\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0003I\u03b8"+
		"\bI\u0001J\u0001J\u0001K\u0001K\u0003K\u03be\bK\u0001K\u0001K\u0003K\u03c2"+
		"\bK\u0001K\u0003K\u03c5\bK\u0001K\u0003K\u03c8\bK\u0001K\u0001K\u0003"+
		"K\u03cc\bK\u0001K\u0003K\u03cf\bK\u0001K\u0003K\u03d2\bK\u0001K\u0003"+
		"K\u03d5\bK\u0001K\u0001K\u0001K\u0001K\u0003K\u03db\bK\u0001K\u0001K\u0001"+
		"K\u0003K\u03e0\bK\u0003K\u03e2\bK\u0001L\u0001L\u0005L\u03e6\bL\nL\fL"+
		"\u03e9\tL\u0001L\u0001L\u0001L\u0002\u0132\u013b\u0003<BDM\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u0000\u0004\u0001"+
		"\u0000\u000f\u0010\u0001\u0000>I\u0001\u000007\u0001\u0000LM\u045c\u0000"+
		"\u009b\u0001\u0000\u0000\u0000\u0002\u00ab\u0001\u0000\u0000\u0000\u0004"+
		"\u00af\u0001\u0000\u0000\u0000\u0006\u00bc\u0001\u0000\u0000\u0000\b\u00bf"+
		"\u0001\u0000\u0000\u0000\n\u00cf\u0001\u0000\u0000\u0000\f\u0109\u0001"+
		"\u0000\u0000\u0000\u000e\u010c\u0001\u0000\u0000\u0000\u0010\u011f\u0001"+
		"\u0000\u0000\u0000\u0012\u0129\u0001\u0000\u0000\u0000\u0014\u012c\u0001"+
		"\u0000\u0000\u0000\u0016\u0135\u0001\u0000\u0000\u0000\u0018\u013e\u0001"+
		"\u0000\u0000\u0000\u001a\u014a\u0001\u0000\u0000\u0000\u001c\u0151\u0001"+
		"\u0000\u0000\u0000\u001e\u0153\u0001\u0000\u0000\u0000 \u015e\u0001\u0000"+
		"\u0000\u0000\"\u0162\u0001\u0000\u0000\u0000$\u0164\u0001\u0000\u0000"+
		"\u0000&\u016d\u0001\u0000\u0000\u0000(\u0179\u0001\u0000\u0000\u0000*"+
		"\u0184\u0001\u0000\u0000\u0000,\u0186\u0001\u0000\u0000\u0000.\u018c\u0001"+
		"\u0000\u0000\u00000\u0198\u0001\u0000\u0000\u00002\u01a5\u0001\u0000\u0000"+
		"\u00004\u01ac\u0001\u0000\u0000\u00006\u01be\u0001\u0000\u0000\u00008"+
		"\u01c7\u0001\u0000\u0000\u0000:\u01cc\u0001\u0000\u0000\u0000<\u0205\u0001"+
		"\u0000\u0000\u0000>\u021c\u0001\u0000\u0000\u0000@\u0225\u0001\u0000\u0000"+
		"\u0000B\u0237\u0001\u0000\u0000\u0000D\u0242\u0001\u0000\u0000\u0000F"+
		"\u0251\u0001\u0000\u0000\u0000H\u0255\u0001\u0000\u0000\u0000J\u0259\u0001"+
		"\u0000\u0000\u0000L\u025b\u0001\u0000\u0000\u0000N\u0280\u0001\u0000\u0000"+
		"\u0000P\u028d\u0001\u0000\u0000\u0000R\u02a0\u0001\u0000\u0000\u0000T"+
		"\u02b9\u0001\u0000\u0000\u0000V\u02d9\u0001\u0000\u0000\u0000X\u02db\u0001"+
		"\u0000\u0000\u0000Z\u02e2\u0001\u0000\u0000\u0000\\\u02e6\u0001\u0000"+
		"\u0000\u0000^\u02fc\u0001\u0000\u0000\u0000`\u0300\u0001\u0000\u0000\u0000"+
		"b\u0302\u0001\u0000\u0000\u0000d\u030b\u0001\u0000\u0000\u0000f\u0316"+
		"\u0001\u0000\u0000\u0000h\u031c\u0001\u0000\u0000\u0000j\u0324\u0001\u0000"+
		"\u0000\u0000l\u032a\u0001\u0000\u0000\u0000n\u0332\u0001\u0000\u0000\u0000"+
		"p\u033b\u0001\u0000\u0000\u0000r\u0349\u0001\u0000\u0000\u0000t\u0355"+
		"\u0001\u0000\u0000\u0000v\u035a\u0001\u0000\u0000\u0000x\u0360\u0001\u0000"+
		"\u0000\u0000z\u0363\u0001\u0000\u0000\u0000|\u0366\u0001\u0000\u0000\u0000"+
		"~\u0370\u0001\u0000\u0000\u0000\u0080\u0377\u0001\u0000\u0000\u0000\u0082"+
		"\u037a\u0001\u0000\u0000\u0000\u0084\u039c\u0001\u0000\u0000\u0000\u0086"+
		"\u039e\u0001\u0000\u0000\u0000\u0088\u03a2\u0001\u0000\u0000\u0000\u008a"+
		"\u03a7\u0001\u0000\u0000\u0000\u008c\u03a9\u0001\u0000\u0000\u0000\u008e"+
		"\u03ab\u0001\u0000\u0000\u0000\u0090\u03af\u0001\u0000\u0000\u0000\u0092"+
		"\u03b7\u0001\u0000\u0000\u0000\u0094\u03b9\u0001\u0000\u0000\u0000\u0096"+
		"\u03e1\u0001\u0000\u0000\u0000\u0098\u03e7\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0003\u0002\u0001\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a0\u0001\u0000\u0000\u0000\u009d"+
		"\u009f\u0003\u0004\u0002\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u0006\u0003\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0000\u0000\u0001\u00aa\u0001\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0001\u0000\u0000\u00ac\u00ad\u0003\u0098L\u0000\u00ad\u00ae"+
		"\u0005\u0002\u0000\u0000\u00ae\u0003\u0001\u0000\u0000\u0000\u00af\u00b1"+
		"\u0005\u0003\u0000\u0000\u00b0\u00b2\u0005N\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0003\u0098L\u0000\u00b4\u00b6\u0005:\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000"+
		"\u0000\u00b8\u0005\u0001\u0000\u0000\u0000\u00b9\u00bd\u0003\b\u0004\u0000"+
		"\u00ba\u00bd\u0003\n\u0005\u0000\u00bb\u00bd\u0005\u0002\u0000\u0000\u00bc"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u0007\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0003\u0092I\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00c3"+
		"\u0003\u0094J\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\u0004\u0000\u0000\u00c5\u00c7\u0005Z\u0000\u0000\u00c6\u00c8\u0003\u0012"+
		"\t\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u0014\n\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd"+
		"\t\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005K\u0000\u0000\u00cf\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0005\u0000\u0000\u00d2\u00d4"+
		"\u0005Z\u0000\u0000\u00d3\u00d5\u0003\u0016\u000b\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7\u000b\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0003\u0092I\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e3\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0005M\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00e4\u0005N\u0000\u0000\u00df\u00e1\u0005N\u0000\u0000\u00e0"+
		"\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005M\u0000\u0000\u00e3\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0003\u0088D\u0000\u00e6\u00e7\u0005Z\u0000\u0000\u00e7\u00e9\u0005\u0006"+
		"\u0000\u0000\u00e8\u00ea\u0003.\u0017\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00f0\u0005\u0007\u0000\u0000\u00ec\u00ed\u0005\b\u0000\u0000"+
		"\u00ed\u00ef\u0005\t\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003$\u0012\u0000\u00f4\u010a"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003\u0092I\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005L\u0000\u0000\u00f9\u00fa\u0003\u0088"+
		"D\u0000\u00fa\u00fb\u0005Z\u0000\u0000\u00fb\u00fd\u0005\u0006\u0000\u0000"+
		"\u00fc\u00fe\u0003.\u0017\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0104\u0005\u0007\u0000\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101\u0103"+
		"\u0005\t\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\u0002\u0000\u0000\u0108\u010a\u0001"+
		"\u0000\u0000\u0000\u0109\u00d9\u0001\u0000\u0000\u0000\u0109\u00f6\u0001"+
		"\u0000\u0000\u0000\u010a\r\u0001\u0000\u0000\u0000\u010b\u010d\u0005K"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0003\u0088"+
		"D\u0000\u010f\u0110\u0005Z\u0000\u0000\u0110\u0112\u0005\u0006\u0000\u0000"+
		"\u0111\u0113\u0003.\u0017\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0119\u0005\u0007\u0000\u0000\u0115\u0116\u0005\b\u0000\u0000\u0116\u0118"+
		"\u0005\t\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005\u0002\u0000\u0000\u011d\u000f\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0003\u0092I\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005Z\u0000\u0000\u0122\u0124\u0005\u0006\u0000"+
		"\u0000\u0123\u0125\u0003.\u0017\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u0007\u0000\u0000\u0127\u0128\u0003&\u0013\u0000\u0128"+
		"\u0011\u0001\u0000\u0000\u0000\u0129\u012a\u0005\n\u0000\u0000\u012a\u012b"+
		"\u0003\u0098L\u0000\u012b\u0013\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u000b\u0000\u0000\u012d\u0132\u0003\u0098L\u0000\u012e\u012f\u0005\f"+
		"\u0000\u0000\u012f\u0131\u0003\u0098L\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0015\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\n\u0000\u0000"+
		"\u0136\u013b\u0003\u0098L\u0000\u0137\u0138\u0005\f\u0000\u0000\u0138"+
		"\u013a\u0003\u0098L\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u0017\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u0142\u0005\r\u0000\u0000\u013f\u0141\u0003"+
		"\u001a\r\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u000e\u0000\u0000\u0146\u0019\u0001\u0000"+
		"\u0000\u0000\u0147\u014b\u0005\u0002\u0000\u0000\u0148\u014b\u0003b1\u0000"+
		"\u0149\u014b\u0003\u001c\u000e\u0000\u014a\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u001b\u0001\u0000\u0000\u0000\u014c\u0152\u0003\f\u0006\u0000\u014d"+
		"\u0152\u00030\u0018\u0000\u014e\u0152\u0003\u0010\b\u0000\u014f\u0152"+
		"\u0003\b\u0004\u0000\u0150\u0152\u0003\n\u0005\u0000\u0151\u014c\u0001"+
		"\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u001d\u0001\u0000\u0000\u0000\u0153\u0157\u0005"+
		"\r\u0000\u0000\u0154\u0156\u0003 \u0010\u0000\u0155\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000"+
		"\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u000e"+
		"\u0000\u0000\u015b\u001f\u0001\u0000\u0000\u0000\u015c\u015f\u0005\u0002"+
		"\u0000\u0000\u015d\u015f\u0003\"\u0011\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f!\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u0003\u000e\u0007\u0000\u0161\u0163\u00030\u0018\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163"+
		"#\u0001\u0000\u0000\u0000\u0164\u0168\u0005\r\u0000\u0000\u0165\u0167"+
		"\u0003*\u0015\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005\u000e\u0000\u0000\u016c%\u0001\u0000"+
		"\u0000\u0000\u016d\u016f\u0005\r\u0000\u0000\u016e\u0170\u0003(\u0014"+
		"\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0174\u0001\u0000\u0000\u0000\u0171\u0173\u0003*\u0015\u0000"+
		"\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0005\u000e\u0000\u0000\u0178\'\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0007\u0000\u0000\u0000\u017a\u017c\u0005\u0006\u0000\u0000\u017b"+
		"\u017d\u0003@ \u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"\u0007\u0000\u0000\u017f\u0180\u0005\u0002\u0000\u0000\u0180)\u0001\u0000"+
		"\u0000\u0000\u0181\u0185\u0003^/\u0000\u0182\u0185\u0003d2\u0000\u0183"+
		"\u0185\u0003,\u0016\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185+\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0005\u0011\u0000\u0000\u0187\u0189\u0003"+
		"8\u001c\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0002"+
		"\u0000\u0000\u018b-\u0001\u0000\u0000\u0000\u018c\u018d\u0003\u008aE\u0000"+
		"\u018d\u0194\u0005Z\u0000\u0000\u018e\u018f\u0005\f\u0000\u0000\u018f"+
		"\u0190\u0003\u008aE\u0000\u0190\u0191\u0005Z\u0000\u0000\u0191\u0193\u0001"+
		"\u0000\u0000\u0000\u0192\u018e\u0001\u0000\u0000\u0000\u0193\u0196\u0001"+
		"\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195/\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0197\u0199\u0003\u0096K\u0000\u0198\u0197\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0003\u008aE\u0000\u019b\u01a0\u00032\u0019\u0000\u019c"+
		"\u019d\u0005\f\u0000\u0000\u019d\u019f\u00032\u0019\u0000\u019e\u019c"+
		"\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0005\u0002\u0000\u0000\u01a41\u0001\u0000\u0000\u0000\u01a5\u01a8\u0005"+
		"Z\u0000\u0000\u01a6\u01a7\u0005>\u0000\u0000\u01a7\u01a9\u00034\u001a"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a93\u0001\u0000\u0000\u0000\u01aa\u01ad\u00038\u001c\u0000\u01ab"+
		"\u01ad\u00036\u001b\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ad5\u0001\u0000\u0000\u0000\u01ae\u01b7\u0005"+
		"\r\u0000\u0000\u01af\u01b4\u00038\u001c\u0000\u01b0\u01b1\u0005\f\u0000"+
		"\u0000\u01b1\u01b3\u00038\u001c\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01af\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bb\u0005\f\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bf\u0005\u000e\u0000\u0000\u01bd\u01bf\u0003>\u001f\u0000\u01be\u01ae"+
		"\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf7\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c8\u0003B!\u0000\u01c1\u01c8\u0003N\'\u0000"+
		"\u01c2\u01c3\u0003\u0098L\u0000\u01c3\u01c4\u0003J%\u0000\u01c4\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c8\u0003:\u001d\u0000\u01c6\u01c8\u0003"+
		"\u0084B\u0000\u01c7\u01c0\u0001\u0000\u0000\u0000\u01c7\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c2\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c89\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cd\u0003<\u001e\u0000\u01ca\u01cd\u0003>\u001f\u0000\u01cb"+
		"\u01cd\u0003\u0098L\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd;\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0006\u001e\uffff\uffff\u0000\u01cf\u0206"+
		"\u0005P\u0000\u0000\u01d0\u0206\u0005Q\u0000\u0000\u01d1\u0206\u0005S"+
		"\u0000\u0000\u01d2\u0206\u0005T\u0000\u0000\u01d3\u0206\u0005U\u0000\u0000"+
		"\u01d4\u0206\u0005O\u0000\u0000\u01d5\u0206\u0005R\u0000\u0000\u01d6\u0206"+
		"\u0005V\u0000\u0000\u01d7\u0206\u0005\u000f\u0000\u0000\u01d8\u01d9\u0005"+
		"\u0006\u0000\u0000\u01d9\u01da\u00038\u001c\u0000\u01da\u01db\u0005\u0007"+
		"\u0000\u0000\u01db\u0206\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0012"+
		"\u0000\u0000\u01dd\u01de\u0003\u0098L\u0000\u01de\u01e0\u0005\u0006\u0000"+
		"\u0000\u01df\u01e1\u0003@ \u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005\u0007\u0000\u0000\u01e3\u0206\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0003>\u001f\u0000\u01e5\u01e6\u0005\u0013\u0000\u0000\u01e6\u01e7"+
		"\u0005Z\u0000\u0000\u01e7\u0206\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003"+
		"\u0098L\u0000\u01e9\u01ea\u0005\b\u0000\u0000\u01ea\u01eb\u00038\u001c"+
		"\u0000\u01eb\u01ec\u0005\t\u0000\u0000\u01ec\u0206\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005Z\u0000\u0000\u01ee\u01f0\u0005\u0006\u0000\u0000\u01ef"+
		"\u01f1\u0003@ \u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u0206\u0005"+
		"\u0007\u0000\u0000\u01f3\u01f4\u0003\u0098L\u0000\u01f4\u01f5\u0005\u0013"+
		"\u0000\u0000\u01f5\u01f6\u0005Z\u0000\u0000\u01f6\u01f8\u0005\u0006\u0000"+
		"\u0000\u01f7\u01f9\u0003@ \u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0005\u0007\u0000\u0000\u01fb\u0206\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0003>\u001f\u0000\u01fd\u01fe\u0005\u0013\u0000\u0000\u01fe\u01ff"+
		"\u0005Z\u0000\u0000\u01ff\u0201\u0005\u0006\u0000\u0000\u0200\u0202\u0003"+
		"@ \u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u0007\u0000"+
		"\u0000\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u01ce\u0001\u0000\u0000"+
		"\u0000\u0205\u01d0\u0001\u0000\u0000\u0000\u0205\u01d1\u0001\u0000\u0000"+
		"\u0000\u0205\u01d2\u0001\u0000\u0000\u0000\u0205\u01d3\u0001\u0000\u0000"+
		"\u0000\u0205\u01d4\u0001\u0000\u0000\u0000\u0205\u01d5\u0001\u0000\u0000"+
		"\u0000\u0205\u01d6\u0001\u0000\u0000\u0000\u0205\u01d7\u0001\u0000\u0000"+
		"\u0000\u0205\u01d8\u0001\u0000\u0000\u0000\u0205\u01dc\u0001\u0000\u0000"+
		"\u0000\u0205\u01e4\u0001\u0000\u0000\u0000\u0205\u01e8\u0001\u0000\u0000"+
		"\u0000\u0205\u01ed\u0001\u0000\u0000\u0000\u0205\u01f3\u0001\u0000\u0000"+
		"\u0000\u0205\u01fc\u0001\u0000\u0000\u0000\u0206\u0219\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\n\u0007\u0000\u0000\u0208\u0209\u0005\u0013\u0000\u0000"+
		"\u0209\u0218\u0005Z\u0000\u0000\u020a\u020b\n\u0005\u0000\u0000\u020b"+
		"\u020c\u0005\b\u0000\u0000\u020c\u020d\u00038\u001c\u0000\u020d\u020e"+
		"\u0005\t\u0000\u0000\u020e\u0218\u0001\u0000\u0000\u0000\u020f\u0210\n"+
		"\u0001\u0000\u0000\u0210\u0211\u0005\u0013\u0000\u0000\u0211\u0212\u0005"+
		"Z\u0000\u0000\u0212\u0214\u0005\u0006\u0000\u0000\u0213\u0215\u0003@ "+
		"\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0005\u0007\u0000"+
		"\u0000\u0217\u0207\u0001\u0000\u0000\u0000\u0217\u020a\u0001\u0000\u0000"+
		"\u0000\u0217\u020f\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000"+
		"\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a=\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000"+
		"\u021c\u021f\u0005\u0012\u0000\u0000\u021d\u0220\u0003\u008cF\u0000\u021e"+
		"\u0220\u0003\u008eG\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u021e"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0005\b\u0000\u0000\u0222\u0223\u00038\u001c\u0000\u0223\u0224\u0005"+
		"\t\u0000\u0000\u0224?\u0001\u0000\u0000\u0000\u0225\u022a\u00038\u001c"+
		"\u0000\u0226\u0227\u0005\f\u0000\u0000\u0227\u0229\u00038\u001c\u0000"+
		"\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000"+
		"\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000"+
		"\u022bA\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0006!\uffff\uffff\u0000\u022e\u022f\u0003D\"\u0000\u022f\u0230"+
		"\u0003F#\u0000\u0230\u0231\u0003:\u001d\u0000\u0231\u0238\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0003:\u001d\u0000\u0233\u0234\u0003H$\u0000"+
		"\u0234\u0235\u0003D\"\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236"+
		"\u0238\u0003L&\u0000\u0237\u022d\u0001\u0000\u0000\u0000\u0237\u0232\u0001"+
		"\u0000\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238\u023f\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\n\u0002\u0000\u0000\u023a\u023b\u0003H"+
		"$\u0000\u023b\u023c\u0003D\"\u0000\u023c\u023e\u0001\u0000\u0000\u0000"+
		"\u023d\u0239\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240C\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0006\"\uffff\uffff\u0000\u0243\u0244\u0003:\u001d\u0000\u0244"+
		"\u024b\u0001\u0000\u0000\u0000\u0245\u0246\n\u0002\u0000\u0000\u0246\u0247"+
		"\u0003F#\u0000\u0247\u0248\u0003:\u001d\u0000\u0248\u024a\u0001\u0000"+
		"\u0000\u0000\u0249\u0245\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000"+
		"\u0000\u0000\u024cE\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000"+
		"\u0000\u024e\u0252\u0005\u0014\u0000\u0000\u024f\u0252\u0005\u0015\u0000"+
		"\u0000\u0250\u0252\u0005\u0016\u0000\u0000\u0251\u024e\u0001\u0000\u0000"+
		"\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000"+
		"\u0000\u0252G\u0001\u0000\u0000\u0000\u0253\u0256\u0005\u0017\u0000\u0000"+
		"\u0254\u0256\u0005\u0018\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000"+
		"\u0255\u0254\u0001\u0000\u0000\u0000\u0256I\u0001\u0000\u0000\u0000\u0257"+
		"\u025a\u0005\u0019\u0000\u0000\u0258\u025a\u0005\u001a\u0000\u0000\u0259"+
		"\u0257\u0001\u0000\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a"+
		"K\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u0018\u0000\u0000\u025c\u025d"+
		"\u00038\u001c\u0000\u025dM\u0001\u0000\u0000\u0000\u025e\u0261\u0003:"+
		"\u001d\u0000\u025f\u0261\u0003B!\u0000\u0260\u025e\u0001\u0000\u0000\u0000"+
		"\u0260\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0265\u0003Z-\u0000\u0263\u0266\u0003:\u001d\u0000\u0264\u0266"+
		"\u0003B!\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0264\u0001\u0000"+
		"\u0000\u0000\u0266\u0281\u0001\u0000\u0000\u0000\u0267\u0268\u0003P(\u0000"+
		"\u0268\u026b\u0003\\.\u0000\u0269\u026c\u0003P(\u0000\u026a\u026c\u0003"+
		"R)\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b\u026a\u0001\u0000\u0000"+
		"\u0000\u026c\u0281\u0001\u0000\u0000\u0000\u026d\u026e\u0003R)\u0000\u026e"+
		"\u0271\u0005;\u0000\u0000\u026f\u0272\u0003R)\u0000\u0270\u0272\u0003"+
		"T*\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0270\u0001\u0000\u0000"+
		"\u0000\u0272\u0281\u0001\u0000\u0000\u0000\u0273\u0274\u0003T*\u0000\u0274"+
		"\u0277\u0005<\u0000\u0000\u0275\u0278\u0003T*\u0000\u0276\u0278\u0003"+
		"V+\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0276\u0001\u0000\u0000"+
		"\u0000\u0278\u0281\u0001\u0000\u0000\u0000\u0279\u027a\u0003V+\u0000\u027a"+
		"\u027d\u0005=\u0000\u0000\u027b\u027e\u0003N\'\u0000\u027c\u027e\u0003"+
		":\u001d\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027c\u0001\u0000"+
		"\u0000\u0000\u027e\u0281\u0001\u0000\u0000\u0000\u027f\u0281\u0003X,\u0000"+
		"\u0280\u0260\u0001\u0000\u0000\u0000\u0280\u0267\u0001\u0000\u0000\u0000"+
		"\u0280\u026d\u0001\u0000\u0000\u0000\u0280\u0273\u0001\u0000\u0000\u0000"+
		"\u0280\u0279\u0001\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000"+
		"\u0281O\u0001\u0000\u0000\u0000\u0282\u0285\u0003:\u001d\u0000\u0283\u0285"+
		"\u0003B!\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0289\u0003Z-\u0000"+
		"\u0287\u028a\u0003:\u001d\u0000\u0288\u028a\u0003B!\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028a\u028e"+
		"\u0001\u0000\u0000\u0000\u028b\u028e\u0003X,\u0000\u028c\u028e\u0003:"+
		"\u001d\u0000\u028d\u0284\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028eQ\u0001\u0000\u0000"+
		"\u0000\u028f\u0292\u0003:\u001d\u0000\u0290\u0292\u0003B!\u0000\u0291"+
		"\u028f\u0001\u0000\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0001\u0000\u0000\u0000\u0293\u0296\u0003Z-\u0000\u0294\u0297\u0003"+
		":\u001d\u0000\u0295\u0297\u0003B!\u0000\u0296\u0294\u0001\u0000\u0000"+
		"\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297\u02a1\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0003P(\u0000\u0299\u029c\u0003\\.\u0000\u029a\u029d"+
		"\u0003P(\u0000\u029b\u029d\u0003R)\u0000\u029c\u029a\u0001\u0000\u0000"+
		"\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u02a1\u0001\u0000\u0000"+
		"\u0000\u029e\u02a1\u0003X,\u0000\u029f\u02a1\u0003:\u001d\u0000\u02a0"+
		"\u0291\u0001\u0000\u0000\u0000\u02a0\u0298\u0001\u0000\u0000\u0000\u02a0"+
		"\u029e\u0001\u0000\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1"+
		"S\u0001\u0000\u0000\u0000\u02a2\u02a5\u0003:\u001d\u0000\u02a3\u02a5\u0003"+
		"B!\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a9\u0003Z-\u0000\u02a7"+
		"\u02aa\u0003:\u001d\u0000\u02a8\u02aa\u0003B!\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ba\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0003P(\u0000\u02ac\u02af\u0003\\.\u0000"+
		"\u02ad\u02b0\u0003P(\u0000\u02ae\u02b0\u0003R)\u0000\u02af\u02ad\u0001"+
		"\u0000\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0\u02ba\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b2\u0003R)\u0000\u02b2\u02b5\u0005;\u0000"+
		"\u0000\u02b3\u02b6\u0003R)\u0000\u02b4\u02b6\u0003T*\u0000\u02b5\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b6\u02ba"+
		"\u0001\u0000\u0000\u0000\u02b7\u02ba\u0003X,\u0000\u02b8\u02ba\u0003:"+
		"\u001d\u0000\u02b9\u02a4\u0001\u0000\u0000\u0000\u02b9\u02ab\u0001\u0000"+
		"\u0000\u0000\u02b9\u02b1\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02baU\u0001\u0000\u0000"+
		"\u0000\u02bb\u02be\u0003:\u001d\u0000\u02bc\u02be\u0003B!\u0000\u02bd"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02be"+
		"\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c2\u0003Z-\u0000\u02c0\u02c3\u0003"+
		":\u001d\u0000\u02c1\u02c3\u0003B!\u0000\u02c2\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02da\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0003P(\u0000\u02c5\u02c7\u0003\\.\u0000\u02c6\u02c8"+
		"\u0003P(\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000"+
		"\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000"+
		"\u0000\u0000\u02ca\u02da\u0001\u0000\u0000\u0000\u02cb\u02cc\u0003R)\u0000"+
		"\u02cc\u02cf\u0005;\u0000\u0000\u02cd\u02d0\u0003R)\u0000\u02ce\u02d0"+
		"\u0003T*\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000"+
		"\u0000\u0000\u02d0\u02da\u0001\u0000\u0000\u0000\u02d1\u02d2\u0003T*\u0000"+
		"\u02d2\u02d5\u0005<\u0000\u0000\u02d3\u02d6\u0003T*\u0000\u02d4\u02d6"+
		"\u0003V+\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d6\u02da\u0001\u0000\u0000\u0000\u02d7\u02da\u0003X,\u0000"+
		"\u02d8\u02da\u0003:\u001d\u0000\u02d9\u02bd\u0001\u0000\u0000\u0000\u02d9"+
		"\u02c4\u0001\u0000\u0000\u0000\u02d9\u02cb\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d8\u0001\u0000\u0000\u0000\u02daW\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0005\u001b\u0000\u0000\u02dc\u02dd\u0003:\u001d\u0000\u02ddY\u0001\u0000"+
		"\u0000\u0000\u02de\u02e3\u0005\u001c\u0000\u0000\u02df\u02e3\u0005\u001d"+
		"\u0000\u0000\u02e0\u02e3\u0005\u001e\u0000\u0000\u02e1\u02e3\u0005\u001f"+
		"\u0000\u0000\u02e2\u02de\u0001\u0000\u0000\u0000\u02e2\u02df\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e3[\u0001\u0000\u0000\u0000\u02e4\u02e7\u0005 \u0000\u0000"+
		"\u02e5\u02e7\u0005!\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e7]\u0001\u0000\u0000\u0000\u02e8\u02fd"+
		"\u0003b1\u0000\u02e9\u02ea\u00038\u001c\u0000\u02ea\u02eb\u0005\u0002"+
		"\u0000\u0000\u02eb\u02fd\u0001\u0000\u0000\u0000\u02ec\u02fd\u0003h4\u0000"+
		"\u02ed\u02fd\u0003f3\u0000\u02ee\u02fd\u0003j5\u0000\u02ef\u02fd\u0003"+
		"l6\u0000\u02f0\u02f1\u0003J%\u0000\u02f1\u02f2\u0003\u0098L\u0000\u02f2"+
		"\u02fd\u0001\u0000\u0000\u0000\u02f3\u02f4\u0003\u0098L\u0000\u02f4\u02f5"+
		"\u0003J%\u0000\u02f5\u02fd\u0001\u0000\u0000\u0000\u02f6\u02fd\u0003p"+
		"8\u0000\u02f7\u02fd\u0003x<\u0000\u02f8\u02fd\u0003z=\u0000\u02f9\u02fd"+
		"\u0003,\u0016\u0000\u02fa\u02fd\u0003|>\u0000\u02fb\u02fd\u0003\u0082"+
		"A\u0000\u02fc\u02e8\u0001\u0000\u0000\u0000\u02fc\u02e9\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ec\u0001\u0000\u0000\u0000\u02fc\u02ed\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ee\u0001\u0000\u0000\u0000\u02fc\u02ef\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f0\u0001\u0000\u0000\u0000\u02fc\u02f3\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f6\u0001\u0000\u0000\u0000\u02fc\u02f7\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f8\u0001\u0000\u0000\u0000\u02fc\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fd_\u0001\u0000\u0000\u0000\u02fe\u0301\u0003d2\u0000\u02ff"+
		"\u0301\u0003^/\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u02ff\u0001"+
		"\u0000\u0000\u0000\u0301a\u0001\u0000\u0000\u0000\u0302\u0306\u0005\r"+
		"\u0000\u0000\u0303\u0305\u0003`0\u0000\u0304\u0303\u0001\u0000\u0000\u0000"+
		"\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030a\u0005\u000e\u0000\u0000"+
		"\u030ac\u0001\u0000\u0000\u0000\u030b\u030c\u0003\u008aE\u0000\u030c\u0311"+
		"\u00032\u0019\u0000\u030d\u030e\u0005\f\u0000\u0000\u030e\u0310\u0003"+
		"2\u0019\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0313\u0001\u0000"+
		"\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000"+
		"\u0000\u0000\u0312\u0314\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0005\u0002\u0000\u0000\u0315e\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0005\"\u0000\u0000\u0317\u0318\u0005\u0006\u0000\u0000"+
		"\u0318\u0319\u00038\u001c\u0000\u0319\u031a\u0005\u0007\u0000\u0000\u031a"+
		"\u031b\u0003^/\u0000\u031bg\u0001\u0000\u0000\u0000\u031c\u031d\u0005"+
		"\"\u0000\u0000\u031d\u031e\u0005\u0006\u0000\u0000\u031e\u031f\u00038"+
		"\u001c\u0000\u031f\u0320\u0005\u0007\u0000\u0000\u0320\u0321\u0003^/\u0000"+
		"\u0321\u0322\u0005#\u0000\u0000\u0322\u0323\u0003^/\u0000\u0323i\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0005$\u0000\u0000\u0325\u0326\u0005\u0006"+
		"\u0000\u0000\u0326\u0327\u00038\u001c\u0000\u0327\u0328\u0005\u0007\u0000"+
		"\u0000\u0328\u0329\u0003^/\u0000\u0329k\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0005%\u0000\u0000\u032b\u032c\u0005\u0006\u0000\u0000\u032c\u032d"+
		"\u0003n7\u0000\u032d\u032e\u0005\u0007\u0000\u0000\u032e\u032f\u0003^"+
		"/\u0000\u032fm\u0001\u0000\u0000\u0000\u0330\u0333\u0003d2\u0000\u0331"+
		"\u0333\u0005\u0002\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332"+
		"\u0331\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334"+
		"\u0336\u0003N\'\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336"+
		"\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0339"+
		"\u0005\u0002\u0000\u0000\u0338\u033a\u00038\u001c\u0000\u0339\u0338\u0001"+
		"\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033ao\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0005&\u0000\u0000\u033c\u033d\u0005\u0006\u0000"+
		"\u0000\u033d\u033e\u00038\u001c\u0000\u033e\u033f\u0005\u0007\u0000\u0000"+
		"\u033f\u0343\u0005\r\u0000\u0000\u0340\u0342\u0003r9\u0000\u0341\u0340"+
		"\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0346"+
		"\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0005\u000e\u0000\u0000\u0347q\u0001\u0000\u0000\u0000\u0348\u034a\u0003"+
		"t:\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000"+
		"\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000"+
		"\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u034e\u0003v;\u0000\u034e"+
		"s\u0001\u0000\u0000\u0000\u034f\u0350\u0005\'\u0000\u0000\u0350\u0351"+
		"\u00038\u001c\u0000\u0351\u0352\u0005(\u0000\u0000\u0352\u0356\u0001\u0000"+
		"\u0000\u0000\u0353\u0354\u0005)\u0000\u0000\u0354\u0356\u0005(\u0000\u0000"+
		"\u0355\u034f\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000"+
		"\u0356u\u0001\u0000\u0000\u0000\u0357\u0359\u0003^/\u0000\u0358\u0357"+
		"\u0001\u0000\u0000\u0000\u0359\u035c\u0001\u0000\u0000\u0000\u035a\u0358"+
		"\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035e"+
		"\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035d\u035f"+
		"\u0003x<\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000"+
		"\u0000\u0000\u035fw\u0001\u0000\u0000\u0000\u0360\u0361\u0005*\u0000\u0000"+
		"\u0361\u0362\u0005\u0002\u0000\u0000\u0362y\u0001\u0000\u0000\u0000\u0363"+
		"\u0364\u0005+\u0000\u0000\u0364\u0365\u0005\u0002\u0000\u0000\u0365{\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0005,\u0000\u0000\u0367\u0369\u0003b1"+
		"\u0000\u0368\u036a\u0003~?\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u036a"+
		"\u036b\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036b"+
		"\u036c\u0001\u0000\u0000\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d"+
		"\u036f\u0003\u0080@\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f}\u0001\u0000\u0000\u0000\u0370\u0371\u0005"+
		"-\u0000\u0000\u0371\u0372\u0005\u0006\u0000\u0000\u0372\u0373\u0003\u008a"+
		"E\u0000\u0373\u0374\u0005Z\u0000\u0000\u0374\u0375\u0005\u0007\u0000\u0000"+
		"\u0375\u0376\u0003b1\u0000\u0376\u007f\u0001\u0000\u0000\u0000\u0377\u0378"+
		"\u0005.\u0000\u0000\u0378\u0379\u0003b1\u0000\u0379\u0081\u0001\u0000"+
		"\u0000\u0000\u037a\u037b\u0005/\u0000\u0000\u037b\u037c\u00038\u001c\u0000"+
		"\u037c\u037d\u0005\u0002\u0000\u0000\u037d\u0083\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0003\u0098L\u0000\u037f\u0380\u0003\u0086C\u0000\u0380\u0381"+
		"\u00038\u001c\u0000\u0381\u039d\u0001\u0000\u0000\u0000\u0382\u0383\u0003"+
		">\u001f\u0000\u0383\u0384\u0005\u0013\u0000\u0000\u0384\u0385\u0005Z\u0000"+
		"\u0000\u0385\u0386\u0003\u0086C\u0000\u0386\u0387\u00038\u001c\u0000\u0387"+
		"\u039d\u0001\u0000\u0000\u0000\u0388\u0389\u0003<\u001e\u0000\u0389\u038a"+
		"\u0005\u0013\u0000\u0000\u038a\u038b\u0005Z\u0000\u0000\u038b\u038c\u0003"+
		"\u0086C\u0000\u038c\u038d\u00038\u001c\u0000\u038d\u039d\u0001\u0000\u0000"+
		"\u0000\u038e\u038f\u0003\u0098L\u0000\u038f\u0390\u0005\b\u0000\u0000"+
		"\u0390\u0391\u00038\u001c\u0000\u0391\u0392\u0005\t\u0000\u0000\u0392"+
		"\u0393\u0003\u0086C\u0000\u0393\u0394\u00038\u001c\u0000\u0394\u039d\u0001"+
		"\u0000\u0000\u0000\u0395\u0396\u0003<\u001e\u0000\u0396\u0397\u0005\b"+
		"\u0000\u0000\u0397\u0398\u00038\u001c\u0000\u0398\u0399\u0005\t\u0000"+
		"\u0000\u0399\u039a\u0003\u0086C\u0000\u039a\u039b\u00038\u001c\u0000\u039b"+
		"\u039d\u0001\u0000\u0000\u0000\u039c\u037e\u0001\u0000\u0000\u0000\u039c"+
		"\u0382\u0001\u0000\u0000\u0000\u039c\u0388\u0001\u0000\u0000\u0000\u039c"+
		"\u038e\u0001\u0000\u0000\u0000\u039c\u0395\u0001\u0000\u0000\u0000\u039d"+
		"\u0085\u0001\u0000\u0000\u0000\u039e\u039f\u0007\u0001\u0000\u0000\u039f"+
		"\u0087\u0001\u0000\u0000\u0000\u03a0\u03a3\u0003\u008aE\u0000\u03a1\u03a3"+
		"\u0005J\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a3\u0089\u0001\u0000\u0000\u0000\u03a4\u03a8\u0003"+
		"\u008cF\u0000\u03a5\u03a8\u0003\u008eG\u0000\u03a6\u03a8\u0003\u0090H"+
		"\u0000\u03a7\u03a4\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a6\u0001\u0000\u0000\u0000\u03a8\u008b\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0003\u0098L\u0000\u03aa\u008d\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ac\u0007\u0002\u0000\u0000\u03ac\u008f\u0001\u0000\u0000\u0000"+
		"\u03ad\u03b0\u0003\u008eG\u0000\u03ae\u03b0\u0003\u008cF\u0000\u03af\u03ad"+
		"\u0001\u0000\u0000\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005\b\u0000\u0000\u03b2\u03b3\u0005"+
		"\t\u0000\u0000\u03b3\u0091\u0001\u0000\u0000\u0000\u03b4\u03b8\u0005K"+
		"\u0000\u0000\u03b5\u03b8\u00058\u0000\u0000\u03b6\u03b8\u00059\u0000\u0000"+
		"\u03b7\u03b4\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000"+
		"\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8\u0093\u0001\u0000\u0000\u0000"+
		"\u03b9\u03ba\u0007\u0003\u0000\u0000\u03ba\u0095\u0001\u0000\u0000\u0000"+
		"\u03bb\u03c4\u0003\u0092I\u0000\u03bc\u03be\u0005M\u0000\u0000\u03bd\u03bc"+
		"\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf"+
		"\u0001\u0000\u0000\u0000\u03bf\u03c5\u0005N\u0000\u0000\u03c0\u03c2\u0005"+
		"N\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c5\u0005M\u0000"+
		"\u0000\u03c4\u03bd\u0001\u0000\u0000\u0000\u03c4\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03e2\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c8\u0005M\u0000\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000"+
		"\u03c9\u03cf\u0005N\u0000\u0000\u03ca\u03cc\u0005N\u0000\u0000\u03cb\u03ca"+
		"\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd"+
		"\u0001\u0000\u0000\u0000\u03cd\u03cf\u0005M\u0000\u0000\u03ce\u03c7\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cb\u0001\u0000\u0000\u0000\u03cf\u03d1\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d2\u0003\u0092I\u0000\u03d1\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03e2\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d5\u0005M\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d7\u0003\u0092I\u0000\u03d7\u03d8\u0005N\u0000\u0000\u03d8"+
		"\u03e0\u0001\u0000\u0000\u0000\u03d9\u03db\u0005N\u0000\u0000\u03da\u03d9"+
		"\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc"+
		"\u0001\u0000\u0000\u0000\u03dc\u03dd\u0003\u0092I\u0000\u03dd\u03de\u0005"+
		"M\u0000\u0000\u03de\u03e0\u0001\u0000\u0000\u0000\u03df\u03d4\u0001\u0000"+
		"\u0000\u0000\u03df\u03da\u0001\u0000\u0000\u0000\u03e0\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e1\u03bb\u0001\u0000\u0000\u0000\u03e1\u03ce\u0001\u0000"+
		"\u0000\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2\u0097\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e4\u0005Z\u0000\u0000\u03e4\u03e6\u0005\u0013\u0000"+
		"\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e6\u03e9\u0001\u0000\u0000"+
		"\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000"+
		"\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000"+
		"\u0000\u03ea\u03eb\u0005Z\u0000\u0000\u03eb\u0099\u0001\u0000\u0000\u0000"+
		"~\u009b\u00a0\u00a6\u00b1\u00b5\u00bc\u00bf\u00c2\u00c7\u00ca\u00cf\u00d4"+
		"\u00d9\u00dc\u00e0\u00e3\u00e9\u00f0\u00f6\u00fd\u0104\u0109\u010c\u0112"+
		"\u0119\u011f\u0124\u0132\u013b\u0142\u014a\u0151\u0157\u015e\u0162\u0168"+
		"\u016f\u0174\u017c\u0184\u0188\u0194\u0198\u01a0\u01a8\u01ac\u01b4\u01b7"+
		"\u01ba\u01be\u01c7\u01cc\u01e0\u01f0\u01f8\u0201\u0205\u0214\u0217\u0219"+
		"\u021f\u022a\u0237\u023f\u024b\u0251\u0255\u0259\u0260\u0265\u026b\u0271"+
		"\u0277\u027d\u0280\u0284\u0289\u028d\u0291\u0296\u029c\u02a0\u02a4\u02a9"+
		"\u02af\u02b5\u02b9\u02bd\u02c2\u02c9\u02cf\u02d5\u02d9\u02e2\u02e6\u02fc"+
		"\u0300\u0306\u0311\u0332\u0335\u0339\u0343\u034b\u0355\u035a\u035e\u036b"+
		"\u036e\u039c\u03a2\u03a7\u03af\u03b7\u03bd\u03c1\u03c4\u03c7\u03cb\u03ce"+
		"\u03d1\u03d4\u03da\u03df\u03e1\u03e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}