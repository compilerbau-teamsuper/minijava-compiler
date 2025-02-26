grammar miniJava;

// Start Rule
compilationUnit : packageDeclaration? importDeclaration* typeDeclaration* EOF;


// Outer Declarations
packageDeclaration : 'package' qualifiedName ';';

importDeclaration : 'import' 'static'? qualifiedName Wildcard? ';';

typeDeclaration
    : classDeclaration
    | interfaceDeclaration
    | ';';

Wildcard: ('.' '*');

classDeclaration : accessModifier? classModifier? 'class' Identifier superclass? superinterfaces? classBody;

interfaceDeclaration : Public? 'interface' Identifier extendsInterfaces? interfaceBody;

methodDeclaration
    : accessModifier? (Final? Static | Static? Final)? typeOrVoid Identifier '(' formalParameters? ')' ('[' ']')* methodBody
    | accessModifier? Abstract typeOrVoid Identifier '(' formalParameters? ')' ('[' ']')* ';';

interfaceMethodDeclaration : Public? typeOrVoid Identifier '(' formalParameters? ')' ('[' ']')* ';';

constructorDeclaration : accessModifier? Identifier '(' formalParameters? ')' constructorBody;


// Extends / Implements
superclass : 'extends' qualifiedName;

superinterfaces : 'implements' qualifiedName (',' qualifiedName)*?;

extendsInterfaces : 'extends' qualifiedName (',' qualifiedName)*?;


// Bodys / Inner declarations
classBody : '{' classBodyDeclaration* '}';

classBodyDeclaration
    : ';'
    | block
    | memberDeclaration;

memberDeclaration // ToDo: @Override als Annotation wichtig?
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    | classDeclaration
    | interfaceDeclaration;

interfaceBody : '{' interfaceBodyDeclaration* '}';

interfaceBodyDeclaration
    : ';'
    | interfaceMemberDeclaration;

interfaceMemberDeclaration //ToDo: Interface in Interface möglich?
    : interfaceMethodDeclaration
    | fieldDeclaration;

methodBody :  '{' methodBodyStatement* '}';

constructorBody : '{' explicitConstructorInvocation? methodBodyStatement* '}';

explicitConstructorInvocation : ('this' | 'super') '(' expressionList? ')' ';';

methodBodyStatement
    : statement
    | localVariableDeclaration
    | return;

return : 'return' expression? ';';

formalParameters : type Identifier (',' type Identifier)* ;

fieldDeclaration : fieldModifier? type variableDeclarator (',' variableDeclarator)* ';'; // ToDo: reintheoretisch kann man n Array erstellen mit nem nicht array typen... Vermutlich aber nicht so wichtig

variableDeclarator : Identifier ('=' variableInitializer)?;

variableInitializer
    : expression
    | arrayInitializer;

arrayInitializer
    : '{' (expression (',' expression)*)? ','? '}'
    | 'new' type '[' expression ']';


// Expressions
expression
    : calcFunction
    | booleanFunction
    | newObject
    | value
    | assignment;

value
    : primary
    | qualifiedName;

primary
    : IntegerLiteral# literal
	| LongLiteral# literal
	| FloatingPointLiteral# literal
	| DoubleLiteral# literal
	| CharacterLiteral# literal
	| BooleanLiteral # literal
	| NullLiteral # literal
	| StringLiteral # literal
	| 'this' # this
	| '(' expression ')' # nested
    | primary '.' Identifier # fieldAccess
    | qualifiedName '[' expression ']' # arrayAccess
    | primary '[' expression ']' # arrayAccess
    | Identifier '(' expressionList? ')' # methodCall
    | qualifiedName '.' Identifier '(' expressionList? ')' # methodCall
    | primary '.' Identifier '(' expressionList? ')' # methodCall;

expressionList : expression (',' expression)*;

newObject: 'new' qualifiedName '(' expressionList ')'; // 'new' qualifiedName | methodCall) (classBody)?;

// Basic Functions
calcFunction
    : value calcBinOpHigher term
    | term calcBinOpLower (calcFunction | value)
    | negate;

term
    : value calcBinOpHigher term
    | value;

calcBinOpHigher
    : '*' #MUL
    | '/' #DIV
    | '%' #MOD;

calcBinOpLower
    : '+' #ADD
    | '-' #SUB;

calcUnOp
    : '++' #INC
    | '--' #DEC;

negate : '-' expression;

booleanFunction // ToDo: Xor (^)
    : (value | calcFunction) booleanNumberOp (value | calcFunction)
    | booleanFunHigh booleanOp (booleanFunHigh | booleanFunMiddle)
    | booleanFunMiddle XOR (booleanFunMiddle | booleanFunLow)
    | booleanFunLow AND (booleanFunLow | booleanFunUnderground)
    | booleanFunUnderground OR (booleanFunction | value)
    | inverse;

booleanFunHigh
    : (value | calcFunction) booleanNumberOp (value | calcFunction)
    | inverse
    | value;

booleanFunMiddle
    : (value | calcFunction) booleanNumberOp (value | calcFunction)
    | booleanFunHigh booleanOp (booleanFunHigh | booleanFunMiddle)
    | inverse
    | value;

booleanFunLow
    : (value | calcFunction) booleanNumberOp (value | calcFunction)
    | booleanFunHigh booleanOp (booleanFunHigh | booleanFunMiddle)
    | booleanFunMiddle XOR (booleanFunMiddle | booleanFunLow)
    | inverse
    | value;

