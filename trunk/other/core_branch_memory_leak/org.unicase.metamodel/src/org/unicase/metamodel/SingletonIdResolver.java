/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.unicase.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for mapping {@link ModelElementId}s to singleton objects and vice versa.
 * 
 * @author emueller
 */
public interface SingletonIdResolver {

	/**
	 * Returns the ID for the given singleton {@link EObject}.
	 * 
	 * @param singleton the singleton {@link EObject} whose {@link ModelElementId} should get retrieved
	 * @return the {@link ModelElementId} of the the singleton object
	 */
	ModelElementId getSingletonModelElementId(EObject singleton);

	/**
	 * Returns the singleton which belongs to the given {@link ModelElementId}.
	 * 
	 * @param singletonId a {@link ModelElementId}
	 * @return the singleton {@link EObject} that belongs to the given {@link ModelElementId}
	 */
	EObject getSingleton(ModelElementId singletonId);
}
