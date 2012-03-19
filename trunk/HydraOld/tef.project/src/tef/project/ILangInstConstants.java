package tef.project;

import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;

import tef.project.expressions.ExpressionsPackage;

public interface ILangInstConstants {
	
	public static final EPackage[] epaMetamodels = 
		new EPackage[] { ExpressionsPackage.eINSTANCE};
	
	public static final String sSyntaxPath = "/resources/expressions.etslt";
	
	public static final Bundle bSyntaxBundle = Activator.getDefault().getBundle();
	
}
