/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.util;

/**
 * Utility class that provides a method to cast objects to type parameterized
 * classes without a warning.
 */
public class ConstraintCastUtil {
	
	@SuppressWarnings("unchecked")	
	public static <T> T cast(Object temp) {
		return (T) temp;
	}
}
