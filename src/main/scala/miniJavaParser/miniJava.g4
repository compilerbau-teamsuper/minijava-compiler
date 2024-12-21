grammar miniJava;

// Parser rules
compilationUnit : packageDeclaration? importDeclaration* typeDeclaration* EOF;

packageDeclaration : 'package' qualifiedName ';';

importDeclaration : 'import' 'static'? qualifiedName ('.' '*')? ';';

typeDeclaration
    : classDeclaration
    | interfaceDeclaration
    | ';';

classDeclaration : Public? classModifier 'class' Identifier superclass? superinterfaces? classBody;

interfaceDeclaration : Public? 'interface' Identifier extendsInterfaces? interfaceBody;

superclass : 'extends' Identifier;

superinterfaces : 'implements' Identifier (',' Identifier)*?;

extendsInterfaces : 'extends' Identifier (',' Identifier)*?;

classBody : '{' classBodyDeclaration* '}';

interfaceBody : '{' interfaceBodyDeclaration* '}';

classBodyDeclaration
    : ';'
    | block
    | memberDeclaration;

interfaceBodyDeclaration
    : ';'
    | interfaceMemberDeclaration;

memberDeclaration
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    | classDeclaration
    | interfaceDeclaration;

interfaceMemberDeclaration
    : methodDeclaration
    | fieldDeclaration;

methodDeclaration : accessModifier? methodModifier typeOrVoid Identifier formalParameters? ('[' ']')* methodBody;

constructorDeclaration : accessModifier? Identifier formalParameters block;

formalParameters : type Identifier (',' type Identifier)* ;

fieldDeclaration : fieldModifier* type variableDeclarators ';';

variableDeclarators : variableDeclarator (',' variableDeclarator)*;

variableDeclarator : Identifier ('=' variableInitializer)?;

variableInitializer
    : expression
    | arrayInitializer;

arrayInitializer : '{' (variableInitializer (',' variableInitializer)*)? ','? '}';

expression : primary; // Simplified for brevity

primary
    : '(' expression ')'
    | 'this'
    | 'super'
    | literal
    | Identifier
    | methodCall;

expressionList : expression (',' expression)*;

literal
    : IntegerLiteral
    | LongLiteral
    | FloatingPointLiteral
    | CharacterLiteral
    | StringLiteral
    | BooleanLiteral
    | NullLiteral;

block : '{' statement* '}';

statement
    : block
    | localVariableDeclaration
    | assignment
    | methodCall
    | 'if' '(' expression ')' statement ('else' statement)?
    | 'while' '(' expression ')' statement
    | 'for' '(' forControl ')' statement; // Simplified for brevity

localVariableDeclaration : type variableDeclarators ';';

assignment : Identifier '=' expression;

methodCall : Identifier '(' expressionList? ')';

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