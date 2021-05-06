/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.MapInstance#getKeys <em>Keys</em>}</li>
 *   <li>{@link DTML.MapInstance#getValues <em>Values</em>}</li>
 *   <li>{@link DTML.MapInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getMapInstance()
 * @model
 * @generated
 */
public interface MapInstance extends DataPoint {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link DTML.KeyValueInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see DTML.DTMLPackage#getMapInstance_Keys()
	 * @model
	 * @generated
	 */
	EList<KeyValueInstance> getKeys();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link DTML.KeyValueInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see DTML.DTMLPackage#getMapInstance_Values()
	 * @model
	 * @generated
	 */
	EList<KeyValueInstance> getValues();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DTMap)
	 * @see DTML.DTMLPackage#getMapInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	DTMap getType();

	/**
	 * Sets the value of the '{@link DTML.MapInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DTMap value);

} // MapInstance
