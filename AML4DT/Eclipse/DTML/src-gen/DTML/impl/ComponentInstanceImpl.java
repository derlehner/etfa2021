/**
 */
package DTML.impl;

import DTML.Component;
import DTML.ComponentContent;
import DTML.ComponentInstance;
import DTML.DTMLPackage;
import DTML.DigitalTwin;

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
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.ComponentInstanceImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link DTML.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link DTML.impl.ComponentInstanceImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends DTContentImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected DigitalTwin schema;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Component type;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentContent> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalTwin getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(DigitalTwin newSchema, NotificationChain msgs) {
		DigitalTwin oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DTMLPackage.COMPONENT_INSTANCE__SCHEMA, oldSchema, newSchema);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(DigitalTwin newSchema) {
		if (newSchema != schema) {
			NotificationChain msgs = null;
			if (schema != null)
				msgs = ((InternalEObject) schema).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DTMLPackage.COMPONENT_INSTANCE__SCHEMA, null, msgs);
			if (newSchema != null)
				msgs = ((InternalEObject) newSchema).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DTMLPackage.COMPONENT_INSTANCE__SCHEMA, null, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMPONENT_INSTANCE__SCHEMA, newSchema,
					newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Component) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.COMPONENT_INSTANCE__TYPE,
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
	public Component basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Component newType) {
		Component oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<ComponentContent>(ComponentContent.class, this,
					DTMLPackage.COMPONENT_INSTANCE__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DTMLPackage.COMPONENT_INSTANCE__SCHEMA:
			return basicSetSchema(null, msgs);
		case DTMLPackage.COMPONENT_INSTANCE__CONTENTS:
			return ((InternalEList<?>) getContents()).basicRemove(otherEnd, msgs);
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
		case DTMLPackage.COMPONENT_INSTANCE__SCHEMA:
			return getSchema();
		case DTMLPackage.COMPONENT_INSTANCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case DTMLPackage.COMPONENT_INSTANCE__CONTENTS:
			return getContents();
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
		case DTMLPackage.COMPONENT_INSTANCE__SCHEMA:
			setSchema((DigitalTwin) newValue);
			return;
		case DTMLPackage.COMPONENT_INSTANCE__TYPE:
			setType((Component) newValue);
			return;
		case DTMLPackage.COMPONENT_INSTANCE__CONTENTS:
			getContents().clear();
			getContents().addAll((Collection<? extends ComponentContent>) newValue);
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
		case DTMLPackage.COMPONENT_INSTANCE__SCHEMA:
			setSchema((DigitalTwin) null);
			return;
		case DTMLPackage.COMPONENT_INSTANCE__TYPE:
			setType((Component) null);
			return;
		case DTMLPackage.COMPONENT_INSTANCE__CONTENTS:
			getContents().clear();
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
		case DTMLPackage.COMPONENT_INSTANCE__SCHEMA:
			return schema != null;
		case DTMLPackage.COMPONENT_INSTANCE__TYPE:
			return type != null;
		case DTMLPackage.COMPONENT_INSTANCE__CONTENTS:
			return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstanceImpl
