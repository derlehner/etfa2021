/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Twin Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.DigitalTwinEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link DTML.DigitalTwinEnvironment#getInstances <em>Instances</em>}</li>
 *   <li>{@link DTML.DigitalTwinEnvironment#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getDigitalTwinEnvironment()
 * @model
 * @generated
 */
public interface DigitalTwinEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getDigitalTwinEnvironment_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.DigitalTwinEnvironment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.DigitalTwin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see DTML.DTMLPackage#getDigitalTwinEnvironment_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalTwin> getInstances();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see DTML.DTMLPackage#getDigitalTwinEnvironment_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getTypes();

} // DigitalTwinEnvironment
