/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.util;

/**
 * Class HydraConstTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * hydraconstraints.resource.hydraConst.util.HydraConstResourceUtil.
 */
public class HydraConstTextResourceUtil {
	
	@Deprecated	
	public static hydraconstraints.resource.hydraConst.mopp.HydraConstResource getResource(org.eclipse.core.resources.IFile file) {
		return hydraconstraints.resource.hydraConst.util.HydraConstResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static hydraconstraints.resource.hydraConst.mopp.HydraConstResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return hydraconstraints.resource.hydraConst.util.HydraConstResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static hydraconstraints.resource.hydraConst.mopp.HydraConstResource getResource(org.eclipse.emf.common.util.URI uri) {
		return hydraconstraints.resource.hydraConst.util.HydraConstResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static hydraconstraints.resource.hydraConst.mopp.HydraConstResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return hydraconstraints.resource.hydraConst.util.HydraConstResourceUtil.getResource(uri, options);
	}
	
}
