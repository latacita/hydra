/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

public class HydraConstContainment extends hydraconstraints.resource.hydraConst.grammar.HydraConstTerminal {
	
	public HydraConstContainment(org.eclipse.emf.ecore.EStructuralFeature feature, hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
