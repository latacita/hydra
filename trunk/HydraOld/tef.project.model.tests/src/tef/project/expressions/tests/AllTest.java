/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.tests;

import junit.textui.TestRunner;

import tef.project.expressions.All;
import tef.project.expressions.ExpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>All</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllTest extends QuantifyOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllTest.class);
	}

	/**
	 * Constructs a new All test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this All test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private All getFixture() {
		return (All)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ExpressionsFactory.eINSTANCE.createAll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AllTest
