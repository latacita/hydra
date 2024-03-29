/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A basic implementation of the
 * hydraconstraints.resource.hydraConst.IHydraConstElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class HydraConstElementMapping<ReferenceType> implements hydraconstraints.resource.hydraConst.IHydraConstElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public HydraConstElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
