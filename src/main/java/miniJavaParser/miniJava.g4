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

classDeclaration : Public? classModifier? 'class' Identifier superclass? superinterfaces? classBody;

interfaceDeclaration : Public? 'interface' Identifier extendsInterfaces? interfaceBody;

methodDeclaration : accessModifier? methodModifier? typeOrVoid Identifier '(' formalParameters? ')' ('[' ']')* methodBody;

constructorDeclaration : accessModifier? Identifier '(' formalParameters? ')' block;


// Extends / Implements
superclass : 'extends' qualifiedName;

superinterfaces : 'implements' qualifiedName (',' qualifiedName)*?;

extendsInterfaces : 'extends' qualifiedName (',' qualifiedName)*?;


// Bodys / Inner declarations
classBody : '{' classBodyDeclaration* '}';

classBodyDeclaration
    : ';'
    | block
    | memberDeclaration
    | staticInitializer;

staticInitializer : 'static' block;

memberDeclaration
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
    : methodDeclaration
    | fieldDeclaration;

methodBody :  '{' methodBodyStatement* '}';

methodBodyStatement
    : statement
    | localVariableDeclaration
    | return;

return : 'return' expression?;

formalParameters : type Identifier (',' type Identifier)* ;

fieldDeclaration : fieldModifier? type variableDeclarator (',' variableDeclarator)* ';';

variableDeclarator : Identifier ('=' variableInitializer)?;

variableInitializer
    : expression
    | arrayInitializer;

arrayInitializer : '{' (variableInitializer (',' variableInitializer)*)? ','? '}';


// Expressions
expression
    : calcFunction
    | booleanFunction
    | primary
    | arrayRead
    | newObject;

primary
    : '(' expression ')'
    | 'this'
    | 'super'
    | literal
    | qualifiedName
    | Identifier
    | methodCall;

expressionList : expression (',' expression)*;

methodCall : qualifiedName '(' expressionList? ')' ';';

arrayRead : arrayAccess ';';
arrayAccess : primary ('[' expression ']')? ;

newObject: 'new' (qualifiedName | methodCall) (classBody)?;

// Basic Functions
calcFunction
    : addition
    | subtraction
    | multiplication
    | division
    | modulo;

term
    : multiplication
    | division
    | modulo
    | primary;

multiplication : primary '*' term;
division : primary '/' term;
modulo : primary '%' term;
addition: term '+' (calcFunction | primary);
subtraction: term '-' (calcFunction | primary);

booleanFunction
    : greater
    | greaterEqual
    | lesser
    | lesserEqual
    | equal
    | notEqual
    | inverse;

booleanFunNotEqual
    : greater
    | greaterEqual
    | lesser
    | lesserEqual
    | inverse;

greater: (primary | calcFunction) '>' (primary | calcFunction);
greaterEqual: (primary | calcFunction) '>=' (primary | calcFunction);
lesser: (primary | calcFunction) '<' (primary | calcFunction);
lesserEqual: (primary | calcFunction) '<=' (primary | calcFunction);
equal: (primary | booleanFunNotEqual | calcFunction) '==' expression;
notEqual: (primary | booleanFunNotEqual | calcFunction) '!=' expression;
inverse: '!' expression;

bitwiseFunction
    : and
    | or
    | xor;

and: term '&' term;
or: term '|' term;
xor: term '^' term;

shiftFunction
    :leftShift
    | leftShift
    | unsignedRightShift;

leftShift: term '<<' term;
rightShift: term '>>' term;
unsignedRightShift: term '>>>' term;


// Statements
statement
    : block
    | assignment
    | methodCall
    | ifThen
    | ifThenElse
    | whileStatement
    | forStatement
    | switch
    | break
    | continue
    | tryStatement
    | throwStatement;

block : '{' (statement | localVariableDeclaration)* '}';

localVariableDeclaration : type variableDeclarator (',' variableDeclarator)* ';';

ifThen : 'if' '(' expression ')' statement;

ifThenElse : 'if' '(' expression ')' statement 'else' statement ;

whileStatement : 'while' '(' expression ')' statement;

forStatement : 'for' '(' forControl ')' statement;

forControl : forInit? ';' expression? ';' forControlStatementList?;

forControlStatement
    : assignment
    | methodCall;

forInit
    : localVariableDeclaration
    | forControlStatementList;

forControlStatementList: forControlStatement (',' forControlStatement)*;

switch: 'switch' '(' expression ')' '{' switchBlockStatementGroup* '}' ;

switchBlockStatementGroup: switchLabel+ switchBlock? ;

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
assignment : (primary | arrayAccess) assignmentType expression ';';

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
    | 'Byte' #ByteObject
    | 'Short' #ShortObject
    | 'Integer' #IntegerObject
    | 'Float' #FloatObject
    | 'Double' #DoubleObject
    | 'Boolean' #BooleanObject
    | 'Character' #CharacterObject
    | Identifier #Identifier;

primitiveType
    : 'byte' #ByteType
    | 'short' #ShortType
    | 'int' #IntType
    | 'float' #FloatType
    | 'double' #DoubleType
    | 'boolean' #BooleanType
    | 'char' #CharType;

arrayType : (primitiveType | objectType) '[' ']' ;

VoidType : 'void';


// Modifiers
accessModifier
    : Public #Public
    | 'private' #Private
    | 'protected' #Protected;

classModifier
    : Abstract
    | Final;

methodModifier
    : (Final? Static | Static? Final)
    | Abstract;

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

Identifier : [a-zA-Z_] [a-zA-Z0-9_]*;

// Literals
literal
    : IntegerLiteral
    | LongLiteral
    | FloatingPointLiteral
    | DoubleLiteral
    | CharacterLiteral
    | StringLiteral
    | BooleanLiteral
    | NullLiteral;

BooleanLiteral
    : 'true'
    | 'false';
IntegerLiteral : ('-')? [0-9]+;
LongLiteral : ('-')? [0-9]+ [lL];
NullLiteral : 'null';
FloatingPointLiteral : ('-')? [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)? ('f'|'F');
DoubleLiteral : ('-')? [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)? ('d'|'D')?;
CharacterLiteral : '\'' . '\'';
StringLiteral : '"' .*? '"';


// Whitespace and comments
WS: [ \t\r\n\u000C]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;