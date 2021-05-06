/**
 */
package DTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Payload Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.CommandPayloadInstance#getType <em>Type</em>}</li>
 *   <li>{@link DTML.CommandPayloadInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getCommandPayloadInstance()
 * @model
 * @generated
 */
public interface CommandPayloadInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CommandPayload)
	 * @see DTML.DTMLPackage#getCommandPayloadInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	CommandPayload getType();

	/**
	 * Sets the value of the '{@link DTML.CommandPayloadInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CommandPayload value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(DataPoint)
	 * @see DTML.DTMLPackage#getCommandPayloadInstance_Value()
	 * @model
	 * @generated
	 */
	DataPoint getValue();

	/**
	 * Sets the value of the '{@link DTML.CommandPayloadInstance#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataPoint value);

} // CommandPayloadInstance
