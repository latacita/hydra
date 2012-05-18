grammar Constraint;

options {
	superClass = ConstraintANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package syntax.resource.constraint.mopp;
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
	package syntax.resource.constraint.mopp;
}

@members{
	private syntax.resource.constraint.IConstraintTokenResolverFactory tokenResolverFactory = new syntax.resource.constraint.mopp.ConstraintTokenResolverFactory();
	
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
	private java.util.List<syntax.resource.constraint.mopp.ConstraintExpectedTerminal> expectedElements = new java.util.ArrayList<syntax.resource.constraint.mopp.ConstraintExpectedTerminal>();
	
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
		postParseCommands.add(new syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>() {
			public boolean execute(syntax.resource.constraint.IConstraintTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new syntax.resource.constraint.IConstraintProblem() {
					public syntax.resource.constraint.ConstraintEProblemSeverity getSeverity() {
						return syntax.resource.constraint.ConstraintEProblemSeverity.ERROR;
					}
					public syntax.resource.constraint.ConstraintEProblemType getType() {
						return syntax.resource.constraint.ConstraintEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<syntax.resource.constraint.IConstraintQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(syntax.resource.constraint.IConstraintExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		syntax.resource.constraint.mopp.ConstraintExpectedTerminal expectedElement = new syntax.resource.constraint.mopp.ConstraintExpectedTerminal(terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>() {
			public boolean execute(syntax.resource.constraint.IConstraintTextResource resource) {
				syntax.resource.constraint.IConstraintLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>() {
			public boolean execute(syntax.resource.constraint.IConstraintTextResource resource) {
				syntax.resource.constraint.IConstraintLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>() {
			public boolean execute(syntax.resource.constraint.IConstraintTextResource resource) {
				syntax.resource.constraint.IConstraintLocationMap locationMap = resource.getLocationMap();
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
	
	public syntax.resource.constraint.IConstraintTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new ConstraintParser(new org.antlr.runtime3_3_0.CommonTokenStream(new ConstraintLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new ConstraintParser(new org.antlr.runtime3_3_0.CommonTokenStream(new ConstraintLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			syntax.resource.constraint.mopp.ConstraintPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public ConstraintParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((ConstraintLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((ConstraintLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == syntax.Model.class) {
				return parse_syntax_Model();
			}
			if (type.getInstanceClass() == syntax.Constraint.class) {
				return parse_syntax_Constraint();
			}
			if (type.getInstanceClass() == syntax.BoolPriorityOperand1.class) {
				return parse_syntax_BoolPriorityOperand1();
			}
			if (type.getInstanceClass() == syntax.BoolPriorityOperand2.class) {
				return parse_syntax_BoolPriorityOperand2();
			}
			if (type.getInstanceClass() == syntax.NumPriorityOperand1.class) {
				return parse_syntax_NumPriorityOperand1();
			}
			if (type.getInstanceClass() == syntax.NumPriorityOperand2.class) {
				return parse_syntax_NumPriorityOperand2();
			}
			if (type.getInstanceClass() == syntax.And.class) {
				return parse_syntax_And();
			}
			if (type.getInstanceClass() == syntax.Or.class) {
				return parse_syntax_Or();
			}
			if (type.getInstanceClass() == syntax.Xor.class) {
				return parse_syntax_Xor();
			}
			if (type.getInstanceClass() == syntax.Implies.class) {
				return parse_syntax_Implies();
			}
			if (type.getInstanceClass() == syntax.Neg.class) {
				return parse_syntax_Neg();
			}
			if (type.getInstanceClass() == syntax.Plus.class) {
				return parse_syntax_Plus();
			}
			if (type.getInstanceClass() == syntax.Minus.class) {
				return parse_syntax_Minus();
			}
			if (type.getInstanceClass() == syntax.Mul.class) {
				return parse_syntax_Mul();
			}
			if (type.getInstanceClass() == syntax.Div.class) {
				return parse_syntax_Div();
			}
			if (type.getInstanceClass() == syntax.Context.class) {
				return parse_syntax_Context();
			}
			if (type.getInstanceClass() == syntax.All.class) {
				return parse_syntax_All();
			}
			if (type.getInstanceClass() == syntax.Any.class) {
				return parse_syntax_Any();
			}
			if (type.getInstanceClass() == syntax.More.class) {
				return parse_syntax_More();
			}
			if (type.getInstanceClass() == syntax.MoreOrEqual.class) {
				return parse_syntax_MoreOrEqual();
			}
			if (type.getInstanceClass() == syntax.Less.class) {
				return parse_syntax_Less();
			}
			if (type.getInstanceClass() == syntax.LessOrEqual.class) {
				return parse_syntax_LessOrEqual();
			}
			if (type.getInstanceClass() == syntax.NotEqual.class) {
				return parse_syntax_NotEqual();
			}
			if (type.getInstanceClass() == syntax.Equal.class) {
				return parse_syntax_Equal();
			}
			if (type.getInstanceClass() == syntax.SimpleFeature.class) {
				return parse_syntax_SimpleFeature();
			}
			if (type.getInstanceClass() == syntax.MultipleFeature.class) {
				return parse_syntax_MultipleFeature();
			}
			if (type.getInstanceClass() == syntax.Number.class) {
				return parse_syntax_Number();
			}
		}
		throw new syntax.resource.constraint.mopp.ConstraintUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(syntax.resource.constraint.IConstraintOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public syntax.resource.constraint.IConstraintParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource>>();
		syntax.resource.constraint.mopp.ConstraintParseResult parseResult = new syntax.resource.constraint.mopp.ConstraintParseResult();
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
	
	public java.util.List<syntax.resource.constraint.mopp.ConstraintExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, syntax.resource.constraint.IConstraintTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		syntax.resource.constraint.IConstraintParseResult result = parse();
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
			for (syntax.resource.constraint.IConstraintCommand<syntax.resource.constraint.IConstraintTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<syntax.resource.constraint.mopp.ConstraintExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<syntax.resource.constraint.mopp.ConstraintExpectedTerminal>();
		java.util.List<syntax.resource.constraint.mopp.ConstraintExpectedTerminal> newFollowSet = new java.util.ArrayList<syntax.resource.constraint.mopp.ConstraintExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			syntax.resource.constraint.mopp.ConstraintExpectedTerminal expectedElementI = expectedElements.get(i);
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
				for (syntax.resource.constraint.mopp.ConstraintExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (syntax.resource.constraint.mopp.ConstraintExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (syntax.resource.constraint.util.ConstraintPair<syntax.resource.constraint.IConstraintExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							syntax.resource.constraint.IConstraintExpectedElement newFollower = newFollowerPair.getLeft();
							syntax.resource.constraint.mopp.ConstraintExpectedTerminal newFollowTerminal = new syntax.resource.constraint.mopp.ConstraintExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (syntax.resource.constraint.mopp.ConstraintExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(syntax.resource.constraint.mopp.ConstraintExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_syntax_Model{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_syntax_Model returns [syntax.Model element = null]
@init{
}
:
	a0 = 'import' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_1, 1);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createModel();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				syntax.resource.constraint.IConstraintTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				syntax.resource.constraint.IConstraintTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__FEATURE_LIST), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__FEATURE_LIST), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_2, 2);
	}
	
	a2 = ';' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_12, 3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
	}
	
	(
		(
			(
				a3_0 = parse_syntax_Constraint				{
					if (terminateParsing) {
						throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
					}
					if (element == null) {
						element = syntax.SyntaxFactory.eINSTANCE.createModel();
						incompleteObjects.push(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, syntax.SyntaxPackage.MODEL__CONSTRAINTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_3_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 4);
			}
			
			a4 = ';' {
				if (element == null) {
					element = syntax.SyntaxFactory.eINSTANCE.createModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_12, 5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_12, 6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_2);
	}
	
;

parse_syntax_Constraint returns [syntax.Constraint element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_Operand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createConstraint();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_1_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 7);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 7);
	}
	
	
	|	a1 = '(' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createConstraint();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_1_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1);
	}
	
	(
		a2_0 = parse_syntax_Operand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createConstraint();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_1_0_1_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_15, 9);
	}
	
	a3 = ')' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createConstraint();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_1_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 10);
	}
	
;

parse_syntax_BoolPriorityOperand1 returns [syntax.BoolPriorityOperand1 element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 11, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4);
	}
	
	(
		a1_0 = parse_syntax_BoolOperand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_2_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 12);
	}
	
	a2 = ')' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_17, 13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_18, 13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_19, 13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_20, 13);
	}
	
	
	|	(
		a3_0 = parse_syntax_BoolOperandChoices		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_2_0_1_0, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_17, 14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_18, 14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_19, 14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_20, 14);
	}
	
;

parse_syntax_BoolPriorityOperand2 returns [syntax.BoolPriorityOperand2 element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 15, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9);
	}
	
	(
		a1_0 = parse_syntax_BoolOperand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_3_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 16);
	}
	
	a2 = ')' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 17);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 17);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 17);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 17);
	}
	
	
	|	(
		a3_0 = parse_syntax_BoolOperand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_3_0_1_0, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 18);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 18);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 18);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 18);
	}
	
;

parse_syntax_NumPriorityOperand1 returns [syntax.NumPriorityOperand1 element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumOperandChoices		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_4_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 19);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 19);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 19);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 19);
	}
	
	
	|	a1 = '(' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_4_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
	}
	
	(
		a2_0 = parse_syntax_NumOperand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand1();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_4_0_1_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 21);
	}
	
	a3 = ')' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand1();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_4_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 22);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 22);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 22);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 22);
	}
	
