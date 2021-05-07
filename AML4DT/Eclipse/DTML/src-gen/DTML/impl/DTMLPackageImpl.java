/**
 */
package DTML.impl;

import DTML.ArrayInstance;
import DTML.Command;
import DTML.CommandInstance;
import DTML.CommandPayload;
import DTML.CommandPayloadInstance;
import DTML.ComplexSchema;
import DTML.Component;
import DTML.ComponentContent;
import DTML.ComponentInstance;
import DTML.DTArray;
import DTML.DTBoolean;
import DTML.DTContent;
import DTML.DTElement;
import DTML.DTEnum;
import DTML.DTInteger;
import DTML.DTMLFactory;
import DTML.DTMLPackage;
import DTML.DTMap;
import DTML.DTObject;
import DTML.DTString;
import DTML.DataPoint;
import DTML.DigitalTwin;
import DTML.DigitalTwinEnvironment;
import DTML.EnumSchemaTypes;
import DTML.EnumValue;
import DTML.Field;
import DTML.FieldInstance;
import DTML.IntInstance;
import DTML.Interface;
import DTML.InterfaceContent;
import DTML.KeyValueInstance;
import DTML.KeyValueType;
import DTML.MapInstance;
import DTML.ObjectInstance;
import DTML.Property;
import DTML.PropertyInstance;
import DTML.Quantity;
import DTML.Relationship;
import DTML.RelationshipInstance;
import DTML.Schema;
import DTML.Schema_Test;
import DTML.SimpleSchema;
import DTML.StringInstance;
import DTML.Telemetry;
import DTML.Type;
import DTML.UReal;
import DTML.Unit;
import DTML.Unit_Test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTMLPackageImpl extends EPackageImpl implements DTMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telemetryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtmiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unit_TestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalTwinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandPayloadInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schema_TestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumSchemaTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalTwinEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see DTML.DTMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DTMLPackageImpl() {
		super(eNS_URI, DTMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DTMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DTMLPackage init() {
		if (isInited)
			return (DTMLPackage) EPackage.Registry.INSTANCE.getEPackage(DTMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDTMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DTMLPackageImpl theDTMLPackage = registeredDTMLPackage instanceof DTMLPackageImpl
				? (DTMLPackageImpl) registeredDTMLPackage
				: new DTMLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDTMLPackage.createPackageContents();

		// Initialize created meta-data
		theDTMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDTMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DTMLPackage.eNS_URI, theDTMLPackage);
		return theDTMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceContent() {
		return interfaceContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Contents() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Extends() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Schema() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Writable() {
		return (EAttribute) relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_MinMultiplicity() {
		return (EAttribute) relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_MaxMultiplicity() {
		return (EAttribute) relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Properties() {
		return (EReference) relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference) relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Name() {
		return (EAttribute) relationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Writable() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Unit() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Schema() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Name() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Request() {
		return (EReference) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Response() {
		return (EReference) commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelemetry() {
		return telemetryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelemetry_Type() {
		return (EAttribute) telemetryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelemetry_Name() {
		return (EAttribute) telemetryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelemetry_Schema() {
		return (EAttribute) telemetryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelemetry_Unit() {
		return (EAttribute) telemetryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTMI() {
		return dtmiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTMI_Scheme() {
		return (EAttribute) dtmiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTMI_Path() {
		return (EAttribute) dtmiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTMI_Version() {
		return (EAttribute) dtmiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandPayload() {
		return commandPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandPayload_Name() {
		return (EAttribute) commandPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandPayload_DisplayName() {
		return (EAttribute) commandPayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandPayload_Comment() {
		return (EAttribute) commandPayloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandPayload_Description() {
		return (EAttribute) commandPayloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandPayload_Schema() {
		return (EAttribute) commandPayloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTElement() {
		return dtElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTElement_DisplayName() {
		return (EAttribute) dtElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTElement_Description() {
		return (EAttribute) dtElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTElement_Comment() {
		return (EAttribute) dtElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTElement_Id() {
		return (EReference) dtElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Value() {
		return (EReference) quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Unit() {
		return (EReference) quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit_Test() {
		return unit_TestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Test_Name() {
		return (EAttribute) unit_TestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Test_Symbol() {
		return (EAttribute) unit_TestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Test_Dimensions() {
		return (EAttribute) unit_TestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Test_ConversionFactor() {
		return (EAttribute) unit_TestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Test_Offset() {
		return (EAttribute) unit_TestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUReal() {
		return uRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUReal_Value() {
		return (EAttribute) uRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Schema() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTObject() {
		return dtObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTObject_Fields() {
		return (EReference) dtObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTArray() {
		return dtArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTArray_ElementSchema() {
		return (EReference) dtArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTMap() {
		return dtMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTMap_MapKey() {
		return (EReference) dtMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTMap_MapValue() {
		return (EReference) dtMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTEnum() {
		return dtEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTEnum_ValueSchema() {
		return (EReference) dtEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTEnum_EnumValues() {
		return (EReference) dtEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalTwin() {
		return digitalTwinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalTwin_Contents() {
		return (EReference) digitalTwinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalTwin_Type() {
		return (EReference) digitalTwinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalTwin_Name() {
		return (EAttribute) digitalTwinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Schema() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Type() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Contents() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipInstance() {
		return relationshipInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipInstance_Target() {
		return (EReference) relationshipInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipInstance_Type() {
		return (EReference) relationshipInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipInstance_Name() {
		return (EAttribute) relationshipInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyInstance() {
		return propertyInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyInstance_Value() {
		return (EReference) propertyInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyInstance_Name() {
		return (EAttribute) propertyInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandInstance() {
		return commandInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandInstance_Request() {
		return (EReference) commandInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandInstance_Response() {
		return (EReference) commandInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandInstance_Type() {
		return (EReference) commandInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandPayloadInstance() {
		return commandPayloadInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandPayloadInstance_Type() {
		return (EReference) commandPayloadInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandPayloadInstance_Value() {
		return (EReference) commandPayloadInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPoint() {
		return dataPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTContent() {
		return dtContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema_Test() {
		return schema_TestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexSchema() {
		return complexSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumSchemaTypes() {
		return enumSchemaTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueType() {
		return keyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_Name() {
		return (EAttribute) keyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType_Schema() {
		return (EReference) keyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInstance() {
		return objectInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_FieldInstances() {
		return (EReference) objectInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_Type() {
		return (EReference) objectInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSchema() {
		return simpleSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTBoolean() {
		return dtBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTString() {
		return dtStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTInteger() {
		return dtIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldInstance() {
		return fieldInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldInstance_Type() {
		return (EReference) fieldInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldInstance_Value() {
		return (EReference) fieldInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapInstance() {
		return mapInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapInstance_Keys() {
		return (EReference) mapInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapInstance_Values() {
		return (EReference) mapInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapInstance_Type() {
		return (EReference) mapInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueInstance() {
		return keyValueInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueInstance_Value() {
		return (EReference) keyValueInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueInstance_Type() {
		return (EReference) keyValueInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstance() {
		return arrayInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstance_Values() {
		return (EReference) arrayInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstance_Type() {
		return (EReference) arrayInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalTwinEnvironment() {
		return digitalTwinEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalTwinEnvironment_Name() {
		return (EAttribute) digitalTwinEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalTwinEnvironment_Instances() {
		return (EReference) digitalTwinEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalTwinEnvironment_Types() {
		return (EReference) digitalTwinEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringInstance() {
		return stringInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringInstance_Value() {
		return (EAttribute) stringInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntInstance() {
		return intInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntInstance_Value() {
		return (EAttribute) intInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentContent() {
		return componentContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchema() {
		return schemaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMLFactory getDTMLFactory() {
		return (DTMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		interfaceContentEClass = createEClass(INTERFACE_CONTENT);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__CONTENTS);
		createEReference(interfaceEClass, INTERFACE__EXTENDS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__SCHEMA);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__WRITABLE);
		createEAttribute(relationshipEClass, RELATIONSHIP__MIN_MULTIPLICITY);
		createEAttribute(relationshipEClass, RELATIONSHIP__MAX_MULTIPLICITY);
		createEReference(relationshipEClass, RELATIONSHIP__PROPERTIES);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEAttribute(relationshipEClass, RELATIONSHIP__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__WRITABLE);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__UNIT);
		createEAttribute(propertyEClass, PROPERTY__SCHEMA);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__NAME);
		createEReference(commandEClass, COMMAND__REQUEST);
		createEReference(commandEClass, COMMAND__RESPONSE);

		telemetryEClass = createEClass(TELEMETRY);
		createEAttribute(telemetryEClass, TELEMETRY__TYPE);
		createEAttribute(telemetryEClass, TELEMETRY__NAME);
		createEAttribute(telemetryEClass, TELEMETRY__SCHEMA);
		createEAttribute(telemetryEClass, TELEMETRY__UNIT);

		dtmiEClass = createEClass(DTMI);
		createEAttribute(dtmiEClass, DTMI__SCHEME);
		createEAttribute(dtmiEClass, DTMI__PATH);
		createEAttribute(dtmiEClass, DTMI__VERSION);

		commandPayloadEClass = createEClass(COMMAND_PAYLOAD);
		createEAttribute(commandPayloadEClass, COMMAND_PAYLOAD__NAME);
		createEAttribute(commandPayloadEClass, COMMAND_PAYLOAD__DISPLAY_NAME);
		createEAttribute(commandPayloadEClass, COMMAND_PAYLOAD__COMMENT);
		createEAttribute(commandPayloadEClass, COMMAND_PAYLOAD__DESCRIPTION);
		createEAttribute(commandPayloadEClass, COMMAND_PAYLOAD__SCHEMA);

		dtElementEClass = createEClass(DT_ELEMENT);
		createEAttribute(dtElementEClass, DT_ELEMENT__DISPLAY_NAME);
		createEAttribute(dtElementEClass, DT_ELEMENT__DESCRIPTION);
		createEAttribute(dtElementEClass, DT_ELEMENT__COMMENT);
		createEReference(dtElementEClass, DT_ELEMENT__ID);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__VALUE);
		createEReference(quantityEClass, QUANTITY__UNIT);

		unit_TestEClass = createEClass(UNIT_TEST);
		createEAttribute(unit_TestEClass, UNIT_TEST__NAME);
		createEAttribute(unit_TestEClass, UNIT_TEST__SYMBOL);
		createEAttribute(unit_TestEClass, UNIT_TEST__DIMENSIONS);
		createEAttribute(unit_TestEClass, UNIT_TEST__CONVERSION_FACTOR);
		createEAttribute(unit_TestEClass, UNIT_TEST__OFFSET);

		uRealEClass = createEClass(UREAL);
		createEAttribute(uRealEClass, UREAL__VALUE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__SCHEMA);

		dtObjectEClass = createEClass(DT_OBJECT);
		createEReference(dtObjectEClass, DT_OBJECT__FIELDS);

		dtArrayEClass = createEClass(DT_ARRAY);
		createEReference(dtArrayEClass, DT_ARRAY__ELEMENT_SCHEMA);

		dtMapEClass = createEClass(DT_MAP);
		createEReference(dtMapEClass, DT_MAP__MAP_KEY);
		createEReference(dtMapEClass, DT_MAP__MAP_VALUE);

		dtEnumEClass = createEClass(DT_ENUM);
		createEReference(dtEnumEClass, DT_ENUM__VALUE_SCHEMA);
		createEReference(dtEnumEClass, DT_ENUM__ENUM_VALUES);

		digitalTwinEClass = createEClass(DIGITAL_TWIN);
		createEReference(digitalTwinEClass, DIGITAL_TWIN__CONTENTS);
		createEReference(digitalTwinEClass, DIGITAL_TWIN__TYPE);
		createEAttribute(digitalTwinEClass, DIGITAL_TWIN__NAME);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__SCHEMA);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__CONTENTS);

		relationshipInstanceEClass = createEClass(RELATIONSHIP_INSTANCE);
		createEReference(relationshipInstanceEClass, RELATIONSHIP_INSTANCE__TARGET);
		createEReference(relationshipInstanceEClass, RELATIONSHIP_INSTANCE__TYPE);
		createEAttribute(relationshipInstanceEClass, RELATIONSHIP_INSTANCE__NAME);

		propertyInstanceEClass = createEClass(PROPERTY_INSTANCE);
		createEReference(propertyInstanceEClass, PROPERTY_INSTANCE__VALUE);
		createEAttribute(propertyInstanceEClass, PROPERTY_INSTANCE__NAME);

		commandInstanceEClass = createEClass(COMMAND_INSTANCE);
		createEReference(commandInstanceEClass, COMMAND_INSTANCE__REQUEST);
		createEReference(commandInstanceEClass, COMMAND_INSTANCE__RESPONSE);
		createEReference(commandInstanceEClass, COMMAND_INSTANCE__TYPE);

		commandPayloadInstanceEClass = createEClass(COMMAND_PAYLOAD_INSTANCE);
		createEReference(commandPayloadInstanceEClass, COMMAND_PAYLOAD_INSTANCE__TYPE);
		createEReference(commandPayloadInstanceEClass, COMMAND_PAYLOAD_INSTANCE__VALUE);

		dataPointEClass = createEClass(DATA_POINT);

		dtContentEClass = createEClass(DT_CONTENT);

		schema_TestEClass = createEClass(SCHEMA_TEST);

		complexSchemaEClass = createEClass(COMPLEX_SCHEMA);

		enumSchemaTypesEClass = createEClass(ENUM_SCHEMA_TYPES);

		enumValueEClass = createEClass(ENUM_VALUE);

		keyValueTypeEClass = createEClass(KEY_VALUE_TYPE);
		createEAttribute(keyValueTypeEClass, KEY_VALUE_TYPE__NAME);
		createEReference(keyValueTypeEClass, KEY_VALUE_TYPE__SCHEMA);

		objectInstanceEClass = createEClass(OBJECT_INSTANCE);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__FIELD_INSTANCES);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__TYPE);

		simpleSchemaEClass = createEClass(SIMPLE_SCHEMA);

		dtBooleanEClass = createEClass(DT_BOOLEAN);

		dtStringEClass = createEClass(DT_STRING);

		dtIntegerEClass = createEClass(DT_INTEGER);

		fieldInstanceEClass = createEClass(FIELD_INSTANCE);
		createEReference(fieldInstanceEClass, FIELD_INSTANCE__TYPE);
		createEReference(fieldInstanceEClass, FIELD_INSTANCE__VALUE);

		mapInstanceEClass = createEClass(MAP_INSTANCE);
		createEReference(mapInstanceEClass, MAP_INSTANCE__KEYS);
		createEReference(mapInstanceEClass, MAP_INSTANCE__VALUES);
		createEReference(mapInstanceEClass, MAP_INSTANCE__TYPE);

		keyValueInstanceEClass = createEClass(KEY_VALUE_INSTANCE);
		createEReference(keyValueInstanceEClass, KEY_VALUE_INSTANCE__VALUE);
		createEReference(keyValueInstanceEClass, KEY_VALUE_INSTANCE__TYPE);

		arrayInstanceEClass = createEClass(ARRAY_INSTANCE);
		createEReference(arrayInstanceEClass, ARRAY_INSTANCE__VALUES);
		createEReference(arrayInstanceEClass, ARRAY_INSTANCE__TYPE);

		digitalTwinEnvironmentEClass = createEClass(DIGITAL_TWIN_ENVIRONMENT);
		createEAttribute(digitalTwinEnvironmentEClass, DIGITAL_TWIN_ENVIRONMENT__NAME);
		createEReference(digitalTwinEnvironmentEClass, DIGITAL_TWIN_ENVIRONMENT__INSTANCES);
		createEReference(digitalTwinEnvironmentEClass, DIGITAL_TWIN_ENVIRONMENT__TYPES);

		stringInstanceEClass = createEClass(STRING_INSTANCE);
		createEAttribute(stringInstanceEClass, STRING_INSTANCE__VALUE);

		intInstanceEClass = createEClass(INT_INSTANCE);
		createEAttribute(intInstanceEClass, INT_INSTANCE__VALUE);

		componentContentEClass = createEClass(COMPONENT_CONTENT);

		// Create enums
		schemaEEnum = createEEnum(SCHEMA);
		typeEEnum = createEEnum(TYPE);
		unitEEnum = createEEnum(UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceContentEClass.getESuperTypes().add(this.getDTElement());
		interfaceEClass.getESuperTypes().add(this.getDTElement());
		componentEClass.getESuperTypes().add(this.getInterfaceContent());
		relationshipEClass.getESuperTypes().add(this.getInterfaceContent());
		propertyEClass.getESuperTypes().add(this.getInterfaceContent());
		commandEClass.getESuperTypes().add(this.getInterfaceContent());
		telemetryEClass.getESuperTypes().add(this.getInterfaceContent());
		fieldEClass.getESuperTypes().add(this.getDTElement());
		dtObjectEClass.getESuperTypes().add(this.getDTElement());
		dtObjectEClass.getESuperTypes().add(this.getComplexSchema());
		dtArrayEClass.getESuperTypes().add(this.getDTElement());
		dtArrayEClass.getESuperTypes().add(this.getComplexSchema());
		dtMapEClass.getESuperTypes().add(this.getDTElement());
		dtMapEClass.getESuperTypes().add(this.getComplexSchema());
		dtEnumEClass.getESuperTypes().add(this.getDTElement());
		componentInstanceEClass.getESuperTypes().add(this.getDTContent());
		relationshipInstanceEClass.getESuperTypes().add(this.getDTContent());
		propertyInstanceEClass.getESuperTypes().add(this.getDTContent());
		propertyInstanceEClass.getESuperTypes().add(this.getComponentContent());
		commandInstanceEClass.getESuperTypes().add(this.getDTContent());
		complexSchemaEClass.getESuperTypes().add(this.getSchema_Test());
		enumSchemaTypesEClass.getESuperTypes().add(this.getComplexSchema());
		objectInstanceEClass.getESuperTypes().add(this.getDataPoint());
		simpleSchemaEClass.getESuperTypes().add(this.getSchema_Test());
		dtBooleanEClass.getESuperTypes().add(this.getSimpleSchema());
		dtStringEClass.getESuperTypes().add(this.getSimpleSchema());
		dtIntegerEClass.getESuperTypes().add(this.getSimpleSchema());
		mapInstanceEClass.getESuperTypes().add(this.getDataPoint());
		arrayInstanceEClass.getESuperTypes().add(this.getDataPoint());
		stringInstanceEClass.getESuperTypes().add(this.getDataPoint());
		intInstanceEClass.getESuperTypes().add(this.getDataPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceContentEClass, InterfaceContent.class, "InterfaceContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Contents(), this.getInterfaceContent(), null, "contents", null, 0, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Extends(), this.getInterface(), null, "extends", null, 0, 2, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Schema(), this.getInterface(), null, "schema", null, 1, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Writable(), theXMLTypePackage.getBoolean(), "writable", null, 1, 1,
				Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_MinMultiplicity(), ecorePackage.getEInt(), "minMultiplicity", null, 0, 1,
				Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_MaxMultiplicity(), ecorePackage.getEInt(), "maxMultiplicity", null, 0, 1,
				Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Properties(), this.getProperty(), null, "properties", null, 0, 300,
				Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getInterface(), null, "target", null, 0, 1, Relationship.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relationship.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Type(), this.getType(), "type", "NONE", 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Writable(), theXMLTypePackage.getBoolean(), "writable", null, 1, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Unit(), this.getUnit(), "unit", "NONE", 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Schema(), this.getSchema(), "schema", null, 1, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Request(), this.getCommandPayload(), null, "request", null, 0, -1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Response(), this.getCommandPayload(), null, "response", null, 0, -1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telemetryEClass, Telemetry.class, "Telemetry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelemetry_Type(), this.getType(), "type", "NONE", 0, 1, Telemetry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelemetry_Name(), ecorePackage.getEString(), "name", null, 1, 1, Telemetry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelemetry_Schema(), this.getSchema(), "schema", null, 1, 1, Telemetry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelemetry_Unit(), this.getUnit(), "unit", "NONE", 0, 1, Telemetry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtmiEClass, DTML.DTMI.class, "DTMI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTMI_Scheme(), ecorePackage.getEString(), "scheme", null, 0, 1, DTML.DTMI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTMI_Path(), ecorePackage.getEString(), "path", null, 0, 1, DTML.DTMI.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTMI_Version(), ecorePackage.getEInt(), "version", null, 0, 1, DTML.DTMI.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandPayloadEClass, CommandPayload.class, "CommandPayload", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandPayload_Name(), ecorePackage.getEString(), "name", null, 1, 1, CommandPayload.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandPayload_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1,
				CommandPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandPayload_Comment(), ecorePackage.getEString(), "comment", null, 0, 1,
				CommandPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandPayload_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				CommandPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandPayload_Schema(), this.getSchema(), "schema", null, 1, 1, CommandPayload.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtElementEClass, DTElement.class, "DTElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTElement_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1,
				DTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				DTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTElement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, DTElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTElement_Id(), this.getDTMI(), null, "id", null, 0, 1, DTElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_Value(), this.getUReal(), null, "value", null, 1, 1, Quantity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getQuantity_Unit(), this.getUnit_Test(), null, "unit", null, 1, 1, Quantity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(unit_TestEClass, Unit_Test.class, "Unit_Test", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Test_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Unit_Test.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Test_Symbol(), theXMLTypePackage.getString(), "symbol", null, 0, 1, Unit_Test.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Test_Dimensions(), theXMLTypePackage.getDouble(), "dimensions", null, 12, 12,
				Unit_Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Test_ConversionFactor(), theXMLTypePackage.getDouble(), "conversionFactor", null, 12, 12,
				Unit_Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Test_Offset(), theXMLTypePackage.getDouble(), "offset", null, 12, 12, Unit_Test.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uRealEClass, UReal.class, "UReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUReal_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, UReal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Schema(), this.getSchema_Test(), null, "schema", null, 1, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dtObjectEClass, DTObject.class, "DTObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTObject_Fields(), this.getField(), null, "fields", null, 0, -1, DTObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtArrayEClass, DTArray.class, "DTArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTArray_ElementSchema(), this.getSchema_Test(), null, "elementSchema", null, 0, 1,
				DTArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtMapEClass, DTMap.class, "DTMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTMap_MapKey(), this.getKeyValueType(), null, "mapKey", null, 0, -1, DTMap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTMap_MapValue(), this.getKeyValueType(), null, "mapValue", null, 0, -1, DTMap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtEnumEClass, DTEnum.class, "DTEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTEnum_ValueSchema(), this.getEnumSchemaTypes(), null, "valueSchema", null, 0, 1,
				DTEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTEnum_EnumValues(), this.getEnumValue(), null, "enumValues", null, 0, 1, DTEnum.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalTwinEClass, DigitalTwin.class, "DigitalTwin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalTwin_Contents(), this.getDTContent(), null, "contents", null, 0, -1, DigitalTwin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwin_Type(), this.getInterface(), null, "type", null, 1, 1, DigitalTwin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigitalTwin_Name(), ecorePackage.getEString(), "name", null, 0, 1, DigitalTwin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Schema(), this.getDigitalTwin(), null, "schema", null, 0, 1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Type(), this.getComponent(), null, "type", null, 1, 1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Contents(), this.getComponentContent(), null, "contents", null, 0, -1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipInstanceEClass, RelationshipInstance.class, "RelationshipInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipInstance_Target(), this.getDigitalTwin(), null, "target", null, 0, 1,
				RelationshipInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipInstance_Type(), this.getRelationship(), null, "type", null, 1, 1,
				RelationshipInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				RelationshipInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyInstanceEClass, PropertyInstance.class, "PropertyInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyInstance_Value(), this.getDataPoint(), null, "value", null, 0, 1,
				PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commandInstanceEClass, CommandInstance.class, "CommandInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandInstance_Request(), this.getCommandPayloadInstance(), null, "request", null, 0, 1,
				CommandInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandInstance_Response(), this.getCommandPayloadInstance(), null, "response", null, 0, 1,
				CommandInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandInstance_Type(), this.getCommand(), null, "type", null, 1, 1, CommandInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandPayloadInstanceEClass, CommandPayloadInstance.class, "CommandPayloadInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandPayloadInstance_Type(), this.getCommandPayload(), null, "type", null, 1, 1,
				CommandPayloadInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandPayloadInstance_Value(), this.getDataPoint(), null, "value", null, 0, 1,
				CommandPayloadInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPointEClass, DataPoint.class, "DataPoint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtContentEClass, DTContent.class, "DTContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(schema_TestEClass, Schema_Test.class, "Schema_Test", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexSchemaEClass, ComplexSchema.class, "ComplexSchema", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumSchemaTypesEClass, EnumSchemaTypes.class, "EnumSchemaTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyValueTypeEClass, KeyValueType.class, "KeyValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueType_Name(), ecorePackage.getEString(), "name", null, 0, 1, KeyValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType_Schema(), this.getSchema_Test(), null, "schema", null, 0, 1, KeyValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectInstanceEClass, ObjectInstance.class, "ObjectInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectInstance_FieldInstances(), this.getFieldInstance(), null, "fieldInstances", null, 0, -1,
				ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstance_Type(), this.getDTObject(), null, "type", null, 1, 1, ObjectInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSchemaEClass, SimpleSchema.class, "SimpleSchema", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtBooleanEClass, DTBoolean.class, "DTBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtStringEClass, DTString.class, "DTString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtIntegerEClass, DTInteger.class, "DTInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldInstanceEClass, FieldInstance.class, "FieldInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldInstance_Type(), this.getField(), null, "type", null, 1, 1, FieldInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldInstance_Value(), this.getDataPoint(), null, "value", null, 0, -1, FieldInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapInstanceEClass, MapInstance.class, "MapInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapInstance_Keys(), this.getKeyValueInstance(), null, "keys", null, 0, -1, MapInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapInstance_Values(), this.getKeyValueInstance(), null, "values", null, 0, -1,
				MapInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapInstance_Type(), this.getDTMap(), null, "type", null, 1, 1, MapInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueInstanceEClass, KeyValueInstance.class, "KeyValueInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyValueInstance_Value(), this.getDataPoint(), null, "value", null, 0, 1,
				KeyValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueInstance_Type(), this.getKeyValueType(), null, "type", null, 1, 1,
				KeyValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInstanceEClass, ArrayInstance.class, "ArrayInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInstance_Values(), this.getDataPoint(), null, "values", null, 0, -1, ArrayInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayInstance_Type(), this.getDTArray(), null, "type", null, 1, 1, ArrayInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalTwinEnvironmentEClass, DigitalTwinEnvironment.class, "DigitalTwinEnvironment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalTwinEnvironment_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				DigitalTwinEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwinEnvironment_Instances(), this.getDigitalTwin(), null, "instances", null, 0, -1,
				DigitalTwinEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwinEnvironment_Types(), this.getInterface(), null, "types", null, 0, -1,
				DigitalTwinEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringInstanceEClass, StringInstance.class, "StringInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringInstance_Value(), theXMLTypePackage.getString(), "value", null, 0, 1,
				StringInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intInstanceEClass, IntInstance.class, "IntInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntInstance_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, IntInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentContentEClass, ComponentContent.class, "ComponentContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(schemaEEnum, Schema.class, "Schema");
		addEEnumLiteral(schemaEEnum, Schema.BOOLEAN);
		addEEnumLiteral(schemaEEnum, Schema.DATE);
		addEEnumLiteral(schemaEEnum, Schema.DATETIME);
		addEEnumLiteral(schemaEEnum, Schema.DOUBLE);
		addEEnumLiteral(schemaEEnum, Schema.DURATION);
		addEEnumLiteral(schemaEEnum, Schema.FLOAT);
		addEEnumLiteral(schemaEEnum, Schema.INTEGER);
		addEEnumLiteral(schemaEEnum, Schema.LONG);
		addEEnumLiteral(schemaEEnum, Schema.STRING);
		addEEnumLiteral(schemaEEnum, Schema.TIME);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.ACCELERATION);
		addEEnumLiteral(typeEEnum, Type.HUMIDITY);
		addEEnumLiteral(typeEEnum, Type.TEMPERATURE);
		addEEnumLiteral(typeEEnum, Type.NONE);

		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.METRE_PER_SECOND_SQUARED);
		addEEnumLiteral(unitEEnum, Unit.CENTIMETRE_PER_SECOND_SQUARED);
		addEEnumLiteral(unitEEnum, Unit.GFORCE);
		addEEnumLiteral(unitEEnum, Unit.KILOGRAM_PER_CUBIC_METRE);
		addEEnumLiteral(unitEEnum, Unit.GRAM_PER_CUBIC_METRE);
		addEEnumLiteral(unitEEnum, Unit.KELVIN);
		addEEnumLiteral(unitEEnum, Unit.DEGREE_CELSIUS);
		addEEnumLiteral(unitEEnum, Unit.DEGREE_FAHRENHEIT);
		addEEnumLiteral(unitEEnum, Unit.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //DTMLPackageImpl
