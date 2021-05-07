/**
 */
package DTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.KeyValueType#getName <em>Name</em>}</li>
 *   <li>{@link DTML.KeyValueType#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getKeyValueType()
 * @model
 * @generated
 */
public interface KeyValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getKeyValueType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.KeyValueType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema_Test)
	 * @see DTML.DTMLPackage#getKeyValueType_Schema()
	 * @model
	 * @generated
	 */
	Schema_Test getSchema();

	/**
	 * Sets the value of the '{@link DTML.KeyValueType#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema_Test value);

} // KeyValueType
