SYNTAXDEF constraint
FOR <http://constLang/syntax>
START Model

OPTIONS {
	usePredefinedTokens="true";
}

TOKENS {
    DEFINE DIGIT $('0'..'9')+$;
}

RULES {

Model::= "import" featureList[TEXT] ";" (constraints";")*;
Constraint::= operators | "(" operators ")";
BoolPriorityOperand1::= "(" boolPriorityOp1 ")" | boolPriorityOp1:BoolOperandChoices;
BoolPriorityOperand2::= "(" boolPriorityOp2 ")" | boolPriorityOp2;
NumPriorityOperand1::= numPriorityOp1:NumOperandChoices | "(" numPriorityOp1 ")";
NumPriorityOperand2::= numPriorityOp2 | "(" numPriorityOp2 ")";

	// Operaciones logicas
	And ::= binaryOp1 "and" binaryOp2;
	Or ::= binaryOp1 "or" binaryOp2;
	Xor ::= binaryOp1 "xor" binaryOp2;
	Implies ::= binaryOp1 "implies" binaryOp2;
	Neg ::= "!" unaryOp;
	
	// Operaciones numericas
	Plus ::= numOp1 "+" numOp2;
	Minus ::= numOp1 "-" numOp2;
	Mul ::= numOp1 "*" numOp2;
	Div ::= numOp1 "/" numOp2;
	
	// Operaciones de contexto	
	Context ::= contextOp1 "[" contextOp2 "]";
 	
 	// Operaciones de seleccion
 	All ::= "all" selectionOp;
	Any ::= "any" selectionOp;
		
	// Operaciones de comparacion
	More ::= compOp1 ">" compOp2;
	MoreOrEqual ::= compOp1 ">=" compOp2;
	Less ::= compOp1 "<" compOp2;
	LessOrEqual ::= compOp1 "<=" compOp2;
	NotEqual ::= compOp1 "!=" compOp2;
	Equal ::=  compOp1 "==" compOp2;

	// Operaciones primitivas	
	SimpleFeature ::= featureName[TEXT];	
	MultipleFeature ::= featureName[TEXT];		
	Number ::= numValue[DIGIT];			
}