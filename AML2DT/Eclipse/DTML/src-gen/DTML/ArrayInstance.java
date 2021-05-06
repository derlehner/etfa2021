/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.ArrayInstance#getValues <em>Values</em>}</li>
 *   <li>{@link DTML.ArrayInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getArrayInstance()
 * @model
 * @generated
 */
public interface ArrayInstance extends DataPoint {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.DataPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see DTML.DTMLPackage#getArrayInstance_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPoint> getValues();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DTArray)
	 * @see DTML.DTMLPackage#getArrayInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	DTArray getType();

	/**
	 * Sets the value of the '{@link DTML.ArrayInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DTArray value);

} // ArrayInstance
