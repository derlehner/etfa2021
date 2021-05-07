/**
 */
package DTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UReal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.UReal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getUReal()
 * @model
 * @generated
 */
public interface UReal extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see DTML.DTMLPackage#getUReal_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link DTML.UReal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // UReal
