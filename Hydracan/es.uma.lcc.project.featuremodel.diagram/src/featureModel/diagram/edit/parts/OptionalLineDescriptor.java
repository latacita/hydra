package featureModel.diagram.edit.parts;

import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * @generated
 */
public class OptionalLineDescriptor extends PolylineConnectionEx implements ILineDescriptor{

	/**
	 * @generated
	 */
	public OptionalLineDescriptor() {
		this.setFill(false);

		setTargetDecoration(createTargetDecoration());
	}

	/**
	 * @generated NOT
	 */
	public RotatableDecoration createTargetDecoration() {
		featureModel.diagram.edit.parts.CircleDecoration df = new featureModel.diagram.edit.parts.CircleDecoration();
		df.setBounds(new Rectangle(0, 0, 11, 11));
		return df;
	}

}