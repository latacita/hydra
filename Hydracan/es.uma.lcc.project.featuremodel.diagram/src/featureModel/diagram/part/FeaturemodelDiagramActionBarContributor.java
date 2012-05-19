package featureModel.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.action.SubMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.internal.EditorActionBars;

/**
 * @generated
 */
public class FeaturemodelDiagramActionBarContributor extends
		DiagramActionBarContributor {
	
	
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// To remove the submenus from Diagram Menu
		if (bars instanceof EditorActionBars) {
			IMenuManager iMenuManager = ((EditorActionBars) bars).getMenuManager();
			if (iMenuManager instanceof SubMenuManager) {
				IContributionItem[] iContributionItems = ((SubMenuManager)iMenuManager).getParent().getItems();
				for (IContributionItem contributionItem : iContributionItems) {
					if (contributionItem instanceof SubContributionItem) {
						SubContributionItem subContributionItem = (SubContributionItem)contributionItem; IContributionItem innerContributionItem = subContributionItem.getInnerItem();
						if (innerContributionItem.getId().equalsIgnoreCase("diagramMenu")) {
							IMenuManager menuManager = (IMenuManager) innerContributionItem;
							menuManager.remove("filterGroup");
							menuManager.remove("filtersMenu");
							menuManager.remove("expandFilterGroup");
							menuManager.remove("alignMenu");
							menuManager.remove("arrangeMenu");
							menuManager.remove("copyAppearanceGroup");
							menuManager.remove("copyAppearancePropertiesAction");
							menuManager.remove("autoSizeAction");
							menuManager.remove("lineColorContributionItem");
							menuManager.remove("routerMenu");
							menuManager.remove("fillColorContributionItem");
						}
					}
				}
			}
		}
	}


	
	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return featureModel.diagram.part.FeaturemodelDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return featureModel.diagram.part.FeaturemodelDiagramEditor.ID;
	}
}
