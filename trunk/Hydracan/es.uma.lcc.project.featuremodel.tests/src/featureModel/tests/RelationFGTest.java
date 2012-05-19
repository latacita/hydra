/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel.tests;

import featureModel.FeatureModelFactory;
import featureModel.RelationFG;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation FG</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationFGTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationFGTest.class);
	}

	/**
	 * Constructs a new Relation FG test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationFGTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation FG test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationFG getFixture() {
		return (RelationFG)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureModelFactory.eINSTANCE.createRelationFG());
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

} //RelationFGTest
