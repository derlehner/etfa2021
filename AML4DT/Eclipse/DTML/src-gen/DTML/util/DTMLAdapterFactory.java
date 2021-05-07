/**
 */
package DTML.util;

import DTML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DTML.DTMLPackage
 * @generated
 */
public class DTMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DTMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DTMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTMLSwitch<Adapter> modelSwitch = new DTMLSwitch<Adapter>() {
		@Override
		public Adapter caseInterfaceContent(InterfaceContent object) {
			return createInterfaceContentAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseRelationship(Relationship object) {
			return createRelationshipAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseTelemetry(Telemetry object) {
			return createTelemetryAdapter();
		}

		@Override
		public Adapter caseDTMI(DTMI object) {
			return createDTMIAdapter();
		}

		@Override
		public Adapter caseCommandPayload(CommandPayload object) {
			return createCommandPayloadAdapter();
		}

		@Override
		public Adapter caseDTElement(DTElement object) {
			return createDTElementAdapter();
		}

		@Override
		public Adapter caseQuantity(Quantity object) {
			return createQuantityAdapter();
		}

		@Override
		public Adapter caseUnit_Test(Unit_Test object) {
			return createUnit_TestAdapter();
		}

		@Override
		public Adapter caseUReal(UReal object) {
			return createURealAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseDTObject(DTObject object) {
			return createDTObjectAdapter();
		}

		@Override
		public Adapter caseDTArray(DTArray object) {
			return createDTArrayAdapter();
		}

		@Override
		public Adapter caseDTMap(DTMap object) {
			return createDTMapAdapter();
		}

		@Override
		public Adapter caseDTEnum(DTEnum object) {
			return createDTEnumAdapter();
		}

		@Override
		public Adapter caseDigitalTwin(DigitalTwin object) {
			return createDigitalTwinAdapter();
		}

		@Override
		public Adapter caseComponentInstance(ComponentInstance object) {
			return createComponentInstanceAdapter();
		}

		@Override
		public Adapter caseRelationshipInstance(RelationshipInstance object) {
			return createRelationshipInstanceAdapter();
		}

		@Override
		public Adapter casePropertyInstance(PropertyInstance object) {
			return createPropertyInstanceAdapter();
		}

		@Override
		public Adapter caseCommandInstance(CommandInstance object) {
			return createCommandInstanceAdapter();
		}

		@Override
		public Adapter caseCommandPayloadInstance(CommandPayloadInstance object) {
			return createCommandPayloadInstanceAdapter();
		}

		@Override
		public Adapter caseDataPoint(DataPoint object) {
			return createDataPointAdapter();
		}

		@Override
		public Adapter caseDTContent(DTContent object) {
			return createDTContentAdapter();
		}

		@Override
		public Adapter caseSchema_Test(Schema_Test object) {
			return createSchema_TestAdapter();
		}

		@Override
		public Adapter caseComplexSchema(ComplexSchema object) {
			return createComplexSchemaAdapter();
		}

		@Override
		public Adapter caseEnumSchemaTypes(EnumSchemaTypes object) {
			return createEnumSchemaTypesAdapter();
		}

		@Override
		public Adapter caseEnumValue(EnumValue object) {
			return createEnumValueAdapter();
		}

		@Override
		public Adapter caseKeyValueType(KeyValueType object) {
			return createKeyValueTypeAdapter();
		}

		@Override
		public Adapter caseObjectInstance(ObjectInstance object) {
			return createObjectInstanceAdapter();
		}

		@Override
		public Adapter caseSimpleSchema(SimpleSchema object) {
			return createSimpleSchemaAdapter();
		}

		@Override
		public Adapter caseDTBoolean(DTBoolean object) {
			return createDTBooleanAdapter();
		}

		@Override
		public Adapter caseDTString(DTString object) {
			return createDTStringAdapter();
		}

		@Override
		public Adapter caseDTInteger(DTInteger object) {
			return createDTIntegerAdapter();
		}

		@Override
		public Adapter caseFieldInstance(FieldInstance object) {
			return createFieldInstanceAdapter();
		}

		@Override
		public Adapter caseMapInstance(MapInstance object) {
			return createMapInstanceAdapter();
		}

		@Override
		public Adapter caseKeyValueInstance(KeyValueInstance object) {
			return createKeyValueInstanceAdapter();
		}

		@Override
		public Adapter caseArrayInstance(ArrayInstance object) {
			return createArrayInstanceAdapter();
		}

		@Override
		public Adapter caseDigitalTwinEnvironment(DigitalTwinEnvironment object) {
			return createDigitalTwinEnvironmentAdapter();
		}

		@Override
		public Adapter caseStringInstance(StringInstance object) {
			return createStringInstanceAdapter();
		}

		@Override
		public Adapter caseIntInstance(IntInstance object) {
			return createIntInstanceAdapter();
		}

		@Override
		public Adapter caseComponentContent(ComponentContent object) {
			return createComponentContentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.InterfaceContent <em>Interface Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.InterfaceContent
	 * @generated
	 */
	public Adapter createInterfaceContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Telemetry <em>Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Telemetry
	 * @generated
	 */
	public Adapter createTelemetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTMI <em>DTMI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTMI
	 * @generated
	 */
	public Adapter createDTMIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.CommandPayload <em>Command Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.CommandPayload
	 * @generated
	 */
	public Adapter createCommandPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTElement <em>DT Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTElement
	 * @generated
	 */
	public Adapter createDTElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Unit_Test <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Unit_Test
	 * @generated
	 */
	public Adapter createUnit_TestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.UReal <em>UReal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.UReal
	 * @generated
	 */
	public Adapter createURealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTObject <em>DT Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTObject
	 * @generated
	 */
	public Adapter createDTObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTArray <em>DT Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTArray
	 * @generated
	 */
	public Adapter createDTArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTMap <em>DT Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTMap
	 * @generated
	 */
	public Adapter createDTMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTEnum <em>DT Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTEnum
	 * @generated
	 */
	public Adapter createDTEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DigitalTwin <em>Digital Twin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DigitalTwin
	 * @generated
	 */
	public Adapter createDigitalTwinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.RelationshipInstance <em>Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.RelationshipInstance
	 * @generated
	 */
	public Adapter createRelationshipInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.PropertyInstance
	 * @generated
	 */
	public Adapter createPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.CommandInstance <em>Command Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.CommandInstance
	 * @generated
	 */
	public Adapter createCommandInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.CommandPayloadInstance <em>Command Payload Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.CommandPayloadInstance
	 * @generated
	 */
	public Adapter createCommandPayloadInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DataPoint <em>Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DataPoint
	 * @generated
	 */
	public Adapter createDataPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTContent <em>DT Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTContent
	 * @generated
	 */
	public Adapter createDTContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.Schema_Test <em>Schema Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.Schema_Test
	 * @generated
	 */
	public Adapter createSchema_TestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.ComplexSchema <em>Complex Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.ComplexSchema
	 * @generated
	 */
	public Adapter createComplexSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.EnumSchemaTypes <em>Enum Schema Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.EnumSchemaTypes
	 * @generated
	 */
	public Adapter createEnumSchemaTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.KeyValueType <em>Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.KeyValueType
	 * @generated
	 */
	public Adapter createKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.ObjectInstance
	 * @generated
	 */
	public Adapter createObjectInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.SimpleSchema <em>Simple Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.SimpleSchema
	 * @generated
	 */
	public Adapter createSimpleSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTBoolean <em>DT Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTBoolean
	 * @generated
	 */
	public Adapter createDTBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTString <em>DT String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTString
	 * @generated
	 */
	public Adapter createDTStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DTInteger <em>DT Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DTInteger
	 * @generated
	 */
	public Adapter createDTIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.FieldInstance <em>Field Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.FieldInstance
	 * @generated
	 */
	public Adapter createFieldInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.MapInstance <em>Map Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.MapInstance
	 * @generated
	 */
	public Adapter createMapInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.KeyValueInstance <em>Key Value Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.KeyValueInstance
	 * @generated
	 */
	public Adapter createKeyValueInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.ArrayInstance <em>Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.ArrayInstance
	 * @generated
	 */
	public Adapter createArrayInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.DigitalTwinEnvironment <em>Digital Twin Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.DigitalTwinEnvironment
	 * @generated
	 */
	public Adapter createDigitalTwinEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.StringInstance <em>String Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.StringInstance
	 * @generated
	 */
	public Adapter createStringInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.IntInstance <em>Int Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.IntInstance
	 * @generated
	 */
	public Adapter createIntInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DTML.ComponentContent <em>Component Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DTML.ComponentContent
	 * @generated
	 */
	public Adapter createComponentContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DTMLAdapterFactory
