/**
 */
package DTML.impl;

import DTML.CommandPayload;
import DTML.DTMLPackage;
import DTML.Schema;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.CommandPayloadImpl#getName <em>Name</em>}</li>
 *   <li>{@link DTML.impl.CommandPayloadImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link DTML.impl.CommandPayloadImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link DTML.impl.CommandPayloadImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link DTML.impl.CommandPayloadImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandPayloadImpl extends MinimalEObjectImpl.Container implements CommandPayload {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final Schema SCHEMA_EDEFAULT = Schema.BOOLEAN;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema = SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.COMMAND_PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD__DISPLAY_NAME,
					oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema == null ? SCHEMA_EDEFAULT : newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD__SCHEMA, oldSchema,
					schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.COMMAND_PAYLOAD__NAME:
			return getName();
		case DTMLPackage.COMMAND_PAYLOAD__DISPLAY_NAME:
			return getDisplayName();
		case DTMLPackage.COMMAND_PAYLOAD__COMMENT:
			return getComment();
		case DTMLPackage.COMMAND_PAYLOAD__DESCRIPTION:
			return getDescription();
		case DTMLPackage.COMMAND_PAYLOAD__SCHEMA:
			return getSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DTMLPackage.COMMAND_PAYLOAD__NAME:
			setName((String) newValue);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__DISPLAY_NAME:
			setDisplayName((String) newValue);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__COMMENT:
			setComment((String) newValue);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__SCHEMA:
			setSchema((Schema) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DTMLPackage.COMMAND_PAYLOAD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__DISPLAY_NAME:
			setDisplayName(DISPLAY_NAME_EDEFAULT);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DTMLPackage.COMMAND_PAYLOAD__SCHEMA:
			setSchema(SCHEMA_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DTMLPackage.COMMAND_PAYLOAD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DTMLPackage.COMMAND_PAYLOAD__DISPLAY_NAME:
			return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
		case DTMLPackage.COMMAND_PAYLOAD__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case DTMLPackage.COMMAND_PAYLOAD__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DTMLPackage.COMMAND_PAYLOAD__SCHEMA:
			return schema != SCHEMA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", comment: ");
		result.append(comment);
		result.append(", description: ");
		result.append(description);
		result.append(", schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} //CommandPayloadImpl