;

parse_syntax_NumPriorityOperand2 returns [syntax.NumPriorityOperand2 element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumOperand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_5_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 23);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 23);
	}
	
	
	|	a1 = '(' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_5_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
	}
	
	(
		a2_0 = parse_syntax_NumOperand		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand2();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_5_0_1_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_34, 25);
	}
	
	a3 = ')' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand2();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_5_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 26);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 26);
	}
	
;

parse_syntax_And returns [syntax.And element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createAnd();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_6_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_17, 27);
	}
	
	a1 = 'and' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createAnd();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 28, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createAnd();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_6_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 29);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 29);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 29);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 29);
	}
	
;

parse_syntax_Or returns [syntax.Or element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createOr();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_7_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_18, 30);
	}
	
	a1 = 'or' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createOr();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 31, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createOr();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_7_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 32);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 32);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 32);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 32);
	}
	
;

parse_syntax_Xor returns [syntax.Xor element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createXor();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_8_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_19, 33);
	}
	
	a1 = 'xor' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createXor();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 34, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createXor();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_8_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 35);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 35);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 35);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 35);
	}
	
;

parse_syntax_Implies returns [syntax.Implies element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_BoolPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createImplies();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_9_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_20, 36);
	}
	
	a1 = 'implies' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createImplies();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 37, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_10);
	}
	
	(
		a2_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createImplies();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_9_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 38);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 38);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 38);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 38);
	}
	
