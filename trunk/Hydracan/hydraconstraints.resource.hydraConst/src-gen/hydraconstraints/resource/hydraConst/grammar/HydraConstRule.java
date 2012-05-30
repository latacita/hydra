/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class HydraConstRule extends hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public HydraConstRule(org.eclipse.emf.ecore.EClass metaclass, hydraconstraints.resource.hydraConst.grammar.HydraConstChoice choice, hydraconstraints.resource.hydraConst.grammar.HydraConstCardinality cardinality) {
		super(cardinality, new hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public hydraconstraints.resource.hydraConst.grammar.HydraConstChoice getDefinition() {
		return (hydraconstraints.resource.hydraConst.grammar.HydraConstChoice) getChildren()[0];
	}
	
}

