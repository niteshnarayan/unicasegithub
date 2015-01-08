/**
 * <copyright> Copyright (c) 2009-2012 Chair of Applied Software Engineering, Technische Universit�t M�nchen (TUM).
 * All rights reserved. This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.unicase.ui.unicasecommon.meeditor.mecontrols.issuecontrol;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.emfstore.internal.client.model.CompositeOperationHandle;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.exceptions.InvalidHandleException;
import org.eclipse.emf.emfstore.internal.client.model.impl.ProjectSpaceImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.internal.client.model.util.WorkspaceUtil;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.unicase.model.UnicaseModelElement;
import org.unicase.model.change.ChangeFactory;
import org.unicase.model.change.MergingIssue;
import org.unicase.model.change.MergingProposal;
import org.unicase.model.change.MergingSolution;
import org.unicase.model.rationale.Proposal;
import org.unicase.model.rationale.RationaleFactory;
import org.unicase.model.rationale.Solution;

/**
 * Special widget for resolving MerginIssues.
 * 
 * @author wesendon
 */
public class MergingIssueResolutionControl extends MESingleLinkControl {

	/**
	 * Default constructor.
	 */
	public MergingIssueResolutionControl() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int canRender(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement) {
		if (!(modelElement instanceof MergingIssue)) {
			return DO_NOT_RENDER;
		}
		Object feature = itemPropertyDescriptor.getFeature(modelElement);
		if (feature instanceof EReference && !((EReference) feature).getName().equals("solution")) {
			return DO_NOT_RENDER;
		}

		return 3;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.unicase.ui.meeditor.mecontrols.melinkcontrol.MESingleLinkControl#initActions()
	 */
	@Override
	protected List<Action> initActions() {
		ArrayList<Action> result = new ArrayList<Action>();
		result.add(new CreateMergingSolutionAction((MergingIssue) getModelElement()));
		return result;
	}

	/**
	 * Action to resolve an issue.
	 * 
	 * @author koegel
	 */
	private final class CreateMergingSolutionAction extends Action {

		private AdapterFactoryLabelProvider provider;
		private final MergingIssue mergingIssue;

		public CreateMergingSolutionAction(MergingIssue modelElement) {
			this.mergingIssue = modelElement;
			provider = new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
			setImageDescriptor(ImageDescriptor.createFromImage(provider.getImage(modelElement)));
			setToolTipText("Set and create MergingSolution");
		}

		@Override
		public void run() {
			new EMFStoreCommand() {
				@Override
				protected void doRun() {
					solveIssue();
				}

			}.run();
		}

		private void check(EObject element) {
			if (element.eContainer() == null) {
				ModelUtil.getProject(mergingIssue).getModelElements().add(element);
			}
		}

		private void solveIssue() {
			// ElementListSelectionDialog selectionDialog = new ElementListSelectionDialog(PlatformUI.getWorkbench()
			// .getActiveWorkbenchWindow().getShell(), provider);
			// selectionDialog.setTitle("Select MergingSolution");
			// selectionDialog.setMessage("Please select a Proposal to create a Solution for this Issue."
			// + "\n If you select a MergingProposal, the underlying Operations are applied.");
			// selectionDialog.setElements(mergingIssue.getProposals().toArray(
			// new Proposal[mergingIssue.getProposals().size()]));

			// selectionDialog.setBlockOnOpen(true);
			// if (!(selectionDialog.open() == Window.OK)) {
			// return;
			// }
			// Object result = selectionDialog.getFirstResult();

			SolutionSelectionDialog selectionDialog = new SolutionSelectionDialog(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell());

			selectionDialog.setTitle("Select MergingSolution");
			selectionDialog.setDescription("Please select a proposal to create a solution for this issue."
				+ "\n If you select a MergingProposal the underlying change operations are applied.");

			selectionDialog.setElements(mergingIssue.getProposals().toArray(
				new Proposal[mergingIssue.getProposals().size()]));

			if (selectionDialog.open() != Window.OK) {
				return;
			}

			UnicaseModelElement result = selectionDialog.getSolution();

			if (result instanceof MergingProposal) {

				MessageDialog.openConfirm(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Merging Solution", "You have selected a merging solution with attached change operations."
						+ " If you continue, these operations will be executed.");

				ProjectSpace projectSpace = WorkspaceManager.getProjectSpace(mergingIssue);
				if (projectSpace != null) {
					CompositeOperationHandle compositeOperation = projectSpace.beginCompositeOperation();
					MergingProposal proposal = (MergingProposal) result;
					MergingSolution solution = ChangeFactory.eINSTANCE.createMergingSolution();
					ModelUtil.getProject(proposal).addModelElement(solution);
					mergingIssue.setSolution(solution);
					solution.getUnderlyingProposals().add(proposal);
					solution.setDescription(proposal.getDescription());
					check(solution);
					((ProjectSpaceImpl) projectSpace).applyOperationsWithRecording(proposal.getPendingOperations(),
						true);
					try {
						compositeOperation.end("Created Solution for MergeIssue", "A Solution for the MergingIssue \""
							+ mergingIssue.getName() + "\" was created.", ModelUtil.getProject(mergingIssue)
							.getModelElementId(mergingIssue));
					} catch (InvalidHandleException e) {
						WorkspaceUtil.log("Couldn't create MergingSolution", e, IStatus.ERROR);
					}
				}
			} else if (result instanceof Proposal) {
				Solution solution = RationaleFactory.eINSTANCE.createSolution();
				mergingIssue.setSolution(solution);
				solution.getUnderlyingProposals().add((Proposal) result);
				check(solution);
			}
		}
	}
}
