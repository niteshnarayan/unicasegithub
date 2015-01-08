package org.unicase.ui.diagram.orgchartdiagram.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.unicase.model.organization.OrgUnit;
import org.unicase.workspace.util.UnicaseCommand;

public class OrgUnitDirectEditingFeature extends AbstractDirectEditingFeature {

	public OrgUnitDirectEditingFeature(IFeatureProvider fp) {
		super(fp);
	}

	public int getEditingType() {
		// there are several possible editor-types supported:
		// text-field, checkbox, color-chooser, combobox, ...
		return TYPE_TEXT;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();

		// support direct editing, if it is a EClass, and the user clicked
		// directly on the text and not somewhere else in the rectangle
		if (bo instanceof OrgUnit && ga instanceof Text) {
			return true;
		}

		// direct editing not supported in all other cases
		return false;
	}

	public String getInitialValue(IDirectEditingContext context) {
		// return the current name of the EClass
		PictogramElement pe = context.getPictogramElement();
		OrgUnit orgUnit = (OrgUnit) getBusinessObjectForPictogramElement(pe);
		return orgUnit.getName();

	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value.length() < 1)
			return "Please enter any text as orgunit name.";
		if (value.contains("\n"))
			return "Line breakes are not allowed in orgunit names.";
		// null means, that the value is valid
		return null;
	}

	public void setValue(final String value, IDirectEditingContext context) {
		// set the new name for the MOF class
		PictogramElement pe = context.getPictogramElement();
		final OrgUnit orgUnit = (OrgUnit) getBusinessObjectForPictogramElement(pe);
		new UnicaseCommand() {
			@Override
			protected void doRun() {
				orgUnit.setName(value);
			}
		}.run();
		// Explicitly update the shape to display the new value in the diagram
		// Note, that this might not be necessary in future versions of Graphiti
		// (currently in discussion)
		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the EClass
		updatePictogramElement(((Shape) pe).getContainer());
	}

}
