/**
 */
package DTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.Unit_Test#getName <em>Name</em>}</li>
 *   <li>{@link DTML.Unit_Test#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link DTML.Unit_Test#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link DTML.Unit_Test#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link DTML.Unit_Test#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getUnit_Test()
 * @model
 * @generated
 */
public interface Unit_Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getUnit_Test_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.Unit_Test#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see DTML.DTMLPackage#getUnit_Test_Symbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link DTML.Unit_Test#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute list.
	 * @see DTML.DTMLPackage#getUnit_Test_Dimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" lower="12" upper="12"
	 * @generated
	 */
	EList<Double> getDimensions();

	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute list.
	 * @see DTML.DTMLPackage#getUnit_Test_ConversionFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" lower="12" upper="12"
	 * @generated
	 */
	EList<Double> getConversionFactor();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute list.
	 * @see DTML.DTMLPackage#getUnit_Test_Offset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" lower="12" upper="12"
	 * @generated
	 */
	EList<Double> getOffset();

} // Unit_Test
