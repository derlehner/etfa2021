/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.FieldInstance#getType <em>Type</em>}</li>
 *   <li>{@link DTML.FieldInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getFieldInstance()
 * @model
 * @generated
 */
public interface FieldInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Field)
	 * @see DTML.DTMLPackage#getFieldInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Field getType();

	/**
	 * Sets the value of the '{@link DTML.FieldInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Field value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.DataPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see DTML.DTMLPackage#getFieldInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPoint> getValue();

} // FieldInstance
