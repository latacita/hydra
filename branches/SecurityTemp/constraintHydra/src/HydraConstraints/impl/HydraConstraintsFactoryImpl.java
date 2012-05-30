/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package HydraConstraints.impl;

import HydraConstraints.All;
import HydraConstraints.And;
import HydraConstraints.Any;
import HydraConstraints.BoolPriorityOperand1;
import HydraConstraints.BoolPriorityOperand2;
import HydraConstraints.Constraint;
import HydraConstraints.Context;
import HydraConstraints.Div;
import HydraConstraints.Equal;
import HydraConstraints.HydraConstraintsFactory;
import HydraConstraints.HydraConstraintsPackage;
import HydraConstraints.Implies;
import HydraConstraints.Less;
import HydraConstraints.LessOrEqual;
import HydraConstraints.Minus;
import HydraConstraints.Model;
import HydraConstraints.More;
import HydraConstraints.MoreOrEqual;
import HydraConstraints.Mul;
import HydraConstraints.MultipleFeature;
import HydraConstraints.Neg;
import HydraConstraints.NotEqual;
import HydraConstraints.NumPriorityOperand1;
import HydraConstraints.NumPriorityOperand2;
import HydraConstraints.Or;
import HydraConstraints.Plus;
import HydraConstraints.SimpleFeature;
import HydraConstraints.Xor;

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
public class HydraConstraintsFactoryImpl extends EFactoryImpl implements HydraConstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydraConstraintsFactory init() {
		try {
			HydraConstraintsFactory theHydraConstraintsFactory = (HydraConstraintsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.unican.es/personales/sanchezbp/spl/hydra/constraints"); 
			if (theHydraConstraintsFactory != null) {
				return theHydraConstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HydraConstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraConstraintsFactoryImpl() {
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
			case HydraConstraintsPackage.CONSTRAINT: return createConstraint();
			case HydraConstraintsPackage.SIMPLE_FEATURE: return createSimpleFeature();
			case HydraConstraintsPackage.MULTIPLE_FEATURE: return createMultipleFeature();
			case HydraConstraintsPackage.NUMBER: return createNumber();
			case HydraConstraintsPackage.DIV: return createDiv();
			case HydraConstraintsPackage.PLUS: return createPlus();
			case HydraConstraintsPackage.MUL: return createMul();
			case HydraConstraintsPackage.MINUS: return createMinus();
			case HydraConstraintsPackage.CONTEXT: return createContext();
			case HydraConstraintsPackage.ALL: return createAll();
			case HydraConstraintsPackage.ANY: return createAny();
			case HydraConstraintsPackage.NEG: return createNeg();
			case HydraConstraintsPackage.AND: return createAnd();
			case HydraConstraintsPackage.OR: return createOr();
			case HydraConstraintsPackage.XOR: return createXor();
			case HydraConstraintsPackage.IMPLIES: return createImplies();
			case HydraConstraintsPackage.MORE: return createMore();
			case HydraConstraintsPackage.LESS_OR_EQUAL: return createLessOrEqual();
			case HydraConstraintsPackage.LESS: return createLess();
			case HydraConstraintsPackage.NOT_EQUAL: return createNotEqual();
			case HydraConstraintsPackage.EQUAL: return createEqual();
			case HydraConstraintsPackage.MORE_OR_EQUAL: return createMoreOrEqual();
			case HydraConstraintsPackage.MODEL: return createModel();
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND1: return createBoolPriorityOperand1();
			case HydraConstraintsPackage.NUM_PRIORITY_OPERAND2: return createNumPriorityOperand2();
			case HydraConstraintsPackage.BOOL_PRIORITY_OPERAND2: return createBoolPriorityOperand2();
			case HydraConstraintsPackage.NUM_PRIORITY_OPERAND1: return createNumPriorityOperand1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public SimpleFeature createSimpleFeature() {
		SimpleFeatureImpl simpleFeature = new SimpleFeatureImpl();
		return simpleFeature;
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
	public HydraConstraints.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
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
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
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
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
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
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
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
	public More createMore() {
		MoreImpl more = new MoreImpl();
		return more;
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
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
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
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
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
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
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
	public NumPriorityOperand2 createNumPriorityOperand2() {
		NumPriorityOperand2Impl numPriorityOperand2 = new NumPriorityOperand2Impl();
		return numPriorityOperand2;
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
	public NumPriorityOperand1 createNumPriorityOperand1() {
		NumPriorityOperand1Impl numPriorityOperand1 = new NumPriorityOperand1Impl();
		return numPriorityOperand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraConstraintsPackage getHydraConstraintsPackage() {
		return (HydraConstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HydraConstraintsPackage getPackage() {
		return HydraConstraintsPackage.eINSTANCE;
	}

} //HydraConstraintsFactoryImpl
