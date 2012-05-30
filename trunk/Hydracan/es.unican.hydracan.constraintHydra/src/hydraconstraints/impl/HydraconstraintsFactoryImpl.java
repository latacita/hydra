/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.impl;

import hydraconstraints.All;
import hydraconstraints.And;
import hydraconstraints.Any;
import hydraconstraints.BoolPriorityOperand1;
import hydraconstraints.BoolPriorityOperand2;
import hydraconstraints.Constraint;
import hydraconstraints.Context;
import hydraconstraints.Div;
import hydraconstraints.Equal;
import hydraconstraints.HydraconstraintsFactory;
import hydraconstraints.HydraconstraintsPackage;
import hydraconstraints.Implies;
import hydraconstraints.Less;
import hydraconstraints.LessOrEqual;
import hydraconstraints.Minus;
import hydraconstraints.Model;
import hydraconstraints.More;
import hydraconstraints.MoreOrEqual;
import hydraconstraints.Mul;
import hydraconstraints.MultipleFeature;
import hydraconstraints.Neg;
import hydraconstraints.NotEqual;
import hydraconstraints.NumPriorityOperand1;
import hydraconstraints.NumPriorityOperand2;
import hydraconstraints.Or;
import hydraconstraints.Plus;
import hydraconstraints.SimpleFeature;
import hydraconstraints.Xor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HydraconstraintsFactoryImpl extends EFactoryImpl implements HydraconstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydraconstraintsFactory init() {
		try {
			HydraconstraintsFactory theHydraconstraintsFactory = (HydraconstraintsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.unican.es/personales/sanchezbp/spl/hydra/constraints"); 
			if (theHydraconstraintsFactory != null) {
				return theHydraconstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HydraconstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraconstraintsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HydraconstraintsPackage.MODEL: return createModel();
			case HydraconstraintsPackage.CONSTRAINT: return createConstraint();
			case HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1: return createBoolPriorityOperand1();
			case HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2: return createBoolPriorityOperand2();
			case HydraconstraintsPackage.NEG: return createNeg();
			case HydraconstraintsPackage.AND: return createAnd();
			case HydraconstraintsPackage.OR: return createOr();
			case HydraconstraintsPackage.IMPLIES: return createImplies();
			case HydraconstraintsPackage.XOR: return createXor();
			case HydraconstraintsPackage.MORE: return createMore();
			case HydraconstraintsPackage.MORE_OR_EQUAL: return createMoreOrEqual();
			case HydraconstraintsPackage.NOT_EQUAL: return createNotEqual();
			case HydraconstraintsPackage.LESS: return createLess();
			case HydraconstraintsPackage.EQUAL: return createEqual();
			case HydraconstraintsPackage.LESS_OR_EQUAL: return createLessOrEqual();
			case HydraconstraintsPackage.NUM_PRIORITY_OPERAND2: return createNumPriorityOperand2();
			case HydraconstraintsPackage.NUM_PRIORITY_OPERAND1: return createNumPriorityOperand1();
			case HydraconstraintsPackage.PLUS: return createPlus();
			case HydraconstraintsPackage.MUL: return createMul();
			case HydraconstraintsPackage.MINUS: return createMinus();
			case HydraconstraintsPackage.DIV: return createDiv();
			case HydraconstraintsPackage.MULTIPLE_FEATURE: return createMultipleFeature();
			case HydraconstraintsPackage.SIMPLE_FEATURE: return createSimpleFeature();
			case HydraconstraintsPackage.CONTEXT: return createContext();
			case HydraconstraintsPackage.ANY: return createAny();
			case HydraconstraintsPackage.ALL: return createAll();
			case HydraconstraintsPackage.NUMBER: return createNumber();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand1 createBoolPriorityOperand1() {
		BoolPriorityOperand1Impl boolPriorityOperand1 = new BoolPriorityOperand1Impl();
		return boolPriorityOperand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolPriorityOperand2 createBoolPriorityOperand2() {
		BoolPriorityOperand2Impl boolPriorityOperand2 = new BoolPriorityOperand2Impl();
		return boolPriorityOperand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neg createNeg() {
		NegImpl neg = new NegImpl();
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implies createImplies() {
		ImpliesImpl implies = new ImpliesImpl();
		return implies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public More createMore() {
		MoreImpl more = new MoreImpl();
		return more;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoreOrEqual createMoreOrEqual() {
		MoreOrEqualImpl moreOrEqual = new MoreOrEqualImpl();
		return moreOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOrEqual createLessOrEqual() {
		LessOrEqualImpl lessOrEqual = new LessOrEqualImpl();
		return lessOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPriorityOperand2 createNumPriorityOperand2() {
		NumPriorityOperand2Impl numPriorityOperand2 = new NumPriorityOperand2Impl();
		return numPriorityOperand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPriorityOperand1 createNumPriorityOperand1() {
		NumPriorityOperand1Impl numPriorityOperand1 = new NumPriorityOperand1Impl();
		return numPriorityOperand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mul createMul() {
		MulImpl mul = new MulImpl();
		return mul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleFeature createMultipleFeature() {
		MultipleFeatureImpl multipleFeature = new MultipleFeatureImpl();
		return multipleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFeature createSimpleFeature() {
		SimpleFeatureImpl simpleFeature = new SimpleFeatureImpl();
		return simpleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All createAll() {
		AllImpl all = new AllImpl();
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hydraconstraints.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraconstraintsPackage getHydraconstraintsPackage() {
		return (HydraconstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HydraconstraintsPackage getPackage() {
		return HydraconstraintsPackage.eINSTANCE;
	}

} //HydraconstraintsFactoryImpl
