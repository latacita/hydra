/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ConstraintPlaceholder extends syntax.resource.constraint.grammar.ConstraintTerminal {
	
	private final String tokenName;
	
	public ConstraintPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, syntax.resource.constraint.grammar.ConstraintCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
