grammar miniJava;

// Start Rule
compilationUnit : packageDeclaration? importDeclaration* (classDeclaration | interfaceDeclaration | ';')* EOF;


// Outer Declarations
packageDeclaration : 'package' qualifiedName ';';

importDeclaration : 'import' 'static'? qualifiedName ('.' '*')? ';';

classDeclaration : Public? classModifier? 'class' Identifier superclass? superinterfaces? classBody;

interfaceDeclaration : Public? 'interface' Identifier extendsInterfaces? interfaceBody;

methodDeclaration : accessModifier? methodModifier? typeOrVoid Identifier '(' formalParameters? ')' ('[' ']')* methodBody;

constructorDeclaration : accessModifier? Identifier '(' formalParameters? ')' block;


// Extends / Implements
superclass : 'extends' Identifier;

superinterfaces : 'implements' Identifier (',' Identifier)*?;

extendsInterfaces : 'extends' Identifier (',' Identifier)*?;


// Bodys / Inner declarations
classBody : '{' classBodyDeclaration* '}';

classBodyDeclaration
    : ';'
    | block
    | memberDeclaration;

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

interfaceMemberDeclaration
    : methodDeclaration
    | fieldDeclaration;

methodBody :  '{' methodBodyStatement* '}';

methodBodyStatement
    : statement
    | return;

return : 'return' expression?;

formalParameters : type Identifier (',' type Identifier)* ;

fieldDeclaration : fieldModifier* type variableDeclarators ';';

variableDeclarators : variableDeclarator (',' variableDeclarator)*;

variableDeclarator : Identifier ('=' variableInitializer)?;

variableInitializer
    : expression
    | arrayInitializer;

arrayInitializer : '{' (variableInitializer (',' variableInitializer)*)? ','? '}';


// Expressions
expression
    : calcFunction
    | booleanFunction
    | primary;

primary
    : '(' expression ')'
    | 'this'
    | 'super'
    | literal
    | qualifiedName
    | Identifier
    | methodCall;

expressionList : expression (',' expression)*;

methodCall : (qualifiedName | Identifier) '(' expressionList? ')' ';';


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


// Statements
statement
    : block
    | assignment
    | methodCall
    | ifThen
    | ifThenElse
    | while
    | for;

block : '{' (statement | localVariableDeclaration)* '}';

localVariableDeclaration : type variableDeclarators ';';

assignment : Identifier '=' expression ';';

ifThen : 'if' '(' expression ')' statement;

ifThenElse : 'if' '(' expression ')' statement 'else' statement ;

while : 'while' '(' expression ')' statement;

for : 'for' '(' forControl ')' statement;

forControl : forInit? ';' expression? ';' forControlStatementList?;

forControlStatement
    : assignment
    | methodCall;

forInit
    : localVariableDeclaration
    | forControlStatementList;

forControlStatementList: forControlStatement (',' forControlStatement)*;

// Types
typeOrVoid
    : type
    | Void;

type
    : classOrInterfaceType
    | primitiveType;

classOrInterfaceType
    : STRING
    | INT
    | FLOAT
    | BOOLEAN;

primitiveType
    : Int
    | Float
    | Boolean;

Void : 'void';
Int : 'int';
Float : 'float';
Boolean : 'boolean';

STRING : 'String';
INTEGER : 'Integer';
BOOLEAN : 'Boolean';
FLOAT : 'Float';


// Modifiers
accessModifier
    : Public
    | Private
    | Protected;

classModifier
    : Abstract
    | Final;

methodModifier
    : (Final? Static | Static? Final)
    | Abstract;

fieldModifier : (Final? Static | Static? Final);

Public : 'public';
Private : 'private';
Protected : 'protected';
Abstract : 'abstract';
Final : 'final';
Static: 'static';


// Identifier
qualifiedName : (Identifier '.')+ Identifier;

Identifier : [a-zA-Z_] [a-zA-Z0-9_]*;

// Literals
literal
    : IntegerLiteral
    | LongLiteral
    | FloatingPointLiteral
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
FloatingPointLiteral : ('-')? [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)?;
CharacterLiteral : '\'' . '\'';
StringLiteral : '"' .*? '"';

// Operators and punctuators
WS : [ \t\r\n]+ -> skip;