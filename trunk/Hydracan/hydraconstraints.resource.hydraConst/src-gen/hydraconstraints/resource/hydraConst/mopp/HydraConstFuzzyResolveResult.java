/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A FuzzyResolveResult is an implementation of the
 * IHydraConstReferenceResolveResult interface that delegates all method calls to
 * a given IHydraConstReferenceResolveResult with ReferenceType EObject. It is
 * used by reference resolver switches to collect results from different reference
 * resolvers in a type safe manner.
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class HydraConstFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<ReferenceType> {
	
	private hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public HydraConstFuzzyResolveResult(hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(hydraconstraints.resource.hydraConst.IHydraConstQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
