/**
 */
package DTML.impl;

import DTML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTMLFactoryImpl extends EFactoryImpl implements DTMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DTMLFactory init() {
		try {
			DTMLFactory theDTMLFactory = (DTMLFactory) EPackage.Registry.INSTANCE.getEFactory(DTMLPackage.eNS_URI);
			if (theDTMLFactory != null) {
				return theDTMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DTMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DTMLPackage.INTERFACE:
			return createInterface();
		case DTMLPackage.COMPONENT:
			return createComponent();
		case DTMLPackage.RELATIONSHIP:
			return createRelationship();
		case DTMLPackage.PROPERTY:
			return createProperty();
		case DTMLPackage.COMMAND:
			return createCommand();
		case DTMLPackage.TELEMETRY:
			return createTelemetry();
		case DTMLPackage.DTMI:
			return createDTMI();
		case DTMLPackage.COMMAND_PAYLOAD:
			return createCommandPayload();
		case DTMLPackage.QUANTITY:
			return createQuantity();
		case DTMLPackage.UNIT_TEST:
			return createUnit_Test();
		case DTMLPackage.UREAL:
			return createUReal();
		case DTMLPackage.FIELD:
			return createField();
		case DTMLPackage.DT_OBJECT:
			return createDTObject();
		case DTMLPackage.DT_ARRAY:
			return createDTArray();
		case DTMLPackage.DT_MAP:
			return createDTMap();
		case DTMLPackage.DT_ENUM:
			return createDTEnum();
		case DTMLPackage.DIGITAL_TWIN:
			return createDigitalTwin();
		case DTMLPackage.COMPONENT_INSTANCE:
			return createComponentInstance();
		case DTMLPackage.RELATIONSHIP_INSTANCE:
			return createRelationshipInstance();
		case DTMLPackage.PROPERTY_INSTANCE:
			return createPropertyInstance();
		case DTMLPackage.COMMAND_INSTANCE:
			return createCommandInstance();
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE:
			return createCommandPayloadInstance();
		case DTMLPackage.ENUM_SCHEMA_TYPES:
			return createEnumSchemaTypes();
		case DTMLPackage.ENUM_VALUE:
			return createEnumValue();
		case DTMLPackage.KEY_VALUE_TYPE:
			return createKeyValueType();
		case DTMLPackage.OBJECT_INSTANCE:
			return createObjectInstance();
		case DTMLPackage.DT_BOOLEAN:
			return createDTBoolean();
		case DTMLPackage.DT_STRING:
			return createDTString();
		case DTMLPackage.DT_INTEGER:
			return createDTInteger();
		case DTMLPackage.FIELD_INSTANCE:
			return createFieldInstance();
		case DTMLPackage.MAP_INSTANCE:
			return createMapInstance();
		case DTMLPackage.KEY_VALUE_INSTANCE:
			return createKeyValueInstance();
		case DTMLPackage.ARRAY_INSTANCE:
			return createArrayInstance();
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT:
			return createDigitalTwinEnvironment();
		case DTMLPackage.STRING_INSTANCE:
			return createStringInstance();
		case DTMLPackage.INT_INSTANCE:
			return createIntInstance();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DTMLPackage.SCHEMA:
			return createSchemaFromString(eDataType, initialValue);
		case DTMLPackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		case DTMLPackage.UNIT:
			return createUnitFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DTMLPackage.SCHEMA:
			return convertSchemaToString(eDataType, instanceValue);
		case DTMLPackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		case DTMLPackage.UNIT:
			return convertUnitToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Telemetry createTelemetry() {
		TelemetryImpl telemetry = new TelemetryImpl();
		return telemetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMI createDTMI() {
		DTMIImpl dtmi = new DTMIImpl();
		return dtmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPayload createCommandPayload() {
		CommandPayloadImpl commandPayload = new CommandPayloadImpl();
		return commandPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit_Test createUnit_Test() {
		Unit_TestImpl unit_Test = new Unit_TestImpl();
		return unit_Test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UReal createUReal() {
		URealImpl uReal = new URealImpl();
		return uReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTObject createDTObject() {
		DTObjectImpl dtObject = new DTObjectImpl();
		return dtObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTArray createDTArray() {
		DTArrayImpl dtArray = new DTArrayImpl();
		return dtArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMap createDTMap() {
		DTMapImpl dtMap = new DTMapImpl();
		return dtMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTEnum createDTEnum() {
		DTEnumImpl dtEnum = new DTEnumImpl();
		return dtEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalTwin createDigitalTwin() {
		DigitalTwinImpl digitalTwin = new DigitalTwinImpl();
		return digitalTwin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipInstance createRelationshipInstance() {
		RelationshipInstanceImpl relationshipInstance = new RelationshipInstanceImpl();
		return relationshipInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyInstance createPropertyInstance() {
		PropertyInstanceImpl propertyInstance = new PropertyInstanceImpl();
		return propertyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandInstance createCommandInstance() {
		CommandInstanceImpl commandInstance = new CommandInstanceImpl();
		return commandInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPayloadInstance createCommandPayloadInstance() {
		CommandPayloadInstanceImpl commandPayloadInstance = new CommandPayloadInstanceImpl();
		return commandPayloadInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSchemaTypes createEnumSchemaTypes() {
		EnumSchemaTypesImpl enumSchemaTypes = new EnumSchemaTypesImpl();
		return enumSchemaTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType createKeyValueType() {
		KeyValueTypeImpl keyValueType = new KeyValueTypeImpl();
		return keyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstance createObjectInstance() {
		ObjectInstanceImpl objectInstance = new ObjectInstanceImpl();
		return objectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTBoolean createDTBoolean() {
		DTBooleanImpl dtBoolean = new DTBooleanImpl();
		return dtBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTString createDTString() {
		DTStringImpl dtString = new DTStringImpl();
		return dtString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTInteger createDTInteger() {
		DTIntegerImpl dtInteger = new DTIntegerImpl();
		return dtInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldInstance createFieldInstance() {
		FieldInstanceImpl fieldInstance = new FieldInstanceImpl();
		return fieldInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapInstance createMapInstance() {
		MapInstanceImpl mapInstance = new MapInstanceImpl();
		return mapInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueInstance createKeyValueInstance() {
		KeyValueInstanceImpl keyValueInstance = new KeyValueInstanceImpl();
		return keyValueInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInstance createArrayInstance() {
		ArrayInstanceImpl arrayInstance = new ArrayInstanceImpl();
		return arrayInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalTwinEnvironment createDigitalTwinEnvironment() {
		DigitalTwinEnvironmentImpl digitalTwinEnvironment = new DigitalTwinEnvironmentImpl();
		return digitalTwinEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringInstance createStringInstance() {
		StringInstanceImpl stringInstance = new StringInstanceImpl();
		return stringInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntInstance createIntInstance() {
		IntInstanceImpl intInstance = new IntInstanceImpl();
		return intInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchemaFromString(EDataType eDataType, String initialValue) {
		Schema result = Schema.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMLPackage getDTMLPackage() {
		return (DTMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DTMLPackage getPackage() {
		return DTMLPackage.eINSTANCE;
	}

} //DTMLFactoryImpl
