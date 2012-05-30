grammar HydraConst;

options {
	superClass = HydraConstANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package hydraconstraints.resource.hydraConst.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
	}
}
@header{
	package hydraconstraints.resource.hydraConst.mopp;
}

@members{
	private hydraconstraints.resource.hydraConst.IHydraConstTokenResolverFactory tokenResolverFactory = new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal> expectedElements = new java.util.ArrayList<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>() {
			public boolean execute(hydraconstraints.resource.hydraConst.IHydraConstTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new hydraconstraints.resource.hydraConst.IHydraConstProblem() {
					public hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity getSeverity() {
						return hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.ERROR;
					}
					public hydraconstraints.resource.hydraConst.HydraConstEProblemType getType() {
						return hydraconstraints.resource.hydraConst.HydraConstEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(hydraconstraints.resource.hydraConst.IHydraConstExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal expectedElement = new hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal(terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>() {
			public boolean execute(hydraconstraints.resource.hydraConst.IHydraConstTextResource resource) {
				hydraconstraints.resource.hydraConst.IHydraConstLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>() {
			public boolean execute(hydraconstraints.resource.hydraConst.IHydraConstTextResource resource) {
				hydraconstraints.resource.hydraConst.IHydraConstLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>() {
			public boolean execute(hydraconstraints.resource.hydraConst.IHydraConstTextResource resource) {
				hydraconstraints.resource.hydraConst.IHydraConstLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new HydraConstParser(new org.antlr.runtime3_3_0.CommonTokenStream(new HydraConstLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new HydraConstParser(new org.antlr.runtime3_3_0.CommonTokenStream(new HydraConstLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			hydraconstraints.resource.hydraConst.mopp.HydraConstPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public HydraConstParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((HydraConstLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((HydraConstLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == hydraconstraints.Model.class) {
				return parse_hydraconstraints_Model();
			}
			if (type.getInstanceClass() == hydraconstraints.Constraint.class) {
				return parse_hydraconstraints_Constraint();
			}
			if (type.getInstanceClass() == hydraconstraints.BoolPriorityOperand1.class) {
				return parse_hydraconstraints_BoolPriorityOperand1();
			}
			if (type.getInstanceClass() == hydraconstraints.BoolPriorityOperand2.class) {
				return parse_hydraconstraints_BoolPriorityOperand2();
			}
			if (type.getInstanceClass() == hydraconstraints.NumPriorityOperand1.class) {
				return parse_hydraconstraints_NumPriorityOperand1();
			}
			if (type.getInstanceClass() == hydraconstraints.NumPriorityOperand2.class) {
				return parse_hydraconstraints_NumPriorityOperand2();
			}
			if (type.getInstanceClass() == hydraconstraints.And.class) {
				return parse_hydraconstraints_And();
			}
			if (type.getInstanceClass() == hydraconstraints.Or.class) {
				return parse_hydraconstraints_Or();
			}
			if (type.getInstanceClass() == hydraconstraints.Xor.class) {
				return parse_hydraconstraints_Xor();
			}
			if (type.getInstanceClass() == hydraconstraints.Implies.class) {
				return parse_hydraconstraints_Implies();
			}
			if (type.getInstanceClass() == hydraconstraints.Neg.class) {
				return parse_hydraconstraints_Neg();
			}
			if (type.getInstanceClass() == hydraconstraints.Plus.class) {
				return parse_hydraconstraints_Plus();
			}
			if (type.getInstanceClass() == hydraconstraints.Minus.class) {
				return parse_hydraconstraints_Minus();
			}
			if (type.getInstanceClass() == hydraconstraints.Mul.class) {
				return parse_hydraconstraints_Mul();
			}
			if (type.getInstanceClass() == hydraconstraints.Div.class) {
				return parse_hydraconstraints_Div();
			}
			if (type.getInstanceClass() == hydraconstraints.Context.class) {
				return parse_hydraconstraints_Context();
			}
			if (type.getInstanceClass() == hydraconstraints.All.class) {
				return parse_hydraconstraints_All();
			}
			if (type.getInstanceClass() == hydraconstraints.Any.class) {
				return parse_hydraconstraints_Any();
			}
			if (type.getInstanceClass() == hydraconstraints.More.class) {
				return parse_hydraconstraints_More();
			}
			if (type.getInstanceClass() == hydraconstraints.MoreOrEqual.class) {
				return parse_hydraconstraints_MoreOrEqual();
			}
			if (type.getInstanceClass() == hydraconstraints.Less.class) {
				return parse_hydraconstraints_Less();
			}
			if (type.getInstanceClass() == hydraconstraints.LessOrEqual.class) {
				return parse_hydraconstraints_LessOrEqual();
			}
			if (type.getInstanceClass() == hydraconstraints.NotEqual.class) {
				return parse_hydraconstraints_NotEqual();
			}
			if (type.getInstanceClass() == hydraconstraints.Equal.class) {
				return parse_hydraconstraints_Equal();
			}
			if (type.getInstanceClass() == hydraconstraints.SimpleFeature.class) {
				return parse_hydraconstraints_SimpleFeature();
			}
			if (type.getInstanceClass() == hydraconstraints.MultipleFeature.class) {
				return parse_hydraconstraints_MultipleFeature();
			}
			if (type.getInstanceClass() == hydraconstraints.Number.class) {
				return parse_hydraconstraints_Number();
			}
		}
		throw new hydraconstraints.resource.hydraConst.mopp.HydraConstUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(hydraconstraints.resource.hydraConst.IHydraConstOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public hydraconstraints.resource.hydraConst.IHydraConstParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource>>();
		hydraconstraints.resource.hydraConst.mopp.HydraConstParseResult parseResult = new hydraconstraints.resource.hydraConst.mopp.HydraConstParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hydraconstraints.resource.hydraConst.IHydraConstTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		hydraconstraints.resource.hydraConst.IHydraConstParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (hydraconstraints.resource.hydraConst.IHydraConstCommand<hydraconstraints.resource.hydraConst.IHydraConstTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal>();
		java.util.List<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal> newFollowSet = new java.util.ArrayList<hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 82;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (hydraconstraints.resource.hydraConst.util.HydraConstPair<hydraconstraints.resource.hydraConst.IHydraConstExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							hydraconstraints.resource.hydraConst.IHydraConstExpectedElement newFollower = newFollowerPair.getLeft();
							hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal newFollowTerminal = new hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(hydraconstraints.resource.hydraConst.mopp.HydraConstExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	protected void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.pop();
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_hydraconstraints_Model{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_hydraconstraints_Model returns [hydraconstraints.Model element = null]
@init{
}
:
	a0 = 'import' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_1, 1);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__FEATURE_LIST), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__FEATURE_LIST), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_2, 2);
	}
	
	a2 = ';' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_12, 3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
	}
	
	(
		(
			(
				a3_0 = parse_hydraconstraints_Constraint				{
					if (terminateParsing) {
						throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
					}
					if (element == null) {
						element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
						incompleteObjects.push(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, hydraconstraints.HydraconstraintsPackage.MODEL__CONSTRAINTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_3_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 4);
			}
			
			a4 = ';' {
				if (element == null) {
					element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_12, 5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_12, 6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_2);
	}
	
;

parse_hydraconstraints_Constraint returns [hydraconstraints.Constraint element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_Operand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createConstraint();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONSTRAINT__OPERATORS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_1_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 7);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 7);
	}
	
	
	|	a1 = '(' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createConstraint();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_1_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1);
	}
	
	(
		a2_0 = parse_hydraconstraints_Operand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createConstraint();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONSTRAINT__OPERATORS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_1_0_1_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_15, 9);
	}
	
	a3 = ')' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createConstraint();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_1_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 10);
	}
	
;

parse_hydraconstraints_BoolPriorityOperand1 returns [hydraconstraints.BoolPriorityOperand1 element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 11, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4);
	}
	
	(
		a1_0 = parse_hydraconstraints_BoolOperand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_2_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 12);
	}
	
	a2 = ')' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_17, 13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_18, 13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_19, 13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_20, 13);
	}
	
	
	|	(
		a3_0 = parse_hydraconstraints_BoolOperandChoices		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_2_0_1_0, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_17, 14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_18, 14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_19, 14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_20, 14);
	}
	
;

parse_hydraconstraints_BoolPriorityOperand2 returns [hydraconstraints.BoolPriorityOperand2 element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 15, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9);
	}
	
	(
		a1_0 = parse_hydraconstraints_BoolOperand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_3_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 16);
	}
	
	a2 = ')' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 17);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 17);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 17);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 17);
	}
	
	
	|	(
		a3_0 = parse_hydraconstraints_BoolOperand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_3_0_1_0, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 18);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 18);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 18);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 18);
	}
	
