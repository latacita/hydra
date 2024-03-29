/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

/**
 * A basic implementation of the
 * syntax.resource.constraint.IConstraintReferenceResolveResult interface that
 * collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class ConstraintReferenceResolveResult<ReferenceType> implements syntax.resource.constraint.IConstraintReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<syntax.resource.constraint.IConstraintReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<syntax.resource.constraint.IConstraintQuickFix> quickFixes;
	
	public ConstraintReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<syntax.resource.constraint.IConstraintQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<syntax.resource.constraint.IConstraintQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(syntax.resource.constraint.IConstraintQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<syntax.resource.constraint.IConstraintQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<syntax.resource.constraint.IConstraintReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<syntax.resource.constraint.IConstraintReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new syntax.resource.constraint.mopp.ConstraintElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<syntax.resource.constraint.IConstraintReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new syntax.resource.constraint.mopp.ConstraintURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
