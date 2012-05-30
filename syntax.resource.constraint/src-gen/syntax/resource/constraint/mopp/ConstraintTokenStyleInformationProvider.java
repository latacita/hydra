/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintTokenStyleInformationProvider {
	
	public syntax.resource.constraint.IConstraintTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("import".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("and".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("or".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("xor".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("implies".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("all".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("any".equals(tokenName)) {
			return new syntax.resource.constraint.mopp.ConstraintTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
