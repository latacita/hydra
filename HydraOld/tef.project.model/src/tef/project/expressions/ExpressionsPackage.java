/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions;

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
 * @see tef.project.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.informatik.hu-berlin.de/sam/meta-tools/expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = tef.project.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.ExpressionImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.BinaryOperatorImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__OP1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__OP2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.UnaryOperatorImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.ImpliesImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getImplies()
	 * @generated
	 */
	int IMPLIES = 3;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__OP1 = BINARY_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__OP2 = BINARY_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.OrImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getOr()
	 * @generated
	 */
	int OR = 4;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OP1 = BINARY_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OP2 = BINARY_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.AndImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 5;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OP1 = BINARY_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OP2 = BINARY_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.NegImpl <em>Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.NegImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getNeg()
	 * @generated
	 */
	int NEG = 6;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG__OP = UNARY_OPERATOR__OP;

	/**
	 * The number of structural features of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.ModelImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 7;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.FeatureImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.QuantifyOperatorImpl <em>Quantify Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.QuantifyOperatorImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getQuantifyOperator()
	 * @generated
	 */
	int QUANTIFY_OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFY_OPERATOR__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantify Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.AllImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 9;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__OP = QUANTIFY_OPERATOR__OP;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = QUANTIFY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.NumberImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__OP = QUANTIFY_OPERATOR__OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = QUANTIFY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = QUANTIFY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.AnyImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 11;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__OP = QUANTIFY_OPERATOR__OP;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = QUANTIFY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.ComparisonOperatorImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__OP1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__OP2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.GEImpl <em>GE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.GEImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getGE()
	 * @generated
	 */
	int GE = 13;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE__OP1 = COMPARISON_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE__OP2 = COMPARISON_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>GE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.GImpl <em>G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.GImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getG()
	 * @generated
	 */
	int G = 14;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__OP1 = COMPARISON_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__OP2 = COMPARISON_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.LEImpl <em>LE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.LEImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getLE()
	 * @generated
	 */
	int LE = 15;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE__OP1 = COMPARISON_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE__OP2 = COMPARISON_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>LE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.LImpl <em>L</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.LImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getL()
	 * @generated
	 */
	int L = 16;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L__OP1 = COMPARISON_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L__OP2 = COMPARISON_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>L</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.EImpl <em>E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.EImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getE()
	 * @generated
	 */
	int E = 17;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E__OP1 = COMPARISON_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E__OP2 = COMPARISON_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.DImpl <em>D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.DImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getD()
	 * @generated
	 */
	int D = 18;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__OP1 = COMPARISON_OPERATOR__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__OP2 = COMPARISON_OPERATOR__OP2;

	/**
	 * The number of structural features of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.ComparisonOperandImpl <em>Comparison Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.ComparisonOperandImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getComparisonOperand()
	 * @generated
	 */
	int COMPARISON_OPERAND = 19;

	/**
	 * The number of structural features of the '<em>Comparison Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.QuantityImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = COMPARISON_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = COMPARISON_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.FunctionImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 21;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OP = COMPARISON_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = COMPARISON_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tef.project.expressions.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tef.project.expressions.impl.CountImpl
	 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 22;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__OP = FUNCTION__OP;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see tef.project.expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see tef.project.expressions.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.BinaryOperator#getOp1 <em>Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op1</em>'.
	 * @see tef.project.expressions.BinaryOperator#getOp1()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Op1();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.BinaryOperator#getOp2 <em>Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op2</em>'.
	 * @see tef.project.expressions.BinaryOperator#getOp2()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Op2();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see tef.project.expressions.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.UnaryOperator#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see tef.project.expressions.UnaryOperator#getOp()
	 * @see #getUnaryOperator()
	 * @generated
	 */
	EReference getUnaryOperator_Op();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see tef.project.expressions.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see tef.project.expressions.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see tef.project.expressions.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg</em>'.
	 * @see tef.project.expressions.Neg
	 * @generated
	 */
	EClass getNeg();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see tef.project.expressions.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tef.project.expressions.Model#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see tef.project.expressions.Model#getConstraints()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Constraints();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see tef.project.expressions.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link tef.project.expressions.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tef.project.expressions.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see tef.project.expressions.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see tef.project.expressions.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link tef.project.expressions.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tef.project.expressions.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see tef.project.expressions.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator</em>'.
	 * @see tef.project.expressions.ComparisonOperator
	 * @generated
	 */
	EClass getComparisonOperator();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.ComparisonOperator#getOp1 <em>Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op1</em>'.
	 * @see tef.project.expressions.ComparisonOperator#getOp1()
	 * @see #getComparisonOperator()
	 * @generated
	 */
	EReference getComparisonOperator_Op1();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.ComparisonOperator#getOp2 <em>Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op2</em>'.
	 * @see tef.project.expressions.ComparisonOperator#getOp2()
	 * @see #getComparisonOperator()
	 * @generated
	 */
	EReference getComparisonOperator_Op2();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.GE <em>GE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GE</em>'.
	 * @see tef.project.expressions.GE
	 * @generated
	 */
	EClass getGE();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.G <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G</em>'.
	 * @see tef.project.expressions.G
	 * @generated
	 */
	EClass getG();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.LE <em>LE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LE</em>'.
	 * @see tef.project.expressions.LE
	 * @generated
	 */
	EClass getLE();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.L <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>L</em>'.
	 * @see tef.project.expressions.L
	 * @generated
	 */
	EClass getL();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.E <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E</em>'.
	 * @see tef.project.expressions.E
	 * @generated
	 */
	EClass getE();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D</em>'.
	 * @see tef.project.expressions.D
	 * @generated
	 */
	EClass getD();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.ComparisonOperand <em>Comparison Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operand</em>'.
	 * @see tef.project.expressions.ComparisonOperand
	 * @generated
	 */
	EClass getComparisonOperand();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see tef.project.expressions.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tef.project.expressions.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tef.project.expressions.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see tef.project.expressions.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.Function#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see tef.project.expressions.Function#getOp()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Op();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see tef.project.expressions.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link tef.project.expressions.QuantifyOperator <em>Quantify Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantify Operator</em>'.
	 * @see tef.project.expressions.QuantifyOperator
	 * @generated
	 */
	EClass getQuantifyOperator();

	/**
	 * Returns the meta object for the containment reference '{@link tef.project.expressions.QuantifyOperator#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see tef.project.expressions.QuantifyOperator#getOp()
	 * @see #getQuantifyOperator()
	 * @generated
	 */
	EReference getQuantifyOperator_Op();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link tef.project.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.ExpressionImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.BinaryOperatorImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__OP1 = eINSTANCE.getBinaryOperator_Op1();

		/**
		 * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__OP2 = eINSTANCE.getBinaryOperator_Op2();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.UnaryOperatorImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATOR__OP = eINSTANCE.getUnaryOperator_Op();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.ImpliesImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.OrImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.AndImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.NegImpl <em>Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.NegImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getNeg()
		 * @generated
		 */
		EClass NEG = eINSTANCE.getNeg();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.ModelImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getModel()
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
		 * The meta object literal for the '{@link tef.project.expressions.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.FeatureImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.AllImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.NumberImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.AnyImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.ComparisonOperatorImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EClass COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_OPERATOR__OP1 = eINSTANCE.getComparisonOperator_Op1();

		/**
		 * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_OPERATOR__OP2 = eINSTANCE.getComparisonOperator_Op2();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.GEImpl <em>GE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.GEImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getGE()
		 * @generated
		 */
		EClass GE = eINSTANCE.getGE();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.GImpl <em>G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.GImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getG()
		 * @generated
		 */
		EClass G = eINSTANCE.getG();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.LEImpl <em>LE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.LEImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getLE()
		 * @generated
		 */
		EClass LE = eINSTANCE.getLE();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.LImpl <em>L</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.LImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getL()
		 * @generated
		 */
		EClass L = eINSTANCE.getL();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.EImpl <em>E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.EImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getE()
		 * @generated
		 */
		EClass E = eINSTANCE.getE();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.DImpl <em>D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.DImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getD()
		 * @generated
		 */
		EClass D = eINSTANCE.getD();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.ComparisonOperandImpl <em>Comparison Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.ComparisonOperandImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getComparisonOperand()
		 * @generated
		 */
		EClass COMPARISON_OPERAND = eINSTANCE.getComparisonOperand();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.QuantityImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.FunctionImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__OP = eINSTANCE.getFunction_Op();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.CountImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link tef.project.expressions.impl.QuantifyOperatorImpl <em>Quantify Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tef.project.expressions.impl.QuantifyOperatorImpl
		 * @see tef.project.expressions.impl.ExpressionsPackageImpl#getQuantifyOperator()
		 * @generated
		 */
		EClass QUANTIFY_OPERATOR = eINSTANCE.getQuantifyOperator();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFY_OPERATOR__OP = eINSTANCE.getQuantifyOperator_Op();

	}

} //ExpressionsPackage
