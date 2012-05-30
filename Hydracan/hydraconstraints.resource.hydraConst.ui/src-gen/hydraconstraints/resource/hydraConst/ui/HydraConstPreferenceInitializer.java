/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

/**
 * A class used to initialize default preference values.
 */
public class HydraConstPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static hydraconstraints.resource.hydraConst.ui.HydraConstAntlrTokenHelper tokenHelper = new hydraconstraints.resource.hydraConst.ui.HydraConstAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = hydraconstraints.resource.hydraConst.ui.HydraConstUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = hydraconstraints.resource.hydraConst.ui.HydraConstUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new hydraconstraints.resource.hydraConst.mopp.HydraConstMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = hydraconstraints.resource.hydraConst.ui.HydraConstUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new hydraconstraints.resource.hydraConst.mopp.HydraConstMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, hydraconstraints.resource.hydraConst.IHydraConstMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		hydraconstraints.resource.hydraConst.ui.HydraConstBracketSet bracketSet = new hydraconstraints.resource.hydraConst.ui.HydraConstBracketSet(null, null);
		final java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (hydraconstraints.resource.hydraConst.IHydraConstBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + hydraconstraints.resource.hydraConst.ui.HydraConstPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, hydraconstraints.resource.hydraConst.IHydraConstMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			hydraconstraints.resource.hydraConst.IHydraConstTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hydraconstraints.resource.hydraConst.ui.HydraConstSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
