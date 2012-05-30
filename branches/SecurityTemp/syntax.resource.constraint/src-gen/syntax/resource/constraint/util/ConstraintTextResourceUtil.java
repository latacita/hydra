/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.util;

/**
 * Class ConstraintTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * syntax.resource.constraint.util.ConstraintResourceUtil.
 */
public class ConstraintTextResourceUtil {
	
	@Deprecated	
	public static syntax.resource.constraint.mopp.ConstraintResource getResource(org.eclipse.core.resources.IFile file) {
		return syntax.resource.constraint.util.ConstraintResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static syntax.resource.constraint.mopp.ConstraintResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return syntax.resource.constraint.util.ConstraintResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static syntax.resource.constraint.mopp.ConstraintResource getResource(org.eclipse.emf.common.util.URI uri) {
		return syntax.resource.constraint.util.ConstraintResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static syntax.resource.constraint.mopp.ConstraintResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return syntax.resource.constraint.util.ConstraintResourceUtil.getResource(uri, options);
	}
	
}
