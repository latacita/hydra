/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintProblem implements syntax.resource.constraint.IConstraintProblem {
	
	private String message;
	private syntax.resource.constraint.ConstraintEProblemType type;
	private syntax.resource.constraint.ConstraintEProblemSeverity severity;
	private java.util.Collection<syntax.resource.constraint.IConstraintQuickFix> quickFixes;
	
	public ConstraintProblem(String message, syntax.resource.constraint.ConstraintEProblemType type, syntax.resource.constraint.ConstraintEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<syntax.resource.constraint.IConstraintQuickFix>emptySet());
	}
	
	public ConstraintProblem(String message, syntax.resource.constraint.ConstraintEProblemType type, syntax.resource.constraint.ConstraintEProblemSeverity severity, syntax.resource.constraint.IConstraintQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public ConstraintProblem(String message, syntax.resource.constraint.ConstraintEProblemType type, syntax.resource.constraint.ConstraintEProblemSeverity severity, java.util.Collection<syntax.resource.constraint.IConstraintQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<syntax.resource.constraint.IConstraintQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public syntax.resource.constraint.ConstraintEProblemType getType() {
		return type;
	}
	
	public syntax.resource.constraint.ConstraintEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<syntax.resource.constraint.IConstraintQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
