package featureModel.diagram.edit.parts;

import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class SimpleLineDescriptor extends PolylineConnectionEx implements ILineDescriptor{

	/**
	 * @generated
	 */
	private WrappingLabel fFigureSimpleLabelFigure;

	/**
	 * @generated
	 */
	public SimpleLineDescriptor() {
		createContents();
		
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureSimpleLabelFigure = new WrappingLabel();
		fFigureSimpleLabelFigure.setText("");

		this.add(fFigureSimpleLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureSimpleLabelFigure() {
		return fFigureSimpleLabelFigure;
	}

	@Override
	public RotatableDecoration createTargetDecoration() {
		// TODO Auto-generated method stub
		return null;
	}

}