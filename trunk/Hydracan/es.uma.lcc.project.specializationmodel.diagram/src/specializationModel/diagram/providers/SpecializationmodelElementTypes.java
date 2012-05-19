package specializationModel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class SpecializationmodelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private SpecializationmodelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, EClass> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Project_1000 = getElementType("es.uma.lcc.project.specializationmodel.diagram.Project_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Feature_2001 = getElementType("es.uma.lcc.project.specializationmodel.diagram.Feature_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FeatureGroup_2002 = getElementType("es.uma.lcc.project.specializationmodel.diagram.FeatureGroup_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationFG_4001 = getElementType("es.uma.lcc.project.specializationmodel.diagram.RelationFG_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationFeature_4002 = getElementType("es.uma.lcc.project.specializationmodel.diagram.RelationFeature_4002"); //$NON-NLS-1$
//	/**
//	 * @generated
//	 */
//	public static final IElementType RelationSelected_4003 = getElementType("es.uma.lcc.project.specializationmodel.diagram.RelationSelected_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, EClass>();

			elements.put(Project_1000,
					specializationModel.SpecializationModelPackage.eINSTANCE
							.getProject());

			elements.put(Feature_2001,
					specializationModel.SpecializationModelPackage.eINSTANCE
							.getFeature());

			elements.put(FeatureGroup_2002,
					specializationModel.SpecializationModelPackage.eINSTANCE
							.getFeatureGroup());

			elements.put(RelationFG_4001,
					specializationModel.SpecializationModelPackage.eINSTANCE
							.getRelationFG());

			elements.put(RelationFeature_4002,
					specializationModel.SpecializationModelPackage.eINSTANCE
							.getRelationFeature());

//			elements.put(RelationSelected_4003,
//					specializationModel.SpecializationModelPackage.eINSTANCE
//							.getRelationSelected());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Project_1000);
			KNOWN_ELEMENT_TYPES.add(Feature_2001);
			KNOWN_ELEMENT_TYPES.add(FeatureGroup_2002);
			KNOWN_ELEMENT_TYPES.add(RelationFG_4001);
			KNOWN_ELEMENT_TYPES.add(RelationFeature_4002);
//			KNOWN_ELEMENT_TYPES.add(RelationSelected_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