;

parse_hydraconstraints_NumPriorityOperand1 returns [hydraconstraints.NumPriorityOperand1 element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumOperandChoices		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_4_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 19);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 19);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 19);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 19);
	}
	
	
	|	a1 = '(' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_4_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumOperand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_4_0_1_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 21);
	}
	
	a3 = ')' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_4_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 22);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 22);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 22);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 22);
	}
	
;

parse_hydraconstraints_NumPriorityOperand2 returns [hydraconstraints.NumPriorityOperand2 element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumOperand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_5_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 23);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 23);
	}
	
	
	|	a1 = '(' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_5_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumOperand		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_5_0_1_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_34, 25);
	}
	
	a3 = ')' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_5_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 26);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 26);
	}
	
;

parse_hydraconstraints_And returns [hydraconstraints.And element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAnd();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.AND__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_6_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_17, 27);
	}
	
	a1 = 'and' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAnd();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 28, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAnd();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.AND__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_6_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 29);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 29);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 29);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 29);
	}
	
;

parse_hydraconstraints_Or returns [hydraconstraints.Or element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createOr();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.OR__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_7_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_18, 30);
	}
	
	a1 = 'or' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createOr();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 31, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createOr();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.OR__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_7_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 32);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 32);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 32);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 32);
	}
	
;

parse_hydraconstraints_Xor returns [hydraconstraints.Xor element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createXor();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.XOR__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_8_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_19, 33);
	}
	
	a1 = 'xor' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createXor();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 34, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createXor();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.XOR__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_8_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 35);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 35);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 35);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 35);
	}
	
