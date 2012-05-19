/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import syntax.All;
import syntax.And;
import syntax.Any;
import syntax.BoolPriorityOperand1;
import syntax.BoolPriorityOperand2;
import syntax.Constraint;
import syntax.Context;
import syntax.Div;
import syntax.Equal;
import syntax.Implies;
import syntax.Less;
import syntax.LessOrEqual;
import syntax.Minus;
import syntax.Model;
import syntax.More;
import syntax.MoreOrEqual;
import syntax.Mul;
import syntax.MultipleFeature;
import syntax.Neg;
import syntax.NotEqual;
import syntax.NumPriorityOperand1;
import syntax.NumPriorityOperand2;
import syntax.Or;
import syntax.Plus;
import syntax.SimpleFeature;
import syntax.SyntaxFactory;
import syntax.SyntaxPackage;
import syntax.Xor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyntaxFactoryImpl extends EFactoryImpl implements SyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyntaxFactory init() {
		try {
			SyntaxFactory theSyntaxFactory = (SyntaxFactory)EPackage.Registry.INSTANCE.getEFactory("http://constLang/syntax"); 
			if (theSyntaxFactory != null) {
				return theSyntaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxFactoryImpl() {
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
			case SyntaxPackage.CONSTRAINT: return createConstraint();
			case SyntaxPackage.SIMPLE_FEATURE: return createSimpleFeature();
			case SyntaxPackage.MULTIPLE_FEATURE: return createMultipleFeature();
			case SyntaxPackage.NUMBER: return createNumber();
			case SyntaxPackage.DIV: return createDiv();
			case SyntaxPackage.PLUS: return createPlus();
			case SyntaxPackage.MUL: return createMul();
			case SyntaxPackage.MINUS: return createMinus();
			case SyntaxPackage.CONTEXT: return createContext();
			case SyntaxPackage.ALL: return createAll();
			case SyntaxPackage.ANY: return createAny();
			case SyntaxPackage.NEG: return createNeg();
			case SyntaxPackage.AND: return createAnd();
			case SyntaxPackage.OR: return createOr();
			case SyntaxPackage.XOR: return createXor();
			case SyntaxPackage.IMPLIES: return createImplies();
			case SyntaxPackage.MORE: return createMore();
			case SyntaxPackage.LESS_OR_EQUAL: return createLessOrEqual();
			case SyntaxPackage.LESS: return createLess();
			case SyntaxPackage.NOT_EQUAL: return createNotEqual();
			case SyntaxPackage.EQUAL: return createEqual();
			case SyntaxPackage.MORE_OR_EQUAL: return createMoreOrEqual();
			case SyntaxPackage.MODEL: return createModel();
			case SyntaxPackage.BOOL_PRIORITY_OPERAND1: return createBoolPriorityOperand1();
			case SyntaxPackage.NUM_PRIORITY_OPERAND2: return createNumPriorityOperand2();
			case SyntaxPackage.BOOL_PRIORITY_OPERAND2: return createBoolPriorityOperand2();
			case SyntaxPackage.NUM_PRIORITY_OPERAND1: return createNumPriorityOperand1();
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
	public syntax.Number createNumber() {
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
	public SyntaxPackage getSyntaxPackage() {
		return (SyntaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SyntaxPackage getPackage() {
		return SyntaxPackage.eINSTANCE;
	}

} //SyntaxFactoryImpl
