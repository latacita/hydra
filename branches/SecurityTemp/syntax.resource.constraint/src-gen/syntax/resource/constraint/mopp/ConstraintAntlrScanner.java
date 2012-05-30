/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintAntlrScanner implements syntax.resource.constraint.IConstraintTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public ConstraintAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public syntax.resource.constraint.IConstraintTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		syntax.resource.constraint.IConstraintTextToken result = new syntax.resource.constraint.mopp.ConstraintTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
