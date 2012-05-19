/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class ConstraintRule extends syntax.resource.constraint.grammar.ConstraintSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public ConstraintRule(org.eclipse.emf.ecore.EClass metaclass, syntax.resource.constraint.grammar.ConstraintChoice choice, syntax.resource.constraint.grammar.ConstraintCardinality cardinality) {
		super(cardinality, new syntax.resource.constraint.grammar.ConstraintSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public syntax.resource.constraint.grammar.ConstraintChoice getDefinition() {
		return (syntax.resource.constraint.grammar.ConstraintChoice) getChildren()[0];
	}
	
}

