/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see syntax.SyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface SyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "syntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://constLang/syntax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "syntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyntaxPackage eINSTANCE = syntax.impl.SyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link syntax.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.ConstraintImpl
	 * @see syntax.impl.SyntaxPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OPERATORS = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link syntax.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.OperandImpl
	 * @see syntax.impl.SyntaxPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 1;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link syntax.impl.BoolOperandImpl <em>Bool Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.BoolOperandImpl
	 * @see syntax.impl.SyntaxPackageImpl#getBoolOperand()
	 * @generated
	 */
	int BOOL_OPERAND = 2;

	/**
	 * The number of structural features of the '<em>Bool Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.NumOperandImpl <em>Num Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NumOperandImpl
	 * @see syntax.impl.SyntaxPackageImpl#getNumOperand()
	 * @generated
	 */
	int NUM_OPERAND = 3;

	/**
	 * The number of structural features of the '<em>Num Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.NumOperandChoicesImpl <em>Num Operand Choices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NumOperandChoicesImpl
	 * @see syntax.impl.SyntaxPackageImpl#getNumOperandChoices()
	 * @generated
	 */
	int NUM_OPERAND_CHOICES = 32;

	/**
	 * The number of structural features of the '<em>Num Operand Choices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OPERAND_CHOICES_FEATURE_COUNT = NUM_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.MultipleFeatureImpl <em>Multiple Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.MultipleFeatureImpl
	 * @see syntax.impl.SyntaxPackageImpl#getMultipleFeature()
	 * @generated
	 */
	int MULTIPLE_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE__FEATURE_NAME = NUM_OPERAND_CHOICES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_FEATURE_COUNT = NUM_OPERAND_CHOICES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link syntax.impl.SimpleFeatureImpl <em>Simple Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.SimpleFeatureImpl
	 * @see syntax.impl.SyntaxPackageImpl#getSimpleFeature()
	 * @generated
	 */
	int SIMPLE_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__FEATURE_NAME = MULTIPLE_FEATURE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Simple Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_FEATURE_COUNT = MULTIPLE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NumberImpl
	 * @see syntax.impl.SyntaxPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Num Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NUM_VALUE = NUM_OPERAND_CHOICES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = NUM_OPERAND_CHOICES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link syntax.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.LogicalOperatorImpl
	 * @see syntax.impl.SyntaxPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 7;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = BOOL_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.UnaryOpImpl <em>Unary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.UnaryOpImpl
	 * @see syntax.impl.SyntaxPackageImpl#getUnaryOp()
	 * @generated
	 */
	int UNARY_OP = 8;

	/**
	 * The feature id for the '<em><b>Unary Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OP__UNARY_OP = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OP_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link syntax.impl.BinaryOpImpl <em>Binary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.BinaryOpImpl
	 * @see syntax.impl.SyntaxPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 9;

	/**
	 * The feature id for the '<em><b>Binary Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__BINARY_OP1 = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binary Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__BINARY_OP2 = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link syntax.impl.BoolOperandChoicesImpl <em>Bool Operand Choices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.BoolOperandChoicesImpl
	 * @see syntax.impl.SyntaxPackageImpl#getBoolOperandChoices()
	 * @generated
	 */
	int BOOL_OPERAND_CHOICES = 33;

	/**
	 * The number of structural features of the '<em>Bool Operand Choices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERAND_CHOICES_FEATURE_COUNT = BOOL_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.SelectionImpl
	 * @see syntax.impl.SyntaxPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 10;

	/**
	 * The feature id for the '<em><b>Selection Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTION_OP = BOOL_OPERAND_CHOICES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = BOOL_OPERAND_CHOICES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link syntax.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.ComparisonImpl
	 * @see syntax.impl.SyntaxPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 11;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMP_OP1 = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMP_OP2 = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link syntax.impl.NumOperatorImpl <em>Num Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NumOperatorImpl
	 * @see syntax.impl.SyntaxPackageImpl#getNumOperator()
	 * @generated
	 */
	int NUM_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Num Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OPERATOR__NUM_OP1 = NUM_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OPERATOR__NUM_OP2 = NUM_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Num Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OPERATOR_FEATURE_COUNT = NUM_OPERAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link syntax.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.DivImpl
	 * @see syntax.impl.SyntaxPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 13;

	/**
	 * The feature id for the '<em><b>Num Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__NUM_OP1 = NUM_OPERATOR__NUM_OP1;

	/**
	 * The feature id for the '<em><b>Num Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__NUM_OP2 = NUM_OPERATOR__NUM_OP2;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = NUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.PlusImpl
	 * @see syntax.impl.SyntaxPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 14;

	/**
	 * The feature id for the '<em><b>Num Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__NUM_OP1 = NUM_OPERATOR__NUM_OP1;

	/**
	 * The feature id for the '<em><b>Num Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__NUM_OP2 = NUM_OPERATOR__NUM_OP2;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = NUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.MulImpl <em>Mul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.MulImpl
	 * @see syntax.impl.SyntaxPackageImpl#getMul()
	 * @generated
	 */
	int MUL = 15;

	/**
	 * The feature id for the '<em><b>Num Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__NUM_OP1 = NUM_OPERATOR__NUM_OP1;

	/**
	 * The feature id for the '<em><b>Num Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__NUM_OP2 = NUM_OPERATOR__NUM_OP2;

	/**
	 * The number of structural features of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = NUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.MinusImpl
	 * @see syntax.impl.SyntaxPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 16;

	/**
	 * The feature id for the '<em><b>Num Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__NUM_OP1 = NUM_OPERATOR__NUM_OP1;

	/**
	 * The feature id for the '<em><b>Num Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__NUM_OP2 = NUM_OPERATOR__NUM_OP2;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = NUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.ContextImpl
	 * @see syntax.impl.SyntaxPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 17;

	/**
	 * The feature id for the '<em><b>Context Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_OP1 = BOOL_OPERAND_CHOICES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_OP2 = BOOL_OPERAND_CHOICES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = BOOL_OPERAND_CHOICES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link syntax.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.AllImpl
	 * @see syntax.impl.SyntaxPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 18;

	/**
	 * The feature id for the '<em><b>Selection Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__SELECTION_OP = SELECTION__SELECTION_OP;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = SELECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.AnyImpl
	 * @see syntax.impl.SyntaxPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 19;

	/**
	 * The feature id for the '<em><b>Selection Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__SELECTION_OP = SELECTION__SELECTION_OP;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = SELECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.NegImpl <em>Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NegImpl
	 * @see syntax.impl.SyntaxPackageImpl#getNeg()
	 * @generated
	 */
	int NEG = 20;

	/**
	 * The feature id for the '<em><b>Unary Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG__UNARY_OP = UNARY_OP__UNARY_OP;

	/**
	 * The number of structural features of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_FEATURE_COUNT = UNARY_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.AndImpl
	 * @see syntax.impl.SyntaxPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 21;

	/**
	 * The feature id for the '<em><b>Binary Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__BINARY_OP1 = BINARY_OP__BINARY_OP1;

	/**
	 * The feature id for the '<em><b>Binary Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__BINARY_OP2 = BINARY_OP__BINARY_OP2;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.OrImpl
	 * @see syntax.impl.SyntaxPackageImpl#getOr()
	 * @generated
	 */
	int OR = 22;

	/**
	 * The feature id for the '<em><b>Binary Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__BINARY_OP1 = BINARY_OP__BINARY_OP1;

	/**
	 * The feature id for the '<em><b>Binary Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__BINARY_OP2 = BINARY_OP__BINARY_OP2;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.XorImpl
	 * @see syntax.impl.SyntaxPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 23;

	/**
	 * The feature id for the '<em><b>Binary Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__BINARY_OP1 = BINARY_OP__BINARY_OP1;

	/**
	 * The feature id for the '<em><b>Binary Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__BINARY_OP2 = BINARY_OP__BINARY_OP2;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.ImpliesImpl
	 * @see syntax.impl.SyntaxPackageImpl#getImplies()
	 * @generated
	 */
	int IMPLIES = 24;

	/**
	 * The feature id for the '<em><b>Binary Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__BINARY_OP1 = BINARY_OP__BINARY_OP1;

	/**
	 * The feature id for the '<em><b>Binary Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__BINARY_OP2 = BINARY_OP__BINARY_OP2;

	/**
	 * The number of structural features of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.MoreImpl <em>More</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.MoreImpl
	 * @see syntax.impl.SyntaxPackageImpl#getMore()
	 * @generated
	 */
	int MORE = 25;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE__COMP_OP1 = COMPARISON__COMP_OP1;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE__COMP_OP2 = COMPARISON__COMP_OP2;

	/**
	 * The number of structural features of the '<em>More</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.LessOrEqualImpl
	 * @see syntax.impl.SyntaxPackageImpl#getLessOrEqual()
	 * @generated
	 */
	int LESS_OR_EQUAL = 26;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__COMP_OP1 = COMPARISON__COMP_OP1;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__COMP_OP2 = COMPARISON__COMP_OP2;

	/**
	 * The number of structural features of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.LessImpl
	 * @see syntax.impl.SyntaxPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 27;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__COMP_OP1 = COMPARISON__COMP_OP1;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__COMP_OP2 = COMPARISON__COMP_OP2;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.NotEqualImpl <em>Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NotEqualImpl
	 * @see syntax.impl.SyntaxPackageImpl#getNotEqual()
	 * @generated
	 */
	int NOT_EQUAL = 28;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__COMP_OP1 = COMPARISON__COMP_OP1;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__COMP_OP2 = COMPARISON__COMP_OP2;

	/**
	 * The number of structural features of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.EqualImpl
	 * @see syntax.impl.SyntaxPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 29;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__COMP_OP1 = COMPARISON__COMP_OP1;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__COMP_OP2 = COMPARISON__COMP_OP2;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.MoreOrEqualImpl <em>More Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.MoreOrEqualImpl
	 * @see syntax.impl.SyntaxPackageImpl#getMoreOrEqual()
	 * @generated
	 */
	int MORE_OR_EQUAL = 30;

	/**
	 * The feature id for the '<em><b>Comp Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL__COMP_OP1 = COMPARISON__COMP_OP1;

	/**
	 * The feature id for the '<em><b>Comp Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL__COMP_OP2 = COMPARISON__COMP_OP2;

	/**
	 * The number of structural features of the '<em>More Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link syntax.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.ModelImpl
	 * @see syntax.impl.SyntaxPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 31;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Feature List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FEATURE_LIST = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link syntax.impl.BoolPriorityOperand1Impl <em>Bool Priority Operand1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.BoolPriorityOperand1Impl
	 * @see syntax.impl.SyntaxPackageImpl#getBoolPriorityOperand1()
	 * @generated
	 */
	int BOOL_PRIORITY_OPERAND1 = 34;

	/**
	 * The feature id for the '<em><b>Bool Priority Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1 = 0;

	/**
	 * The number of structural features of the '<em>Bool Priority Operand1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PRIORITY_OPERAND1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link syntax.impl.NumPriorityOperand2Impl <em>Num Priority Operand2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NumPriorityOperand2Impl
	 * @see syntax.impl.SyntaxPackageImpl#getNumPriorityOperand2()
	 * @generated
	 */
	int NUM_PRIORITY_OPERAND2 = 35;

	/**
	 * The feature id for the '<em><b>Num Priority Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2 = 0;

	/**
	 * The number of structural features of the '<em>Num Priority Operand2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PRIORITY_OPERAND2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link syntax.impl.BoolPriorityOperand2Impl <em>Bool Priority Operand2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.BoolPriorityOperand2Impl
	 * @see syntax.impl.SyntaxPackageImpl#getBoolPriorityOperand2()
	 * @generated
	 */
	int BOOL_PRIORITY_OPERAND2 = 36;

	/**
	 * The feature id for the '<em><b>Bool Priority Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2 = 0;

	/**
	 * The number of structural features of the '<em>Bool Priority Operand2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PRIORITY_OPERAND2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link syntax.impl.NumPriorityOperand1Impl <em>Num Priority Operand1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see syntax.impl.NumPriorityOperand1Impl
	 * @see syntax.impl.SyntaxPackageImpl#getNumPriorityOperand1()
	 * @generated
	 */
	int NUM_PRIORITY_OPERAND1 = 37;

	/**
	 * The feature id for the '<em><b>Num Priority Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1 = 0;

	/**
	 * The number of structural features of the '<em>Num Priority Operand1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PRIORITY_OPERAND1_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link syntax.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see syntax.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.Constraint#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operators</em>'.
	 * @see syntax.Constraint#getOperators()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Operators();

	/**
	 * Returns the meta object for class '{@link syntax.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see syntax.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for class '{@link syntax.BoolOperand <em>Bool Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Operand</em>'.
	 * @see syntax.BoolOperand
	 * @generated
	 */
	EClass getBoolOperand();

	/**
	 * Returns the meta object for class '{@link syntax.NumOperand <em>Num Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Operand</em>'.
	 * @see syntax.NumOperand
	 * @generated
	 */
	EClass getNumOperand();

	/**
	 * Returns the meta object for class '{@link syntax.SimpleFeature <em>Simple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Feature</em>'.
	 * @see syntax.SimpleFeature
	 * @generated
	 */
	EClass getSimpleFeature();

	/**
	 * Returns the meta object for class '{@link syntax.MultipleFeature <em>Multiple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Feature</em>'.
	 * @see syntax.MultipleFeature
	 * @generated
	 */
	EClass getMultipleFeature();

	/**
	 * Returns the meta object for the attribute '{@link syntax.MultipleFeature#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see syntax.MultipleFeature#getFeatureName()
	 * @see #getMultipleFeature()
	 * @generated
	 */
	EAttribute getMultipleFeature_FeatureName();

	/**
	 * Returns the meta object for class '{@link syntax.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see syntax.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link syntax.Number#getNumValue <em>Num Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Value</em>'.
	 * @see syntax.Number#getNumValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_NumValue();

	/**
	 * Returns the meta object for class '{@link syntax.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see syntax.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link syntax.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Op</em>'.
	 * @see syntax.UnaryOp
	 * @generated
	 */
	EClass getUnaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.UnaryOp#getUnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Op</em>'.
	 * @see syntax.UnaryOp#getUnaryOp()
	 * @see #getUnaryOp()
	 * @generated
	 */
	EReference getUnaryOp_UnaryOp();

	/**
	 * Returns the meta object for class '{@link syntax.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Op</em>'.
	 * @see syntax.BinaryOp
	 * @generated
	 */
	EClass getBinaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.BinaryOp#getBinaryOp1 <em>Binary Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Op1</em>'.
	 * @see syntax.BinaryOp#getBinaryOp1()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_BinaryOp1();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.BinaryOp#getBinaryOp2 <em>Binary Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Op2</em>'.
	 * @see syntax.BinaryOp#getBinaryOp2()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_BinaryOp2();

	/**
	 * Returns the meta object for class '{@link syntax.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see syntax.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.Selection#getSelectionOp <em>Selection Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection Op</em>'.
	 * @see syntax.Selection#getSelectionOp()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_SelectionOp();

	/**
	 * Returns the meta object for class '{@link syntax.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see syntax.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.Comparison#getCompOp1 <em>Comp Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comp Op1</em>'.
	 * @see syntax.Comparison#getCompOp1()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_CompOp1();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.Comparison#getCompOp2 <em>Comp Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comp Op2</em>'.
	 * @see syntax.Comparison#getCompOp2()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_CompOp2();

	/**
	 * Returns the meta object for class '{@link syntax.NumOperator <em>Num Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Operator</em>'.
	 * @see syntax.NumOperator
	 * @generated
	 */
	EClass getNumOperator();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.NumOperator#getNumOp1 <em>Num Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Op1</em>'.
	 * @see syntax.NumOperator#getNumOp1()
	 * @see #getNumOperator()
	 * @generated
	 */
	EReference getNumOperator_NumOp1();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.NumOperator#getNumOp2 <em>Num Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Op2</em>'.
	 * @see syntax.NumOperator#getNumOp2()
	 * @see #getNumOperator()
	 * @generated
	 */
	EReference getNumOperator_NumOp2();

	/**
	 * Returns the meta object for class '{@link syntax.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see syntax.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link syntax.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see syntax.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link syntax.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul</em>'.
	 * @see syntax.Mul
	 * @generated
	 */
	EClass getMul();

	/**
	 * Returns the meta object for class '{@link syntax.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see syntax.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link syntax.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see syntax.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.Context#getContextOp1 <em>Context Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Op1</em>'.
	 * @see syntax.Context#getContextOp1()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextOp1();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.Context#getContextOp2 <em>Context Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Op2</em>'.
	 * @see syntax.Context#getContextOp2()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextOp2();

	/**
	 * Returns the meta object for class '{@link syntax.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see syntax.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for class '{@link syntax.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see syntax.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link syntax.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg</em>'.
	 * @see syntax.Neg
	 * @generated
	 */
	EClass getNeg();

	/**
	 * Returns the meta object for class '{@link syntax.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see syntax.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link syntax.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see syntax.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link syntax.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see syntax.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for class '{@link syntax.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see syntax.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for class '{@link syntax.More <em>More</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>More</em>'.
	 * @see syntax.More
	 * @generated
	 */
	EClass getMore();

	/**
	 * Returns the meta object for class '{@link syntax.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal</em>'.
	 * @see syntax.LessOrEqual
	 * @generated
	 */
	EClass getLessOrEqual();

	/**
	 * Returns the meta object for class '{@link syntax.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see syntax.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link syntax.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see syntax.NotEqual
	 * @generated
	 */
	EClass getNotEqual();

	/**
	 * Returns the meta object for class '{@link syntax.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see syntax.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link syntax.MoreOrEqual <em>More Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>More Or Equal</em>'.
	 * @see syntax.MoreOrEqual
	 * @generated
	 */
	EClass getMoreOrEqual();

	/**
	 * Returns the meta object for class '{@link syntax.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see syntax.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link syntax.Model#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see syntax.Model#getConstraints()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link syntax.Model#getFeatureList <em>Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature List</em>'.
	 * @see syntax.Model#getFeatureList()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_FeatureList();

	/**
	 * Returns the meta object for class '{@link syntax.NumOperandChoices <em>Num Operand Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Operand Choices</em>'.
	 * @see syntax.NumOperandChoices
	 * @generated
	 */
	EClass getNumOperandChoices();

	/**
	 * Returns the meta object for class '{@link syntax.BoolOperandChoices <em>Bool Operand Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Operand Choices</em>'.
	 * @see syntax.BoolOperandChoices
	 * @generated
	 */
	EClass getBoolOperandChoices();

	/**
	 * Returns the meta object for class '{@link syntax.BoolPriorityOperand1 <em>Bool Priority Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Priority Operand1</em>'.
	 * @see syntax.BoolPriorityOperand1
	 * @generated
	 */
	EClass getBoolPriorityOperand1();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.BoolPriorityOperand1#getBoolPriorityOp1 <em>Bool Priority Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Priority Op1</em>'.
	 * @see syntax.BoolPriorityOperand1#getBoolPriorityOp1()
	 * @see #getBoolPriorityOperand1()
	 * @generated
	 */
	EReference getBoolPriorityOperand1_BoolPriorityOp1();

	/**
	 * Returns the meta object for class '{@link syntax.NumPriorityOperand2 <em>Num Priority Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Priority Operand2</em>'.
	 * @see syntax.NumPriorityOperand2
	 * @generated
	 */
	EClass getNumPriorityOperand2();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.NumPriorityOperand2#getNumPriorityOp2 <em>Num Priority Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Priority Op2</em>'.
	 * @see syntax.NumPriorityOperand2#getNumPriorityOp2()
	 * @see #getNumPriorityOperand2()
	 * @generated
	 */
	EReference getNumPriorityOperand2_NumPriorityOp2();

	/**
	 * Returns the meta object for class '{@link syntax.BoolPriorityOperand2 <em>Bool Priority Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Priority Operand2</em>'.
	 * @see syntax.BoolPriorityOperand2
	 * @generated
	 */
	EClass getBoolPriorityOperand2();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.BoolPriorityOperand2#getBoolPriorityOp2 <em>Bool Priority Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Priority Op2</em>'.
	 * @see syntax.BoolPriorityOperand2#getBoolPriorityOp2()
	 * @see #getBoolPriorityOperand2()
	 * @generated
	 */
	EReference getBoolPriorityOperand2_BoolPriorityOp2();

	/**
	 * Returns the meta object for class '{@link syntax.NumPriorityOperand1 <em>Num Priority Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Priority Operand1</em>'.
	 * @see syntax.NumPriorityOperand1
	 * @generated
	 */
	EClass getNumPriorityOperand1();

	/**
	 * Returns the meta object for the containment reference '{@link syntax.NumPriorityOperand1#getNumPriorityOp1 <em>Num Priority Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Priority Op1</em>'.
	 * @see syntax.NumPriorityOperand1#getNumPriorityOp1()
	 * @see #getNumPriorityOperand1()
	 * @generated
	 */
	EReference getNumPriorityOperand1_NumPriorityOp1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SyntaxFactory getSyntaxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link syntax.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.ConstraintImpl
		 * @see syntax.impl.SyntaxPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OPERATORS = eINSTANCE.getConstraint_Operators();

		/**
		 * The meta object literal for the '{@link syntax.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.OperandImpl
		 * @see syntax.impl.SyntaxPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '{@link syntax.impl.BoolOperandImpl <em>Bool Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.BoolOperandImpl
		 * @see syntax.impl.SyntaxPackageImpl#getBoolOperand()
		 * @generated
		 */
		EClass BOOL_OPERAND = eINSTANCE.getBoolOperand();

		/**
		 * The meta object literal for the '{@link syntax.impl.NumOperandImpl <em>Num Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NumOperandImpl
		 * @see syntax.impl.SyntaxPackageImpl#getNumOperand()
		 * @generated
		 */
		EClass NUM_OPERAND = eINSTANCE.getNumOperand();

		/**
		 * The meta object literal for the '{@link syntax.impl.SimpleFeatureImpl <em>Simple Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.SimpleFeatureImpl
		 * @see syntax.impl.SyntaxPackageImpl#getSimpleFeature()
		 * @generated
		 */
		EClass SIMPLE_FEATURE = eINSTANCE.getSimpleFeature();

		/**
		 * The meta object literal for the '{@link syntax.impl.MultipleFeatureImpl <em>Multiple Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.MultipleFeatureImpl
		 * @see syntax.impl.SyntaxPackageImpl#getMultipleFeature()
		 * @generated
		 */
		EClass MULTIPLE_FEATURE = eINSTANCE.getMultipleFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_FEATURE__FEATURE_NAME = eINSTANCE.getMultipleFeature_FeatureName();

		/**
		 * The meta object literal for the '{@link syntax.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NumberImpl
		 * @see syntax.impl.SyntaxPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Num Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__NUM_VALUE = eINSTANCE.getNumber_NumValue();

		/**
		 * The meta object literal for the '{@link syntax.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.LogicalOperatorImpl
		 * @see syntax.impl.SyntaxPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link syntax.impl.UnaryOpImpl <em>Unary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.UnaryOpImpl
		 * @see syntax.impl.SyntaxPackageImpl#getUnaryOp()
		 * @generated
		 */
		EClass UNARY_OP = eINSTANCE.getUnaryOp();

		/**
		 * The meta object literal for the '<em><b>Unary Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OP__UNARY_OP = eINSTANCE.getUnaryOp_UnaryOp();

		/**
		 * The meta object literal for the '{@link syntax.impl.BinaryOpImpl <em>Binary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.BinaryOpImpl
		 * @see syntax.impl.SyntaxPackageImpl#getBinaryOp()
		 * @generated
		 */
		EClass BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '<em><b>Binary Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__BINARY_OP1 = eINSTANCE.getBinaryOp_BinaryOp1();

		/**
		 * The meta object literal for the '<em><b>Binary Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__BINARY_OP2 = eINSTANCE.getBinaryOp_BinaryOp2();

		/**
		 * The meta object literal for the '{@link syntax.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.SelectionImpl
		 * @see syntax.impl.SyntaxPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Selection Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECTION_OP = eINSTANCE.getSelection_SelectionOp();

		/**
		 * The meta object literal for the '{@link syntax.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.ComparisonImpl
		 * @see syntax.impl.SyntaxPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Comp Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__COMP_OP1 = eINSTANCE.getComparison_CompOp1();

		/**
		 * The meta object literal for the '<em><b>Comp Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__COMP_OP2 = eINSTANCE.getComparison_CompOp2();

		/**
		 * The meta object literal for the '{@link syntax.impl.NumOperatorImpl <em>Num Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NumOperatorImpl
		 * @see syntax.impl.SyntaxPackageImpl#getNumOperator()
		 * @generated
		 */
		EClass NUM_OPERATOR = eINSTANCE.getNumOperator();

		/**
		 * The meta object literal for the '<em><b>Num Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_OPERATOR__NUM_OP1 = eINSTANCE.getNumOperator_NumOp1();

		/**
		 * The meta object literal for the '<em><b>Num Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_OPERATOR__NUM_OP2 = eINSTANCE.getNumOperator_NumOp2();

		/**
		 * The meta object literal for the '{@link syntax.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.DivImpl
		 * @see syntax.impl.SyntaxPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link syntax.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.PlusImpl
		 * @see syntax.impl.SyntaxPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link syntax.impl.MulImpl <em>Mul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.MulImpl
		 * @see syntax.impl.SyntaxPackageImpl#getMul()
		 * @generated
		 */
		EClass MUL = eINSTANCE.getMul();

		/**
		 * The meta object literal for the '{@link syntax.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.MinusImpl
		 * @see syntax.impl.SyntaxPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link syntax.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.ContextImpl
		 * @see syntax.impl.SyntaxPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Context Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_OP1 = eINSTANCE.getContext_ContextOp1();

		/**
		 * The meta object literal for the '<em><b>Context Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_OP2 = eINSTANCE.getContext_ContextOp2();

		/**
		 * The meta object literal for the '{@link syntax.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.AllImpl
		 * @see syntax.impl.SyntaxPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '{@link syntax.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.AnyImpl
		 * @see syntax.impl.SyntaxPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link syntax.impl.NegImpl <em>Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NegImpl
		 * @see syntax.impl.SyntaxPackageImpl#getNeg()
		 * @generated
		 */
		EClass NEG = eINSTANCE.getNeg();

		/**
		 * The meta object literal for the '{@link syntax.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.AndImpl
		 * @see syntax.impl.SyntaxPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link syntax.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.OrImpl
		 * @see syntax.impl.SyntaxPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link syntax.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.XorImpl
		 * @see syntax.impl.SyntaxPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '{@link syntax.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.ImpliesImpl
		 * @see syntax.impl.SyntaxPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '{@link syntax.impl.MoreImpl <em>More</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.MoreImpl
		 * @see syntax.impl.SyntaxPackageImpl#getMore()
		 * @generated
		 */
		EClass MORE = eINSTANCE.getMore();

		/**
		 * The meta object literal for the '{@link syntax.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.LessOrEqualImpl
		 * @see syntax.impl.SyntaxPackageImpl#getLessOrEqual()
		 * @generated
		 */
		EClass LESS_OR_EQUAL = eINSTANCE.getLessOrEqual();

		/**
		 * The meta object literal for the '{@link syntax.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.LessImpl
		 * @see syntax.impl.SyntaxPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link syntax.impl.NotEqualImpl <em>Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NotEqualImpl
		 * @see syntax.impl.SyntaxPackageImpl#getNotEqual()
		 * @generated
		 */
		EClass NOT_EQUAL = eINSTANCE.getNotEqual();

		/**
		 * The meta object literal for the '{@link syntax.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.EqualImpl
		 * @see syntax.impl.SyntaxPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link syntax.impl.MoreOrEqualImpl <em>More Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.MoreOrEqualImpl
		 * @see syntax.impl.SyntaxPackageImpl#getMoreOrEqual()
		 * @generated
		 */
		EClass MORE_OR_EQUAL = eINSTANCE.getMoreOrEqual();

		/**
		 * The meta object literal for the '{@link syntax.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.ModelImpl
		 * @see syntax.impl.SyntaxPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONSTRAINTS = eINSTANCE.getModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Feature List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__FEATURE_LIST = eINSTANCE.getModel_FeatureList();

		/**
		 * The meta object literal for the '{@link syntax.impl.NumOperandChoicesImpl <em>Num Operand Choices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NumOperandChoicesImpl
		 * @see syntax.impl.SyntaxPackageImpl#getNumOperandChoices()
		 * @generated
		 */
		EClass NUM_OPERAND_CHOICES = eINSTANCE.getNumOperandChoices();

		/**
		 * The meta object literal for the '{@link syntax.impl.BoolOperandChoicesImpl <em>Bool Operand Choices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.BoolOperandChoicesImpl
		 * @see syntax.impl.SyntaxPackageImpl#getBoolOperandChoices()
		 * @generated
		 */
		EClass BOOL_OPERAND_CHOICES = eINSTANCE.getBoolOperandChoices();

		/**
		 * The meta object literal for the '{@link syntax.impl.BoolPriorityOperand1Impl <em>Bool Priority Operand1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.BoolPriorityOperand1Impl
		 * @see syntax.impl.SyntaxPackageImpl#getBoolPriorityOperand1()
		 * @generated
		 */
		EClass BOOL_PRIORITY_OPERAND1 = eINSTANCE.getBoolPriorityOperand1();

		/**
		 * The meta object literal for the '<em><b>Bool Priority Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1 = eINSTANCE.getBoolPriorityOperand1_BoolPriorityOp1();

		/**
		 * The meta object literal for the '{@link syntax.impl.NumPriorityOperand2Impl <em>Num Priority Operand2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NumPriorityOperand2Impl
		 * @see syntax.impl.SyntaxPackageImpl#getNumPriorityOperand2()
		 * @generated
		 */
		EClass NUM_PRIORITY_OPERAND2 = eINSTANCE.getNumPriorityOperand2();

		/**
		 * The meta object literal for the '<em><b>Num Priority Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2 = eINSTANCE.getNumPriorityOperand2_NumPriorityOp2();

		/**
		 * The meta object literal for the '{@link syntax.impl.BoolPriorityOperand2Impl <em>Bool Priority Operand2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.BoolPriorityOperand2Impl
		 * @see syntax.impl.SyntaxPackageImpl#getBoolPriorityOperand2()
		 * @generated
		 */
		EClass BOOL_PRIORITY_OPERAND2 = eINSTANCE.getBoolPriorityOperand2();

		/**
		 * The meta object literal for the '<em><b>Bool Priority Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2 = eINSTANCE.getBoolPriorityOperand2_BoolPriorityOp2();

		/**
		 * The meta object literal for the '{@link syntax.impl.NumPriorityOperand1Impl <em>Num Priority Operand1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see syntax.impl.NumPriorityOperand1Impl
		 * @see syntax.impl.SyntaxPackageImpl#getNumPriorityOperand1()
		 * @generated
		 */
		EClass NUM_PRIORITY_OPERAND1 = eINSTANCE.getNumPriorityOperand1();

		/**
		 * The meta object literal for the '<em><b>Num Priority Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1 = eINSTANCE.getNumPriorityOperand1_NumPriorityOp1();

	}

} //SyntaxPackage
