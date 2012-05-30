/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

public class HydraConstUIMetaInformation extends hydraconstraints.resource.hydraConst.mopp.HydraConstMetaInformation {
	
	public hydraconstraints.resource.hydraConst.IHydraConstHoverTextProvider getHoverTextProvider() {
		return new hydraconstraints.resource.hydraConst.ui.HydraConstHoverTextProvider();
	}
	
	public hydraconstraints.resource.hydraConst.ui.HydraConstImageProvider getImageProvider() {
		return hydraconstraints.resource.hydraConst.ui.HydraConstImageProvider.INSTANCE;
	}
	
	public hydraconstraints.resource.hydraConst.ui.HydraConstColorManager createColorManager() {
		return new hydraconstraints.resource.hydraConst.ui.HydraConstColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(hydraconstraints.resource.hydraConst.IHydraConstTextResource,
	 * hydraconstraints.resource.hydraConst.ui.HydraConstColorManager) instead.
	 */
	public hydraconstraints.resource.hydraConst.ui.HydraConstTokenScanner createTokenScanner(hydraconstraints.resource.hydraConst.ui.HydraConstColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public hydraconstraints.resource.hydraConst.ui.HydraConstTokenScanner createTokenScanner(hydraconstraints.resource.hydraConst.IHydraConstTextResource resource, hydraconstraints.resource.hydraConst.ui.HydraConstColorManager colorManager) {
		return new hydraconstraints.resource.hydraConst.ui.HydraConstTokenScanner(resource, colorManager);
	}
	
	public hydraconstraints.resource.hydraConst.ui.HydraConstCodeCompletionHelper createCodeCompletionHelper() {
		return new hydraconstraints.resource.hydraConst.ui.HydraConstCodeCompletionHelper();
	}
	
}