;

parse_hydraconstraints_Implies returns [hydraconstraints.Implies element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createImplies();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.IMPLIES__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_9_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_20, 36);
	}
	
	a1 = 'implies' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createImplies();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 37, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createImplies();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.IMPLIES__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_9_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 38);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 38);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 38);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 38);
	}
	
;

parse_hydraconstraints_Neg returns [hydraconstraints.Neg element = null]
@init{
}
:
	a0 = '!' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNeg();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 39, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_11);
	}
	
	(
		a1_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNeg();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NEG__UNARY_OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_10_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 40);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 40);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 40);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 40);
	}
	
;

parse_hydraconstraints_Plus returns [hydraconstraints.Plus element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createPlus();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.PLUS__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_11_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 41);
	}
	
	a1 = '+' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createPlus();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createPlus();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.PLUS__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_11_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 43);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 43);
	}
	
;

parse_hydraconstraints_Minus returns [hydraconstraints.Minus element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMinus();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MINUS__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_12_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 44);
	}
	
	a1 = '-' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMinus();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_12_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMinus();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MINUS__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_12_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 46);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 46);
	}
	
;

parse_hydraconstraints_Mul returns [hydraconstraints.Mul element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMul();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MUL__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_13_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 47);
	}
	
	a1 = '*' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMul();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_13_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMul();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MUL__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_13_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 49);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 49);
	}
	
;

parse_hydraconstraints_Div returns [hydraconstraints.Div element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createDiv();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.DIV__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_14_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 50);
	}
	
	a1 = '/' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createDiv();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createDiv();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.DIV__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_14_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 52);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 52);
	}
	
;

parse_hydraconstraints_Context returns [hydraconstraints.Context element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_MultipleFeature		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createContext();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONTEXT__CONTEXT_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_15_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_35, 53);
	}
	
	a1 = '[' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createContext();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_1, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_12, 54, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_13);
	}
	
	(
		a2_0 = parse_hydraconstraints_Constraint		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createContext();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONTEXT__CONTEXT_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_15_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 55);
	}
	
	a3 = ']' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createContext();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_15_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 56);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 56);
	}
	
;

parse_hydraconstraints_All returns [hydraconstraints.All element = null]
@init{
}
:
	a0 = 'all' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAll();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 57, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
	}
	
	(
		a1_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAll();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.ALL__SELECTION_OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_16_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 58);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 58);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 58);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 58);
	}
	
;

parse_hydraconstraints_Any returns [hydraconstraints.Any element = null]
@init{
}
:
	a0 = 'any' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAny();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_17_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_21, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_3, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_6, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_7, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_4, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_0, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_8, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 59, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_7, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_9, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_14);
	}
	
	(
		a1_0 = parse_hydraconstraints_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAny();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.ANY__SELECTION_OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_17_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 60);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 60);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 60);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 60);
	}
	
;

parse_hydraconstraints_More returns [hydraconstraints.More element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMore();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_18_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 61);
	}
	
	a1 = '>' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMore();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_18_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMore();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_18_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 63);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 63);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 63);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 63);
	}
	
;

parse_hydraconstraints_MoreOrEqual returns [hydraconstraints.MoreOrEqual element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMoreOrEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE_OR_EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_19_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 64);
	}
	
	a1 = '>=' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMoreOrEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_19_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMoreOrEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE_OR_EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_19_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 66);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 66);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 66);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 66);
	}
	
;

parse_hydraconstraints_Less returns [hydraconstraints.Less element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLess();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_20_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 67);
	}
	
	a1 = '<' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLess();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_20_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLess();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_20_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 69);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 69);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 69);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 69);
	}
	
;

parse_hydraconstraints_LessOrEqual returns [hydraconstraints.LessOrEqual element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLessOrEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS_OR_EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_21_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 70);
	}
	
	a1 = '<=' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLessOrEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_21_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLessOrEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS_OR_EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_21_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 72);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 72);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 72);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 72);
	}
	
