/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.util;

import hydraconstraints.All;
import hydraconstraints.And;
import hydraconstraints.Any;
import hydraconstraints.BinaryOp;
import hydraconstraints.BoolOperand;
import hydraconstraints.BoolOperandChoices;
import hydraconstraints.BoolPriorityOperand1;
import hydraconstraints.BoolPriorityOperand2;
import hydraconstraints.Comparison;
import hydraconstraints.Constraint;
import hydraconstraints.Context;
import hydraconstraints.Div;
import hydraconstraints.Equal;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.Implies;
import hydraconstraints.Less;
import hydraconstraints.LessOrEqual;
import hydraconstraints.LogicalOperator;
import hydraconstraints.Minus;
import hydraconstraints.Model;
import hydraconstraints.More;
import hydraconstraints.MoreOrEqual;
import hydraconstraints.Mul;
import hydraconstraints.MultipleFeature;
import hydraconstraints.Neg;
import hydraconstraints.NotEqual;
import hydraconstraints.NumOperand;
import hydraconstraints.NumOperandChoices;
import hydraconstraints.NumOperator;
import hydraconstraints.NumPriorityOperand1;
import hydraconstraints.NumPriorityOperand2;
import hydraconstraints.Operand;
import hydraconstraints.Or;
import hydraconstraints.Plus;
import hydraconstraints.Selection;
import hydraconstraints.SimpleFeature;
import hydraconstraints.UnaryOp;
import hydraconstraints.Xor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see hydraconstraints.HydraconstraintsPackage
 * @generated
 */
