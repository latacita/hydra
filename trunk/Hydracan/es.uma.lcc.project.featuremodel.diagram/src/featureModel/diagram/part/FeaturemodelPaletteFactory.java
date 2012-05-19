package featureModel.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FeaturemodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				featureModel.diagram.part.Messages.Nodes1Group_title);
		paletteContainer.add(createFeature1CreationTool());
		paletteContainer.add(createFeatureGroup2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				featureModel.diagram.part.Messages.Links2Group_title);
		paletteContainer.add(createRelationbetweenFeatures1CreationTool());
		paletteContainer.add(createFromtoFeatureGroup2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFeature1CreationTool() {
		List/*<IElementType>*/<IElementType>types = new ArrayList/*<IElementType>*/(1);
		types
				.add(featureModel.diagram.providers.FeaturemodelElementTypes.Feature_2008);
		NodeToolEntry entry = new NodeToolEntry(
				featureModel.diagram.part.Messages.Feature1CreationTool_title,
				featureModel.diagram.part.Messages.Feature1CreationTool_desc,
				types);
		entry
				.setSmallIcon(featureModel.diagram.providers.FeaturemodelElementTypes
						.getImageDescriptor(featureModel.diagram.providers.FeaturemodelElementTypes.Feature_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFeatureGroup2CreationTool() {
		List/*<IElementType>*/<IElementType>types = new ArrayList/*<IElementType>*/(1);
		types
				.add(featureModel.diagram.providers.FeaturemodelElementTypes.FeatureGroup_2009);
		NodeToolEntry entry = new NodeToolEntry(
				featureModel.diagram.part.Messages.FeatureGroup2CreationTool_title,
				featureModel.diagram.part.Messages.FeatureGroup2CreationTool_desc,
				types);
		entry
				.setSmallIcon(featureModel.diagram.providers.FeaturemodelElementTypes
						.getImageDescriptor(featureModel.diagram.providers.FeaturemodelElementTypes.FeatureGroup_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationbetweenFeatures1CreationTool() {
		List/*<IElementType>*/<IElementType>types = new ArrayList/*<IElementType>*/(1);
		types
				.add(featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013);
		LinkToolEntry entry = new LinkToolEntry(
				featureModel.diagram.part.Messages.RelationbetweenFeatures1CreationTool_title,
				featureModel.diagram.part.Messages.RelationbetweenFeatures1CreationTool_desc,
				types);
		entry
				.setSmallIcon(featureModel.diagram.providers.FeaturemodelElementTypes
						.getImageDescriptor(featureModel.diagram.providers.FeaturemodelElementTypes.RelationFeature_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFromtoFeatureGroup2CreationTool() {
		List/*<IElementType>*/<IElementType>types = new ArrayList/*<IElementType>*/(1);
		types
				.add(featureModel.diagram.providers.FeaturemodelElementTypes.RelationFG_4012);
		LinkToolEntry entry = new LinkToolEntry(
				featureModel.diagram.part.Messages.FromtoFeatureGroup2CreationTool_title,
				featureModel.diagram.part.Messages.FromtoFeatureGroup2CreationTool_desc,
				types);
		entry
				.setSmallIcon(featureModel.diagram.providers.FeaturemodelElementTypes
						.getImageDescriptor(featureModel.diagram.providers.FeaturemodelElementTypes.RelationFG_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
