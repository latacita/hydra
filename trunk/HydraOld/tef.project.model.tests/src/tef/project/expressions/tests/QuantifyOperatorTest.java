/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.tests;

import junit.textui.TestRunner;

import tef.project.expressions.ExpressionsFactory;
import tef.project.expressions.QuantifyOperator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quantify Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifyOperatorTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuantifyOperatorTest.class);
	}

	/**
	 * Constructs a new Quantify Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quantify Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QuantifyOperator getFixture() {
		return (QuantifyOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ExpressionsFactory.eINSTANCE.createQuantifyOperator());
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

} //QuantifyOperatorTest
