/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintContainment extends syntax.resource.constraint.grammar.ConstraintTerminal {
	
	public ConstraintContainment(org.eclipse.emf.ecore.EStructuralFeature feature, syntax.resource.constraint.grammar.ConstraintCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
