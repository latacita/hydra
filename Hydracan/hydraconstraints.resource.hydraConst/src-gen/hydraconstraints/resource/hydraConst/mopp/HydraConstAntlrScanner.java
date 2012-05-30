/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstAntlrScanner implements hydraconstraints.resource.hydraConst.IHydraConstTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public HydraConstAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		hydraconstraints.resource.hydraConst.IHydraConstTextToken result = new hydraconstraints.resource.hydraConst.mopp.HydraConstTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
