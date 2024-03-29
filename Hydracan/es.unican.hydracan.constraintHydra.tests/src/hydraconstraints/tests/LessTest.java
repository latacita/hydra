/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.tests;

import hydraconstraints.HydraconstraintsFactory;
import hydraconstraints.Less;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Less</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessTest extends ComparisonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LessTest.class);
	}

	/**
	 * Constructs a new Less test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Less test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Less getFixture() {
		return (Less)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HydraconstraintsFactory.eINSTANCE.createLess());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LessTest
