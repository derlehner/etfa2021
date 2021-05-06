/**
 */
package DTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telemetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DTML.Telemetry#getType <em>Type</em>}</li>
 *   <li>{@link DTML.Telemetry#getName <em>Name</em>}</li>
 *   <li>{@link DTML.Telemetry#getSchema <em>Schema</em>}</li>
 *   <li>{@link DTML.Telemetry#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see DTML.DTMLPackage#getTelemetry()
 * @model
 * @generated
 */
public interface Telemetry extends InterfaceContent {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link DTML.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see DTML.Type
	 * @see #setType(Type)
	 * @see DTML.DTMLPackage#getTelemetry_Type()
	 * @model default="NONE"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link DTML.Telemetry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see DTML.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DTML.DTMLPackage#getTelemetry_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DTML.Telemetry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * The literals are from the enumeration {@link DTML.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see DTML.Schema
	 * @see #setSchema(Schema)
	 * @see DTML.DTMLPackage#getTelemetry_Schema()
	 * @model required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link DTML.Telemetry#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see DTML.Schema
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link DTML.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see DTML.Unit
	 * @see #setUnit(Unit)
	 * @see DTML.DTMLPackage#getTelemetry_Unit()
	 * @model default="NONE"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link DTML.Telemetry#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see DTML.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Telemetry
