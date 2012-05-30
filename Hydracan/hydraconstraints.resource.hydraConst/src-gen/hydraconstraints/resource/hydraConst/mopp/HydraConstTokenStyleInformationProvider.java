/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstTokenStyleInformationProvider {
	
	public hydraconstraints.resource.hydraConst.IHydraConstTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("import".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("and".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("or".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("xor".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("implies".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("all".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("any".equals(tokenName)) {
			return new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
