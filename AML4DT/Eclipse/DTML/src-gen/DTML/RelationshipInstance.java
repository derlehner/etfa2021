/**
 */
package DTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.RelationshipInstance#getTarget <em>Target</em>}</li>
 *   <li>{@link DTML.RelationshipInstance#getType <em>Type</em>}</li>
 *   <li>{@link DTML.RelationshipInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getRelationshipInstance()
 * @model
 * @generated
 */
public interface RelationshipInstance extends DTContent {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DigitalTwin)
	 * @see DTML.DTMLPackage#getRelationshipInstance_Target()
	 * @model
	 * @generated
	 */
	DigitalTwin getTarget();

	/**
	 * Sets the value of the '{@link DTML.RelationshipInstance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DigitalTwin value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Relationship)
	 * @see DTML.DTMLPackage#getRelationshipInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Relationship getType();

	/**
	 * Sets the value of the '{@link DTML.RelationshipInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Relationship value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getRelationshipInstance_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.RelationshipInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RelationshipInstance
