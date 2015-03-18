/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.unicase.model.document.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.unicase.model.document.CompositeSection;
import org.unicase.model.document.DocumentPackage;
import org.unicase.model.document.LeafSection;
import org.unicase.model.impl.UnicaseModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Leaf Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.unicase.model.document.impl.LeafSectionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.unicase.model.document.impl.LeafSectionImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link org.unicase.model.document.impl.LeafSectionImpl#getReferencedElements <em>Referenced Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafSectionImpl extends UnicaseModelElementImpl implements LeafSection {
	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> containedElements;
	/**
	 * The cached value of the '{@link #getReferencedElements() <em>Referenced Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> referencedElements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.LEAF_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSection getParent() {
		if (eContainerFeatureID() != DocumentPackage.LEAF_SECTION__PARENT)
			return null;
		return (CompositeSection) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSection basicGetParent() {
		if (eContainerFeatureID() != DocumentPackage.LEAF_SECTION__PARENT)
			return null;
		return (CompositeSection) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CompositeSection newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, DocumentPackage.LEAF_SECTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CompositeSection newParent) {
		if (newParent != eInternalContainer()
			|| (eContainerFeatureID() != DocumentPackage.LEAF_SECTION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS,
					CompositeSection.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.LEAF_SECTION__PARENT, newParent,
				newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentEList.Resolving<EObject>(EObject.class, this,
				DocumentPackage.LEAF_SECTION__CONTAINED_ELEMENTS);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getReferencedElements() {
		if (referencedElements == null) {
			referencedElements = new EObjectResolvingEList<EObject>(EObject.class, this,
				DocumentPackage.LEAF_SECTION__REFERENCED_ELEMENTS);
		}
		return referencedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((CompositeSection) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			return basicSetParent(null, msgs);
		case DocumentPackage.LEAF_SECTION__CONTAINED_ELEMENTS:
			return ((InternalEList<?>) getContainedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			return eInternalContainer().eInverseRemove(this, DocumentPackage.COMPOSITE_SECTION__SUBSECTIONS,
				CompositeSection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case DocumentPackage.LEAF_SECTION__CONTAINED_ELEMENTS:
			return getContainedElements();
		case DocumentPackage.LEAF_SECTION__REFERENCED_ELEMENTS:
			return getReferencedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			setParent((CompositeSection) newValue);
			return;
		case DocumentPackage.LEAF_SECTION__CONTAINED_ELEMENTS:
			getContainedElements().clear();
			getContainedElements().addAll((Collection<? extends EObject>) newValue);
			return;
		case DocumentPackage.LEAF_SECTION__REFERENCED_ELEMENTS:
			getReferencedElements().clear();
			getReferencedElements().addAll((Collection<? extends EObject>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			setParent((CompositeSection) null);
			return;
		case DocumentPackage.LEAF_SECTION__CONTAINED_ELEMENTS:
			getContainedElements().clear();
			return;
		case DocumentPackage.LEAF_SECTION__REFERENCED_ELEMENTS:
			getReferencedElements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DocumentPackage.LEAF_SECTION__PARENT:
			return basicGetParent() != null;
		case DocumentPackage.LEAF_SECTION__CONTAINED_ELEMENTS:
			return containedElements != null && !containedElements.isEmpty();
		case DocumentPackage.LEAF_SECTION__REFERENCED_ELEMENTS:
			return referencedElements != null && !referencedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LeafSectionImpl