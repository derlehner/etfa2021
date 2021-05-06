/**
 */
package DTML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see DTML.DTMLPackage#getUnit()
 * @model
 * @generated
 */
public enum Unit implements Enumerator {
	/**
	 * The '<em><b>Metre Per Second Squared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METRE_PER_SECOND_SQUARED_VALUE
	 * @generated
	 * @ordered
	 */
	METRE_PER_SECOND_SQUARED(8, "metrePerSecondSquared", "metrePerSecondSquared"),

	/**
	 * The '<em><b>Centimetre Per Second Squared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTIMETRE_PER_SECOND_SQUARED_VALUE
	 * @generated
	 * @ordered
	 */
	CENTIMETRE_PER_SECOND_SQUARED(1, "centimetrePerSecondSquared", "centimetrePerSecondSquared"),

	/**
	 * The '<em><b>GForce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GFORCE_VALUE
	 * @generated
	 * @ordered
	 */
	GFORCE(2, "gForce", "gForce"),

	/**
	 * The '<em><b>Kilogram Per Cubic Metre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOGRAM_PER_CUBIC_METRE_VALUE
	 * @generated
	 * @ordered
	 */
	KILOGRAM_PER_CUBIC_METRE(3, "kilogramPerCubicMetre", "kilogramPerCubicMetre"),

	/**
	 * The '<em><b>Gram Per Cubic Metre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAM_PER_CUBIC_METRE_VALUE
	 * @generated
	 * @ordered
	 */
	GRAM_PER_CUBIC_METRE(4, "gramPerCubicMetre", "gramPerCubicMetre"),

	/**
	 * The '<em><b>Kelvin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KELVIN_VALUE
	 * @generated
	 * @ordered
	 */
	KELVIN(5, "kelvin", "kelvin"),

	/**
	 * The '<em><b>Degree Celsius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE_CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
	DEGREE_CELSIUS(6, "degreeCelsius", "degreeCelsius"),

	/**
	 * The '<em><b>Degree Fahrenheit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE_FAHRENHEIT_VALUE
	 * @generated
	 * @ordered
	 */
	DEGREE_FAHRENHEIT(7, "degreeFahrenheit", "degreeFahrenheit"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE");

	/**
	 * The '<em><b>Metre Per Second Squared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METRE_PER_SECOND_SQUARED
	 * @model name="metrePerSecondSquared"
	 * @generated
	 * @ordered
	 */
	public static final int METRE_PER_SECOND_SQUARED_VALUE = 8;

	/**
	 * The '<em><b>Centimetre Per Second Squared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTIMETRE_PER_SECOND_SQUARED
	 * @model name="centimetrePerSecondSquared"
	 * @generated
	 * @ordered
	 */
	public static final int CENTIMETRE_PER_SECOND_SQUARED_VALUE = 1;

	/**
	 * The '<em><b>GForce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GFORCE
	 * @model name="gForce"
	 * @generated
	 * @ordered
	 */
	public static final int GFORCE_VALUE = 2;

	/**
	 * The '<em><b>Kilogram Per Cubic Metre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOGRAM_PER_CUBIC_METRE
	 * @model name="kilogramPerCubicMetre"
	 * @generated
	 * @ordered
	 */
	public static final int KILOGRAM_PER_CUBIC_METRE_VALUE = 3;

	/**
	 * The '<em><b>Gram Per Cubic Metre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAM_PER_CUBIC_METRE
	 * @model name="gramPerCubicMetre"
	 * @generated
	 * @ordered
	 */
	public static final int GRAM_PER_CUBIC_METRE_VALUE = 4;

	/**
	 * The '<em><b>Kelvin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KELVIN
	 * @model name="kelvin"
	 * @generated
	 * @ordered
	 */
	public static final int KELVIN_VALUE = 5;

	/**
	 * The '<em><b>Degree Celsius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE_CELSIUS
	 * @model name="degreeCelsius"
	 * @generated
	 * @ordered
	 */
	public static final int DEGREE_CELSIUS_VALUE = 6;

	/**
	 * The '<em><b>Degree Fahrenheit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE_FAHRENHEIT
	 * @model name="degreeFahrenheit"
	 * @generated
	 * @ordered
	 */
	public static final int DEGREE_FAHRENHEIT_VALUE = 7;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Unit[] VALUES_ARRAY = new Unit[] { METRE_PER_SECOND_SQUARED, CENTIMETRE_PER_SECOND_SQUARED,
			GFORCE, KILOGRAM_PER_CUBIC_METRE, GRAM_PER_CUBIC_METRE, KELVIN, DEGREE_CELSIUS, DEGREE_FAHRENHEIT, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Unit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Unit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Unit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Unit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Unit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Unit get(int value) {
		switch (value) {
		case METRE_PER_SECOND_SQUARED_VALUE:
			return METRE_PER_SECOND_SQUARED;
		case CENTIMETRE_PER_SECOND_SQUARED_VALUE:
			return CENTIMETRE_PER_SECOND_SQUARED;
		case GFORCE_VALUE:
			return GFORCE;
		case KILOGRAM_PER_CUBIC_METRE_VALUE:
			return KILOGRAM_PER_CUBIC_METRE;
		case GRAM_PER_CUBIC_METRE_VALUE:
			return GRAM_PER_CUBIC_METRE;
		case KELVIN_VALUE:
			return KELVIN;
		case DEGREE_CELSIUS_VALUE:
			return DEGREE_CELSIUS;
		case DEGREE_FAHRENHEIT_VALUE:
			return DEGREE_FAHRENHEIT;
		case NONE_VALUE:
			return NONE;
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
	private Unit(int value, String name, String literal) {
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

} //Unit
