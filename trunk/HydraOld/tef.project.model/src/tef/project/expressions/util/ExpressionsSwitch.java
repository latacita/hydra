/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tef.project.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExpressionsPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				Object result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseExpression(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				Object result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseExpression(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.IMPLIES: {
				Implies implies = (Implies)theEObject;
				Object result = caseImplies(implies);
				if (result == null) result = caseBinaryOperator(implies);
				if (result == null) result = caseExpression(implies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.OR: {
				Or or = (Or)theEObject;
				Object result = caseOr(or);
				if (result == null) result = caseBinaryOperator(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.AND: {
				And and = (And)theEObject;
				Object result = caseAnd(and);
				if (result == null) result = caseBinaryOperator(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.NEG: {
				Neg neg = (Neg)theEObject;
				Object result = caseNeg(neg);
				if (result == null) result = caseUnaryOperator(neg);
				if (result == null) result = caseExpression(neg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.MODEL: {
				Model model = (Model)theEObject;
				Object result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				Object result = caseFeature(feature);
				if (result == null) result = caseExpression(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.ALL: {
				All all = (All)theEObject;
				Object result = caseAll(all);
				if (result == null) result = caseQuantifyOperator(all);
				if (result == null) result = caseExpression(all);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.NUMBER: {
				tef.project.expressions.Number number = (tef.project.expressions.Number)theEObject;
				Object result = caseNumber(number);
				if (result == null) result = caseQuantifyOperator(number);
				if (result == null) result = caseExpression(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.ANY: {
				Any any = (Any)theEObject;
				Object result = caseAny(any);
				if (result == null) result = caseQuantifyOperator(any);
				if (result == null) result = caseExpression(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.COMPARISON_OPERATOR: {
				ComparisonOperator comparisonOperator = (ComparisonOperator)theEObject;
				Object result = caseComparisonOperator(comparisonOperator);
				if (result == null) result = caseExpression(comparisonOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.GE: {
				GE ge = (GE)theEObject;
				Object result = caseGE(ge);
				if (result == null) result = caseComparisonOperator(ge);
				if (result == null) result = caseExpression(ge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.G: {
				G g = (G)theEObject;
				Object result = caseG(g);
				if (result == null) result = caseComparisonOperator(g);
				if (result == null) result = caseExpression(g);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.LE: {
				LE le = (LE)theEObject;
				Object result = caseLE(le);
				if (result == null) result = caseComparisonOperator(le);
				if (result == null) result = caseExpression(le);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.L: {
				L l = (L)theEObject;
				Object result = caseL(l);
				if (result == null) result = caseComparisonOperator(l);
				if (result == null) result = caseExpression(l);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.E: {
				E e = (E)theEObject;
				Object result = caseE(e);
				if (result == null) result = caseComparisonOperator(e);
				if (result == null) result = caseExpression(e);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.D: {
				D d = (D)theEObject;
				Object result = caseD(d);
				if (result == null) result = caseComparisonOperator(d);
				if (result == null) result = caseExpression(d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.COMPARISON_OPERAND: {
				ComparisonOperand comparisonOperand = (ComparisonOperand)theEObject;
				Object result = caseComparisonOperand(comparisonOperand);
				if (result == null) result = caseExpression(comparisonOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				Object result = caseQuantity(quantity);
				if (result == null) result = caseComparisonOperand(quantity);
				if (result == null) result = caseExpression(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.FUNCTION: {
				Function function = (Function)theEObject;
				Object result = caseFunction(function);
				if (result == null) result = caseComparisonOperand(function);
				if (result == null) result = caseExpression(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.COUNT: {
				Count count = (Count)theEObject;
				Object result = caseCount(count);
				if (result == null) result = caseFunction(count);
				if (result == null) result = caseComparisonOperand(count);
				if (result == null) result = caseExpression(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.QUANTIFY_OPERATOR: {
				QuantifyOperator quantifyOperator = (QuantifyOperator)theEObject;
				Object result = caseQuantifyOperator(quantifyOperator);
				if (result == null) result = caseExpression(quantifyOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImplies(Implies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNeg(Neg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAll(All object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNumber(tef.project.expressions.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComparisonOperator(ComparisonOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGE(GE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG(G object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLE(LE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseL(L object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseE(E object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD(D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComparisonOperand(ComparisonOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantify Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantify Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQuantifyOperator(QuantifyOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ExpressionsSwitch
