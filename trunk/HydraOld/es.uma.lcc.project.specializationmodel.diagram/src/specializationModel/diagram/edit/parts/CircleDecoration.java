package specializationModel.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

public class CircleDecoration extends Ellipse implements RotatableDecoration {

	public void setLocation(Point p) {
		Dimension delta = getPreferredSize().getScaled(0.5).getNegated();
		super.setLocation(p.getTranslated(delta));
	}

	public void setReferencePoint(Point p) {
	}
}
