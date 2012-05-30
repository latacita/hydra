/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.debug;

public class ConstraintSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof syntax.resource.constraint.debug.ConstraintStackFrame) {
			syntax.resource.constraint.debug.ConstraintStackFrame frame = (syntax.resource.constraint.debug.ConstraintStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
