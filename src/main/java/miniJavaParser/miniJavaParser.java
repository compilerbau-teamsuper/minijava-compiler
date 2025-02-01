// Generated from C:/Git/minijava-compiler/src/main/java/miniJavaParser/miniJava.g4 by ANTLR 4.13.2
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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, Wildcard=65, AND=66, 
		OR=67, ASSIGN=68, ADD_ASSIGN=69, SUB_ASSIGN=70, MUL_ASSIGN=71, DIV_ASSIGN=72, 
		AND_ASSIGN=73, OR_ASSIGN=74, XOR_ASSIGN=75, MOD_ASSIGN=76, LSHIFT_ASSIGN=77, 
		RSHIFT_ASSIGN=78, URSHIFT_ASSIGN=79, VoidType=80, Public=81, Abstract=82, 
		Final=83, Static=84, Identifier=85, BooleanLiteral=86, IntegerLiteral=87, 
		LongLiteral=88, NullLiteral=89, FloatingPointLiteral=90, DoubleLiteral=91, 
		CharacterLiteral=92, StringLiteral=93, WS=94, COMMENT=95, LINE_COMMENT=96;
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
		RULE_forControl = 54, RULE_forControlStatement = 55, RULE_forInit = 56, 
		RULE_forControlStatementList = 57, RULE_switch = 58, RULE_switchBlockStatementGroup = 59, 
		RULE_switchLabel = 60, RULE_switchBlock = 61, RULE_break = 62, RULE_continue = 63, 
		RULE_tryStatement = 64, RULE_catchClause = 65, RULE_finallyClause = 66, 
		RULE_throwStatement = 67, RULE_assignment = 68, RULE_assignmentType = 69, 
		RULE_typeOrVoid = 70, RULE_type = 71, RULE_objectType = 72, RULE_primitiveType = 73, 
		RULE_arrayType = 74, RULE_accessModifier = 75, RULE_classModifier = 76, 
		RULE_methodModifier = 77, RULE_fieldModifier = 78, RULE_qualifiedName = 79, 
		RULE_literal = 80;
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
			"whileStatement", "forStatement", "forControl", "forControlStatement", 
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
			"'-'", "'++'", "'--'", "'!'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", 
			"'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", 
			"'break'", "'continue'", "'try'", "'catch'", "'finally'", "'throw'", 
			"'String'", "'Byte'", "'Short'", "'Integer'", "'Float'", "'Double'", 
			"'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'float'", 
			"'double'", "'boolean'", "'char'", "'private'", "'protected'", "'.'", 
			null, "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'void'", "'public'", 
			"'abstract'", "'final'", "'static'", null, null, null, null, "'null'"
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
			null, null, null, null, null, "Wildcard", "AND", "OR", "ASSIGN", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"VoidType", "Public", "Abstract", "Final", "Static", "Identifier", "BooleanLiteral", 
			"IntegerLiteral", "LongLiteral", "NullLiteral", "FloatingPointLiteral", 
			"DoubleLiteral", "CharacterLiteral", "StringLiteral", "WS", "COMMENT", 
			"LINE_COMMENT"
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(162);
				packageDeclaration();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(165);
				importDeclaration();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 7L) != 0)) {
				{
				{
				setState(171);
				typeDeclaration();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
			setState(179);
			match(T__0);
			setState(180);
			qualifiedName();
			setState(181);
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
			setState(183);
			match(T__2);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(184);
				match(Static);
				}
			}

			setState(187);
			qualifiedName();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Wildcard) {
				{
				setState(188);
				match(Wildcard);
				}
			}

			setState(191);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
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
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(198);
				match(Public);
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(201);
				classModifier();
				}
			}

			setState(204);
			match(T__3);
			setState(205);
			match(Identifier);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(206);
				superclass();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(209);
				superinterfaces();
				}
			}

			setState(212);
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
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(214);
				match(Public);
				}
			}

			setState(217);
			match(T__4);
			setState(218);
			match(Identifier);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(219);
				extendsInterfaces();
				}
			}

			setState(222);
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
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 524291L) != 0)) {
				{
				setState(224);
				accessModifier();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 7L) != 0)) {
				{
				setState(227);
				methodModifier();
				}
			}

			setState(230);
			typeOrVoid();
			setState(231);
			match(Identifier);
			setState(232);
			match(T__5);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 274877939711L) != 0)) {
				{
				setState(233);
				formalParameters();
				}
			}

			setState(236);
			match(T__6);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(237);
				match(T__7);
				setState(238);
				match(T__8);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 524291L) != 0)) {
				{
				setState(246);
				accessModifier();
				}
			}

			setState(249);
			match(Identifier);
			setState(250);
			match(T__5);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 274877939711L) != 0)) {
				{
				setState(251);
				formalParameters();
				}
			}

			setState(254);
			match(T__6);
			setState(255);
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
			setState(257);
			match(T__9);
			setState(258);
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
			setState(260);
			match(T__10);
			setState(261);
			qualifiedName();
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(262);
					match(T__11);
					setState(263);
					qualifiedName();
					}
					} 
				}
				setState(268);
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
			setState(269);
			match(T__9);
			setState(270);
			qualifiedName();
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(271);
					match(T__11);
					setState(272);
					qualifiedName();
					}
					} 
				}
				setState(277);
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
			setState(278);
			match(T__12);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -140737488347084L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 63L) != 0)) {
				{
				{
				setState(279);
				classBodyDeclaration();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
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
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__1);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
			case T__61:
			case T__62:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
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
			setState(299);
			match(T__12);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -140737488355324L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 63L) != 0)) {
				{
				{
				setState(300);
				interfaceBodyDeclaration();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
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
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
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
			case T__61:
			case T__62:
			case VoidType:
			case Public:
			case Abstract:
			case Final:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
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
			setState(316);
			match(T__12);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611631291954339904L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				{
				setState(317);
				methodBodyStatement();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				localVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
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
			setState(330);
			match(T__14);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(331);
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
			setState(334);
			type();
			setState(335);
			match(Identifier);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(336);
				match(T__11);
				setState(337);
				type();
				setState(338);
				match(Identifier);
				}
				}
				setState(344);
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
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 6815747L) != 0)) {
				{
				setState(345);
				fieldModifier();
				}
			}

			setState(348);
			type();
			setState(349);
			variableDeclarator();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(350);
				match(T__11);
				setState(351);
				variableDeclarator();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
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
			setState(359);
			match(Identifier);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(360);
				match(ASSIGN);
				setState(361);
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
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__15:
			case T__16:
			case T__17:
			case T__22:
			case T__25:
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
				setState(364);
				expression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
			setState(368);
			match(T__12);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75964480L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				setState(369);
				variableInitializer();
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						match(T__11);
						setState(371);
						variableInitializer();
						}
						} 
					}
					setState(376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(379);
				match(T__11);
				}
			}

			setState(382);
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
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				calcFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
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
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T__5);
				setState(391);
				expression();
				setState(392);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				qualifiedName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				match(Identifier);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(400);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__5);
				setState(404);
				expression();
				setState(405);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				qualifiedName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
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
			setState(414);
			expression();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(415);
				match(T__11);
				setState(416);
				expression();
				}
				}
				setState(421);
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
			setState(422);
			qualifiedName();
			setState(423);
			match(T__5);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75956288L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				setState(424);
				expressionList();
				}
			}

			setState(427);
			match(T__6);
			setState(428);
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
			setState(430);
			arrayAccess();
			setState(431);
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
			setState(433);
			primary();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(434);
				match(T__7);
				setState(435);
				expression();
				setState(436);
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
			setState(440);
			match(T__17);
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(441);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(442);
				methodCall();
				}
				break;
			}
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(445);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				value();
				setState(449);
				calcBinOpHigher();
				setState(450);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				term();
				setState(453);
				calcBinOpLower();
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(454);
					calcFunction();
					}
					break;
				case 2:
					{
					setState(455);
					value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				qualifiedName();
				setState(459);
				calcUnOp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
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
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				value();
				setState(465);
				calcBinOpHigher();
				setState(466);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
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
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new MULContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new DIVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new MODContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
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
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
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
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new INCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new DECContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
			setState(484);
			match(T__22);
			setState(485);
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
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(487);
					value();
					}
					break;
				case 2:
					{
					setState(488);
					calcFunction();
					}
					break;
				}
				setState(491);
				booleanNumberOp();
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(492);
					value();
					}
					break;
				case 2:
					{
					setState(493);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				booleanFunHigh();
				setState(497);
				booleanOp();
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				booleanFunMiddle();
				setState(503);
				match(AND);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				booleanFunLow();
				setState(509);
				match(OR);
				setState(512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(510);
					booleanFunction();
					}
					break;
				case 2:
					{
					setState(511);
					value();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
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
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(517);
					value();
					}
					break;
				case 2:
					{
					setState(518);
					calcFunction();
					}
					break;
				}
				setState(521);
				booleanNumberOp();
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(522);
					value();
					}
					break;
				case 2:
					{
					setState(523);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
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
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(529);
					value();
					}
					break;
				case 2:
					{
					setState(530);
					calcFunction();
					}
					break;
				}
				setState(533);
				booleanNumberOp();
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(534);
					value();
					}
					break;
				case 2:
					{
					setState(535);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				booleanFunHigh();
				setState(539);
				booleanOp();
				setState(540);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
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
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(545);
					value();
					}
					break;
				case 2:
					{
					setState(546);
					calcFunction();
					}
					break;
				}
				setState(549);
				booleanNumberOp();
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(550);
					value();
					}
					break;
				case 2:
					{
					setState(551);
					calcFunction();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				booleanFunHigh();
				setState(555);
				booleanOp();
				setState(556);
				booleanFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				booleanFunMiddle();
				setState(559);
				match(AND);
				setState(560);
				booleanFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
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
			setState(565);
			match(T__25);
			setState(566);
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
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new GTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new LTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new LEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new GEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
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
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new EQUALContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new NOTEQUALContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
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
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				ifThen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				ifThenElse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(583);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(584);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(585);
				switch_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(586);
				break_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(587);
				continue_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(588);
				tryStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(589);
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
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
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
			setState(596);
			match(T__12);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611631291954307136L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				{
				setState(597);
				blockStatement();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
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
			setState(605);
			type();
			setState(606);
			variableDeclarator();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(607);
				match(T__11);
				setState(608);
				variableDeclarator();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
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
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			setState(622);
			match(T__32);
			setState(623);
			match(T__5);
			setState(624);
			expression();
			setState(625);
			match(T__6);
			setState(626);
			statement();
			setState(627);
			match(T__33);
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
			setState(630);
			match(T__34);
			setState(631);
			match(T__5);
			setState(632);
			expression();
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
			setState(636);
			match(T__35);
			setState(637);
			match(T__5);
			setState(638);
			forControl();
			setState(639);
			match(T__6);
			setState(640);
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
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611545280939229248L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				setState(642);
				forInit();
				}
			}

			setState(645);
			match(T__1);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75956288L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				setState(646);
				expression();
				}
			}

			setState(649);
			match(T__1);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196672L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 511L) != 0)) {
				{
				setState(650);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitForControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlStatementContext forControlStatement() throws RecognitionException {
		ForControlStatementContext _localctx = new ForControlStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forControlStatement);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forInit);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitForControlStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlStatementListContext forControlStatementList() throws RecognitionException {
		ForControlStatementListContext _localctx = new ForControlStatementListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forControlStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			forControlStatement();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(662);
				match(T__11);
				setState(663);
				forControlStatement();
				}
				}
				setState(668);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T__36);
			setState(670);
			match(T__5);
			setState(671);
			expression();
			setState(672);
			match(T__6);
			setState(673);
			match(T__12);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37 || _la==T__39) {
				{
				{
				setState(674);
				switchBlockStatementGroup();
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(680);
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
		enterRule(_localctx, 118, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(682);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(685); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(687);
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
		enterRule(_localctx, 120, RULE_switchLabel);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(T__37);
				setState(691);
				expression();
				setState(692);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(T__39);
				setState(695);
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
		enterRule(_localctx, 122, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(698);
					statement();
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(704);
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
		enterRule(_localctx, 124, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__40);
			setState(708);
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
		enterRule(_localctx, 126, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(T__41);
			setState(711);
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
		enterRule(_localctx, 128, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T__42);
			setState(714);
			block();
			setState(716); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(715);
				catchClause();
				}
				}
				setState(718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__43 );
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(720);
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
		enterRule(_localctx, 130, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__43);
			setState(724);
			match(T__5);
			setState(725);
			type();
			setState(726);
			match(Identifier);
			setState(727);
			match(T__6);
			setState(728);
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
		enterRule(_localctx, 132, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T__44);
			setState(731);
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
		enterRule(_localctx, 134, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(T__45);
			setState(734);
			expression();
			setState(735);
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
		enterRule(_localctx, 136, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(737);
				value();
				}
				break;
			case 2:
				{
				setState(738);
				arrayAccess();
				}
				break;
			}
			setState(741);
			assignmentType();
			setState(742);
			expression();
			setState(743);
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
		enterRule(_localctx, 138, RULE_assignmentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4095L) != 0)) ) {
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
		enterRule(_localctx, 140, RULE_typeOrVoid);
		try {
			setState(749);
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
			case T__59:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
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
		enterRule(_localctx, 142, RULE_type);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				objectType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitByteObject(this);
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
		enterRule(_localctx, 144, RULE_objectType);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				_localctx = new StringObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(T__46);
				}
				break;
			case T__47:
				_localctx = new ByteObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(T__47);
				}
				break;
			case T__48:
				_localctx = new ShortObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new IntegerObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new FloatObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new DoubleObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new BooleanObjectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(762);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new CharacterObjectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(763);
				match(T__53);
				}
				break;
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(764);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitByteType(this);
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
		enterRule(_localctx, 146, RULE_primitiveType);
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				_localctx = new ByteTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new ShortTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				match(T__57);
				}
				break;
			case T__58:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
				match(T__58);
				}
				break;
			case T__59:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(772);
				match(T__59);
				}
				break;
			case T__60:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(773);
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
		enterRule(_localctx, 148, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				{
				setState(776);
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
			case T__53:
			case Identifier:
				{
				setState(777);
				objectType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(780);
			match(T__7);
			setState(781);
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
		enterRule(_localctx, 150, RULE_accessModifier);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(Public);
				}
				break;
			case T__61:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new ProtectedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				match(T__62);
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
		enterRule(_localctx, 152, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
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
		enterRule(_localctx, 154, RULE_methodModifier);
		int _la;
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Final:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
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
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
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
		enterRule(_localctx, 156, RULE_fieldModifier);
		int _la;
		try {
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				accessModifier();
				setState(812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(804);
						match(Final);
						}
					}

					setState(807);
					match(Static);
					}
					break;
				case 2:
					{
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(808);
						match(Static);
						}
					}

					setState(811);
					match(Final);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(814);
						match(Final);
						}
					}

					setState(817);
					match(Static);
					}
					break;
				case 2:
					{
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(818);
						match(Static);
						}
					}

					setState(821);
					match(Final);
					}
					break;
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 524291L) != 0)) {
					{
					setState(824);
					accessModifier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(827);
						match(Final);
						}
					}

					setState(830);
					accessModifier();
					setState(831);
					match(Static);
					}
					break;
				case 2:
					{
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Static) {
						{
						setState(833);
						match(Static);
						}
					}

					setState(836);
					accessModifier();
					setState(837);
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
		enterRule(_localctx, 158, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(843);
					match(Identifier);
					setState(844);
					match(T__63);
					}
					} 
				}
				setState(849);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(850);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 255L) != 0)) ) {
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
		"\u0004\u0001`\u0357\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0001\u0000\u0003\u0000\u00a4\b\u0000\u0001\u0000\u0005\u0000"+
		"\u00a7\b\u0000\n\u0000\f\u0000\u00aa\t\u0000\u0001\u0000\u0005\u0000\u00ad"+
		"\b\u0000\n\u0000\f\u0000\u00b0\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00ba\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00be\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c5"+
		"\b\u0003\u0001\u0004\u0003\u0004\u00c8\b\u0004\u0001\u0004\u0003\u0004"+
		"\u00cb\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d0\b"+
		"\u0004\u0001\u0004\u0003\u0004\u00d3\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0003\u0005\u00d8\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00dd\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00e2"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00eb\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00f0\b\u0006\n\u0006\f\u0006\u00f3\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00f8\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00fd\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u0109\b\t\n\t\f\t\u010c\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0112"+
		"\b\n\n\n\f\n\u0115\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u0119\b\u000b"+
		"\n\u000b\f\u000b\u011c\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0123\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u012a\b\r\u0001\u000e\u0001\u000e\u0005\u000e\u012e\b\u000e\n\u000e"+
		"\f\u000e\u0131\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0137\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u013b\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u013f\b\u0011\n\u0011\f\u0011"+
		"\u0142\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0149\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u014d\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0155\b\u0014\n\u0014\f\u0014\u0158\t\u0014\u0001\u0015"+
		"\u0003\u0015\u015b\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0161\b\u0015\n\u0015\f\u0015\u0164\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u016b\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u016f\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0175\b\u0018\n\u0018\f\u0018\u0178\t\u0018"+
		"\u0003\u0018\u017a\b\u0018\u0001\u0018\u0003\u0018\u017d\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0185\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0192\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u019d\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01a2"+
		"\b\u001c\n\u001c\f\u001c\u01a5\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01aa\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01b7\b\u001f\u0001 \u0001 \u0001 \u0003 \u01bc"+
		"\b \u0001 \u0003 \u01bf\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01c9\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u01cf\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d6\b\"\u0001#\u0001#\u0001"+
		"#\u0003#\u01db\b#\u0001$\u0001$\u0003$\u01df\b$\u0001%\u0001%\u0003%\u01e3"+
		"\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u01ea\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u01ef\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01f5"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01fb\b\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u0201\b\'\u0001\'\u0003\'\u0204\b\'\u0001(\u0001"+
		"(\u0003(\u0208\b(\u0001(\u0001(\u0001(\u0003(\u020d\b(\u0001(\u0003(\u0210"+
		"\b(\u0001)\u0001)\u0003)\u0214\b)\u0001)\u0001)\u0001)\u0003)\u0219\b"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0220\b)\u0001*\u0001*\u0003"+
		"*\u0224\b*\u0001*\u0001*\u0001*\u0003*\u0229\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0234\b*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0003,\u023d\b,\u0001-\u0001-\u0003-\u0241"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u024f\b.\u0001/\u0001/\u0003/\u0253\b/\u00010\u0001"+
		"0\u00050\u0257\b0\n0\f0\u025a\t0\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00051\u0262\b1\n1\f1\u0265\t1\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00016\u00036\u0284\b6\u00016\u00016\u00036\u0288\b6\u0001"+
		"6\u00016\u00036\u028c\b6\u00017\u00017\u00037\u0290\b7\u00018\u00018\u0003"+
		"8\u0294\b8\u00019\u00019\u00019\u00059\u0299\b9\n9\f9\u029c\t9\u0001:"+
		"\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u02a4\b:\n:\f:\u02a7\t:\u0001"+
		":\u0001:\u0001;\u0004;\u02ac\b;\u000b;\f;\u02ad\u0001;\u0003;\u02b1\b"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u02b9\b<\u0001=\u0005"+
		"=\u02bc\b=\n=\f=\u02bf\t=\u0001=\u0003=\u02c2\b=\u0001>\u0001>\u0001>"+
		"\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0004@\u02cd\b@\u000b@\f@\u02ce"+
		"\u0001@\u0003@\u02d2\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0003"+
		"D\u02e4\bD\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0003"+
		"F\u02ee\bF\u0001G\u0001G\u0001G\u0003G\u02f3\bG\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u02fe\bH\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0003I\u0307\bI\u0001J\u0001J\u0003J\u030b"+
		"\bJ\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0003K\u0313\bK\u0001L\u0001"+
		"L\u0001M\u0003M\u0318\bM\u0001M\u0001M\u0003M\u031c\bM\u0001M\u0003M\u031f"+
		"\bM\u0001M\u0003M\u0322\bM\u0001N\u0001N\u0003N\u0326\bN\u0001N\u0001"+
		"N\u0003N\u032a\bN\u0001N\u0003N\u032d\bN\u0001N\u0003N\u0330\bN\u0001"+
		"N\u0001N\u0003N\u0334\bN\u0001N\u0003N\u0337\bN\u0001N\u0003N\u033a\b"+
		"N\u0001N\u0003N\u033d\bN\u0001N\u0001N\u0001N\u0001N\u0003N\u0343\bN\u0001"+
		"N\u0001N\u0001N\u0003N\u0348\bN\u0003N\u034a\bN\u0001O\u0001O\u0005O\u034e"+
		"\bO\nO\fO\u0351\tO\u0001O\u0001O\u0001P\u0001P\u0001P\u0002\u010a\u0113"+
		"\u0000Q\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u0000\u0003\u0001\u0000DO\u0001\u0000RS\u0001"+
		"\u0000V]\u03a9\u0000\u00a3\u0001\u0000\u0000\u0000\u0002\u00b3\u0001\u0000"+
		"\u0000\u0000\u0004\u00b7\u0001\u0000\u0000\u0000\u0006\u00c4\u0001\u0000"+
		"\u0000\u0000\b\u00c7\u0001\u0000\u0000\u0000\n\u00d7\u0001\u0000\u0000"+
		"\u0000\f\u00e1\u0001\u0000\u0000\u0000\u000e\u00f7\u0001\u0000\u0000\u0000"+
		"\u0010\u0101\u0001\u0000\u0000\u0000\u0012\u0104\u0001\u0000\u0000\u0000"+
		"\u0014\u010d\u0001\u0000\u0000\u0000\u0016\u0116\u0001\u0000\u0000\u0000"+
		"\u0018\u0122\u0001\u0000\u0000\u0000\u001a\u0129\u0001\u0000\u0000\u0000"+
		"\u001c\u012b\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000"+
		" \u013a\u0001\u0000\u0000\u0000\"\u013c\u0001\u0000\u0000\u0000$\u0148"+
		"\u0001\u0000\u0000\u0000&\u014a\u0001\u0000\u0000\u0000(\u014e\u0001\u0000"+
		"\u0000\u0000*\u015a\u0001\u0000\u0000\u0000,\u0167\u0001\u0000\u0000\u0000"+
		".\u016e\u0001\u0000\u0000\u00000\u0170\u0001\u0000\u0000\u00002\u0184"+
		"\u0001\u0000\u0000\u00004\u0191\u0001\u0000\u0000\u00006\u019c\u0001\u0000"+
		"\u0000\u00008\u019e\u0001\u0000\u0000\u0000:\u01a6\u0001\u0000\u0000\u0000"+
		"<\u01ae\u0001\u0000\u0000\u0000>\u01b1\u0001\u0000\u0000\u0000@\u01b8"+
		"\u0001\u0000\u0000\u0000B\u01ce\u0001\u0000\u0000\u0000D\u01d5\u0001\u0000"+
		"\u0000\u0000F\u01da\u0001\u0000\u0000\u0000H\u01de\u0001\u0000\u0000\u0000"+
		"J\u01e2\u0001\u0000\u0000\u0000L\u01e4\u0001\u0000\u0000\u0000N\u0203"+
		"\u0001\u0000\u0000\u0000P\u020f\u0001\u0000\u0000\u0000R\u021f\u0001\u0000"+
		"\u0000\u0000T\u0233\u0001\u0000\u0000\u0000V\u0235\u0001\u0000\u0000\u0000"+
		"X\u023c\u0001\u0000\u0000\u0000Z\u0240\u0001\u0000\u0000\u0000\\\u024e"+
		"\u0001\u0000\u0000\u0000^\u0252\u0001\u0000\u0000\u0000`\u0254\u0001\u0000"+
		"\u0000\u0000b\u025d\u0001\u0000\u0000\u0000d\u0268\u0001\u0000\u0000\u0000"+
		"f\u026e\u0001\u0000\u0000\u0000h\u0276\u0001\u0000\u0000\u0000j\u027c"+
		"\u0001\u0000\u0000\u0000l\u0283\u0001\u0000\u0000\u0000n\u028f\u0001\u0000"+
		"\u0000\u0000p\u0293\u0001\u0000\u0000\u0000r\u0295\u0001\u0000\u0000\u0000"+
		"t\u029d\u0001\u0000\u0000\u0000v\u02ab\u0001\u0000\u0000\u0000x\u02b8"+
		"\u0001\u0000\u0000\u0000z\u02bd\u0001\u0000\u0000\u0000|\u02c3\u0001\u0000"+
		"\u0000\u0000~\u02c6\u0001\u0000\u0000\u0000\u0080\u02c9\u0001\u0000\u0000"+
		"\u0000\u0082\u02d3\u0001\u0000\u0000\u0000\u0084\u02da\u0001\u0000\u0000"+
		"\u0000\u0086\u02dd\u0001\u0000\u0000\u0000\u0088\u02e3\u0001\u0000\u0000"+
		"\u0000\u008a\u02e9\u0001\u0000\u0000\u0000\u008c\u02ed\u0001\u0000\u0000"+
		"\u0000\u008e\u02f2\u0001\u0000\u0000\u0000\u0090\u02fd\u0001\u0000\u0000"+
		"\u0000\u0092\u0306\u0001\u0000\u0000\u0000\u0094\u030a\u0001\u0000\u0000"+
		"\u0000\u0096\u0312\u0001\u0000\u0000\u0000\u0098\u0314\u0001\u0000\u0000"+
		"\u0000\u009a\u0321\u0001\u0000\u0000\u0000\u009c\u0349\u0001\u0000\u0000"+
		"\u0000\u009e\u034f\u0001\u0000\u0000\u0000\u00a0\u0354\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ae\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u0006\u0003"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0000\u0000\u0001\u00b2\u0001\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0001\u0000\u0000\u00b4\u00b5\u0003\u009eO\u0000"+
		"\u00b5\u00b6\u0005\u0002\u0000\u0000\u00b6\u0003\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0005\u0003\u0000\u0000\u00b8\u00ba\u0005T\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u009eO\u0000\u00bc\u00be"+
		"\u0005A\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0002\u0000\u0000\u00c0\u0005\u0001\u0000\u0000\u0000\u00c1\u00c5\u0003"+
		"\b\u0004\u0000\u00c2\u00c5\u0003\n\u0005\u0000\u00c3\u00c5\u0005\u0002"+
		"\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u0007\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c8\u0005Q\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0003\u0098L\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0004\u0000\u0000\u00cd\u00cf\u0005U\u0000\u0000\u00ce"+
		"\u00d0\u0003\u0010\b\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0003\u0012\t\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003"+
		"\u0016\u000b\u0000\u00d5\t\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005Q"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0005"+
		"\u0000\u0000\u00da\u00dc\u0005U\u0000\u0000\u00db\u00dd\u0003\u0014\n"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u001c\u000e"+
		"\u0000\u00df\u000b\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003\u0096K\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u009aM\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u008cF\u0000\u00e7\u00e8"+
		"\u0005U\u0000\u0000\u00e8\u00ea\u0005\u0006\u0000\u0000\u00e9\u00eb\u0003"+
		"(\u0014\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f1\u0005\u0007"+
		"\u0000\u0000\u00ed\u00ee\u0005\b\u0000\u0000\u00ee\u00f0\u0005\t\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0003\"\u0011\u0000\u00f5\r\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0003\u0096K\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005U\u0000\u0000\u00fa\u00fc\u0005\u0006\u0000\u0000\u00fb\u00fd"+
		"\u0003(\u0014\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0007\u0000\u0000\u00ff\u0100\u0003`0\u0000\u0100\u000f\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0103\u0003\u009eO\u0000"+
		"\u0103\u0011\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u000b\u0000\u0000"+
		"\u0105\u010a\u0003\u009eO\u0000\u0106\u0107\u0005\f\u0000\u0000\u0107"+
		"\u0109\u0003\u009eO\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u0013\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0005\n\u0000\u0000\u010e\u0113\u0003"+
		"\u009eO\u0000\u010f\u0110\u0005\f\u0000\u0000\u0110\u0112\u0003\u009e"+
		"O\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0114\u0015\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u011a\u0005\r\u0000\u0000\u0117\u0119\u0003\u0018\f\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u000e\u0000\u0000\u011e\u0017\u0001\u0000\u0000\u0000"+
		"\u011f\u0123\u0005\u0002\u0000\u0000\u0120\u0123\u0003`0\u0000\u0121\u0123"+
		"\u0003\u001a\r\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0019\u0001"+
		"\u0000\u0000\u0000\u0124\u012a\u0003\f\u0006\u0000\u0125\u012a\u0003*"+
		"\u0015\u0000\u0126\u012a\u0003\u000e\u0007\u0000\u0127\u012a\u0003\b\u0004"+
		"\u0000\u0128\u012a\u0003\n\u0005\u0000\u0129\u0124\u0001\u0000\u0000\u0000"+
		"\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u001b\u0001\u0000\u0000\u0000\u012b\u012f\u0005\r\u0000\u0000\u012c"+
		"\u012e\u0003\u001e\u000f\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u000e\u0000\u0000\u0133"+
		"\u001d\u0001\u0000\u0000\u0000\u0134\u0137\u0005\u0002\u0000\u0000\u0135"+
		"\u0137\u0003 \u0010\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u001f\u0001\u0000\u0000\u0000\u0138\u013b"+
		"\u0003\f\u0006\u0000\u0139\u013b\u0003*\u0015\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b!\u0001\u0000"+
		"\u0000\u0000\u013c\u0140\u0005\r\u0000\u0000\u013d\u013f\u0003$\u0012"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005\u000e\u0000\u0000\u0144#\u0001\u0000\u0000\u0000"+
		"\u0145\u0149\u0003\\.\u0000\u0146\u0149\u0003b1\u0000\u0147\u0149\u0003"+
		"&\u0013\u0000\u0148\u0145\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149%\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0005\u000f\u0000\u0000\u014b\u014d\u00032\u0019\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\'\u0001\u0000\u0000\u0000\u014e\u014f\u0003\u008eG\u0000\u014f"+
		"\u0156\u0005U\u0000\u0000\u0150\u0151\u0005\f\u0000\u0000\u0151\u0152"+
		"\u0003\u008eG\u0000\u0152\u0153\u0005U\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u0150\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157)\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0159\u015b\u0003\u009cN\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0003\u008eG\u0000\u015d\u0162\u0003,\u0016\u0000\u015e\u015f"+
		"\u0005\f\u0000\u0000\u015f\u0161\u0003,\u0016\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005"+
		"\u0002\u0000\u0000\u0166+\u0001\u0000\u0000\u0000\u0167\u016a\u0005U\u0000"+
		"\u0000\u0168\u0169\u0005D\u0000\u0000\u0169\u016b\u0003.\u0017\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"-\u0001\u0000\u0000\u0000\u016c\u016f\u00032\u0019\u0000\u016d\u016f\u0003"+
		"0\u0018\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000"+
		"\u0000\u0000\u016f/\u0001\u0000\u0000\u0000\u0170\u0179\u0005\r\u0000"+
		"\u0000\u0171\u0176\u0003.\u0017\u0000\u0172\u0173\u0005\f\u0000\u0000"+
		"\u0173\u0175\u0003.\u0017\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0179\u0171\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b"+
		"\u017d\u0005\f\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0005\u000e\u0000\u0000\u017f1\u0001\u0000\u0000\u0000\u0180\u0185\u0003"+
		"B!\u0000\u0181\u0185\u0003N\'\u0000\u0182\u0185\u00034\u001a\u0000\u0183"+
		"\u0185\u0003@ \u0000\u0184\u0180\u0001\u0000\u0000\u0000\u0184\u0181\u0001"+
		"\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0183\u0001"+
		"\u0000\u0000\u0000\u01853\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0006"+
		"\u0000\u0000\u0187\u0188\u00032\u0019\u0000\u0188\u0189\u0005\u0007\u0000"+
		"\u0000\u0189\u0192\u0001\u0000\u0000\u0000\u018a\u0192\u0005\u0010\u0000"+
		"\u0000\u018b\u0192\u0005\u0011\u0000\u0000\u018c\u0192\u0003\u00a0P\u0000"+
		"\u018d\u0192\u0003\u009eO\u0000\u018e\u0192\u0005U\u0000\u0000\u018f\u0192"+
		"\u0003:\u001d\u0000\u0190\u0192\u0003<\u001e\u0000\u0191\u0186\u0001\u0000"+
		"\u0000\u0000\u0191\u018a\u0001\u0000\u0000\u0000\u0191\u018b\u0001\u0000"+
		"\u0000\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0191\u018d\u0001\u0000"+
		"\u0000\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u01925\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0005\u0006\u0000\u0000\u0194\u0195\u00032\u0019\u0000"+
		"\u0195\u0196\u0005\u0007\u0000\u0000\u0196\u019d\u0001\u0000\u0000\u0000"+
		"\u0197\u019d\u0005\u0010\u0000\u0000\u0198\u019d\u0005\u0011\u0000\u0000"+
		"\u0199\u019d\u0003\u009eO\u0000\u019a\u019d\u0005U\u0000\u0000\u019b\u019d"+
		"\u0003:\u001d\u0000\u019c\u0193\u0001\u0000\u0000\u0000\u019c\u0197\u0001"+
		"\u0000\u0000\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019c\u0199\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019b\u0001"+
		"\u0000\u0000\u0000\u019d7\u0001\u0000\u0000\u0000\u019e\u01a3\u00032\u0019"+
		"\u0000\u019f\u01a0\u0005\f\u0000\u0000\u01a0\u01a2\u00032\u0019\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a49\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0003\u009eO\u0000\u01a7\u01a9\u0005\u0006\u0000\u0000\u01a8\u01aa"+
		"\u00038\u001c\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005"+
		"\u0007\u0000\u0000\u01ac\u01ad\u0005\u0002\u0000\u0000\u01ad;\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0003>\u001f\u0000\u01af\u01b0\u0005\u0002\u0000"+
		"\u0000\u01b0=\u0001\u0000\u0000\u0000\u01b1\u01b6\u00036\u001b\u0000\u01b2"+
		"\u01b3\u0005\b\u0000\u0000\u01b3\u01b4\u00032\u0019\u0000\u01b4\u01b5"+
		"\u0005\t\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7?\u0001\u0000"+
		"\u0000\u0000\u01b8\u01bb\u0005\u0012\u0000\u0000\u01b9\u01bc\u0003\u009e"+
		"O\u0000\u01ba\u01bc\u0003:\u001d\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bf\u0003\u0016\u000b\u0000\u01be\u01bd\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bfA\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u00034\u001a\u0000\u01c1\u01c2\u0003F#\u0000\u01c2\u01c3\u0003"+
		"D\"\u0000\u01c3\u01cf\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003D\"\u0000"+
		"\u01c5\u01c8\u0003H$\u0000\u01c6\u01c9\u0003B!\u0000\u01c7\u01c9\u0003"+
		"4\u001a\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cf\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003\u009e"+
		"O\u0000\u01cb\u01cc\u0003J%\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0003L&\u0000\u01ce\u01c0\u0001\u0000\u0000\u0000\u01ce\u01c4"+
		"\u0001\u0000\u0000\u0000\u01ce\u01ca\u0001\u0000\u0000\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cfC\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003"+
		"4\u001a\u0000\u01d1\u01d2\u0003F#\u0000\u01d2\u01d3\u0003D\"\u0000\u01d3"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d6\u00034\u001a\u0000\u01d5\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6E\u0001"+
		"\u0000\u0000\u0000\u01d7\u01db\u0005\u0013\u0000\u0000\u01d8\u01db\u0005"+
		"\u0014\u0000\u0000\u01d9\u01db\u0005\u0015\u0000\u0000\u01da\u01d7\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dbG\u0001\u0000\u0000\u0000\u01dc\u01df\u0005\u0016"+
		"\u0000\u0000\u01dd\u01df\u0005\u0017\u0000\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01dfI\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e3\u0005\u0018\u0000\u0000\u01e1\u01e3\u0005\u0019\u0000"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e3K\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0017\u0000\u0000"+
		"\u01e5\u01e6\u00032\u0019\u0000\u01e6M\u0001\u0000\u0000\u0000\u01e7\u01ea"+
		"\u00034\u001a\u0000\u01e8\u01ea\u0003B!\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ee\u0003X,\u0000\u01ec\u01ef\u00034\u001a\u0000"+
		"\u01ed\u01ef\u0003B!\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u0204\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0003P(\u0000\u01f1\u01f4\u0003Z-\u0000\u01f2\u01f5\u0003N\'\u0000\u01f3"+
		"\u01f5\u00034\u001a\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f5\u0204\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0003R)\u0000\u01f7\u01fa\u0005B\u0000\u0000\u01f8\u01fb\u0003N\'\u0000"+
		"\u01f9\u01fb\u00034\u001a\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa"+
		"\u01f9\u0001\u0000\u0000\u0000\u01fb\u0204\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0003T*\u0000\u01fd\u0200\u0005C\u0000\u0000\u01fe\u0201\u0003"+
		"N\'\u0000\u01ff\u0201\u00034\u001a\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000"+
		"\u0000\u0202\u0204\u0003V+\u0000\u0203\u01e9\u0001\u0000\u0000\u0000\u0203"+
		"\u01f0\u0001\u0000\u0000\u0000\u0203\u01f6\u0001\u0000\u0000\u0000\u0203"+
		"\u01fc\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204"+
		"O\u0001\u0000\u0000\u0000\u0205\u0208\u00034\u001a\u0000\u0206\u0208\u0003"+
		"B!\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020c\u0003X,\u0000\u020a"+
		"\u020d\u00034\u001a\u0000\u020b\u020d\u0003B!\u0000\u020c\u020a\u0001"+
		"\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u0210\u0001"+
		"\u0000\u0000\u0000\u020e\u0210\u00034\u001a\u0000\u020f\u0207\u0001\u0000"+
		"\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210Q\u0001\u0000\u0000"+
		"\u0000\u0211\u0214\u00034\u001a\u0000\u0212\u0214\u0003B!\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0218\u0003X,\u0000\u0216\u0219\u0003"+
		"4\u001a\u0000\u0217\u0219\u0003B!\u0000\u0218\u0216\u0001\u0000\u0000"+
		"\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219\u0220\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0003P(\u0000\u021b\u021c\u0003Z-\u0000\u021c\u021d"+
		"\u0003N\'\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u0220\u0003"+
		"4\u001a\u0000\u021f\u0213\u0001\u0000\u0000\u0000\u021f\u021a\u0001\u0000"+
		"\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220S\u0001\u0000\u0000"+
		"\u0000\u0221\u0224\u00034\u001a\u0000\u0222\u0224\u0003B!\u0000\u0223"+
		"\u0221\u0001\u0000\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0228\u0003X,\u0000\u0226\u0229\u0003"+
		"4\u001a\u0000\u0227\u0229\u0003B!\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u0234\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0003P(\u0000\u022b\u022c\u0003Z-\u0000\u022c\u022d"+
		"\u0003N\'\u0000\u022d\u0234\u0001\u0000\u0000\u0000\u022e\u022f\u0003"+
		"R)\u0000\u022f\u0230\u0005B\u0000\u0000\u0230\u0231\u0003N\'\u0000\u0231"+
		"\u0234\u0001\u0000\u0000\u0000\u0232\u0234\u00034\u001a\u0000\u0233\u0223"+
		"\u0001\u0000\u0000\u0000\u0233\u022a\u0001\u0000\u0000\u0000\u0233\u022e"+
		"\u0001\u0000\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234U\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0005\u001a\u0000\u0000\u0236\u0237\u0003"+
		"2\u0019\u0000\u0237W\u0001\u0000\u0000\u0000\u0238\u023d\u0005\u001b\u0000"+
		"\u0000\u0239\u023d\u0005\u001c\u0000\u0000\u023a\u023d\u0005\u001d\u0000"+
		"\u0000\u023b\u023d\u0005\u001e\u0000\u0000\u023c\u0238\u0001\u0000\u0000"+
		"\u0000\u023c\u0239\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023dY\u0001\u0000\u0000\u0000"+
		"\u023e\u0241\u0005\u001f\u0000\u0000\u023f\u0241\u0005 \u0000\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241"+
		"[\u0001\u0000\u0000\u0000\u0242\u024f\u0003`0\u0000\u0243\u024f\u0003"+
		"\u0088D\u0000\u0244\u024f\u0003:\u001d\u0000\u0245\u024f\u0003d2\u0000"+
		"\u0246\u024f\u0003f3\u0000\u0247\u024f\u0003h4\u0000\u0248\u024f\u0003"+
		"j5\u0000\u0249\u024f\u0003t:\u0000\u024a\u024f\u0003|>\u0000\u024b\u024f"+
		"\u0003~?\u0000\u024c\u024f\u0003\u0080@\u0000\u024d\u024f\u0003\u0086"+
		"C\u0000\u024e\u0242\u0001\u0000\u0000\u0000\u024e\u0243\u0001\u0000\u0000"+
		"\u0000\u024e\u0244\u0001\u0000\u0000\u0000\u024e\u0245\u0001\u0000\u0000"+
		"\u0000\u024e\u0246\u0001\u0000\u0000\u0000\u024e\u0247\u0001\u0000\u0000"+
		"\u0000\u024e\u0248\u0001\u0000\u0000\u0000\u024e\u0249\u0001\u0000\u0000"+
		"\u0000\u024e\u024a\u0001\u0000\u0000\u0000\u024e\u024b\u0001\u0000\u0000"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000"+
		"\u0000\u024f]\u0001\u0000\u0000\u0000\u0250\u0253\u0003b1\u0000\u0251"+
		"\u0253\u0003\\.\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0251"+
		"\u0001\u0000\u0000\u0000\u0253_\u0001\u0000\u0000\u0000\u0254\u0258\u0005"+
		"\r\u0000\u0000\u0255\u0257\u0003^/\u0000\u0256\u0255\u0001\u0000\u0000"+
		"\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025b\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u000e\u0000"+
		"\u0000\u025ca\u0001\u0000\u0000\u0000\u025d\u025e\u0003\u008eG\u0000\u025e"+
		"\u0263\u0003,\u0016\u0000\u025f\u0260\u0005\f\u0000\u0000\u0260\u0262"+
		"\u0003,\u0016\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0265\u0001"+
		"\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001"+
		"\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0263\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\u0005\u0002\u0000\u0000\u0267c\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0005!\u0000\u0000\u0269\u026a\u0005\u0006\u0000"+
		"\u0000\u026a\u026b\u00032\u0019\u0000\u026b\u026c\u0005\u0007\u0000\u0000"+
		"\u026c\u026d\u0003\\.\u0000\u026de\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0005!\u0000\u0000\u026f\u0270\u0005\u0006\u0000\u0000\u0270\u0271\u0003"+
		"2\u0019\u0000\u0271\u0272\u0005\u0007\u0000\u0000\u0272\u0273\u0003\\"+
		".\u0000\u0273\u0274\u0005\"\u0000\u0000\u0274\u0275\u0003\\.\u0000\u0275"+
		"g\u0001\u0000\u0000\u0000\u0276\u0277\u0005#\u0000\u0000\u0277\u0278\u0005"+
		"\u0006\u0000\u0000\u0278\u0279\u00032\u0019\u0000\u0279\u027a\u0005\u0007"+
		"\u0000\u0000\u027a\u027b\u0003\\.\u0000\u027bi\u0001\u0000\u0000\u0000"+
		"\u027c\u027d\u0005$\u0000\u0000\u027d\u027e\u0005\u0006\u0000\u0000\u027e"+
		"\u027f\u0003l6\u0000\u027f\u0280\u0005\u0007\u0000\u0000\u0280\u0281\u0003"+
		"\\.\u0000\u0281k\u0001\u0000\u0000\u0000\u0282\u0284\u0003p8\u0000\u0283"+
		"\u0282\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0001\u0000\u0000\u0000\u0285\u0287\u0005\u0002\u0000\u0000\u0286"+
		"\u0288\u00032\u0019\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b"+
		"\u0005\u0002\u0000\u0000\u028a\u028c\u0003r9\u0000\u028b\u028a\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028cm\u0001\u0000\u0000"+
		"\u0000\u028d\u0290\u0003\u0088D\u0000\u028e\u0290\u0003:\u001d\u0000\u028f"+
		"\u028d\u0001\u0000\u0000\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u0290"+
		"o\u0001\u0000\u0000\u0000\u0291\u0294\u0003b1\u0000\u0292\u0294\u0003"+
		"r9\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0292\u0001\u0000\u0000"+
		"\u0000\u0294q\u0001\u0000\u0000\u0000\u0295\u029a\u0003n7\u0000\u0296"+
		"\u0297\u0005\f\u0000\u0000\u0297\u0299\u0003n7\u0000\u0298\u0296\u0001"+
		"\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029bs\u0001\u0000"+
		"\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u029e\u0005%\u0000"+
		"\u0000\u029e\u029f\u0005\u0006\u0000\u0000\u029f\u02a0\u00032\u0019\u0000"+
		"\u02a0\u02a1\u0005\u0007\u0000\u0000\u02a1\u02a5\u0005\r\u0000\u0000\u02a2"+
		"\u02a4\u0003v;\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0005\u000e\u0000\u0000\u02a9u\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ac\u0003x<\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000"+
		"\u02af\u02b1\u0003z=\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b1w\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005"+
		"&\u0000\u0000\u02b3\u02b4\u00032\u0019\u0000\u02b4\u02b5\u0005\'\u0000"+
		"\u0000\u02b5\u02b9\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005(\u0000\u0000"+
		"\u02b7\u02b9\u0005\'\u0000\u0000\u02b8\u02b2\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b9y\u0001\u0000\u0000\u0000\u02ba\u02bc"+
		"\u0003\\.\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001"+
		"\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c2\u0003|>\u0000\u02c1\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2{\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0005)\u0000\u0000\u02c4\u02c5\u0005\u0002\u0000\u0000\u02c5"+
		"}\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005*\u0000\u0000\u02c7\u02c8\u0005"+
		"\u0002\u0000\u0000\u02c8\u007f\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005"+
		"+\u0000\u0000\u02ca\u02cc\u0003`0\u0000\u02cb\u02cd\u0003\u0082A\u0000"+
		"\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d1\u0001\u0000\u0000\u0000\u02d0\u02d2\u0003\u0084B\u0000\u02d1"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2"+
		"\u0081\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005,\u0000\u0000\u02d4\u02d5"+
		"\u0005\u0006\u0000\u0000\u02d5\u02d6\u0003\u008eG\u0000\u02d6\u02d7\u0005"+
		"U\u0000\u0000\u02d7\u02d8\u0005\u0007\u0000\u0000\u02d8\u02d9\u0003`0"+
		"\u0000\u02d9\u0083\u0001\u0000\u0000\u0000\u02da\u02db\u0005-\u0000\u0000"+
		"\u02db\u02dc\u0003`0\u0000\u02dc\u0085\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0005.\u0000\u0000\u02de\u02df\u00032\u0019\u0000\u02df\u02e0\u0005\u0002"+
		"\u0000\u0000\u02e0\u0087\u0001\u0000\u0000\u0000\u02e1\u02e4\u00034\u001a"+
		"\u0000\u02e2\u02e4\u0003>\u001f\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e6\u0003\u008aE\u0000\u02e6\u02e7\u00032\u0019\u0000\u02e7\u02e8"+
		"\u0005\u0002\u0000\u0000\u02e8\u0089\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0007\u0000\u0000\u0000\u02ea\u008b\u0001\u0000\u0000\u0000\u02eb\u02ee"+
		"\u0003\u008eG\u0000\u02ec\u02ee\u0005P\u0000\u0000\u02ed\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ee\u008d\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f3\u0003\u0090H\u0000\u02f0\u02f3\u0003\u0092I\u0000"+
		"\u02f1\u02f3\u0003\u0094J\u0000\u02f2\u02ef\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f3"+
		"\u008f\u0001\u0000\u0000\u0000\u02f4\u02fe\u0005/\u0000\u0000\u02f5\u02fe"+
		"\u00050\u0000\u0000\u02f6\u02fe\u00051\u0000\u0000\u02f7\u02fe\u00052"+
		"\u0000\u0000\u02f8\u02fe\u00053\u0000\u0000\u02f9\u02fe\u00054\u0000\u0000"+
		"\u02fa\u02fe\u00055\u0000\u0000\u02fb\u02fe\u00056\u0000\u0000\u02fc\u02fe"+
		"\u0005U\u0000\u0000\u02fd\u02f4\u0001\u0000\u0000\u0000\u02fd\u02f5\u0001"+
		"\u0000\u0000\u0000\u02fd\u02f6\u0001\u0000\u0000\u0000\u02fd\u02f7\u0001"+
		"\u0000\u0000\u0000\u02fd\u02f8\u0001\u0000\u0000\u0000\u02fd\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fa\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe\u0091\u0001"+
		"\u0000\u0000\u0000\u02ff\u0307\u00057\u0000\u0000\u0300\u0307\u00058\u0000"+
		"\u0000\u0301\u0307\u00059\u0000\u0000\u0302\u0307\u0005:\u0000\u0000\u0303"+
		"\u0307\u0005;\u0000\u0000\u0304\u0307\u0005<\u0000\u0000\u0305\u0307\u0005"+
		"=\u0000\u0000\u0306\u02ff\u0001\u0000\u0000\u0000\u0306\u0300\u0001\u0000"+
		"\u0000\u0000\u0306\u0301\u0001\u0000\u0000\u0000\u0306\u0302\u0001\u0000"+
		"\u0000\u0000\u0306\u0303\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000"+
		"\u0000\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0307\u0093\u0001\u0000"+
		"\u0000\u0000\u0308\u030b\u0003\u0092I\u0000\u0309\u030b\u0003\u0090H\u0000"+
		"\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0005\b\u0000\u0000\u030d"+
		"\u030e\u0005\t\u0000\u0000\u030e\u0095\u0001\u0000\u0000\u0000\u030f\u0313"+
		"\u0005Q\u0000\u0000\u0310\u0313\u0005>\u0000\u0000\u0311\u0313\u0005?"+
		"\u0000\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313\u0097\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0007\u0001\u0000\u0000\u0315\u0099\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0005S\u0000\u0000\u0317\u0316\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000"+
		"\u0000\u0319\u031f\u0005T\u0000\u0000\u031a\u031c\u0005T\u0000\u0000\u031b"+
		"\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0005S\u0000\u0000\u031e\u0317"+
		"\u0001\u0000\u0000\u0000\u031e\u031b\u0001\u0000\u0000\u0000\u031f\u0322"+
		"\u0001\u0000\u0000\u0000\u0320\u0322\u0005R\u0000\u0000\u0321\u031e\u0001"+
		"\u0000\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322\u009b\u0001"+
		"\u0000\u0000\u0000\u0323\u032c\u0003\u0096K\u0000\u0324\u0326\u0005S\u0000"+
		"\u0000\u0325\u0324\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u032d\u0005T\u0000\u0000"+
		"\u0328\u032a\u0005T\u0000\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032d\u0005S\u0000\u0000\u032c\u0325\u0001\u0000\u0000\u0000\u032c\u0329"+
		"\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u034a"+
		"\u0001\u0000\u0000\u0000\u032e\u0330\u0005S\u0000\u0000\u032f\u032e\u0001"+
		"\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0001"+
		"\u0000\u0000\u0000\u0331\u0337\u0005T\u0000\u0000\u0332\u0334\u0005T\u0000"+
		"\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000"+
		"\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0005S\u0000\u0000"+
		"\u0336\u032f\u0001\u0000\u0000\u0000\u0336\u0333\u0001\u0000\u0000\u0000"+
		"\u0337\u0339\u0001\u0000\u0000\u0000\u0338\u033a\u0003\u0096K\u0000\u0339"+
		"\u0338\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a"+
		"\u034a\u0001\u0000\u0000\u0000\u033b\u033d\u0005S\u0000\u0000\u033c\u033b"+
		"\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033e"+
		"\u0001\u0000\u0000\u0000\u033e\u033f\u0003\u0096K\u0000\u033f\u0340\u0005"+
		"T\u0000\u0000\u0340\u0348\u0001\u0000\u0000\u0000\u0341\u0343\u0005T\u0000"+
		"\u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000"+
		"\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345\u0003\u0096K\u0000"+
		"\u0345\u0346\u0005S\u0000\u0000\u0346\u0348\u0001\u0000\u0000\u0000\u0347"+
		"\u033c\u0001\u0000\u0000\u0000\u0347\u0342\u0001\u0000\u0000\u0000\u0348"+
		"\u034a\u0001\u0000\u0000\u0000\u0349\u0323\u0001\u0000\u0000\u0000\u0349"+
		"\u0336\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u034a"+
		"\u009d\u0001\u0000\u0000\u0000\u034b\u034c\u0005U\u0000\u0000\u034c\u034e"+
		"\u0005@\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u0351\u0001"+
		"\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u0350\u0001"+
		"\u0000\u0000\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u034f\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0005U\u0000\u0000\u0353\u009f\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0007\u0002\u0000\u0000\u0355\u00a1\u0001\u0000"+
		"\u0000\u0000m\u00a3\u00a8\u00ae\u00b9\u00bd\u00c4\u00c7\u00ca\u00cf\u00d2"+
		"\u00d7\u00dc\u00e1\u00e4\u00ea\u00f1\u00f7\u00fc\u010a\u0113\u011a\u0122"+
		"\u0129\u012f\u0136\u013a\u0140\u0148\u014c\u0156\u015a\u0162\u016a\u016e"+
		"\u0176\u0179\u017c\u0184\u0191\u019c\u01a3\u01a9\u01b6\u01bb\u01be\u01c8"+
		"\u01ce\u01d5\u01da\u01de\u01e2\u01e9\u01ee\u01f4\u01fa\u0200\u0203\u0207"+
		"\u020c\u020f\u0213\u0218\u021f\u0223\u0228\u0233\u023c\u0240\u024e\u0252"+
		"\u0258\u0263\u0283\u0287\u028b\u028f\u0293\u029a\u02a5\u02ad\u02b0\u02b8"+
		"\u02bd\u02c1\u02ce\u02d1\u02e3\u02ed\u02f2\u02fd\u0306\u030a\u0312\u0317"+
		"\u031b\u031e\u0321\u0325\u0329\u032c\u032f\u0333\u0336\u0339\u033c\u0342"+
		"\u0347\u0349\u034f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}