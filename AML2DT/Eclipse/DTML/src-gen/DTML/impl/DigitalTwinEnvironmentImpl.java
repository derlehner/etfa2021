/**
 */
package DTML.impl;

import DTML.DTMLPackage;
import DTML.DigitalTwin;
import DTML.DigitalTwinEnvironment;
import DTML.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Twin Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.DigitalTwinEnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link DTML.impl.DigitalTwinEnvironmentImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link DTML.impl.DigitalTwinEnvironmentImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalTwinEnvironmentImpl extends MinimalEObjectImpl.Container implements DigitalTwinEnvironment {
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
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalTwin> instances;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalTwinEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.DIGITAL_TWIN_ENVIRONMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DigitalTwin> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<DigitalTwin>(DigitalTwin.class, this,
					DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Interface>(Interface.class, this,
					DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
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
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__NAME:
			return getName();
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__INSTANCES:
			return getInstances();
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__TYPES:
			return getTypes();
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
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__NAME:
			setName((String) newValue);
			return;
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends DigitalTwin>) newValue);
			return;
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends Interface>) newValue);
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
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__INSTANCES:
			getInstances().clear();
			return;
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__TYPES:
			getTypes().clear();
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
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__INSTANCES:
			return instances != null && !instances.isEmpty();
		case DTMLPackage.DIGITAL_TWIN_ENVIRONMENT__TYPES:
			return types != null && !types.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DigitalTwinEnvironmentImpl
