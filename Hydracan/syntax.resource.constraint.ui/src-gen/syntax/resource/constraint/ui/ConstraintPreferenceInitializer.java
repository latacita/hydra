/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.ui;

/**
 * A class used to initialize default preference values.
 */
public class ConstraintPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static syntax.resource.constraint.ui.ConstraintAntlrTokenHelper tokenHelper = new syntax.resource.constraint.ui.ConstraintAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = syntax.resource.constraint.ui.ConstraintUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(syntax.resource.constraint.ui.ConstraintPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(syntax.resource.constraint.ui.ConstraintPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = syntax.resource.constraint.ui.ConstraintUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new syntax.resource.constraint.mopp.ConstraintMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = syntax.resource.constraint.ui.ConstraintUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new syntax.resource.constraint.mopp.ConstraintMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, syntax.resource.constraint.IConstraintMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		syntax.resource.constraint.ui.ConstraintBracketSet bracketSet = new syntax.resource.constraint.ui.ConstraintBracketSet(null, null);
		final java.util.Collection<syntax.resource.constraint.IConstraintBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (syntax.resource.constraint.IConstraintBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + syntax.resource.constraint.ui.ConstraintPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, syntax.resource.constraint.IConstraintMetaInformation metaInformation) {
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
			syntax.resource.constraint.IConstraintTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, syntax.resource.constraint.ui.ConstraintSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
