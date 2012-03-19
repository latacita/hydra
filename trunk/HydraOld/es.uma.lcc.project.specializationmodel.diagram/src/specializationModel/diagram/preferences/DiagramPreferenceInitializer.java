package specializationModel.diagram.preferences;

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
		specializationModel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		specializationModel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		specializationModel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		specializationModel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		specializationModel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return specializationModel.diagram.part.SpecializationmodelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
