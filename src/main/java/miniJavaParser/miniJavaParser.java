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
		T__59=60, T__60=61, T__61=62, Wildcard=63, AND=64, OR=65, ASSIGN=66, ADD_ASSIGN=67, 
		SUB_ASSIGN=68, MUL_ASSIGN=69, DIV_ASSIGN=70, AND_ASSIGN=71, OR_ASSIGN=72, 
		XOR_ASSIGN=73, MOD_ASSIGN=74, LSHIFT_ASSIGN=75, RSHIFT_ASSIGN=76, URSHIFT_ASSIGN=77, 
		VoidType=78, Public=79, Abstract=80, Final=81, Static=82, BooleanLiteral=83, 
		IntegerLiteral=84, LongLiteral=85, NullLiteral=86, FloatingPointLiteral=87, 
		DoubleLiteral=88, CharacterLiteral=89, StringLiteral=90, WS=91, COMMENT=92, 
		LINE_COMMENT=93, Identifier=94;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_constructorDeclaration = 7, RULE_superclass = 8, 
		RULE_superinterfaces = 9, RULE_extendsInterfaces = 10, RULE_classBody = 11, 
		RULE_classBodyDeclaration = 12, RULE_memberDeclaration = 13, RULE_interfaceBody = 14, 
		RULE_interfaceBodyDeclaration = 15, RULE_interfaceMemberDeclaration = 16, 
		RULE_methodBody = 17, RULE_methodBodyStatement = 18, RULE_return = 19, 
		RULE_formalParameters = 20, RULE_fieldDeclaration = 21, RULE_variableDeclarator = 22, 
		RULE_variableInitializer = 23, RULE_arrayInitializer = 24, RULE_expression = 25, 
		RULE_value = 26, RULE_primary = 27, RULE_expressionList = 28, RULE_methodCall = 29, 
		RULE_arrayRead = 30, RULE_arrayAccess = 31, RULE_newObject = 32, RULE_calcFunction = 33, 
		RULE_term = 34, RULE_calcBinOpHigher = 35, RULE_calcBinOpLower = 36, RULE_calcUnOp = 37, 
		RULE_negate = 38, RULE_booleanFunction = 39, RULE_booleanFunHigh = 40, 
		RULE_booleanFunMiddle = 41, RULE_booleanFunLow = 42, RULE_inverse = 43, 
		RULE_booleanNumberOp = 44, RULE_booleanOp = 45, RULE_statement = 46, RULE_blockStatement = 47, 
		RULE_block = 48, RULE_localVariableDeclaration = 49, RULE_ifThen = 50, 
		RULE_ifThenElse = 51, RULE_whileStatement = 52, RULE_forStatement = 53, 
		RULE_forControl = 54, RULE_switch = 55, RULE_switchBlockStatementGroup = 56, 
		RULE_switchLabel = 57, RULE_switchBlock = 58, RULE_break = 59, RULE_continue = 60, 
		RULE_tryStatement = 61, RULE_catchClause = 62, RULE_finallyClause = 63, 
		RULE_throwStatement = 64, RULE_assignment = 65, RULE_assignmentType = 66, 
		RULE_typeOrVoid = 67, RULE_type = 68, RULE_objectType = 69, RULE_primitiveType = 70, 
		RULE_arrayType = 71, RULE_accessModifier = 72, RULE_classModifier = 73, 
		RULE_methodModifier = 74, RULE_fieldModifier = 75, RULE_qualifiedName = 76, 
		RULE_literal = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classDeclaration", "interfaceDeclaration", "methodDeclaration", "constructorDeclaration", 
			"superclass", "superinterfaces", "extendsInterfaces", "classBody", "classBodyDeclaration", 
			"memberDeclaration", "interfaceBody", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"methodBody", "methodBodyStatement", "return", "formalParameters", "fieldDeclaration", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "expression", 
			"value", "primary", "expressionList", "methodCall", "arrayRead", "arrayAccess", 
			"newObject", "calcFunction", "term", "calcBinOpHigher", "calcBinOpLower", 
			"calcUnOp", "negate", "booleanFunction", "booleanFunHigh", "booleanFunMiddle", 
			"booleanFunLow", "inverse", "booleanNumberOp", "booleanOp", "statement", 
			"blockStatement", "block", "localVariableDeclaration", "ifThen", "ifThenElse", 
			"whileStatement", "forStatement", "forControl", "switch", "switchBlockStatementGroup", 
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
			"'-'", "'++'", "'--'", "'!'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", 
			"'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", 
			"'break'", "'continue'", "'try'", "'catch'", "'finally'", "'throw'", 
			"'String'", "'Short'", "'Integer'", "'Float'", "'Double'", "'Boolean'", 
			"'Character'", "'short'", "'int'", "'float'", "'double'", "'boolean'", 
			"'char'", "'private'", "'protected'", "'.'", null, "'&&'", "'||'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'void'", "'public'", "'abstract'", "'final'", "'static'", 
			null, null, null, "'null'"
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
			null, null, null, "Wildcard", "AND", "OR", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7L) != 0)) {
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
			if (_la==Public) {
				{
				setState(192);
				match(Public);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 524291L) != 0)) {
				{
				setState(218);
				accessModifier();
				}
			}

			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) {
				{
				setState(221);
				methodModifier();
				}
			}

			setState(224);
			typeOrVoid();
			setState(225);
			match(Identifier);
			setState(226);
			match(T__5);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 140737488363519L) != 0)) {
				{
				setState(227);
				formalParameters();
				}
			}

			setState(230);
			match(T__6);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(231);
				match(T__7);
				setState(232);
				match(T__8);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 524291L) != 0)) {
				{
				setState(240);
				accessModifier();
				}
			}

			setState(243);
			match(Identifier);
			setState(244);
			match(T__5);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 140737488363519L) != 0)) {
				{
				setState(245);
				formalParameters();
				}
			}

			setState(248);
			match(T__6);
			setState(249);
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
		enterRule(_localctx, 16, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__9);
			setState(252);
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
		enterRule(_localctx, 18, RULE_superinterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__10);
			setState(255);
			qualifiedName();
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(256);
					match(T__11);
					setState(257);
					qualifiedName();
					}
					} 
				}
				setState(262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extendsInterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__9);
			setState(264);
			qualifiedName();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(265);
					match(T__11);
					setState(266);
					qualifiedName();
					}
					} 
				}
				setState(271);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__12);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611545280939040820L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 65567L) != 0)) {
				{
				{
				setState(273);
				classBodyDeclaration();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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
		enterRule(_localctx, 24, RULE_classBodyDeclaration);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__1);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				block();
				}
				break;
			case T__3:
			case T__4:
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
			case T__60:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
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
		enterRule(_localctx, 26, RULE_memberDeclaration);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
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
		enterRule(_localctx, 28, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__12);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611545280939032580L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 65567L) != 0)) {
				{
				{
				setState(294);
				interfaceBodyDeclaration();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
		enterRule(_localctx, 30, RULE_interfaceBodyDeclaration);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__1);
				}
				break;
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
			case T__60:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceMemberDeclaration);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		enterRule(_localctx, 34, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__12);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152866778133798976L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				{
				setState(311);
				methodBodyStatement();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
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
		enterRule(_localctx, 36, RULE_methodBodyStatement);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				localVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
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
		enterRule(_localctx, 38, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__14);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(325);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			type();
			setState(329);
			match(Identifier);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(330);
				match(T__11);
				setState(331);
				type();
				setState(332);
				match(Identifier);
				}
				}
				setState(338);
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
		enterRule(_localctx, 42, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 6815747L) != 0)) {
				{
				setState(339);
				fieldModifier();
				}
			}

			setState(342);
			type();
			setState(343);
			variableDeclarator();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(344);
				match(T__11);
				setState(345);
				variableDeclarator();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
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
		enterRule(_localctx, 44, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(Identifier);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(354);
				match(ASSIGN);
				setState(355);
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
		enterRule(_localctx, 46, RULE_variableInitializer);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__15:
			case T__16:
			case T__17:
			case T__22:
			case T__25:
			case BooleanLiteral:
			case IntegerLiteral:
			case LongLiteral:
			case NullLiteral:
			case FloatingPointLiteral:
			case DoubleLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				expression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__12);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75964480L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(363);
				variableInitializer();
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(364);
						match(T__11);
						setState(365);
						variableInitializer();
						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(373);
				match(T__11);
				}
			}

			setState(376);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				calcFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
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
	public static class ValueContext extends ParserRuleContext {
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
		public ArrayReadContext arrayRead() {
			return getRuleContext(ArrayReadContext.class,0);
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
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__5);
				setState(385);
				expression();
				setState(386);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				qualifiedName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				match(Identifier);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(394);
				arrayRead();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(T__5);
				setState(398);
				expression();
				setState(399);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				qualifiedName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			expression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(409);
				match(T__11);
				setState(410);
				expression();
				}
				}
				setState(415);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			qualifiedName();
			setState(417);
			match(T__5);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75956288L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(418);
				expressionList();
				}
			}

			setState(421);
			match(T__6);
			setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitArrayRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayReadContext arrayRead() throws RecognitionException {
		ArrayReadContext _localctx = new ArrayReadContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			arrayAccess();
			setState(425);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			primary();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(428);
				match(T__7);
				setState(429);
				expression();
				setState(430);
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
			setState(434);
			match(T__17);
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(435);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(436);
				methodCall();
				}
				break;
			}
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(439);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CalcUnOpContext calcUnOp() {
			return getRuleContext(CalcUnOpContext.class,0);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				value();
				setState(443);
				calcBinOpHigher();
				setState(444);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				term();
				setState(447);
				calcBinOpLower();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(448);
					calcFunction();
					}
					break;
				case 2:
					{
					setState(449);
					value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				qualifiedName();
				setState(453);
				calcUnOp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
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
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				value();
				setState(459);
				calcBinOpHigher();
				setState(460);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
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
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new MULContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new DIVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new MODContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(T__20);
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
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(T__22);
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
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new INCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new DECContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(T__24);
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
			setState(478);
			match(T__22);
			setState(479);
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
		public BooleanFunHighContext booleanFunHigh() {
			return getRuleContext(BooleanFunHighContext.class,0);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public BooleanFunMiddleContext booleanFunMiddle() {
			return getRuleContext(BooleanFunMiddleContext.class,0);
		}
		public TerminalNode AND() { return getToken(miniJavaParser.AND, 0); }
		public BooleanFunLowContext booleanFunLow() {
			return getRuleContext(BooleanFunLowContext.class,0);
		}
		public TerminalNode OR() { return getToken(miniJavaParser.OR, 0); }
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(481);
					value();
					}
					break;
				case 2:
					{
					setState(482);
					calcFunction();
					}
					break;
				}
				setState(485);
				booleanNumberOp();
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(486);
					value();
					}
					break;
				case 2:
					{
					setState(487);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				booleanFunHigh();
				setState(491);
				booleanOp();
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(492);
					booleanFunction();
					}
					break;
				case 2:
					{
					setState(493);
					value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				booleanFunMiddle();
				setState(497);
				match(AND);
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(498);
					booleanFunction();
					}
					break;
				case 2:
					{
					setState(499);
					value();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				booleanFunLow();
				setState(503);
				match(OR);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(504);
					booleanFunction();
					}
					break;
				case 2:
					{
					setState(505);
					value();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
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
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(511);
					value();
					}
					break;
				case 2:
					{
					setState(512);
					calcFunction();
					}
					break;
				}
				setState(515);
				booleanNumberOp();
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(516);
					value();
					}
					break;
				case 2:
					{
					setState(517);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
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
		public BooleanFunHighContext booleanFunHigh() {
			return getRuleContext(BooleanFunHighContext.class,0);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
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
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(523);
					value();
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
				booleanNumberOp();
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(528);
					value();
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				booleanFunHigh();
				setState(533);
				booleanOp();
				setState(534);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
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
		public BooleanFunHighContext booleanFunHigh() {
			return getRuleContext(BooleanFunHighContext.class,0);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public BooleanFunMiddleContext booleanFunMiddle() {
			return getRuleContext(BooleanFunMiddleContext.class,0);
		}
		public TerminalNode AND() { return getToken(miniJavaParser.AND, 0); }
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
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(539);
					value();
					}
					break;
				case 2:
					{
					setState(540);
					calcFunction();
					}
					break;
				}
				setState(543);
				booleanNumberOp();
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(544);
					value();
					}
					break;
				case 2:
					{
					setState(545);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				booleanFunHigh();
				setState(549);
				booleanOp();
				setState(550);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				booleanFunMiddle();
				setState(553);
				match(AND);
				setState(554);
				booleanFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInverse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseContext inverse() throws RecognitionException {
		InverseContext _localctx = new InverseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(T__25);
			setState(560);
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
		enterRule(_localctx, 88, RULE_booleanNumberOp);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new GTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new LTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new LEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new GEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(565);
				match(T__29);
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
		enterRule(_localctx, 90, RULE_booleanOp);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new EQUALContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new NOTEQUALContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(T__31);
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
		enterRule(_localctx, 92, RULE_statement);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				ifThen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				ifThenElse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(578);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(579);
				switch_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(580);
				break_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(581);
				continue_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(582);
				tryStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(583);
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
		enterRule(_localctx, 94, RULE_blockStatement);
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
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
		enterRule(_localctx, 96, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(T__12);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152866778133766208L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				{
				setState(591);
				blockStatement();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
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
		enterRule(_localctx, 98, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			type();
			setState(600);
			variableDeclarator();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(601);
				match(T__11);
				setState(602);
				variableDeclarator();
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
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
		enterRule(_localctx, 100, RULE_ifThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T__32);
			setState(611);
			match(T__5);
			setState(612);
			expression();
			setState(613);
			match(T__6);
			setState(614);
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
		enterRule(_localctx, 102, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__32);
			setState(617);
			match(T__5);
			setState(618);
			expression();
			setState(619);
			match(T__6);
			setState(620);
			statement();
			setState(621);
			match(T__33);
			setState(622);
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
		enterRule(_localctx, 104, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__34);
			setState(625);
			match(T__5);
			setState(626);
			expression();
			setState(627);
			match(T__6);
			setState(628);
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
		enterRule(_localctx, 106, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(T__35);
			setState(631);
			match(T__5);
			setState(632);
			forControl();
			setState(633);
			match(T__6);
			setState(634);
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
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
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
		enterRule(_localctx, 108, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 140737488363519L) != 0)) {
				{
				setState(636);
				localVariableDeclaration();
				}
			}

			setState(639);
			match(T__1);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75694144L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(640);
				booleanFunction();
				}
			}

			setState(643);
			match(T__1);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8585280L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2303L) != 0)) {
				{
				setState(644);
				calcFunction();
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
		enterRule(_localctx, 110, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__36);
			setState(648);
			match(T__5);
			setState(649);
			expression();
			setState(650);
			match(T__6);
			setState(651);
			match(T__12);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37 || _la==T__39) {
				{
				{
				setState(652);
				switchBlockStatementGroup();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
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
		enterRule(_localctx, 112, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(660);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(665);
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
		enterRule(_localctx, 114, RULE_switchLabel);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(T__37);
				setState(669);
				expression();
				setState(670);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(T__39);
				setState(673);
				match(T__38);
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
		enterRule(_localctx, 116, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					statement();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(682);
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
		enterRule(_localctx, 118, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(T__40);
			setState(686);
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
		enterRule(_localctx, 120, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__41);
			setState(689);
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
		enterRule(_localctx, 122, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__42);
			setState(692);
			block();
			setState(694); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(693);
				catchClause();
				}
				}
				setState(696); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__43 );
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(698);
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
		enterRule(_localctx, 124, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__43);
			setState(702);
			match(T__5);
			setState(703);
			type();
			setState(704);
			match(Identifier);
			setState(705);
			match(T__6);
			setState(706);
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
		enterRule(_localctx, 126, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__44);
			setState(709);
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
		enterRule(_localctx, 128, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__45);
			setState(712);
			expression();
			setState(713);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 130, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(715);
				value();
				}
				break;
			case 2:
				{
				setState(716);
				arrayAccess();
				}
				break;
			}
			setState(719);
			assignmentType();
			setState(720);
			expression();
			setState(721);
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
		enterRule(_localctx, 132, RULE_assignmentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		enterRule(_localctx, 134, RULE_typeOrVoid);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
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
		enterRule(_localctx, 136, RULE_type);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				objectType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
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
		enterRule(_localctx, 138, RULE_objectType);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				_localctx = new StringObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(T__46);
				}
				break;
			case T__47:
				_localctx = new ShortObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(T__47);
				}
				break;
			case T__48:
				_localctx = new IntegerObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new FloatObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new DoubleObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(738);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new BooleanObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new CharacterObjectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(740);
				match(T__52);
				}
				break;
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(741);
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
		enterRule(_localctx, 140, RULE_primitiveType);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				_localctx = new ShortTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(748);
				match(T__57);
				}
				break;
			case T__58:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(749);
				match(T__58);
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
		enterRule(_localctx, 142, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
				{
				setState(752);
				primitiveType();
				}
				break;
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case Identifier:
				{
				setState(753);
				objectType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(756);
			match(T__7);
			setState(757);
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
		enterRule(_localctx, 144, RULE_accessModifier);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(Public);
				}
				break;
			case T__59:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(T__59);
				}
				break;
			case T__60:
				_localctx = new ProtectedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				match(T__60);
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
		enterRule(_localctx, 146, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodModifier);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Final:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(766);
						match(Final);
						}
					}

					setState(769);
					match(Static);
					}
					break;
				case 2:
					{
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(770);
						match(Static);
						}
					}

					setState(773);
					match(Final);
					}
					break;
				}
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
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
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				accessModifier();
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(780);
						match(Final);
						}
					}

					setState(783);
					match(Static);
					}
					break;
				case 2:
					{
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(784);
						match(Static);
						}
					}

					setState(787);
					match(Final);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(790);
						match(Final);
						}
					}

					setState(793);
					match(Static);
					}
					break;
				case 2:
					{
					setState(795);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(794);
						match(Static);
						}
					}

					setState(797);
					match(Final);
					}
					break;
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 524291L) != 0)) {
					{
					setState(800);
					accessModifier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(803);
						match(Final);
						}
					}

					setState(806);
					accessModifier();
					setState(807);
					match(Static);
					}
					break;
				case 2:
					{
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(809);
						match(Static);
						}
					}

					setState(812);
					accessModifier();
					setState(813);
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
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(819);
					match(Identifier);
					setState(820);
					match(T__61);
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(826);
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
			setState(828);
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
		"\u0004\u0001^\u033f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ea\b\u0006\n\u0006\f\u0006"+
		"\u00ed\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00f2\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f7\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u0103\b\t\n\t\f\t\u0106\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u010c\b\n\n\n\f\n\u010f\t\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0113\b\u000b\n\u000b\f\u000b\u0116\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u011d\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0124\b\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0128\b\u000e\n\u000e\f\u000e\u012b\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0131\b\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0135\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0139\b\u0011"+
		"\n\u0011\f\u0011\u013c\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0143\b\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0147\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u014f\b\u0014\n\u0014\f\u0014\u0152\t\u0014"+
		"\u0001\u0015\u0003\u0015\u0155\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u015b\b\u0015\n\u0015\f\u0015\u015e\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0165"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0169\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u016f\b\u0018\n\u0018"+
		"\f\u0018\u0172\t\u0018\u0003\u0018\u0174\b\u0018\u0001\u0018\u0003\u0018"+
		"\u0177\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u017f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u018c\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0197\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u019c\b\u001c\n\u001c\f\u001c\u019f\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01a4\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01b1\b\u001f\u0001 \u0001"+
		" \u0001 \u0003 \u01b6\b \u0001 \u0003 \u01b9\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01c3\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01c9\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d0"+
		"\b\"\u0001#\u0001#\u0001#\u0003#\u01d5\b#\u0001$\u0001$\u0003$\u01d9\b"+
		"$\u0001%\u0001%\u0003%\u01dd\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u01e4\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e9\b\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u01ef\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u01f5\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01fb\b\'\u0001\'"+
		"\u0003\'\u01fe\b\'\u0001(\u0001(\u0003(\u0202\b(\u0001(\u0001(\u0001("+
		"\u0003(\u0207\b(\u0001(\u0003(\u020a\b(\u0001)\u0001)\u0003)\u020e\b)"+
		"\u0001)\u0001)\u0001)\u0003)\u0213\b)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u021a\b)\u0001*\u0001*\u0003*\u021e\b*\u0001*\u0001*\u0001*\u0003"+
		"*\u0223\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u022e\b*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u0237\b,\u0001-\u0001-\u0003-\u023b\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0249\b.\u0001"+
		"/\u0001/\u0003/\u024d\b/\u00010\u00010\u00050\u0251\b0\n0\f0\u0254\t0"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00051\u025c\b1\n1\f1\u025f"+
		"\t1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u0003"+
		"6\u027e\b6\u00016\u00016\u00036\u0282\b6\u00016\u00016\u00036\u0286\b"+
		"6\u00017\u00017\u00017\u00017\u00017\u00017\u00057\u028e\b7\n7\f7\u0291"+
		"\t7\u00017\u00017\u00018\u00048\u0296\b8\u000b8\f8\u0297\u00018\u0003"+
		"8\u029b\b8\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u02a3\b9\u0001"+
		":\u0005:\u02a6\b:\n:\f:\u02a9\t:\u0001:\u0003:\u02ac\b:\u0001;\u0001;"+
		"\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0004=\u02b7\b=\u000b"+
		"=\f=\u02b8\u0001=\u0003=\u02bc\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0003A\u02ce\bA\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001C\u0001"+
		"C\u0003C\u02d8\bC\u0001D\u0001D\u0001D\u0003D\u02dd\bD\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u02e7\bE\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0003F\u02ef\bF\u0001G\u0001G\u0003G\u02f3\bG\u0001"+
		"G\u0001G\u0001G\u0001H\u0001H\u0001H\u0003H\u02fb\bH\u0001I\u0001I\u0001"+
		"J\u0003J\u0300\bJ\u0001J\u0001J\u0003J\u0304\bJ\u0001J\u0003J\u0307\b"+
		"J\u0001J\u0003J\u030a\bJ\u0001K\u0001K\u0003K\u030e\bK\u0001K\u0001K\u0003"+
		"K\u0312\bK\u0001K\u0003K\u0315\bK\u0001K\u0003K\u0318\bK\u0001K\u0001"+
		"K\u0003K\u031c\bK\u0001K\u0003K\u031f\bK\u0001K\u0003K\u0322\bK\u0001"+
		"K\u0003K\u0325\bK\u0001K\u0001K\u0001K\u0001K\u0003K\u032b\bK\u0001K\u0001"+
		"K\u0001K\u0003K\u0330\bK\u0003K\u0332\bK\u0001L\u0001L\u0005L\u0336\b"+
		"L\nL\fL\u0339\tL\u0001L\u0001L\u0001M\u0001M\u0001M\u0002\u0104\u010d"+
		"\u0000N\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u0000\u0003\u0001\u0000BM\u0001\u0000PQ\u0001\u0000SZ\u038f\u0000"+
		"\u009d\u0001\u0000\u0000\u0000\u0002\u00ad\u0001\u0000\u0000\u0000\u0004"+
		"\u00b1\u0001\u0000\u0000\u0000\u0006\u00be\u0001\u0000\u0000\u0000\b\u00c1"+
		"\u0001\u0000\u0000\u0000\n\u00d1\u0001\u0000\u0000\u0000\f\u00db\u0001"+
		"\u0000\u0000\u0000\u000e\u00f1\u0001\u0000\u0000\u0000\u0010\u00fb\u0001"+
		"\u0000\u0000\u0000\u0012\u00fe\u0001\u0000\u0000\u0000\u0014\u0107\u0001"+
		"\u0000\u0000\u0000\u0016\u0110\u0001\u0000\u0000\u0000\u0018\u011c\u0001"+
		"\u0000\u0000\u0000\u001a\u0123\u0001\u0000\u0000\u0000\u001c\u0125\u0001"+
		"\u0000\u0000\u0000\u001e\u0130\u0001\u0000\u0000\u0000 \u0134\u0001\u0000"+
		"\u0000\u0000\"\u0136\u0001\u0000\u0000\u0000$\u0142\u0001\u0000\u0000"+
		"\u0000&\u0144\u0001\u0000\u0000\u0000(\u0148\u0001\u0000\u0000\u0000*"+
		"\u0154\u0001\u0000\u0000\u0000,\u0161\u0001\u0000\u0000\u0000.\u0168\u0001"+
		"\u0000\u0000\u00000\u016a\u0001\u0000\u0000\u00002\u017e\u0001\u0000\u0000"+
		"\u00004\u018b\u0001\u0000\u0000\u00006\u0196\u0001\u0000\u0000\u00008"+
		"\u0198\u0001\u0000\u0000\u0000:\u01a0\u0001\u0000\u0000\u0000<\u01a8\u0001"+
		"\u0000\u0000\u0000>\u01ab\u0001\u0000\u0000\u0000@\u01b2\u0001\u0000\u0000"+
		"\u0000B\u01c8\u0001\u0000\u0000\u0000D\u01cf\u0001\u0000\u0000\u0000F"+
		"\u01d4\u0001\u0000\u0000\u0000H\u01d8\u0001\u0000\u0000\u0000J\u01dc\u0001"+
		"\u0000\u0000\u0000L\u01de\u0001\u0000\u0000\u0000N\u01fd\u0001\u0000\u0000"+
		"\u0000P\u0209\u0001\u0000\u0000\u0000R\u0219\u0001\u0000\u0000\u0000T"+
		"\u022d\u0001\u0000\u0000\u0000V\u022f\u0001\u0000\u0000\u0000X\u0236\u0001"+
		"\u0000\u0000\u0000Z\u023a\u0001\u0000\u0000\u0000\\\u0248\u0001\u0000"+
		"\u0000\u0000^\u024c\u0001\u0000\u0000\u0000`\u024e\u0001\u0000\u0000\u0000"+
		"b\u0257\u0001\u0000\u0000\u0000d\u0262\u0001\u0000\u0000\u0000f\u0268"+
		"\u0001\u0000\u0000\u0000h\u0270\u0001\u0000\u0000\u0000j\u0276\u0001\u0000"+
		"\u0000\u0000l\u027d\u0001\u0000\u0000\u0000n\u0287\u0001\u0000\u0000\u0000"+
		"p\u0295\u0001\u0000\u0000\u0000r\u02a2\u0001\u0000\u0000\u0000t\u02a7"+
		"\u0001\u0000\u0000\u0000v\u02ad\u0001\u0000\u0000\u0000x\u02b0\u0001\u0000"+
		"\u0000\u0000z\u02b3\u0001\u0000\u0000\u0000|\u02bd\u0001\u0000\u0000\u0000"+
		"~\u02c4\u0001\u0000\u0000\u0000\u0080\u02c7\u0001\u0000\u0000\u0000\u0082"+
		"\u02cd\u0001\u0000\u0000\u0000\u0084\u02d3\u0001\u0000\u0000\u0000\u0086"+
		"\u02d7\u0001\u0000\u0000\u0000\u0088\u02dc\u0001\u0000\u0000\u0000\u008a"+
		"\u02e6\u0001\u0000\u0000\u0000\u008c\u02ee\u0001\u0000\u0000\u0000\u008e"+
		"\u02f2\u0001\u0000\u0000\u0000\u0090\u02fa\u0001\u0000\u0000\u0000\u0092"+
		"\u02fc\u0001\u0000\u0000\u0000\u0094\u0309\u0001\u0000\u0000\u0000\u0096"+
		"\u0331\u0001\u0000\u0000\u0000\u0098\u0337\u0001\u0000\u0000\u0000\u009a"+
		"\u033c\u0001\u0000\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a2\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\u0004\u0002\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a7\u0003\u0006\u0003\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0000\u0000\u0001\u00ac"+
		"\u0001\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae"+
		"\u00af\u0003\u0098L\u0000\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u0003"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005\u0003\u0000\u0000\u00b2\u00b4"+
		"\u0005R\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003"+
		"\u0098L\u0000\u00b6\u00b8\u0005?\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u0005\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bf\u0003\b\u0004\u0000\u00bc\u00bf\u0003\n\u0005\u0000"+
		"\u00bd\u00bf\u0005\u0002\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u0007\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005O\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\u0092I\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c9"+
		"\u0005^\u0000\u0000\u00c8\u00ca\u0003\u0010\b\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cd\u0003\u0012\t\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0003\u0016\u000b\u0000\u00cf\t\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0005O\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0005\u0000\u0000\u00d4\u00d6\u0005^\u0000\u0000\u00d5"+
		"\u00d7\u0003\u0014\n\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0003\u001c\u000e\u0000\u00d9\u000b\u0001\u0000\u0000\u0000\u00da\u00dc"+
		"\u0003\u0090H\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00df\u0003"+
		"\u0094J\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u0086"+
		"C\u0000\u00e1\u00e2\u0005^\u0000\u0000\u00e2\u00e4\u0005\u0006\u0000\u0000"+
		"\u00e3\u00e5\u0003(\u0014\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00eb\u0005\u0007\u0000\u0000\u00e7\u00e8\u0005\b\u0000\u0000\u00e8\u00ea"+
		"\u0005\t\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0003\"\u0011\u0000\u00ef\r\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f2\u0003\u0090H\u0000\u00f1\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005^\u0000\u0000\u00f4\u00f6\u0005\u0006\u0000\u0000"+
		"\u00f5\u00f7\u0003(\u0014\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0007\u0000\u0000\u00f9\u00fa\u0003`0\u0000\u00fa\u000f\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0003\u0098"+
		"L\u0000\u00fd\u0011\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u000b\u0000"+
		"\u0000\u00ff\u0104\u0003\u0098L\u0000\u0100\u0101\u0005\f\u0000\u0000"+
		"\u0101\u0103\u0003\u0098L\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103"+
		"\u0106\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0013\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\n\u0000\u0000\u0108\u010d"+
		"\u0003\u0098L\u0000\u0109\u010a\u0005\f\u0000\u0000\u010a\u010c\u0003"+
		"\u0098L\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u0015\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u0114\u0005\r\u0000\u0000\u0111\u0113\u0003\u0018\f"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\u000e\u0000\u0000\u0118\u0017\u0001\u0000\u0000"+
		"\u0000\u0119\u011d\u0005\u0002\u0000\u0000\u011a\u011d\u0003`0\u0000\u011b"+
		"\u011d\u0003\u001a\r\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0019"+
		"\u0001\u0000\u0000\u0000\u011e\u0124\u0003\f\u0006\u0000\u011f\u0124\u0003"+
		"*\u0015\u0000\u0120\u0124\u0003\u000e\u0007\u0000\u0121\u0124\u0003\b"+
		"\u0004\u0000\u0122\u0124\u0003\n\u0005\u0000\u0123\u011e\u0001\u0000\u0000"+
		"\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u001b\u0001\u0000\u0000\u0000\u0125\u0129\u0005\r\u0000\u0000"+
		"\u0126\u0128\u0003\u001e\u000f\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u000e\u0000\u0000"+
		"\u012d\u001d\u0001\u0000\u0000\u0000\u012e\u0131\u0005\u0002\u0000\u0000"+
		"\u012f\u0131\u0003 \u0010\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u001f\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0003\f\u0006\u0000\u0133\u0135\u0003*\u0015\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135!\u0001"+
		"\u0000\u0000\u0000\u0136\u013a\u0005\r\u0000\u0000\u0137\u0139\u0003$"+
		"\u0012\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005\u000e\u0000\u0000\u013e#\u0001\u0000\u0000"+
		"\u0000\u013f\u0143\u0003\\.\u0000\u0140\u0143\u0003b1\u0000\u0141\u0143"+
		"\u0003&\u0013\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143%\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0005\u000f\u0000\u0000\u0145\u0147\u00032\u0019"+
		"\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\'\u0001\u0000\u0000\u0000\u0148\u0149\u0003\u0088D\u0000"+
		"\u0149\u0150\u0005^\u0000\u0000\u014a\u014b\u0005\f\u0000\u0000\u014b"+
		"\u014c\u0003\u0088D\u0000\u014c\u014d\u0005^\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014f\u0152\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151)\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0155\u0003\u0096K\u0000\u0154\u0153\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0003\u0088D\u0000\u0157\u015c\u0003,\u0016\u0000\u0158"+
		"\u0159\u0005\f\u0000\u0000\u0159\u015b\u0003,\u0016\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0005\u0002\u0000\u0000\u0160+\u0001\u0000\u0000\u0000\u0161\u0164\u0005"+
		"^\u0000\u0000\u0162\u0163\u0005B\u0000\u0000\u0163\u0165\u0003.\u0017"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165-\u0001\u0000\u0000\u0000\u0166\u0169\u00032\u0019\u0000\u0167"+
		"\u0169\u00030\u0018\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169/\u0001\u0000\u0000\u0000\u016a\u0173\u0005"+
		"\r\u0000\u0000\u016b\u0170\u0003.\u0017\u0000\u016c\u016d\u0005\f\u0000"+
		"\u0000\u016d\u016f\u0003.\u0017\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u016b\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u0005\f\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0005\u000e\u0000\u0000\u01791\u0001\u0000\u0000\u0000\u017a\u017f"+
		"\u0003B!\u0000\u017b\u017f\u0003N\'\u0000\u017c\u017f\u00034\u001a\u0000"+
		"\u017d\u017f\u0003@ \u0000\u017e\u017a\u0001\u0000\u0000\u0000\u017e\u017b"+
		"\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017d"+
		"\u0001\u0000\u0000\u0000\u017f3\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"\u0006\u0000\u0000\u0181\u0182\u00032\u0019\u0000\u0182\u0183\u0005\u0007"+
		"\u0000\u0000\u0183\u018c\u0001\u0000\u0000\u0000\u0184\u018c\u0005\u0010"+
		"\u0000\u0000\u0185\u018c\u0005\u0011\u0000\u0000\u0186\u018c\u0003\u009a"+
		"M\u0000\u0187\u018c\u0003\u0098L\u0000\u0188\u018c\u0005^\u0000\u0000"+
		"\u0189\u018c\u0003:\u001d\u0000\u018a\u018c\u0003<\u001e\u0000\u018b\u0180"+
		"\u0001\u0000\u0000\u0000\u018b\u0184\u0001\u0000\u0000\u0000\u018b\u0185"+
		"\u0001\u0000\u0000\u0000\u018b\u0186\u0001\u0000\u0000\u0000\u018b\u0187"+
		"\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b\u0189"+
		"\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c5\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0005\u0006\u0000\u0000\u018e\u018f\u0003"+
		"2\u0019\u0000\u018f\u0190\u0005\u0007\u0000\u0000\u0190\u0197\u0001\u0000"+
		"\u0000\u0000\u0191\u0197\u0005\u0010\u0000\u0000\u0192\u0197\u0005\u0011"+
		"\u0000\u0000\u0193\u0197\u0003\u0098L\u0000\u0194\u0197\u0005^\u0000\u0000"+
		"\u0195\u0197\u0003:\u001d\u0000\u0196\u018d\u0001\u0000\u0000\u0000\u0196"+
		"\u0191\u0001\u0000\u0000\u0000\u0196\u0192\u0001\u0000\u0000\u0000\u0196"+
		"\u0193\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0195\u0001\u0000\u0000\u0000\u01977\u0001\u0000\u0000\u0000\u0198\u019d"+
		"\u00032\u0019\u0000\u0199\u019a\u0005\f\u0000\u0000\u019a\u019c\u0003"+
		"2\u0019\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000"+
		"\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e9\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0003\u0098L\u0000\u01a1\u01a3\u0005\u0006\u0000\u0000"+
		"\u01a2\u01a4\u00038\u001c\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0005\u0007\u0000\u0000\u01a6\u01a7\u0005\u0002\u0000\u0000\u01a7"+
		";\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003>\u001f\u0000\u01a9\u01aa\u0005"+
		"\u0002\u0000\u0000\u01aa=\u0001\u0000\u0000\u0000\u01ab\u01b0\u00036\u001b"+
		"\u0000\u01ac\u01ad\u0005\b\u0000\u0000\u01ad\u01ae\u00032\u0019\u0000"+
		"\u01ae\u01af\u0005\t\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"?\u0001\u0000\u0000\u0000\u01b2\u01b5\u0005\u0012\u0000\u0000\u01b3\u01b6"+
		"\u0003\u0098L\u0000\u01b4\u01b6\u0003:\u001d\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0003\u0016\u000b\u0000\u01b8\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9A\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u00034\u001a\u0000\u01bb\u01bc\u0003F#\u0000\u01bc"+
		"\u01bd\u0003D\"\u0000\u01bd\u01c9\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0003D\"\u0000\u01bf\u01c2\u0003H$\u0000\u01c0\u01c3\u0003B!\u0000\u01c1"+
		"\u01c3\u00034\u001a\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c9\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0003\u0098L\u0000\u01c5\u01c6\u0003J%\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c9\u0003L&\u0000\u01c8\u01ba\u0001\u0000\u0000\u0000"+
		"\u01c8\u01be\u0001\u0000\u0000\u0000\u01c8\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9C\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u00034\u001a\u0000\u01cb\u01cc\u0003F#\u0000\u01cc\u01cd\u0003"+
		"D\"\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01d0\u00034\u001a"+
		"\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0E\u0001\u0000\u0000\u0000\u01d1\u01d5\u0005\u0013\u0000\u0000"+
		"\u01d2\u01d5\u0005\u0014\u0000\u0000\u01d3\u01d5\u0005\u0015\u0000\u0000"+
		"\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5G\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d9\u0005\u0016\u0000\u0000\u01d7\u01d9\u0005\u0017\u0000\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"I\u0001\u0000\u0000\u0000\u01da\u01dd\u0005\u0018\u0000\u0000\u01db\u01dd"+
		"\u0005\u0019\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01db"+
		"\u0001\u0000\u0000\u0000\u01ddK\u0001\u0000\u0000\u0000\u01de\u01df\u0005"+
		"\u0017\u0000\u0000\u01df\u01e0\u00032\u0019\u0000\u01e0M\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e4\u00034\u001a\u0000\u01e2\u01e4\u0003B!\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e8\u0003X,\u0000\u01e6\u01e9\u0003"+
		"4\u001a\u0000\u01e7\u01e9\u0003B!\u0000\u01e8\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01fe\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0003P(\u0000\u01eb\u01ee\u0003Z-\u0000\u01ec\u01ef"+
		"\u0003N\'\u0000\u01ed\u01ef\u00034\u001a\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef\u01fe\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0003R)\u0000\u01f1\u01f4\u0005@\u0000\u0000"+
		"\u01f2\u01f5\u0003N\'\u0000\u01f3\u01f5\u00034\u001a\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01fe"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0003T*\u0000\u01f7\u01fa\u0005A"+
		"\u0000\u0000\u01f8\u01fb\u0003N\'\u0000\u01f9\u01fb\u00034\u001a\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003V+\u0000\u01fd\u01e3"+
		"\u0001\u0000\u0000\u0000\u01fd\u01ea\u0001\u0000\u0000\u0000\u01fd\u01f0"+
		"\u0001\u0000\u0000\u0000\u01fd\u01f6\u0001\u0000\u0000\u0000\u01fd\u01fc"+
		"\u0001\u0000\u0000\u0000\u01feO\u0001\u0000\u0000\u0000\u01ff\u0202\u0003"+
		"4\u001a\u0000\u0200\u0202\u0003B!\u0000\u0201\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000"+
		"\u0000\u0203\u0206\u0003X,\u0000\u0204\u0207\u00034\u001a\u0000\u0205"+
		"\u0207\u0003B!\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0205\u0001"+
		"\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u020a\u0003"+
		"4\u001a\u0000\u0209\u0201\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000"+
		"\u0000\u0000\u020aQ\u0001\u0000\u0000\u0000\u020b\u020e\u00034\u001a\u0000"+
		"\u020c\u020e\u0003B!\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0212"+
		"\u0003X,\u0000\u0210\u0213\u00034\u001a\u0000\u0211\u0213\u0003B!\u0000"+
		"\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000"+
		"\u0213\u021a\u0001\u0000\u0000\u0000\u0214\u0215\u0003P(\u0000\u0215\u0216"+
		"\u0003Z-\u0000\u0216\u0217\u0003N\'\u0000\u0217\u021a\u0001\u0000\u0000"+
		"\u0000\u0218\u021a\u00034\u001a\u0000\u0219\u020d\u0001\u0000\u0000\u0000"+
		"\u0219\u0214\u0001\u0000\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u021aS\u0001\u0000\u0000\u0000\u021b\u021e\u00034\u001a\u0000\u021c\u021e"+
		"\u0003B!\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021c\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0222\u0003X,\u0000"+
		"\u0220\u0223\u00034\u001a\u0000\u0221\u0223\u0003B!\u0000\u0222\u0220"+
		"\u0001\u0000\u0000\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0223\u022e"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u0003P(\u0000\u0225\u0226\u0003Z"+
		"-\u0000\u0226\u0227\u0003N\'\u0000\u0227\u022e\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0003R)\u0000\u0229\u022a\u0005@\u0000\u0000\u022a\u022b"+
		"\u0003N\'\u0000\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022e\u0003"+
		"4\u001a\u0000\u022d\u021d\u0001\u0000\u0000\u0000\u022d\u0224\u0001\u0000"+
		"\u0000\u0000\u022d\u0228\u0001\u0000\u0000\u0000\u022d\u022c\u0001\u0000"+
		"\u0000\u0000\u022eU\u0001\u0000\u0000\u0000\u022f\u0230\u0005\u001a\u0000"+
		"\u0000\u0230\u0231\u00032\u0019\u0000\u0231W\u0001\u0000\u0000\u0000\u0232"+
		"\u0237\u0005\u001b\u0000\u0000\u0233\u0237\u0005\u001c\u0000\u0000\u0234"+
		"\u0237\u0005\u001d\u0000\u0000\u0235\u0237\u0005\u001e\u0000\u0000\u0236"+
		"\u0232\u0001\u0000\u0000\u0000\u0236\u0233\u0001\u0000\u0000\u0000\u0236"+
		"\u0234\u0001\u0000\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237"+
		"Y\u0001\u0000\u0000\u0000\u0238\u023b\u0005\u001f\u0000\u0000\u0239\u023b"+
		"\u0005 \u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u0239\u0001"+
		"\u0000\u0000\u0000\u023b[\u0001\u0000\u0000\u0000\u023c\u0249\u0003`0"+
		"\u0000\u023d\u0249\u0003\u0082A\u0000\u023e\u0249\u0003:\u001d\u0000\u023f"+
		"\u0249\u0003d2\u0000\u0240\u0249\u0003f3\u0000\u0241\u0249\u0003h4\u0000"+
		"\u0242\u0249\u0003j5\u0000\u0243\u0249\u0003n7\u0000\u0244\u0249\u0003"+
		"v;\u0000\u0245\u0249\u0003x<\u0000\u0246\u0249\u0003z=\u0000\u0247\u0249"+
		"\u0003\u0080@\u0000\u0248\u023c\u0001\u0000\u0000\u0000\u0248\u023d\u0001"+
		"\u0000\u0000\u0000\u0248\u023e\u0001\u0000\u0000\u0000\u0248\u023f\u0001"+
		"\u0000\u0000\u0000\u0248\u0240\u0001\u0000\u0000\u0000\u0248\u0241\u0001"+
		"\u0000\u0000\u0000\u0248\u0242\u0001\u0000\u0000\u0000\u0248\u0243\u0001"+
		"\u0000\u0000\u0000\u0248\u0244\u0001\u0000\u0000\u0000\u0248\u0245\u0001"+
		"\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001"+
		"\u0000\u0000\u0000\u0249]\u0001\u0000\u0000\u0000\u024a\u024d\u0003b1"+
		"\u0000\u024b\u024d\u0003\\.\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024d_\u0001\u0000\u0000\u0000\u024e"+
		"\u0252\u0005\r\u0000\u0000\u024f\u0251\u0003^/\u0000\u0250\u024f\u0001"+
		"\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256\u0005"+
		"\u000e\u0000\u0000\u0256a\u0001\u0000\u0000\u0000\u0257\u0258\u0003\u0088"+
		"D\u0000\u0258\u025d\u0003,\u0016\u0000\u0259\u025a\u0005\f\u0000\u0000"+
		"\u025a\u025c\u0003,\u0016\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c"+
		"\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001\u0000\u0000\u0000\u025f"+
		"\u025d\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0002\u0000\u0000\u0261"+
		"c\u0001\u0000\u0000\u0000\u0262\u0263\u0005!\u0000\u0000\u0263\u0264\u0005"+
		"\u0006\u0000\u0000\u0264\u0265\u00032\u0019\u0000\u0265\u0266\u0005\u0007"+
		"\u0000\u0000\u0266\u0267\u0003\\.\u0000\u0267e\u0001\u0000\u0000\u0000"+
		"\u0268\u0269\u0005!\u0000\u0000\u0269\u026a\u0005\u0006\u0000\u0000\u026a"+
		"\u026b\u00032\u0019\u0000\u026b\u026c\u0005\u0007\u0000\u0000\u026c\u026d"+
		"\u0003\\.\u0000\u026d\u026e\u0005\"\u0000\u0000\u026e\u026f\u0003\\.\u0000"+
		"\u026fg\u0001\u0000\u0000\u0000\u0270\u0271\u0005#\u0000\u0000\u0271\u0272"+
		"\u0005\u0006\u0000\u0000\u0272\u0273\u00032\u0019\u0000\u0273\u0274\u0005"+
		"\u0007\u0000\u0000\u0274\u0275\u0003\\.\u0000\u0275i\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0005$\u0000\u0000\u0277\u0278\u0005\u0006\u0000\u0000"+
		"\u0278\u0279\u0003l6\u0000\u0279\u027a\u0005\u0007\u0000\u0000\u027a\u027b"+
		"\u0003\\.\u0000\u027bk\u0001\u0000\u0000\u0000\u027c\u027e\u0003b1\u0000"+
		"\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0005\u0002\u0000\u0000"+
		"\u0280\u0282\u0003N\'\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283"+
		"\u0285\u0005\u0002\u0000\u0000\u0284\u0286\u0003B!\u0000\u0285\u0284\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286m\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0005%\u0000\u0000\u0288\u0289\u0005\u0006\u0000"+
		"\u0000\u0289\u028a\u00032\u0019\u0000\u028a\u028b\u0005\u0007\u0000\u0000"+
		"\u028b\u028f\u0005\r\u0000\u0000\u028c\u028e\u0003p8\u0000\u028d\u028c"+
		"\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292"+
		"\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0005\u000e\u0000\u0000\u0293o\u0001\u0000\u0000\u0000\u0294\u0296\u0003"+
		"r9\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299\u029b\u0003t:\u0000\u029a"+
		"\u0299\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b"+
		"q\u0001\u0000\u0000\u0000\u029c\u029d\u0005&\u0000\u0000\u029d\u029e\u0003"+
		"2\u0019\u0000\u029e\u029f\u0005\'\u0000\u0000\u029f\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a1\u0005(\u0000\u0000\u02a1\u02a3\u0005\'\u0000"+
		"\u0000\u02a2\u029c\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a3s\u0001\u0000\u0000\u0000\u02a4\u02a6\u0003\\.\u0000\u02a5"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8"+
		"\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ac\u0003v;\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001"+
		"\u0000\u0000\u0000\u02acu\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005)\u0000"+
		"\u0000\u02ae\u02af\u0005\u0002\u0000\u0000\u02afw\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005*\u0000\u0000\u02b1\u02b2\u0005\u0002\u0000\u0000\u02b2"+
		"y\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005+\u0000\u0000\u02b4\u02b6\u0003"+
		"`0\u0000\u02b5\u02b7\u0003|>\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bc\u0003~?\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bc{\u0001\u0000\u0000\u0000\u02bd\u02be\u0005"+
		",\u0000\u0000\u02be\u02bf\u0005\u0006\u0000\u0000\u02bf\u02c0\u0003\u0088"+
		"D\u0000\u02c0\u02c1\u0005^\u0000\u0000\u02c1\u02c2\u0005\u0007\u0000\u0000"+
		"\u02c2\u02c3\u0003`0\u0000\u02c3}\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0005-\u0000\u0000\u02c5\u02c6\u0003`0\u0000\u02c6\u007f\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u0005.\u0000\u0000\u02c8\u02c9\u00032\u0019\u0000"+
		"\u02c9\u02ca\u0005\u0002\u0000\u0000\u02ca\u0081\u0001\u0000\u0000\u0000"+
		"\u02cb\u02ce\u00034\u001a\u0000\u02cc\u02ce\u0003>\u001f\u0000\u02cd\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d0\u0003\u0084B\u0000\u02d0\u02d1\u0003"+
		"2\u0019\u0000\u02d1\u02d2\u0005\u0002\u0000\u0000\u02d2\u0083\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0007\u0000\u0000\u0000\u02d4\u0085\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d8\u0003\u0088D\u0000\u02d6\u02d8\u0005N\u0000\u0000"+
		"\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d8\u0087\u0001\u0000\u0000\u0000\u02d9\u02dd\u0003\u008aE\u0000\u02da"+
		"\u02dd\u0003\u008cF\u0000\u02db\u02dd\u0003\u008eG\u0000\u02dc\u02d9\u0001"+
		"\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02db\u0001"+
		"\u0000\u0000\u0000\u02dd\u0089\u0001\u0000\u0000\u0000\u02de\u02e7\u0005"+
		"/\u0000\u0000\u02df\u02e7\u00050\u0000\u0000\u02e0\u02e7\u00051\u0000"+
		"\u0000\u02e1\u02e7\u00052\u0000\u0000\u02e2\u02e7\u00053\u0000\u0000\u02e3"+
		"\u02e7\u00054\u0000\u0000\u02e4\u02e7\u00055\u0000\u0000\u02e5\u02e7\u0005"+
		"^\u0000\u0000\u02e6\u02de\u0001\u0000\u0000\u0000\u02e6\u02df\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e0\u0001\u0000\u0000\u0000\u02e6\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e2\u0001\u0000\u0000\u0000\u02e6\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e7\u008b\u0001\u0000\u0000\u0000\u02e8\u02ef\u00056\u0000"+
		"\u0000\u02e9\u02ef\u00057\u0000\u0000\u02ea\u02ef\u00058\u0000\u0000\u02eb"+
		"\u02ef\u00059\u0000\u0000\u02ec\u02ef\u0005:\u0000\u0000\u02ed\u02ef\u0005"+
		";\u0000\u0000\u02ee\u02e8\u0001\u0000\u0000\u0000\u02ee\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ea\u0001\u0000\u0000\u0000\u02ee\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ef\u008d\u0001\u0000\u0000\u0000\u02f0\u02f3\u0003\u008c"+
		"F\u0000\u02f1\u02f3\u0003\u008aE\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f5\u0005\b\u0000\u0000\u02f5\u02f6\u0005\t\u0000\u0000\u02f6"+
		"\u008f\u0001\u0000\u0000\u0000\u02f7\u02fb\u0005O\u0000\u0000\u02f8\u02fb"+
		"\u0005<\u0000\u0000\u02f9\u02fb\u0005=\u0000\u0000\u02fa\u02f7\u0001\u0000"+
		"\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fb\u0091\u0001\u0000\u0000\u0000\u02fc\u02fd\u0007\u0001"+
		"\u0000\u0000\u02fd\u0093\u0001\u0000\u0000\u0000\u02fe\u0300\u0005Q\u0000"+
		"\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0307\u0005R\u0000\u0000"+
		"\u0302\u0304\u0005R\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305"+
		"\u0307\u0005Q\u0000\u0000\u0306\u02ff\u0001\u0000\u0000\u0000\u0306\u0303"+
		"\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u030a"+
		"\u0005P\u0000\u0000\u0309\u0306\u0001\u0000\u0000\u0000\u0309\u0308\u0001"+
		"\u0000\u0000\u0000\u030a\u0095\u0001\u0000\u0000\u0000\u030b\u0314\u0003"+
		"\u0090H\u0000\u030c\u030e\u0005Q\u0000\u0000\u030d\u030c\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000"+
		"\u0000\u030f\u0315\u0005R\u0000\u0000\u0310\u0312\u0005R\u0000\u0000\u0311"+
		"\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u0001\u0000\u0000\u0000\u0313\u0315\u0005Q\u0000\u0000\u0314\u030d"+
		"\u0001\u0000\u0000\u0000\u0314\u0311\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0001\u0000\u0000\u0000\u0315\u0332\u0001\u0000\u0000\u0000\u0316\u0318"+
		"\u0005Q\u0000\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0317\u0318\u0001"+
		"\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031f\u0005"+
		"R\u0000\u0000\u031a\u031c\u0005R\u0000\u0000\u031b\u031a\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u031f\u0005Q\u0000\u0000\u031e\u0317\u0001\u0000\u0000\u0000"+
		"\u031e\u031b\u0001\u0000\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000"+
		"\u0320\u0322\u0003\u0090H\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0001\u0000\u0000\u0000\u0322\u0332\u0001\u0000\u0000\u0000\u0323"+
		"\u0325\u0005Q\u0000\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0324\u0325"+
		"\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0327"+
		"\u0003\u0090H\u0000\u0327\u0328\u0005R\u0000\u0000\u0328\u0330\u0001\u0000"+
		"\u0000\u0000\u0329\u032b\u0005R\u0000\u0000\u032a\u0329\u0001\u0000\u0000"+
		"\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000"+
		"\u0000\u032c\u032d\u0003\u0090H\u0000\u032d\u032e\u0005Q\u0000\u0000\u032e"+
		"\u0330\u0001\u0000\u0000\u0000\u032f\u0324\u0001\u0000\u0000\u0000\u032f"+
		"\u032a\u0001\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000\u0000\u0331"+
		"\u030b\u0001\u0000\u0000\u0000\u0331\u031e\u0001\u0000\u0000\u0000\u0331"+
		"\u032f\u0001\u0000\u0000\u0000\u0332\u0097\u0001\u0000\u0000\u0000\u0333"+
		"\u0334\u0005^\u0000\u0000\u0334\u0336\u0005>\u0000\u0000\u0335\u0333\u0001"+
		"\u0000\u0000\u0000\u0336\u0339\u0001\u0000\u0000\u0000\u0337\u0335\u0001"+
		"\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u033a\u0001"+
		"\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u033a\u033b\u0005"+
		"^\u0000\u0000\u033b\u0099\u0001\u0000\u0000\u0000\u033c\u033d\u0007\u0002"+
		"\u0000\u0000\u033d\u009b\u0001\u0000\u0000\u0000j\u009d\u00a2\u00a8\u00b3"+
		"\u00b7\u00be\u00c1\u00c4\u00c9\u00cc\u00d1\u00d6\u00db\u00de\u00e4\u00eb"+
		"\u00f1\u00f6\u0104\u010d\u0114\u011c\u0123\u0129\u0130\u0134\u013a\u0142"+
		"\u0146\u0150\u0154\u015c\u0164\u0168\u0170\u0173\u0176\u017e\u018b\u0196"+
		"\u019d\u01a3\u01b0\u01b5\u01b8\u01c2\u01c8\u01cf\u01d4\u01d8\u01dc\u01e3"+
		"\u01e8\u01ee\u01f4\u01fa\u01fd\u0201\u0206\u0209\u020d\u0212\u0219\u021d"+
		"\u0222\u022d\u0236\u023a\u0248\u024c\u0252\u025d\u027d\u0281\u0285\u028f"+
		"\u0297\u029a\u02a2\u02a7\u02ab\u02b8\u02bb\u02cd\u02d7\u02dc\u02e6\u02ee"+
		"\u02f2\u02fa\u02ff\u0303\u0306\u0309\u030d\u0311\u0314\u0317\u031b\u031e"+
		"\u0321\u0324\u032a\u032f\u0331\u0337";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}