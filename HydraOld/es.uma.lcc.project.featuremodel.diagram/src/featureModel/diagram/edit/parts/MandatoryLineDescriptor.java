package featureModel.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * @generated
 */
public class MandatoryLineDescriptor extends PolylineConnectionEx implements ILineDescriptor{

	/**
	 * @generated
	 */
	public MandatoryLineDescriptor() {

		setTargetDecoration(createTargetDecoration());
	}

	/**
	 * @generated NOT
	 */
	public RotatableDecoration createTargetDecoration() {
		featureModel.diagram.edit.parts.CircleDecoration df = new featureModel.diagram.edit.parts.CircleDecoration();
		df.setBounds(new Rectangle(0, 0, 11, 11));
		df.setBackgroundColor(ColorConstants.black);

		return df;
	}

}