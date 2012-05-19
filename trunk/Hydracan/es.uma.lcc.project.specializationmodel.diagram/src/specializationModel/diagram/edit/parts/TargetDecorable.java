package specializationModel.diagram.edit.parts;

import org.eclipse.draw2d.RotatableDecoration;

public interface TargetDecorable {

	public abstract void setTargetDecoration(RotatableDecoration decoration);
	
	public ILineDescriptor getLineDescriptor();
	
}