/**
 */
package DTML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DTML.DTMLPackage
 * @generated
 */
public interface DTMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DTMLFactory eINSTANCE = DTML.impl.DTMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telemetry</em>'.
	 * @generated
	 */
	Telemetry createTelemetry();

	/**
	 * Returns a new object of class '<em>DTMI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTMI</em>'.
	 * @generated
	 */
	DTMI createDTMI();

	/**
	 * Returns a new object of class '<em>Command Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Payload</em>'.
	 * @generated
	 */
	CommandPayload createCommandPayload();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Unit Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Test</em>'.
	 * @generated
	 */
	Unit_Test createUnit_Test();

	/**
	 * Returns a new object of class '<em>UReal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UReal</em>'.
	 * @generated
	 */
	UReal createUReal();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>DT Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Object</em>'.
	 * @generated
	 */
	DTObject createDTObject();

	/**
	 * Returns a new object of class '<em>DT Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Array</em>'.
	 * @generated
	 */
	DTArray createDTArray();

	/**
	 * Returns a new object of class '<em>DT Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Map</em>'.
	 * @generated
	 */
	DTMap createDTMap();

	/**
	 * Returns a new object of class '<em>DT Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Enum</em>'.
	 * @generated
	 */
	DTEnum createDTEnum();

	/**
	 * Returns a new object of class '<em>Digital Twin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Twin</em>'.
	 * @generated
	 */
	DigitalTwin createDigitalTwin();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Instance</em>'.
	 * @generated
	 */
	RelationshipInstance createRelationshipInstance();

	/**
	 * Returns a new object of class '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Instance</em>'.
	 * @generated
	 */
	PropertyInstance createPropertyInstance();

	/**
	 * Returns a new object of class '<em>Command Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Instance</em>'.
	 * @generated
	 */
	CommandInstance createCommandInstance();

	/**
	 * Returns a new object of class '<em>Command Payload Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Payload Instance</em>'.
	 * @generated
	 */
	CommandPayloadInstance createCommandPayloadInstance();

	/**
	 * Returns a new object of class '<em>Enum Schema Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Schema Types</em>'.
	 * @generated
	 */
	EnumSchemaTypes createEnumSchemaTypes();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Key Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Type</em>'.
	 * @generated
	 */
	KeyValueType createKeyValueType();

	/**
	 * Returns a new object of class '<em>Object Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Instance</em>'.
	 * @generated
	 */
	ObjectInstance createObjectInstance();

	/**
	 * Returns a new object of class '<em>DT Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Boolean</em>'.
	 * @generated
	 */
	DTBoolean createDTBoolean();

	/**
	 * Returns a new object of class '<em>DT String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT String</em>'.
	 * @generated
	 */
	DTString createDTString();

	/**
	 * Returns a new object of class '<em>DT Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Integer</em>'.
	 * @generated
	 */
	DTInteger createDTInteger();

	/**
	 * Returns a new object of class '<em>Field Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Instance</em>'.
	 * @generated
	 */
	FieldInstance createFieldInstance();

	/**
	 * Returns a new object of class '<em>Map Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Instance</em>'.
	 * @generated
	 */
	MapInstance createMapInstance();

	/**
	 * Returns a new object of class '<em>Key Value Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Instance</em>'.
	 * @generated
	 */
	KeyValueInstance createKeyValueInstance();

	/**
	 * Returns a new object of class '<em>Array Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Instance</em>'.
	 * @generated
	 */
	ArrayInstance createArrayInstance();

	/**
	 * Returns a new object of class '<em>Digital Twin Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Twin Environment</em>'.
	 * @generated
	 */
	DigitalTwinEnvironment createDigitalTwinEnvironment();

	/**
	 * Returns a new object of class '<em>String Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Instance</em>'.
	 * @generated
	 */
	StringInstance createStringInstance();

	/**
	 * Returns a new object of class '<em>Int Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Instance</em>'.
	 * @generated
	 */
	IntInstance createIntInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DTMLPackage getDTMLPackage();

} //DTMLFactory
