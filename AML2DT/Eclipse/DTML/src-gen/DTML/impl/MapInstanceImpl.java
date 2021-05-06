/**
 */
package DTML.impl;

import DTML.DTMLPackage;
import DTML.DTMap;
import DTML.KeyValueInstance;
import DTML.MapInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.MapInstanceImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link DTML.impl.MapInstanceImpl#getValues <em>Values</em>}</li>
 *   <li>{@link DTML.impl.MapInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapInstanceImpl extends DataPointImpl implements MapInstance {
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueInstance> keys;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueInstance> values;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DTMap type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.MAP_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueInstance> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<KeyValueInstance>(KeyValueInstance.class, this,
					DTMLPackage.MAP_INSTANCE__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueInstance> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<KeyValueInstance>(KeyValueInstance.class, this,
					DTMLPackage.MAP_INSTANCE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMap getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (DTMap) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.MAP_INSTANCE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMap basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DTMap newType) {
		DTMap oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.MAP_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.MAP_INSTANCE__KEYS:
			return getKeys();
		case DTMLPackage.MAP_INSTANCE__VALUES:
			return getValues();
		case DTMLPackage.MAP_INSTANCE__TYPE:
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
		case DTMLPackage.MAP_INSTANCE__KEYS:
			getKeys().clear();
			getKeys().addAll((Collection<? extends KeyValueInstance>) newValue);
			return;
		case DTMLPackage.MAP_INSTANCE__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends KeyValueInstance>) newValue);
			return;
		case DTMLPackage.MAP_INSTANCE__TYPE:
			setType((DTMap) newValue);
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
		case DTMLPackage.MAP_INSTANCE__KEYS:
			getKeys().clear();
			return;
		case DTMLPackage.MAP_INSTANCE__VALUES:
			getValues().clear();
			return;
		case DTMLPackage.MAP_INSTANCE__TYPE:
			setType((DTMap) null);
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
		case DTMLPackage.MAP_INSTANCE__KEYS:
			return keys != null && !keys.isEmpty();
		case DTMLPackage.MAP_INSTANCE__VALUES:
			return values != null && !values.isEmpty();
		case DTMLPackage.MAP_INSTANCE__TYPE:
			return type != null;
		}
		return super.eIsSet(featureID);
	}

} //MapInstanceImpl
