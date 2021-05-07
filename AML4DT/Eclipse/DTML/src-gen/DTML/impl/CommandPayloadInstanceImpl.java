/**
 */
package DTML.impl;

import DTML.CommandPayload;
import DTML.CommandPayloadInstance;
import DTML.DTMLPackage;
import DTML.DataPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Payload Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.CommandPayloadInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link DTML.impl.CommandPayloadInstanceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandPayloadInstanceImpl extends MinimalEObjectImpl.Container implements CommandPayloadInstance {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommandPayload type;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DataPoint value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandPayloadInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.COMMAND_PAYLOAD_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPayload getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (CommandPayload) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DTMLPackage.COMMAND_PAYLOAD_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPayload basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CommandPayload newType) {
		CommandPayload oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD_INSTANCE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPoint getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (DataPoint) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DTMLPackage.COMMAND_PAYLOAD_INSTANCE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPoint basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(DataPoint newValue) {
		DataPoint oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMMAND_PAYLOAD_INSTANCE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
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
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__TYPE:
			setType((CommandPayload) newValue);
			return;
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__VALUE:
			setValue((DataPoint) newValue);
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
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__TYPE:
			setType((CommandPayload) null);
			return;
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__VALUE:
			setValue((DataPoint) null);
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
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__TYPE:
			return type != null;
		case DTMLPackage.COMMAND_PAYLOAD_INSTANCE__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandPayloadInstanceImpl
