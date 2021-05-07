/**
 */
package DTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.CommandInstance#getRequest <em>Request</em>}</li>
 *   <li>{@link DTML.CommandInstance#getResponse <em>Response</em>}</li>
 *   <li>{@link DTML.CommandInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getCommandInstance()
 * @model
 * @generated
 */
public interface CommandInstance extends DTContent {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(CommandPayloadInstance)
	 * @see DTML.DTMLPackage#getCommandInstance_Request()
	 * @model
	 * @generated
	 */
	CommandPayloadInstance getRequest();

	/**
	 * Sets the value of the '{@link DTML.CommandInstance#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(CommandPayloadInstance value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(CommandPayloadInstance)
	 * @see DTML.DTMLPackage#getCommandInstance_Response()
	 * @model
	 * @generated
	 */
	CommandPayloadInstance getResponse();

	/**
	 * Sets the value of the '{@link DTML.CommandInstance#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(CommandPayloadInstance value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Command)
	 * @see DTML.DTMLPackage#getCommandInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Command getType();

	/**
	 * Sets the value of the '{@link DTML.CommandInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Command value);

} // CommandInstance
