/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private syntax.resource.constraint.grammar.ConstraintSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private ConstraintSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public ConstraintSyntaxElementDecorator(syntax.resource.constraint.grammar.ConstraintSyntaxElement decoratedElement, ConstraintSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public syntax.resource.constraint.grammar.ConstraintSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public ConstraintSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
