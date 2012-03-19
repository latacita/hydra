/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.tests;

import junit.textui.TestRunner;

import tef.project.expressions.ExpressionsFactory;
import tef.project.expressions.LE;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LETest extends ComparisonOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LETest.class);
	}

	/**
	 * Constructs a new LE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this LE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LE getFixture() {
		return (LE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ExpressionsFactory.eINSTANCE.createLE());
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

} //LETest
