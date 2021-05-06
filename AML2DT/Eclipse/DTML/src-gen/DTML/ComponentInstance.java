/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.ComponentInstance#getSchema <em>Schema</em>}</li>
 *   <li>{@link DTML.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link DTML.ComponentInstance#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends DTContent {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(DigitalTwin)
	 * @see DTML.DTMLPackage#getComponentInstance_Schema()
	 * @model containment="true"
	 * @generated
	 */
	DigitalTwin getSchema();

	/**
	 * Sets the value of the '{@link DTML.ComponentInstance#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(DigitalTwin value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see DTML.DTMLPackage#getComponentInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link DTML.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.ComponentContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see DTML.DTMLPackage#getComponentInstance_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentContent> getContents();

} // ComponentInstance
