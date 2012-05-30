/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintParseResult implements syntax.resource.constraint.IConstraintParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>> commands = new java.util.ArrayList<syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>>();
	
	public ConstraintParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
