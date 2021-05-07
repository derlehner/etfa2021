/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DT Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.DTMap#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link DTML.DTMap#getMapValue <em>Map Value</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getDTMap()
 * @model
 * @generated
 */
public interface DTMap extends DTElement, ComplexSchema {
	/**
	 * Returns the value of the '<em><b>Map Key</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key</em>' containment reference list.
	 * @see DTML.DTMLPackage#getDTMap_MapKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValueType> getMapKey();

	/**
	 * Returns the value of the '<em><b>Map Value</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Value</em>' containment reference list.
	 * @see DTML.DTMLPackage#getDTMap_MapValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValueType> getMapValue();

} // DTMap
