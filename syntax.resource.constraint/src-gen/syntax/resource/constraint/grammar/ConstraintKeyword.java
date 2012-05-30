/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ConstraintKeyword extends syntax.resource.constraint.grammar.ConstraintSyntaxElement {
	
	private final String value;
	
	public ConstraintKeyword(String value, syntax.resource.constraint.grammar.ConstraintCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
