/**
 */
package DTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.KeyValueInstance#getValue <em>Value</em>}</li>
 *   <li>{@link DTML.KeyValueInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getKeyValueInstance()
 * @model
 * @generated
 */
public interface KeyValueInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DataPoint)
	 * @see DTML.DTMLPackage#getKeyValueInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	DataPoint getValue();

	/**
	 * Sets the value of the '{@link DTML.KeyValueInstance#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataPoint value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(KeyValueType)
	 * @see DTML.DTMLPackage#getKeyValueInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	KeyValueType getType();

	/**
	 * Sets the value of the '{@link DTML.KeyValueInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(KeyValueType value);

} // KeyValueInstance