booleanFunUnderground
    : (value | calcFunction) booleanNumberOp (value | calcFunction)
    | booleanFunHigh booleanOp booleanFunHigh+
    | booleanFunMiddle XOR (booleanFunMiddle | booleanFunLow)
    | booleanFunLow AND (booleanFunLow | booleanFunUnderground)
    | inverse
    | value;

inverse: '!' value;

booleanNumberOp
    : '>' #GT
    | '<' #LT
    | '<=' #LE
    | '>=' #GE;

booleanOp
    : '==' #EQUAL
    | '!=' #NOTEQUAL;

XOR : '^';
AND : '&&';
OR : '||';

// Statements
statement
    : block
    | expression ';'
    | ifThenElse
    | ifThen
    | whileStatement
    | forStatement
    | switch
    | break
    | continue
    | qualifiedName calcUnOp
    | return // ToDo: evtl noch restricten wo das vorkommen darf auf scala Seite? Vermutlich nicht super wichtig tho..
    | tryStatement // ToDo auf scala Seite
    | throwStatement; // ToDo auf scala Seite

blockStatement
    : localVariableDeclaration
    | statement;

block : '{' blockStatement* '}';

localVariableDeclaration : type variableDeclarator (',' variableDeclarator)* ';';

ifThen : 'if' '(' expression ')' statement;

ifThenElse : 'if' '(' expression ')' statement 'else' statement;

whileStatement : 'while' '(' expression ')' statement;

forStatement : 'for' '(' forControl ')' statement; // ToDo: Foreach wäre noch nice.
// Generell an Abstrakter Syntax aus Vorlesung orientiern
forControl : (localVariableDeclaration | ';') booleanFunction? ';' statement?;

//forControlStatement
//    : assignment
//    | methodCall;

//forInit
//    : localVariableDeclaration
//    | forControlStatementList;

//forControlStatementList: forControlStatement (',' forControlStatement)*;

switch: 'switch' '(' expression ')' '{' switchBlockStatementGroup* '}' ;

switchBlockStatementGroup: switchLabel+ switchBlock ;

switchLabel
    : 'case' expression ':'
    | 'default' ':' ;

switchBlock: (statement)* break?;

break: 'break' ';';
continue: 'continue' ';';

tryStatement: 'try' block catchClause+ (finallyClause)?;

catchClause: 'catch' '(' type Identifier ')' block;

finallyClause: 'finally' block;

throwStatement : 'throw' expression ';' ;

// Assignments
assignment
    : qualifiedName assignmentType expression # assignQualifiedName
    | primary '.' Identifier assignmentType expression # assignFieldAccess
    | qualifiedName '[' expression ']' assignmentType expression # assignArrayAccess
    | primary '[' expression ']' assignmentType expression # assignArrayAccess;

assignmentType
    : ASSIGN
    | ADD_ASSIGN
    | SUB_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    | AND_ASSIGN
    | OR_ASSIGN
    | XOR_ASSIGN
    | MOD_ASSIGN
    | LSHIFT_ASSIGN
    | RSHIFT_ASSIGN
    | URSHIFT_ASSIGN;

ASSIGN         : '=';
ADD_ASSIGN     : '+=';
SUB_ASSIGN     : '-=';
MUL_ASSIGN     : '*=';
DIV_ASSIGN     : '/=';
AND_ASSIGN     : '&=';
OR_ASSIGN      : '|=';
XOR_ASSIGN     : '^=';
MOD_ASSIGN     : '%=';
LSHIFT_ASSIGN  : '<<=';
RSHIFT_ASSIGN  : '>>=';
URSHIFT_ASSIGN : '>>>=';

// Types
typeOrVoid
    : type
    | VoidType;

type
    : objectType
    | primitiveType
    | arrayType;

objectType
    : 'String' #StringObject
    | 'Short' #ShortObject
    | 'Integer' #IntegerObject
    | 'Float' #FloatObject
    | 'Double' #DoubleObject
    | 'Boolean' #BooleanObject
    | 'Character' #CharacterObject
    | Identifier #Identifier;

primitiveType
    : 'short' #ShortType
    | 'int' #IntType
    | 'float' #FloatType
    | 'double' #DoubleType
    | 'boolean' #BooleanType
    | 'char' #CharType;

arrayType : (primitiveType | objectType) '[' ']' ; // ToDo: Support für mehrdimensionale Arrays?

VoidType : 'void';


// Modifiers
accessModifier
    : Public #Public
    | 'private' #Private
    | 'protected' #Protected;

classModifier
    : Abstract
    | Final;

fieldModifier
    : accessModifier (Final? Static | Static? Final)?
    | (Final? Static | Static? Final) accessModifier?
    | (Final? accessModifier Static | Static? accessModifier Final);

Public : 'public';
Abstract : 'abstract';
Final : 'final';
Static: 'static';


// Identifier
qualifiedName : (Identifier '.')* Identifier; // ToDo: Vielleicht nicht alles qualified name sein lassen und auch direkt mit Identifier arbeiten!

// Literals

BooleanLiteral
    :'true'
    | 'false';

IntegerLiteral : ('-')? [0-9]+;
LongLiteral : ('-')? [0-9]+ [lL];
NullLiteral: 'null';
FloatingPointLiteral : ('-')? [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)? ('f'|'F');
DoubleLiteral : ('-')? [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)? ('d'|'D')?;
CharacterLiteral : '\'' . '\'';
StringLiteral : '"' .*? '"';


// Whitespace and comments
WS: [ \t\r\n\u000C]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

Identifier : [a-zA-Z_] [a-zA-Z0-9_]*;