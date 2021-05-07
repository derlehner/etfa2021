/**
 */
package DTML.impl;

import DTML.DTEnum;
import DTML.DTMLPackage;
import DTML.EnumSchemaTypes;
import DTML.EnumValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.DTEnumImpl#getValueSchema <em>Value Schema</em>}</li>
 *   <li>{@link DTML.impl.DTEnumImpl#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTEnumImpl extends DTElementImpl implements DTEnum {
	/**
	 * The cached value of the '{@link #getValueSchema() <em>Value Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSchema()
	 * @generated
	 * @ordered
	 */
	protected EnumSchemaTypes valueSchema;

	/**
	 * The cached value of the '{@link #getEnumValues() <em>Enum Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValues()
	 * @generated
	 * @ordered
	 */
	protected EnumValue enumValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.DT_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSchemaTypes getValueSchema() {
		if (valueSchema != null && valueSchema.eIsProxy()) {
			InternalEObject oldValueSchema = (InternalEObject) valueSchema;
			valueSchema = (EnumSchemaTypes) eResolveProxy(oldValueSchema);
			if (valueSchema != oldValueSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.DT_ENUM__VALUE_SCHEMA,
							oldValueSchema, valueSchema));
			}
		}
		return valueSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSchemaTypes basicGetValueSchema() {
		return valueSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSchema(EnumSchemaTypes newValueSchema) {
		EnumSchemaTypes oldValueSchema = valueSchema;
		valueSchema = newValueSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.DT_ENUM__VALUE_SCHEMA, oldValueSchema,
					valueSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue getEnumValues() {
		if (enumValues != null && enumValues.eIsProxy()) {
			InternalEObject oldEnumValues = (InternalEObject) enumValues;
			enumValues = (EnumValue) eResolveProxy(oldEnumValues);
			if (enumValues != oldEnumValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTMLPackage.DT_ENUM__ENUM_VALUES,
							oldEnumValues, enumValues));
			}
		}
		return enumValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue basicGetEnumValues() {
		return enumValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumValues(EnumValue newEnumValues) {
		EnumValue oldEnumValues = enumValues;
		enumValues = newEnumValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.DT_ENUM__ENUM_VALUES, oldEnumValues,
					enumValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.DT_ENUM__VALUE_SCHEMA:
			if (resolve)
				return getValueSchema();
			return basicGetValueSchema();
		case DTMLPackage.DT_ENUM__ENUM_VALUES:
			if (resolve)
				return getEnumValues();
			return basicGetEnumValues();
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
		case DTMLPackage.DT_ENUM__VALUE_SCHEMA:
			setValueSchema((EnumSchemaTypes) newValue);
			return;
		case DTMLPackage.DT_ENUM__ENUM_VALUES:
			setEnumValues((EnumValue) newValue);
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
		case DTMLPackage.DT_ENUM__VALUE_SCHEMA:
			setValueSchema((EnumSchemaTypes) null);
			return;
		case DTMLPackage.DT_ENUM__ENUM_VALUES:
			setEnumValues((EnumValue) null);
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
		case DTMLPackage.DT_ENUM__VALUE_SCHEMA:
			return valueSchema != null;
		case DTMLPackage.DT_ENUM__ENUM_VALUES:
			return enumValues != null;
		}
		return super.eIsSet(featureID);
	}

} //DTEnumImpl
