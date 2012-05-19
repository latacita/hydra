/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package syntax.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import syntax.SyntaxFactory;
import syntax.SyntaxPackage;
import syntax.UnaryOp;
import syntax.Xor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyntaxPackageImpl extends EPackageImpl implements SyntaxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moreOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numOperandChoicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolOperandChoicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolPriorityOperand1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPriorityOperand2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolPriorityOperand2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPriorityOperand1EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see syntax.SyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SyntaxPackageImpl() {
		super(eNS_URI, SyntaxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SyntaxPackage init() {
		if (isInited) return (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);

		// Obtain or create and register package
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyntaxPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSyntaxPackage.createPackageContents();

		// Initialize created meta-data
		theSyntaxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSyntaxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SyntaxPackage.eNS_URI, theSyntaxPackage);
		return theSyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Operators() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolOperand() {
		return boolOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumOperand() {
		return numOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleFeature() {
		return simpleFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleFeature() {
		return multipleFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleFeature_FeatureName() {
		return (EAttribute)multipleFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_NumValue() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOp() {
		return unaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryOp_UnaryOp() {
		return (EReference)unaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOp() {
		return binaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOp_BinaryOp1() {
		return (EReference)binaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOp_BinaryOp2() {
		return (EReference)binaryOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_SelectionOp() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_CompOp1() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_CompOp2() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumOperator() {
		return numOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumOperator_NumOp1() {
		return (EReference)numOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumOperator_NumOp2() {
		return (EReference)numOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMul() {
		return mulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContextOp1() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContextOp2() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAll() {
		return allEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAny() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeg() {
		return negEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplies() {
		return impliesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMore() {
		return moreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessOrEqual() {
		return lessOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLess() {
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEqual() {
		return notEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoreOrEqual() {
		return moreOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Constraints() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_FeatureList() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumOperandChoices() {
		return numOperandChoicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolOperandChoices() {
		return boolOperandChoicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolPriorityOperand1() {
		return boolPriorityOperand1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolPriorityOperand1_BoolPriorityOp1() {
		return (EReference)boolPriorityOperand1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPriorityOperand2() {
		return numPriorityOperand2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumPriorityOperand2_NumPriorityOp2() {
		return (EReference)numPriorityOperand2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolPriorityOperand2() {
		return boolPriorityOperand2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolPriorityOperand2_BoolPriorityOp2() {
		return (EReference)boolPriorityOperand2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPriorityOperand1() {
		return numPriorityOperand1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumPriorityOperand1_NumPriorityOp1() {
		return (EReference)numPriorityOperand1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxFactory getSyntaxFactory() {
		return (SyntaxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__OPERATORS);

		operandEClass = createEClass(OPERAND);

		boolOperandEClass = createEClass(BOOL_OPERAND);

		numOperandEClass = createEClass(NUM_OPERAND);

		simpleFeatureEClass = createEClass(SIMPLE_FEATURE);

		multipleFeatureEClass = createEClass(MULTIPLE_FEATURE);
		createEAttribute(multipleFeatureEClass, MULTIPLE_FEATURE__FEATURE_NAME);

		numberEClass = createEClass(NUMBER);
		createEAttribute(numberEClass, NUMBER__NUM_VALUE);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);

		unaryOpEClass = createEClass(UNARY_OP);
		createEReference(unaryOpEClass, UNARY_OP__UNARY_OP);

		binaryOpEClass = createEClass(BINARY_OP);
		createEReference(binaryOpEClass, BINARY_OP__BINARY_OP1);
		createEReference(binaryOpEClass, BINARY_OP__BINARY_OP2);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__SELECTION_OP);

		comparisonEClass = createEClass(COMPARISON);
		createEReference(comparisonEClass, COMPARISON__COMP_OP1);
		createEReference(comparisonEClass, COMPARISON__COMP_OP2);

		numOperatorEClass = createEClass(NUM_OPERATOR);
		createEReference(numOperatorEClass, NUM_OPERATOR__NUM_OP1);
		createEReference(numOperatorEClass, NUM_OPERATOR__NUM_OP2);

		divEClass = createEClass(DIV);

		plusEClass = createEClass(PLUS);

		mulEClass = createEClass(MUL);

		minusEClass = createEClass(MINUS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CONTEXT_OP1);
		createEReference(contextEClass, CONTEXT__CONTEXT_OP2);

		allEClass = createEClass(ALL);

		anyEClass = createEClass(ANY);

		negEClass = createEClass(NEG);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		xorEClass = createEClass(XOR);

		impliesEClass = createEClass(IMPLIES);

		moreEClass = createEClass(MORE);

		lessOrEqualEClass = createEClass(LESS_OR_EQUAL);

		lessEClass = createEClass(LESS);

		notEqualEClass = createEClass(NOT_EQUAL);

		equalEClass = createEClass(EQUAL);

		moreOrEqualEClass = createEClass(MORE_OR_EQUAL);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONSTRAINTS);
		createEAttribute(modelEClass, MODEL__FEATURE_LIST);

		numOperandChoicesEClass = createEClass(NUM_OPERAND_CHOICES);

		boolOperandChoicesEClass = createEClass(BOOL_OPERAND_CHOICES);

		boolPriorityOperand1EClass = createEClass(BOOL_PRIORITY_OPERAND1);
		createEReference(boolPriorityOperand1EClass, BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1);

		numPriorityOperand2EClass = createEClass(NUM_PRIORITY_OPERAND2);
		createEReference(numPriorityOperand2EClass, NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2);

		boolPriorityOperand2EClass = createEClass(BOOL_PRIORITY_OPERAND2);
		createEReference(boolPriorityOperand2EClass, BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2);

		numPriorityOperand1EClass = createEClass(NUM_PRIORITY_OPERAND1);
		createEReference(numPriorityOperand1EClass, NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boolOperandEClass.getESuperTypes().add(this.getOperand());
		numOperandEClass.getESuperTypes().add(this.getOperand());
		simpleFeatureEClass.getESuperTypes().add(this.getMultipleFeature());
		simpleFeatureEClass.getESuperTypes().add(this.getBoolOperandChoices());
		multipleFeatureEClass.getESuperTypes().add(this.getNumOperandChoices());
		numberEClass.getESuperTypes().add(this.getNumOperandChoices());
		logicalOperatorEClass.getESuperTypes().add(this.getBoolOperand());
		unaryOpEClass.getESuperTypes().add(this.getLogicalOperator());
		binaryOpEClass.getESuperTypes().add(this.getLogicalOperator());
		selectionEClass.getESuperTypes().add(this.getBoolOperandChoices());
		comparisonEClass.getESuperTypes().add(this.getLogicalOperator());
		numOperatorEClass.getESuperTypes().add(this.getNumOperand());
		divEClass.getESuperTypes().add(this.getNumOperator());
		plusEClass.getESuperTypes().add(this.getNumOperator());
		mulEClass.getESuperTypes().add(this.getNumOperator());
		minusEClass.getESuperTypes().add(this.getNumOperator());
		contextEClass.getESuperTypes().add(this.getBoolOperandChoices());
		contextEClass.getESuperTypes().add(this.getNumOperandChoices());
		allEClass.getESuperTypes().add(this.getSelection());
		anyEClass.getESuperTypes().add(this.getSelection());
		negEClass.getESuperTypes().add(this.getUnaryOp());
		andEClass.getESuperTypes().add(this.getBinaryOp());
		orEClass.getESuperTypes().add(this.getBinaryOp());
		xorEClass.getESuperTypes().add(this.getBinaryOp());
		impliesEClass.getESuperTypes().add(this.getBinaryOp());
		moreEClass.getESuperTypes().add(this.getComparison());
		lessOrEqualEClass.getESuperTypes().add(this.getComparison());
		lessEClass.getESuperTypes().add(this.getComparison());
		notEqualEClass.getESuperTypes().add(this.getComparison());
		equalEClass.getESuperTypes().add(this.getComparison());
		moreOrEqualEClass.getESuperTypes().add(this.getComparison());
		numOperandChoicesEClass.getESuperTypes().add(this.getNumOperand());
		boolOperandChoicesEClass.getESuperTypes().add(this.getBoolOperand());

		// Initialize classes and features; add operations and parameters
		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Operators(), this.getOperand(), null, "operators", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandEClass, Operand.class, "Operand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolOperandEClass, BoolOperand.class, "BoolOperand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numOperandEClass, NumOperand.class, "NumOperand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleFeatureEClass, SimpleFeature.class, "SimpleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleFeatureEClass, MultipleFeature.class, "MultipleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleFeature_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, MultipleFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEClass, syntax.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumber_NumValue(), ecorePackage.getEInt(), "numValue", null, 1, 1, syntax.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOpEClass, UnaryOp.class, "UnaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOp_UnaryOp(), this.getBoolPriorityOperand2(), null, "unaryOp", null, 1, 1, UnaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOpEClass, BinaryOp.class, "BinaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOp_BinaryOp1(), this.getBoolPriorityOperand1(), null, "binaryOp1", null, 1, 1, BinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOp_BinaryOp2(), this.getBoolPriorityOperand2(), null, "binaryOp2", null, 1, 1, BinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_SelectionOp(), this.getBoolPriorityOperand2(), null, "selectionOp", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparison_CompOp1(), this.getNumPriorityOperand2(), null, "compOp1", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_CompOp2(), this.getNumPriorityOperand2(), null, "compOp2", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numOperatorEClass, NumOperator.class, "NumOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumOperator_NumOp1(), this.getNumPriorityOperand1(), null, "numOp1", null, 1, 1, NumOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumOperator_NumOp2(), this.getNumPriorityOperand2(), null, "numOp2", null, 1, 1, NumOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mulEClass, Mul.class, "Mul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_ContextOp1(), this.getMultipleFeature(), null, "contextOp1", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ContextOp2(), this.getConstraint(), null, "contextOp2", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allEClass, All.class, "All", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negEClass, Neg.class, "Neg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impliesEClass, Implies.class, "Implies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moreEClass, More.class, "More", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessOrEqualEClass, LessOrEqual.class, "LessOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEClass, Less.class, "Less", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEqualEClass, NotEqual.class, "NotEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moreOrEqualEClass, MoreOrEqual.class, "MoreOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_FeatureList(), ecorePackage.getEString(), "featureList", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numOperandChoicesEClass, NumOperandChoices.class, "NumOperandChoices", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolOperandChoicesEClass, BoolOperandChoices.class, "BoolOperandChoices", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolPriorityOperand1EClass, BoolPriorityOperand1.class, "BoolPriorityOperand1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoolPriorityOperand1_BoolPriorityOp1(), this.getBoolOperand(), null, "boolPriorityOp1", null, 1, 1, BoolPriorityOperand1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numPriorityOperand2EClass, NumPriorityOperand2.class, "NumPriorityOperand2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumPriorityOperand2_NumPriorityOp2(), this.getNumOperand(), null, "numPriorityOp2", null, 1, 1, NumPriorityOperand2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolPriorityOperand2EClass, BoolPriorityOperand2.class, "BoolPriorityOperand2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoolPriorityOperand2_BoolPriorityOp2(), this.getBoolOperand(), null, "boolPriorityOp2", null, 1, 1, BoolPriorityOperand2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numPriorityOperand1EClass, NumPriorityOperand1.class, "NumPriorityOperand1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumPriorityOperand1_NumPriorityOp1(), this.getNumOperand(), null, "numPriorityOp1", null, 1, 1, NumPriorityOperand1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SyntaxPackageImpl
