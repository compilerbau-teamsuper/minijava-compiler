// Generated from G:/Git/minijava-compiler/src/main/java/miniJavaParser/miniJava.g4 by ANTLR 4.13.2
package miniJavaParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class miniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, Wildcard=62, XOR=63, AND=64, OR=65, ASSIGN=66, ADD_ASSIGN=67, 
		SUB_ASSIGN=68, MUL_ASSIGN=69, DIV_ASSIGN=70, AND_ASSIGN=71, OR_ASSIGN=72, 
		XOR_ASSIGN=73, MOD_ASSIGN=74, LSHIFT_ASSIGN=75, RSHIFT_ASSIGN=76, URSHIFT_ASSIGN=77, 
		VoidType=78, Public=79, Abstract=80, Final=81, Static=82, BooleanLiteral=83, 
		IntegerLiteral=84, LongLiteral=85, NullLiteral=86, FloatingPointLiteral=87, 
		DoubleLiteral=88, CharacterLiteral=89, StringLiteral=90, WS=91, COMMENT=92, 
		LINE_COMMENT=93, Identifier=94;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_interfaceMethodDeclaration = 7, RULE_constructorDeclaration = 8, 
		RULE_superclass = 9, RULE_superinterfaces = 10, RULE_extendsInterfaces = 11, 
		RULE_classBody = 12, RULE_classBodyDeclaration = 13, RULE_memberDeclaration = 14, 
		RULE_interfaceBody = 15, RULE_interfaceBodyDeclaration = 16, RULE_interfaceMemberDeclaration = 17, 
		RULE_methodBody = 18, RULE_methodBodyStatement = 19, RULE_return = 20, 
		RULE_formalParameters = 21, RULE_fieldDeclaration = 22, RULE_variableDeclarator = 23, 
		RULE_variableInitializer = 24, RULE_arrayInitializer = 25, RULE_expression = 26, 
		RULE_value = 27, RULE_primary = 28, RULE_expressionList = 29, RULE_methodCall = 30, 
		RULE_arrayAccess = 31, RULE_newObject = 32, RULE_calcFunction = 33, RULE_term = 34, 
		RULE_calcBinOpHigher = 35, RULE_calcBinOpLower = 36, RULE_calcUnOp = 37, 
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
		RULE_fieldModifier = 75, RULE_qualifiedName = 76, RULE_literal = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classDeclaration", "interfaceDeclaration", "methodDeclaration", "interfaceMethodDeclaration", 
			"constructorDeclaration", "superclass", "superinterfaces", "extendsInterfaces", 
			"classBody", "classBodyDeclaration", "memberDeclaration", "interfaceBody", 
			"interfaceBodyDeclaration", "interfaceMemberDeclaration", "methodBody", 
			"methodBodyStatement", "return", "formalParameters", "fieldDeclaration", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "expression", 
			"value", "primary", "expressionList", "methodCall", "arrayAccess", "newObject", 
			"calcFunction", "term", "calcBinOpHigher", "calcBinOpLower", "calcUnOp", 
			"negate", "booleanFunction", "booleanFunHigh", "booleanFunMiddle", "booleanFunLow", 
			"booleanFunUnderground", "inverse", "booleanNumberOp", "booleanOp", "statement", 
			"blockStatement", "block", "localVariableDeclaration", "ifThen", "ifThenElse", 
			"whileStatement", "forStatement", "forControl", "switch", "switchBlockStatementGroup", 
			"switchLabel", "switchBlock", "break", "continue", "tryStatement", "catchClause", 
			"finallyClause", "throwStatement", "assignment", "assignmentType", "typeOrVoid", 
			"type", "objectType", "primitiveType", "arrayType", "accessModifier", 
			"classModifier", "fieldModifier", "qualifiedName", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'class'", "'interface'", "'('", 
			"')'", "'['", "']'", "'extends'", "'implements'", "','", "'{'", "'}'", 
			"'return'", "'new'", "').'", "'*'", "'/'", "'%'", "'+'", "'-'", "'++'", 
			"'--'", "'!'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'if'", 
			"'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", 
			"'break'", "'continue'", "'try'", "'catch'", "'finally'", "'throw'", 
			"'String'", "'Short'", "'Integer'", "'Float'", "'Double'", "'Boolean'", 
			"'Character'", "'short'", "'int'", "'float'", "'double'", "'boolean'", 
			"'char'", "'private'", "'protected'", "'.'", null, "'^'", "'&&'", "'||'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'<<='", "'>>='", "'>>>='", "'void'", "'public'", "'abstract'", "'final'", 
			"'static'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Wildcard", "XOR", "AND", "OR", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "VoidType", 
			"Public", "Abstract", "Final", "Static", "BooleanLiteral", "IntegerLiteral", 
			"LongLiteral", "NullLiteral", "FloatingPointLiteral", "DoubleLiteral", 
			"CharacterLiteral", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT", 
			"Identifier"
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(156);
				packageDeclaration();
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(159);
				importDeclaration();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382256910270516L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7L) != 0)) {
				{
				{
				setState(165);
				typeDeclaration();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
			setState(173);
			match(T__0);
			setState(174);
			qualifiedName();
			setState(175);
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
			setState(177);
			match(T__2);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(178);
				match(Static);
				}
			}

			setState(181);
			qualifiedName();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Wildcard) {
				{
				setState(182);
				match(Wildcard);
				}
			}

			setState(185);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1048579L) != 0)) {
				{
				setState(192);
				accessModifier();
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(195);
				classModifier();
				}
			}

			setState(198);
			match(T__3);
			setState(199);
			match(Identifier);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(200);
				superclass();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(203);
				superinterfaces();
				}
			}

			setState(206);
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
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(208);
				match(Public);
				}
			}

			setState(211);
			match(T__4);
			setState(212);
			match(Identifier);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(213);
				extendsInterfaces();
				}
			}

			setState(216);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1048579L) != 0)) {
					{
					setState(218);
					accessModifier();
					}
				}

				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(221);
						match(Final);
						}
					}

					setState(224);
					match(Static);
					}
					break;
				case 2:
					{
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(225);
						match(Static);
						}
					}

					setState(228);
					match(Final);
					}
					break;
				}
				setState(231);
				typeOrVoid();
				setState(232);
				match(Identifier);
				setState(233);
				match(T__5);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 281474976718847L) != 0)) {
					{
					setState(234);
					formalParameters();
					}
				}

				setState(237);
				match(T__6);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(238);
					match(T__7);
					setState(239);
					match(T__8);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				methodBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1048579L) != 0)) {
					{
					setState(247);
					accessModifier();
					}
				}

				setState(250);
				match(Abstract);
				setState(251);
				typeOrVoid();
				setState(252);
				match(Identifier);
				setState(253);
				match(T__5);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 281474976718847L) != 0)) {
					{
					setState(254);
					formalParameters();
					}
				}

				setState(257);
				match(T__6);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(258);
					match(T__7);
					setState(259);
					match(T__8);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
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
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(269);
				match(Public);
				}
			}

			setState(272);
			typeOrVoid();
			setState(273);
			match(Identifier);
			setState(274);
			match(T__5);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 281474976718847L) != 0)) {
				{
				setState(275);
				formalParameters();
				}
			}

			setState(278);
			match(T__6);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(279);
				match(T__7);
				setState(280);
				match(T__8);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1048579L) != 0)) {
				{
				setState(288);
				accessModifier();
				}
			}

			setState(291);
			match(Identifier);
			setState(292);
			match(T__5);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 281474976718847L) != 0)) {
				{
				setState(293);
				formalParameters();
				}
			}

			setState(296);
			match(T__6);
			setState(297);
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
			setState(299);
			match(T__9);
			setState(300);
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
			setState(302);
			match(T__10);
			setState(303);
			qualifiedName();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(304);
					match(T__11);
					setState(305);
					qualifiedName();
					}
					} 
				}
				setState(310);
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
			setState(311);
			match(T__9);
			setState(312);
			qualifiedName();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(313);
					match(T__11);
					setState(314);
					qualifiedName();
					}
					} 
				}
				setState(319);
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
			setState(320);
			match(T__12);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305772640469524532L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 65567L) != 0)) {
				{
				{
				setState(321);
				classBodyDeclaration();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
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
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__1);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				block();
				}
				break;
			case T__3:
			case T__4:
			case T__45:
			case T__46:
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
			case T__57:
			case T__58:
			case T__59:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
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
			setState(341);
			match(T__12);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305772640469516292L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 65563L) != 0)) {
				{
				{
				setState(342);
				interfaceBodyDeclaration();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__1);
				}
				break;
			case T__45:
			case T__46:
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
			case T__57:
			case T__58:
			case T__59:
			case VoidType:
			case Public:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				interfaceMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
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
			setState(358);
			match(T__12);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576433389066821696L) != 0) || _la==Identifier) {
				{
				{
				setState(359);
				methodBodyStatement();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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
		enterRule(_localctx, 38, RULE_methodBodyStatement);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				localVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
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
		enterRule(_localctx, 40, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__14);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37814336L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(373);
				expression();
				}
			}

			setState(376);
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
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			type();
			setState(379);
			match(Identifier);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(380);
				match(T__11);
				setState(381);
				type();
				setState(382);
				match(Identifier);
				}
				}
				setState(388);
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
		enterRule(_localctx, 44, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 13631491L) != 0)) {
				{
				setState(389);
				fieldModifier();
				}
			}

			setState(392);
			type();
			setState(393);
			variableDeclarator();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(394);
				match(T__11);
				setState(395);
				variableDeclarator();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
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
		enterRule(_localctx, 46, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Identifier);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(404);
				match(ASSIGN);
				setState(405);
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
		enterRule(_localctx, 48, RULE_variableInitializer);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 50, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(T__12);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37814336L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
					{
					setState(413);
					expression();
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(414);
							match(T__11);
							setState(415);
							expression();
							}
							} 
						}
						setState(420);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					}
					}
				}

				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(423);
					match(T__11);
					}
				}

				setState(426);
				match(T__13);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(T__15);
				setState(428);
				type();
				setState(429);
				match(T__7);
				setState(430);
				expression();
				setState(431);
				match(T__8);
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
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				calcFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				newObject();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
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
	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(T__5);
				setState(442);
				expression();
				setState(443);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				arrayAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primary);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(T__5);
				setState(452);
				expression();
				setState(453);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
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
		enterRule(_localctx, 58, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expression();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(460);
				match(T__11);
				setState(461);
				expression();
				}
				}
				setState(466);
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
	public static class MethodCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
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

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(467);
				match(T__5);
				setState(468);
				expression();
				setState(469);
				match(T__16);
				setState(470);
				qualifiedName();
				}
				break;
			case Identifier:
				{
				setState(472);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(475);
			match(T__5);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37814336L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(476);
				expressionList();
				}
			}

			setState(479);
			match(T__6);
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
	public static class ArrayAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
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

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			primary();
			setState(482);
			match(T__7);
			setState(483);
			expression();
			setState(484);
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
	public static class NewObjectContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
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

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_newObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__15);
			setState(487);
			methodCall();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CalcBinOpHigherContext calcBinOpHigher() {
			return getRuleContext(CalcBinOpHigherContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CalcBinOpLowerContext calcBinOpLower() {
			return getRuleContext(CalcBinOpLowerContext.class,0);
		}
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
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
		CalcFunctionContext _localctx = new CalcFunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_calcFunction);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				value();
				setState(490);
				calcBinOpHigher();
				setState(491);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				term();
				setState(494);
				calcBinOpLower();
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(495);
					calcFunction();
					}
					break;
				case 2:
					{
					setState(496);
					value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				negate();
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
	public static class TermContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CalcBinOpHigherContext calcBinOpHigher() {
			return getRuleContext(CalcBinOpHigherContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_term);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				value();
				setState(503);
				calcBinOpHigher();
				setState(504);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
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
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new MULContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new DIVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new MODContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(T__19);
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
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
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
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new INCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new DECContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
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
			setState(522);
			match(T__21);
			setState(523);
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
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(525);
					value();
					}
					break;
				case 2:
					{
					setState(526);
					calcFunction();
					}
					break;
				}
				setState(529);
				booleanNumberOp();
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(530);
					value();
					}
					break;
				case 2:
					{
					setState(531);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				booleanFunHigh();
				setState(535);
				booleanOp();
				setState(538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(536);
					booleanFunHigh();
					}
					break;
				case 2:
					{
					setState(537);
					booleanFunMiddle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				booleanFunMiddle();
				setState(541);
				match(XOR);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(542);
					booleanFunMiddle();
					}
					break;
				case 2:
					{
					setState(543);
					booleanFunLow();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				booleanFunLow();
				setState(547);
				match(AND);
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(548);
					booleanFunLow();
					}
					break;
				case 2:
					{
					setState(549);
					booleanFunUnderground();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				booleanFunUnderground();
				setState(553);
				match(OR);
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(554);
					booleanFunction();
					}
					break;
				case 2:
					{
					setState(555);
					value();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558);
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
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(561);
					value();
					}
					break;
				case 2:
					{
					setState(562);
					calcFunction();
					}
					break;
				}
				setState(565);
				booleanNumberOp();
				setState(568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(566);
					value();
					}
					break;
				case 2:
					{
					setState(567);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				inverse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
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
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(574);
					value();
					}
					break;
				case 2:
					{
					setState(575);
					calcFunction();
					}
					break;
				}
				setState(578);
				booleanNumberOp();
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(579);
					value();
					}
					break;
				case 2:
					{
					setState(580);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				booleanFunHigh();
				setState(584);
				booleanOp();
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(585);
					booleanFunHigh();
					}
					break;
				case 2:
					{
					setState(586);
					booleanFunMiddle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				inverse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
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
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(593);
					value();
					}
					break;
				case 2:
					{
					setState(594);
					calcFunction();
					}
					break;
				}
				setState(597);
				booleanNumberOp();
				setState(600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(598);
					value();
					}
					break;
				case 2:
					{
					setState(599);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				booleanFunHigh();
				setState(603);
				booleanOp();
				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(604);
					booleanFunHigh();
					}
					break;
				case 2:
					{
					setState(605);
					booleanFunMiddle();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				booleanFunMiddle();
				setState(609);
				match(XOR);
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(610);
					booleanFunMiddle();
					}
					break;
				case 2:
					{
					setState(611);
					booleanFunLow();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				inverse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(615);
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
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(618);
					value();
					}
					break;
				case 2:
					{
					setState(619);
					calcFunction();
					}
					break;
				}
				setState(622);
				booleanNumberOp();
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(623);
					value();
					}
					break;
				case 2:
					{
					setState(624);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				booleanFunHigh();
				setState(628);
				booleanOp();
				setState(630); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(629);
						booleanFunHigh();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(632); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				booleanFunMiddle();
				setState(635);
				match(XOR);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(636);
					booleanFunMiddle();
					}
					break;
				case 2:
					{
					setState(637);
					booleanFunLow();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				booleanFunLow();
				setState(641);
				match(AND);
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(642);
					booleanFunLow();
					}
					break;
				case 2:
					{
					setState(643);
					booleanFunUnderground();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				inverse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
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
			setState(650);
			match(T__24);
			setState(651);
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
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				_localctx = new GTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new LTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new LEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new GEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				match(T__28);
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
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new EQUALContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new NOTEQUALContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
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
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public ContinueContext continue_() {
			return getRuleContext(ContinueContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CalcUnOpContext calcUnOp() {
			return getRuleContext(CalcUnOpContext.class,0);
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
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				methodCall();
				setState(665);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				ifThenElse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				ifThen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(670);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(671);
				switch_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(672);
				break_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(673);
				continue_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(674);
				assignment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(675);
				qualifiedName();
				setState(676);
				calcUnOp();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(678);
				return_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(679);
				tryStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(680);
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
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
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
			setState(687);
			match(T__12);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576433389066821696L) != 0) || _la==Identifier) {
				{
				{
				setState(688);
				blockStatement();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
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
			setState(696);
			type();
			setState(697);
			variableDeclarator();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(698);
				match(T__11);
				setState(699);
				variableDeclarator();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
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
			setState(707);
			match(T__31);
			setState(708);
			match(T__5);
			setState(709);
			expression();
			setState(710);
			match(T__6);
			setState(711);
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
			setState(713);
			match(T__31);
			setState(714);
			match(T__5);
			setState(715);
			expression();
			setState(716);
			match(T__6);
			setState(717);
			statement();
			setState(718);
			match(T__32);
			setState(719);
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
			setState(721);
			match(T__33);
			setState(722);
			match(T__5);
			setState(723);
			expression();
			setState(724);
			match(T__6);
			setState(725);
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
			setState(727);
			match(T__34);
			setState(728);
			match(T__5);
			setState(729);
			forControl();
			setState(730);
			match(T__6);
			setState(731);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
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
			case T__57:
			case Identifier:
				{
				setState(733);
				localVariableDeclaration();
				}
				break;
			case T__1:
				{
				setState(734);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37748800L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(737);
				booleanFunction();
				}
			}

			setState(740);
			match(T__1);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 43005507575872L) != 0) || _la==Identifier) {
				{
				setState(741);
				statement();
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
			setState(744);
			match(T__35);
			setState(745);
			match(T__5);
			setState(746);
			expression();
			setState(747);
			match(T__6);
			setState(748);
			match(T__12);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36 || _la==T__38) {
				{
				{
				setState(749);
				switchBlockStatementGroup();
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755);
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
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
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
			setState(758); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(757);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(760); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(762);
				switchBlock();
				}
				break;
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
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(T__36);
				setState(766);
				expression();
				setState(767);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(T__38);
				setState(770);
				match(T__37);
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
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773);
					statement();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(779);
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
			setState(782);
			match(T__39);
			setState(783);
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
			setState(785);
			match(T__40);
			setState(786);
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
			setState(788);
			match(T__41);
			setState(789);
			block();
			setState(791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(790);
				catchClause();
				}
				}
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__42 );
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(795);
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
			setState(798);
			match(T__42);
			setState(799);
			match(T__5);
			setState(800);
			type();
			setState(801);
			match(Identifier);
			setState(802);
			match(T__6);
			setState(803);
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
			setState(805);
			match(T__43);
			setState(806);
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
			setState(808);
			match(T__44);
			setState(809);
			expression();
			setState(810);
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
		public AssignmentTypeContext assignmentType() {
			return getRuleContext(AssignmentTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(812);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(813);
				arrayAccess();
				}
				break;
			}
			setState(816);
			assignmentType();
			setState(817);
			expression();
			setState(818);
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
			setState(820);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4095L) != 0)) ) {
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
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
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
			case T__57:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
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
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				objectType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
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
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	 
		public ObjectTypeContext() { }
		public void copyFrom(ObjectTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatObjectContext extends ObjectTypeContext {
		public FloatObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFloatObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFloatObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFloatObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharacterObjectContext extends ObjectTypeContext {
		public CharacterObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterCharacterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitCharacterObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitCharacterObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ObjectTypeContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public IdentifierContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleObjectContext extends ObjectTypeContext {
		public DoubleObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterDoubleObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitDoubleObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitDoubleObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringObjectContext extends ObjectTypeContext {
		public StringObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStringObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStringObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitStringObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerObjectContext extends ObjectTypeContext {
		public IntegerObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIntegerObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIntegerObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIntegerObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortObjectContext extends ObjectTypeContext {
		public ShortObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterShortObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitShortObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitShortObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanObjectContext extends ObjectTypeContext {
		public BooleanObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_objectType);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				_localctx = new StringObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				match(T__45);
				}
				break;
			case T__46:
				_localctx = new ShortObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				match(T__46);
				}
				break;
			case T__47:
				_localctx = new IntegerObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
				match(T__47);
				}
				break;
			case T__48:
				_localctx = new FloatObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new DoubleObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(835);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new BooleanObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(836);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new CharacterObjectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
				match(T__51);
				}
				break;
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(838);
				match(Identifier);
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	 
		public PrimitiveTypeContext() { }
		public void copyFrom(PrimitiveTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleTypeContext extends PrimitiveTypeContext {
		public DoubleTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortTypeContext extends PrimitiveTypeContext {
		public ShortTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterShortType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitShortType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitShortType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends PrimitiveTypeContext {
		public BooleanTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends PrimitiveTypeContext {
		public CharTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends PrimitiveTypeContext {
		public IntTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends PrimitiveTypeContext {
		public FloatTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_primitiveType);
		try {
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				_localctx = new ShortTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(844);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(845);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(846);
				match(T__57);
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
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				{
				setState(849);
				primitiveType();
				}
				break;
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case Identifier:
				{
				setState(850);
				objectType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(853);
			match(T__7);
			setState(854);
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
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(Public);
				}
				break;
			case T__58:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				match(T__58);
				}
				break;
			case T__59:
				_localctx = new ProtectedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				match(T__59);
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
			setState(861);
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
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				accessModifier();
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(864);
						match(Final);
						}
					}

					setState(867);
					match(Static);
					}
					break;
				case 2:
					{
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(868);
						match(Static);
						}
					}

					setState(871);
					match(Final);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(874);
						match(Final);
						}
					}

					setState(877);
					match(Static);
					}
					break;
				case 2:
					{
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(878);
						match(Static);
						}
					}

					setState(881);
					match(Final);
					}
					break;
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1048579L) != 0)) {
					{
					setState(884);
					accessModifier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(887);
						match(Final);
						}
					}

					setState(890);
					accessModifier();
					setState(891);
					match(Static);
					}
					break;
				case 2:
					{
					setState(894);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(893);
						match(Static);
						}
					}

					setState(896);
					accessModifier();
					setState(897);
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
			setState(907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(903);
					match(Identifier);
					setState(904);
					match(T__60);
					}
					} 
				}
				setState(909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(910);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(miniJavaParser.IntegerLiteral, 0); }
		public TerminalNode LongLiteral() { return getToken(miniJavaParser.LongLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(miniJavaParser.FloatingPointLiteral, 0); }
		public TerminalNode DoubleLiteral() { return getToken(miniJavaParser.DoubleLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(miniJavaParser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(miniJavaParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(miniJavaParser.NullLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(miniJavaParser.StringLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
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

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 255L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001^\u0393\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0003\u0000\u009e\b\u0000"+
		"\u0001\u0000\u0005\u0000\u00a1\b\u0000\n\u0000\f\u0000\u00a4\t\u0000\u0001"+
		"\u0000\u0005\u0000\u00a7\b\u0000\n\u0000\f\u0000\u00aa\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00b4\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00b8\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00bf\b\u0003\u0001\u0004\u0003\u0004\u00c2\b\u0004\u0001"+
		"\u0004\u0003\u0004\u00c5\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00ca\b\u0004\u0001\u0004\u0003\u0004\u00cd\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0003\u0005\u00d2\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00d7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0003\u0006\u00dc\b\u0006\u0001\u0006\u0003\u0006\u00df\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00e3\b\u0006\u0001\u0006\u0003\u0006\u00e6"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ec"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f1\b\u0006"+
		"\n\u0006\f\u0006\u00f4\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00f9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0100\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0105\b\u0006\n\u0006\f\u0006\u0108\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u010c\b\u0006\u0001\u0007\u0003\u0007\u010f\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0115\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u011a\b\u0007\n\u0007\f\u0007"+
		"\u011d\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u0122\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0127\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0133\b\n\n\n\f\n\u0136"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u013c"+
		"\b\u000b\n\u000b\f\u000b\u013f\t\u000b\u0001\f\u0001\f\u0005\f\u0143\b"+
		"\f\n\f\f\f\u0146\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u014d"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0154\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0158\b\u000f"+
		"\n\u000f\f\u000f\u015b\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0161\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0165"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0169\b\u0012\n\u0012\f\u0012"+
		"\u016c\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0173\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0177\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0181\b\u0015\n\u0015\f\u0015"+
		"\u0184\t\u0015\u0001\u0016\u0003\u0016\u0187\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u018d\b\u0016\n\u0016\f\u0016"+
		"\u0190\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0197\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u019b\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01a1"+
		"\b\u0019\n\u0019\f\u0019\u01a4\t\u0019\u0003\u0019\u01a6\b\u0019\u0001"+
		"\u0019\u0003\u0019\u01a9\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01b2\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01b8\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01c2\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ca\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01cf\b\u001d\n\u001d\f\u001d"+
		"\u01d2\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01da\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01de\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01f2\b!\u0001!\u0003!\u01f5\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01fc\b\"\u0001#\u0001#\u0001"+
		"#\u0003#\u0201\b#\u0001$\u0001$\u0003$\u0205\b$\u0001%\u0001%\u0003%\u0209"+
		"\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u0210\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0215\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u021b"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0221\b\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u0227\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u022d\b\'\u0001\'\u0003\'\u0230\b\'\u0001(\u0001(\u0003(\u0234\b(\u0001"+
		"(\u0001(\u0001(\u0003(\u0239\b(\u0001(\u0001(\u0003(\u023d\b(\u0001)\u0001"+
		")\u0003)\u0241\b)\u0001)\u0001)\u0001)\u0003)\u0246\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u024c\b)\u0001)\u0001)\u0003)\u0250\b)\u0001*\u0001*\u0003"+
		"*\u0254\b*\u0001*\u0001*\u0001*\u0003*\u0259\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u025f\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0265\b*\u0001*\u0001"+
		"*\u0003*\u0269\b*\u0001+\u0001+\u0003+\u026d\b+\u0001+\u0001+\u0001+\u0003"+
		"+\u0272\b+\u0001+\u0001+\u0001+\u0004+\u0277\b+\u000b+\f+\u0278\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u027f\b+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0285\b+\u0001+\u0001+\u0003+\u0289\b+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0292\b-\u0001.\u0001.\u0003.\u0296\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02aa\b/\u00010\u0001"+
		"0\u00030\u02ae\b0\u00011\u00011\u00051\u02b2\b1\n1\f1\u02b5\t1\u00011"+
		"\u00011\u00012\u00012\u00012\u00012\u00052\u02bd\b2\n2\f2\u02c0\t2\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u0003"+
		"7\u02e0\b7\u00017\u00037\u02e3\b7\u00017\u00017\u00037\u02e7\b7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00058\u02ef\b8\n8\f8\u02f2\t8\u0001"+
		"8\u00018\u00019\u00049\u02f7\b9\u000b9\f9\u02f8\u00019\u00039\u02fc\b"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0304\b:\u0001;\u0005"+
		";\u0307\b;\n;\f;\u030a\t;\u0001;\u0003;\u030d\b;\u0001<\u0001<\u0001<"+
		"\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0004>\u0318\b>\u000b>\f>\u0319"+
		"\u0001>\u0003>\u031d\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0003"+
		"B\u032f\bB\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0003"+
		"D\u0339\bD\u0001E\u0001E\u0001E\u0003E\u033e\bE\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0003F\u0348\bF\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0003G\u0350\bG\u0001H\u0001H\u0003H\u0354\bH\u0001H\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0003I\u035c\bI\u0001J\u0001J\u0001K\u0001"+
		"K\u0003K\u0362\bK\u0001K\u0001K\u0003K\u0366\bK\u0001K\u0003K\u0369\b"+
		"K\u0001K\u0003K\u036c\bK\u0001K\u0001K\u0003K\u0370\bK\u0001K\u0003K\u0373"+
		"\bK\u0001K\u0003K\u0376\bK\u0001K\u0003K\u0379\bK\u0001K\u0001K\u0001"+
		"K\u0001K\u0003K\u037f\bK\u0001K\u0001K\u0001K\u0003K\u0384\bK\u0003K\u0386"+
		"\bK\u0001L\u0001L\u0005L\u038a\bL\nL\fL\u038d\tL\u0001L\u0001L\u0001M"+
		"\u0001M\u0001M\u0002\u0134\u013d\u0000N\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u0000\u0003\u0001\u0000"+
		"BM\u0001\u0000PQ\u0001\u0000SZ\u03f5\u0000\u009d\u0001\u0000\u0000\u0000"+
		"\u0002\u00ad\u0001\u0000\u0000\u0000\u0004\u00b1\u0001\u0000\u0000\u0000"+
		"\u0006\u00be\u0001\u0000\u0000\u0000\b\u00c1\u0001\u0000\u0000\u0000\n"+
		"\u00d1\u0001\u0000\u0000\u0000\f\u010b\u0001\u0000\u0000\u0000\u000e\u010e"+
		"\u0001\u0000\u0000\u0000\u0010\u0121\u0001\u0000\u0000\u0000\u0012\u012b"+
		"\u0001\u0000\u0000\u0000\u0014\u012e\u0001\u0000\u0000\u0000\u0016\u0137"+
		"\u0001\u0000\u0000\u0000\u0018\u0140\u0001\u0000\u0000\u0000\u001a\u014c"+
		"\u0001\u0000\u0000\u0000\u001c\u0153\u0001\u0000\u0000\u0000\u001e\u0155"+
		"\u0001\u0000\u0000\u0000 \u0160\u0001\u0000\u0000\u0000\"\u0164\u0001"+
		"\u0000\u0000\u0000$\u0166\u0001\u0000\u0000\u0000&\u0172\u0001\u0000\u0000"+
		"\u0000(\u0174\u0001\u0000\u0000\u0000*\u017a\u0001\u0000\u0000\u0000,"+
		"\u0186\u0001\u0000\u0000\u0000.\u0193\u0001\u0000\u0000\u00000\u019a\u0001"+
		"\u0000\u0000\u00002\u01b1\u0001\u0000\u0000\u00004\u01b7\u0001\u0000\u0000"+
		"\u00006\u01c1\u0001\u0000\u0000\u00008\u01c9\u0001\u0000\u0000\u0000:"+
		"\u01cb\u0001\u0000\u0000\u0000<\u01d9\u0001\u0000\u0000\u0000>\u01e1\u0001"+
		"\u0000\u0000\u0000@\u01e6\u0001\u0000\u0000\u0000B\u01f4\u0001\u0000\u0000"+
		"\u0000D\u01fb\u0001\u0000\u0000\u0000F\u0200\u0001\u0000\u0000\u0000H"+
		"\u0204\u0001\u0000\u0000\u0000J\u0208\u0001\u0000\u0000\u0000L\u020a\u0001"+
		"\u0000\u0000\u0000N\u022f\u0001\u0000\u0000\u0000P\u023c\u0001\u0000\u0000"+
		"\u0000R\u024f\u0001\u0000\u0000\u0000T\u0268\u0001\u0000\u0000\u0000V"+
		"\u0288\u0001\u0000\u0000\u0000X\u028a\u0001\u0000\u0000\u0000Z\u0291\u0001"+
		"\u0000\u0000\u0000\\\u0295\u0001\u0000\u0000\u0000^\u02a9\u0001\u0000"+
		"\u0000\u0000`\u02ad\u0001\u0000\u0000\u0000b\u02af\u0001\u0000\u0000\u0000"+
		"d\u02b8\u0001\u0000\u0000\u0000f\u02c3\u0001\u0000\u0000\u0000h\u02c9"+
		"\u0001\u0000\u0000\u0000j\u02d1\u0001\u0000\u0000\u0000l\u02d7\u0001\u0000"+
		"\u0000\u0000n\u02df\u0001\u0000\u0000\u0000p\u02e8\u0001\u0000\u0000\u0000"+
		"r\u02f6\u0001\u0000\u0000\u0000t\u0303\u0001\u0000\u0000\u0000v\u0308"+
		"\u0001\u0000\u0000\u0000x\u030e\u0001\u0000\u0000\u0000z\u0311\u0001\u0000"+
		"\u0000\u0000|\u0314\u0001\u0000\u0000\u0000~\u031e\u0001\u0000\u0000\u0000"+
		"\u0080\u0325\u0001\u0000\u0000\u0000\u0082\u0328\u0001\u0000\u0000\u0000"+
		"\u0084\u032e\u0001\u0000\u0000\u0000\u0086\u0334\u0001\u0000\u0000\u0000"+
		"\u0088\u0338\u0001\u0000\u0000\u0000\u008a\u033d\u0001\u0000\u0000\u0000"+
		"\u008c\u0347\u0001\u0000\u0000\u0000\u008e\u034f\u0001\u0000\u0000\u0000"+
		"\u0090\u0353\u0001\u0000\u0000\u0000\u0092\u035b\u0001\u0000\u0000\u0000"+
		"\u0094\u035d\u0001\u0000\u0000\u0000\u0096\u0385\u0001\u0000\u0000\u0000"+
		"\u0098\u038b\u0001\u0000\u0000\u0000\u009a\u0390\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a2\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0003\u0004\u0002\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u0006\u0003\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005\u0000\u0000\u0001\u00ac\u0001\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae\u00af\u0003\u0098L\u0000\u00af"+
		"\u00b0\u0005\u0002\u0000\u0000\u00b0\u0003\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0005\u0003\u0000\u0000\u00b2\u00b4\u0005R\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\u0098L\u0000\u00b6\u00b8\u0005"+
		">\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0002"+
		"\u0000\u0000\u00ba\u0005\u0001\u0000\u0000\u0000\u00bb\u00bf\u0003\b\u0004"+
		"\u0000\u00bc\u00bf\u0003\n\u0005\u0000\u00bd\u00bf\u0005\u0002\u0000\u0000"+
		"\u00be\u00bb\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u0007\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c2\u0003\u0092I\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c5\u0003\u0094J\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0004\u0000\u0000\u00c7\u00c9\u0005^\u0000\u0000\u00c8\u00ca\u0003"+
		"\u0012\t\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00cd\u0003\u0014"+
		"\n\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u0018\f\u0000"+
		"\u00cf\t\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005O\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0005\u0000\u0000\u00d4"+
		"\u00d6\u0005^\u0000\u0000\u00d5\u00d7\u0003\u0016\u000b\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u001e\u000f\u0000\u00d9\u000b"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0003\u0092I\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00e5\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0005Q\u0000\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e6\u0005R\u0000\u0000\u00e1\u00e3\u0005R\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005Q\u0000\u0000\u00e5"+
		"\u00de\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0003\u0088D\u0000\u00e8\u00e9\u0005^\u0000\u0000\u00e9\u00eb\u0005"+
		"\u0006\u0000\u0000\u00ea\u00ec\u0003*\u0015\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f2\u0005\u0007\u0000\u0000\u00ee\u00ef\u0005\b\u0000"+
		"\u0000\u00ef\u00f1\u0005\t\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003$\u0012\u0000\u00f6"+
		"\u010c\u0001\u0000\u0000\u0000\u00f7\u00f9\u0003\u0092I\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005P\u0000\u0000\u00fb\u00fc\u0003"+
		"\u0088D\u0000\u00fc\u00fd\u0005^\u0000\u0000\u00fd\u00ff\u0005\u0006\u0000"+
		"\u0000\u00fe\u0100\u0003*\u0015\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0106\u0005\u0007\u0000\u0000\u0102\u0103\u0005\b\u0000\u0000\u0103"+
		"\u0105\u0005\t\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0108"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a\u010c"+
		"\u0001\u0000\u0000\u0000\u010b\u00db\u0001\u0000\u0000\u0000\u010b\u00f8"+
		"\u0001\u0000\u0000\u0000\u010c\r\u0001\u0000\u0000\u0000\u010d\u010f\u0005"+
		"O\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0003\u0088"+
		"D\u0000\u0111\u0112\u0005^\u0000\u0000\u0112\u0114\u0005\u0006\u0000\u0000"+
		"\u0113\u0115\u0003*\u0015\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u011b\u0005\u0007\u0000\u0000\u0117\u0118\u0005\b\u0000\u0000\u0118\u011a"+
		"\u0005\t\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005\u0002\u0000\u0000\u011f\u000f\u0001"+
		"\u0000\u0000\u0000\u0120\u0122\u0003\u0092I\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0005^\u0000\u0000\u0124\u0126\u0005\u0006\u0000"+
		"\u0000\u0125\u0127\u0003*\u0015\u0000\u0126\u0125\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005\u0007\u0000\u0000\u0129\u012a\u0003b1\u0000\u012a\u0011"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c\u012d\u0003"+
		"\u0098L\u0000\u012d\u0013\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u000b"+
		"\u0000\u0000\u012f\u0134\u0003\u0098L\u0000\u0130\u0131\u0005\f\u0000"+
		"\u0000\u0131\u0133\u0003\u0098L\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0015\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0005\n\u0000\u0000\u0138"+
		"\u013d\u0003\u0098L\u0000\u0139\u013a\u0005\f\u0000\u0000\u013a\u013c"+
		"\u0003\u0098L\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u0017\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0144\u0005\r\u0000\u0000\u0141\u0143\u0003\u001a"+
		"\r\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u000e\u0000\u0000\u0148\u0019\u0001\u0000\u0000"+
		"\u0000\u0149\u014d\u0005\u0002\u0000\u0000\u014a\u014d\u0003b1\u0000\u014b"+
		"\u014d\u0003\u001c\u000e\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u001b\u0001\u0000\u0000\u0000\u014e\u0154\u0003\f\u0006\u0000\u014f\u0154"+
		"\u0003,\u0016\u0000\u0150\u0154\u0003\u0010\b\u0000\u0151\u0154\u0003"+
		"\b\u0004\u0000\u0152\u0154\u0003\n\u0005\u0000\u0153\u014e\u0001\u0000"+
		"\u0000\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u001d\u0001\u0000\u0000\u0000\u0155\u0159\u0005\r\u0000"+
		"\u0000\u0156\u0158\u0003 \u0010\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u000e\u0000\u0000"+
		"\u015d\u001f\u0001\u0000\u0000\u0000\u015e\u0161\u0005\u0002\u0000\u0000"+
		"\u015f\u0161\u0003\"\u0011\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0161!\u0001\u0000\u0000\u0000\u0162\u0165"+
		"\u0003\u000e\u0007\u0000\u0163\u0165\u0003,\u0016\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165#\u0001\u0000"+
		"\u0000\u0000\u0166\u016a\u0005\r\u0000\u0000\u0167\u0169\u0003&\u0013"+
		"\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005\u000e\u0000\u0000\u016e%\u0001\u0000\u0000\u0000"+
		"\u016f\u0173\u0003^/\u0000\u0170\u0173\u0003d2\u0000\u0171\u0173\u0003"+
		"(\u0014\u0000\u0172\u016f\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\'\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0005\u000f\u0000\u0000\u0175\u0177\u00034\u001a\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0002\u0000\u0000"+
		"\u0179)\u0001\u0000\u0000\u0000\u017a\u017b\u0003\u008aE\u0000\u017b\u0182"+
		"\u0005^\u0000\u0000\u017c\u017d\u0005\f\u0000\u0000\u017d\u017e\u0003"+
		"\u008aE\u0000\u017e\u017f\u0005^\u0000\u0000\u017f\u0181\u0001\u0000\u0000"+
		"\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000"+
		"\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u0183+\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u0003\u0096K\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0003\u008aE\u0000\u0189\u018e\u0003.\u0017\u0000\u018a\u018b\u0005"+
		"\f\u0000\u0000\u018b\u018d\u0003.\u0017\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0002"+
		"\u0000\u0000\u0192-\u0001\u0000\u0000\u0000\u0193\u0196\u0005^\u0000\u0000"+
		"\u0194\u0195\u0005B\u0000\u0000\u0195\u0197\u00030\u0018\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197/\u0001"+
		"\u0000\u0000\u0000\u0198\u019b\u00034\u001a\u0000\u0199\u019b\u00032\u0019"+
		"\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000"+
		"\u0000\u019b1\u0001\u0000\u0000\u0000\u019c\u01a5\u0005\r\u0000\u0000"+
		"\u019d\u01a2\u00034\u001a\u0000\u019e\u019f\u0005\f\u0000\u0000\u019f"+
		"\u01a1\u00034\u001a\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a5\u019d\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0005\f\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01b2\u0005"+
		"\u000e\u0000\u0000\u01ab\u01ac\u0005\u0010\u0000\u0000\u01ac\u01ad\u0003"+
		"\u008aE\u0000\u01ad\u01ae\u0005\b\u0000\u0000\u01ae\u01af\u00034\u001a"+
		"\u0000\u01af\u01b0\u0005\t\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b1\u019c\u0001\u0000\u0000\u0000\u01b1\u01ab\u0001\u0000\u0000\u0000"+
		"\u01b23\u0001\u0000\u0000\u0000\u01b3\u01b8\u0003B!\u0000\u01b4\u01b8"+
		"\u0003N\'\u0000\u01b5\u01b8\u0003@ \u0000\u01b6\u01b8\u00036\u001b\u0000"+
		"\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b85\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\u0006\u0000\u0000\u01ba"+
		"\u01bb\u00034\u001a\u0000\u01bb\u01bc\u0005\u0007\u0000\u0000\u01bc\u01c2"+
		"\u0001\u0000\u0000\u0000\u01bd\u01c2\u0003<\u001e\u0000\u01be\u01c2\u0003"+
		">\u001f\u0000\u01bf\u01c2\u0003\u009aM\u0000\u01c0\u01c2\u0003\u0098L"+
		"\u0000\u01c1\u01b9\u0001\u0000\u0000\u0000\u01c1\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c27\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0005\u0006\u0000\u0000\u01c4\u01c5\u00034\u001a\u0000\u01c5"+
		"\u01c6\u0005\u0007\u0000\u0000\u01c6\u01ca\u0001\u0000\u0000\u0000\u01c7"+
		"\u01ca\u0003<\u001e\u0000\u01c8\u01ca\u0003\u0098L\u0000\u01c9\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca9\u0001\u0000\u0000\u0000\u01cb\u01d0\u00034\u001a"+
		"\u0000\u01cc\u01cd\u0005\f\u0000\u0000\u01cd\u01cf\u00034\u001a\u0000"+
		"\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1;\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0005\u0006\u0000\u0000\u01d4\u01d5\u00034\u001a\u0000\u01d5\u01d6"+
		"\u0005\u0011\u0000\u0000\u01d6\u01d7\u0003\u0098L\u0000\u01d7\u01da\u0001"+
		"\u0000\u0000\u0000\u01d8\u01da\u0003\u0098L\u0000\u01d9\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0005\u0006\u0000\u0000\u01dc\u01de\u0003:\u001d"+
		"\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0007\u0000"+
		"\u0000\u01e0=\u0001\u0000\u0000\u0000\u01e1\u01e2\u00038\u001c\u0000\u01e2"+
		"\u01e3\u0005\b\u0000\u0000\u01e3\u01e4\u00034\u001a\u0000\u01e4\u01e5"+
		"\u0005\t\u0000\u0000\u01e5?\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005"+
		"\u0010\u0000\u0000\u01e7\u01e8\u0003<\u001e\u0000\u01e8A\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u00036\u001b\u0000\u01ea\u01eb\u0003F#\u0000\u01eb"+
		"\u01ec\u0003D\"\u0000\u01ec\u01f5\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0003D\"\u0000\u01ee\u01f1\u0003H$\u0000\u01ef\u01f2\u0003B!\u0000\u01f0"+
		"\u01f2\u00036\u001b\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f5"+
		"\u0003L&\u0000\u01f4\u01e9\u0001\u0000\u0000\u0000\u01f4\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5C\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u00036\u001b\u0000\u01f7\u01f8\u0003F#\u0000\u01f8"+
		"\u01f9\u0003D\"\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u00036\u001b\u0000\u01fb\u01f6\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fcE\u0001\u0000\u0000\u0000\u01fd\u0201\u0005\u0012"+
		"\u0000\u0000\u01fe\u0201\u0005\u0013\u0000\u0000\u01ff\u0201\u0005\u0014"+
		"\u0000\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201G\u0001\u0000\u0000"+
		"\u0000\u0202\u0205\u0005\u0015\u0000\u0000\u0203\u0205\u0005\u0016\u0000"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0205I\u0001\u0000\u0000\u0000\u0206\u0209\u0005\u0017\u0000\u0000"+
		"\u0207\u0209\u0005\u0018\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000"+
		"\u0208\u0207\u0001\u0000\u0000\u0000\u0209K\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0005\u0016\u0000\u0000\u020b\u020c\u00034\u001a\u0000\u020cM\u0001"+
		"\u0000\u0000\u0000\u020d\u0210\u00036\u001b\u0000\u020e\u0210\u0003B!"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0214\u0003Z-\u0000\u0212"+
		"\u0215\u00036\u001b\u0000\u0213\u0215\u0003B!\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u0230\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0003P(\u0000\u0217\u021a\u0003\\.\u0000"+
		"\u0218\u021b\u0003P(\u0000\u0219\u021b\u0003R)\u0000\u021a\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u0230\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0003R)\u0000\u021d\u0220\u0005?\u0000"+
		"\u0000\u021e\u0221\u0003R)\u0000\u021f\u0221\u0003T*\u0000\u0220\u021e"+
		"\u0001\u0000\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0230"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0003T*\u0000\u0223\u0226\u0005@"+
		"\u0000\u0000\u0224\u0227\u0003T*\u0000\u0225\u0227\u0003V+\u0000\u0226"+
		"\u0224\u0001\u0000\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u0230\u0001\u0000\u0000\u0000\u0228\u0229\u0003V+\u0000\u0229\u022c\u0005"+
		"A\u0000\u0000\u022a\u022d\u0003N\'\u0000\u022b\u022d\u00036\u001b\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000"+
		"\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u0230\u0003X,\u0000\u022f\u020f"+
		"\u0001\u0000\u0000\u0000\u022f\u0216\u0001\u0000\u0000\u0000\u022f\u021c"+
		"\u0001\u0000\u0000\u0000\u022f\u0222\u0001\u0000\u0000\u0000\u022f\u0228"+
		"\u0001\u0000\u0000\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u0230O\u0001"+
		"\u0000\u0000\u0000\u0231\u0234\u00036\u001b\u0000\u0232\u0234\u0003B!"+
		"\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0232\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0238\u0003Z-\u0000\u0236"+
		"\u0239\u00036\u001b\u0000\u0237\u0239\u0003B!\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023d\u0001"+
		"\u0000\u0000\u0000\u023a\u023d\u0003X,\u0000\u023b\u023d\u00036\u001b"+
		"\u0000\u023c\u0233\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023dQ\u0001\u0000\u0000\u0000"+
		"\u023e\u0241\u00036\u001b\u0000\u023f\u0241\u0003B!\u0000\u0240\u023e"+
		"\u0001\u0000\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0245\u0003Z-\u0000\u0243\u0246\u00036"+
		"\u001b\u0000\u0244\u0246\u0003B!\u0000\u0245\u0243\u0001\u0000\u0000\u0000"+
		"\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0250\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0003P(\u0000\u0248\u024b\u0003\\.\u0000\u0249\u024c\u0003"+
		"P(\u0000\u024a\u024c\u0003R)\u0000\u024b\u0249\u0001\u0000\u0000\u0000"+
		"\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u0250\u0001\u0000\u0000\u0000"+
		"\u024d\u0250\u0003X,\u0000\u024e\u0250\u00036\u001b\u0000\u024f\u0240"+
		"\u0001\u0000\u0000\u0000\u024f\u0247\u0001\u0000\u0000\u0000\u024f\u024d"+
		"\u0001\u0000\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250S\u0001"+
		"\u0000\u0000\u0000\u0251\u0254\u00036\u001b\u0000\u0252\u0254\u0003B!"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0258\u0003Z-\u0000\u0256"+
		"\u0259\u00036\u001b\u0000\u0257\u0259\u0003B!\u0000\u0258\u0256\u0001"+
		"\u0000\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u0269\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0003P(\u0000\u025b\u025e\u0003\\.\u0000"+
		"\u025c\u025f\u0003P(\u0000\u025d\u025f\u0003R)\u0000\u025e\u025c\u0001"+
		"\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f\u0269\u0001"+
		"\u0000\u0000\u0000\u0260\u0261\u0003R)\u0000\u0261\u0264\u0005?\u0000"+
		"\u0000\u0262\u0265\u0003R)\u0000\u0263\u0265\u0003T*\u0000\u0264\u0262"+
		"\u0001\u0000\u0000\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0269"+
		"\u0001\u0000\u0000\u0000\u0266\u0269\u0003X,\u0000\u0267\u0269\u00036"+
		"\u001b\u0000\u0268\u0253\u0001\u0000\u0000\u0000\u0268\u025a\u0001\u0000"+
		"\u0000\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000"+
		"\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269U\u0001\u0000\u0000"+
		"\u0000\u026a\u026d\u00036\u001b\u0000\u026b\u026d\u0003B!\u0000\u026c"+
		"\u026a\u0001\u0000\u0000\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026d"+
		"\u026e\u0001\u0000\u0000\u0000\u026e\u0271\u0003Z-\u0000\u026f\u0272\u0003"+
		"6\u001b\u0000\u0270\u0272\u0003B!\u0000\u0271\u026f\u0001\u0000\u0000"+
		"\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0289\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0003P(\u0000\u0274\u0276\u0003\\.\u0000\u0275\u0277"+
		"\u0003P(\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000"+
		"\u0000\u0000\u0279\u0289\u0001\u0000\u0000\u0000\u027a\u027b\u0003R)\u0000"+
		"\u027b\u027e\u0005?\u0000\u0000\u027c\u027f\u0003R)\u0000\u027d\u027f"+
		"\u0003T*\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027d\u0001\u0000"+
		"\u0000\u0000\u027f\u0289\u0001\u0000\u0000\u0000\u0280\u0281\u0003T*\u0000"+
		"\u0281\u0284\u0005@\u0000\u0000\u0282\u0285\u0003T*\u0000\u0283\u0285"+
		"\u0003V+\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0285\u0289\u0001\u0000\u0000\u0000\u0286\u0289\u0003X,\u0000"+
		"\u0287\u0289\u00036\u001b\u0000\u0288\u026c\u0001\u0000\u0000\u0000\u0288"+
		"\u0273\u0001\u0000\u0000\u0000\u0288\u027a\u0001\u0000\u0000\u0000\u0288"+
		"\u0280\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288"+
		"\u0287\u0001\u0000\u0000\u0000\u0289W\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0005\u0019\u0000\u0000\u028b\u028c\u00036\u001b\u0000\u028cY\u0001\u0000"+
		"\u0000\u0000\u028d\u0292\u0005\u001a\u0000\u0000\u028e\u0292\u0005\u001b"+
		"\u0000\u0000\u028f\u0292\u0005\u001c\u0000\u0000\u0290\u0292\u0005\u001d"+
		"\u0000\u0000\u0291\u028d\u0001\u0000\u0000\u0000\u0291\u028e\u0001\u0000"+
		"\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0290\u0001\u0000"+
		"\u0000\u0000\u0292[\u0001\u0000\u0000\u0000\u0293\u0296\u0005\u001e\u0000"+
		"\u0000\u0294\u0296\u0005\u001f\u0000\u0000\u0295\u0293\u0001\u0000\u0000"+
		"\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296]\u0001\u0000\u0000\u0000"+
		"\u0297\u02aa\u0003b1\u0000\u0298\u0299\u0003<\u001e\u0000\u0299\u029a"+
		"\u0005\u0002\u0000\u0000\u029a\u02aa\u0001\u0000\u0000\u0000\u029b\u02aa"+
		"\u0003h4\u0000\u029c\u02aa\u0003f3\u0000\u029d\u02aa\u0003j5\u0000\u029e"+
		"\u02aa\u0003l6\u0000\u029f\u02aa\u0003p8\u0000\u02a0\u02aa\u0003x<\u0000"+
		"\u02a1\u02aa\u0003z=\u0000\u02a2\u02aa\u0003\u0084B\u0000\u02a3\u02a4"+
		"\u0003\u0098L\u0000\u02a4\u02a5\u0003J%\u0000\u02a5\u02aa\u0001\u0000"+
		"\u0000\u0000\u02a6\u02aa\u0003(\u0014\u0000\u02a7\u02aa\u0003|>\u0000"+
		"\u02a8\u02aa\u0003\u0082A\u0000\u02a9\u0297\u0001\u0000\u0000\u0000\u02a9"+
		"\u0298\u0001\u0000\u0000\u0000\u02a9\u029b\u0001\u0000\u0000\u0000\u02a9"+
		"\u029c\u0001\u0000\u0000\u0000\u02a9\u029d\u0001\u0000\u0000\u0000\u02a9"+
		"\u029e\u0001\u0000\u0000\u0000\u02a9\u029f\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a9\u02a1\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a9\u02a3\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a8\u0001\u0000\u0000\u0000\u02aa_\u0001\u0000\u0000\u0000\u02ab\u02ae"+
		"\u0003d2\u0000\u02ac\u02ae\u0003^/\u0000\u02ad\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02aea\u0001\u0000\u0000\u0000"+
		"\u02af\u02b3\u0005\r\u0000\u0000\u02b0\u02b2\u0003`0\u0000\u02b1\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u0005\u000e\u0000\u0000\u02b7c\u0001\u0000\u0000\u0000\u02b8\u02b9\u0003"+
		"\u008aE\u0000\u02b9\u02be\u0003.\u0017\u0000\u02ba\u02bb\u0005\f\u0000"+
		"\u0000\u02bb\u02bd\u0003.\u0017\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bd\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005\u0002\u0000\u0000"+
		"\u02c2e\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005 \u0000\u0000\u02c4\u02c5"+
		"\u0005\u0006\u0000\u0000\u02c5\u02c6\u00034\u001a\u0000\u02c6\u02c7\u0005"+
		"\u0007\u0000\u0000\u02c7\u02c8\u0003^/\u0000\u02c8g\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0005 \u0000\u0000\u02ca\u02cb\u0005\u0006\u0000\u0000"+
		"\u02cb\u02cc\u00034\u001a\u0000\u02cc\u02cd\u0005\u0007\u0000\u0000\u02cd"+
		"\u02ce\u0003^/\u0000\u02ce\u02cf\u0005!\u0000\u0000\u02cf\u02d0\u0003"+
		"^/\u0000\u02d0i\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005\"\u0000\u0000"+
		"\u02d2\u02d3\u0005\u0006\u0000\u0000\u02d3\u02d4\u00034\u001a\u0000\u02d4"+
		"\u02d5\u0005\u0007\u0000\u0000\u02d5\u02d6\u0003^/\u0000\u02d6k\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0005#\u0000\u0000\u02d8\u02d9\u0005\u0006"+
		"\u0000\u0000\u02d9\u02da\u0003n7\u0000\u02da\u02db\u0005\u0007\u0000\u0000"+
		"\u02db\u02dc\u0003^/\u0000\u02dcm\u0001\u0000\u0000\u0000\u02dd\u02e0"+
		"\u0003d2\u0000\u02de\u02e0\u0005\u0002\u0000\u0000\u02df\u02dd\u0001\u0000"+
		"\u0000\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02e0\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e3\u0003N\'\u0000\u02e2\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e6\u0005\u0002\u0000\u0000\u02e5\u02e7\u0003^/\u0000\u02e6"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7"+
		"o\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005$\u0000\u0000\u02e9\u02ea\u0005"+
		"\u0006\u0000\u0000\u02ea\u02eb\u00034\u001a\u0000\u02eb\u02ec\u0005\u0007"+
		"\u0000\u0000\u02ec\u02f0\u0005\r\u0000\u0000\u02ed\u02ef\u0003r9\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f3\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f4\u0005\u000e\u0000\u0000\u02f4q\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f7\u0003t:\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02fc\u0003"+
		"v;\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fcs\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005%\u0000\u0000\u02fe"+
		"\u02ff\u00034\u001a\u0000\u02ff\u0300\u0005&\u0000\u0000\u0300\u0304\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0005\'\u0000\u0000\u0302\u0304\u0005&"+
		"\u0000\u0000\u0303\u02fd\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000"+
		"\u0000\u0000\u0304u\u0001\u0000\u0000\u0000\u0305\u0307\u0003^/\u0000"+
		"\u0306\u0305\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000"+
		"\u030b\u030d\u0003x<\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0001\u0000\u0000\u0000\u030dw\u0001\u0000\u0000\u0000\u030e\u030f\u0005"+
		"(\u0000\u0000\u030f\u0310\u0005\u0002\u0000\u0000\u0310y\u0001\u0000\u0000"+
		"\u0000\u0311\u0312\u0005)\u0000\u0000\u0312\u0313\u0005\u0002\u0000\u0000"+
		"\u0313{\u0001\u0000\u0000\u0000\u0314\u0315\u0005*\u0000\u0000\u0315\u0317"+
		"\u0003b1\u0000\u0316\u0318\u0003~?\u0000\u0317\u0316\u0001\u0000\u0000"+
		"\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000"+
		"\u0000\u031b\u031d\u0003\u0080@\u0000\u031c\u031b\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d}\u0001\u0000\u0000\u0000\u031e"+
		"\u031f\u0005+\u0000\u0000\u031f\u0320\u0005\u0006\u0000\u0000\u0320\u0321"+
		"\u0003\u008aE\u0000\u0321\u0322\u0005^\u0000\u0000\u0322\u0323\u0005\u0007"+
		"\u0000\u0000\u0323\u0324\u0003b1\u0000\u0324\u007f\u0001\u0000\u0000\u0000"+
		"\u0325\u0326\u0005,\u0000\u0000\u0326\u0327\u0003b1\u0000\u0327\u0081"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0005-\u0000\u0000\u0329\u032a\u0003"+
		"4\u001a\u0000\u032a\u032b\u0005\u0002\u0000\u0000\u032b\u0083\u0001\u0000"+
		"\u0000\u0000\u032c\u032f\u0003\u0098L\u0000\u032d\u032f\u0003>\u001f\u0000"+
		"\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0003\u0086C\u0000\u0331"+
		"\u0332\u00034\u001a\u0000\u0332\u0333\u0005\u0002\u0000\u0000\u0333\u0085"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u0007\u0000\u0000\u0000\u0335\u0087"+
		"\u0001\u0000\u0000\u0000\u0336\u0339\u0003\u008aE\u0000\u0337\u0339\u0005"+
		"N\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0337\u0001\u0000"+
		"\u0000\u0000\u0339\u0089\u0001\u0000\u0000\u0000\u033a\u033e\u0003\u008c"+
		"F\u0000\u033b\u033e\u0003\u008eG\u0000\u033c\u033e\u0003\u0090H\u0000"+
		"\u033d\u033a\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000"+
		"\u033d\u033c\u0001\u0000\u0000\u0000\u033e\u008b\u0001\u0000\u0000\u0000"+
		"\u033f\u0348\u0005.\u0000\u0000\u0340\u0348\u0005/\u0000\u0000\u0341\u0348"+
		"\u00050\u0000\u0000\u0342\u0348\u00051\u0000\u0000\u0343\u0348\u00052"+
		"\u0000\u0000\u0344\u0348\u00053\u0000\u0000\u0345\u0348\u00054\u0000\u0000"+
		"\u0346\u0348\u0005^\u0000\u0000\u0347\u033f\u0001\u0000\u0000\u0000\u0347"+
		"\u0340\u0001\u0000\u0000\u0000\u0347\u0341\u0001\u0000\u0000\u0000\u0347"+
		"\u0342\u0001\u0000\u0000\u0000\u0347\u0343\u0001\u0000\u0000\u0000\u0347"+
		"\u0344\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347"+
		"\u0346\u0001\u0000\u0000\u0000\u0348\u008d\u0001\u0000\u0000\u0000\u0349"+
		"\u0350\u00055\u0000\u0000\u034a\u0350\u00056\u0000\u0000\u034b\u0350\u0005"+
		"7\u0000\u0000\u034c\u0350\u00058\u0000\u0000\u034d\u0350\u00059\u0000"+
		"\u0000\u034e\u0350\u0005:\u0000\u0000\u034f\u0349\u0001\u0000\u0000\u0000"+
		"\u034f\u034a\u0001\u0000\u0000\u0000\u034f\u034b\u0001\u0000\u0000\u0000"+
		"\u034f\u034c\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000"+
		"\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u008f\u0001\u0000\u0000\u0000"+
		"\u0351\u0354\u0003\u008eG\u0000\u0352\u0354\u0003\u008cF\u0000\u0353\u0351"+
		"\u0001\u0000\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0355"+
		"\u0001\u0000\u0000\u0000\u0355\u0356\u0005\b\u0000\u0000\u0356\u0357\u0005"+
		"\t\u0000\u0000\u0357\u0091\u0001\u0000\u0000\u0000\u0358\u035c\u0005O"+
		"\u0000\u0000\u0359\u035c\u0005;\u0000\u0000\u035a\u035c\u0005<\u0000\u0000"+
		"\u035b\u0358\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000"+
		"\u035b\u035a\u0001\u0000\u0000\u0000\u035c\u0093\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0007\u0001\u0000\u0000\u035e\u0095\u0001\u0000\u0000\u0000"+
		"\u035f\u0368\u0003\u0092I\u0000\u0360\u0362\u0005Q\u0000\u0000\u0361\u0360"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0001\u0000\u0000\u0000\u0363\u0369\u0005R\u0000\u0000\u0364\u0366\u0005"+
		"R\u0000\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0369\u0005Q\u0000"+
		"\u0000\u0368\u0361\u0001\u0000\u0000\u0000\u0368\u0365\u0001\u0000\u0000"+
		"\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u0386\u0001\u0000\u0000"+
		"\u0000\u036a\u036c\u0005Q\u0000\u0000\u036b\u036a\u0001\u0000\u0000\u0000"+
		"\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000"+
		"\u036d\u0373\u0005R\u0000\u0000\u036e\u0370\u0005R\u0000\u0000\u036f\u036e"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0001\u0000\u0000\u0000\u0371\u0373\u0005Q\u0000\u0000\u0372\u036b\u0001"+
		"\u0000\u0000\u0000\u0372\u036f\u0001\u0000\u0000\u0000\u0373\u0375\u0001"+
		"\u0000\u0000\u0000\u0374\u0376\u0003\u0092I\u0000\u0375\u0374\u0001\u0000"+
		"\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0386\u0001\u0000"+
		"\u0000\u0000\u0377\u0379\u0005Q\u0000\u0000\u0378\u0377\u0001\u0000\u0000"+
		"\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000"+
		"\u0000\u037a\u037b\u0003\u0092I\u0000\u037b\u037c\u0005R\u0000\u0000\u037c"+
		"\u0384\u0001\u0000\u0000\u0000\u037d\u037f\u0005R\u0000\u0000\u037e\u037d"+
		"\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380"+
		"\u0001\u0000\u0000\u0000\u0380\u0381\u0003\u0092I\u0000\u0381\u0382\u0005"+
		"Q\u0000\u0000\u0382\u0384\u0001\u0000\u0000\u0000\u0383\u0378\u0001\u0000"+
		"\u0000\u0000\u0383\u037e\u0001\u0000\u0000\u0000\u0384\u0386\u0001\u0000"+
		"\u0000\u0000\u0385\u035f\u0001\u0000\u0000\u0000\u0385\u0372\u0001\u0000"+
		"\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0386\u0097\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0005^\u0000\u0000\u0388\u038a\u0005=\u0000\u0000"+
		"\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u038d\u0001\u0000\u0000\u0000"+
		"\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000"+
		"\u038c\u038e\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038e\u038f\u0005^\u0000\u0000\u038f\u0099\u0001\u0000\u0000\u0000\u0390"+
		"\u0391\u0007\u0002\u0000\u0000\u0391\u009b\u0001\u0000\u0000\u0000x\u009d"+
		"\u00a2\u00a8\u00b3\u00b7\u00be\u00c1\u00c4\u00c9\u00cc\u00d1\u00d6\u00db"+
		"\u00de\u00e2\u00e5\u00eb\u00f2\u00f8\u00ff\u0106\u010b\u010e\u0114\u011b"+
		"\u0121\u0126\u0134\u013d\u0144\u014c\u0153\u0159\u0160\u0164\u016a\u0172"+
		"\u0176\u0182\u0186\u018e\u0196\u019a\u01a2\u01a5\u01a8\u01b1\u01b7\u01c1"+
		"\u01c9\u01d0\u01d9\u01dd\u01f1\u01f4\u01fb\u0200\u0204\u0208\u020f\u0214"+
		"\u021a\u0220\u0226\u022c\u022f\u0233\u0238\u023c\u0240\u0245\u024b\u024f"+
		"\u0253\u0258\u025e\u0264\u0268\u026c\u0271\u0278\u027e\u0284\u0288\u0291"+
		"\u0295\u02a9\u02ad\u02b3\u02be\u02df\u02e2\u02e6\u02f0\u02f8\u02fb\u0303"+
		"\u0308\u030c\u0319\u031c\u032e\u0338\u033d\u0347\u034f\u0353\u035b\u0361"+
		"\u0365\u0368\u036b\u036f\u0372\u0375\u0378\u037e\u0383\u0385\u038b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}