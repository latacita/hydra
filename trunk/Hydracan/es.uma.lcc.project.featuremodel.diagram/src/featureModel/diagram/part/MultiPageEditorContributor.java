package featureModel.diagram.part;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IDEActionFactory;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

import specializationModel.diagram.part.SpecializationmodelDiagramEditor;

import featureModel.diagram.actions.ChocoValidatorAction;
import featureModel.diagram.actions.DeleteConfigurationAction;
import featureModel.diagram.actions.OptimiceConfigurationAction;
import featureModel.diagram.actions.SpecializeAction;
import featureModel.diagram.actions.ValidateNamesAction;

/**
 * Manages the installation/deinstallation of global actions for multi-page editors.
 * Responsible for the redirection of global actions to the active editor.
 * Multi-page contributor replaces the contributors for the individual editors in the multi-page editor.
 */
public class MultiPageEditorContributor extends MultiPageEditorActionBarContributor {
	private IEditorPart activeEditorPart;
	private Action sampleAction, validateNamesAction, chocoAction, eliminateAction, optimiceAction, optimiceActionWithFile;
	/**
	 * Creates a multi-page contributor.
	 */
	public MultiPageEditorContributor() {
		super();
		createActions();
	}
	/**
	 * Returns the action registed with the given text editor.
	 * @return IAction or null if editor is null.
	 */
	protected IAction getAction(ITextEditor editor, String actionID) {
		return (editor == null ? null : editor.getAction(actionID));
	}
	/* (non-JavaDoc)
	 * Method declared in AbstractMultiPageEditorActionBarContributor.
	 */
	
	public boolean isFeatureModelEditor(){
		return activeEditorPart instanceof FeaturemodelDiagramEditor;
	}
	
	public boolean isSpecializationModelEditor(){
		return activeEditorPart instanceof SpecializationmodelDiagramEditor;
	}
	
	public void setActivePage(IEditorPart part) {
		if (activeEditorPart == part)
			return;

		activeEditorPart = part;

		IActionBars actionBars = getActionBars();
		if (actionBars != null) {

			ITextEditor editor = (part instanceof ITextEditor) ? (ITextEditor) part : null;

			actionBars.setGlobalActionHandler(
				ActionFactory.DELETE.getId(),
				getAction(editor, ITextEditorActionConstants.DELETE));
			actionBars.setGlobalActionHandler(
				ActionFactory.UNDO.getId(),
				getAction(editor, ITextEditorActionConstants.UNDO));
			actionBars.setGlobalActionHandler(
				ActionFactory.REDO.getId(),
				getAction(editor, ITextEditorActionConstants.REDO));
			actionBars.setGlobalActionHandler(
				ActionFactory.CUT.getId(),
				getAction(editor, ITextEditorActionConstants.CUT));
			actionBars.setGlobalActionHandler(
				ActionFactory.COPY.getId(),
				getAction(editor, ITextEditorActionConstants.COPY));
			actionBars.setGlobalActionHandler(
				ActionFactory.PASTE.getId(),
				getAction(editor, ITextEditorActionConstants.PASTE));
			actionBars.setGlobalActionHandler(
				ActionFactory.SELECT_ALL.getId(),
				getAction(editor, ITextEditorActionConstants.SELECT_ALL));
			actionBars.setGlobalActionHandler(
				ActionFactory.FIND.getId(),
				getAction(editor, ITextEditorActionConstants.FIND));
			actionBars.setGlobalActionHandler(
				IDEActionFactory.BOOKMARK.getId(),
				getAction(editor, IDEActionFactory.BOOKMARK.getId()));
			actionBars.updateActionBars();
		}
	}
	
	private void createActions() {
		URL url1 = FileLocator.find(FeaturemodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/specialize.png"), null); //$NON-NLS-1$
		ImageDescriptor imageDescriptorSpecialize = ImageDescriptor.createFromURL(url1);
		sampleAction = new SpecializeAction(this);
		sampleAction.setText("Specialize this model");
		sampleAction.setToolTipText("Create a specialization model");
		sampleAction.setImageDescriptor(imageDescriptorSpecialize);
		
		URL url4 = FileLocator.find(FeaturemodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/choco.png"), null); //$NON-NLS-1$
		ImageDescriptor imageDescriptorSpecialize4 = ImageDescriptor.createFromURL(url4);
		chocoAction = new ChocoValidatorAction(this);
		chocoAction.setText("Check constraints");
		chocoAction.setToolTipText("Check constraints");
		chocoAction.setImageDescriptor(imageDescriptorSpecialize4);
		
		URL url3 = FileLocator.find(FeaturemodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/check2.png"), null); //$NON-NLS-1$
		ImageDescriptor imageDescriptorSpecialize3 = ImageDescriptor.createFromURL(url3);
		validateNamesAction = new ValidateNamesAction(this);
		validateNamesAction.setText("Check user constraints");
		validateNamesAction.setToolTipText("Check user constraints");
		validateNamesAction.setImageDescriptor(imageDescriptorSpecialize3);
		
		URL url5 = FileLocator.find(FeaturemodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/eliminate.png"), null); //$NON-NLS-1$
		ImageDescriptor imageDescriptorSpecialize5 = ImageDescriptor.createFromURL(url5);
		eliminateAction = new DeleteConfigurationAction(this);
		eliminateAction.setText("Delete configuration");
		eliminateAction.setToolTipText("Close and delete the configuration");
		eliminateAction.setImageDescriptor(imageDescriptorSpecialize5);
		
		URL url6 = FileLocator.find(FeaturemodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/optimice.png"), null); //$NON-NLS-1$
		ImageDescriptor imageDescriptorSpecialize6 = ImageDescriptor.createFromURL(url6);
		optimiceAction = new OptimiceConfigurationAction(this, false);
		optimiceAction.setText("Optimice configuration");
		optimiceAction.setToolTipText("Create the optimus configuration");
		optimiceAction.setImageDescriptor(imageDescriptorSpecialize6);
		
		URL url7 = FileLocator.find(FeaturemodelDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				"icons/wizban/optimice2.png"), null); //$NON-NLS-1$
		ImageDescriptor imageDescriptorSpecialize7 = ImageDescriptor.createFromURL(url7);
		optimiceActionWithFile = new OptimiceConfigurationAction(this, true);
		optimiceActionWithFile.setText("Optimice configuration with foreign constraint file");
		optimiceActionWithFile.setToolTipText("Create the optimus configuration with foreign constraint file");
		optimiceActionWithFile.setImageDescriptor(imageDescriptorSpecialize7);
	}
	public void contributeToMenu(IMenuManager manager) {
		IMenuManager menu = new MenuManager("Hydra");
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(sampleAction);
//		menu.add(validateAction);
		menu.add(validateNamesAction);
		menu.add(chocoAction);
		menu.add(eliminateAction);
		menu.add(optimiceAction);
		menu.add(optimiceActionWithFile);
	}
	public void contributeToToolBar(IToolBarManager manager) {
		manager.add(new Separator());
		manager.add(sampleAction);
//		manager.add(validateAction);
		manager.add(validateNamesAction);
		manager.add(chocoAction);
		manager.add(eliminateAction);
		manager.add(optimiceAction);
		manager.add(optimiceActionWithFile);
	}
}
