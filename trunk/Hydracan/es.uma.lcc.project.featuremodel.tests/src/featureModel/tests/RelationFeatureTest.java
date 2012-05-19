/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel.tests;

import featureModel.FeatureModelFactory;
import featureModel.RelationFeature;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationFeatureTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationFeatureTest.class);
	}

	/**
	 * Constructs a new Relation Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationFeature getFixture() {
		return (RelationFeature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureModelFactory.eINSTANCE.createRelationFeature());
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

} //RelationFeatureTest
