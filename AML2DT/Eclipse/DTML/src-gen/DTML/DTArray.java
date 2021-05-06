/**
 */
package DTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DT Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.DTArray#getElementSchema <em>Element Schema</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getDTArray()
 * @model
 * @generated
 */
public interface DTArray extends DTElement, ComplexSchema {
	/**
	 * Returns the value of the '<em><b>Element Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Schema</em>' reference.
	 * @see #setElementSchema(Schema_Test)
	 * @see DTML.DTMLPackage#getDTArray_ElementSchema()
	 * @model
	 * @generated
	 */
	Schema_Test getElementSchema();

	/**
	 * Sets the value of the '{@link DTML.DTArray#getElementSchema <em>Element Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Schema</em>' reference.
	 * @see #getElementSchema()
	 * @generated
	 */
	void setElementSchema(Schema_Test value);

} // DTArray
