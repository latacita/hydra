/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class HydraConstExpectedStructuralFeature extends hydraconstraints.resource.hydraConst.mopp.HydraConstAbstractExpectedElement {
	
	private hydraconstraints.resource.hydraConst.grammar.HydraConstPlaceholder placeholder;
	
	public HydraConstExpectedStructuralFeature(hydraconstraints.resource.hydraConst.grammar.HydraConstPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof HydraConstExpectedStructuralFeature) {
			return getFeature().equals(((HydraConstExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
