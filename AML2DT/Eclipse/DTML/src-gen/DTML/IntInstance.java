/**
 */
package DTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.IntInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getIntInstance()
 * @model
 * @generated
 */
public interface IntInstance extends DataPoint {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see DTML.DTMLPackage#getIntInstance_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link DTML.IntInstance#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntInstance
