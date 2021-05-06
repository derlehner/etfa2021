/**
 */
package DTML.impl;

import DTML.DTMLPackage;
import DTML.Interface;
import DTML.Property;
import DTML.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.RelationshipImpl#isWritable <em>Writable</em>}</li>
 *   <li>{@link DTML.impl.RelationshipImpl#getMinMultiplicity <em>Min Multiplicity</em>}</li>
 *   <li>{@link DTML.impl.RelationshipImpl#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 *   <li>{@link DTML.impl.RelationshipImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link DTML.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link DTML.impl.RelationshipImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends InterfaceContentImpl implements Relationship {
	/**
	 * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected boolean writable = WRITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinMultiplicity() <em>Min Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinMultiplicity() <em>Min Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int minMultiplicity = MIN_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMultiplicity() <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMultiplicity() <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int maxMultiplicity = MAX_MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Interface target;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWritable() {
		return writable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritable(boolean newWritable) {
		boolean oldWritable = writable;
		writable = newWritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.RELATIONSHIP__WRITABLE, oldWritable,
					writable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinMultiplicity() {
		return minMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinMultiplicity(int newMinMultiplicity) {
		int oldMinMultiplicity = minMultiplicity;
		minMultiplicity = newMinMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.RELATIONSHIP__MIN_MULTIPLICITY,
					oldMinMultiplicity, minMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxMultiplicity() {
		return maxMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMultiplicity(int newMaxMultiplicity) {
		int oldMaxMultiplicity = maxMultiplicity;
		maxMultiplicity = newMaxMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.RELATIONSHIP__MAX_MULTIPLICITY,
					oldMaxMultiplicity, maxMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					DTMLPackage.RELATIONSHIP__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Interface) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.RELATIONSHIP__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Interface newTarget) {
		Interface oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.RELATIONSHIP__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DTMLPackage.RELATIONSHIP__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
		case DTMLPackage.RELATIONSHIP__WRITABLE:
			return isWritable();
		case DTMLPackage.RELATIONSHIP__MIN_MULTIPLICITY:
			return getMinMultiplicity();
		case DTMLPackage.RELATIONSHIP__MAX_MULTIPLICITY:
			return getMaxMultiplicity();
		case DTMLPackage.RELATIONSHIP__PROPERTIES:
			return getProperties();
		case DTMLPackage.RELATIONSHIP__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case DTMLPackage.RELATIONSHIP__NAME:
			return getName();
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
		case DTMLPackage.RELATIONSHIP__WRITABLE:
			setWritable((Boolean) newValue);
			return;
		case DTMLPackage.RELATIONSHIP__MIN_MULTIPLICITY:
			setMinMultiplicity((Integer) newValue);
			return;
		case DTMLPackage.RELATIONSHIP__MAX_MULTIPLICITY:
			setMaxMultiplicity((Integer) newValue);
			return;
		case DTMLPackage.RELATIONSHIP__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case DTMLPackage.RELATIONSHIP__TARGET:
			setTarget((Interface) newValue);
			return;
		case DTMLPackage.RELATIONSHIP__NAME:
			setName((String) newValue);
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
		case DTMLPackage.RELATIONSHIP__WRITABLE:
			setWritable(WRITABLE_EDEFAULT);
			return;
		case DTMLPackage.RELATIONSHIP__MIN_MULTIPLICITY:
			setMinMultiplicity(MIN_MULTIPLICITY_EDEFAULT);
			return;
		case DTMLPackage.RELATIONSHIP__MAX_MULTIPLICITY:
			setMaxMultiplicity(MAX_MULTIPLICITY_EDEFAULT);
			return;
		case DTMLPackage.RELATIONSHIP__PROPERTIES:
			getProperties().clear();
			return;
		case DTMLPackage.RELATIONSHIP__TARGET:
			setTarget((Interface) null);
			return;
		case DTMLPackage.RELATIONSHIP__NAME:
			setName(NAME_EDEFAULT);
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
		case DTMLPackage.RELATIONSHIP__WRITABLE:
			return writable != WRITABLE_EDEFAULT;
		case DTMLPackage.RELATIONSHIP__MIN_MULTIPLICITY:
			return minMultiplicity != MIN_MULTIPLICITY_EDEFAULT;
		case DTMLPackage.RELATIONSHIP__MAX_MULTIPLICITY:
			return maxMultiplicity != MAX_MULTIPLICITY_EDEFAULT;
		case DTMLPackage.RELATIONSHIP__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case DTMLPackage.RELATIONSHIP__TARGET:
			return target != null;
		case DTMLPackage.RELATIONSHIP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (writable: ");
		result.append(writable);
		result.append(", minMultiplicity: ");
		result.append(minMultiplicity);
		result.append(", maxMultiplicity: ");
		result.append(maxMultiplicity);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
