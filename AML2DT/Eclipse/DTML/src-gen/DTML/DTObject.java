/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DT Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.DTObject#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getDTObject()
 * @model
 * @generated
 */
public interface DTObject extends DTElement, ComplexSchema {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see DTML.DTMLPackage#getDTObject_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // DTObject
