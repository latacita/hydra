/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst;

/**
 * An interface for factories to create instances of
 * hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public interface IHydraConstContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> {
	
	/**
	 * Create a new instance of the
	 * hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment
	 * interface.
	 * 
	 * @param identifier the identifier that references an Object
	 * @param container the object that contains the reference
	 * @param reference the reference itself
	 * @param positionInReference the position of the identifier (if the reference is
	 * multiple)
	 * @param proxy the proxy that will be resolved later to the actual EObject
	 * 
	 * @return the new instance of
	 * hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment
	 */
	public hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy);
}
