/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.ObjectInstance#getFieldInstances <em>Field Instances</em>}</li>
 *   <li>{@link DTML.ObjectInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getObjectInstance()
 * @model
 * @generated
 */
public interface ObjectInstance extends DataPoint {
	/**
	 * Returns the value of the '<em><b>Field Instances</b></em>' reference list.
	 * The list contents are of type {@link DTML.FieldInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Instances</em>' reference list.
	 * @see DTML.DTMLPackage#getObjectInstance_FieldInstances()
	 * @model
	 * @generated
	 */
	EList<FieldInstance> getFieldInstances();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DTObject)
	 * @see DTML.DTMLPackage#getObjectInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	DTObject getType();

	/**
	 * Sets the value of the '{@link DTML.ObjectInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DTObject value);

} // ObjectInstance
