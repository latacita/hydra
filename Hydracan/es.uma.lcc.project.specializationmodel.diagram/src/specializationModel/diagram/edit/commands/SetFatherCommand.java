package specializationModel.diagram.edit.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SetFatherCommand extends SetCommand{

	public SetFatherCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		super(domain, owner, feature, value);
		// TODO Auto-generated constructor stub
	}
	
	public void doExecute(){
//		Feature feature = (Feature)ow
	}

}
