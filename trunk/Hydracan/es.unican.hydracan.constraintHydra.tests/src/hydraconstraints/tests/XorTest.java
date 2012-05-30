/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hydraconstraints.tests;

import hydraconstraints.HydraconstraintsFactory;
import hydraconstraints.Xor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XorTest extends BinaryOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XorTest.class);
	}

	/**
	 * Constructs a new Xor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Xor getFixture() {
		return (Xor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HydraconstraintsFactory.eINSTANCE.createXor());
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

} //XorTest
