/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel.tests;

import featureModel.FeatureGroup;
import featureModel.FeatureModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureGroupTest.class);
	}

	/**
	 * Constructs a new Feature Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureGroup getFixture() {
		return (FeatureGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureModelFactory.eINSTANCE.createFeatureGroup());
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

} //FeatureGroupTest
