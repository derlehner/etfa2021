/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Twin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.DigitalTwin#getContents <em>Contents</em>}</li>
 *   <li>{@link DTML.DigitalTwin#getType <em>Type</em>}</li>
 *   <li>{@link DTML.DigitalTwin#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getDigitalTwin()
 * @model
 * @generated
 */
public interface DigitalTwin extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.DTContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see DTML.DTMLPackage#getDigitalTwin_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTContent> getContents();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Interface)
	 * @see DTML.DTMLPackage#getDigitalTwin_Type()
	 * @model required="true"
	 * @generated
	 */
	Interface getType();

	/**
	 * Sets the value of the '{@link DTML.DigitalTwin#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Interface value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getDigitalTwin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.DigitalTwin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DigitalTwin
