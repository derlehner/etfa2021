/**
 */
package DTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DT Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.DTEnum#getValueSchema <em>Value Schema</em>}</li>
 *   <li>{@link DTML.DTEnum#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getDTEnum()
 * @model
 * @generated
 */
public interface DTEnum extends DTElement {
	/**
	 * Returns the value of the '<em><b>Value Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Schema</em>' reference.
	 * @see #setValueSchema(EnumSchemaTypes)
	 * @see DTML.DTMLPackage#getDTEnum_ValueSchema()
	 * @model
	 * @generated
	 */
	EnumSchemaTypes getValueSchema();

	/**
	 * Sets the value of the '{@link DTML.DTEnum#getValueSchema <em>Value Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Schema</em>' reference.
	 * @see #getValueSchema()
	 * @generated
	 */
	void setValueSchema(EnumSchemaTypes value);

	/**
	 * Returns the value of the '<em><b>Enum Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Values</em>' reference.
	 * @see #setEnumValues(EnumValue)
	 * @see DTML.DTMLPackage#getDTEnum_EnumValues()
	 * @model
	 * @generated
	 */
	EnumValue getEnumValues();

	/**
	 * Sets the value of the '{@link DTML.DTEnum#getEnumValues <em>Enum Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Values</em>' reference.
	 * @see #getEnumValues()
	 * @generated
	 */
	void setEnumValues(EnumValue value);

} // DTEnum
