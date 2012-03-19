/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featureModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Group Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see featureModel.FeatureModelPackage#getFeatureGroupType()
 * @model
 * @generated
 */
public enum FeatureGroupType implements Enumerator {
	/**
	 * The '<em><b>XORGROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XORGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	XORGROUP(0, "XORGROUP", "XORGROUP"),

	/**
	 * The '<em><b>ORGROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	ORGROUP(1, "ORGROUP", "ORGROUP"),

	/**
	 * The '<em><b>SIMPLEGROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLEGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLEGROUP(2, "SIMPLEGROUP", "SIMPLEGROUP");

	/**
	 * The '<em><b>XORGROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XORGROUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XORGROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XORGROUP_VALUE = 0;

	/**
	 * The '<em><b>ORGROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORGROUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORGROUP_VALUE = 1;

	/**
	 * The '<em><b>SIMPLEGROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMPLEGROUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLEGROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLEGROUP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feature Group Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureGroupType[] VALUES_ARRAY =
		new FeatureGroupType[] {
			XORGROUP,
			ORGROUP,
			SIMPLEGROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Feature Group Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureGroupType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Group Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureGroupType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureGroupType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Group Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureGroupType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureGroupType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Group Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureGroupType get(int value) {
		switch (value) {
			case XORGROUP_VALUE: return XORGROUP;
			case ORGROUP_VALUE: return ORGROUP;
			case SIMPLEGROUP_VALUE: return SIMPLEGROUP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeatureGroupType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FeatureGroupType
