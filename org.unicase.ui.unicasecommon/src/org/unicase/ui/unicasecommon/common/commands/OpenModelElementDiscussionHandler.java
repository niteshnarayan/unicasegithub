/**
 * <copyright> Copyright (c) 2009-2012 Chair of Applied Software Engineering, Technische Universit�t M�nchen (TUM).
 * All rights reserved. This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.unicase.ui.unicasecommon.common.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.editor.e3.AbstractMEEditorPage;
import org.eclipse.emf.ecp.editor.e3.MEEditorInput;
import org.eclipse.emf.ecp.editor.internal.e3.MEEditor;
import org.eclipse.emf.ecp.explorereditorbridge.internal.EditorContext;
import org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.handlers.HandlerUtil;
import org.unicase.model.UnicaseModelElement;
import org.unicase.ui.unicasecommon.meeditor.METhreadPage;

/**
 * This handler is to be executed indirectly using
 * IHandlerService.executeCommand() method. The Command itself does not have any
 * UI representation.
 * 
 * @author Shterev
 */
public class OpenModelElementDiscussionHandler extends AbstractHandler {

	private static final String ME_TO_OPEN_EVALUATIONCONTEXT_VARIABLE = "meToOpen";

	private static final String TOGGLE_ADD_COMMENT_VARIABLE = "toggleAddComment";

	/**
	 * {@inheritDoc}
	 */

	public Object execute(ExecutionEvent event) throws ExecutionException {

		// We get the required model element Through activeModelelemet
		// variable.
		// This variable is already set, in the method which calls to execute
		// this command.
		Object o = HandlerUtil.getVariableChecked(event,
				ME_TO_OPEN_EVALUATIONCONTEXT_VARIABLE);

		Object toggle = null;
		try {
			toggle = HandlerUtil.getVariableChecked(event,
					TOGGLE_ADD_COMMENT_VARIABLE);
		} catch (ExecutionException e) {
			// if not set
		}
		EObject me = (EObject) o;

		if (o == null) {
			return null;
		}

		try {
			MEEditorInput input = new MEEditorInput(new EditorContext(me,
					(ECPProject) ESWorkspaceProviderImpl.getInstance()
							.getWorkspace().getLocalProject(me)));
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(input, "org.eclipse.emf.ecp.editor", true);

			IEditorPart activeEditor = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor();
			if (activeEditor instanceof MEEditor) {
				MEEditor meEditor = (MEEditor) activeEditor;
				meEditor.setActivePage("org.unicase.ui.unicasecommon.meeditor.methreadpage");
				boolean shouldToggle = (toggle != null && toggle
						.equals("toggle"))
						|| ((UnicaseModelElement) me).getComments().isEmpty();
				if (meEditor.getActivePageInstance() instanceof AbstractMEEditorPage) {
					AbstractMEEditorPage page = (AbstractMEEditorPage) meEditor
							.getActivePageInstance();
					if (((IFormPage) page)
							.getId()
							.equals("org.unicase.ui.unicasecommon.meeditor.methreadpage")
							&& shouldToggle) {
						((METhreadPage) page).addComment();
					}
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		return null;
	}
}
