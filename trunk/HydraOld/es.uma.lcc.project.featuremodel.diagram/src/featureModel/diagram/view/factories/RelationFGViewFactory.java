package featureModel.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelationFGViewFactory extends ConnectionViewFactory {

	/**
	 * @generated
	 */
	protected List<Style> createStyles(View view) {
		List<Style> styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createConnectorStyle());
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		return styles;
	}

	/**
	 * @generated NOT
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = featureModel.diagram.part.FeaturemodelVisualIDRegistry
					.getType(featureModel.diagram.edit.parts.RelationFGEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		LineStyle lstyle = (LineStyle) view.getStyle(NotationPackage.eINSTANCE
				.getLineStyle());
		lstyle.setLineColor(ColorConstants.black.hashCode());
	}
}
