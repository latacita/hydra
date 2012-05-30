/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private HydraConstSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public HydraConstSyntaxElementDecorator(hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement decoratedElement, HydraConstSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public hydraconstraints.resource.hydraConst.grammar.HydraConstSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public HydraConstSyntaxElementDecorator[] getChildDecorators() {
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
