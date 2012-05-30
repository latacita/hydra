/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class HydraConstContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final hydraconstraints.resource.hydraConst.IHydraConstReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public HydraConstContextDependentURIFragmentFactory(hydraconstraints.resource.hydraConst.IHydraConstReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public hydraconstraints.resource.hydraConst.IHydraConstReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
