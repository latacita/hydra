/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tef.project.expressions.All;
import tef.project.expressions.And;
import tef.project.expressions.Any;
import tef.project.expressions.BinaryOperator;
import tef.project.expressions.ComparisonOperand;
import tef.project.expressions.ComparisonOperator;
import tef.project.expressions.Count;
import tef.project.expressions.D;
import tef.project.expressions.E;
import tef.project.expressions.Expression;
import tef.project.expressions.ExpressionsPackage;
import tef.project.expressions.Feature;
import tef.project.expressions.Function;
import tef.project.expressions.G;
import tef.project.expressions.GE;
import tef.project.expressions.Implies;
import tef.project.expressions.L;
import tef.project.expressions.LE;
import tef.project.expressions.Model;
import tef.project.expressions.Neg;
import tef.project.expressions.Or;
import tef.project.expressions.QuantifyOperator;
import tef.project.expressions.Quantity;
import tef.project.expressions.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tef.project.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
	protected ExpressionsSwitch modelSwitch =
		new ExpressionsSwitch() {
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseBinaryOperator(BinaryOperator object) {
				return createBinaryOperatorAdapter();
			}
			public Object caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			public Object caseImplies(Implies object) {
				return createImpliesAdapter();
			}
			public Object caseOr(Or object) {
				return createOrAdapter();
			}
			public Object caseAnd(And object) {
				return createAndAdapter();
			}
			public Object caseNeg(Neg object) {
				return createNegAdapter();
			}
			public Object caseModel(Model object) {
				return createModelAdapter();
			}
			public Object caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			public Object caseAll(All object) {
				return createAllAdapter();
			}
			public Object caseNumber(tef.project.expressions.Number object) {
				return createNumberAdapter();
			}
			public Object caseAny(Any object) {
				return createAnyAdapter();
			}
			public Object caseComparisonOperator(ComparisonOperator object) {
				return createComparisonOperatorAdapter();
			}
			public Object caseGE(GE object) {
				return createGEAdapter();
			}
			public Object caseG(G object) {
				return createGAdapter();
			}
			public Object caseLE(LE object) {
				return createLEAdapter();
			}
			public Object caseL(L object) {
				return createLAdapter();
			}
			public Object caseE(E object) {
				return createEAdapter();
			}
			public Object caseD(D object) {
				return createDAdapter();
			}
			public Object caseComparisonOperand(ComparisonOperand object) {
				return createComparisonOperandAdapter();
			}
			public Object caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			public Object caseFunction(Function object) {
				return createFunctionAdapter();
			}
			public Object caseCount(Count object) {
				return createCountAdapter();
			}
			public Object caseQuantifyOperator(QuantifyOperator object) {
				return createQuantifyOperatorAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Implies
	 * @generated
	 */
	public Adapter createImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Neg
	 * @generated
	 */
	public Adapter createNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.ComparisonOperator
	 * @generated
	 */
	public Adapter createComparisonOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.GE <em>GE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.GE
	 * @generated
	 */
	public Adapter createGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.G <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.G
	 * @generated
	 */
	public Adapter createGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.LE <em>LE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.LE
	 * @generated
	 */
	public Adapter createLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.L <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.L
	 * @generated
	 */
	public Adapter createLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.E <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.E
	 * @generated
	 */
	public Adapter createEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.D
	 * @generated
	 */
	public Adapter createDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.ComparisonOperand <em>Comparison Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.ComparisonOperand
	 * @generated
	 */
	public Adapter createComparisonOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tef.project.expressions.QuantifyOperator <em>Quantify Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tef.project.expressions.QuantifyOperator
	 * @generated
	 */
	public Adapter createQuantifyOperatorAdapter() {
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

} //ExpressionsAdapterFactory
