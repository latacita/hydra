/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class HydraConstPlaceholder extends hydraconstraints.resource.hydraConst.grammar.HydraConstTerminal {
	
	private final String tokenName;
	
	public HydraConstPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
