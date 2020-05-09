grammar arms;

// templates first?
program		: modelBlock NEWLINE (declaration NEWLINE)+;
modelBlock	: NAME '=' 'Model' '{' 'units' '=' UNITS NEWLINE '}';

declaration : block | assignment | template;

block : '{' declaration NEWLINE '}';

assignment : NAME '=' expression;

expression : math | primitive | templateCall;

math:
	NUMBER										# Number
	| NAME										# Name
	| '(' inner = expression ')'				# Parentheses
	| left = math operator = '^' right = math	# Power
	| left = math operator = '*' right = math	# Multiplication
	| left = math operator = '/' right = math	# Division
	| left = math operator = '+' right = math	# Addition
	| left = math operator = '-' right = math	# Subtraction;

primitive : cuboid | ellipsoid | cylinder | mesh;
cuboid:
	'Cuboid' '{' 'size' '=' vec3 NEWLINE commonAttributes NEWLINE '}';
ellipsoid:
	'Ellipsoid' '{' 'radii' '=' vec3 NEWLINE commonAttributes NEWLINE '}';
cylinder:
	'Cylinder' '{' 'radius1' '=' NUMBER NEWLINE 'radius2' '=' NUMBER NEWLINE 'height' '=' NUMBER
		'axis' '=' ('x' | 'y') commonAttributes NEWLINE '}';
mesh:
	'Mesh' '{' 'uri' '=' STRING NEWLINE commonAttributes NEWLINE '}';
commonAttributes:
	'position' '=' vec3 NEWLINE 'quaternion' '=' vec4 NEWLINE 'color' '=' COLOR NEWLINE 'parent' '='
		NAME NEWLINE 'positioning' '=' ('relative' | 'absolute') NEWLINE;

template		: 'Template' NAME '(' parameters ')' block;
templateCall	: NAME '(' arguments ')' updates;
parameters		: (NAME (',' NAME)*)?;
arguments		: (arg (',' arg))?;
updates			: ('&' NAME '=' arg)*;
arg				: math | STRING | vec3 | vec4;

vec4	: NUMBER NUMBER NUMBER NUMBER;
vec3	: NUMBER NUMBER NUMBER;

UNITS	: 'mm' | 'cm' | 'm' | 'in' | 'ft';
NAME	: [a-zA-Z_]+ [a-zA-Z0-9_]*;
QNAME	: '"' NAME '"';
STRING	: '"' (~'"' | '\\"')* '"';

NUMBER			: '-'? DIGITS ('.' ZERO* DIGITS EXP? | EXP);
fragment EXP	: [Ee] [+\-]? DIGITS;
fragment DIGITS	: ZERO | [1-9] [0-9]*;
fragment ZERO	: '0';

BLOCK_COMMENT	: '[-' .*? '-]' -> skip;
LINE_COMMENT	: '--' ~[\r\n]* -> skip;

NEWLINE		: [\r\n]+;
WHITESPACE	: [ \t]+ -> skip;
