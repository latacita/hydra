/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.debug;

public class ConstraintSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new syntax.resource.constraint.debug.ConstraintSourceLookupParticipant()});
	}
	
}
