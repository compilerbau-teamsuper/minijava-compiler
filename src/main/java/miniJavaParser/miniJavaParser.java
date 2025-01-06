// Generated from miniJava.g4 by ANTLR 4.13.2
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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, Wildcard=69, ASSIGN=70, ADD_ASSIGN=71, SUB_ASSIGN=72, 
		MUL_ASSIGN=73, DIV_ASSIGN=74, AND_ASSIGN=75, OR_ASSIGN=76, XOR_ASSIGN=77, 
		MOD_ASSIGN=78, LSHIFT_ASSIGN=79, RSHIFT_ASSIGN=80, URSHIFT_ASSIGN=81, 
		VoidType=82, Public=83, Abstract=84, Final=85, Static=86, Identifier=87, 
		BooleanLiteral=88, IntegerLiteral=89, LongLiteral=90, NullLiteral=91, 
		FloatingPointLiteral=92, DoubleLiteral=93, CharacterLiteral=94, StringLiteral=95, 
		WS=96, COMMENT=97, LINE_COMMENT=98;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_constructorDeclaration = 7, RULE_superclass = 8, 
		RULE_superinterfaces = 9, RULE_extendsInterfaces = 10, RULE_classBody = 11, 
		RULE_classBodyDeclaration = 12, RULE_staticInitializer = 13, RULE_memberDeclaration = 14, 
		RULE_interfaceBody = 15, RULE_interfaceBodyDeclaration = 16, RULE_interfaceMemberDeclaration = 17, 
		RULE_methodBody = 18, RULE_methodBodyStatement = 19, RULE_return = 20, 
		RULE_formalParameters = 21, RULE_fieldDeclaration = 22, RULE_variableDeclarator = 23, 
		RULE_variableInitializer = 24, RULE_arrayInitializer = 25, RULE_expression = 26, 
		RULE_primary = 27, RULE_expressionList = 28, RULE_methodCall = 29, RULE_arrayRead = 30, 
		RULE_arrayAccess = 31, RULE_newObject = 32, RULE_calcFunction = 33, RULE_term = 34, 
		RULE_multiplication = 35, RULE_division = 36, RULE_modulo = 37, RULE_addition = 38, 
		RULE_subtraction = 39, RULE_booleanFunction = 40, RULE_booleanFunNotEqual = 41, 
		RULE_greater = 42, RULE_greaterEqual = 43, RULE_lesser = 44, RULE_lesserEqual = 45, 
		RULE_equal = 46, RULE_notEqual = 47, RULE_inverse = 48, RULE_bitwiseFunction = 49, 
		RULE_and = 50, RULE_or = 51, RULE_xor = 52, RULE_shiftFunction = 53, RULE_leftShift = 54, 
		RULE_rightShift = 55, RULE_unsignedRightShift = 56, RULE_statement = 57, 
		RULE_block = 58, RULE_localVariableDeclaration = 59, RULE_ifThen = 60, 
		RULE_ifThenElse = 61, RULE_while = 62, RULE_for = 63, RULE_forControl = 64, 
		RULE_forControlStatement = 65, RULE_forInit = 66, RULE_forControlStatementList = 67, 
		RULE_switch = 68, RULE_switchBlockStatementGroup = 69, RULE_switchLabel = 70, 
		RULE_switchBlock = 71, RULE_break = 72, RULE_continue = 73, RULE_tryStatement = 74, 
		RULE_catchClause = 75, RULE_finallyClause = 76, RULE_throwStatement = 77, 
		RULE_assignment = 78, RULE_assignmentType = 79, RULE_typeOrVoid = 80, 
		RULE_type = 81, RULE_objectType = 82, RULE_primitiveType = 83, RULE_arrayType = 84, 
		RULE_accessModifier = 85, RULE_classModifier = 86, RULE_methodModifier = 87, 
		RULE_fieldModifier = 88, RULE_qualifiedName = 89, RULE_literal = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classDeclaration", "interfaceDeclaration", "methodDeclaration", "constructorDeclaration", 
			"superclass", "superinterfaces", "extendsInterfaces", "classBody", "classBodyDeclaration", 
			"staticInitializer", "memberDeclaration", "interfaceBody", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "methodBody", "methodBodyStatement", "return", 
			"formalParameters", "fieldDeclaration", "variableDeclarator", "variableInitializer", 
			"arrayInitializer", "expression", "primary", "expressionList", "methodCall", 
			"arrayRead", "arrayAccess", "newObject", "calcFunction", "term", "multiplication", 
			"division", "modulo", "addition", "subtraction", "booleanFunction", "booleanFunNotEqual", 
			"greater", "greaterEqual", "lesser", "lesserEqual", "equal", "notEqual", 
			"inverse", "bitwiseFunction", "and", "or", "xor", "shiftFunction", "leftShift", 
			"rightShift", "unsignedRightShift", "statement", "block", "localVariableDeclaration", 
			"ifThen", "ifThenElse", "while", "for", "forControl", "forControlStatement", 
			"forInit", "forControlStatementList", "switch", "switchBlockStatementGroup", 
			"switchLabel", "switchBlock", "break", "continue", "tryStatement", "catchClause", 
			"finallyClause", "throwStatement", "assignment", "assignmentType", "typeOrVoid", 
			"type", "objectType", "primitiveType", "arrayType", "accessModifier", 
			"classModifier", "methodModifier", "fieldModifier", "qualifiedName", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'class'", "'interface'", "'('", 
			"')'", "'['", "']'", "'extends'", "'implements'", "','", "'{'", "'}'", 
			"'return'", "'this'", "'super'", "'new'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'!'", "'&'", "'|'", 
			"'^'", "'<<'", "'>>'", "'>>>'", "'if'", "'else'", "'while'", "'for'", 
			"'switch'", "'case'", "':'", "'default'", "'break'", "'continue'", "'try'", 
			"'catch'", "'finally'", "'throw'", "'String'", "'Byte'", "'Short'", "'Integer'", 
			"'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", 
			"'int'", "'float'", "'double'", "'boolean'", "'char'", "'private'", "'protected'", 
			"'.'", null, "'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", "'void'", "'public'", "'abstract'", 
			"'final'", "'static'", null, null, null, null, "'null'"
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
			null, null, null, null, null, null, null, null, null, "Wildcard", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "VoidType", "Public", "Abstract", "Final", "Static", 
			"Identifier", "BooleanLiteral", "IntegerLiteral", "LongLiteral", "NullLiteral", 
			"FloatingPointLiteral", "DoubleLiteral", "CharacterLiteral", "StringLiteral", 
			"WS", "COMMENT", "LINE_COMMENT"
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(182);
				packageDeclaration();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(185);
				importDeclaration();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 7L) != 0)) {
				{
				{
				setState(191);
				typeDeclaration();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
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
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__0);
			setState(200);
			qualifiedName();
			setState(201);
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
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__2);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(204);
				match(Static);
				}
			}

			setState(207);
			qualifiedName();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Wildcard) {
				{
				setState(208);
				match(Wildcard);
				}
			}

			setState(211);
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
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
		public TerminalNode Public() { return getToken(miniJavaParser.Public, 0); }
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(218);
				match(Public);
				}
			}

			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(221);
				classModifier();
				}
			}

			setState(224);
			match(T__3);
			setState(225);
			match(Identifier);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(226);
				superclass();
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(229);
				superinterfaces();
				}
			}

			setState(232);
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
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(234);
				match(Public);
				}
			}

			setState(237);
			match(T__4);
			setState(238);
			match(Identifier);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(239);
				extendsInterfaces();
				}
			}

			setState(242);
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
		public MethodModifierContext methodModifier() {
			return getRuleContext(MethodModifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 131075L) != 0)) {
				{
				setState(244);
				accessModifier();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 7L) != 0)) {
				{
				setState(247);
				methodModifier();
				}
			}

			setState(250);
			typeOrVoid();
			setState(251);
			match(Identifier);
			setState(252);
			match(T__5);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 68719509503L) != 0)) {
				{
				setState(253);
				formalParameters();
				}
			}

			setState(256);
			match(T__6);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(257);
				match(T__7);
				setState(258);
				match(T__8);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			methodBody();
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
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 131075L) != 0)) {
				{
				setState(266);
				accessModifier();
				}
			}

			setState(269);
			match(Identifier);
			setState(270);
			match(T__5);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 68719509503L) != 0)) {
				{
				setState(271);
				formalParameters();
				}
			}

			setState(274);
			match(T__6);
			setState(275);
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
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__9);
			setState(278);
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
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_superinterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__10);
			setState(281);
			qualifiedName();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(282);
					match(T__11);
					setState(283);
					qualifiedName();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extendsInterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__9);
			setState(290);
			qualifiedName();
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(291);
					match(T__11);
					setState(292);
					qualifiedName();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__12);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2251799813677004L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16515087L) != 0)) {
				{
				{
				setState(299);
				classBodyDeclaration();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
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
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBodyDeclaration);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				memberDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				staticInitializer();
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
	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(miniJavaParser.Static, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Static);
			setState(314);
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
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_memberDeclaration);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
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
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__12);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2251799813685244L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16515087L) != 0)) {
				{
				{
				setState(324);
				interfaceBodyDeclaration();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
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
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceBodyDeclaration);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__1);
				}
				break;
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
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
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
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceMemberDeclaration);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__12);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -875623572332480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4286578691L) != 0)) {
				{
				{
				setState(341);
				methodBodyStatement();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
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
	}

	public final MethodBodyStatementContext methodBodyStatement() throws RecognitionException {
		MethodBodyStatementContext _localctx = new MethodBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodBodyStatement);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				localVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
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
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__14);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(355);
				expression();
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
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			type();
			setState(359);
			match(Identifier);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(360);
				match(T__11);
				setState(361);
				type();
				setState(362);
				match(Identifier);
				}
				}
				setState(368);
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
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1703939L) != 0)) {
				{
				setState(369);
				fieldModifier();
				}
			}

			setState(372);
			type();
			setState(373);
			variableDeclarator();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(374);
				match(T__11);
				setState(375);
				variableDeclarator();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Identifier);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(384);
				match(ASSIGN);
				setState(385);
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableInitializer);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__15:
			case T__16:
			case T__17:
			case T__29:
			case Identifier:
			case BooleanLiteral:
			case IntegerLiteral:
			case LongLiteral:
			case NullLiteral:
			case FloatingPointLiteral:
			case DoubleLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				expression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				arrayInitializer();
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
	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
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
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__12);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074208832L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 511L) != 0)) {
				{
				setState(393);
				variableInitializer();
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						match(T__11);
						setState(395);
						variableInitializer();
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(403);
				match(T__11);
				}
			}

			setState(406);
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
	public static class ExpressionContext extends ParserRuleContext {
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArrayReadContext arrayRead() {
			return getRuleContext(ArrayReadContext.class,0);
		}
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				calcFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				arrayRead();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				newObject();
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__5);
				setState(416);
				expression();
				setState(417);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				qualifiedName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				match(Identifier);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				methodCall();
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			expression();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(428);
				match(T__11);
				setState(429);
				expression();
				}
				}
				setState(434);
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
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			qualifiedName();
			setState(436);
			match(T__5);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074200640L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 511L) != 0)) {
				{
				setState(437);
				expressionList();
				}
			}

			setState(440);
			match(T__6);
			setState(441);
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
	public static class ArrayReadContext extends ParserRuleContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterArrayRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitArrayRead(this);
		}
	}

	public final ArrayReadContext arrayRead() throws RecognitionException {
		ArrayReadContext _localctx = new ArrayReadContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			arrayAccess();
			setState(444);
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
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			primary();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(447);
				match(T__7);
				setState(448);
				expression();
				setState(449);
				match(T__8);
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
	public static class NewObjectContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
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
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_newObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__17);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(454);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(455);
				methodCall();
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(458);
				classBody();
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
	public static class CalcFunctionContext extends ParserRuleContext {
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
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
	}

	public final CalcFunctionContext calcFunction() throws RecognitionException {
		CalcFunctionContext _localctx = new CalcFunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_calcFunction);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				addition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				subtraction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				multiplication();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				division();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				modulo();
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
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_term);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				multiplication();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				division();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				modulo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				primary();
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
	public static class MultiplicationContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			primary();
			setState(475);
			match(T__18);
			setState(476);
			term();
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
	public static class DivisionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			primary();
			setState(479);
			match(T__19);
			setState(480);
			term();
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
	public static class ModuloContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			primary();
			setState(483);
			match(T__20);
			setState(484);
			term();
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
	public static class AdditionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			term();
			setState(487);
			match(T__21);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(488);
				calcFunction();
				}
				break;
			case 2:
				{
				setState(489);
				primary();
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
	public static class SubtractionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitSubtraction(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subtraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			term();
			setState(493);
			match(T__22);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(494);
				calcFunction();
				}
				break;
			case 2:
				{
				setState(495);
				primary();
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
	public static class BooleanFunctionContext extends ParserRuleContext {
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public GreaterEqualContext greaterEqual() {
			return getRuleContext(GreaterEqualContext.class,0);
		}
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public LesserEqualContext lesserEqual() {
			return getRuleContext(LesserEqualContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public NotEqualContext notEqual() {
			return getRuleContext(NotEqualContext.class,0);
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
	}

	public final BooleanFunctionContext booleanFunction() throws RecognitionException {
		BooleanFunctionContext _localctx = new BooleanFunctionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanFunction);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				greater();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				greaterEqual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				lesser();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				lesserEqual();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				equal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
				notEqual();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(504);
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
	public static class BooleanFunNotEqualContext extends ParserRuleContext {
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public GreaterEqualContext greaterEqual() {
			return getRuleContext(GreaterEqualContext.class,0);
		}
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public LesserEqualContext lesserEqual() {
			return getRuleContext(LesserEqualContext.class,0);
		}
		public InverseContext inverse() {
			return getRuleContext(InverseContext.class,0);
		}
		public BooleanFunNotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunNotEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBooleanFunNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBooleanFunNotEqual(this);
		}
	}

	public final BooleanFunNotEqualContext booleanFunNotEqual() throws RecognitionException {
		BooleanFunNotEqualContext _localctx = new BooleanFunNotEqualContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanFunNotEqual);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				greater();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				greaterEqual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				lesser();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				lesserEqual();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
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
	public static class GreaterContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(514);
				primary();
				}
				break;
			case 2:
				{
				setState(515);
				calcFunction();
				}
				break;
			}
			setState(518);
			match(T__23);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(519);
				primary();
				}
				break;
			case 2:
				{
				setState(520);
				calcFunction();
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
	public static class GreaterEqualContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public GreaterEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGreaterEqual(this);
		}
	}

	public final GreaterEqualContext greaterEqual() throws RecognitionException {
		GreaterEqualContext _localctx = new GreaterEqualContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_greaterEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(523);
				primary();
				}
				break;
			case 2:
				{
				setState(524);
				calcFunction();
				}
				break;
			}
			setState(527);
			match(T__24);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(528);
				primary();
				}
				break;
			case 2:
				{
				setState(529);
				calcFunction();
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
	public static class LesserContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLesser(this);
		}
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(532);
				primary();
				}
				break;
			case 2:
				{
				setState(533);
				calcFunction();
				}
				break;
			}
			setState(536);
			match(T__25);
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(537);
				primary();
				}
				break;
			case 2:
				{
				setState(538);
				calcFunction();
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
	public static class LesserEqualContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<CalcFunctionContext> calcFunction() {
			return getRuleContexts(CalcFunctionContext.class);
		}
		public CalcFunctionContext calcFunction(int i) {
			return getRuleContext(CalcFunctionContext.class,i);
		}
		public LesserEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesserEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLesserEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLesserEqual(this);
		}
	}

	public final LesserEqualContext lesserEqual() throws RecognitionException {
		LesserEqualContext _localctx = new LesserEqualContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lesserEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(541);
				primary();
				}
				break;
			case 2:
				{
				setState(542);
				calcFunction();
				}
				break;
			}
			setState(545);
			match(T__26);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(546);
				primary();
				}
				break;
			case 2:
				{
				setState(547);
				calcFunction();
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
	public static class EqualContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public BooleanFunNotEqualContext booleanFunNotEqual() {
			return getRuleContext(BooleanFunNotEqualContext.class,0);
		}
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(550);
				primary();
				}
				break;
			case 2:
				{
				setState(551);
				booleanFunNotEqual();
				}
				break;
			case 3:
				{
				setState(552);
				calcFunction();
				}
				break;
			}
			setState(555);
			match(T__27);
			setState(556);
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
	public static class NotEqualContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public BooleanFunNotEqualContext booleanFunNotEqual() {
			return getRuleContext(BooleanFunNotEqualContext.class,0);
		}
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitNotEqual(this);
		}
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(558);
				primary();
				}
				break;
			case 2:
				{
				setState(559);
				booleanFunNotEqual();
				}
				break;
			case 3:
				{
				setState(560);
				calcFunction();
				}
				break;
			}
			setState(563);
			match(T__28);
			setState(564);
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
	public static class InverseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final InverseContext inverse() throws RecognitionException {
		InverseContext _localctx = new InverseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_inverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__29);
			setState(567);
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
	public static class BitwiseFunctionContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public XorContext xor() {
			return getRuleContext(XorContext.class,0);
		}
		public BitwiseFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBitwiseFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBitwiseFunction(this);
		}
	}

	public final BitwiseFunctionContext bitwiseFunction() throws RecognitionException {
		BitwiseFunctionContext _localctx = new BitwiseFunctionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bitwiseFunction);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				and();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				or();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				xor();
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
	public static class AndContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			term();
			setState(575);
			match(T__30);
			setState(576);
			term();
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
	public static class OrContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			term();
			setState(579);
			match(T__31);
			setState(580);
			term();
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
	public static class XorContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public XorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitXor(this);
		}
	}

	public final XorContext xor() throws RecognitionException {
		XorContext _localctx = new XorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_xor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			term();
			setState(583);
			match(T__32);
			setState(584);
			term();
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
	public static class ShiftFunctionContext extends ParserRuleContext {
		public LeftShiftContext leftShift() {
			return getRuleContext(LeftShiftContext.class,0);
		}
		public UnsignedRightShiftContext unsignedRightShift() {
			return getRuleContext(UnsignedRightShiftContext.class,0);
		}
		public ShiftFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterShiftFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitShiftFunction(this);
		}
	}

	public final ShiftFunctionContext shiftFunction() throws RecognitionException {
		ShiftFunctionContext _localctx = new ShiftFunctionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_shiftFunction);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				leftShift();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				leftShift();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				unsignedRightShift();
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
	public static class LeftShiftContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public LeftShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLeftShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLeftShift(this);
		}
	}

	public final LeftShiftContext leftShift() throws RecognitionException {
		LeftShiftContext _localctx = new LeftShiftContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_leftShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			term();
			setState(592);
			match(T__33);
			setState(593);
			term();
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
	public static class RightShiftContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			term();
			setState(596);
			match(T__34);
			setState(597);
			term();
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
	public static class UnsignedRightShiftContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public UnsignedRightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedRightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterUnsignedRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitUnsignedRightShift(this);
		}
	}

	public final UnsignedRightShiftContext unsignedRightShift() throws RecognitionException {
		UnsignedRightShiftContext _localctx = new UnsignedRightShiftContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unsignedRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			term();
			setState(600);
			match(T__35);
			setState(601);
			term();
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_statement);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				ifThen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(607);
				ifThenElse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(608);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
				for_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(610);
				switch_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				break_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(612);
				continue_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(613);
				tryStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(614);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<LocalVariableDeclarationContext> localVariableDeclaration() {
			return getRuleContexts(LocalVariableDeclarationContext.class);
		}
		public LocalVariableDeclarationContext localVariableDeclaration(int i) {
			return getRuleContext(LocalVariableDeclarationContext.class,i);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__12);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -875623572365248L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4286578691L) != 0)) {
				{
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(618);
					statement();
					}
					break;
				case 2:
					{
					setState(619);
					localVariableDeclaration();
					}
					break;
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
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
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			type();
			setState(628);
			variableDeclarator();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(629);
				match(T__11);
				setState(630);
				variableDeclarator();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
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
	}

	public final IfThenContext ifThen() throws RecognitionException {
		IfThenContext _localctx = new IfThenContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ifThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__36);
			setState(639);
			match(T__5);
			setState(640);
			expression();
			setState(641);
			match(T__6);
			setState(642);
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
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T__36);
			setState(645);
			match(T__5);
			setState(646);
			expression();
			setState(647);
			match(T__6);
			setState(648);
			statement();
			setState(649);
			match(T__37);
			setState(650);
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
	public static class WhileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__38);
			setState(653);
			match(T__5);
			setState(654);
			expression();
			setState(655);
			match(T__6);
			setState(656);
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
	public static class ForContext extends ParserRuleContext {
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(T__39);
			setState(659);
			match(T__5);
			setState(660);
			forControl();
			setState(661);
			match(T__6);
			setState(662);
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
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlStatementListContext forControlStatementList() {
			return getRuleContext(ForControlStatementListContext.class,0);
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
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2251799813488576L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4286578691L) != 0)) {
				{
				setState(664);
				forInit();
				}
			}

			setState(667);
			match(T__1);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074200640L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 511L) != 0)) {
				{
				setState(668);
				expression();
				}
			}

			setState(671);
			match(T__1);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196672L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 511L) != 0)) {
				{
				setState(672);
				forControlStatementList();
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
	public static class ForControlStatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ForControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterForControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitForControlStatement(this);
		}
	}

	public final ForControlStatementContext forControlStatement() throws RecognitionException {
		ForControlStatementContext _localctx = new ForControlStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_forControlStatement);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				methodCall();
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
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForControlStatementListContext forControlStatementList() {
			return getRuleContext(ForControlStatementListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_forInit);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				forControlStatementList();
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
	public static class ForControlStatementListContext extends ParserRuleContext {
		public List<ForControlStatementContext> forControlStatement() {
			return getRuleContexts(ForControlStatementContext.class);
		}
		public ForControlStatementContext forControlStatement(int i) {
			return getRuleContext(ForControlStatementContext.class,i);
		}
		public ForControlStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControlStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterForControlStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitForControlStatementList(this);
		}
	}

	public final ForControlStatementListContext forControlStatementList() throws RecognitionException {
		ForControlStatementListContext _localctx = new ForControlStatementListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_forControlStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			forControlStatement();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(684);
				match(T__11);
				setState(685);
				forControlStatement();
				}
				}
				setState(690);
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
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__40);
			setState(692);
			match(T__5);
			setState(693);
			expression();
			setState(694);
			match(T__6);
			setState(695);
			match(T__12);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41 || _la==T__43) {
				{
				{
				setState(696);
				switchBlockStatementGroup();
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(704);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(707); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(709);
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
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_switchLabel);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(T__41);
				setState(713);
				expression();
				setState(714);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(T__43);
				setState(717);
				match(T__42);
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
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(720);
					statement();
					}
					} 
				}
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(726);
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
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__44);
			setState(730);
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
	}

	public final ContinueContext continue_() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__45);
			setState(733);
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
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__46);
			setState(736);
			block();
			setState(738); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(737);
				catchClause();
				}
				}
				setState(740); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__47 );
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(742);
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(T__47);
			setState(746);
			match(T__5);
			setState(747);
			type();
			setState(748);
			match(Identifier);
			setState(749);
			match(T__6);
			setState(750);
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
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(T__48);
			setState(753);
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
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(T__49);
			setState(756);
			expression();
			setState(757);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(759);
				primary();
				}
				break;
			case 2:
				{
				setState(760);
				arrayAccess();
				}
				break;
			}
			setState(763);
			assignmentType();
			setState(764);
			expression();
			setState(765);
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
	}

	public final AssignmentTypeContext assignmentType() throws RecognitionException {
		AssignmentTypeContext _localctx = new AssignmentTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assignmentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 4095L) != 0)) ) {
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
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_typeOrVoid);
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				objectType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteObjectContext extends ObjectTypeContext {
		public ByteObjectContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterByteObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitByteObject(this);
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
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_objectType);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				_localctx = new StringObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new ByteObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new ShortObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new IntegerObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new FloatObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new DoubleObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(783);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new BooleanObjectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(784);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new CharacterObjectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(785);
				match(T__57);
				}
				break;
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(786);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteTypeContext extends PrimitiveTypeContext {
		public ByteTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitByteType(this);
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
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_primitiveType);
		try {
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				_localctx = new ByteTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(T__58);
				}
				break;
			case T__59:
				_localctx = new ShortTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(T__59);
				}
				break;
			case T__60:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				match(T__60);
				}
				break;
			case T__61:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(792);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(793);
				match(T__62);
				}
				break;
			case T__63:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(794);
				match(T__63);
				}
				break;
			case T__64:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(795);
				match(T__64);
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
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
				{
				setState(798);
				primitiveType();
				}
				break;
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
				setState(799);
				objectType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(802);
			match(T__7);
			setState(803);
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
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_accessModifier);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(Public);
				}
				break;
			case T__65:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(T__65);
				}
				break;
			case T__66:
				_localctx = new ProtectedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				match(T__66);
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
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
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
	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(miniJavaParser.Static, 0); }
		public TerminalNode Final() { return getToken(miniJavaParser.Final, 0); }
		public TerminalNode Abstract() { return getToken(miniJavaParser.Abstract, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_methodModifier);
		int _la;
		try {
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Final:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(812);
						match(Final);
						}
					}

					setState(815);
					match(Static);
					}
					break;
				case 2:
					{
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(816);
						match(Static);
						}
					}

					setState(819);
					match(Final);
					}
					break;
				}
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(Abstract);
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
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_fieldModifier);
		int _la;
		try {
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				accessModifier();
				setState(834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(826);
						match(Final);
						}
					}

					setState(829);
					match(Static);
					}
					break;
				case 2:
					{
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(830);
						match(Static);
						}
					}

					setState(833);
					match(Final);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(836);
						match(Final);
						}
					}

					setState(839);
					match(Static);
					}
					break;
				case 2:
					{
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(840);
						match(Static);
						}
					}

					setState(843);
					match(Final);
					}
					break;
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 131075L) != 0)) {
					{
					setState(846);
					accessModifier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(849);
						match(Final);
						}
					}

					setState(852);
					accessModifier();
					setState(853);
					match(Static);
					}
					break;
				case 2:
					{
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(855);
						match(Static);
						}
					}

					setState(858);
					accessModifier();
					setState(859);
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
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(865);
					match(Identifier);
					setState(866);
					match(T__67);
					}
					} 
				}
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(872);
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
		public TerminalNode StringLiteral() { return getToken(miniJavaParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(miniJavaParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(miniJavaParser.NullLiteral, 0); }
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 255L) != 0)) ) {
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
		"\u0004\u0001b\u036d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0001\u0000\u0003\u0000\u00b8\b\u0000\u0001\u0000\u0005\u0000"+
		"\u00bb\b\u0000\n\u0000\f\u0000\u00be\t\u0000\u0001\u0000\u0005\u0000\u00c1"+
		"\b\u0000\n\u0000\f\u0000\u00c4\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00ce\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00d2\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d9"+
		"\b\u0003\u0001\u0004\u0003\u0004\u00dc\b\u0004\u0001\u0004\u0003\u0004"+
		"\u00df\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e4\b"+
		"\u0004\u0001\u0004\u0003\u0004\u00e7\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0003\u0005\u00ec\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00f1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00f6"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00f9\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ff\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0104\b\u0006\n\u0006\f\u0006\u0107\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u010c\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0111\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u011d\b\t\n\t\f\t\u0120\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0126"+
		"\b\n\n\n\f\n\u0129\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u012d\b\u000b"+
		"\n\u000b\f\u000b\u0130\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0138\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0142\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0146\b\u000f\n\u000f\f\u000f\u0149"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u014f"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0153\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0157\b\u0012\n\u0012\f\u0012\u015a\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0161"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0165\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u016d\b\u0015\n\u0015\f\u0015\u0170\t\u0015\u0001\u0016\u0003\u0016\u0173"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0179"+
		"\b\u0016\n\u0016\f\u0016\u017c\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0183\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0187\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u018d\b\u0019\n\u0019\f\u0019\u0190\t\u0019\u0003\u0019\u0192"+
		"\b\u0019\u0001\u0019\u0003\u0019\u0195\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u019e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01aa\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01af\b"+
		"\u001c\n\u001c\f\u001c\u01b2\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01b7\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01c4\b\u001f\u0001 \u0001 \u0001 \u0003 \u01c9"+
		"\b \u0001 \u0003 \u01cc\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01d3"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d9\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u01eb\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u01f1\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u01fa\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0201\b)\u0001*\u0001"+
		"*\u0003*\u0205\b*\u0001*\u0001*\u0001*\u0003*\u020a\b*\u0001+\u0001+\u0003"+
		"+\u020e\b+\u0001+\u0001+\u0001+\u0003+\u0213\b+\u0001,\u0001,\u0003,\u0217"+
		"\b,\u0001,\u0001,\u0001,\u0003,\u021c\b,\u0001-\u0001-\u0003-\u0220\b"+
		"-\u0001-\u0001-\u0001-\u0003-\u0225\b-\u0001.\u0001.\u0001.\u0003.\u022a"+
		"\b.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u0232\b/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00011\u00011\u00011\u00031\u023d\b1\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00035\u024e\b5\u00016\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u0268\b9\u0001:\u0001:\u0001:\u0005:\u026d\b:\n:\f:\u0270\t:"+
		"\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0005;\u0278\b;\n;\f;\u027b"+
		"\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0003"+
		"@\u029a\b@\u0001@\u0001@\u0003@\u029e\b@\u0001@\u0001@\u0003@\u02a2\b"+
		"@\u0001A\u0001A\u0003A\u02a6\bA\u0001B\u0001B\u0003B\u02aa\bB\u0001C\u0001"+
		"C\u0001C\u0005C\u02af\bC\nC\fC\u02b2\tC\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0005D\u02ba\bD\nD\fD\u02bd\tD\u0001D\u0001D\u0001E\u0004E\u02c2"+
		"\bE\u000bE\fE\u02c3\u0001E\u0003E\u02c7\bE\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u02cf\bF\u0001G\u0005G\u02d2\bG\nG\fG\u02d5\tG"+
		"\u0001G\u0003G\u02d8\bG\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001"+
		"J\u0001J\u0001J\u0004J\u02e3\bJ\u000bJ\fJ\u02e4\u0001J\u0003J\u02e8\b"+
		"J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0003N\u02fa\bN\u0001N\u0001"+
		"N\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0003P\u0304\bP\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u0309\bQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0003R\u0314\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0003S\u031d\bS\u0001T\u0001T\u0003T\u0321\bT\u0001T\u0001T\u0001"+
		"T\u0001U\u0001U\u0001U\u0003U\u0329\bU\u0001V\u0001V\u0001W\u0003W\u032e"+
		"\bW\u0001W\u0001W\u0003W\u0332\bW\u0001W\u0003W\u0335\bW\u0001W\u0003"+
		"W\u0338\bW\u0001X\u0001X\u0003X\u033c\bX\u0001X\u0001X\u0003X\u0340\b"+
		"X\u0001X\u0003X\u0343\bX\u0001X\u0003X\u0346\bX\u0001X\u0001X\u0003X\u034a"+
		"\bX\u0001X\u0003X\u034d\bX\u0001X\u0003X\u0350\bX\u0001X\u0003X\u0353"+
		"\bX\u0001X\u0001X\u0001X\u0001X\u0003X\u0359\bX\u0001X\u0001X\u0001X\u0003"+
		"X\u035e\bX\u0003X\u0360\bX\u0001Y\u0001Y\u0005Y\u0364\bY\nY\fY\u0367\t"+
		"Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0002\u011e\u0127\u0000[\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u0000"+
		"\u0003\u0001\u0000FQ\u0001\u0000TU\u0001\u0000X_\u03b2\u0000\u00b7\u0001"+
		"\u0000\u0000\u0000\u0002\u00c7\u0001\u0000\u0000\u0000\u0004\u00cb\u0001"+
		"\u0000\u0000\u0000\u0006\u00d8\u0001\u0000\u0000\u0000\b\u00db\u0001\u0000"+
		"\u0000\u0000\n\u00eb\u0001\u0000\u0000\u0000\f\u00f5\u0001\u0000\u0000"+
		"\u0000\u000e\u010b\u0001\u0000\u0000\u0000\u0010\u0115\u0001\u0000\u0000"+
		"\u0000\u0012\u0118\u0001\u0000\u0000\u0000\u0014\u0121\u0001\u0000\u0000"+
		"\u0000\u0016\u012a\u0001\u0000\u0000\u0000\u0018\u0137\u0001\u0000\u0000"+
		"\u0000\u001a\u0139\u0001\u0000\u0000\u0000\u001c\u0141\u0001\u0000\u0000"+
		"\u0000\u001e\u0143\u0001\u0000\u0000\u0000 \u014e\u0001\u0000\u0000\u0000"+
		"\"\u0152\u0001\u0000\u0000\u0000$\u0154\u0001\u0000\u0000\u0000&\u0160"+
		"\u0001\u0000\u0000\u0000(\u0162\u0001\u0000\u0000\u0000*\u0166\u0001\u0000"+
		"\u0000\u0000,\u0172\u0001\u0000\u0000\u0000.\u017f\u0001\u0000\u0000\u0000"+
		"0\u0186\u0001\u0000\u0000\u00002\u0188\u0001\u0000\u0000\u00004\u019d"+
		"\u0001\u0000\u0000\u00006\u01a9\u0001\u0000\u0000\u00008\u01ab\u0001\u0000"+
		"\u0000\u0000:\u01b3\u0001\u0000\u0000\u0000<\u01bb\u0001\u0000\u0000\u0000"+
		">\u01be\u0001\u0000\u0000\u0000@\u01c5\u0001\u0000\u0000\u0000B\u01d2"+
		"\u0001\u0000\u0000\u0000D\u01d8\u0001\u0000\u0000\u0000F\u01da\u0001\u0000"+
		"\u0000\u0000H\u01de\u0001\u0000\u0000\u0000J\u01e2\u0001\u0000\u0000\u0000"+
		"L\u01e6\u0001\u0000\u0000\u0000N\u01ec\u0001\u0000\u0000\u0000P\u01f9"+
		"\u0001\u0000\u0000\u0000R\u0200\u0001\u0000\u0000\u0000T\u0204\u0001\u0000"+
		"\u0000\u0000V\u020d\u0001\u0000\u0000\u0000X\u0216\u0001\u0000\u0000\u0000"+
		"Z\u021f\u0001\u0000\u0000\u0000\\\u0229\u0001\u0000\u0000\u0000^\u0231"+
		"\u0001\u0000\u0000\u0000`\u0236\u0001\u0000\u0000\u0000b\u023c\u0001\u0000"+
		"\u0000\u0000d\u023e\u0001\u0000\u0000\u0000f\u0242\u0001\u0000\u0000\u0000"+
		"h\u0246\u0001\u0000\u0000\u0000j\u024d\u0001\u0000\u0000\u0000l\u024f"+
		"\u0001\u0000\u0000\u0000n\u0253\u0001\u0000\u0000\u0000p\u0257\u0001\u0000"+
		"\u0000\u0000r\u0267\u0001\u0000\u0000\u0000t\u0269\u0001\u0000\u0000\u0000"+
		"v\u0273\u0001\u0000\u0000\u0000x\u027e\u0001\u0000\u0000\u0000z\u0284"+
		"\u0001\u0000\u0000\u0000|\u028c\u0001\u0000\u0000\u0000~\u0292\u0001\u0000"+
		"\u0000\u0000\u0080\u0299\u0001\u0000\u0000\u0000\u0082\u02a5\u0001\u0000"+
		"\u0000\u0000\u0084\u02a9\u0001\u0000\u0000\u0000\u0086\u02ab\u0001\u0000"+
		"\u0000\u0000\u0088\u02b3\u0001\u0000\u0000\u0000\u008a\u02c1\u0001\u0000"+
		"\u0000\u0000\u008c\u02ce\u0001\u0000\u0000\u0000\u008e\u02d3\u0001\u0000"+
		"\u0000\u0000\u0090\u02d9\u0001\u0000\u0000\u0000\u0092\u02dc\u0001\u0000"+
		"\u0000\u0000\u0094\u02df\u0001\u0000\u0000\u0000\u0096\u02e9\u0001\u0000"+
		"\u0000\u0000\u0098\u02f0\u0001\u0000\u0000\u0000\u009a\u02f3\u0001\u0000"+
		"\u0000\u0000\u009c\u02f9\u0001\u0000\u0000\u0000\u009e\u02ff\u0001\u0000"+
		"\u0000\u0000\u00a0\u0303\u0001\u0000\u0000\u0000\u00a2\u0308\u0001\u0000"+
		"\u0000\u0000\u00a4\u0313\u0001\u0000\u0000\u0000\u00a6\u031c\u0001\u0000"+
		"\u0000\u0000\u00a8\u0320\u0001\u0000\u0000\u0000\u00aa\u0328\u0001\u0000"+
		"\u0000\u0000\u00ac\u032a\u0001\u0000\u0000\u0000\u00ae\u0337\u0001\u0000"+
		"\u0000\u0000\u00b0\u035f\u0001\u0000\u0000\u0000\u00b2\u0365\u0001\u0000"+
		"\u0000\u0000\u00b4\u036a\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0002"+
		"\u0001\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u0004"+
		"\u0002\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c2\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c1\u0003\u0006\u0003\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0000"+
		"\u0000\u0001\u00c6\u0001\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0001"+
		"\u0000\u0000\u00c8\u00c9\u0003\u00b2Y\u0000\u00c9\u00ca\u0005\u0002\u0000"+
		"\u0000\u00ca\u0003\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u0003\u0000"+
		"\u0000\u00cc\u00ce\u0005V\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0003\u00b2Y\u0000\u00d0\u00d2\u0005E\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4\u0005"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d9\u0003\b\u0004\u0000\u00d6\u00d9\u0003"+
		"\n\u0005\u0000\u00d7\u00d9\u0005\u0002\u0000\u0000\u00d8\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u0007\u0001\u0000\u0000\u0000\u00da\u00dc\u0005S\u0000"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\u00acV\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0004\u0000\u0000"+
		"\u00e1\u00e3\u0005W\u0000\u0000\u00e2\u00e4\u0003\u0010\b\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\u0012\t\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\u0016\u000b\u0000\u00e9\t\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ec\u0005S\u0000\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00f0\u0005W\u0000"+
		"\u0000\u00ef\u00f1\u0003\u0014\n\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0003\u001e\u000f\u0000\u00f3\u000b\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0003\u00aaU\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0003\u00aeW\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0003\u00a0P\u0000\u00fb\u00fc\u0005W\u0000\u0000\u00fc\u00fe\u0005\u0006"+
		"\u0000\u0000\u00fd\u00ff\u0003*\u0015\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0105\u0005\u0007\u0000\u0000\u0101\u0102\u0005\b\u0000\u0000"+
		"\u0102\u0104\u0005\t\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0003$\u0012\u0000\u0109\r"+
		"\u0001\u0000\u0000\u0000\u010a\u010c\u0003\u00aaU\u0000\u010b\u010a\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005W\u0000\u0000\u010e\u0110\u0005\u0006"+
		"\u0000\u0000\u010f\u0111\u0003*\u0015\u0000\u0110\u010f\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0007\u0000\u0000\u0113\u0114\u0003t:\u0000\u0114"+
		"\u000f\u0001\u0000\u0000\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116\u0117"+
		"\u0003\u00b2Y\u0000\u0117\u0011\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u000b\u0000\u0000\u0119\u011e\u0003\u00b2Y\u0000\u011a\u011b\u0005\f"+
		"\u0000\u0000\u011b\u011d\u0003\u00b2Y\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0013\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000"+
		"\u0122\u0127\u0003\u00b2Y\u0000\u0123\u0124\u0005\f\u0000\u0000\u0124"+
		"\u0126\u0003\u00b2Y\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u0015\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012e\u0005\r\u0000\u0000\u012b\u012d\u0003"+
		"\u0018\f\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u000e\u0000\u0000\u0132\u0017\u0001\u0000"+
		"\u0000\u0000\u0133\u0138\u0005\u0002\u0000\u0000\u0134\u0138\u0003t:\u0000"+
		"\u0135\u0138\u0003\u001c\u000e\u0000\u0136\u0138\u0003\u001a\r\u0000\u0137"+
		"\u0133\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0019\u0001\u0000\u0000\u0000\u0139\u013a\u0005V\u0000\u0000\u013a\u013b"+
		"\u0003t:\u0000\u013b\u001b\u0001\u0000\u0000\u0000\u013c\u0142\u0003\f"+
		"\u0006\u0000\u013d\u0142\u0003,\u0016\u0000\u013e\u0142\u0003\u000e\u0007"+
		"\u0000\u013f\u0142\u0003\b\u0004\u0000\u0140\u0142\u0003\n\u0005\u0000"+
		"\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000"+
		"\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u001d\u0001\u0000\u0000\u0000"+
		"\u0143\u0147\u0005\r\u0000\u0000\u0144\u0146\u0003 \u0010\u0000\u0145"+
		"\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u014a\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\u000e\u0000\u0000\u014b\u001f\u0001\u0000\u0000\u0000\u014c"+
		"\u014f\u0005\u0002\u0000\u0000\u014d\u014f\u0003\"\u0011\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f!\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0003\f\u0006\u0000\u0151\u0153\u0003,"+
		"\u0016\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0153#\u0001\u0000\u0000\u0000\u0154\u0158\u0005\r\u0000"+
		"\u0000\u0155\u0157\u0003&\u0013\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u000e\u0000\u0000"+
		"\u015c%\u0001\u0000\u0000\u0000\u015d\u0161\u0003r9\u0000\u015e\u0161"+
		"\u0003v;\u0000\u015f\u0161\u0003(\u0014\u0000\u0160\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\'\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u000f\u0000"+
		"\u0000\u0163\u0165\u00034\u001a\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165)\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0003\u00a2Q\u0000\u0167\u016e\u0005W\u0000\u0000\u0168\u0169\u0005"+
		"\f\u0000\u0000\u0169\u016a\u0003\u00a2Q\u0000\u016a\u016b\u0005W\u0000"+
		"\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u0168\u0001\u0000\u0000"+
		"\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f+\u0001\u0000\u0000\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173\u0003\u00b0X\u0000\u0172"+
		"\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0003\u00a2Q\u0000\u0175\u017a"+
		"\u0003.\u0017\u0000\u0176\u0177\u0005\f\u0000\u0000\u0177\u0179\u0003"+
		".\u0017\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000"+
		"\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e-\u0001\u0000\u0000"+
		"\u0000\u017f\u0182\u0005W\u0000\u0000\u0180\u0181\u0005F\u0000\u0000\u0181"+
		"\u0183\u00030\u0018\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183/\u0001\u0000\u0000\u0000\u0184\u0187\u0003"+
		"4\u001a\u0000\u0185\u0187\u00032\u0019\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u01871\u0001\u0000\u0000\u0000"+
		"\u0188\u0191\u0005\r\u0000\u0000\u0189\u018e\u00030\u0018\u0000\u018a"+
		"\u018b\u0005\f\u0000\u0000\u018b\u018d\u00030\u0018\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0192"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0189"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0001\u0000\u0000\u0000\u0193\u0195\u0005\f\u0000\u0000\u0194\u0193\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005\u000e\u0000\u0000\u01973\u0001\u0000"+
		"\u0000\u0000\u0198\u019e\u0003B!\u0000\u0199\u019e\u0003P(\u0000\u019a"+
		"\u019e\u00036\u001b\u0000\u019b\u019e\u0003<\u001e\u0000\u019c\u019e\u0003"+
		"@ \u0000\u019d\u0198\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000"+
		"\u0000\u019d\u019a\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e5\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0005\u0006\u0000\u0000\u01a0\u01a1\u00034\u001a\u0000\u01a1"+
		"\u01a2\u0005\u0007\u0000\u0000\u01a2\u01aa\u0001\u0000\u0000\u0000\u01a3"+
		"\u01aa\u0005\u0010\u0000\u0000\u01a4\u01aa\u0005\u0011\u0000\u0000\u01a5"+
		"\u01aa\u0003\u00b4Z\u0000\u01a6\u01aa\u0003\u00b2Y\u0000\u01a7\u01aa\u0005"+
		"W\u0000\u0000\u01a8\u01aa\u0003:\u001d\u0000\u01a9\u019f\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a3\u0001\u0000\u0000\u0000\u01a9\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a5\u0001\u0000\u0000\u0000\u01a9\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000"+
		"\u0000\u01aa7\u0001\u0000\u0000\u0000\u01ab\u01b0\u00034\u001a\u0000\u01ac"+
		"\u01ad\u0005\f\u0000\u0000\u01ad\u01af\u00034\u001a\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b19\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003"+
		"\u00b2Y\u0000\u01b4\u01b6\u0005\u0006\u0000\u0000\u01b5\u01b7\u00038\u001c"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u0007\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0002\u0000\u0000\u01ba;\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0003>\u001f\u0000\u01bc\u01bd\u0005\u0002\u0000\u0000\u01bd"+
		"=\u0001\u0000\u0000\u0000\u01be\u01c3\u00036\u001b\u0000\u01bf\u01c0\u0005"+
		"\b\u0000\u0000\u01c0\u01c1\u00034\u001a\u0000\u01c1\u01c2\u0005\t\u0000"+
		"\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4?\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0005\u0012\u0000\u0000\u01c6\u01c9\u0003\u00b2Y\u0000\u01c7"+
		"\u01c9\u0003:\u001d\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc"+
		"\u0003\u0016\u000b\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ccA\u0001\u0000\u0000\u0000\u01cd\u01d3\u0003"+
		"L&\u0000\u01ce\u01d3\u0003N\'\u0000\u01cf\u01d3\u0003F#\u0000\u01d0\u01d3"+
		"\u0003H$\u0000\u01d1\u01d3\u0003J%\u0000\u01d2\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d2\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3C\u0001\u0000\u0000\u0000\u01d4\u01d9\u0003F#\u0000\u01d5"+
		"\u01d9\u0003H$\u0000\u01d6\u01d9\u0003J%\u0000\u01d7\u01d9\u00036\u001b"+
		"\u0000\u01d8\u01d4\u0001\u0000\u0000\u0000\u01d8\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9E\u0001\u0000\u0000\u0000\u01da\u01db\u00036\u001b\u0000\u01db"+
		"\u01dc\u0005\u0013\u0000\u0000\u01dc\u01dd\u0003D\"\u0000\u01ddG\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u00036\u001b\u0000\u01df\u01e0\u0005\u0014"+
		"\u0000\u0000\u01e0\u01e1\u0003D\"\u0000\u01e1I\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u00036\u001b\u0000\u01e3\u01e4\u0005\u0015\u0000\u0000\u01e4"+
		"\u01e5\u0003D\"\u0000\u01e5K\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003"+
		"D\"\u0000\u01e7\u01ea\u0005\u0016\u0000\u0000\u01e8\u01eb\u0003B!\u0000"+
		"\u01e9\u01eb\u00036\u001b\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01ebM\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0003D\"\u0000\u01ed\u01f0\u0005\u0017\u0000\u0000\u01ee\u01f1\u0003"+
		"B!\u0000\u01ef\u01f1\u00036\u001b\u0000\u01f0\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1O\u0001\u0000\u0000\u0000"+
		"\u01f2\u01fa\u0003T*\u0000\u01f3\u01fa\u0003V+\u0000\u01f4\u01fa\u0003"+
		"X,\u0000\u01f5\u01fa\u0003Z-\u0000\u01f6\u01fa\u0003\\.\u0000\u01f7\u01fa"+
		"\u0003^/\u0000\u01f8\u01fa\u0003`0\u0000\u01f9\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f3\u0001\u0000\u0000\u0000\u01f9\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000\u01f9\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000"+
		"\u0000\u01faQ\u0001\u0000\u0000\u0000\u01fb\u0201\u0003T*\u0000\u01fc"+
		"\u0201\u0003V+\u0000\u01fd\u0201\u0003X,\u0000\u01fe\u0201\u0003Z-\u0000"+
		"\u01ff\u0201\u0003`0\u0000\u0200\u01fb\u0001\u0000\u0000\u0000\u0200\u01fc"+
		"\u0001\u0000\u0000\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0200\u01fe"+
		"\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201S\u0001"+
		"\u0000\u0000\u0000\u0202\u0205\u00036\u001b\u0000\u0203\u0205\u0003B!"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0209\u0005\u0018\u0000"+
		"\u0000\u0207\u020a\u00036\u001b\u0000\u0208\u020a\u0003B!\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a"+
		"U\u0001\u0000\u0000\u0000\u020b\u020e\u00036\u001b\u0000\u020c\u020e\u0003"+
		"B!\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0212\u0005\u0019\u0000"+
		"\u0000\u0210\u0213\u00036\u001b\u0000\u0211\u0213\u0003B!\u0000\u0212"+
		"\u0210\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213"+
		"W\u0001\u0000\u0000\u0000\u0214\u0217\u00036\u001b\u0000\u0215\u0217\u0003"+
		"B!\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021b\u0005\u001a\u0000"+
		"\u0000\u0219\u021c\u00036\u001b\u0000\u021a\u021c\u0003B!\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c"+
		"Y\u0001\u0000\u0000\u0000\u021d\u0220\u00036\u001b\u0000\u021e\u0220\u0003"+
		"B!\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u021e\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0224\u0005\u001b\u0000"+
		"\u0000\u0222\u0225\u00036\u001b\u0000\u0223\u0225\u0003B!\u0000\u0224"+
		"\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225"+
		"[\u0001\u0000\u0000\u0000\u0226\u022a\u00036\u001b\u0000\u0227\u022a\u0003"+
		"R)\u0000\u0228\u022a\u0003B!\u0000\u0229\u0226\u0001\u0000\u0000\u0000"+
		"\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u001c\u0000\u0000"+
		"\u022c\u022d\u00034\u001a\u0000\u022d]\u0001\u0000\u0000\u0000\u022e\u0232"+
		"\u00036\u001b\u0000\u022f\u0232\u0003R)\u0000\u0230\u0232\u0003B!\u0000"+
		"\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000"+
		"\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0005\u001d\u0000\u0000\u0234\u0235\u00034\u001a\u0000\u0235"+
		"_\u0001\u0000\u0000\u0000\u0236\u0237\u0005\u001e\u0000\u0000\u0237\u0238"+
		"\u00034\u001a\u0000\u0238a\u0001\u0000\u0000\u0000\u0239\u023d\u0003d"+
		"2\u0000\u023a\u023d\u0003f3\u0000\u023b\u023d\u0003h4\u0000\u023c\u0239"+
		"\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023b"+
		"\u0001\u0000\u0000\u0000\u023dc\u0001\u0000\u0000\u0000\u023e\u023f\u0003"+
		"D\"\u0000\u023f\u0240\u0005\u001f\u0000\u0000\u0240\u0241\u0003D\"\u0000"+
		"\u0241e\u0001\u0000\u0000\u0000\u0242\u0243\u0003D\"\u0000\u0243\u0244"+
		"\u0005 \u0000\u0000\u0244\u0245\u0003D\"\u0000\u0245g\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0003D\"\u0000\u0247\u0248\u0005!\u0000\u0000\u0248"+
		"\u0249\u0003D\"\u0000\u0249i\u0001\u0000\u0000\u0000\u024a\u024e\u0003"+
		"l6\u0000\u024b\u024e\u0003l6\u0000\u024c\u024e\u0003p8\u0000\u024d\u024a"+
		"\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024c"+
		"\u0001\u0000\u0000\u0000\u024ek\u0001\u0000\u0000\u0000\u024f\u0250\u0003"+
		"D\"\u0000\u0250\u0251\u0005\"\u0000\u0000\u0251\u0252\u0003D\"\u0000\u0252"+
		"m\u0001\u0000\u0000\u0000\u0253\u0254\u0003D\"\u0000\u0254\u0255\u0005"+
		"#\u0000\u0000\u0255\u0256\u0003D\"\u0000\u0256o\u0001\u0000\u0000\u0000"+
		"\u0257\u0258\u0003D\"\u0000\u0258\u0259\u0005$\u0000\u0000\u0259\u025a"+
		"\u0003D\"\u0000\u025aq\u0001\u0000\u0000\u0000\u025b\u0268\u0003t:\u0000"+
		"\u025c\u0268\u0003\u009cN\u0000\u025d\u0268\u0003:\u001d\u0000\u025e\u0268"+
		"\u0003x<\u0000\u025f\u0268\u0003z=\u0000\u0260\u0268\u0003|>\u0000\u0261"+
		"\u0268\u0003~?\u0000\u0262\u0268\u0003\u0088D\u0000\u0263\u0268\u0003"+
		"\u0090H\u0000\u0264\u0268\u0003\u0092I\u0000\u0265\u0268\u0003\u0094J"+
		"\u0000\u0266\u0268\u0003\u009aM\u0000\u0267\u025b\u0001\u0000\u0000\u0000"+
		"\u0267\u025c\u0001\u0000\u0000\u0000\u0267\u025d\u0001\u0000\u0000\u0000"+
		"\u0267\u025e\u0001\u0000\u0000\u0000\u0267\u025f\u0001\u0000\u0000\u0000"+
		"\u0267\u0260\u0001\u0000\u0000\u0000\u0267\u0261\u0001\u0000\u0000\u0000"+
		"\u0267\u0262\u0001\u0000\u0000\u0000\u0267\u0263\u0001\u0000\u0000\u0000"+
		"\u0267\u0264\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0267\u0266\u0001\u0000\u0000\u0000\u0268s\u0001\u0000\u0000\u0000\u0269"+
		"\u026e\u0005\r\u0000\u0000\u026a\u026d\u0003r9\u0000\u026b\u026d\u0003"+
		"v;\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026b\u0001\u0000\u0000"+
		"\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000"+
		"\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u000e\u0000"+
		"\u0000\u0272u\u0001\u0000\u0000\u0000\u0273\u0274\u0003\u00a2Q\u0000\u0274"+
		"\u0279\u0003.\u0017\u0000\u0275\u0276\u0005\f\u0000\u0000\u0276\u0278"+
		"\u0003.\u0017\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u027b\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001"+
		"\u0000\u0000\u0000\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u0279\u0001"+
		"\u0000\u0000\u0000\u027c\u027d\u0005\u0002\u0000\u0000\u027dw\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0005%\u0000\u0000\u027f\u0280\u0005\u0006\u0000"+
		"\u0000\u0280\u0281\u00034\u001a\u0000\u0281\u0282\u0005\u0007\u0000\u0000"+
		"\u0282\u0283\u0003r9\u0000\u0283y\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0005%\u0000\u0000\u0285\u0286\u0005\u0006\u0000\u0000\u0286\u0287\u0003"+
		"4\u001a\u0000\u0287\u0288\u0005\u0007\u0000\u0000\u0288\u0289\u0003r9"+
		"\u0000\u0289\u028a\u0005&\u0000\u0000\u028a\u028b\u0003r9\u0000\u028b"+
		"{\u0001\u0000\u0000\u0000\u028c\u028d\u0005\'\u0000\u0000\u028d\u028e"+
		"\u0005\u0006\u0000\u0000\u028e\u028f\u00034\u001a\u0000\u028f\u0290\u0005"+
		"\u0007\u0000\u0000\u0290\u0291\u0003r9\u0000\u0291}\u0001\u0000\u0000"+
		"\u0000\u0292\u0293\u0005(\u0000\u0000\u0293\u0294\u0005\u0006\u0000\u0000"+
		"\u0294\u0295\u0003\u0080@\u0000\u0295\u0296\u0005\u0007\u0000\u0000\u0296"+
		"\u0297\u0003r9\u0000\u0297\u007f\u0001\u0000\u0000\u0000\u0298\u029a\u0003"+
		"\u0084B\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029d\u0005\u0002"+
		"\u0000\u0000\u029c\u029e\u00034\u001a\u0000\u029d\u029c\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000"+
		"\u0000\u029f\u02a1\u0005\u0002\u0000\u0000\u02a0\u02a2\u0003\u0086C\u0000"+
		"\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a2\u0081\u0001\u0000\u0000\u0000\u02a3\u02a6\u0003\u009cN\u0000\u02a4"+
		"\u02a6\u0003:\u001d\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a6\u0083\u0001\u0000\u0000\u0000\u02a7\u02aa"+
		"\u0003v;\u0000\u02a8\u02aa\u0003\u0086C\u0000\u02a9\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u0085\u0001\u0000"+
		"\u0000\u0000\u02ab\u02b0\u0003\u0082A\u0000\u02ac\u02ad\u0005\f\u0000"+
		"\u0000\u02ad\u02af\u0003\u0082A\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000"+
		"\u02af\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u0087\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005)\u0000\u0000\u02b4"+
		"\u02b5\u0005\u0006\u0000\u0000\u02b5\u02b6\u00034\u001a\u0000\u02b6\u02b7"+
		"\u0005\u0007\u0000\u0000\u02b7\u02bb\u0005\r\u0000\u0000\u02b8\u02ba\u0003"+
		"\u008aE\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000"+
		"\u0000\u0000\u02be\u02bf\u0005\u000e\u0000\u0000\u02bf\u0089\u0001\u0000"+
		"\u0000\u0000\u02c0\u02c2\u0003\u008cF\u0000\u02c1\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c7\u0003\u008eG\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u008b\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c9\u0005*\u0000\u0000\u02c9\u02ca\u00034\u001a\u0000\u02ca\u02cb"+
		"\u0005+\u0000\u0000\u02cb\u02cf\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005"+
		",\u0000\u0000\u02cd\u02cf\u0005+\u0000\u0000\u02ce\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u008d\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d2\u0003r9\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d8\u0003\u0090H\u0000\u02d7\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u008f"+
		"\u0001\u0000\u0000\u0000\u02d9\u02da\u0005-\u0000\u0000\u02da\u02db\u0005"+
		"\u0002\u0000\u0000\u02db\u0091\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005"+
		".\u0000\u0000\u02dd\u02de\u0005\u0002\u0000\u0000\u02de\u0093\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0005/\u0000\u0000\u02e0\u02e2\u0003t:\u0000"+
		"\u02e1\u02e3\u0003\u0096K\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e8\u0003\u0098L\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0001\u0000\u0000\u0000\u02e8\u0095\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u00050\u0000\u0000\u02ea\u02eb\u0005\u0006\u0000\u0000\u02eb\u02ec\u0003"+
		"\u00a2Q\u0000\u02ec\u02ed\u0005W\u0000\u0000\u02ed\u02ee\u0005\u0007\u0000"+
		"\u0000\u02ee\u02ef\u0003t:\u0000\u02ef\u0097\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f1\u00051\u0000\u0000\u02f1\u02f2\u0003t:\u0000\u02f2\u0099\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f4\u00052\u0000\u0000\u02f4\u02f5\u00034\u001a"+
		"\u0000\u02f5\u02f6\u0005\u0002\u0000\u0000\u02f6\u009b\u0001\u0000\u0000"+
		"\u0000\u02f7\u02fa\u00036\u001b\u0000\u02f8\u02fa\u0003>\u001f\u0000\u02f9"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0003\u009eO\u0000\u02fc\u02fd"+
		"\u00034\u001a\u0000\u02fd\u02fe\u0005\u0002\u0000\u0000\u02fe\u009d\u0001"+
		"\u0000\u0000\u0000\u02ff\u0300\u0007\u0000\u0000\u0000\u0300\u009f\u0001"+
		"\u0000\u0000\u0000\u0301\u0304\u0003\u00a2Q\u0000\u0302\u0304\u0005R\u0000"+
		"\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0302\u0001\u0000\u0000"+
		"\u0000\u0304\u00a1\u0001\u0000\u0000\u0000\u0305\u0309\u0003\u00a4R\u0000"+
		"\u0306\u0309\u0003\u00a6S\u0000\u0307\u0309\u0003\u00a8T\u0000\u0308\u0305"+
		"\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0307"+
		"\u0001\u0000\u0000\u0000\u0309\u00a3\u0001\u0000\u0000\u0000\u030a\u0314"+
		"\u00053\u0000\u0000\u030b\u0314\u00054\u0000\u0000\u030c\u0314\u00055"+
		"\u0000\u0000\u030d\u0314\u00056\u0000\u0000\u030e\u0314\u00057\u0000\u0000"+
		"\u030f\u0314\u00058\u0000\u0000\u0310\u0314\u00059\u0000\u0000\u0311\u0314"+
		"\u0005:\u0000\u0000\u0312\u0314\u0005W\u0000\u0000\u0313\u030a\u0001\u0000"+
		"\u0000\u0000\u0313\u030b\u0001\u0000\u0000\u0000\u0313\u030c\u0001\u0000"+
		"\u0000\u0000\u0313\u030d\u0001\u0000\u0000\u0000\u0313\u030e\u0001\u0000"+
		"\u0000\u0000\u0313\u030f\u0001\u0000\u0000\u0000\u0313\u0310\u0001\u0000"+
		"\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0312\u0001\u0000"+
		"\u0000\u0000\u0314\u00a5\u0001\u0000\u0000\u0000\u0315\u031d\u0005;\u0000"+
		"\u0000\u0316\u031d\u0005<\u0000\u0000\u0317\u031d\u0005=\u0000\u0000\u0318"+
		"\u031d\u0005>\u0000\u0000\u0319\u031d\u0005?\u0000\u0000\u031a\u031d\u0005"+
		"@\u0000\u0000\u031b\u031d\u0005A\u0000\u0000\u031c\u0315\u0001\u0000\u0000"+
		"\u0000\u031c\u0316\u0001\u0000\u0000\u0000\u031c\u0317\u0001\u0000\u0000"+
		"\u0000\u031c\u0318\u0001\u0000\u0000\u0000\u031c\u0319\u0001\u0000\u0000"+
		"\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031c\u031b\u0001\u0000\u0000"+
		"\u0000\u031d\u00a7\u0001\u0000\u0000\u0000\u031e\u0321\u0003\u00a6S\u0000"+
		"\u031f\u0321\u0003\u00a4R\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320"+
		"\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322"+
		"\u0323\u0005\b\u0000\u0000\u0323\u0324\u0005\t\u0000\u0000\u0324\u00a9"+
		"\u0001\u0000\u0000\u0000\u0325\u0329\u0005S\u0000\u0000\u0326\u0329\u0005"+
		"B\u0000\u0000\u0327\u0329\u0005C\u0000\u0000\u0328\u0325\u0001\u0000\u0000"+
		"\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0327\u0001\u0000\u0000"+
		"\u0000\u0329\u00ab\u0001\u0000\u0000\u0000\u032a\u032b\u0007\u0001\u0000"+
		"\u0000\u032b\u00ad\u0001\u0000\u0000\u0000\u032c\u032e\u0005U\u0000\u0000"+
		"\u032d\u032c\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000"+
		"\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0335\u0005V\u0000\u0000\u0330"+
		"\u0332\u0005V\u0000\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335"+
		"\u0005U\u0000\u0000\u0334\u032d\u0001\u0000\u0000\u0000\u0334\u0331\u0001"+
		"\u0000\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336\u0338\u0005"+
		"T\u0000\u0000\u0337\u0334\u0001\u0000\u0000\u0000\u0337\u0336\u0001\u0000"+
		"\u0000\u0000\u0338\u00af\u0001\u0000\u0000\u0000\u0339\u0342\u0003\u00aa"+
		"U\u0000\u033a\u033c\u0005U\u0000\u0000\u033b\u033a\u0001\u0000\u0000\u0000"+
		"\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000"+
		"\u033d\u0343\u0005V\u0000\u0000\u033e\u0340\u0005V\u0000\u0000\u033f\u033e"+
		"\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0341"+
		"\u0001\u0000\u0000\u0000\u0341\u0343\u0005U\u0000\u0000\u0342\u033b\u0001"+
		"\u0000\u0000\u0000\u0342\u033f\u0001\u0000\u0000\u0000\u0342\u0343\u0001"+
		"\u0000\u0000\u0000\u0343\u0360\u0001\u0000\u0000\u0000\u0344\u0346\u0005"+
		"U\u0000\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000"+
		"\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u034d\u0005V\u0000"+
		"\u0000\u0348\u034a\u0005V\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000"+
		"\u034b\u034d\u0005U\u0000\u0000\u034c\u0345\u0001\u0000\u0000\u0000\u034c"+
		"\u0349\u0001\u0000\u0000\u0000\u034d\u034f\u0001\u0000\u0000\u0000\u034e"+
		"\u0350\u0003\u00aaU\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u034f\u0350"+
		"\u0001\u0000\u0000\u0000\u0350\u0360\u0001\u0000\u0000\u0000\u0351\u0353"+
		"\u0005U\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0352\u0353\u0001"+
		"\u0000\u0000\u0000\u0353\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0003"+
		"\u00aaU\u0000\u0355\u0356\u0005V\u0000\u0000\u0356\u035e\u0001\u0000\u0000"+
		"\u0000\u0357\u0359\u0005V\u0000\u0000\u0358\u0357\u0001\u0000\u0000\u0000"+
		"\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0003\u00aaU\u0000\u035b\u035c\u0005U\u0000\u0000\u035c\u035e"+
		"\u0001\u0000\u0000\u0000\u035d\u0352\u0001\u0000\u0000\u0000\u035d\u0358"+
		"\u0001\u0000\u0000\u0000\u035e\u0360\u0001\u0000\u0000\u0000\u035f\u0339"+
		"\u0001\u0000\u0000\u0000\u035f\u034c\u0001\u0000\u0000\u0000\u035f\u035d"+
		"\u0001\u0000\u0000\u0000\u0360\u00b1\u0001\u0000\u0000\u0000\u0361\u0362"+
		"\u0005W\u0000\u0000\u0362\u0364\u0005D\u0000\u0000\u0363\u0361\u0001\u0000"+
		"\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0368\u0001\u0000"+
		"\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368\u0369\u0005W\u0000"+
		"\u0000\u0369\u00b3\u0001\u0000\u0000\u0000\u036a\u036b\u0007\u0002\u0000"+
		"\u0000\u036b\u00b5\u0001\u0000\u0000\u0000g\u00b7\u00bc\u00c2\u00cd\u00d1"+
		"\u00d8\u00db\u00de\u00e3\u00e6\u00eb\u00f0\u00f5\u00f8\u00fe\u0105\u010b"+
		"\u0110\u011e\u0127\u012e\u0137\u0141\u0147\u014e\u0152\u0158\u0160\u0164"+
		"\u016e\u0172\u017a\u0182\u0186\u018e\u0191\u0194\u019d\u01a9\u01b0\u01b6"+
		"\u01c3\u01c8\u01cb\u01d2\u01d8\u01ea\u01f0\u01f9\u0200\u0204\u0209\u020d"+
		"\u0212\u0216\u021b\u021f\u0224\u0229\u0231\u023c\u024d\u0267\u026c\u026e"+
		"\u0279\u0299\u029d\u02a1\u02a5\u02a9\u02b0\u02bb\u02c3\u02c6\u02ce\u02d3"+
		"\u02d7\u02e4\u02e7\u02f9\u0303\u0308\u0313\u031c\u0320\u0328\u032d\u0331"+
		"\u0334\u0337\u033b\u033f\u0342\u0345\u0349\u034c\u034f\u0352\u0358\u035d"+
		"\u035f\u0365";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}