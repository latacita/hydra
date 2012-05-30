/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

public class HydraConstHoverTextProvider implements hydraconstraints.resource.hydraConst.IHydraConstHoverTextProvider {
	
	private hydraconstraints.resource.hydraConst.ui.HydraConstDefaultHoverTextProvider defaultProvider = new hydraconstraints.resource.hydraConst.ui.HydraConstDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
