/**
 */
package DTML.impl;

import DTML.DTMLPackage;
import DTML.Unit_Test;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DTML.impl.Unit_TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link DTML.impl.Unit_TestImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link DTML.impl.Unit_TestImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link DTML.impl.Unit_TestImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link DTML.impl.Unit_TestImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Unit_TestImpl extends MinimalEObjectImpl.Container implements Unit_Test {
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
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> dimensions;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> conversionFactor;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unit_TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMLPackage.Literals.UNIT_TEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.UNIT_TEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMLPackage.UNIT_TEST__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDimensions() {
		if (dimensions == null) {
			dimensions = new EDataTypeUniqueEList<Double>(Double.class, this, DTMLPackage.UNIT_TEST__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getConversionFactor() {
		if (conversionFactor == null) {
			conversionFactor = new EDataTypeUniqueEList<Double>(Double.class, this,
					DTMLPackage.UNIT_TEST__CONVERSION_FACTOR);
		}
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getOffset() {
		if (offset == null) {
			offset = new EDataTypeUniqueEList<Double>(Double.class, this, DTMLPackage.UNIT_TEST__OFFSET);
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DTMLPackage.UNIT_TEST__NAME:
			return getName();
		case DTMLPackage.UNIT_TEST__SYMBOL:
			return getSymbol();
		case DTMLPackage.UNIT_TEST__DIMENSIONS:
			return getDimensions();
		case DTMLPackage.UNIT_TEST__CONVERSION_FACTOR:
			return getConversionFactor();
		case DTMLPackage.UNIT_TEST__OFFSET:
			return getOffset();
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
		case DTMLPackage.UNIT_TEST__NAME:
			setName((String) newValue);
			return;
		case DTMLPackage.UNIT_TEST__SYMBOL:
			setSymbol((String) newValue);
			return;
		case DTMLPackage.UNIT_TEST__DIMENSIONS:
			getDimensions().clear();
			getDimensions().addAll((Collection<? extends Double>) newValue);
			return;
		case DTMLPackage.UNIT_TEST__CONVERSION_FACTOR:
			getConversionFactor().clear();
			getConversionFactor().addAll((Collection<? extends Double>) newValue);
			return;
		case DTMLPackage.UNIT_TEST__OFFSET:
			getOffset().clear();
			getOffset().addAll((Collection<? extends Double>) newValue);
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
		case DTMLPackage.UNIT_TEST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DTMLPackage.UNIT_TEST__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case DTMLPackage.UNIT_TEST__DIMENSIONS:
			getDimensions().clear();
			return;
		case DTMLPackage.UNIT_TEST__CONVERSION_FACTOR:
			getConversionFactor().clear();
			return;
		case DTMLPackage.UNIT_TEST__OFFSET:
			getOffset().clear();
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
		case DTMLPackage.UNIT_TEST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DTMLPackage.UNIT_TEST__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case DTMLPackage.UNIT_TEST__DIMENSIONS:
			return dimensions != null && !dimensions.isEmpty();
		case DTMLPackage.UNIT_TEST__CONVERSION_FACTOR:
			return conversionFactor != null && !conversionFactor.isEmpty();
		case DTMLPackage.UNIT_TEST__OFFSET:
			return offset != null && !offset.isEmpty();
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
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", dimensions: ");
		result.append(dimensions);
		result.append(", conversionFactor: ");
		result.append(conversionFactor);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //Unit_TestImpl
