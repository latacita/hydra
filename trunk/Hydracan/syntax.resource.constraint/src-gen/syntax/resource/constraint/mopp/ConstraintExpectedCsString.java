/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class ConstraintExpectedCsString extends syntax.resource.constraint.mopp.ConstraintAbstractExpectedElement {
	
	private syntax.resource.constraint.grammar.ConstraintKeyword keyword;
	
	public ConstraintExpectedCsString(syntax.resource.constraint.grammar.ConstraintKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ConstraintExpectedCsString) {
			return getValue().equals(((ConstraintExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
