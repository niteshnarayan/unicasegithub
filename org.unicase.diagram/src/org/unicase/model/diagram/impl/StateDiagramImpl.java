/**
 * <copyright> Copyright (c) 2009-2012 Chair of Applied Software Engineering, Technische Universit�t M�nchen (TUM).
 * All rights reserved. This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.unicase.model.diagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.unicase.model.diagram.DiagramPackage;
import org.unicase.model.diagram.StateDiagram;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>State Diagram</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StateDiagramImpl extends MEDiagramImpl implements StateDiagram {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StateDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.STATE_DIAGRAM;
	}

	@Override
	public String getType() {
		return "State";
	}

} // StateDiagramImpl
