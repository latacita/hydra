package specializationModel.diagram.edit.parts;

import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.GroupRequestViaKeyboard;

public class PreventDeleteComponentEditPolicy extends ComponentEditPolicy
{
	@Override
	public Command getCommand(Request request)
	{
		// If the user presses the delete key, don't delete
		if (request instanceof GroupRequestViaKeyboard && RequestConstants.REQ_DELETE.equals(request.getType())){
			return UnexecutableCommand.INSTANCE;
		}

		return super.getCommand(request);
	}
}
