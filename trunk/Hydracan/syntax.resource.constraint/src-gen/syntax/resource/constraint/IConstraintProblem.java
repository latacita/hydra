/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint;

public interface IConstraintProblem {
	public String getMessage();
	public syntax.resource.constraint.ConstraintEProblemSeverity getSeverity();
	public syntax.resource.constraint.ConstraintEProblemType getType();
	public java.util.Collection<syntax.resource.constraint.IConstraintQuickFix> getQuickFixes();
}
