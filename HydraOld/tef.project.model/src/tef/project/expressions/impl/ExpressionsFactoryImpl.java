/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tef.project.expressions.All;
import tef.project.expressions.And;
import tef.project.expressions.Any;
import tef.project.expressions.ComparisonOperand;
import tef.project.expressions.ComparisonOperator;
import tef.project.expressions.Count;
import tef.project.expressions.D;
import tef.project.expressions.E;
import tef.project.expressions.ExpressionsFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionsFactory init() {
		try {
			ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.informatik.hu-berlin.de/sam/meta-tools/expressions"); 
			if (theExpressionsFactory != null) {
				return theExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExpressionsPackage.IMPLIES: return createImplies();
			case ExpressionsPackage.OR: return createOr();
			case ExpressionsPackage.AND: return createAnd();
			case ExpressionsPackage.NEG: return createNeg();
			case ExpressionsPackage.MODEL: return createModel();
			case ExpressionsPackage.FEATURE: return createFeature();
			case ExpressionsPackage.ALL: return createAll();
			case ExpressionsPackage.NUMBER: return createNumber();
			case ExpressionsPackage.ANY: return createAny();
			case ExpressionsPackage.COMPARISON_OPERATOR: return createComparisonOperator();
			case ExpressionsPackage.GE: return createGE();
			case ExpressionsPackage.G: return createG();
			case ExpressionsPackage.LE: return createLE();
			case ExpressionsPackage.L: return createL();
			case ExpressionsPackage.E: return createE();
			case ExpressionsPackage.D: return createD();
			case ExpressionsPackage.COMPARISON_OPERAND: return createComparisonOperand();
			case ExpressionsPackage.QUANTITY: return createQuantity();
			case ExpressionsPackage.FUNCTION: return createFunction();
			case ExpressionsPackage.COUNT: return createCount();
			case ExpressionsPackage.QUANTIFY_OPERATOR: return createQuantifyOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
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
	public Neg createNeg() {
		NegImpl neg = new NegImpl();
		return neg;
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
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
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
	public tef.project.expressions.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
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
	public ComparisonOperator createComparisonOperator() {
		ComparisonOperatorImpl comparisonOperator = new ComparisonOperatorImpl();
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GE createGE() {
		GEImpl ge = new GEImpl();
		return ge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G createG() {
		GImpl g = new GImpl();
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LE createLE() {
		LEImpl le = new LEImpl();
		return le;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L createL() {
		LImpl l = new LImpl();
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E createE() {
		EImpl e = new EImpl();
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D createD() {
		DImpl d = new DImpl();
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperand createComparisonOperand() {
		ComparisonOperandImpl comparisonOperand = new ComparisonOperandImpl();
		return comparisonOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyOperator createQuantifyOperator() {
		QuantifyOperatorImpl quantifyOperator = new QuantifyOperatorImpl();
		return quantifyOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsPackage getExpressionsPackage() {
		return (ExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ExpressionsPackage getPackage() {
		return ExpressionsPackage.eINSTANCE;
	}

} //ExpressionsFactoryImpl
