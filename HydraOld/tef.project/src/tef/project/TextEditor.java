package tef.project;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;

import tef.project.Activator; // activator class ?

import tef.project.expressions.ExpressionsPackage;
import tef.project.expressions.provider.ExpressionsItemProviderAdapterFactory;

public class TextEditor extends hub.sam.tef.editor.text.TextEditor {
	
	public TextEditor(){
	}

	@Override
	public EPackage[] createMetaModelPackages() {
		return ILangInstConstants.epaMetamodels;
	}

	@Override
	protected Bundle getPluginBundle() {
		return ILangInstConstants.bSyntaxBundle;
	}

	@Override
	protected String getSyntaxPath() {
		return ILangInstConstants.sSyntaxPath;
	}

	@Override
	public AdapterFactory[] createItemProviderAdapterFactories() {
		return new AdapterFactory[] { new ExpressionsItemProviderAdapterFactory() };
	}
}