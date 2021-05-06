/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.Interface#getContents <em>Contents</em>}</li>
 *   <li>{@link DTML.Interface#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends DTElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link DTML.InterfaceContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see DTML.DTMLPackage#getInterface_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceContent> getContents();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link DTML.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see DTML.DTMLPackage#getInterface_Extends()
	 * @model upper="2"
	 * @generated
	 */
	EList<Interface> getExtends();

} // Interface
