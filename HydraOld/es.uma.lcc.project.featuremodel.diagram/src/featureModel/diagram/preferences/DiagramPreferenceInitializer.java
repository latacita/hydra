package featureModel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		featureModel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		featureModel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		featureModel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		featureModel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		featureModel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return featureModel.diagram.part.FeaturemodelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
