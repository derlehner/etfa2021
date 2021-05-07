/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.Relationship#isWritable <em>Writable</em>}</li>
 *   <li>{@link DTML.Relationship#getMinMultiplicity <em>Min Multiplicity</em>}</li>
 *   <li>{@link DTML.Relationship#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 *   <li>{@link DTML.Relationship#getProperties <em>Properties</em>}</li>
 *   <li>{@link DTML.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link DTML.Relationship#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends InterfaceContent {
	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see DTML.DTMLPackage#getRelationship_Writable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link DTML.Relationship#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Multiplicity</em>' attribute.
	 * @see #setMinMultiplicity(int)
	 * @see DTML.DTMLPackage#getRelationship_MinMultiplicity()
	 * @model
	 * @generated
	 */
	int getMinMultiplicity();

	/**
	 * Sets the value of the '{@link DTML.Relationship#getMinMultiplicity <em>Min Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Multiplicity</em>' attribute.
	 * @see #getMinMultiplicity()
	 * @generated
	 */
	void setMinMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #setMaxMultiplicity(int)
	 * @see DTML.DTMLPackage#getRelationship_MaxMultiplicity()
	 * @model
	 * @generated
	 */
	int getMaxMultiplicity();

	/**
	 * Sets the value of the '{@link DTML.Relationship#getMaxMultiplicity <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #getMaxMultiplicity()
	 * @generated
	 */
	void setMaxMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see DTML.DTMLPackage#getRelationship_Properties()
	 * @model containment="true" upper="300"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Interface)
	 * @see DTML.DTMLPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Interface getTarget();

	/**
	 * Sets the value of the '{@link DTML.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Interface value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Relationship
