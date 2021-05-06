/**
 */
package DTML.util;

import DTML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DTML.DTMLPackage
 * @generated
 */
public class DTMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DTMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMLSwitch() {
		if (modelPackage == null) {
			modelPackage = DTMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DTMLPackage.INTERFACE_CONTENT: {
			InterfaceContent interfaceContent = (InterfaceContent) theEObject;
			T result = caseInterfaceContent(interfaceContent);
			if (result == null)
				result = caseDTElement(interfaceContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseDTElement(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseInterfaceContent(component);
			if (result == null)
				result = caseDTElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.RELATIONSHIP: {
			Relationship relationship = (Relationship) theEObject;
			T result = caseRelationship(relationship);
			if (result == null)
				result = caseInterfaceContent(relationship);
			if (result == null)
				result = caseDTElement(relationship);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = caseInterfaceContent(property);
			if (result == null)
				result = caseDTElement(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = caseInterfaceContent(command);
			if (result == null)
				result = caseDTElement(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.TELEMETRY: {
			Telemetry telemetry = (Telemetry) theEObject;
			T result = caseTelemetry(telemetry);
			if (result == null)
				result = caseInterfaceContent(telemetry);
			if (result == null)
				result = caseDTElement(telemetry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DTMI: {
			DTMI dtmi = (DTMI) theEObject;
			T result = caseDTMI(dtmi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMMAND_PAYLOAD: {
			CommandPayload commandPayload = (CommandPayload) theEObject;
			T result = caseCommandPayload(commandPayload);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_ELEMENT: {
			DTElement dtElement = (DTElement) theEObject;
			T result = caseDTElement(dtElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.QUANTITY: {
			Quantity quantity = (Quantity) theEObject;
			T result = caseQuantity(quantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.UNIT_TEST: {
			Unit_Test unit_Test = (Unit_Test) theEObject;
			T result = caseUnit_Test(unit_Test);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.UREAL: {
			UReal uReal = (UReal) theEObject;
			T result = caseUReal(uReal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.FIELD: {
			Field field = (Field) theEObject;
			T result = caseField(field);
			if (result == null)
				result = caseDTElement(field);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_OBJECT: {
			DTObject dtObject = (DTObject) theEObject;
			T result = caseDTObject(dtObject);
			if (result == null)
				result = caseDTElement(dtObject);
			if (result == null)
				result = caseComplexSchema(dtObject);
			if (result == null)
				result = caseSchema_Test(dtObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_ARRAY: {
			DTArray dtArray = (DTArray) theEObject;
			T result = caseDTArray(dtArray);
			if (result == null)
				result = caseDTElement(dtArray);
			if (result == null)
				result = caseComplexSchema(dtArray);
			if (result == null)
				result = caseSchema_Test(dtArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_MAP: {
			DTMap dtMap = (DTMap) theEObject;
			T result = caseDTMap(dtMap);
			if (result == null)
				result = caseDTElement(dtMap);
			if (result == null)
				result = caseComplexSchema(dtMap);
			if (result == null)
				result = caseSchema_Test(dtMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_ENUM: {
			DTEnum dtEnum = (DTEnum) theEObject;
			T result = caseDTEnum(dtEnum);
			if (result == null)
				result = caseDTElement(dtEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DIGITAL_TWIN: {
			DigitalTwin digitalTwin = (DigitalTwin) theEObject;
			T result = caseDigitalTwin(digitalTwin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMPONENT_INSTANCE: {
			ComponentInstance componentInstance = (ComponentInstance) theEObject;
			T result = caseComponentInstance(componentInstance);
			if (result == null)
				result = caseDTContent(componentInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.RELATIONSHIP_INSTANCE: {
			RelationshipInstance relationshipInstance = (RelationshipInstance) theEObject;
			T result = caseRelationshipInstance(relationshipInstance);
			if (result == null)
				result = caseDTContent(relationshipInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.PROPERTY_INSTANCE: {
			PropertyInstance propertyInstance = (PropertyInstance) theEObject;
			T result = casePropertyInstance(propertyInstance);
			if (result == null)
				result = caseDTContent(propertyInstance);
			if (result == null)
				result = caseComponentContent(propertyInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMMAND_INSTANCE: {
			CommandInstance commandInstance = (CommandInstance) theEObject;
			T result = caseCommandInstance(commandInstance);
			if (result == null)
				result = caseDTContent(commandInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE: {
			CommandPayloadInstance commandPayloadInstance = (CommandPayloadInstance) theEObject;
			T result = caseCommandPayloadInstance(commandPayloadInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DATA_POINT: {
			DataPoint dataPoint = (DataPoint) theEObject;
			T result = caseDataPoint(dataPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_CONTENT: {
			DTContent dtContent = (DTContent) theEObject;
			T result = caseDTContent(dtContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.SCHEMA_TEST: {
			Schema_Test schema_Test = (Schema_Test) theEObject;
			T result = caseSchema_Test(schema_Test);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMPLEX_SCHEMA: {
			ComplexSchema complexSchema = (ComplexSchema) theEObject;
			T result = caseComplexSchema(complexSchema);
			if (result == null)
				result = caseSchema_Test(complexSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.ENUM_SCHEMA_TYPES: {
			EnumSchemaTypes enumSchemaTypes = (EnumSchemaTypes) theEObject;
			T result = caseEnumSchemaTypes(enumSchemaTypes);
			if (result == null)
				result = caseComplexSchema(enumSchemaTypes);
			if (result == null)
				result = caseSchema_Test(enumSchemaTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.ENUM_VALUE: {
			EnumValue enumValue = (EnumValue) theEObject;
			T result = caseEnumValue(enumValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.KEY_VALUE_TYPE: {
			KeyValueType keyValueType = (KeyValueType) theEObject;
			T result = caseKeyValueType(keyValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.OBJECT_INSTANCE: {
			ObjectInstance objectInstance = (ObjectInstance) theEObject;
			T result = caseObjectInstance(objectInstance);
			if (result == null)
				result = caseDataPoint(objectInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.SIMPLE_SCHEMA: {
			SimpleSchema simpleSchema = (SimpleSchema) theEObject;
			T result = caseSimpleSchema(simpleSchema);
			if (result == null)
				result = caseSchema_Test(simpleSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_BOOLEAN: {
			DTBoolean dtBoolean = (DTBoolean) theEObject;
			T result = caseDTBoolean(dtBoolean);
			if (result == null)
				result = caseSimpleSchema(dtBoolean);
			if (result == null)
				result = caseSchema_Test(dtBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_STRING: {
			DTString dtString = (DTString) theEObject;
			T result = caseDTString(dtString);
			if (result == null)
				result = caseSimpleSchema(dtString);
			if (result == null)
				result = caseSchema_Test(dtString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DT_INTEGER: {
			DTInteger dtInteger = (DTInteger) theEObject;
			T result = caseDTInteger(dtInteger);
			if (result == null)
				result = caseSimpleSchema(dtInteger);
			if (result == null)
				result = caseSchema_Test(dtInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.FIELD_INSTANCE: {
			FieldInstance fieldInstance = (FieldInstance) theEObject;
			T result = caseFieldInstance(fieldInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.MAP_INSTANCE: {
			MapInstance mapInstance = (MapInstance) theEObject;
			T result = caseMapInstance(mapInstance);
			if (result == null)
				result = caseDataPoint(mapInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.KEY_VALUE_INSTANCE: {
			KeyValueInstance keyValueInstance = (KeyValueInstance) theEObject;
			T result = caseKeyValueInstance(keyValueInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.ARRAY_INSTANCE: {
			ArrayInstance arrayInstance = (ArrayInstance) theEObject;
			T result = caseArrayInstance(arrayInstance);
			if (result == null)
				result = caseDataPoint(arrayInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT: {
			DigitalTwinEnvironment digitalTwinEnvironment = (DigitalTwinEnvironment) theEObject;
			T result = caseDigitalTwinEnvironment(digitalTwinEnvironment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.STRING_INSTANCE: {
			StringInstance stringInstance = (StringInstance) theEObject;
			T result = caseStringInstance(stringInstance);
			if (result == null)
				result = caseDataPoint(stringInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.INT_INSTANCE: {
			IntInstance intInstance = (IntInstance) theEObject;
			T result = caseIntInstance(intInstance);
			if (result == null)
				result = caseDataPoint(intInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DTMLPackage.COMPONENT_CONTENT: {
			ComponentContent componentContent = (ComponentContent) theEObject;
			T result = caseComponentContent(componentContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceContent(InterfaceContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telemetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelemetry(Telemetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTMI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTMI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTMI(DTMI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandPayload(CommandPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTElement(DTElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit_Test(Unit_Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UReal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UReal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUReal(UReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTObject(DTObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTArray(DTArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTMap(DTMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTEnum(DTEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Twin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Twin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalTwin(DigitalTwin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipInstance(RelationshipInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInstance(PropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandInstance(CommandInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Payload Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Payload Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandPayloadInstance(CommandPayloadInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPoint(DataPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTContent(DTContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema_Test(Schema_Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexSchema(ComplexSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Schema Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Schema Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumSchemaTypes(EnumSchemaTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueType(KeyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectInstance(ObjectInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSchema(SimpleSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTBoolean(DTBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTString(DTString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTInteger(DTInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldInstance(FieldInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapInstance(MapInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueInstance(KeyValueInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInstance(ArrayInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Twin Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Twin Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalTwinEnvironment(DigitalTwinEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringInstance(StringInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntInstance(IntInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentContent(ComponentContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DTMLSwitch
