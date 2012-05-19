package featureModel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class FeaturemodelCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected featureModel.diagram.part.FeaturemodelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected featureModel.diagram.part.FeaturemodelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(featureModel.diagram.part.Messages.FeaturemodelCreationWizardTitle);
		setDefaultPageImageDescriptor(featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewFeatureModelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new featureModel.diagram.part.FeaturemodelCreationWizardPage(
				"DiagramModelFile", getSelection(), "hydra_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(featureModel.diagram.part.Messages.FeaturemodelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(featureModel.diagram.part.Messages.FeaturemodelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new featureModel.diagram.part.FeaturemodelCreationWizardPage(
				"DomainModelFile", getSelection(), "hydra") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".hydra_diagram".length()); //$NON-NLS-1$
					setFileName(featureModel.diagram.part.FeaturemodelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "hydra")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(featureModel.diagram.part.Messages.FeaturemodelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(featureModel.diagram.part.Messages.FeaturemodelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {

		// y por aqu� me interesar�a poder obtenerlo tambien

		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

				String fileName = diagramModelFilePage.getFileName();
				fileName = fileName.substring(0, fileName.length()
						- ".hydra_diagram".length()); //$NON-NLS-1$

				String configFile = featureModel.diagram.part.FeaturemodelDiagramEditorUtil
						.getUniqueFileName(domainModelFilePage
								.getContainerFullPath(), fileName, "xml");

				String constraintFile = featureModel.diagram.part.FeaturemodelDiagramEditorUtil
						.getUniqueFileName(domainModelFilePage
								.getContainerFullPath(), fileName, "exp");

				diagram = featureModel.diagram.part.FeaturemodelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor,
								configFile, constraintFile);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						featureModel.diagram.part.FeaturemodelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										featureModel.diagram.part.Messages.FeaturemodelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};

		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								featureModel.diagram.part.Messages.FeaturemodelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}

		return diagram != null;
	}
}
