/**
 */
package DTML.impl;

import DTML.DTArray;
import DTML.DTMLPackage;
import DTML.Schema_Test;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.DTArrayImpl#getElementSchema <em>Element Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTArrayImpl extends DTElementImpl implements DTArray {
	/**
	 * The cached value of the '{@link #getElementSchema() <em>Element Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema_Test elementSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.DT_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema_Test getElementSchema() {
		if (elementSchema != null && elementSchema.eIsProxy()) {
			InternalEObject oldElementSchema = (InternalEObject) elementSchema;
			elementSchema = (Schema_Test) eResolveProxy(oldElementSchema);
			if (elementSchema != oldElementSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.DT_ARRAY__ELEMENT_SCHEMA,
							oldElementSchema, elementSchema));
			}
		}
		return elementSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema_Test basicGetElementSchema() {
		return elementSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSchema(Schema_Test newElementSchema) {
		Schema_Test oldElementSchema = elementSchema;
		elementSchema = newElementSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.DT_ARRAY__ELEMENT_SCHEMA,
					oldElementSchema, elementSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.DT_ARRAY__ELEMENT_SCHEMA:
			if (resolve)
				return getElementSchema();
			return basicGetElementSchema();
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
		case DTMLPackage.DT_ARRAY__ELEMENT_SCHEMA:
			setElementSchema((Schema_Test) newValue);
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
		case DTMLPackage.DT_ARRAY__ELEMENT_SCHEMA:
			setElementSchema((Schema_Test) null);
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
		case DTMLPackage.DT_ARRAY__ELEMENT_SCHEMA:
			return elementSchema != null;
		}
		return super.eIsSet(featureID);
	}

} //DTArrayImpl
