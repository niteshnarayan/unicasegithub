/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.unicase.model.diagram.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.unicase.model.diagram.util.DiagramAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DiagramItemProviderAdapterFactory extends DiagramAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.unicase.model.diagram.ClassDiagram} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassDiagramItemProvider classDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.unicase.model.diagram.ClassDiagram}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassDiagramAdapter() {
		if (classDiagramItemProvider == null) {
			classDiagramItemProvider = new ClassDiagramItemProvider(this);
		}

		return classDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.unicase.model.diagram.UseCaseDiagram} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UseCaseDiagramItemProvider useCaseDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.unicase.model.diagram.UseCaseDiagram}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseCaseDiagramAdapter() {
		if (useCaseDiagramItemProvider == null) {
			useCaseDiagramItemProvider = new UseCaseDiagramItemProvider(this);
		}

		return useCaseDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.unicase.model.diagram.ComponentDiagram} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDiagramItemProvider componentDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.unicase.model.diagram.ComponentDiagram}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentDiagramAdapter() {
		if (componentDiagramItemProvider == null) {
			componentDiagramItemProvider = new ComponentDiagramItemProvider(this);
		}

		return componentDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.unicase.model.diagram.StateDiagram} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StateDiagramItemProvider stateDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.unicase.model.diagram.StateDiagram}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateDiagramAdapter() {
		if (stateDiagramItemProvider == null) {
			stateDiagramItemProvider = new StateDiagramItemProvider(this);
		}

		return stateDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.unicase.model.diagram.ActivityDiagram} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramItemProvider activityDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.unicase.model.diagram.ActivityDiagram}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityDiagramAdapter() {
		if (activityDiagramItemProvider == null) {
			activityDiagramItemProvider = new ActivityDiagramItemProvider(this);
		}

		return activityDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.unicase.model.diagram.WorkItemDiagram} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkItemDiagramItemProvider workItemDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.unicase.model.diagram.WorkItemDiagram}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkItemDiagramAdapter() {
		if (workItemDiagramItemProvider == null) {
			workItemDiagramItemProvider = new WorkItemDiagramItemProvider(this);
		}

		return workItemDiagramItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (classDiagramItemProvider != null)
			classDiagramItemProvider.dispose();
		if (useCaseDiagramItemProvider != null)
			useCaseDiagramItemProvider.dispose();
		if (componentDiagramItemProvider != null)
			componentDiagramItemProvider.dispose();
		if (stateDiagramItemProvider != null)
			stateDiagramItemProvider.dispose();
		if (activityDiagramItemProvider != null)
			activityDiagramItemProvider.dispose();
		if (workItemDiagramItemProvider != null)
			workItemDiagramItemProvider.dispose();
	}

}
