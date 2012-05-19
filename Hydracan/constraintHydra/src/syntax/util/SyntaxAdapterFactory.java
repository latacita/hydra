/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import syntax.All;
import syntax.And;
import syntax.Any;
import syntax.BinaryOp;
import syntax.BoolOperand;
import syntax.BoolOperandChoices;
import syntax.BoolPriorityOperand1;
import syntax.BoolPriorityOperand2;
import syntax.Comparison;
import syntax.Constraint;
import syntax.Context;
import syntax.Div;
import syntax.Equal;
import syntax.Implies;
import syntax.Less;
import syntax.LessOrEqual;
import syntax.LogicalOperator;
import syntax.Minus;
import syntax.Model;
import syntax.More;
import syntax.MoreOrEqual;
import syntax.Mul;
import syntax.MultipleFeature;
import syntax.Neg;
import syntax.NotEqual;
import syntax.NumOperand;
import syntax.NumOperandChoices;
import syntax.NumOperator;
import syntax.NumPriorityOperand1;
import syntax.NumPriorityOperand2;
import syntax.Operand;
import syntax.Or;
import syntax.Plus;
import syntax.Selection;
import syntax.SimpleFeature;
import syntax.SyntaxPackage;
import syntax.UnaryOp;
import syntax.Xor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see syntax.SyntaxPackage
 * @generated
 */
public class SyntaxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SyntaxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SyntaxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxSwitch<Adapter> modelSwitch =
		new SyntaxSwitch<Adapter>() {
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseOperand(Operand object) {
				return createOperandAdapter();
			}
			@Override
			public Adapter caseBoolOperand(BoolOperand object) {
				return createBoolOperandAdapter();
			}
			@Override
			public Adapter caseNumOperand(NumOperand object) {
				return createNumOperandAdapter();
			}
			@Override
			public Adapter caseSimpleFeature(SimpleFeature object) {
				return createSimpleFeatureAdapter();
			}
			@Override
			public Adapter caseMultipleFeature(MultipleFeature object) {
				return createMultipleFeatureAdapter();
			}
			@Override
			public Adapter caseNumber(syntax.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseLogicalOperator(LogicalOperator object) {
				return createLogicalOperatorAdapter();
			}
			@Override
			public Adapter caseUnaryOp(UnaryOp object) {
				return createUnaryOpAdapter();
			}
			@Override
			public Adapter caseBinaryOp(BinaryOp object) {
				return createBinaryOpAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseComparison(Comparison object) {
				return createComparisonAdapter();
			}
			@Override
			public Adapter caseNumOperator(NumOperator object) {
				return createNumOperatorAdapter();
			}
			@Override
			public Adapter caseDiv(Div object) {
				return createDivAdapter();
			}
			@Override
			public Adapter casePlus(Plus object) {
				return createPlusAdapter();
			}
			@Override
			public Adapter caseMul(Mul object) {
				return createMulAdapter();
			}
			@Override
			public Adapter caseMinus(Minus object) {
				return createMinusAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseAll(All object) {
				return createAllAdapter();
			}
			@Override
			public Adapter caseAny(Any object) {
				return createAnyAdapter();
			}
			@Override
			public Adapter caseNeg(Neg object) {
				return createNegAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
			}
			@Override
			public Adapter caseImplies(Implies object) {
				return createImpliesAdapter();
			}
			@Override
			public Adapter caseMore(More object) {
				return createMoreAdapter();
			}
			@Override
			public Adapter caseLessOrEqual(LessOrEqual object) {
				return createLessOrEqualAdapter();
			}
			@Override
			public Adapter caseLess(Less object) {
				return createLessAdapter();
			}
			@Override
			public Adapter caseNotEqual(NotEqual object) {
				return createNotEqualAdapter();
			}
			@Override
			public Adapter caseEqual(Equal object) {
				return createEqualAdapter();
			}
			@Override
			public Adapter caseMoreOrEqual(MoreOrEqual object) {
				return createMoreOrEqualAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseNumOperandChoices(NumOperandChoices object) {
				return createNumOperandChoicesAdapter();
			}
			@Override
			public Adapter caseBoolOperandChoices(BoolOperandChoices object) {
				return createBoolOperandChoicesAdapter();
			}
			@Override
			public Adapter caseBoolPriorityOperand1(BoolPriorityOperand1 object) {
				return createBoolPriorityOperand1Adapter();
			}
			@Override
			public Adapter caseNumPriorityOperand2(NumPriorityOperand2 object) {
				return createNumPriorityOperand2Adapter();
			}
			@Override
			public Adapter caseBoolPriorityOperand2(BoolPriorityOperand2 object) {
				return createBoolPriorityOperand2Adapter();
			}
			@Override
			public Adapter caseNumPriorityOperand1(NumPriorityOperand1 object) {
				return createNumPriorityOperand1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link syntax.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.BoolOperand <em>Bool Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.BoolOperand
	 * @generated
	 */
	public Adapter createBoolOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.NumOperand <em>Num Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.NumOperand
	 * @generated
	 */
	public Adapter createNumOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.SimpleFeature <em>Simple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.SimpleFeature
	 * @generated
	 */
	public Adapter createSimpleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.MultipleFeature <em>Multiple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.MultipleFeature
	 * @generated
	 */
	public Adapter createMultipleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.LogicalOperator
	 * @generated
	 */
	public Adapter createLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.UnaryOp
	 * @generated
	 */
	public Adapter createUnaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.BinaryOp
	 * @generated
	 */
	public Adapter createBinaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.NumOperator <em>Num Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.NumOperator
	 * @generated
	 */
	public Adapter createNumOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Mul
	 * @generated
	 */
	public Adapter createMulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Neg
	 * @generated
	 */
	public Adapter createNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Implies
	 * @generated
	 */
	public Adapter createImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.More <em>More</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.More
	 * @generated
	 */
	public Adapter createMoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.LessOrEqual
	 * @generated
	 */
	public Adapter createLessOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.NotEqual
	 * @generated
	 */
	public Adapter createNotEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.MoreOrEqual <em>More Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.MoreOrEqual
	 * @generated
	 */
	public Adapter createMoreOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.NumOperandChoices <em>Num Operand Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.NumOperandChoices
	 * @generated
	 */
	public Adapter createNumOperandChoicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.BoolOperandChoices <em>Bool Operand Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.BoolOperandChoices
	 * @generated
	 */
	public Adapter createBoolOperandChoicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.BoolPriorityOperand1 <em>Bool Priority Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.BoolPriorityOperand1
	 * @generated
	 */
	public Adapter createBoolPriorityOperand1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.NumPriorityOperand2 <em>Num Priority Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.NumPriorityOperand2
	 * @generated
	 */
	public Adapter createNumPriorityOperand2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.BoolPriorityOperand2 <em>Bool Priority Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.BoolPriorityOperand2
	 * @generated
	 */
	public Adapter createBoolPriorityOperand2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link syntax.NumPriorityOperand1 <em>Num Priority Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see syntax.NumPriorityOperand1
	 * @generated
	 */
	public Adapter createNumPriorityOperand1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SyntaxAdapterFactory
