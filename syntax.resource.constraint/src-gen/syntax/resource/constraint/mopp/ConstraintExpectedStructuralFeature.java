/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class ConstraintExpectedStructuralFeature extends syntax.resource.constraint.mopp.ConstraintAbstractExpectedElement {
	
	private syntax.resource.constraint.grammar.ConstraintPlaceholder placeholder;
	
	public ConstraintExpectedStructuralFeature(syntax.resource.constraint.grammar.ConstraintPlaceholder placeholder) {
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
		if (o instanceof ConstraintExpectedStructuralFeature) {
			return getFeature().equals(((ConstraintExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
