package scrm.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import scrm.SCRMDiagram;
import scrm.diagram.edit.policies.Feature2ItemSemanticEditPolicy;
import scrm.diagram.edit.policies.OpenMEEditorPolicy;
import scrm.diagram.part.ScrmVisualIDRegistry;
import scrm.diagram.providers.ScrmElementTypes;

/**
 * @generated
 */
public class Feature2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3009;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Feature2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Feature2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenMEEditorPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that
		// would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new FeatureFigure();
	}

	/**
	 * @generated
	 */
	public FeatureFigure getPrimaryShape() {
		return (FeatureFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FeatureName2EditPart) {
			((FeatureName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureFeature_name());
			return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FeatureName2EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated NOT: adjusted size
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(120, 20);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ScrmVisualIDRegistry
				.getType(FeatureName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getMARelTypesOnSource() {
		SCRMDiagram scrmDiagram = (SCRMDiagram) getDiagramView().getElement();
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		switch (scrmDiagram.getDiagramType()) {
		case DEFAULT_DIAGRAM:
		case REQUIREMENTS_DIAGRAM:
			types.add(ScrmElementTypes.FeatureSuperFeature_4053);
			types.add(ScrmElementTypes.FeatureDependencies_4026);
			types.add(ScrmElementTypes.FeatureRequiredInterfaces_4023);
			types.add(ScrmElementTypes.FeatureProvidedInterfaces_4024);
			types.add(ScrmElementTypes.FeatureRequiredFeatures_4030);
			types.add(ScrmElementTypes.FeatureExcludedFeatures_4032);
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		SCRMDiagram scrmDiagram = (SCRMDiagram) getDiagramView().getElement();
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		switch (scrmDiagram.getDiagramType()) {
		case DEFAULT_DIAGRAM:
		case REQUIREMENTS_DIAGRAM:
			if (targetEditPart instanceof FeatureEditPart) {
				types.add(ScrmElementTypes.FeatureSuperFeature_4053);
			}
			if (targetEditPart instanceof Feature2EditPart) {
				types.add(ScrmElementTypes.FeatureSuperFeature_4053);
			}
			if (targetEditPart instanceof HardwareEditPart) {
				types.add(ScrmElementTypes.FeatureDependencies_4026);
			}
			if (targetEditPart instanceof Hardware2EditPart) {
				types.add(ScrmElementTypes.FeatureDependencies_4026);
			}
			if (targetEditPart instanceof UserInterfaceEditPart) {
				types.add(ScrmElementTypes.FeatureRequiredInterfaces_4023);
			}
			if (targetEditPart instanceof SoftwareInterfaceEditPart) {
				types.add(ScrmElementTypes.FeatureRequiredInterfaces_4023);
			}
			if (targetEditPart instanceof UserInterface2EditPart) {
				types.add(ScrmElementTypes.FeatureRequiredInterfaces_4023);
			}
			if (targetEditPart instanceof SoftwareInterface2EditPart) {
				types.add(ScrmElementTypes.FeatureRequiredInterfaces_4023);
			}
			if (targetEditPart instanceof UserInterfaceEditPart) {
				types.add(ScrmElementTypes.FeatureProvidedInterfaces_4024);
			}
			if (targetEditPart instanceof SoftwareInterfaceEditPart) {
				types.add(ScrmElementTypes.FeatureProvidedInterfaces_4024);
			}
			if (targetEditPart instanceof UserInterface2EditPart) {
				types.add(ScrmElementTypes.FeatureProvidedInterfaces_4024);
			}
			if (targetEditPart instanceof SoftwareInterface2EditPart) {
				types.add(ScrmElementTypes.FeatureProvidedInterfaces_4024);
			}
			if (targetEditPart instanceof FeatureEditPart) {
				types.add(ScrmElementTypes.FeatureRequiredFeatures_4030);
			}
			if (targetEditPart instanceof Feature2EditPart) {
				types.add(ScrmElementTypes.FeatureRequiredFeatures_4030);
			}
			if (targetEditPart instanceof FeatureEditPart) {
				types.add(ScrmElementTypes.FeatureExcludedFeatures_4032);
			}
			if (targetEditPart instanceof Feature2EditPart) {
				types.add(ScrmElementTypes.FeatureExcludedFeatures_4032);
			}
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		SCRMDiagram scrmDiagram = (SCRMDiagram) getDiagramView().getElement();
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		switch (scrmDiagram.getDiagramType()) {
		case DEFAULT_DIAGRAM:
		case REQUIREMENTS_DIAGRAM:
			if (relationshipType == ScrmElementTypes.FeatureSuperFeature_4053) {
				types.add(ScrmElementTypes.Feature_2009);
				types.add(ScrmElementTypes.Feature_3009);
			} else if (relationshipType == ScrmElementTypes.FeatureDependencies_4026) {
				types.add(ScrmElementTypes.Hardware_2010);
				types.add(ScrmElementTypes.Hardware_3010);
			} else if (relationshipType == ScrmElementTypes.FeatureRequiredInterfaces_4023) {
				types.add(ScrmElementTypes.UserInterface_2012);
				types.add(ScrmElementTypes.SoftwareInterface_2013);
				types.add(ScrmElementTypes.UserInterface_3014);
				types.add(ScrmElementTypes.SoftwareInterface_3013);
			} else if (relationshipType == ScrmElementTypes.FeatureProvidedInterfaces_4024) {
				types.add(ScrmElementTypes.UserInterface_2012);
				types.add(ScrmElementTypes.SoftwareInterface_2013);
				types.add(ScrmElementTypes.UserInterface_3014);
				types.add(ScrmElementTypes.SoftwareInterface_3013);
			} else if (relationshipType == ScrmElementTypes.FeatureRequiredFeatures_4030) {
				types.add(ScrmElementTypes.Feature_2009);
				types.add(ScrmElementTypes.Feature_3009);
			} else if (relationshipType == ScrmElementTypes.FeatureExcludedFeatures_4032) {
				types.add(ScrmElementTypes.Feature_2009);
				types.add(ScrmElementTypes.Feature_3009);
			}
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		SCRMDiagram scrmDiagram = (SCRMDiagram) getDiagramView().getElement();
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		switch (scrmDiagram.getDiagramType()) {
		case DEFAULT_DIAGRAM:
			types.add(ScrmElementTypes.ScientificProblemInfluencedFeature_4008);
		case REQUIREMENTS_DIAGRAM:
			types.add(ScrmElementTypes.RequirementSpecifiedFeature_4052);
			types.add(ScrmElementTypes.FeatureSuperFeature_4053);
			types.add(ScrmElementTypes.FeatureRequiredFeatures_4030);
			types.add(ScrmElementTypes.FeatureExcludedFeatures_4032);
			types.add(ScrmElementTypes.ConstraintRestrictedFeature_4051);
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		SCRMDiagram scrmDiagram = (SCRMDiagram) getDiagramView().getElement();
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		switch (scrmDiagram.getDiagramType()) {
		case DEFAULT_DIAGRAM:
			if (relationshipType == ScrmElementTypes.ScientificProblemInfluencedFeature_4008) {
				types.add(ScrmElementTypes.ScientificProblem_2007);
				types.add(ScrmElementTypes.ScientificProblem_3001);
			}
		case REQUIREMENTS_DIAGRAM:
			if (relationshipType == ScrmElementTypes.RequirementSpecifiedFeature_4052) {
				types.add(ScrmElementTypes.Requirement_2034);
				types.add(ScrmElementTypes.Performance_2015);
				types.add(ScrmElementTypes.Process_2035);
				types.add(ScrmElementTypes.InputDataReading_2036);
				types.add(ScrmElementTypes.ResultsOutput_2038);
				types.add(ScrmElementTypes.ErrorHandling_2039);
				types.add(ScrmElementTypes.StatusMonitoring_2040);
				types.add(ScrmElementTypes.Solver_2048);
				types.add(ScrmElementTypes.MeshCreation_2049);
				types.add(ScrmElementTypes.PreProcessing_2050);
				types.add(ScrmElementTypes.PostProcessing_2051);
				types.add(ScrmElementTypes.DataProcessSpace_2046);
				types.add(ScrmElementTypes.Requirement_3012);
				types.add(ScrmElementTypes.Performance_3011);
				types.add(ScrmElementTypes.Process_3025);
				types.add(ScrmElementTypes.InputDataReading_3026);
				types.add(ScrmElementTypes.ResultsOutput_3024);
				types.add(ScrmElementTypes.ErrorHandling_3027);
				types.add(ScrmElementTypes.StatusMonitoring_3023);
				types.add(ScrmElementTypes.Solver_3031);
				types.add(ScrmElementTypes.MeshCreation_3032);
				types.add(ScrmElementTypes.PreProcessing_3033);
				types.add(ScrmElementTypes.PostProcessing_3034);
				types.add(ScrmElementTypes.DataProcessSpace_3029);
			} else if (relationshipType == ScrmElementTypes.FeatureSuperFeature_4053) {
				types.add(ScrmElementTypes.Feature_2009);
				types.add(ScrmElementTypes.Feature_3009);
			} else if (relationshipType == ScrmElementTypes.FeatureRequiredFeatures_4030) {
				types.add(ScrmElementTypes.Feature_2009);
				types.add(ScrmElementTypes.Feature_3009);
			} else if (relationshipType == ScrmElementTypes.FeatureExcludedFeatures_4032) {
				types.add(ScrmElementTypes.Feature_2009);
				types.add(ScrmElementTypes.Feature_3009);
			} else if (relationshipType == ScrmElementTypes.ConstraintRestrictedFeature_4051) {
				types.add(ScrmElementTypes.Constraint_2011);
				types.add(ScrmElementTypes.Constraint_3006);
			}
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	public class FeatureFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeature_name;

		/**
		 * @generated NOT: adjusted size
		 */
		public FeatureFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(32),
					getMapMode().DPtoLP(32)));
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(20)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureFeature_name = new WrappingLabel();
			fFigureFeature_name.setText("");

			fFigureFeature_name.setFont(FFIGUREFEATURE_NAME_FONT);

			GridData constraintFFigureFeature_name = new GridData();
			constraintFFigureFeature_name.verticalAlignment = GridData.BEGINNING;
			constraintFFigureFeature_name.horizontalAlignment = GridData.CENTER;
			constraintFFigureFeature_name.horizontalIndent = 0;
			constraintFFigureFeature_name.horizontalSpan = 1;
			constraintFFigureFeature_name.verticalSpan = 1;
			constraintFFigureFeature_name.grabExcessHorizontalSpace = false;
			constraintFFigureFeature_name.grabExcessVerticalSpace = false;
			this.add(fFigureFeature_name, constraintFFigureFeature_name);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeature_name() {
			return fFigureFeature_name;
		}

	}

	/**
	 * @generated NOT: adjusted color
	 */
	static final Color THIS_BACK = new Color(null, 168, 255, 152);

	/**
	 * @generated
	 */
	static final Font FFIGUREFEATURE_NAME_FONT = new Font(Display.getCurrent(),
			"Arial", 9, SWT.BOLD);

}
