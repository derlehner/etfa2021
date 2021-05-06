/**
 */
package DTML.impl;

import DTML.DTMLPackage;
import DTML.DTMap;
import DTML.KeyValueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.DTMapImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link DTML.impl.DTMapImpl#getMapValue <em>Map Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTMapImpl extends DTElementImpl implements DTMap {
	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueType> mapKey;

	/**
	 * The cached value of the '{@link #getMapValue() <em>Map Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapValue()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueType> mapValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.DT_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueType> getMapKey() {
		if (mapKey == null) {
			mapKey = new EObjectContainmentEList<KeyValueType>(KeyValueType.class, this, DTMLPackage.DT_MAP__MAP_KEY);
		}
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueType> getMapValue() {
		if (mapValue == null) {
			mapValue = new EObjectContainmentEList<KeyValueType>(KeyValueType.class, this,
					DTMLPackage.DT_MAP__MAP_VALUE);
		}
		return mapValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DTMLPackage.DT_MAP__MAP_KEY:
			return ((InternalEList<?>) getMapKey()).basicRemove(otherEnd, msgs);
		case DTMLPackage.DT_MAP__MAP_VALUE:
			return ((InternalEList<?>) getMapValue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.DT_MAP__MAP_KEY:
			return getMapKey();
		case DTMLPackage.DT_MAP__MAP_VALUE:
			return getMapValue();
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
		case DTMLPackage.DT_MAP__MAP_KEY:
			getMapKey().clear();
			getMapKey().addAll((Collection<? extends KeyValueType>) newValue);
			return;
		case DTMLPackage.DT_MAP__MAP_VALUE:
			getMapValue().clear();
			getMapValue().addAll((Collection<? extends KeyValueType>) newValue);
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
		case DTMLPackage.DT_MAP__MAP_KEY:
			getMapKey().clear();
			return;
		case DTMLPackage.DT_MAP__MAP_VALUE:
			getMapValue().clear();
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
		case DTMLPackage.DT_MAP__MAP_KEY:
			return mapKey != null && !mapKey.isEmpty();
		case DTMLPackage.DT_MAP__MAP_VALUE:
			return mapValue != null && !mapValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DTMapImpl
