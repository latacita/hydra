/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements hydraconstraints.resource.hydraConst.IHydraConstTextResource {
	
	public class ElementBasedTextDiagnostic implements hydraconstraints.resource.hydraConst.IHydraConstTextDiagnostic {
		
		private final hydraconstraints.resource.hydraConst.IHydraConstLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final hydraconstraints.resource.hydraConst.IHydraConstProblem problem;
		
		public ElementBasedTextDiagnostic(hydraconstraints.resource.hydraConst.IHydraConstLocationMap locationMap, org.eclipse.emf.common.util.URI uri, hydraconstraints.resource.hydraConst.IHydraConstProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public hydraconstraints.resource.hydraConst.IHydraConstProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public org.eclipse.emf.ecore.EObject getElement() {
			return element;
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements hydraconstraints.resource.hydraConst.IHydraConstTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private hydraconstraints.resource.hydraConst.IHydraConstProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, hydraconstraints.resource.hydraConst.IHydraConstProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public hydraconstraints.resource.hydraConst.IHydraConstProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private hydraconstraints.resource.hydraConst.IHydraConstReferenceResolverSwitch resolverSwitch;
	private hydraconstraints.resource.hydraConst.IHydraConstLocationMap locationMap;
	private int proxyCounter = 0;
	private hydraconstraints.resource.hydraConst.IHydraConstTextParser parser;
	private java.util.Map<String, hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<String, hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, hydraconstraints.resource.hydraConst.IHydraConstQuickFix> quickFixMap = new java.util.LinkedHashMap<String, hydraconstraints.resource.hydraConst.IHydraConstQuickFix>();
	private java.util.Map<?, ?> loadOptions;
	
	/**
	 * If a post-processor is currently running, this field holds a reference to it.
	 * This reference is used to terminate post-processing if needed.
	 */
	private hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessor runningPostProcessor;
	
	/**
	 * A flag to indicate whether reloading of the resource shall be cancelled.
	 */
	private boolean terminateReload = false;
	
	public HydraConstResource() {
		super();
		resetLocationMap();
	}
	
	public HydraConstResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		this.loadOptions = options;
		this.terminateReload = false;
		String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		Object inputStreamPreProcessorProvider = null;
		if (options != null) {
			inputStreamPreProcessorProvider = options.get(hydraconstraints.resource.hydraConst.IHydraConstOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof hydraconstraints.resource.hydraConst.IHydraConstInputStreamProcessorProvider) {
				hydraconstraints.resource.hydraConst.IHydraConstInputStreamProcessorProvider provider = (hydraconstraints.resource.hydraConst.IHydraConstInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				hydraconstraints.resource.hydraConst.mopp.HydraConstInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		hydraconstraints.resource.hydraConst.IHydraConstReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		hydraconstraints.resource.hydraConst.IHydraConstParseResult result = parser.parse();
		clearState();
		getContentsInternal().clear();
		org.eclipse.emf.ecore.EObject root = null;
		if (result != null) {
			root = result.getRoot();
			if (root != null) {
				getContentsInternal().add(root);
			}
			java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>  command : commands) {
					command.execute(this);
				}
			}
		}
		getReferenceResolverSwitch().setOptions(options);
		if (getErrors().isEmpty()) {
			runPostProcessors(options);
			if (root != null) {
				runValidators(root);
			}
		}
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.getResourceSet());
		} catch (hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		hydraconstraints.resource.hydraConst.IHydraConstTextParser parserCopy = parser;
		parserCopy.terminate();
		this.terminateReload = true;
		hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessor runningPostProcessorCopy = runningPostProcessor;
		if (runningPostProcessorCopy != null) {
			runningPostProcessorCopy.terminate();
		}
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		hydraconstraints.resource.hydraConst.IHydraConstTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		hydraconstraints.resource.hydraConst.IHydraConstReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for (org.eclipse.emf.ecore.EObject root : getContentsInternal()) {
			printer.print(root);
		}
	}
	
	protected String getSyntaxName() {
		return "hydraConst";
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new hydraconstraints.resource.hydraConst.mopp.HydraConstReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public hydraconstraints.resource.hydraConst.mopp.HydraConstMetaInformation getMetaInformation() {
		return new hydraconstraints.resource.hydraConst.mopp.HydraConstMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new hydraconstraints.resource.hydraConst.mopp.HydraConstLocationMap();
	}
	
	public void addURIFragment(String internalURIFragment, hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement, int position) {
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		String internalURIFragment = hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(message, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNRESOLVED_REFERENCE, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.ERROR),uriFragment.getProxy());
				hydraconstraints.resource.hydraConst.mopp.HydraConstPlugin.logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachResolveWarnings(result, proxy);
				hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				org.eclipse.emf.ecore.EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				org.eclipse.emf.ecore.EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.eclipse.emf.common.notify.Adapter adapter : container.eAdapters()) {
			if (adapter instanceof hydraconstraints.resource.hydraConst.mopp.HydraConstLayoutInformationAdapter) {
				hydraconstraints.resource.hydraConst.mopp.HydraConstLayoutInformationAdapter layoutInformationAdapter = (hydraconstraints.resource.hydraConst.mopp.HydraConstLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(hydraconstraints.resource.hydraConst.IHydraConstContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final String errorMessage) {
		if (mapping instanceof hydraconstraints.resource.hydraConst.IHydraConstURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((hydraconstraints.resource.hydraConst.IHydraConstURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(errorMessage, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNRESOLVED_REFERENCE, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof hydraconstraints.resource.hydraConst.IHydraConstElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((hydraconstraints.resource.hydraConst.IHydraConstElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = hydraconstraints.resource.hydraConst.util.HydraConstCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject cause, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof hydraconstraints.resource.hydraConst.IHydraConstTextDiagnostic) {
				if (((hydraconstraints.resource.hydraConst.IHydraConstTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
					hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.unmark(this, cause);
				}
			}
		}
	}
	
	private void attachResolveError(hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(errorMessage, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNRESOLVED_REFERENCE, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.ERROR, result.getQuickFixes()), proxy);
		}
	}
	
	private void attachResolveWarnings(hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(warningMessage, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNRESOLVED_REFERENCE, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.WARNING), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.unmark(this, hydraconstraints.resource.hydraConst.HydraConstEProblemType.ANALYSIS_PROBLEM);
		if (terminateReload) {
			return;
		}
		// first, run the generated post processor
		runPostProcessor(new hydraconstraints.resource.hydraConst.mopp.HydraConstResourcePostProcessor());
		if (loadOptions == null) {
			return;
		}
		// then, run post processors that are registered via the load options extension
		// point
		Object resourcePostProcessorProvider = loadOptions.get(hydraconstraints.resource.hydraConst.IHydraConstOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessorProvider) {
				runPostProcessor(((hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor());
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (terminateReload) {
						return;
					}
					if (processorProvider instanceof hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessorProvider) {
						hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessorProvider csProcessorProvider = (hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessorProvider) processorProvider;
						hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						runPostProcessor(postProcessor);
					}
				}
			}
		}
	}
	
	protected void runPostProcessor(hydraconstraints.resource.hydraConst.IHydraConstResourcePostProcessor postProcessor) {
		try {
			this.runningPostProcessor = postProcessor;
			postProcessor.process(this);
		} catch (Exception e) {
			hydraconstraints.resource.hydraConst.mopp.HydraConstPlugin.logError("Exception while running a post-processor.", e);
		}
		this.runningPostProcessor = null;
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.getResourceSet());
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(hydraconstraints.resource.hydraConst.IHydraConstProblem problem, org.eclipse.emf.ecore.EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.mark(this, diagnostic);
		}
		java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (hydraconstraints.resource.hydraConst.IHydraConstQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	public void addProblem(hydraconstraints.resource.hydraConst.IHydraConstProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.mark(this, diagnostic);
		}
	}
	
	@Deprecated	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause) {
		addError(message, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNKNOWN, cause);
	}
	
	public void addError(String message, hydraconstraints.resource.hydraConst.HydraConstEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(message, type, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.ERROR), cause);
	}
	
	@Deprecated	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause) {
		addWarning(message, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNKNOWN, cause);
	}
	
	public void addWarning(String message, hydraconstraints.resource.hydraConst.HydraConstEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(message, type, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity severity) {
		if (severity == hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<Object, Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<Object, Object> loadOptionsCopy = hydraconstraints.resource.hydraConst.util.HydraConstMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(hydraconstraints.resource.hydraConst.mopp.HydraConstPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					hydraconstraints.resource.hydraConst.IHydraConstOptionProvider provider = (hydraconstraints.resource.hydraConst.IHydraConstOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					hydraconstraints.resource.hydraConst.mopp.HydraConstPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Adds a new key,value pair to the list of options. If there is already an option
	 * with the same key, the two values are collected in a list.
	 */
	private void addLoadOption(java.util.Map<Object, Object> options,Object key, Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<Object> currentValueAsObjectList = hydraconstraints.resource.hydraConst.util.HydraConstListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list and add both the old
				// (current) and the new value to this list
				java.util.List<Object> newValueList = new java.util.ArrayList<Object>();
				newValueList.add(currentValue);
				if (value instanceof java.util.Collection<?>) {
					newValueList.addAll((java.util.Collection<?>) value);
				} else {
					newValueList.add(value);
				}
				options.put(key, newValueList);
			}
		} else {
			options.put(key, value);
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		if (isMarkerCreationEnabled()) {
			hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.unmark(this, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNKNOWN);
			hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.unmark(this, hydraconstraints.resource.hydraConst.HydraConstEProblemType.SYNTAX_ERROR);
			hydraconstraints.resource.hydraConst.mopp.HydraConstMarkerHelper.unmark(this, hydraconstraints.resource.hydraConst.HydraConstEProblemType.UNRESOLVED_REFERENCE);
		}
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	/**
	 * Returns a copy of the contents of this resource wrapped in a list that
	 * propagates changes to the original resource list. Wrapping is required to make
	 * sure that clients which obtain a reference to the list of contents do not
	 * interfere when changing the list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new hydraconstraints.resource.hydraConst.util.HydraConstCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	/**
	 * Returns the raw contents of this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContentsInternal() {
		return super.getContents();
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new hydraconstraints.resource.hydraConst.util.HydraConstCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new hydraconstraints.resource.hydraConst.util.HydraConstCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	@SuppressWarnings("restriction")	
	private void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled
		
		// check EMF validation constraints
		// EMF validation does not work if OSGi is not running
		// The EMF validation framework code throws a NPE if the validation plug-in is not
		// loaded. This is a bug, which is fixed in the Helios release. Nonetheless, we
		// need to catch the exception here.
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// The EMF validation framework code throws a NPE if the validation plug-in is not
			// loaded. This is a workaround for bug 322079.
			if (org.eclipse.emf.validation.internal.EMFModelValidationPlugin.getPlugin() != null) {
				try {
					org.eclipse.emf.validation.service.ModelValidationService service = org.eclipse.emf.validation.service.ModelValidationService.getInstance();
					org.eclipse.emf.validation.service.IBatchValidator validator = service.<org.eclipse.emf.ecore.EObject, org.eclipse.emf.validation.service.IBatchValidator>newValidator(org.eclipse.emf.validation.model.EvaluationMode.BATCH);
					validator.setIncludeLiveConstraints(true);
					org.eclipse.core.runtime.IStatus status = validator.validate(root);
					addStatus(status, root);
				} catch (Throwable t) {
					hydraconstraints.resource.hydraConst.mopp.HydraConstPlugin.logError("Exception while checking contraints provided by EMF validator classes.", t);
				}
			}
		}
	}
	
	private void addStatus(org.eclipse.core.runtime.IStatus status, org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> causes = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		causes.add(root);
		if (status instanceof org.eclipse.emf.validation.model.ConstraintStatus) {
			org.eclipse.emf.validation.model.ConstraintStatus constraintStatus = (org.eclipse.emf.validation.model.ConstraintStatus) status;
			java.util.Set<org.eclipse.emf.ecore.EObject> resultLocus = constraintStatus.getResultLocus();
			causes.clear();
			causes.addAll(resultLocus);
		}
		boolean hasChildren = status.getChildren() != null && status.getChildren().length > 0;
		// Ignore composite status objects that have children. The actual status
		// information is then contained in the child objects.
		if (!status.isMultiStatus() || !hasChildren) {
			if (status.getSeverity() == org.eclipse.core.runtime.IStatus.ERROR) {
				for (org.eclipse.emf.ecore.EObject cause : causes) {
					addError(status.getMessage(), hydraconstraints.resource.hydraConst.HydraConstEProblemType.ANALYSIS_PROBLEM, cause);
				}
			}
			if (status.getSeverity() == org.eclipse.core.runtime.IStatus.WARNING) {
				for (org.eclipse.emf.ecore.EObject cause : causes) {
					addWarning(status.getMessage(), hydraconstraints.resource.hydraConst.HydraConstEProblemType.ANALYSIS_PROBLEM, cause);
				}
			}
		}
		for (org.eclipse.core.runtime.IStatus child : status.getChildren()) {
			addStatus(child, root);
		}
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(hydraconstraints.resource.hydraConst.IHydraConstOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
	}
}
