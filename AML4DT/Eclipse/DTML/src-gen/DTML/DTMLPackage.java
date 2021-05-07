/**
 */
package DTML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DTML.DTMLFactory
 * @model kind="package"
 * @generated
 */
public interface DTMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DTML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/DTML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DTML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DTMLPackage eINSTANCE = DTML.impl.DTMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link DTML.impl.DTElementImpl <em>DT Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTElementImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTElement()
	 * @generated
	 */
	int DT_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ELEMENT__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ELEMENT__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ELEMENT__ID = 3;

	/**
	 * The number of structural features of the '<em>DT Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DT Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.InterfaceContentImpl <em>Interface Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.InterfaceContentImpl
	 * @see DTML.impl.DTMLPackageImpl#getInterfaceContent()
	 * @generated
	 */
	int INTERFACE_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTENT__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTENT__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTENT__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTENT__ID = DT_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Interface Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTENT_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONTENT_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.InterfaceImpl
	 * @see DTML.impl.DTMLPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = DT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTENTS = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENDS = DT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.ComponentImpl
	 * @see DTML.impl.DTMLPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DISPLAY_NAME = INTERFACE_CONTENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = INTERFACE_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMMENT = INTERFACE_CONTENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = INTERFACE_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = INTERFACE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SCHEMA = INTERFACE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = INTERFACE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = INTERFACE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.RelationshipImpl
	 * @see DTML.impl.DTMLPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DISPLAY_NAME = INTERFACE_CONTENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = INTERFACE_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__COMMENT = INTERFACE_CONTENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = INTERFACE_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__WRITABLE = INTERFACE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MIN_MULTIPLICITY = INTERFACE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MAX_MULTIPLICITY = INTERFACE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROPERTIES = INTERFACE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = INTERFACE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = INTERFACE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = INTERFACE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = INTERFACE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.PropertyImpl
	 * @see DTML.impl.DTMLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DISPLAY_NAME = INTERFACE_CONTENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = INTERFACE_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = INTERFACE_CONTENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = INTERFACE_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = INTERFACE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__WRITABLE = INTERFACE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = INTERFACE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIT = INTERFACE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCHEMA = INTERFACE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = INTERFACE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = INTERFACE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.CommandImpl
	 * @see DTML.impl.DTMLPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DISPLAY_NAME = INTERFACE_CONTENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = INTERFACE_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMENT = INTERFACE_CONTENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = INTERFACE_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = INTERFACE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__REQUEST = INTERFACE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__RESPONSE = INTERFACE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = INTERFACE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = INTERFACE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.TelemetryImpl <em>Telemetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.TelemetryImpl
	 * @see DTML.impl.DTMLPackageImpl#getTelemetry()
	 * @generated
	 */
	int TELEMETRY = 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__DISPLAY_NAME = INTERFACE_CONTENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__DESCRIPTION = INTERFACE_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__COMMENT = INTERFACE_CONTENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__ID = INTERFACE_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__TYPE = INTERFACE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__NAME = INTERFACE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__SCHEMA = INTERFACE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__UNIT = INTERFACE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Telemetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_FEATURE_COUNT = INTERFACE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Telemetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_OPERATION_COUNT = INTERFACE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTMIImpl <em>DTMI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTMIImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTMI()
	 * @generated
	 */
	int DTMI = 7;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMI__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMI__PATH = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMI__VERSION = 2;

	/**
	 * The number of structural features of the '<em>DTMI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DTMI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.CommandPayloadImpl <em>Command Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.CommandPayloadImpl
	 * @see DTML.impl.DTMLPackageImpl#getCommandPayload()
	 * @generated
	 */
	int COMMAND_PAYLOAD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__SCHEMA = 4;

	/**
	 * The number of structural features of the '<em>Command Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Command Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.QuantityImpl
	 * @see DTML.impl.DTMLPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.Unit_TestImpl <em>Unit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.Unit_TestImpl
	 * @see DTML.impl.DTMLPackageImpl#getUnit_Test()
	 * @generated
	 */
	int UNIT_TEST = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__DIMENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__CONVERSION_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__OFFSET = 4;

	/**
	 * The number of structural features of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.URealImpl <em>UReal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.URealImpl
	 * @see DTML.impl.DTMLPackageImpl#getUReal()
	 * @generated
	 */
	int UREAL = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UREAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>UReal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UREAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UReal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UREAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.FieldImpl
	 * @see DTML.impl.DTMLPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 13;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = DT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SCHEMA = DT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTObjectImpl <em>DT Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTObjectImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTObject()
	 * @generated
	 */
	int DT_OBJECT = 14;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT__ID = DT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT__FIELDS = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DT Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DT Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OBJECT_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTArrayImpl <em>DT Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTArrayImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTArray()
	 * @generated
	 */
	int DT_ARRAY = 15;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY__ID = DT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Element Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY__ELEMENT_SCHEMA = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DT Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DT Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ARRAY_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTMapImpl <em>DT Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTMapImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTMap()
	 * @generated
	 */
	int DT_MAP = 16;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP__ID = DT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP__MAP_KEY = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP__MAP_VALUE = DT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DT Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DT Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_MAP_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTEnumImpl <em>DT Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTEnumImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTEnum()
	 * @generated
	 */
	int DT_ENUM = 17;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM__DISPLAY_NAME = DT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM__DESCRIPTION = DT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM__COMMENT = DT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM__ID = DT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM__VALUE_SCHEMA = DT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM__ENUM_VALUES = DT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DT Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM_FEATURE_COUNT = DT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DT Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_ENUM_OPERATION_COUNT = DT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DigitalTwinImpl <em>Digital Twin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DigitalTwinImpl
	 * @see DTML.impl.DTMLPackageImpl#getDigitalTwin()
	 * @generated
	 */
	int DIGITAL_TWIN = 18;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN__CONTENTS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN__NAME = 2;

	/**
	 * The number of structural features of the '<em>Digital Twin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Digital Twin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTContentImpl <em>DT Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTContentImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTContent()
	 * @generated
	 */
	int DT_CONTENT = 25;

	/**
	 * The number of structural features of the '<em>DT Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DT Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.ComponentInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 19;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SCHEMA = DT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = DT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CONTENTS = DT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = DT_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = DT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.RelationshipInstanceImpl <em>Relationship Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.RelationshipInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getRelationshipInstance()
	 * @generated
	 */
	int RELATIONSHIP_INSTANCE = 20;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__TARGET = DT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__TYPE = DT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__NAME = DT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE_FEATURE_COUNT = DT_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE_OPERATION_COUNT = DT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.PropertyInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getPropertyInstance()
	 * @generated
	 */
	int PROPERTY_INSTANCE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__VALUE = DT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__NAME = DT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE_FEATURE_COUNT = DT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE_OPERATION_COUNT = DT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.CommandInstanceImpl <em>Command Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.CommandInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getCommandInstance()
	 * @generated
	 */
	int COMMAND_INSTANCE = 22;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INSTANCE__REQUEST = DT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INSTANCE__RESPONSE = DT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INSTANCE__TYPE = DT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INSTANCE_FEATURE_COUNT = DT_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Command Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INSTANCE_OPERATION_COUNT = DT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.CommandPayloadInstanceImpl <em>Command Payload Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.CommandPayloadInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getCommandPayloadInstance()
	 * @generated
	 */
	int COMMAND_PAYLOAD_INSTANCE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_INSTANCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_INSTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Command Payload Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command Payload Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DataPointImpl <em>Data Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DataPointImpl
	 * @see DTML.impl.DTMLPackageImpl#getDataPoint()
	 * @generated
	 */
	int DATA_POINT = 24;

	/**
	 * The number of structural features of the '<em>Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.Schema_TestImpl <em>Schema Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.Schema_TestImpl
	 * @see DTML.impl.DTMLPackageImpl#getSchema_Test()
	 * @generated
	 */
	int SCHEMA_TEST = 26;

	/**
	 * The number of structural features of the '<em>Schema Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schema Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.ComplexSchemaImpl <em>Complex Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.ComplexSchemaImpl
	 * @see DTML.impl.DTMLPackageImpl#getComplexSchema()
	 * @generated
	 */
	int COMPLEX_SCHEMA = 27;

	/**
	 * The number of structural features of the '<em>Complex Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA_FEATURE_COUNT = SCHEMA_TEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA_OPERATION_COUNT = SCHEMA_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.EnumSchemaTypesImpl <em>Enum Schema Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.EnumSchemaTypesImpl
	 * @see DTML.impl.DTMLPackageImpl#getEnumSchemaTypes()
	 * @generated
	 */
	int ENUM_SCHEMA_TYPES = 28;

	/**
	 * The number of structural features of the '<em>Enum Schema Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_SCHEMA_TYPES_FEATURE_COUNT = COMPLEX_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Schema Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_SCHEMA_TYPES_OPERATION_COUNT = COMPLEX_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.EnumValueImpl
	 * @see DTML.impl.DTMLPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 29;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.KeyValueTypeImpl <em>Key Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.KeyValueTypeImpl
	 * @see DTML.impl.DTMLPackageImpl#getKeyValueType()
	 * @generated
	 */
	int KEY_VALUE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__SCHEMA = 1;

	/**
	 * The number of structural features of the '<em>Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.ObjectInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getObjectInstance()
	 * @generated
	 */
	int OBJECT_INSTANCE = 31;

	/**
	 * The feature id for the '<em><b>Field Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__FIELD_INSTANCES = DATA_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__TYPE = DATA_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_FEATURE_COUNT = DATA_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_OPERATION_COUNT = DATA_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.SimpleSchemaImpl <em>Simple Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.SimpleSchemaImpl
	 * @see DTML.impl.DTMLPackageImpl#getSimpleSchema()
	 * @generated
	 */
	int SIMPLE_SCHEMA = 32;

	/**
	 * The number of structural features of the '<em>Simple Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCHEMA_FEATURE_COUNT = SCHEMA_TEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCHEMA_OPERATION_COUNT = SCHEMA_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTBooleanImpl <em>DT Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTBooleanImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTBoolean()
	 * @generated
	 */
	int DT_BOOLEAN = 33;

	/**
	 * The number of structural features of the '<em>DT Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_BOOLEAN_FEATURE_COUNT = SIMPLE_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DT Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_BOOLEAN_OPERATION_COUNT = SIMPLE_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTStringImpl <em>DT String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTStringImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTString()
	 * @generated
	 */
	int DT_STRING = 34;

	/**
	 * The number of structural features of the '<em>DT String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_STRING_FEATURE_COUNT = SIMPLE_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DT String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_STRING_OPERATION_COUNT = SIMPLE_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DTIntegerImpl <em>DT Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DTIntegerImpl
	 * @see DTML.impl.DTMLPackageImpl#getDTInteger()
	 * @generated
	 */
	int DT_INTEGER = 35;

	/**
	 * The number of structural features of the '<em>DT Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_INTEGER_FEATURE_COUNT = SIMPLE_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DT Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_INTEGER_OPERATION_COUNT = SIMPLE_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.FieldInstanceImpl <em>Field Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.FieldInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getFieldInstance()
	 * @generated
	 */
	int FIELD_INSTANCE = 36;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INSTANCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INSTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.MapInstanceImpl <em>Map Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.MapInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getMapInstance()
	 * @generated
	 */
	int MAP_INSTANCE = 37;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INSTANCE__KEYS = DATA_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INSTANCE__VALUES = DATA_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INSTANCE__TYPE = DATA_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INSTANCE_FEATURE_COUNT = DATA_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Map Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INSTANCE_OPERATION_COUNT = DATA_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.KeyValueInstanceImpl <em>Key Value Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.KeyValueInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getKeyValueInstance()
	 * @generated
	 */
	int KEY_VALUE_INSTANCE = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_INSTANCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_INSTANCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.ArrayInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getArrayInstance()
	 * @generated
	 */
	int ARRAY_INSTANCE = 39;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE__VALUES = DATA_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE__TYPE = DATA_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE_FEATURE_COUNT = DATA_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE_OPERATION_COUNT = DATA_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.DigitalTwinEnvironmentImpl <em>Digital Twin Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.DigitalTwinEnvironmentImpl
	 * @see DTML.impl.DTMLPackageImpl#getDigitalTwinEnvironment()
	 * @generated
	 */
	int DIGITAL_TWIN_ENVIRONMENT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_ENVIRONMENT__INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_ENVIRONMENT__TYPES = 2;

	/**
	 * The number of structural features of the '<em>Digital Twin Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_ENVIRONMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Digital Twin Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.impl.StringInstanceImpl <em>String Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.StringInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getStringInstance()
	 * @generated
	 */
	int STRING_INSTANCE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INSTANCE__VALUE = DATA_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INSTANCE_FEATURE_COUNT = DATA_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INSTANCE_OPERATION_COUNT = DATA_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.IntInstanceImpl <em>Int Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.IntInstanceImpl
	 * @see DTML.impl.DTMLPackageImpl#getIntInstance()
	 * @generated
	 */
	int INT_INSTANCE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_INSTANCE__VALUE = DATA_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_INSTANCE_FEATURE_COUNT = DATA_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_INSTANCE_OPERATION_COUNT = DATA_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DTML.impl.ComponentContentImpl <em>Component Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.impl.ComponentContentImpl
	 * @see DTML.impl.DTMLPackageImpl#getComponentContent()
	 * @generated
	 */
	int COMPONENT_CONTENT = 43;

	/**
	 * The number of structural features of the '<em>Component Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DTML.Schema <em>Schema</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.Schema
	 * @see DTML.impl.DTMLPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 44;

	/**
	 * The meta object id for the '{@link DTML.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.Type
	 * @see DTML.impl.DTMLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 45;

	/**
	 * The meta object id for the '{@link DTML.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DTML.Unit
	 * @see DTML.impl.DTMLPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 46;

	/**
	 * Returns the meta object for class '{@link DTML.InterfaceContent <em>Interface Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Content</em>'.
	 * @see DTML.InterfaceContent
	 * @generated
	 */
	EClass getInterfaceContent();

	/**
	 * Returns the meta object for class '{@link DTML.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see DTML.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.Interface#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see DTML.Interface#getContents()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Contents();

	/**
	 * Returns the meta object for the reference list '{@link DTML.Interface#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see DTML.Interface#getExtends()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Extends();

	/**
	 * Returns the meta object for class '{@link DTML.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see DTML.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link DTML.Component#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see DTML.Component#getSchema()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Schema();

	/**
	 * Returns the meta object for class '{@link DTML.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see DTML.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Relationship#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see DTML.Relationship#isWritable()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Writable();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Relationship#getMinMultiplicity <em>Min Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Multiplicity</em>'.
	 * @see DTML.Relationship#getMinMultiplicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_MinMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Relationship#getMaxMultiplicity <em>Max Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Multiplicity</em>'.
	 * @see DTML.Relationship#getMaxMultiplicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_MaxMultiplicity();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.Relationship#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see DTML.Relationship#getProperties()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Properties();

	/**
	 * Returns the meta object for the reference '{@link DTML.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see DTML.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for class '{@link DTML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see DTML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DTML.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Property#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see DTML.Property#isWritable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Writable();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Property#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see DTML.Property#getUnit()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Unit();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Property#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see DTML.Property#getSchema()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Schema();

	/**
	 * Returns the meta object for class '{@link DTML.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see DTML.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.Command#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see DTML.Command#getRequest()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.Command#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response</em>'.
	 * @see DTML.Command#getResponse()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Response();

	/**
	 * Returns the meta object for class '{@link DTML.Telemetry <em>Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telemetry</em>'.
	 * @see DTML.Telemetry
	 * @generated
	 */
	EClass getTelemetry();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Telemetry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DTML.Telemetry#getType()
	 * @see #getTelemetry()
	 * @generated
	 */
	EAttribute getTelemetry_Type();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Telemetry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Telemetry#getName()
	 * @see #getTelemetry()
	 * @generated
	 */
	EAttribute getTelemetry_Name();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Telemetry#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see DTML.Telemetry#getSchema()
	 * @see #getTelemetry()
	 * @generated
	 */
	EAttribute getTelemetry_Schema();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Telemetry#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see DTML.Telemetry#getUnit()
	 * @see #getTelemetry()
	 * @generated
	 */
	EAttribute getTelemetry_Unit();

	/**
	 * Returns the meta object for class '{@link DTML.DTMI <em>DTMI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTMI</em>'.
	 * @see DTML.DTMI
	 * @generated
	 */
	EClass getDTMI();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DTMI#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see DTML.DTMI#getScheme()
	 * @see #getDTMI()
	 * @generated
	 */
	EAttribute getDTMI_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DTMI#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see DTML.DTMI#getPath()
	 * @see #getDTMI()
	 * @generated
	 */
	EAttribute getDTMI_Path();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DTMI#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see DTML.DTMI#getVersion()
	 * @see #getDTMI()
	 * @generated
	 */
	EAttribute getDTMI_Version();

	/**
	 * Returns the meta object for class '{@link DTML.CommandPayload <em>Command Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Payload</em>'.
	 * @see DTML.CommandPayload
	 * @generated
	 */
	EClass getCommandPayload();

	/**
	 * Returns the meta object for the attribute '{@link DTML.CommandPayload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.CommandPayload#getName()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EAttribute getCommandPayload_Name();

	/**
	 * Returns the meta object for the attribute '{@link DTML.CommandPayload#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see DTML.CommandPayload#getDisplayName()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EAttribute getCommandPayload_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link DTML.CommandPayload#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see DTML.CommandPayload#getComment()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EAttribute getCommandPayload_Comment();

	/**
	 * Returns the meta object for the attribute '{@link DTML.CommandPayload#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DTML.CommandPayload#getDescription()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EAttribute getCommandPayload_Description();

	/**
	 * Returns the meta object for the attribute '{@link DTML.CommandPayload#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see DTML.CommandPayload#getSchema()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EAttribute getCommandPayload_Schema();

	/**
	 * Returns the meta object for class '{@link DTML.DTElement <em>DT Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Element</em>'.
	 * @see DTML.DTElement
	 * @generated
	 */
	EClass getDTElement();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DTElement#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see DTML.DTElement#getDisplayName()
	 * @see #getDTElement()
	 * @generated
	 */
	EAttribute getDTElement_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DTElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DTML.DTElement#getDescription()
	 * @see #getDTElement()
	 * @generated
	 */
	EAttribute getDTElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DTElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see DTML.DTElement#getComment()
	 * @see #getDTElement()
	 * @generated
	 */
	EAttribute getDTElement_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link DTML.DTElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see DTML.DTElement#getId()
	 * @see #getDTElement()
	 * @generated
	 */
	EReference getDTElement_Id();

	/**
	 * Returns the meta object for class '{@link DTML.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see DTML.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link DTML.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see DTML.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for the containment reference '{@link DTML.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see DTML.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for class '{@link DTML.Unit_Test <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test</em>'.
	 * @see DTML.Unit_Test
	 * @generated
	 */
	EClass getUnit_Test();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Unit_Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Unit_Test#getName()
	 * @see #getUnit_Test()
	 * @generated
	 */
	EAttribute getUnit_Test_Name();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Unit_Test#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see DTML.Unit_Test#getSymbol()
	 * @see #getUnit_Test()
	 * @generated
	 */
	EAttribute getUnit_Test_Symbol();

	/**
	 * Returns the meta object for the attribute list '{@link DTML.Unit_Test#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dimensions</em>'.
	 * @see DTML.Unit_Test#getDimensions()
	 * @see #getUnit_Test()
	 * @generated
	 */
	EAttribute getUnit_Test_Dimensions();

	/**
	 * Returns the meta object for the attribute list '{@link DTML.Unit_Test#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conversion Factor</em>'.
	 * @see DTML.Unit_Test#getConversionFactor()
	 * @see #getUnit_Test()
	 * @generated
	 */
	EAttribute getUnit_Test_ConversionFactor();

	/**
	 * Returns the meta object for the attribute list '{@link DTML.Unit_Test#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Offset</em>'.
	 * @see DTML.Unit_Test#getOffset()
	 * @see #getUnit_Test()
	 * @generated
	 */
	EAttribute getUnit_Test_Offset();

	/**
	 * Returns the meta object for class '{@link DTML.UReal <em>UReal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UReal</em>'.
	 * @see DTML.UReal
	 * @generated
	 */
	EClass getUReal();

	/**
	 * Returns the meta object for the attribute '{@link DTML.UReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DTML.UReal#getValue()
	 * @see #getUReal()
	 * @generated
	 */
	EAttribute getUReal_Value();

	/**
	 * Returns the meta object for class '{@link DTML.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see DTML.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link DTML.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link DTML.Field#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see DTML.Field#getSchema()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Schema();

	/**
	 * Returns the meta object for class '{@link DTML.DTObject <em>DT Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Object</em>'.
	 * @see DTML.DTObject
	 * @generated
	 */
	EClass getDTObject();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.DTObject#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see DTML.DTObject#getFields()
	 * @see #getDTObject()
	 * @generated
	 */
	EReference getDTObject_Fields();

	/**
	 * Returns the meta object for class '{@link DTML.DTArray <em>DT Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Array</em>'.
	 * @see DTML.DTArray
	 * @generated
	 */
	EClass getDTArray();

	/**
	 * Returns the meta object for the reference '{@link DTML.DTArray#getElementSchema <em>Element Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Schema</em>'.
	 * @see DTML.DTArray#getElementSchema()
	 * @see #getDTArray()
	 * @generated
	 */
	EReference getDTArray_ElementSchema();

	/**
	 * Returns the meta object for class '{@link DTML.DTMap <em>DT Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Map</em>'.
	 * @see DTML.DTMap
	 * @generated
	 */
	EClass getDTMap();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.DTMap#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key</em>'.
	 * @see DTML.DTMap#getMapKey()
	 * @see #getDTMap()
	 * @generated
	 */
	EReference getDTMap_MapKey();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.DTMap#getMapValue <em>Map Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Value</em>'.
	 * @see DTML.DTMap#getMapValue()
	 * @see #getDTMap()
	 * @generated
	 */
	EReference getDTMap_MapValue();

	/**
	 * Returns the meta object for class '{@link DTML.DTEnum <em>DT Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Enum</em>'.
	 * @see DTML.DTEnum
	 * @generated
	 */
	EClass getDTEnum();

	/**
	 * Returns the meta object for the reference '{@link DTML.DTEnum#getValueSchema <em>Value Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Schema</em>'.
	 * @see DTML.DTEnum#getValueSchema()
	 * @see #getDTEnum()
	 * @generated
	 */
	EReference getDTEnum_ValueSchema();

	/**
	 * Returns the meta object for the reference '{@link DTML.DTEnum#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Values</em>'.
	 * @see DTML.DTEnum#getEnumValues()
	 * @see #getDTEnum()
	 * @generated
	 */
	EReference getDTEnum_EnumValues();

	/**
	 * Returns the meta object for class '{@link DTML.DigitalTwin <em>Digital Twin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Twin</em>'.
	 * @see DTML.DigitalTwin
	 * @generated
	 */
	EClass getDigitalTwin();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.DigitalTwin#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see DTML.DigitalTwin#getContents()
	 * @see #getDigitalTwin()
	 * @generated
	 */
	EReference getDigitalTwin_Contents();

	/**
	 * Returns the meta object for the reference '{@link DTML.DigitalTwin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.DigitalTwin#getType()
	 * @see #getDigitalTwin()
	 * @generated
	 */
	EReference getDigitalTwin_Type();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DigitalTwin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.DigitalTwin#getName()
	 * @see #getDigitalTwin()
	 * @generated
	 */
	EAttribute getDigitalTwin_Name();

	/**
	 * Returns the meta object for class '{@link DTML.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see DTML.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the containment reference '{@link DTML.ComponentInstance#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see DTML.ComponentInstance#getSchema()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Schema();

	/**
	 * Returns the meta object for the reference '{@link DTML.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.ComponentInstance#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see DTML.ComponentInstance#getContents()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Contents();

	/**
	 * Returns the meta object for class '{@link DTML.RelationshipInstance <em>Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Instance</em>'.
	 * @see DTML.RelationshipInstance
	 * @generated
	 */
	EClass getRelationshipInstance();

	/**
	 * Returns the meta object for the reference '{@link DTML.RelationshipInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see DTML.RelationshipInstance#getTarget()
	 * @see #getRelationshipInstance()
	 * @generated
	 */
	EReference getRelationshipInstance_Target();

	/**
	 * Returns the meta object for the reference '{@link DTML.RelationshipInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.RelationshipInstance#getType()
	 * @see #getRelationshipInstance()
	 * @generated
	 */
	EReference getRelationshipInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link DTML.RelationshipInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.RelationshipInstance#getName()
	 * @see #getRelationshipInstance()
	 * @generated
	 */
	EAttribute getRelationshipInstance_Name();

	/**
	 * Returns the meta object for class '{@link DTML.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Instance</em>'.
	 * @see DTML.PropertyInstance
	 * @generated
	 */
	EClass getPropertyInstance();

	/**
	 * Returns the meta object for the containment reference '{@link DTML.PropertyInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see DTML.PropertyInstance#getValue()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EReference getPropertyInstance_Value();

	/**
	 * Returns the meta object for the attribute '{@link DTML.PropertyInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.PropertyInstance#getName()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EAttribute getPropertyInstance_Name();

	/**
	 * Returns the meta object for class '{@link DTML.CommandInstance <em>Command Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Instance</em>'.
	 * @see DTML.CommandInstance
	 * @generated
	 */
	EClass getCommandInstance();

	/**
	 * Returns the meta object for the reference '{@link DTML.CommandInstance#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see DTML.CommandInstance#getRequest()
	 * @see #getCommandInstance()
	 * @generated
	 */
	EReference getCommandInstance_Request();

	/**
	 * Returns the meta object for the reference '{@link DTML.CommandInstance#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see DTML.CommandInstance#getResponse()
	 * @see #getCommandInstance()
	 * @generated
	 */
	EReference getCommandInstance_Response();

	/**
	 * Returns the meta object for the reference '{@link DTML.CommandInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.CommandInstance#getType()
	 * @see #getCommandInstance()
	 * @generated
	 */
	EReference getCommandInstance_Type();

	/**
	 * Returns the meta object for class '{@link DTML.CommandPayloadInstance <em>Command Payload Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Payload Instance</em>'.
	 * @see DTML.CommandPayloadInstance
	 * @generated
	 */
	EClass getCommandPayloadInstance();

	/**
	 * Returns the meta object for the reference '{@link DTML.CommandPayloadInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.CommandPayloadInstance#getType()
	 * @see #getCommandPayloadInstance()
	 * @generated
	 */
	EReference getCommandPayloadInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link DTML.CommandPayloadInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see DTML.CommandPayloadInstance#getValue()
	 * @see #getCommandPayloadInstance()
	 * @generated
	 */
	EReference getCommandPayloadInstance_Value();

	/**
	 * Returns the meta object for class '{@link DTML.DataPoint <em>Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Point</em>'.
	 * @see DTML.DataPoint
	 * @generated
	 */
	EClass getDataPoint();

	/**
	 * Returns the meta object for class '{@link DTML.DTContent <em>DT Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Content</em>'.
	 * @see DTML.DTContent
	 * @generated
	 */
	EClass getDTContent();

	/**
	 * Returns the meta object for class '{@link DTML.Schema_Test <em>Schema Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Test</em>'.
	 * @see DTML.Schema_Test
	 * @generated
	 */
	EClass getSchema_Test();

	/**
	 * Returns the meta object for class '{@link DTML.ComplexSchema <em>Complex Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Schema</em>'.
	 * @see DTML.ComplexSchema
	 * @generated
	 */
	EClass getComplexSchema();

	/**
	 * Returns the meta object for class '{@link DTML.EnumSchemaTypes <em>Enum Schema Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Schema Types</em>'.
	 * @see DTML.EnumSchemaTypes
	 * @generated
	 */
	EClass getEnumSchemaTypes();

	/**
	 * Returns the meta object for class '{@link DTML.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see DTML.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for class '{@link DTML.KeyValueType <em>Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Type</em>'.
	 * @see DTML.KeyValueType
	 * @generated
	 */
	EClass getKeyValueType();

	/**
	 * Returns the meta object for the attribute '{@link DTML.KeyValueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.KeyValueType#getName()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EAttribute getKeyValueType_Name();

	/**
	 * Returns the meta object for the reference '{@link DTML.KeyValueType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see DTML.KeyValueType#getSchema()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EReference getKeyValueType_Schema();

	/**
	 * Returns the meta object for class '{@link DTML.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Instance</em>'.
	 * @see DTML.ObjectInstance
	 * @generated
	 */
	EClass getObjectInstance();

	/**
	 * Returns the meta object for the reference list '{@link DTML.ObjectInstance#getFieldInstances <em>Field Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Field Instances</em>'.
	 * @see DTML.ObjectInstance#getFieldInstances()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_FieldInstances();

	/**
	 * Returns the meta object for the reference '{@link DTML.ObjectInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.ObjectInstance#getType()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_Type();

	/**
	 * Returns the meta object for class '{@link DTML.SimpleSchema <em>Simple Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Schema</em>'.
	 * @see DTML.SimpleSchema
	 * @generated
	 */
	EClass getSimpleSchema();

	/**
	 * Returns the meta object for class '{@link DTML.DTBoolean <em>DT Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Boolean</em>'.
	 * @see DTML.DTBoolean
	 * @generated
	 */
	EClass getDTBoolean();

	/**
	 * Returns the meta object for class '{@link DTML.DTString <em>DT String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT String</em>'.
	 * @see DTML.DTString
	 * @generated
	 */
	EClass getDTString();

	/**
	 * Returns the meta object for class '{@link DTML.DTInteger <em>DT Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Integer</em>'.
	 * @see DTML.DTInteger
	 * @generated
	 */
	EClass getDTInteger();

	/**
	 * Returns the meta object for class '{@link DTML.FieldInstance <em>Field Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Instance</em>'.
	 * @see DTML.FieldInstance
	 * @generated
	 */
	EClass getFieldInstance();

	/**
	 * Returns the meta object for the reference '{@link DTML.FieldInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.FieldInstance#getType()
	 * @see #getFieldInstance()
	 * @generated
	 */
	EReference getFieldInstance_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.FieldInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see DTML.FieldInstance#getValue()
	 * @see #getFieldInstance()
	 * @generated
	 */
	EReference getFieldInstance_Value();

	/**
	 * Returns the meta object for class '{@link DTML.MapInstance <em>Map Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Instance</em>'.
	 * @see DTML.MapInstance
	 * @generated
	 */
	EClass getMapInstance();

	/**
	 * Returns the meta object for the reference list '{@link DTML.MapInstance#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see DTML.MapInstance#getKeys()
	 * @see #getMapInstance()
	 * @generated
	 */
	EReference getMapInstance_Keys();

	/**
	 * Returns the meta object for the reference list '{@link DTML.MapInstance#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see DTML.MapInstance#getValues()
	 * @see #getMapInstance()
	 * @generated
	 */
	EReference getMapInstance_Values();

	/**
	 * Returns the meta object for the reference '{@link DTML.MapInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.MapInstance#getType()
	 * @see #getMapInstance()
	 * @generated
	 */
	EReference getMapInstance_Type();

	/**
	 * Returns the meta object for class '{@link DTML.KeyValueInstance <em>Key Value Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Instance</em>'.
	 * @see DTML.KeyValueInstance
	 * @generated
	 */
	EClass getKeyValueInstance();

	/**
	 * Returns the meta object for the containment reference '{@link DTML.KeyValueInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see DTML.KeyValueInstance#getValue()
	 * @see #getKeyValueInstance()
	 * @generated
	 */
	EReference getKeyValueInstance_Value();

	/**
	 * Returns the meta object for the reference '{@link DTML.KeyValueInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.KeyValueInstance#getType()
	 * @see #getKeyValueInstance()
	 * @generated
	 */
	EReference getKeyValueInstance_Type();

	/**
	 * Returns the meta object for class '{@link DTML.ArrayInstance <em>Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Instance</em>'.
	 * @see DTML.ArrayInstance
	 * @generated
	 */
	EClass getArrayInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.ArrayInstance#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see DTML.ArrayInstance#getValues()
	 * @see #getArrayInstance()
	 * @generated
	 */
	EReference getArrayInstance_Values();

	/**
	 * Returns the meta object for the reference '{@link DTML.ArrayInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DTML.ArrayInstance#getType()
	 * @see #getArrayInstance()
	 * @generated
	 */
	EReference getArrayInstance_Type();

	/**
	 * Returns the meta object for class '{@link DTML.DigitalTwinEnvironment <em>Digital Twin Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Twin Environment</em>'.
	 * @see DTML.DigitalTwinEnvironment
	 * @generated
	 */
	EClass getDigitalTwinEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link DTML.DigitalTwinEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DTML.DigitalTwinEnvironment#getName()
	 * @see #getDigitalTwinEnvironment()
	 * @generated
	 */
	EAttribute getDigitalTwinEnvironment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.DigitalTwinEnvironment#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see DTML.DigitalTwinEnvironment#getInstances()
	 * @see #getDigitalTwinEnvironment()
	 * @generated
	 */
	EReference getDigitalTwinEnvironment_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link DTML.DigitalTwinEnvironment#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see DTML.DigitalTwinEnvironment#getTypes()
	 * @see #getDigitalTwinEnvironment()
	 * @generated
	 */
	EReference getDigitalTwinEnvironment_Types();

	/**
	 * Returns the meta object for class '{@link DTML.StringInstance <em>String Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Instance</em>'.
	 * @see DTML.StringInstance
	 * @generated
	 */
	EClass getStringInstance();

	/**
	 * Returns the meta object for the attribute '{@link DTML.StringInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DTML.StringInstance#getValue()
	 * @see #getStringInstance()
	 * @generated
	 */
	EAttribute getStringInstance_Value();

	/**
	 * Returns the meta object for class '{@link DTML.IntInstance <em>Int Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Instance</em>'.
	 * @see DTML.IntInstance
	 * @generated
	 */
	EClass getIntInstance();

	/**
	 * Returns the meta object for the attribute '{@link DTML.IntInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DTML.IntInstance#getValue()
	 * @see #getIntInstance()
	 * @generated
	 */
	EAttribute getIntInstance_Value();

	/**
	 * Returns the meta object for class '{@link DTML.ComponentContent <em>Component Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Content</em>'.
	 * @see DTML.ComponentContent
	 * @generated
	 */
	EClass getComponentContent();

	/**
	 * Returns the meta object for enum '{@link DTML.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema</em>'.
	 * @see DTML.Schema
	 * @generated
	 */
	EEnum getSchema();

	/**
	 * Returns the meta object for enum '{@link DTML.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see DTML.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link DTML.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see DTML.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DTMLFactory getDTMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DTML.impl.InterfaceContentImpl <em>Interface Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.InterfaceContentImpl
		 * @see DTML.impl.DTMLPackageImpl#getInterfaceContent()
		 * @generated
		 */
		EClass INTERFACE_CONTENT = eINSTANCE.getInterfaceContent();

		/**
		 * The meta object literal for the '{@link DTML.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.InterfaceImpl
		 * @see DTML.impl.DTMLPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CONTENTS = eINSTANCE.getInterface_Contents();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__EXTENDS = eINSTANCE.getInterface_Extends();

		/**
		 * The meta object literal for the '{@link DTML.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.ComponentImpl
		 * @see DTML.impl.DTMLPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SCHEMA = eINSTANCE.getComponent_Schema();

		/**
		 * The meta object literal for the '{@link DTML.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.RelationshipImpl
		 * @see DTML.impl.DTMLPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__WRITABLE = eINSTANCE.getRelationship_Writable();

		/**
		 * The meta object literal for the '<em><b>Min Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MIN_MULTIPLICITY = eINSTANCE.getRelationship_MinMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Max Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MAX_MULTIPLICITY = eINSTANCE.getRelationship_MaxMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__PROPERTIES = eINSTANCE.getRelationship_Properties();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '{@link DTML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.PropertyImpl
		 * @see DTML.impl.DTMLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__WRITABLE = eINSTANCE.getProperty_Writable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UNIT = eINSTANCE.getProperty_Unit();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__SCHEMA = eINSTANCE.getProperty_Schema();

		/**
		 * The meta object literal for the '{@link DTML.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.CommandImpl
		 * @see DTML.impl.DTMLPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__REQUEST = eINSTANCE.getCommand_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__RESPONSE = eINSTANCE.getCommand_Response();

		/**
		 * The meta object literal for the '{@link DTML.impl.TelemetryImpl <em>Telemetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.TelemetryImpl
		 * @see DTML.impl.DTMLPackageImpl#getTelemetry()
		 * @generated
		 */
		EClass TELEMETRY = eINSTANCE.getTelemetry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEMETRY__TYPE = eINSTANCE.getTelemetry_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEMETRY__NAME = eINSTANCE.getTelemetry_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEMETRY__SCHEMA = eINSTANCE.getTelemetry_Schema();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEMETRY__UNIT = eINSTANCE.getTelemetry_Unit();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTMIImpl <em>DTMI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTMIImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTMI()
		 * @generated
		 */
		EClass DTMI = eINSTANCE.getDTMI();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTMI__SCHEME = eINSTANCE.getDTMI_Scheme();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTMI__PATH = eINSTANCE.getDTMI_Path();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTMI__VERSION = eINSTANCE.getDTMI_Version();

		/**
		 * The meta object literal for the '{@link DTML.impl.CommandPayloadImpl <em>Command Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.CommandPayloadImpl
		 * @see DTML.impl.DTMLPackageImpl#getCommandPayload()
		 * @generated
		 */
		EClass COMMAND_PAYLOAD = eINSTANCE.getCommandPayload();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PAYLOAD__NAME = eINSTANCE.getCommandPayload_Name();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PAYLOAD__DISPLAY_NAME = eINSTANCE.getCommandPayload_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PAYLOAD__COMMENT = eINSTANCE.getCommandPayload_Comment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PAYLOAD__DESCRIPTION = eINSTANCE.getCommandPayload_Description();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PAYLOAD__SCHEMA = eINSTANCE.getCommandPayload_Schema();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTElementImpl <em>DT Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTElementImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTElement()
		 * @generated
		 */
		EClass DT_ELEMENT = eINSTANCE.getDTElement();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_ELEMENT__DISPLAY_NAME = eINSTANCE.getDTElement_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_ELEMENT__DESCRIPTION = eINSTANCE.getDTElement_Description();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_ELEMENT__COMMENT = eINSTANCE.getDTElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_ELEMENT__ID = eINSTANCE.getDTElement_Id();

		/**
		 * The meta object literal for the '{@link DTML.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.QuantityImpl
		 * @see DTML.impl.DTMLPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '{@link DTML.impl.Unit_TestImpl <em>Unit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.Unit_TestImpl
		 * @see DTML.impl.DTMLPackageImpl#getUnit_Test()
		 * @generated
		 */
		EClass UNIT_TEST = eINSTANCE.getUnit_Test();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__NAME = eINSTANCE.getUnit_Test_Name();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__SYMBOL = eINSTANCE.getUnit_Test_Symbol();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__DIMENSIONS = eINSTANCE.getUnit_Test_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__CONVERSION_FACTOR = eINSTANCE.getUnit_Test_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__OFFSET = eINSTANCE.getUnit_Test_Offset();

		/**
		 * The meta object literal for the '{@link DTML.impl.URealImpl <em>UReal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.URealImpl
		 * @see DTML.impl.DTMLPackageImpl#getUReal()
		 * @generated
		 */
		EClass UREAL = eINSTANCE.getUReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UREAL__VALUE = eINSTANCE.getUReal_Value();

		/**
		 * The meta object literal for the '{@link DTML.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.FieldImpl
		 * @see DTML.impl.DTMLPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__SCHEMA = eINSTANCE.getField_Schema();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTObjectImpl <em>DT Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTObjectImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTObject()
		 * @generated
		 */
		EClass DT_OBJECT = eINSTANCE.getDTObject();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_OBJECT__FIELDS = eINSTANCE.getDTObject_Fields();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTArrayImpl <em>DT Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTArrayImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTArray()
		 * @generated
		 */
		EClass DT_ARRAY = eINSTANCE.getDTArray();

		/**
		 * The meta object literal for the '<em><b>Element Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_ARRAY__ELEMENT_SCHEMA = eINSTANCE.getDTArray_ElementSchema();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTMapImpl <em>DT Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTMapImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTMap()
		 * @generated
		 */
		EClass DT_MAP = eINSTANCE.getDTMap();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_MAP__MAP_KEY = eINSTANCE.getDTMap_MapKey();

		/**
		 * The meta object literal for the '<em><b>Map Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_MAP__MAP_VALUE = eINSTANCE.getDTMap_MapValue();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTEnumImpl <em>DT Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTEnumImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTEnum()
		 * @generated
		 */
		EClass DT_ENUM = eINSTANCE.getDTEnum();

		/**
		 * The meta object literal for the '<em><b>Value Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_ENUM__VALUE_SCHEMA = eINSTANCE.getDTEnum_ValueSchema();

		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DT_ENUM__ENUM_VALUES = eINSTANCE.getDTEnum_EnumValues();

		/**
		 * The meta object literal for the '{@link DTML.impl.DigitalTwinImpl <em>Digital Twin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DigitalTwinImpl
		 * @see DTML.impl.DTMLPackageImpl#getDigitalTwin()
		 * @generated
		 */
		EClass DIGITAL_TWIN = eINSTANCE.getDigitalTwin();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN__CONTENTS = eINSTANCE.getDigitalTwin_Contents();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN__TYPE = eINSTANCE.getDigitalTwin_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_TWIN__NAME = eINSTANCE.getDigitalTwin_Name();

		/**
		 * The meta object literal for the '{@link DTML.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.ComponentInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__SCHEMA = eINSTANCE.getComponentInstance_Schema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__CONTENTS = eINSTANCE.getComponentInstance_Contents();

		/**
		 * The meta object literal for the '{@link DTML.impl.RelationshipInstanceImpl <em>Relationship Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.RelationshipInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getRelationshipInstance()
		 * @generated
		 */
		EClass RELATIONSHIP_INSTANCE = eINSTANCE.getRelationshipInstance();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_INSTANCE__TARGET = eINSTANCE.getRelationshipInstance_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_INSTANCE__TYPE = eINSTANCE.getRelationshipInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_INSTANCE__NAME = eINSTANCE.getRelationshipInstance_Name();

		/**
		 * The meta object literal for the '{@link DTML.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.PropertyInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getPropertyInstance()
		 * @generated
		 */
		EClass PROPERTY_INSTANCE = eINSTANCE.getPropertyInstance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INSTANCE__VALUE = eINSTANCE.getPropertyInstance_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_INSTANCE__NAME = eINSTANCE.getPropertyInstance_Name();

		/**
		 * The meta object literal for the '{@link DTML.impl.CommandInstanceImpl <em>Command Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.CommandInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getCommandInstance()
		 * @generated
		 */
		EClass COMMAND_INSTANCE = eINSTANCE.getCommandInstance();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_INSTANCE__REQUEST = eINSTANCE.getCommandInstance_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_INSTANCE__RESPONSE = eINSTANCE.getCommandInstance_Response();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_INSTANCE__TYPE = eINSTANCE.getCommandInstance_Type();

		/**
		 * The meta object literal for the '{@link DTML.impl.CommandPayloadInstanceImpl <em>Command Payload Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.CommandPayloadInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getCommandPayloadInstance()
		 * @generated
		 */
		EClass COMMAND_PAYLOAD_INSTANCE = eINSTANCE.getCommandPayloadInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PAYLOAD_INSTANCE__TYPE = eINSTANCE.getCommandPayloadInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PAYLOAD_INSTANCE__VALUE = eINSTANCE.getCommandPayloadInstance_Value();

		/**
		 * The meta object literal for the '{@link DTML.impl.DataPointImpl <em>Data Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DataPointImpl
		 * @see DTML.impl.DTMLPackageImpl#getDataPoint()
		 * @generated
		 */
		EClass DATA_POINT = eINSTANCE.getDataPoint();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTContentImpl <em>DT Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTContentImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTContent()
		 * @generated
		 */
		EClass DT_CONTENT = eINSTANCE.getDTContent();

		/**
		 * The meta object literal for the '{@link DTML.impl.Schema_TestImpl <em>Schema Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.Schema_TestImpl
		 * @see DTML.impl.DTMLPackageImpl#getSchema_Test()
		 * @generated
		 */
		EClass SCHEMA_TEST = eINSTANCE.getSchema_Test();

		/**
		 * The meta object literal for the '{@link DTML.impl.ComplexSchemaImpl <em>Complex Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.ComplexSchemaImpl
		 * @see DTML.impl.DTMLPackageImpl#getComplexSchema()
		 * @generated
		 */
		EClass COMPLEX_SCHEMA = eINSTANCE.getComplexSchema();

		/**
		 * The meta object literal for the '{@link DTML.impl.EnumSchemaTypesImpl <em>Enum Schema Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.EnumSchemaTypesImpl
		 * @see DTML.impl.DTMLPackageImpl#getEnumSchemaTypes()
		 * @generated
		 */
		EClass ENUM_SCHEMA_TYPES = eINSTANCE.getEnumSchemaTypes();

		/**
		 * The meta object literal for the '{@link DTML.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.EnumValueImpl
		 * @see DTML.impl.DTMLPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '{@link DTML.impl.KeyValueTypeImpl <em>Key Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.KeyValueTypeImpl
		 * @see DTML.impl.DTMLPackageImpl#getKeyValueType()
		 * @generated
		 */
		EClass KEY_VALUE_TYPE = eINSTANCE.getKeyValueType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_TYPE__NAME = eINSTANCE.getKeyValueType_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_TYPE__SCHEMA = eINSTANCE.getKeyValueType_Schema();

		/**
		 * The meta object literal for the '{@link DTML.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.ObjectInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getObjectInstance()
		 * @generated
		 */
		EClass OBJECT_INSTANCE = eINSTANCE.getObjectInstance();

		/**
		 * The meta object literal for the '<em><b>Field Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__FIELD_INSTANCES = eINSTANCE.getObjectInstance_FieldInstances();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__TYPE = eINSTANCE.getObjectInstance_Type();

		/**
		 * The meta object literal for the '{@link DTML.impl.SimpleSchemaImpl <em>Simple Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.SimpleSchemaImpl
		 * @see DTML.impl.DTMLPackageImpl#getSimpleSchema()
		 * @generated
		 */
		EClass SIMPLE_SCHEMA = eINSTANCE.getSimpleSchema();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTBooleanImpl <em>DT Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTBooleanImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTBoolean()
		 * @generated
		 */
		EClass DT_BOOLEAN = eINSTANCE.getDTBoolean();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTStringImpl <em>DT String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTStringImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTString()
		 * @generated
		 */
		EClass DT_STRING = eINSTANCE.getDTString();

		/**
		 * The meta object literal for the '{@link DTML.impl.DTIntegerImpl <em>DT Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DTIntegerImpl
		 * @see DTML.impl.DTMLPackageImpl#getDTInteger()
		 * @generated
		 */
		EClass DT_INTEGER = eINSTANCE.getDTInteger();

		/**
		 * The meta object literal for the '{@link DTML.impl.FieldInstanceImpl <em>Field Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.FieldInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getFieldInstance()
		 * @generated
		 */
		EClass FIELD_INSTANCE = eINSTANCE.getFieldInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_INSTANCE__TYPE = eINSTANCE.getFieldInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_INSTANCE__VALUE = eINSTANCE.getFieldInstance_Value();

		/**
		 * The meta object literal for the '{@link DTML.impl.MapInstanceImpl <em>Map Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.MapInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getMapInstance()
		 * @generated
		 */
		EClass MAP_INSTANCE = eINSTANCE.getMapInstance();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_INSTANCE__KEYS = eINSTANCE.getMapInstance_Keys();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_INSTANCE__VALUES = eINSTANCE.getMapInstance_Values();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_INSTANCE__TYPE = eINSTANCE.getMapInstance_Type();

		/**
		 * The meta object literal for the '{@link DTML.impl.KeyValueInstanceImpl <em>Key Value Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.KeyValueInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getKeyValueInstance()
		 * @generated
		 */
		EClass KEY_VALUE_INSTANCE = eINSTANCE.getKeyValueInstance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_INSTANCE__VALUE = eINSTANCE.getKeyValueInstance_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_INSTANCE__TYPE = eINSTANCE.getKeyValueInstance_Type();

		/**
		 * The meta object literal for the '{@link DTML.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.ArrayInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getArrayInstance()
		 * @generated
		 */
		EClass ARRAY_INSTANCE = eINSTANCE.getArrayInstance();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INSTANCE__VALUES = eINSTANCE.getArrayInstance_Values();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INSTANCE__TYPE = eINSTANCE.getArrayInstance_Type();

		/**
		 * The meta object literal for the '{@link DTML.impl.DigitalTwinEnvironmentImpl <em>Digital Twin Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.DigitalTwinEnvironmentImpl
		 * @see DTML.impl.DTMLPackageImpl#getDigitalTwinEnvironment()
		 * @generated
		 */
		EClass DIGITAL_TWIN_ENVIRONMENT = eINSTANCE.getDigitalTwinEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_TWIN_ENVIRONMENT__NAME = eINSTANCE.getDigitalTwinEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_ENVIRONMENT__INSTANCES = eINSTANCE.getDigitalTwinEnvironment_Instances();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_ENVIRONMENT__TYPES = eINSTANCE.getDigitalTwinEnvironment_Types();

		/**
		 * The meta object literal for the '{@link DTML.impl.StringInstanceImpl <em>String Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.StringInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getStringInstance()
		 * @generated
		 */
		EClass STRING_INSTANCE = eINSTANCE.getStringInstance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_INSTANCE__VALUE = eINSTANCE.getStringInstance_Value();

		/**
		 * The meta object literal for the '{@link DTML.impl.IntInstanceImpl <em>Int Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.IntInstanceImpl
		 * @see DTML.impl.DTMLPackageImpl#getIntInstance()
		 * @generated
		 */
		EClass INT_INSTANCE = eINSTANCE.getIntInstance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_INSTANCE__VALUE = eINSTANCE.getIntInstance_Value();

		/**
		 * The meta object literal for the '{@link DTML.impl.ComponentContentImpl <em>Component Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.impl.ComponentContentImpl
		 * @see DTML.impl.DTMLPackageImpl#getComponentContent()
		 * @generated
		 */
		EClass COMPONENT_CONTENT = eINSTANCE.getComponentContent();

		/**
		 * The meta object literal for the '{@link DTML.Schema <em>Schema</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.Schema
		 * @see DTML.impl.DTMLPackageImpl#getSchema()
		 * @generated
		 */
		EEnum SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '{@link DTML.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.Type
		 * @see DTML.impl.DTMLPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link DTML.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DTML.Unit
		 * @see DTML.impl.DTMLPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

	}

} //DTMLPackage
