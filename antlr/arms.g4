grammar arms;

program	: model statement+;
model	: NAME '=' MODEL attributeBlock;

attributeBlock	: '{' attribute* '}';
attribute		: NAME '=' ( math | STRING | UNITS | COLOR);

statement : block | variable | template | invocation;

block		: '{' statement+ '}';
variable	: (NAME | INTERP_NAME) '=' expression;
template	: TEMPLATE NAME '(' (NAME (',' NAME)*)? ')' block;
invocation	: NAME '(' (math (',' math)*)? ')';

expression : ternary | primitive | math;

ternary		: cond = math '?' tbranch = math ':' fbranch = math;
primitive	: PRIMITIVE attributeBlock;

math:
	NUMBER										# Number
	| '-'? NAME									# Name
	| STRING									# String
	| '[' math math math ']'					# Vector3
	| '[' math math math math ']'				# Vector4
	| '(' inner = expression ')'				# Parentheses
	| left = math operator = '^' right = math	# Power
	| left = math operator = '*' right = math	# Multiplication
	| left = math operator = '/' right = math	# Division
	| left = math operator = '+' right = math	# Addition
	| left = math operator = '-' right = math	# Subtraction;

// Keywords
TEMPLATE	: 'template';
FOR			: 'for';
IF			: 'if';
ELSE		: 'else';

// Literals
PRIMITIVE:
	'Cuboid'
	| 'Ellipsoid'
	| 'Cylinder'
	| 'Mesh'
	| 'Revolute';

MODEL	: 'Model';
UNITS	: 'mm' | 'cm' | 'm' | 'in' | 'ft';

INTERP_NAME	: '`' (~'`' | '\\`')* '`';
NAME		: [a-zA-Z]+ [a-zA-Z0-9_]*;

STRING : '"' (~'"' | '\\"')* '"';

COLOR			: '#' HEX HEX HEX HEX HEX HEX;
fragment HEX	: [0-9A-F];

NUMBER			: '-'? DIGITS ('.' ZERO* DIGITS EXP? | EXP)?;
fragment EXP	: [Ee] [+\-]? DIGITS;
fragment DIGITS	: ZERO | [1-9] [0-9]*;
fragment ZERO	: '0';

BLOCK_COMMENT	: '[-' .*? '-]' -> skip;
LINE_COMMENT	: '--' ~[\r\n]* -> skip;

WHITESPACE : [ \tr\n]+ -> skip;