;

parse_syntax_Neg returns [syntax.Neg element = null]
@init{
}
:
	a0 = '!' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createNeg();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 39, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_11);
	}
	
	(
		a1_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNeg();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NEG__UNARY_OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_10_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 40);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 40);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 40);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 40);
	}
	
;

parse_syntax_Plus returns [syntax.Plus element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createPlus();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_11_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 41);
	}
	
	a1 = '+' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createPlus();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createPlus();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_11_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 43);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 43);
	}
	
;

parse_syntax_Minus returns [syntax.Minus element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMinus();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_12_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 44);
	}
	
	a1 = '-' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createMinus();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_12_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMinus();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_12_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 46);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 46);
	}
	
;

parse_syntax_Mul returns [syntax.Mul element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMul();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_13_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 47);
	}
	
	a1 = '*' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createMul();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_13_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMul();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_13_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 49);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 49);
	}
	
;

parse_syntax_Div returns [syntax.Div element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand1		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createDiv();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_14_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 50);
	}
	
	a1 = '/' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createDiv();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createDiv();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_14_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 52);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 52);
	}
	
;

parse_syntax_Context returns [syntax.Context element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_MultipleFeature		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createContext();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_15_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_35, 53);
	}
	
	a1 = '[' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createContext();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_1, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_12, 54, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_13);
	}
	
	(
		a2_0 = parse_syntax_Constraint		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createContext();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_15_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 55);
	}
	
	a3 = ']' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createContext();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_15_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 56);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 56);
	}
	
;

parse_syntax_All returns [syntax.All element = null]
@init{
}
:
	a0 = 'all' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createAll();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 57, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
	}
	
	(
		a1_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createAll();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.ALL__SELECTION_OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_16_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 58);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 58);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 58);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 58);
	}
	
;

parse_syntax_Any returns [syntax.Any element = null]
@init{
}
:
	a0 = 'any' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createAny();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_17_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_21, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_3, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_6, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_7, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_4, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_0, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_8, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 59, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_7, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_9, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_14);
	}
	
	(
		a1_0 = parse_syntax_BoolPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createAny();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.ANY__SELECTION_OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_17_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 60);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 60);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 60);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 60);
	}
	
;

parse_syntax_More returns [syntax.More element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMore();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_18_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 61);
	}
	
	a1 = '>' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createMore();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_18_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMore();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_18_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 63);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 63);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 63);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 63);
	}
	
;

parse_syntax_MoreOrEqual returns [syntax.MoreOrEqual element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMoreOrEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_19_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 64);
	}
	
	a1 = '>=' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createMoreOrEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_19_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMoreOrEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_19_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 66);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 66);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 66);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 66);
	}
	
;

parse_syntax_Less returns [syntax.Less element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createLess();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_20_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 67);
	}
	
	a1 = '<' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createLess();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_20_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createLess();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_20_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 69);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 69);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 69);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 69);
	}
	
;

parse_syntax_LessOrEqual returns [syntax.LessOrEqual element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createLessOrEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_21_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 70);
	}
	
	a1 = '<=' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createLessOrEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_21_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createLessOrEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_21_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 72);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 72);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 72);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 72);
	}
	
