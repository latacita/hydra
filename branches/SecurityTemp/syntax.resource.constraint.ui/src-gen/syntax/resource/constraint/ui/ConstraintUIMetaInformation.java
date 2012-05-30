/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.ui;

public class ConstraintUIMetaInformation extends syntax.resource.constraint.mopp.ConstraintMetaInformation {
	
	public syntax.resource.constraint.IConstraintHoverTextProvider getHoverTextProvider() {
		return new syntax.resource.constraint.ui.ConstraintHoverTextProvider();
	}
	
	public syntax.resource.constraint.ui.ConstraintImageProvider getImageProvider() {
		return syntax.resource.constraint.ui.ConstraintImageProvider.INSTANCE;
	}
	
	public syntax.resource.constraint.ui.ConstraintColorManager createColorManager() {
		return new syntax.resource.constraint.ui.ConstraintColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(syntax.resource.constraint.IConstraintTextResource,
	 * syntax.resource.constraint.ui.ConstraintColorManager) instead.
	 */
	public syntax.resource.constraint.ui.ConstraintTokenScanner createTokenScanner(syntax.resource.constraint.ui.ConstraintColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public syntax.resource.constraint.ui.ConstraintTokenScanner createTokenScanner(syntax.resource.constraint.IConstraintTextResource resource, syntax.resource.constraint.ui.ConstraintColorManager colorManager) {
		return new syntax.resource.constraint.ui.ConstraintTokenScanner(resource, colorManager);
	}
	
	public syntax.resource.constraint.ui.ConstraintCodeCompletionHelper createCodeCompletionHelper() {
		return new syntax.resource.constraint.ui.ConstraintCodeCompletionHelper();
	}
	
}
