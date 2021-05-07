/**
 */
package DTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.Quantity#getValue <em>Value</em>}</li>
 *   <li>{@link DTML.Quantity#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(UReal)
	 * @see DTML.DTMLPackage#getQuantity_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UReal getValue();

	/**
	 * Sets the value of the '{@link DTML.Quantity#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(UReal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Unit_Test)
	 * @see DTML.DTMLPackage#getQuantity_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Unit_Test getUnit();

	/**
	 * Sets the value of the '{@link DTML.Quantity#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit_Test value);

} // Quantity
