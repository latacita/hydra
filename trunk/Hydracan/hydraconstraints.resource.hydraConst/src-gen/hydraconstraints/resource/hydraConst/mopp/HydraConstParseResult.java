/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstParseResult implements hydraconstraints.resource.hydraConst.IHydraConstParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>> commands = new java.util.ArrayList<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>>();
	
	public HydraConstParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
