/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package scrm.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import scrm.impl.SCRMModelElementImpl;
import scrm.knowledge.KnowledgePackage;
import scrm.knowledge.Method;
import scrm.requirements.Feature;
import scrm.requirements.Interface;
import scrm.requirements.Requirement;
import scrm.requirements.RequirementsPackage;
import scrm.requirements.dataObject.Data;
import scrm.requirements.dataObject.DataObjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getRefinedRequirement <em>Refined Requirement</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getSpecifiedFeature <em>Specified Feature</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getHandlingData <em>Handling Data</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getRealizedMethod <em>Realized Method</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link scrm.requirements.impl.RequirementImpl#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends SCRMModelElementImpl implements
		Requirement {
	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> refinements;

	/**
	 * The cached value of the '{@link #getHandlingData() <em>Handling Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> handlingData;

	/**
	 * The cached value of the '{@link #getRealizedMethod() <em>Realized Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedMethod()
	 * @generated
	 * @ordered
	 */
	protected Method realizedMethod;

	/**
	 * The cached value of the '{@link #getProvidedInterface() <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface providedInterface;

	/**
	 * The cached value of the '{@link #getRequiredInterface() <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface requiredInterface;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentWithInverseEList.Resolving<Requirement>(
					Requirement.class, this,
					RequirementsPackage.REQUIREMENT__REFINEMENTS,
					RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRefinedRequirement() {
		if (eContainerFeatureID() != RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT)
			return null;
		return (Requirement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRefinedRequirement() {
		if (eContainerFeatureID() != RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT)
			return null;
		return (Requirement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefinedRequirement(
			Requirement newRefinedRequirement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRefinedRequirement,
				RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRequirement(Requirement newRefinedRequirement) {
		if (newRefinedRequirement != eInternalContainer()
				|| (eContainerFeatureID() != RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT && newRefinedRequirement != null)) {
			if (EcoreUtil.isAncestor(this, newRefinedRequirement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefinedRequirement != null)
				msgs = ((InternalEObject) newRefinedRequirement).eInverseAdd(
						this, RequirementsPackage.REQUIREMENT__REFINEMENTS,
						Requirement.class, msgs);
			msgs = basicSetRefinedRequirement(newRefinedRequirement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT,
					newRefinedRequirement, newRefinedRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSpecifiedFeature() {
		if (eContainerFeatureID() != RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE)
			return null;
		return (Feature) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSpecifiedFeature() {
		if (eContainerFeatureID() != RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE)
			return null;
		return (Feature) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifiedFeature(
			Feature newSpecifiedFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpecifiedFeature,
				RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifiedFeature(Feature newSpecifiedFeature) {
		if (newSpecifiedFeature != eInternalContainer()
				|| (eContainerFeatureID() != RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE && newSpecifiedFeature != null)) {
			if (EcoreUtil.isAncestor(this, newSpecifiedFeature))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecifiedFeature != null)
				msgs = ((InternalEObject) newSpecifiedFeature).eInverseAdd(
						this,
						RequirementsPackage.FEATURE__DETAILED_REQUIREMENTS,
						Feature.class, msgs);
			msgs = basicSetSpecifiedFeature(newSpecifiedFeature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE,
					newSpecifiedFeature, newSpecifiedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getHandlingData() {
		if (handlingData == null) {
			handlingData = new EObjectWithInverseResolvingEList<Data>(
					Data.class, this,
					RequirementsPackage.REQUIREMENT__HANDLING_DATA,
					DataObjectPackage.DATA__DEFINED_REQUIREMENT);
		}
		return handlingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getRealizedMethod() {
		if (realizedMethod != null && realizedMethod.eIsProxy()) {
			InternalEObject oldRealizedMethod = (InternalEObject) realizedMethod;
			realizedMethod = (Method) eResolveProxy(oldRealizedMethod);
			if (realizedMethod != oldRealizedMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RequirementsPackage.REQUIREMENT__REALIZED_METHOD,
							oldRealizedMethod, realizedMethod));
			}
		}
		return realizedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetRealizedMethod() {
		return realizedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedMethod(Method newRealizedMethod,
			NotificationChain msgs) {
		Method oldRealizedMethod = realizedMethod;
		realizedMethod = newRealizedMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RequirementsPackage.REQUIREMENT__REALIZED_METHOD,
					oldRealizedMethod, newRealizedMethod);
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
	public void setRealizedMethod(Method newRealizedMethod) {
		if (newRealizedMethod != realizedMethod) {
			NotificationChain msgs = null;
			if (realizedMethod != null)
				msgs = ((InternalEObject) realizedMethod).eInverseRemove(this,
						KnowledgePackage.METHOD__REALIZING_REQUIREMENT,
						Method.class, msgs);
			if (newRealizedMethod != null)
				msgs = ((InternalEObject) newRealizedMethod).eInverseAdd(this,
						KnowledgePackage.METHOD__REALIZING_REQUIREMENT,
						Method.class, msgs);
			msgs = basicSetRealizedMethod(newRealizedMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT__REALIZED_METHOD,
					newRealizedMethod, newRealizedMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvidedInterface() {
		if (providedInterface != null && providedInterface.eIsProxy()) {
			InternalEObject oldProvidedInterface = (InternalEObject) providedInterface;
			providedInterface = (Interface) eResolveProxy(oldProvidedInterface);
			if (providedInterface != oldProvidedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE,
							oldProvidedInterface, providedInterface));
			}
		}
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetProvidedInterface() {
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedInterface(
			Interface newProvidedInterface, NotificationChain msgs) {
		Interface oldProvidedInterface = providedInterface;
		providedInterface = newProvidedInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE,
					oldProvidedInterface, newProvidedInterface);
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
	public void setProvidedInterface(Interface newProvidedInterface) {
		if (newProvidedInterface != providedInterface) {
			NotificationChain msgs = null;
			if (providedInterface != null)
				msgs = ((InternalEObject) providedInterface)
						.eInverseRemove(
								this,
								RequirementsPackage.INTERFACE__DETAILS_OF_PROVIDING_FUNCTIONS_AND_PROPERTIES,
								Interface.class, msgs);
			if (newProvidedInterface != null)
				msgs = ((InternalEObject) newProvidedInterface)
						.eInverseAdd(
								this,
								RequirementsPackage.INTERFACE__DETAILS_OF_PROVIDING_FUNCTIONS_AND_PROPERTIES,
								Interface.class, msgs);
			msgs = basicSetProvidedInterface(newProvidedInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE,
					newProvidedInterface, newProvidedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequiredInterface() {
		if (requiredInterface != null && requiredInterface.eIsProxy()) {
			InternalEObject oldRequiredInterface = (InternalEObject) requiredInterface;
			requiredInterface = (Interface) eResolveProxy(oldRequiredInterface);
			if (requiredInterface != oldRequiredInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE,
							oldRequiredInterface, requiredInterface));
			}
		}
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetRequiredInterface() {
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredInterface(
			Interface newRequiredInterface, NotificationChain msgs) {
		Interface oldRequiredInterface = requiredInterface;
		requiredInterface = newRequiredInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE,
					oldRequiredInterface, newRequiredInterface);
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
	public void setRequiredInterface(Interface newRequiredInterface) {
		if (newRequiredInterface != requiredInterface) {
			NotificationChain msgs = null;
			if (requiredInterface != null)
				msgs = ((InternalEObject) requiredInterface)
						.eInverseRemove(
								this,
								RequirementsPackage.INTERFACE__DETAILS_OF_REQUIRING_FUNCTIONS_AND_PROPERTIES,
								Interface.class, msgs);
			if (newRequiredInterface != null)
				msgs = ((InternalEObject) newRequiredInterface)
						.eInverseAdd(
								this,
								RequirementsPackage.INTERFACE__DETAILS_OF_REQUIRING_FUNCTIONS_AND_PROPERTIES,
								Interface.class, msgs);
			msgs = basicSetRequiredInterface(newRequiredInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE,
					newRequiredInterface, newRequiredInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT__MANDATORY, oldMandatory,
					mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT__REFINEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefinements())
					.basicAdd(otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRefinedRequirement((Requirement) otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSpecifiedFeature((Feature) otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT__HANDLING_DATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHandlingData())
					.basicAdd(otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT__REALIZED_METHOD:
			if (realizedMethod != null)
				msgs = ((InternalEObject) realizedMethod).eInverseRemove(this,
						KnowledgePackage.METHOD__REALIZING_REQUIREMENT,
						Method.class, msgs);
			return basicSetRealizedMethod((Method) otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE:
			if (providedInterface != null)
				msgs = ((InternalEObject) providedInterface)
						.eInverseRemove(
								this,
								RequirementsPackage.INTERFACE__DETAILS_OF_PROVIDING_FUNCTIONS_AND_PROPERTIES,
								Interface.class, msgs);
			return basicSetProvidedInterface((Interface) otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE:
			if (requiredInterface != null)
				msgs = ((InternalEObject) requiredInterface)
						.eInverseRemove(
								this,
								RequirementsPackage.INTERFACE__DETAILS_OF_REQUIRING_FUNCTIONS_AND_PROPERTIES,
								Interface.class, msgs);
			return basicSetRequiredInterface((Interface) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT__REFINEMENTS:
			return ((InternalEList<?>) getRefinements()).basicRemove(otherEnd,
					msgs);
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			return basicSetRefinedRequirement(null, msgs);
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			return basicSetSpecifiedFeature(null, msgs);
		case RequirementsPackage.REQUIREMENT__HANDLING_DATA:
			return ((InternalEList<?>) getHandlingData()).basicRemove(otherEnd,
					msgs);
		case RequirementsPackage.REQUIREMENT__REALIZED_METHOD:
			return basicSetRealizedMethod(null, msgs);
		case RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE:
			return basicSetProvidedInterface(null, msgs);
		case RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE:
			return basicSetRequiredInterface(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			return eInternalContainer().eInverseRemove(this,
					RequirementsPackage.REQUIREMENT__REFINEMENTS,
					Requirement.class, msgs);
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			return eInternalContainer().eInverseRemove(this,
					RequirementsPackage.FEATURE__DETAILED_REQUIREMENTS,
					Feature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT__REFINEMENTS:
			return getRefinements();
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			if (resolve)
				return getRefinedRequirement();
			return basicGetRefinedRequirement();
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			if (resolve)
				return getSpecifiedFeature();
			return basicGetSpecifiedFeature();
		case RequirementsPackage.REQUIREMENT__HANDLING_DATA:
			return getHandlingData();
		case RequirementsPackage.REQUIREMENT__REALIZED_METHOD:
			if (resolve)
				return getRealizedMethod();
			return basicGetRealizedMethod();
		case RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE:
			if (resolve)
				return getProvidedInterface();
			return basicGetProvidedInterface();
		case RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE:
			if (resolve)
				return getRequiredInterface();
			return basicGetRequiredInterface();
		case RequirementsPackage.REQUIREMENT__MANDATORY:
			return isMandatory();
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
		case RequirementsPackage.REQUIREMENT__REFINEMENTS:
			getRefinements().clear();
			getRefinements().addAll(
					(Collection<? extends Requirement>) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			setRefinedRequirement((Requirement) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			setSpecifiedFeature((Feature) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__HANDLING_DATA:
			getHandlingData().clear();
			getHandlingData().addAll((Collection<? extends Data>) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REALIZED_METHOD:
			setRealizedMethod((Method) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE:
			setProvidedInterface((Interface) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE:
			setRequiredInterface((Interface) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__MANDATORY:
			setMandatory((Boolean) newValue);
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
		case RequirementsPackage.REQUIREMENT__REFINEMENTS:
			getRefinements().clear();
			return;
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			setRefinedRequirement((Requirement) null);
			return;
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			setSpecifiedFeature((Feature) null);
			return;
		case RequirementsPackage.REQUIREMENT__HANDLING_DATA:
			getHandlingData().clear();
			return;
		case RequirementsPackage.REQUIREMENT__REALIZED_METHOD:
			setRealizedMethod((Method) null);
			return;
		case RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE:
			setProvidedInterface((Interface) null);
			return;
		case RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE:
			setRequiredInterface((Interface) null);
			return;
		case RequirementsPackage.REQUIREMENT__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
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
		case RequirementsPackage.REQUIREMENT__REFINEMENTS:
			return refinements != null && !refinements.isEmpty();
		case RequirementsPackage.REQUIREMENT__REFINED_REQUIREMENT:
			return basicGetRefinedRequirement() != null;
		case RequirementsPackage.REQUIREMENT__SPECIFIED_FEATURE:
			return basicGetSpecifiedFeature() != null;
		case RequirementsPackage.REQUIREMENT__HANDLING_DATA:
			return handlingData != null && !handlingData.isEmpty();
		case RequirementsPackage.REQUIREMENT__REALIZED_METHOD:
			return realizedMethod != null;
		case RequirementsPackage.REQUIREMENT__PROVIDED_INTERFACE:
			return providedInterface != null;
		case RequirementsPackage.REQUIREMENT__REQUIRED_INTERFACE:
			return requiredInterface != null;
		case RequirementsPackage.REQUIREMENT__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
