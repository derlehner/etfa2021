/**
 */
package DTML.impl;

import DTML.DTMLPackage;
import DTML.DTObject;
import DTML.FieldInstance;
import DTML.ObjectInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.ObjectInstanceImpl#getFieldInstances <em>Field Instances</em>}</li>
 *   <li>{@link DTML.impl.ObjectInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectInstanceImpl extends DataPointImpl implements ObjectInstance {
	/**
	 * The cached value of the '{@link #getFieldInstances() <em>Field Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldInstance> fieldInstances;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DTObject type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.OBJECT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldInstance> getFieldInstances() {
		if (fieldInstances == null) {
			fieldInstances = new EObjectResolvingEList<FieldInstance>(FieldInstance.class, this,
					DTMLPackage.OBJECT_INSTANCE__FIELD_INSTANCES);
		}
		return fieldInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTObject getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (DTObject) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.OBJECT_INSTANCE__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTObject basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DTObject newType) {
		DTObject oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.OBJECT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.OBJECT_INSTANCE__FIELD_INSTANCES:
			return getFieldInstances();
		case DTMLPackage.OBJECT_INSTANCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DTMLPackage.OBJECT_INSTANCE__FIELD_INSTANCES:
			getFieldInstances().clear();
			getFieldInstances().addAll((Collection<? extends FieldInstance>) newValue);
			return;
		case DTMLPackage.OBJECT_INSTANCE__TYPE:
			setType((DTObject) newValue);
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
		case DTMLPackage.OBJECT_INSTANCE__FIELD_INSTANCES:
			getFieldInstances().clear();
			return;
		case DTMLPackage.OBJECT_INSTANCE__TYPE:
			setType((DTObject) null);
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
		case DTMLPackage.OBJECT_INSTANCE__FIELD_INSTANCES:
			return fieldInstances != null && !fieldInstances.isEmpty();
		case DTMLPackage.OBJECT_INSTANCE__TYPE:
			return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectInstanceImpl
