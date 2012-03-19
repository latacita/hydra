package specializationModel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import specializationModel.Feature;
import specializationModel.FeatureGroup;
import specializationModel.Node;
import specializationModel.SpecializationModelPackage;

/**
 * @generated
 */
public class RelationFGCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private specializationModel.Project container;

	/**
	 * @generated
	 */
	public RelationFGCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(specializationModel.SpecializationModelPackage.eINSTANCE
					.getProject_Relations());
		}

		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof specializationModel.Project) {
				container = (specializationModel.Project) element;
				super.setElementToEdit(container);
				break;
			}
		}
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& false == source instanceof specializationModel.Node) {
			return false;
		}
		if (target != null
				&& false == target instanceof specializationModel.Node) {
			return false;
		}
		if (target != null && target instanceof specializationModel.Node
				&& ((specializationModel.Node) target).getFather() != null) {
			return false;
		}
		if (target != null
				&& source != null
				&& (((target instanceof specializationModel.Feature) == (source instanceof specializationModel.Feature)) || ((target instanceof specializationModel.FeatureGroup) == (source instanceof specializationModel.FeatureGroup)))) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return specializationModel.diagram.edit.policies.SpecializationmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateRelationFG_4001(getContainer(), getSource(),
						getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		specializationModel.RelationFG newElement = specializationModel.SpecializationModelFactory.eINSTANCE
				.createRelationFG();
		getContainer().getRelations().add(newElement);
		newElement.setSource(getSource());
		newElement.setTarget(getTarget());
		return newElement;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return specializationModel.SpecializationModelPackage.eINSTANCE
				.getProject();
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		//		getTarget().setFather(getSource());

		EditingDomain editingDomain = getEditingDomain();
		EReference featureType = SpecializationModelPackage.eINSTANCE
				.getNode_Father();
		Object newType = getSource();
		Node thisObject = getTarget();
		//		Feature thisObject = null;
		SetCommand.create(editingDomain, thisObject, featureType, newType)
				.execute();

		featureType = SpecializationModelPackage.eINSTANCE
				.getFeatureGroup_Children();
		thisObject = getSource();

		if (thisObject instanceof Feature) {
			EList<Node> nodeList = ((Feature) getSource()).getChildren();
			if (nodeList == null)
				nodeList = new BasicEList<Node>();
			nodeList.add(getTarget());
			SetCommand.create(editingDomain, thisObject, featureType, nodeList);
		} else {
			EList<Feature> nodeList = ((FeatureGroup) getSource())
					.getChildren();
			if (nodeList == null)
				nodeList = new BasicEList<Feature>();
			nodeList.add((Feature) getTarget());
			SetCommand.create(editingDomain, thisObject, featureType, nodeList);
		}

		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected specializationModel.Node getSource() {
		return (specializationModel.Node) source;
	}

	/**
	 * @generated
	 */
	protected specializationModel.Node getTarget() {
		return (specializationModel.Node) target;
	}

	/**
	 * @generated
	 */
	public specializationModel.Project getContainer() {
		return container;
	}
}