;

parse_syntax_NotEqual returns [syntax.NotEqual element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNotEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_22_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 73);
	}
	
	a1 = '!=' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createNotEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_22_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNotEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_22_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 75);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 75);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 75);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 75);
	}
	
;

parse_syntax_Equal returns [syntax.Equal element = null]
@init{
}
:
	(
		a0_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createEqual();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP1), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_23_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 76);
	}
	
	a1 = '==' {
		if (element == null) {
			element = syntax.SyntaxFactory.eINSTANCE.createEqual();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_23_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
	}
	
	(
		a2_0 = parse_syntax_NumPriorityOperand2		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createEqual();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP2), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_23_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 78);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 78);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 78);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 78);
	}
	
;

parse_syntax_SimpleFeature returns [syntax.SimpleFeature element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createSimpleFeature();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				syntax.resource.constraint.IConstraintTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				syntax.resource.constraint.IConstraintTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(syntax.SyntaxPackage.SIMPLE_FEATURE__FEATURE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.SIMPLE_FEATURE__FEATURE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_24_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 79);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 79);
	}
	
;

parse_syntax_MultipleFeature returns [syntax.MultipleFeature element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createMultipleFeature();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				syntax.resource.constraint.IConstraintTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				syntax.resource.constraint.IConstraintTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MULTIPLE_FEATURE__FEATURE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MULTIPLE_FEATURE__FEATURE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_25_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 80);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 80);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_syntax_SimpleFeature{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_syntax_Number returns [syntax.Number element = null]
@init{
}
:
	(
		a0 = DIGIT		
		{
			if (terminateParsing) {
				throw new syntax.resource.constraint.mopp.ConstraintTerminateParsingException();
			}
			if (element == null) {
				element = syntax.SyntaxFactory.eINSTANCE.createNumber();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				syntax.resource.constraint.IConstraintTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIGIT");
				tokenResolver.setOptions(getOptions());
				syntax.resource.constraint.IConstraintTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUMBER__NUM_VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUMBER__NUM_VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_26_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 81);
		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 81);
	}
	
;

parse_syntax_Operand returns [syntax.Operand element = null]
:
	c0 = parse_syntax_And{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_syntax_Or{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_syntax_Xor{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_syntax_Implies{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_syntax_Neg{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_syntax_Plus{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_syntax_Minus{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_syntax_Mul{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_syntax_Div{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_syntax_Context{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_syntax_All{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_syntax_Any{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_syntax_More{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_syntax_MoreOrEqual{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_syntax_Less{ element = c14; /* this is a subclass or primitive expression choice */ }
	|	c15 = parse_syntax_LessOrEqual{ element = c15; /* this is a subclass or primitive expression choice */ }
	|	c16 = parse_syntax_NotEqual{ element = c16; /* this is a subclass or primitive expression choice */ }
	|	c17 = parse_syntax_Equal{ element = c17; /* this is a subclass or primitive expression choice */ }
	|	c18 = parse_syntax_SimpleFeature{ element = c18; /* this is a subclass or primitive expression choice */ }
	|	c19 = parse_syntax_MultipleFeature{ element = c19; /* this is a subclass or primitive expression choice */ }
	|	c20 = parse_syntax_Number{ element = c20; /* this is a subclass or primitive expression choice */ }
	
;

parse_syntax_BoolOperand returns [syntax.BoolOperand element = null]
:
	c0 = parse_syntax_And{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_syntax_Or{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_syntax_Xor{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_syntax_Implies{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_syntax_Neg{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_syntax_Context{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_syntax_All{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_syntax_Any{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_syntax_More{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_syntax_MoreOrEqual{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_syntax_Less{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_syntax_LessOrEqual{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_syntax_NotEqual{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_syntax_Equal{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_syntax_SimpleFeature{ element = c14; /* this is a subclass or primitive expression choice */ }
	
;

parse_syntax_BoolOperandChoices returns [syntax.BoolOperandChoices element = null]
:
	c0 = parse_syntax_Context{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_syntax_All{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_syntax_Any{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_syntax_SimpleFeature{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_syntax_NumOperandChoices returns [syntax.NumOperandChoices element = null]
:
	c0 = parse_syntax_Context{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_syntax_SimpleFeature{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_syntax_MultipleFeature{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_syntax_Number{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_syntax_NumOperand returns [syntax.NumOperand element = null]
:
	c0 = parse_syntax_Plus{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_syntax_Minus{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_syntax_Mul{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_syntax_Div{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_syntax_Context{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_syntax_SimpleFeature{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_syntax_MultipleFeature{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_syntax_Number{ element = c7; /* this is a subclass or primitive expression choice */ }
	
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

