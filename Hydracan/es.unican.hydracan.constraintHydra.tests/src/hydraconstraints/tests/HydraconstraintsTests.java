/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hydraconstraints</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HydraconstraintsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new HydraconstraintsTests("hydraconstraints Tests");
		suite.addTestSuite(ModelTest.class);
		suite.addTestSuite(NegTest.class);
		suite.addTestSuite(AndTest.class);
		suite.addTestSuite(OrTest.class);
		suite.addTestSuite(ImpliesTest.class);
		suite.addTestSuite(XorTest.class);
		suite.addTestSuite(MoreTest.class);
		suite.addTestSuite(MoreOrEqualTest.class);
		suite.addTestSuite(NotEqualTest.class);
		suite.addTestSuite(LessTest.class);
		suite.addTestSuite(EqualTest.class);
		suite.addTestSuite(LessOrEqualTest.class);
		suite.addTestSuite(PlusTest.class);
		suite.addTestSuite(MulTest.class);
		suite.addTestSuite(MinusTest.class);
		suite.addTestSuite(DivTest.class);
		suite.addTestSuite(MultipleFeatureTest.class);
		suite.addTestSuite(SimpleFeatureTest.class);
		suite.addTestSuite(ContextTest.class);
		suite.addTestSuite(AnyTest.class);
		suite.addTestSuite(AllTest.class);
		suite.addTestSuite(NumberTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraconstraintsTests(String name) {
		super(name);
	}

} //HydraconstraintsTests