;

parse_hydraconstraints_NotEqual returns [hydraconstraints.NotEqual element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNotEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NOT_EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_22_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 73);
	}
	
	a1 = '!=' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNotEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_22_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNotEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NOT_EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_22_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 75);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 75);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 75);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 75);
	}
	
;

parse_hydraconstraints_Equal returns [hydraconstraints.Equal element = null]
@init{
}
:
	(
		a0_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_23_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 76);
	}
	
	a1 = '==' {
		if (element == null) {
			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_23_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_hydraconstraints_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_23_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 78);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 78);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 78);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 78);
	}
	
;

parse_hydraconstraints_SimpleFeature returns [hydraconstraints.SimpleFeature element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createSimpleFeature();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_24_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 79);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 79);
	}
	
;

parse_hydraconstraints_MultipleFeature returns [hydraconstraints.MultipleFeature element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMultipleFeature();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_25_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 80);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 80);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_hydraconstraints_SimpleFeature{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_hydraconstraints_Number returns [hydraconstraints.Number element = null]
@init{
}
:
	(
		a0 = DIGIT		
		{
			if (terminateParsing) {
				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
			}
			if (element == null) {
				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumber();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIGIT");
				tokenResolver.setOptions(getOptions());
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUMBER__NUM_VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUMBER__NUM_VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_26_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 81);
		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 81);
	}
	
;

parse_hydraconstraints_Operand returns [hydraconstraints.Operand element = null]
:
	c0 = parse_hydraconstraints_And{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_hydraconstraints_Or{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_hydraconstraints_Xor{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_hydraconstraints_Implies{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_hydraconstraints_Neg{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_hydraconstraints_Plus{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_hydraconstraints_Minus{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_hydraconstraints_Mul{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_hydraconstraints_Div{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_hydraconstraints_Context{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_hydraconstraints_All{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_hydraconstraints_Any{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_hydraconstraints_More{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_hydraconstraints_MoreOrEqual{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_hydraconstraints_Less{ element = c14; /* this is a subclass or primitive expression choice */ }
	|	c15 = parse_hydraconstraints_LessOrEqual{ element = c15; /* this is a subclass or primitive expression choice */ }
	|	c16 = parse_hydraconstraints_NotEqual{ element = c16; /* this is a subclass or primitive expression choice */ }
	|	c17 = parse_hydraconstraints_Equal{ element = c17; /* this is a subclass or primitive expression choice */ }
	|	c18 = parse_hydraconstraints_SimpleFeature{ element = c18; /* this is a subclass or primitive expression choice */ }
	|	c19 = parse_hydraconstraints_MultipleFeature{ element = c19; /* this is a subclass or primitive expression choice */ }
	|	c20 = parse_hydraconstraints_Number{ element = c20; /* this is a subclass or primitive expression choice */ }
	
;

parse_hydraconstraints_BoolOperand returns [hydraconstraints.BoolOperand element = null]
:
	c0 = parse_hydraconstraints_And{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_hydraconstraints_Or{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_hydraconstraints_Xor{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_hydraconstraints_Implies{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_hydraconstraints_Neg{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_hydraconstraints_Context{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_hydraconstraints_All{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_hydraconstraints_Any{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_hydraconstraints_More{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_hydraconstraints_MoreOrEqual{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_hydraconstraints_Less{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_hydraconstraints_LessOrEqual{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_hydraconstraints_NotEqual{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_hydraconstraints_Equal{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_hydraconstraints_SimpleFeature{ element = c14; /* this is a subclass or primitive expression choice */ }
	
;

parse_hydraconstraints_BoolOperandChoices returns [hydraconstraints.BoolOperandChoices element = null]
:
	c0 = parse_hydraconstraints_Context{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_hydraconstraints_All{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_hydraconstraints_Any{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_hydraconstraints_SimpleFeature{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_hydraconstraints_NumOperandChoices returns [hydraconstraints.NumOperandChoices element = null]
:
	c0 = parse_hydraconstraints_Context{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_hydraconstraints_SimpleFeature{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_hydraconstraints_MultipleFeature{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_hydraconstraints_Number{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_hydraconstraints_NumOperand returns [hydraconstraints.NumOperand element = null]
:
	c0 = parse_hydraconstraints_Plus{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_hydraconstraints_Minus{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_hydraconstraints_Mul{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_hydraconstraints_Div{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_hydraconstraints_Context{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_hydraconstraints_SimpleFeature{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_hydraconstraints_MultipleFeature{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_hydraconstraints_Number{ element = c7; /* this is a subclass or primitive expression choice */ }
	
;

DIGIT:
	(('0'..'9')+)
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;

