/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.util;

import HydraConstraints.All;
import HydraConstraints.And;
import HydraConstraints.Any;
import HydraConstraints.BinaryOp;
import HydraConstraints.BoolOperand;
import HydraConstraints.BoolOperandChoices;
import HydraConstraints.BoolPriorityOperand1;
import HydraConstraints.BoolPriorityOperand2;
import HydraConstraints.Comparison;
import HydraConstraints.Constraint;
import HydraConstraints.Context;
import HydraConstraints.Div;
import HydraConstraints.Equal;
import HydraConstraints.HydraConstraintsPackage;
import HydraConstraints.Implies;
import HydraConstraints.Less;
import HydraConstraints.LessOrEqual;
import HydraConstraints.LogicalOperator;
import HydraConstraints.Minus;
import HydraConstraints.Model;
import HydraConstraints.More;
import HydraConstraints.MoreOrEqual;
import HydraConstraints.Mul;
import HydraConstraints.MultipleFeature;
import HydraConstraints.Neg;
import HydraConstraints.NotEqual;
import HydraConstraints.NumOperand;
import HydraConstraints.NumOperandChoices;
import HydraConstraints.NumOperator;
import HydraConstraints.NumPriorityOperand1;
import HydraConstraints.NumPriorityOperand2;
import HydraConstraints.Operand;
import HydraConstraints.Or;
import HydraConstraints.Plus;
import HydraConstraints.Selection;
import HydraConstraints.SimpleFeature;
import HydraConstraints.UnaryOp;
import HydraConstraints.Xor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see HydraConstraints.HydraConstraintsPackage
 * @generated
 */
public class HydraConstraintsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HydraConstraintsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraConstraintsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HydraConstraintsPackage.eINSTANCE;
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
	protected HydraConstraintsSwitch<Adapter> modelSwitch =
		new HydraConstraintsSwitch<Adapter>() {
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
			public Adapter caseNumber(HydraConstraints.Number object) {
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
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.BoolOperand <em>Bool Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.BoolOperand
	 * @generated
	 */
	public Adapter createBoolOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.NumOperand <em>Num Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.NumOperand
	 * @generated
	 */
	public Adapter createNumOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.SimpleFeature <em>Simple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.SimpleFeature
	 * @generated
	 */
	public Adapter createSimpleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.MultipleFeature <em>Multiple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.MultipleFeature
	 * @generated
	 */
	public Adapter createMultipleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.LogicalOperator
	 * @generated
	 */
	public Adapter createLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.UnaryOp
	 * @generated
	 */
	public Adapter createUnaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.BinaryOp
	 * @generated
	 */
	public Adapter createBinaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.NumOperator <em>Num Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.NumOperator
	 * @generated
	 */
	public Adapter createNumOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Mul
	 * @generated
	 */
	public Adapter createMulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Neg
	 * @generated
	 */
	public Adapter createNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Implies
	 * @generated
	 */
	public Adapter createImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.More <em>More</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.More
	 * @generated
	 */
	public Adapter createMoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.LessOrEqual
	 * @generated
	 */
	public Adapter createLessOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.NotEqual
	 * @generated
	 */
	public Adapter createNotEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.MoreOrEqual <em>More Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.MoreOrEqual
	 * @generated
	 */
	public Adapter createMoreOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.NumOperandChoices <em>Num Operand Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.NumOperandChoices
	 * @generated
	 */
	public Adapter createNumOperandChoicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.BoolOperandChoices <em>Bool Operand Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.BoolOperandChoices
	 * @generated
	 */
	public Adapter createBoolOperandChoicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.BoolPriorityOperand1 <em>Bool Priority Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.BoolPriorityOperand1
	 * @generated
	 */
	public Adapter createBoolPriorityOperand1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.NumPriorityOperand2 <em>Num Priority Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.NumPriorityOperand2
	 * @generated
	 */
	public Adapter createNumPriorityOperand2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.BoolPriorityOperand2 <em>Bool Priority Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.BoolPriorityOperand2
	 * @generated
	 */
	public Adapter createBoolPriorityOperand2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HydraConstraints.NumPriorityOperand1 <em>Num Priority Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HydraConstraints.NumPriorityOperand1
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

} //HydraConstraintsAdapterFactory
