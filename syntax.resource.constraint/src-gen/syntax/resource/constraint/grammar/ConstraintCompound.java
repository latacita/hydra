/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

public class ConstraintCompound extends syntax.resource.constraint.grammar.ConstraintSyntaxElement {
	
	public ConstraintCompound(syntax.resource.constraint.grammar.ConstraintChoice choice, syntax.resource.constraint.grammar.ConstraintCardinality cardinality) {
		super(cardinality, new syntax.resource.constraint.grammar.ConstraintSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
