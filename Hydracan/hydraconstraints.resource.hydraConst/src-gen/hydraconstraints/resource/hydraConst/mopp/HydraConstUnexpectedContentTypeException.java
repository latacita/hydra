/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * hydraconstraints.resource.hydraConst.IHydraConstOptions.RESOURCE_CONTENT_TYPE
 */
public class HydraConstUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  HydraConstUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
