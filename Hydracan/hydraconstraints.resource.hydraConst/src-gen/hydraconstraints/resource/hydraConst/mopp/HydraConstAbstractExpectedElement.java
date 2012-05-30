/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class HydraConstAbstractExpectedElement implements hydraconstraints.resource.hydraConst.IHydraConstExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public HydraConstAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(hydraconstraints.resource.hydraConst.IHydraConstExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
