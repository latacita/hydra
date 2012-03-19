package tef.project;

import hub.sam.tef.Utilities;
import hub.sam.tef.modelcreating.IModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreating;
import hub.sam.tef.modelcreating.ModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreatingException;
import hub.sam.tef.semantics.AbstractError;
import hub.sam.tef.semantics.DefaultIdentificationScheme;
import hub.sam.tef.semantics.DefaultSemanticsProvider;
import hub.sam.tef.tsl.Syntax;
import hub.sam.tef.tsl.TslException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

//import org.eclipse.emf.ecore.x
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import tef.project.expressions.Model;

public class GenerateInstanceAction implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;
	private String srcProjectName;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		shell = targetPart.getSite().getShell();
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> i = ((IStructuredSelection) selection).iterator(); i
					.hasNext();) {
				Object o = i.next();
				if (o instanceof IFile) {
					IFile file = (IFile) o;
//					if (file.getFileExtension().startsWith("vmlinst"))
						process(file);
				}
			}
		}
				
	}

	private void process(final IFile file) {
		try {
			IRunnableWithProgress runnable = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					doProcess(file, monitor);
				}
			};
			PlatformUI.getWorkbench().getProgressService().busyCursorWhile(
					runnable);
		} catch (InvocationTargetException e) {
			e.getTargetException().printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void doProcess(IFile file, IProgressMonitor monitor) {
		try {
			SubMonitor progress = SubMonitor.convert(monitor, 100);

			srcProjectName = file.getFullPath().segment(0);

			EObject lim = parse(file, progress.newChild(20));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private EObject parse(IFile file, SubMonitor progress) {
		try {
			String text ="";
			try {
				BufferedReader r = new BufferedReader(new InputStreamReader(
						file.getContents()));
				StringBuffer sbText = new StringBuffer();
				String sLine;
				do {
					sLine = r.readLine();
					if (sLine != null) {
						sbText.append(sLine);
						sbText.append("\n");
					}
				} while (sLine != null);
				text = sbText.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}

			IModelCreatingContext context = new ModelCreatingContext(
					ILangInstConstants.epaMetamodels, new DefaultSemanticsProvider(
							DefaultIdentificationScheme.INSTANCE),
							new ResourceImpl(), text);

			EObject eoLangInstModel = null;

			try {
				Syntax sSyntax = Utilities.loadSyntaxDescription(ILangInstConstants.bSyntaxBundle,
						ILangInstConstants.sSyntaxPath, ILangInstConstants.epaMetamodels);

				eoLangInstModel = ModelCreating.createModelFromText(context,
						sSyntax);
				
				
				Resource resource = new XMIResourceImpl(URI.createURI("platform:/resource/"+srcProjectName+"/salida.xmi"));
				resource.getContents().add(eoLangInstModel);
				resource.save(null);
			} catch (Exception e){
				e.printStackTrace();
			}

//			// Check for any errors that might have occurred...
//			VMLInstParsingException except = null;
//			for (AbstractError error : context.getErrors()) {
//				if (except == null) {
//					except = new VMLInstParsingException();
//				}
//
//				except.add(error, context);
//			}
//			if (except != null) {
//				throw except;
//			}
			int i = 0;
			i++;
			
			return eoLangInstModel;
//			if ((eoLangInstModel != null)
//					&& (eoLangInstModel instanceof LangInstModel)) {
//				return (LangInstModel) eoLangInstModel;
//			} else {
//				throw new VMLInstParsingException(
//				"Parsing did not result in a language instance model.");
//			}
		} finally {
			progress.done();
		}
	}
	
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		this.selection = selection;
	}

}