public class HydraconstraintsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HydraconstraintsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraconstraintsSwitch() {
		if (modelPackage == null) {
			modelPackage = HydraconstraintsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HydraconstraintsPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.OPERAND: {
				Operand operand = (Operand)theEObject;
				T result = caseOperand(operand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.BOOL_OPERAND: {
				BoolOperand boolOperand = (BoolOperand)theEObject;
				T result = caseBoolOperand(boolOperand);
				if (result == null) result = caseOperand(boolOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1: {
				BoolPriorityOperand1 boolPriorityOperand1 = (BoolPriorityOperand1)theEObject;
				T result = caseBoolPriorityOperand1(boolPriorityOperand1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2: {
				BoolPriorityOperand2 boolPriorityOperand2 = (BoolPriorityOperand2)theEObject;
				T result = caseBoolPriorityOperand2(boolPriorityOperand2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = caseBoolOperand(logicalOperator);
				if (result == null) result = caseOperand(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.UNARY_OP: {
				UnaryOp unaryOp = (UnaryOp)theEObject;
				T result = caseUnaryOp(unaryOp);
				if (result == null) result = caseLogicalOperator(unaryOp);
				if (result == null) result = caseBoolOperand(unaryOp);
				if (result == null) result = caseOperand(unaryOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NEG: {
				Neg neg = (Neg)theEObject;
				T result = caseNeg(neg);
				if (result == null) result = caseUnaryOp(neg);
				if (result == null) result = caseLogicalOperator(neg);
				if (result == null) result = caseBoolOperand(neg);
				if (result == null) result = caseOperand(neg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.BINARY_OP: {
				BinaryOp binaryOp = (BinaryOp)theEObject;
				T result = caseBinaryOp(binaryOp);
				if (result == null) result = caseLogicalOperator(binaryOp);
				if (result == null) result = caseBoolOperand(binaryOp);
				if (result == null) result = caseOperand(binaryOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryOp(and);
				if (result == null) result = caseLogicalOperator(and);
				if (result == null) result = caseBoolOperand(and);
				if (result == null) result = caseOperand(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryOp(or);
				if (result == null) result = caseLogicalOperator(or);
				if (result == null) result = caseBoolOperand(or);
				if (result == null) result = caseOperand(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.IMPLIES: {
				Implies implies = (Implies)theEObject;
				T result = caseImplies(implies);
				if (result == null) result = caseBinaryOp(implies);
				if (result == null) result = caseLogicalOperator(implies);
				if (result == null) result = caseBoolOperand(implies);
				if (result == null) result = caseOperand(implies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = caseBinaryOp(xor);
				if (result == null) result = caseLogicalOperator(xor);
				if (result == null) result = caseBoolOperand(xor);
				if (result == null) result = caseOperand(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.COMPARISON: {
				Comparison comparison = (Comparison)theEObject;
				T result = caseComparison(comparison);
				if (result == null) result = caseLogicalOperator(comparison);
				if (result == null) result = caseBoolOperand(comparison);
				if (result == null) result = caseOperand(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.MORE: {
				More more = (More)theEObject;
				T result = caseMore(more);
				if (result == null) result = caseComparison(more);
				if (result == null) result = caseLogicalOperator(more);
				if (result == null) result = caseBoolOperand(more);
				if (result == null) result = caseOperand(more);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.MORE_OR_EQUAL: {
				MoreOrEqual moreOrEqual = (MoreOrEqual)theEObject;
				T result = caseMoreOrEqual(moreOrEqual);
				if (result == null) result = caseComparison(moreOrEqual);
				if (result == null) result = caseLogicalOperator(moreOrEqual);
				if (result == null) result = caseBoolOperand(moreOrEqual);
				if (result == null) result = caseOperand(moreOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseComparison(notEqual);
				if (result == null) result = caseLogicalOperator(notEqual);
				if (result == null) result = caseBoolOperand(notEqual);
				if (result == null) result = caseOperand(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseComparison(less);
				if (result == null) result = caseLogicalOperator(less);
				if (result == null) result = caseBoolOperand(less);
				if (result == null) result = caseOperand(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseComparison(equal);
				if (result == null) result = caseLogicalOperator(equal);
				if (result == null) result = caseBoolOperand(equal);
				if (result == null) result = caseOperand(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.LESS_OR_EQUAL: {
				LessOrEqual lessOrEqual = (LessOrEqual)theEObject;
				T result = caseLessOrEqual(lessOrEqual);
				if (result == null) result = caseComparison(lessOrEqual);
				if (result == null) result = caseLogicalOperator(lessOrEqual);
				if (result == null) result = caseBoolOperand(lessOrEqual);
				if (result == null) result = caseOperand(lessOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NUM_OPERAND: {
				NumOperand numOperand = (NumOperand)theEObject;
				T result = caseNumOperand(numOperand);
				if (result == null) result = caseOperand(numOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NUM_PRIORITY_OPERAND2: {
				NumPriorityOperand2 numPriorityOperand2 = (NumPriorityOperand2)theEObject;
				T result = caseNumPriorityOperand2(numPriorityOperand2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NUM_PRIORITY_OPERAND1: {
				NumPriorityOperand1 numPriorityOperand1 = (NumPriorityOperand1)theEObject;
				T result = caseNumPriorityOperand1(numPriorityOperand1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NUM_OPERATOR: {
				NumOperator numOperator = (NumOperator)theEObject;
				T result = caseNumOperator(numOperator);
				if (result == null) result = caseNumOperand(numOperator);
				if (result == null) result = caseOperand(numOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseNumOperator(plus);
				if (result == null) result = caseNumOperand(plus);
				if (result == null) result = caseOperand(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.MUL: {
				Mul mul = (Mul)theEObject;
				T result = caseMul(mul);
				if (result == null) result = caseNumOperator(mul);
				if (result == null) result = caseNumOperand(mul);
				if (result == null) result = caseOperand(mul);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T result = caseMinus(minus);
				if (result == null) result = caseNumOperator(minus);
				if (result == null) result = caseNumOperand(minus);
				if (result == null) result = caseOperand(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.DIV: {
				Div div = (Div)theEObject;
				T result = caseDiv(div);
				if (result == null) result = caseNumOperator(div);
				if (result == null) result = caseNumOperand(div);
				if (result == null) result = caseOperand(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NUM_OPERAND_CHOICES: {
				NumOperandChoices numOperandChoices = (NumOperandChoices)theEObject;
				T result = caseNumOperandChoices(numOperandChoices);
				if (result == null) result = caseNumOperand(numOperandChoices);
				if (result == null) result = caseOperand(numOperandChoices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.MULTIPLE_FEATURE: {
				MultipleFeature multipleFeature = (MultipleFeature)theEObject;
				T result = caseMultipleFeature(multipleFeature);
				if (result == null) result = caseNumOperandChoices(multipleFeature);
				if (result == null) result = caseNumOperand(multipleFeature);
				if (result == null) result = caseOperand(multipleFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.SIMPLE_FEATURE: {
				SimpleFeature simpleFeature = (SimpleFeature)theEObject;
				T result = caseSimpleFeature(simpleFeature);
				if (result == null) result = caseBoolOperandChoices(simpleFeature);
				if (result == null) result = caseBoolOperand(simpleFeature);
				if (result == null) result = caseOperand(simpleFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.BOOL_OPERAND_CHOICES: {
				BoolOperandChoices boolOperandChoices = (BoolOperandChoices)theEObject;
				T result = caseBoolOperandChoices(boolOperandChoices);
				if (result == null) result = caseBoolOperand(boolOperandChoices);
				if (result == null) result = caseOperand(boolOperandChoices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseBoolOperandChoices(context);
				if (result == null) result = caseNumOperandChoices(context);
				if (result == null) result = caseBoolOperand(context);
				if (result == null) result = caseNumOperand(context);
				if (result == null) result = caseOperand(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseBoolOperandChoices(selection);
				if (result == null) result = caseBoolOperand(selection);
				if (result == null) result = caseOperand(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = caseSelection(any);
				if (result == null) result = caseBoolOperandChoices(any);
				if (result == null) result = caseBoolOperand(any);
				if (result == null) result = caseOperand(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.ALL: {
				All all = (All)theEObject;
				T result = caseAll(all);
				if (result == null) result = caseSelection(all);
				if (result == null) result = caseBoolOperandChoices(all);
				if (result == null) result = caseBoolOperand(all);
				if (result == null) result = caseOperand(all);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HydraconstraintsPackage.NUMBER: {
				hydraconstraints.Number number = (hydraconstraints.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseNumOperandChoices(number);
				if (result == null) result = caseNumOperand(number);
				if (result == null) result = caseOperand(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperand(Operand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolOperand(BoolOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Priority Operand1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Priority Operand1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolPriorityOperand1(BoolPriorityOperand1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Priority Operand2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Priority Operand2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolPriorityOperand2(BoolPriorityOperand2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperator(LogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOp(UnaryOp object) {
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
	public T caseNeg(Neg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOp(BinaryOp object) {
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
	public T caseAnd(And object) {
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
	public T caseOr(Or object) {
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
	public T caseImplies(Implies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>More</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>More</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMore(More object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>More Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>More Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoreOrEqual(MoreOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqual(LessOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumOperand(NumOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Priority Operand2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Priority Operand2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPriorityOperand2(NumPriorityOperand2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Priority Operand1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Priority Operand1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPriorityOperand1(NumPriorityOperand1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumOperator(NumOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mul</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mul</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMul(Mul object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Operand Choices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Operand Choices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumOperandChoices(NumOperandChoices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleFeature(MultipleFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleFeature(SimpleFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Operand Choices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Operand Choices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolOperandChoices(BoolOperandChoices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
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
	public T caseAny(Any object) {
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
	public T caseAll(All object) {
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
	public T caseNumber(hydraconstraints.Number object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HydraconstraintsSwitch
