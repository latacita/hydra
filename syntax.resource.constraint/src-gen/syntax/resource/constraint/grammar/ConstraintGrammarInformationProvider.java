/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static ConstraintGrammarInformationProvider INSTANCE = new ConstraintGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_0_0_0_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("import", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintPlaceholder CONSTRAINT_0_0_0_1 = new syntax.resource.constraint.grammar.ConstraintPlaceholder(syntax.SyntaxPackage.eINSTANCE.getModel().getEStructuralFeature(syntax.SyntaxPackage.MODEL__FEATURE_LIST), "TEXT", syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_0_0_0_2 = new syntax.resource.constraint.grammar.ConstraintKeyword(";", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_0_0_0_3_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getModel().getEStructuralFeature(syntax.SyntaxPackage.MODEL__CONSTRAINTS), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_0_0_0_3_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword(";", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_0_0_0_3_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_0_0_0_3_0_0_0, CONSTRAINT_0_0_0_3_0_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_0_0_0_3_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_0_0_0_3_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintCompound CONSTRAINT_0_0_0_3 = new syntax.resource.constraint.grammar.ConstraintCompound(CONSTRAINT_0_0_0_3_0, syntax.resource.constraint.grammar.ConstraintCardinality.STAR);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_0_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_0_0_0_0, CONSTRAINT_0_0_0_1, CONSTRAINT_0_0_0_2, CONSTRAINT_0_0_0_3);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_0_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_0 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getModel(), CONSTRAINT_0_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_1_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getConstraint().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_1_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_1_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_1_0_1_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("(", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_1_0_1_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getConstraint().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_1_0_1_2 = new syntax.resource.constraint.grammar.ConstraintKeyword(")", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_1_0_1 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_1_0_1_0, CONSTRAINT_1_0_1_1, CONSTRAINT_1_0_1_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_1_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_1_0_0, CONSTRAINT_1_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_1 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getConstraint(), CONSTRAINT_1_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_2_0_0_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("(", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_2_0_0_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand1().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_2_0_0_2 = new syntax.resource.constraint.grammar.ConstraintKeyword(")", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_2_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_2_0_0_0, CONSTRAINT_2_0_0_1, CONSTRAINT_2_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_2_0_1_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand1().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_2_0_1 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_2_0_1_0);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_2_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_2_0_0, CONSTRAINT_2_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_2 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand1(), CONSTRAINT_2_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_3_0_0_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("(", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_3_0_0_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand2().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_3_0_0_2 = new syntax.resource.constraint.grammar.ConstraintKeyword(")", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_3_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_3_0_0_0, CONSTRAINT_3_0_0_1, CONSTRAINT_3_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_3_0_1_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand2().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_3_0_1 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_3_0_1_0);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_3_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_3_0_0, CONSTRAINT_3_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_3 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand2(), CONSTRAINT_3_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_4_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand1().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_4_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_4_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_4_0_1_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("(", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_4_0_1_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand1().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_4_0_1_2 = new syntax.resource.constraint.grammar.ConstraintKeyword(")", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_4_0_1 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_4_0_1_0, CONSTRAINT_4_0_1_1, CONSTRAINT_4_0_1_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_4_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_4_0_0, CONSTRAINT_4_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_4 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand1(), CONSTRAINT_4_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_5_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand2().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_5_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_5_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_5_0_1_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("(", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_5_0_1_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand2().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_5_0_1_2 = new syntax.resource.constraint.grammar.ConstraintKeyword(")", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_5_0_1 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_5_0_1_0, CONSTRAINT_5_0_1_1, CONSTRAINT_5_0_1_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_5_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_5_0_0, CONSTRAINT_5_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_5 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand2(), CONSTRAINT_5_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_6_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getAnd().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_6_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("and", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_6_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getAnd().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_6_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_6_0_0_0, CONSTRAINT_6_0_0_1, CONSTRAINT_6_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_6_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_6_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_6 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getAnd(), CONSTRAINT_6_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_7_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getOr().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_7_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("or", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_7_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getOr().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_7_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_7_0_0_0, CONSTRAINT_7_0_0_1, CONSTRAINT_7_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_7_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_7_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_7 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getOr(), CONSTRAINT_7_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_8_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getXor().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_8_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("xor", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_8_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getXor().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_8_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_8_0_0_0, CONSTRAINT_8_0_0_1, CONSTRAINT_8_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_8_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_8_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_8 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getXor(), CONSTRAINT_8_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_9_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getImplies().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_9_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("implies", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_9_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getImplies().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_9_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_9_0_0_0, CONSTRAINT_9_0_0_1, CONSTRAINT_9_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_9_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_9_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_9 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getImplies(), CONSTRAINT_9_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_10_0_0_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("!", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_10_0_0_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNeg().getEStructuralFeature(syntax.SyntaxPackage.NEG__UNARY_OP), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_10_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_10_0_0_0, CONSTRAINT_10_0_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_10_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_10_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_10 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getNeg(), CONSTRAINT_10_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_11_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getPlus().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_11_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("+", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_11_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getPlus().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_11_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_11_0_0_0, CONSTRAINT_11_0_0_1, CONSTRAINT_11_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_11_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_11_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_11 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getPlus(), CONSTRAINT_11_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_12_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMinus().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_12_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("-", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_12_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMinus().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_12_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_12_0_0_0, CONSTRAINT_12_0_0_1, CONSTRAINT_12_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_12_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_12_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_12 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getMinus(), CONSTRAINT_12_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_13_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMul().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_13_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("*", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_13_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMul().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_13_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_13_0_0_0, CONSTRAINT_13_0_0_1, CONSTRAINT_13_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_13_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_13_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_13 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getMul(), CONSTRAINT_13_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_14_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getDiv().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_14_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("/", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_14_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getDiv().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_14_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_14_0_0_0, CONSTRAINT_14_0_0_1, CONSTRAINT_14_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_14_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_14_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_14 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getDiv(), CONSTRAINT_14_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_15_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getContext().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_15_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("[", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_15_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getContext().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_15_0_0_3 = new syntax.resource.constraint.grammar.ConstraintKeyword("]", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_15_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_15_0_0_0, CONSTRAINT_15_0_0_1, CONSTRAINT_15_0_0_2, CONSTRAINT_15_0_0_3);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_15_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_15_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_15 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getContext(), CONSTRAINT_15_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_16_0_0_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("all", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_16_0_0_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getAll().getEStructuralFeature(syntax.SyntaxPackage.ALL__SELECTION_OP), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_16_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_16_0_0_0, CONSTRAINT_16_0_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_16_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_16_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_16 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getAll(), CONSTRAINT_16_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_17_0_0_0 = new syntax.resource.constraint.grammar.ConstraintKeyword("any", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_17_0_0_1 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getAny().getEStructuralFeature(syntax.SyntaxPackage.ANY__SELECTION_OP), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_17_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_17_0_0_0, CONSTRAINT_17_0_0_1);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_17_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_17_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_17 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getAny(), CONSTRAINT_17_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_18_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMore().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_18_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword(">", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_18_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMore().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_18_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_18_0_0_0, CONSTRAINT_18_0_0_1, CONSTRAINT_18_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_18_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_18_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_18 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getMore(), CONSTRAINT_18_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_19_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMoreOrEqual().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_19_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword(">=", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_19_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getMoreOrEqual().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_19_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_19_0_0_0, CONSTRAINT_19_0_0_1, CONSTRAINT_19_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_19_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_19_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_19 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getMoreOrEqual(), CONSTRAINT_19_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_20_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getLess().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_20_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("<", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_20_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getLess().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_20_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_20_0_0_0, CONSTRAINT_20_0_0_1, CONSTRAINT_20_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_20_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_20_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_20 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getLess(), CONSTRAINT_20_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_21_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getLessOrEqual().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_21_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("<=", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_21_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getLessOrEqual().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_21_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_21_0_0_0, CONSTRAINT_21_0_0_1, CONSTRAINT_21_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_21_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_21_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_21 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getLessOrEqual(), CONSTRAINT_21_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_22_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNotEqual().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_22_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("!=", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_22_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getNotEqual().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_22_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_22_0_0_0, CONSTRAINT_22_0_0_1, CONSTRAINT_22_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_22_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_22_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_22 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getNotEqual(), CONSTRAINT_22_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_23_0_0_0 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getEqual().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP1), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintKeyword CONSTRAINT_23_0_0_1 = new syntax.resource.constraint.grammar.ConstraintKeyword("==", syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintContainment CONSTRAINT_23_0_0_2 = new syntax.resource.constraint.grammar.ConstraintContainment(syntax.SyntaxPackage.eINSTANCE.getEqual().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP2), syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_23_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_23_0_0_0, CONSTRAINT_23_0_0_1, CONSTRAINT_23_0_0_2);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_23_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_23_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_23 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getEqual(), CONSTRAINT_23_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintPlaceholder CONSTRAINT_24_0_0_0 = new syntax.resource.constraint.grammar.ConstraintPlaceholder(syntax.SyntaxPackage.eINSTANCE.getSimpleFeature().getEStructuralFeature(syntax.SyntaxPackage.SIMPLE_FEATURE__FEATURE_NAME), "TEXT", syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_24_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_24_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_24_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_24_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_24 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getSimpleFeature(), CONSTRAINT_24_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintPlaceholder CONSTRAINT_25_0_0_0 = new syntax.resource.constraint.grammar.ConstraintPlaceholder(syntax.SyntaxPackage.eINSTANCE.getMultipleFeature().getEStructuralFeature(syntax.SyntaxPackage.MULTIPLE_FEATURE__FEATURE_NAME), "TEXT", syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_25_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_25_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_25_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_25_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_25 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getMultipleFeature(), CONSTRAINT_25_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	public final static syntax.resource.constraint.grammar.ConstraintPlaceholder CONSTRAINT_26_0_0_0 = new syntax.resource.constraint.grammar.ConstraintPlaceholder(syntax.SyntaxPackage.eINSTANCE.getNumber().getEStructuralFeature(syntax.SyntaxPackage.NUMBER__NUM_VALUE), "DIGIT", syntax.resource.constraint.grammar.ConstraintCardinality.ONE, 0);
	public final static syntax.resource.constraint.grammar.ConstraintSequence CONSTRAINT_26_0_0 = new syntax.resource.constraint.grammar.ConstraintSequence(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_26_0_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintChoice CONSTRAINT_26_0 = new syntax.resource.constraint.grammar.ConstraintChoice(syntax.resource.constraint.grammar.ConstraintCardinality.ONE, CONSTRAINT_26_0_0);
	public final static syntax.resource.constraint.grammar.ConstraintRule CONSTRAINT_26 = new syntax.resource.constraint.grammar.ConstraintRule(syntax.SyntaxPackage.eINSTANCE.getNumber(), CONSTRAINT_26_0, syntax.resource.constraint.grammar.ConstraintCardinality.ONE);
	
	public final static syntax.resource.constraint.grammar.ConstraintRule[] RULES = new syntax.resource.constraint.grammar.ConstraintRule[] {
		CONSTRAINT_0,
		CONSTRAINT_1,
		CONSTRAINT_2,
		CONSTRAINT_3,
		CONSTRAINT_4,
		CONSTRAINT_5,
		CONSTRAINT_6,
		CONSTRAINT_7,
		CONSTRAINT_8,
		CONSTRAINT_9,
		CONSTRAINT_10,
		CONSTRAINT_11,
		CONSTRAINT_12,
		CONSTRAINT_13,
		CONSTRAINT_14,
		CONSTRAINT_15,
		CONSTRAINT_16,
		CONSTRAINT_17,
		CONSTRAINT_18,
		CONSTRAINT_19,
		CONSTRAINT_20,
		CONSTRAINT_21,
		CONSTRAINT_22,
		CONSTRAINT_23,
		CONSTRAINT_24,
		CONSTRAINT_25,
		CONSTRAINT_26,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (syntax.resource.constraint.grammar.ConstraintRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(syntax.resource.constraint.grammar.ConstraintSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof syntax.resource.constraint.grammar.ConstraintKeyword) {
			keywords.add(((syntax.resource.constraint.grammar.ConstraintKeyword) element).getValue());
		} else if (element instanceof syntax.resource.constraint.grammar.ConstraintBooleanTerminal) {
			keywords.add(((syntax.resource.constraint.grammar.ConstraintBooleanTerminal) element).getTrueLiteral());
			keywords.add(((syntax.resource.constraint.grammar.ConstraintBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof syntax.resource.constraint.grammar.ConstraintEnumerationTerminal) {
			syntax.resource.constraint.grammar.ConstraintEnumerationTerminal terminal = (syntax.resource.constraint.grammar.ConstraintEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (syntax.resource.constraint.grammar.ConstraintSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
