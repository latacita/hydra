/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			syntax.SyntaxPackage.eINSTANCE.getModel(),
			syntax.SyntaxPackage.eINSTANCE.getConstraint(),
			syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand1(),
			syntax.SyntaxPackage.eINSTANCE.getBoolPriorityOperand2(),
			syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand1(),
			syntax.SyntaxPackage.eINSTANCE.getNumPriorityOperand2(),
			syntax.SyntaxPackage.eINSTANCE.getAnd(),
			syntax.SyntaxPackage.eINSTANCE.getOr(),
			syntax.SyntaxPackage.eINSTANCE.getXor(),
			syntax.SyntaxPackage.eINSTANCE.getImplies(),
			syntax.SyntaxPackage.eINSTANCE.getNeg(),
			syntax.SyntaxPackage.eINSTANCE.getPlus(),
			syntax.SyntaxPackage.eINSTANCE.getMinus(),
			syntax.SyntaxPackage.eINSTANCE.getMul(),
			syntax.SyntaxPackage.eINSTANCE.getDiv(),
			syntax.SyntaxPackage.eINSTANCE.getContext(),
			syntax.SyntaxPackage.eINSTANCE.getAll(),
			syntax.SyntaxPackage.eINSTANCE.getAny(),
			syntax.SyntaxPackage.eINSTANCE.getMore(),
			syntax.SyntaxPackage.eINSTANCE.getMoreOrEqual(),
			syntax.SyntaxPackage.eINSTANCE.getLess(),
			syntax.SyntaxPackage.eINSTANCE.getLessOrEqual(),
			syntax.SyntaxPackage.eINSTANCE.getNotEqual(),
			syntax.SyntaxPackage.eINSTANCE.getEqual(),
			syntax.SyntaxPackage.eINSTANCE.getSimpleFeature(),
			syntax.SyntaxPackage.eINSTANCE.getMultipleFeature(),
			syntax.SyntaxPackage.eINSTANCE.getNumber(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			syntax.SyntaxPackage.eINSTANCE.getModel(),
		};
	}
	
}
