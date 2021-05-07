/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.Command#getName <em>Name</em>}</li>
 *   <li>{@link DTML.Command#getRequest <em>Request</em>}</li>
 *   <li>{@link DTML.Command#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends InterfaceContent {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getCommand_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.Command#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.CommandPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see DTML.DTMLPackage#getCommand_Request()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandPayload> getRequest();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.CommandPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see DTML.DTMLPackage#getCommand_Response()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandPayload> getResponse();

} // Command
