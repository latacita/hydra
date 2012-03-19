/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tef.project.expressions.tests;

import junit.textui.TestRunner;

import tef.project.expressions.ComparisonOperand;
import tef.project.expressions.ExpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comparison Operand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonOperandTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComparisonOperandTest.class);
	}

	/**
	 * Constructs a new Comparison Operand test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comparison Operand test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComparisonOperand getFixture() {
		return (ComparisonOperand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ExpressionsFactory.eINSTANCE.createComparisonOperand());
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

} //ComparisonOperandTest
