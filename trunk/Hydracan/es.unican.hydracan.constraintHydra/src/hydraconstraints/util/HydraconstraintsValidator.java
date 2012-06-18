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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see hydraconstraints.HydraconstraintsPackage
 * @generated
 */
public class HydraconstraintsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HydraconstraintsValidator INSTANCE = new HydraconstraintsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "hydraconstraints";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre Correcto' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__NOMBRE_CORRECTO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Existe Feature' of 'Multiple Feature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_FEATURE__EXISTE_FEATURE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraconstraintsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HydraconstraintsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case HydraconstraintsPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case HydraconstraintsPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case HydraconstraintsPackage.OPERAND:
				return validateOperand((Operand)value, diagnostics, context);
			case HydraconstraintsPackage.BOOL_OPERAND:
				return validateBoolOperand((BoolOperand)value, diagnostics, context);
			case HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1:
				return validateBoolPriorityOperand1((BoolPriorityOperand1)value, diagnostics, context);
			case HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2:
				return validateBoolPriorityOperand2((BoolPriorityOperand2)value, diagnostics, context);
			case HydraconstraintsPackage.LOGICAL_OPERATOR:
				return validateLogicalOperator((LogicalOperator)value, diagnostics, context);
			case HydraconstraintsPackage.UNARY_OP:
				return validateUnaryOp((UnaryOp)value, diagnostics, context);
			case HydraconstraintsPackage.NEG:
				return validateNeg((Neg)value, diagnostics, context);
			case HydraconstraintsPackage.BINARY_OP:
				return validateBinaryOp((BinaryOp)value, diagnostics, context);
			case HydraconstraintsPackage.AND:
				return validateAnd((And)value, diagnostics, context);
			case HydraconstraintsPackage.OR:
				return validateOr((Or)value, diagnostics, context);
			case HydraconstraintsPackage.IMPLIES:
				return validateImplies((Implies)value, diagnostics, context);
			case HydraconstraintsPackage.XOR:
				return validateXor((Xor)value, diagnostics, context);
			case HydraconstraintsPackage.COMPARISON:
				return validateComparison((Comparison)value, diagnostics, context);
			case HydraconstraintsPackage.MORE:
				return validateMore((More)value, diagnostics, context);
			case HydraconstraintsPackage.MORE_OR_EQUAL:
				return validateMoreOrEqual((MoreOrEqual)value, diagnostics, context);
			case HydraconstraintsPackage.NOT_EQUAL:
				return validateNotEqual((NotEqual)value, diagnostics, context);
			case HydraconstraintsPackage.LESS:
				return validateLess((Less)value, diagnostics, context);
			case HydraconstraintsPackage.EQUAL:
				return validateEqual((Equal)value, diagnostics, context);
			case HydraconstraintsPackage.LESS_OR_EQUAL:
				return validateLessOrEqual((LessOrEqual)value, diagnostics, context);
			case HydraconstraintsPackage.NUM_OPERAND:
				return validateNumOperand((NumOperand)value, diagnostics, context);
			case HydraconstraintsPackage.NUM_PRIORITY_OPERAND2:
				return validateNumPriorityOperand2((NumPriorityOperand2)value, diagnostics, context);
			case HydraconstraintsPackage.NUM_PRIORITY_OPERAND1:
				return validateNumPriorityOperand1((NumPriorityOperand1)value, diagnostics, context);
			case HydraconstraintsPackage.NUM_OPERATOR:
				return validateNumOperator((NumOperator)value, diagnostics, context);
			case HydraconstraintsPackage.PLUS:
				return validatePlus((Plus)value, diagnostics, context);
			case HydraconstraintsPackage.MUL:
				return validateMul((Mul)value, diagnostics, context);
			case HydraconstraintsPackage.MINUS:
				return validateMinus((Minus)value, diagnostics, context);
			case HydraconstraintsPackage.DIV:
				return validateDiv((Div)value, diagnostics, context);
			case HydraconstraintsPackage.NUM_OPERAND_CHOICES:
				return validateNumOperandChoices((NumOperandChoices)value, diagnostics, context);
			case HydraconstraintsPackage.MULTIPLE_FEATURE:
				return validateMultipleFeature((MultipleFeature)value, diagnostics, context);
			case HydraconstraintsPackage.SIMPLE_FEATURE:
				return validateSimpleFeature((SimpleFeature)value, diagnostics, context);
			case HydraconstraintsPackage.BOOL_OPERAND_CHOICES:
				return validateBoolOperandChoices((BoolOperandChoices)value, diagnostics, context);
			case HydraconstraintsPackage.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case HydraconstraintsPackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case HydraconstraintsPackage.ANY:
				return validateAny((Any)value, diagnostics, context);
			case HydraconstraintsPackage.ALL:
				return validateAll((All)value, diagnostics, context);
			case HydraconstraintsPackage.NUMBER:
				return validateNumber((hydraconstraints.Number)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_nombreCorrecto(model, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombreCorrecto constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_nombreCorrecto(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return model.nombreCorrecto(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperand(Operand operand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolOperand(BoolOperand boolOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolOperand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolPriorityOperand1(BoolPriorityOperand1 boolPriorityOperand1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolPriorityOperand1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolPriorityOperand2(BoolPriorityOperand2 boolPriorityOperand2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolPriorityOperand2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalOperator(LogicalOperator logicalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryOp(UnaryOp unaryOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryOp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeg(Neg neg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(neg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOp(BinaryOp binaryOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryOp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplies(Implies implies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXor(Xor xor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparison(Comparison comparison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparison, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMore(More more, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(more, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoreOrEqual(MoreOrEqual moreOrEqual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moreOrEqual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotEqual(NotEqual notEqual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notEqual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLess(Less less, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(less, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqual(Equal equal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessOrEqual(LessOrEqual lessOrEqual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lessOrEqual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumOperand(NumOperand numOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numOperand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumPriorityOperand2(NumPriorityOperand2 numPriorityOperand2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numPriorityOperand2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumPriorityOperand1(NumPriorityOperand1 numPriorityOperand1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numPriorityOperand1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumOperator(NumOperator numOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlus(Plus plus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMul(Mul mul, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mul, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinus(Minus minus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiv(Div div, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(div, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumOperandChoices(NumOperandChoices numOperandChoices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numOperandChoices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleFeature(MultipleFeature multipleFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multipleFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multipleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleFeature_existeFeature(multipleFeature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the existeFeature constraint of '<em>Multiple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleFeature_existeFeature(MultipleFeature multipleFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleFeature.existeFeature(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleFeature(SimpleFeature simpleFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleFeature_existeFeature(simpleFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolOperandChoices(BoolOperandChoices boolOperandChoices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolOperandChoices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContext(Context context, DiagnosticChain diagnostics, Map<Object, Object> theContext) {
		return validate_EveryDefaultConstraint(context, diagnostics, theContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAny(Any any, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(any, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAll(All all, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(all, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(hydraconstraints.Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HydraconstraintsValidator
