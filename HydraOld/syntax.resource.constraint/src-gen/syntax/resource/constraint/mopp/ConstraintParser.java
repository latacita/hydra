// $ANTLR ${project.version} ${buildNumber}

	package syntax.resource.constraint.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class ConstraintParser extends ConstraintANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "DIGIT", "WHITESPACE", "LINEBREAK", "'import'", "';'", "'('", "')'", "'and'", "'or'", "'xor'", "'implies'", "'!'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'all'", "'any'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='"
    };
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int TEXT=4;
    public static final int DIGIT=5;
    public static final int WHITESPACE=6;
    public static final int LINEBREAK=7;

    // delegates
    // delegators


        public ConstraintParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ConstraintParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[87+1];
             
             
        }
        

    public String[] getTokenNames() { return ConstraintParser.tokenNames; }
    public String getGrammarFileName() { return "Constraint.g"; }


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
    	



    // $ANTLR start "start"
    // Constraint.g:541:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_syntax_Model ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        syntax.Model c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Constraint.g:542:1: ( (c0= parse_syntax_Model ) EOF )
            // Constraint.g:543:2: (c0= parse_syntax_Model ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Constraint.g:548:2: (c0= parse_syntax_Model )
            // Constraint.g:549:3: c0= parse_syntax_Model
            {
            pushFollow(FOLLOW_parse_syntax_Model_in_start82);
            c0=parse_syntax_Model();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_syntax_Model"
    // Constraint.g:557:1: parse_syntax_Model returns [syntax.Model element = null] : a0= 'import' (a1= TEXT ) a2= ';' ( ( (a3_0= parse_syntax_Constraint ) a4= ';' ) )* ;
    public final syntax.Model parse_syntax_Model() throws RecognitionException {
        syntax.Model element =  null;
        int parse_syntax_Model_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        syntax.Constraint a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Constraint.g:560:1: (a0= 'import' (a1= TEXT ) a2= ';' ( ( (a3_0= parse_syntax_Constraint ) a4= ';' ) )* )
            // Constraint.g:561:2: a0= 'import' (a1= TEXT ) a2= ';' ( ( (a3_0= parse_syntax_Constraint ) a4= ';' ) )*
            {
            a0=(Token)match(input,8,FOLLOW_8_in_parse_syntax_Model115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_1, 1);
              	
            }
            // Constraint.g:575:2: (a1= TEXT )
            // Constraint.g:576:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_syntax_Model133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_2, 2);
              	
            }
            a2=(Token)match(input,9,FOLLOW_9_in_parse_syntax_Model154); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:634:2: ( ( (a3_0= parse_syntax_Constraint ) a4= ';' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=TEXT && LA1_0<=DIGIT)||LA1_0==10||LA1_0==16||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Constraint.g:635:3: ( (a3_0= parse_syntax_Constraint ) a4= ';' )
            	    {
            	    // Constraint.g:635:3: ( (a3_0= parse_syntax_Constraint ) a4= ';' )
            	    // Constraint.g:636:4: (a3_0= parse_syntax_Constraint ) a4= ';'
            	    {
            	    // Constraint.g:636:4: (a3_0= parse_syntax_Constraint )
            	    // Constraint.g:637:5: a3_0= parse_syntax_Constraint
            	    {
            	    pushFollow(FOLLOW_parse_syntax_Constraint_in_parse_syntax_Model183);
            	    a3_0=parse_syntax_Constraint();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 4);
            	      			
            	    }
            	    a4=(Token)match(input,9,FOLLOW_9_in_parse_syntax_Model211); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = syntax.SyntaxFactory.eINSTANCE.createModel();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_0_0_0_3_0_0_1, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_syntax_Model_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Model"


    // $ANTLR start "parse_syntax_Constraint"
    // Constraint.g:703:1: parse_syntax_Constraint returns [syntax.Constraint element = null] : ( (a0_0= parse_syntax_Operand ) | a1= '(' (a2_0= parse_syntax_Operand ) a3= ')' );
    public final syntax.Constraint parse_syntax_Constraint() throws RecognitionException {
        syntax.Constraint element =  null;
        int parse_syntax_Constraint_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        syntax.Operand a0_0 = null;

        syntax.Operand a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Constraint.g:706:1: ( (a0_0= parse_syntax_Operand ) | a1= '(' (a2_0= parse_syntax_Operand ) a3= ')' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_Constraint()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=TEXT && LA2_0<=DIGIT)||LA2_0==16||(LA2_0>=23 && LA2_0<=24)) ) {
                alt2=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Constraint.g:707:2: (a0_0= parse_syntax_Operand )
                    {
                    // Constraint.g:707:2: (a0_0= parse_syntax_Operand )
                    // Constraint.g:708:3: a0_0= parse_syntax_Operand
                    {
                    pushFollow(FOLLOW_parse_syntax_Operand_in_parse_syntax_Constraint263);
                    a0_0=parse_syntax_Operand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 7);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 7);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:735:4: a1= '(' (a2_0= parse_syntax_Operand ) a3= ')'
                    {
                    a1=(Token)match(input,10,FOLLOW_10_in_parse_syntax_Constraint285); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createConstraint();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_1_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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
                    // Constraint.g:757:2: (a2_0= parse_syntax_Operand )
                    // Constraint.g:758:3: a2_0= parse_syntax_Operand
                    {
                    pushFollow(FOLLOW_parse_syntax_Operand_in_parse_syntax_Constraint303);
                    a2_0=parse_syntax_Operand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_15, 9);
                      	
                    }
                    a3=(Token)match(input,11,FOLLOW_11_in_parse_syntax_Constraint321); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createConstraint();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_1_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 10);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 10);
                      	
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_syntax_Constraint_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Constraint"


    // $ANTLR start "parse_syntax_BoolPriorityOperand1"
    // Constraint.g:800:1: parse_syntax_BoolPriorityOperand1 returns [syntax.BoolPriorityOperand1 element = null] : (a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')' | (a3_0= parse_syntax_BoolOperandChoices ) );
    public final syntax.BoolPriorityOperand1 parse_syntax_BoolPriorityOperand1() throws RecognitionException {
        syntax.BoolPriorityOperand1 element =  null;
        int parse_syntax_BoolPriorityOperand1_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        syntax.BoolOperand a1_0 = null;

        syntax.BoolOperandChoices a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Constraint.g:803:1: (a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')' | (a3_0= parse_syntax_BoolOperandChoices ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==TEXT||(LA3_0>=23 && LA3_0<=24)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Constraint.g:804:2: a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')'
                    {
                    a0=(Token)match(input,10,FOLLOW_10_in_parse_syntax_BoolPriorityOperand1350); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_2_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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
                    // Constraint.g:826:2: (a1_0= parse_syntax_BoolOperand )
                    // Constraint.g:827:3: a1_0= parse_syntax_BoolOperand
                    {
                    pushFollow(FOLLOW_parse_syntax_BoolOperand_in_parse_syntax_BoolPriorityOperand1368);
                    a1_0=parse_syntax_BoolOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 12);
                      	
                    }
                    a2=(Token)match(input,11,FOLLOW_11_in_parse_syntax_BoolPriorityOperand1386); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_2_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_17, 13);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_18, 13);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_19, 13);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_20, 13);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:870:4: (a3_0= parse_syntax_BoolOperandChoices )
                    {
                    // Constraint.g:870:4: (a3_0= parse_syntax_BoolOperandChoices )
                    // Constraint.g:871:3: a3_0= parse_syntax_BoolOperandChoices
                    {
                    pushFollow(FOLLOW_parse_syntax_BoolOperandChoices_in_parse_syntax_BoolPriorityOperand1408);
                    a3_0=parse_syntax_BoolOperandChoices();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_17, 14);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_18, 14);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_19, 14);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_20, 14);
                      	
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_syntax_BoolPriorityOperand1_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_BoolPriorityOperand1"


    // $ANTLR start "parse_syntax_BoolPriorityOperand2"
    // Constraint.g:901:1: parse_syntax_BoolPriorityOperand2 returns [syntax.BoolPriorityOperand2 element = null] : (a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')' | (a3_0= parse_syntax_BoolOperand ) );
    public final syntax.BoolPriorityOperand2 parse_syntax_BoolPriorityOperand2() throws RecognitionException {
        syntax.BoolPriorityOperand2 element =  null;
        int parse_syntax_BoolPriorityOperand2_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        syntax.BoolOperand a1_0 = null;

        syntax.BoolOperand a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Constraint.g:904:1: (a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')' | (a3_0= parse_syntax_BoolOperand ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4_Constraint()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=TEXT && LA4_0<=DIGIT)||LA4_0==16||(LA4_0>=23 && LA4_0<=24)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Constraint.g:905:2: a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')'
                    {
                    a0=(Token)match(input,10,FOLLOW_10_in_parse_syntax_BoolPriorityOperand2441); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_3_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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
                    // Constraint.g:927:2: (a1_0= parse_syntax_BoolOperand )
                    // Constraint.g:928:3: a1_0= parse_syntax_BoolOperand
                    {
                    pushFollow(FOLLOW_parse_syntax_BoolOperand_in_parse_syntax_BoolPriorityOperand2459);
                    a1_0=parse_syntax_BoolOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 16);
                      	
                    }
                    a2=(Token)match(input,11,FOLLOW_11_in_parse_syntax_BoolPriorityOperand2477); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createBoolPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_3_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 17);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 17);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 17);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 17);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:971:4: (a3_0= parse_syntax_BoolOperand )
                    {
                    // Constraint.g:971:4: (a3_0= parse_syntax_BoolOperand )
                    // Constraint.g:972:3: a3_0= parse_syntax_BoolOperand
                    {
                    pushFollow(FOLLOW_parse_syntax_BoolOperand_in_parse_syntax_BoolPriorityOperand2499);
                    a3_0=parse_syntax_BoolOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 18);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 18);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 18);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 18);
                      	
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_syntax_BoolPriorityOperand2_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_BoolPriorityOperand2"


    // $ANTLR start "parse_syntax_NumPriorityOperand1"
    // Constraint.g:1002:1: parse_syntax_NumPriorityOperand1 returns [syntax.NumPriorityOperand1 element = null] : ( (a0_0= parse_syntax_NumOperandChoices ) | a1= '(' (a2_0= parse_syntax_NumOperand ) a3= ')' );
    public final syntax.NumPriorityOperand1 parse_syntax_NumPriorityOperand1() throws RecognitionException {
        syntax.NumPriorityOperand1 element =  null;
        int parse_syntax_NumPriorityOperand1_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        syntax.NumOperandChoices a0_0 = null;

        syntax.NumOperand a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Constraint.g:1005:1: ( (a0_0= parse_syntax_NumOperandChoices ) | a1= '(' (a2_0= parse_syntax_NumOperand ) a3= ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=TEXT && LA5_0<=DIGIT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==10) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Constraint.g:1006:2: (a0_0= parse_syntax_NumOperandChoices )
                    {
                    // Constraint.g:1006:2: (a0_0= parse_syntax_NumOperandChoices )
                    // Constraint.g:1007:3: a0_0= parse_syntax_NumOperandChoices
                    {
                    pushFollow(FOLLOW_parse_syntax_NumOperandChoices_in_parse_syntax_NumPriorityOperand1536);
                    a0_0=parse_syntax_NumOperandChoices();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 19);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 19);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 19);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 19);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:1036:4: a1= '(' (a2_0= parse_syntax_NumOperand ) a3= ')'
                    {
                    a1=(Token)match(input,10,FOLLOW_10_in_parse_syntax_NumPriorityOperand1558); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_4_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 20, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5);
                      	
                    }
                    // Constraint.g:1053:2: (a2_0= parse_syntax_NumOperand )
                    // Constraint.g:1054:3: a2_0= parse_syntax_NumOperand
                    {
                    pushFollow(FOLLOW_parse_syntax_NumOperand_in_parse_syntax_NumPriorityOperand1576);
                    a2_0=parse_syntax_NumOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_27, 21);
                      	
                    }
                    a3=(Token)match(input,11,FOLLOW_11_in_parse_syntax_NumPriorityOperand1594); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_4_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 22);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 22);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 22);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 22);
                      	
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_syntax_NumPriorityOperand1_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_NumPriorityOperand1"


    // $ANTLR start "parse_syntax_NumPriorityOperand2"
    // Constraint.g:1098:1: parse_syntax_NumPriorityOperand2 returns [syntax.NumPriorityOperand2 element = null] : ( (a0_0= parse_syntax_NumOperand ) | a1= '(' (a2_0= parse_syntax_NumOperand ) a3= ')' );
    public final syntax.NumPriorityOperand2 parse_syntax_NumPriorityOperand2() throws RecognitionException {
        syntax.NumPriorityOperand2 element =  null;
        int parse_syntax_NumPriorityOperand2_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        syntax.NumOperand a0_0 = null;

        syntax.NumOperand a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Constraint.g:1101:1: ( (a0_0= parse_syntax_NumOperand ) | a1= '(' (a2_0= parse_syntax_NumOperand ) a3= ')' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=TEXT && LA6_0<=DIGIT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==10) ) {
                int LA6_3 = input.LA(2);

                if ( (synpred6_Constraint()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Constraint.g:1102:2: (a0_0= parse_syntax_NumOperand )
                    {
                    // Constraint.g:1102:2: (a0_0= parse_syntax_NumOperand )
                    // Constraint.g:1103:3: a0_0= parse_syntax_NumOperand
                    {
                    pushFollow(FOLLOW_parse_syntax_NumOperand_in_parse_syntax_NumPriorityOperand2627);
                    a0_0=parse_syntax_NumOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // Constraint.g:1137:4: a1= '(' (a2_0= parse_syntax_NumOperand ) a3= ')'
                    {
                    a1=(Token)match(input,10,FOLLOW_10_in_parse_syntax_NumPriorityOperand2649); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_5_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 24, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8);
                      	
                    }
                    // Constraint.g:1154:2: (a2_0= parse_syntax_NumOperand )
                    // Constraint.g:1155:3: a2_0= parse_syntax_NumOperand
                    {
                    pushFollow(FOLLOW_parse_syntax_NumOperand_in_parse_syntax_NumPriorityOperand2667);
                    a2_0=parse_syntax_NumOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_34, 25);
                      	
                    }
                    a3=(Token)match(input,11,FOLLOW_11_in_parse_syntax_NumPriorityOperand2685); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = syntax.SyntaxFactory.eINSTANCE.createNumPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_5_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_syntax_NumPriorityOperand2_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_NumPriorityOperand2"


    // $ANTLR start "parse_syntax_And"
    // Constraint.g:1204:1: parse_syntax_And returns [syntax.And element = null] : (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'and' (a2_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.And parse_syntax_And() throws RecognitionException {
        syntax.And element =  null;
        int parse_syntax_And_StartIndex = input.index();
        Token a1=null;
        syntax.BoolPriorityOperand1 a0_0 = null;

        syntax.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Constraint.g:1207:1: ( (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'and' (a2_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:1208:2: (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'and' (a2_0= parse_syntax_BoolPriorityOperand2 )
            {
            // Constraint.g:1208:2: (a0_0= parse_syntax_BoolPriorityOperand1 )
            // Constraint.g:1209:3: a0_0= parse_syntax_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_And718);
            a0_0=parse_syntax_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_17, 27);
              	
            }
            a1=(Token)match(input,12,FOLLOW_12_in_parse_syntax_And736); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createAnd();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:1257:2: (a2_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:1258:3: a2_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_And754);
            a2_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 29);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 29);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 29);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 29);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_syntax_And_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_And"


    // $ANTLR start "parse_syntax_Or"
    // Constraint.g:1288:1: parse_syntax_Or returns [syntax.Or element = null] : (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'or' (a2_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.Or parse_syntax_Or() throws RecognitionException {
        syntax.Or element =  null;
        int parse_syntax_Or_StartIndex = input.index();
        Token a1=null;
        syntax.BoolPriorityOperand1 a0_0 = null;

        syntax.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Constraint.g:1291:1: ( (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'or' (a2_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:1292:2: (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'or' (a2_0= parse_syntax_BoolPriorityOperand2 )
            {
            // Constraint.g:1292:2: (a0_0= parse_syntax_BoolPriorityOperand1 )
            // Constraint.g:1293:3: a0_0= parse_syntax_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_Or791);
            a0_0=parse_syntax_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_18, 30);
              	
            }
            a1=(Token)match(input,13,FOLLOW_13_in_parse_syntax_Or809); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createOr();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_7_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:1341:2: (a2_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:1342:3: a2_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Or827);
            a2_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 32);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 32);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 32);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 32);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_syntax_Or_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Or"


    // $ANTLR start "parse_syntax_Xor"
    // Constraint.g:1372:1: parse_syntax_Xor returns [syntax.Xor element = null] : (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'xor' (a2_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.Xor parse_syntax_Xor() throws RecognitionException {
        syntax.Xor element =  null;
        int parse_syntax_Xor_StartIndex = input.index();
        Token a1=null;
        syntax.BoolPriorityOperand1 a0_0 = null;

        syntax.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Constraint.g:1375:1: ( (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'xor' (a2_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:1376:2: (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'xor' (a2_0= parse_syntax_BoolPriorityOperand2 )
            {
            // Constraint.g:1376:2: (a0_0= parse_syntax_BoolPriorityOperand1 )
            // Constraint.g:1377:3: a0_0= parse_syntax_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_Xor864);
            a0_0=parse_syntax_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_19, 33);
              	
            }
            a1=(Token)match(input,14,FOLLOW_14_in_parse_syntax_Xor882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createXor();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_8_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:1425:2: (a2_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:1426:3: a2_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Xor900);
            a2_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 35);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 35);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 35);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 35);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_syntax_Xor_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Xor"


    // $ANTLR start "parse_syntax_Implies"
    // Constraint.g:1456:1: parse_syntax_Implies returns [syntax.Implies element = null] : (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'implies' (a2_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.Implies parse_syntax_Implies() throws RecognitionException {
        syntax.Implies element =  null;
        int parse_syntax_Implies_StartIndex = input.index();
        Token a1=null;
        syntax.BoolPriorityOperand1 a0_0 = null;

        syntax.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Constraint.g:1459:1: ( (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'implies' (a2_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:1460:2: (a0_0= parse_syntax_BoolPriorityOperand1 ) a1= 'implies' (a2_0= parse_syntax_BoolPriorityOperand2 )
            {
            // Constraint.g:1460:2: (a0_0= parse_syntax_BoolPriorityOperand1 )
            // Constraint.g:1461:3: a0_0= parse_syntax_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_Implies937);
            a0_0=parse_syntax_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_20, 36);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_syntax_Implies955); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createImplies();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_9_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:1509:2: (a2_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:1510:3: a2_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Implies973);
            a2_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 38);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 38);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 38);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 38);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_syntax_Implies_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Implies"


    // $ANTLR start "parse_syntax_Neg"
    // Constraint.g:1540:1: parse_syntax_Neg returns [syntax.Neg element = null] : a0= '!' (a1_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.Neg parse_syntax_Neg() throws RecognitionException {
        syntax.Neg element =  null;
        int parse_syntax_Neg_StartIndex = input.index();
        Token a0=null;
        syntax.BoolPriorityOperand2 a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Constraint.g:1543:1: (a0= '!' (a1_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:1544:2: a0= '!' (a1_0= parse_syntax_BoolPriorityOperand2 )
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_syntax_Neg1006); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createNeg();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_10_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:1567:2: (a1_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:1568:3: a1_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Neg1024);
            a1_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 40);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 40);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 40);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 40);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_syntax_Neg_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Neg"


    // $ANTLR start "parse_syntax_Plus"
    // Constraint.g:1598:1: parse_syntax_Plus returns [syntax.Plus element = null] : (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '+' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.Plus parse_syntax_Plus() throws RecognitionException {
        syntax.Plus element =  null;
        int parse_syntax_Plus_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand1 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Constraint.g:1601:1: ( (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '+' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:1602:2: (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '+' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:1602:2: (a0_0= parse_syntax_NumPriorityOperand1 )
            // Constraint.g:1603:3: a0_0= parse_syntax_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Plus1061);
            a0_0=parse_syntax_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_23, 41);
              	
            }
            a1=(Token)match(input,17,FOLLOW_17_in_parse_syntax_Plus1079); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createPlus();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_11_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 42, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              	
            }
            // Constraint.g:1646:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:1647:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Plus1097);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_syntax_Plus_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Plus"


    // $ANTLR start "parse_syntax_Minus"
    // Constraint.g:1682:1: parse_syntax_Minus returns [syntax.Minus element = null] : (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '-' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.Minus parse_syntax_Minus() throws RecognitionException {
        syntax.Minus element =  null;
        int parse_syntax_Minus_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand1 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Constraint.g:1685:1: ( (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '-' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:1686:2: (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '-' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:1686:2: (a0_0= parse_syntax_NumPriorityOperand1 )
            // Constraint.g:1687:3: a0_0= parse_syntax_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Minus1134);
            a0_0=parse_syntax_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_24, 44);
              	
            }
            a1=(Token)match(input,18,FOLLOW_18_in_parse_syntax_Minus1152); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createMinus();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_12_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 45, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              	
            }
            // Constraint.g:1730:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:1731:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Minus1170);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_syntax_Minus_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Minus"


    // $ANTLR start "parse_syntax_Mul"
    // Constraint.g:1766:1: parse_syntax_Mul returns [syntax.Mul element = null] : (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '*' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.Mul parse_syntax_Mul() throws RecognitionException {
        syntax.Mul element =  null;
        int parse_syntax_Mul_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand1 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Constraint.g:1769:1: ( (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '*' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:1770:2: (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '*' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:1770:2: (a0_0= parse_syntax_NumPriorityOperand1 )
            // Constraint.g:1771:3: a0_0= parse_syntax_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Mul1207);
            a0_0=parse_syntax_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_25, 47);
              	
            }
            a1=(Token)match(input,19,FOLLOW_19_in_parse_syntax_Mul1225); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createMul();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_13_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 48, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              	
            }
            // Constraint.g:1814:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:1815:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Mul1243);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_syntax_Mul_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Mul"


    // $ANTLR start "parse_syntax_Div"
    // Constraint.g:1850:1: parse_syntax_Div returns [syntax.Div element = null] : (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '/' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.Div parse_syntax_Div() throws RecognitionException {
        syntax.Div element =  null;
        int parse_syntax_Div_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand1 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Constraint.g:1853:1: ( (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '/' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:1854:2: (a0_0= parse_syntax_NumPriorityOperand1 ) a1= '/' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:1854:2: (a0_0= parse_syntax_NumPriorityOperand1 )
            // Constraint.g:1855:3: a0_0= parse_syntax_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Div1280);
            a0_0=parse_syntax_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_26, 50);
              	
            }
            a1=(Token)match(input,20,FOLLOW_20_in_parse_syntax_Div1298); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createDiv();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_14_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 51, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_12);
              	
            }
            // Constraint.g:1898:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:1899:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Div1316);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_syntax_Div_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Div"


    // $ANTLR start "parse_syntax_Context"
    // Constraint.g:1934:1: parse_syntax_Context returns [syntax.Context element = null] : (a0_0= parse_syntax_MultipleFeature ) a1= '[' (a2_0= parse_syntax_Constraint ) a3= ']' ;
    public final syntax.Context parse_syntax_Context() throws RecognitionException {
        syntax.Context element =  null;
        int parse_syntax_Context_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        syntax.MultipleFeature a0_0 = null;

        syntax.Constraint a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Constraint.g:1937:1: ( (a0_0= parse_syntax_MultipleFeature ) a1= '[' (a2_0= parse_syntax_Constraint ) a3= ']' )
            // Constraint.g:1938:2: (a0_0= parse_syntax_MultipleFeature ) a1= '[' (a2_0= parse_syntax_Constraint ) a3= ']'
            {
            // Constraint.g:1938:2: (a0_0= parse_syntax_MultipleFeature )
            // Constraint.g:1939:3: a0_0= parse_syntax_MultipleFeature
            {
            pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_Context1353);
            a0_0=parse_syntax_MultipleFeature();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_35, 53);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_syntax_Context1371); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createContext();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_15_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:1987:2: (a2_0= parse_syntax_Constraint )
            // Constraint.g:1988:3: a2_0= parse_syntax_Constraint
            {
            pushFollow(FOLLOW_parse_syntax_Constraint_in_parse_syntax_Context1389);
            a2_0=parse_syntax_Constraint();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 55);
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_syntax_Context1407); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createContext();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_15_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_syntax_Context_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Context"


    // $ANTLR start "parse_syntax_All"
    // Constraint.g:2042:1: parse_syntax_All returns [syntax.All element = null] : a0= 'all' (a1_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.All parse_syntax_All() throws RecognitionException {
        syntax.All element =  null;
        int parse_syntax_All_StartIndex = input.index();
        Token a0=null;
        syntax.BoolPriorityOperand2 a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Constraint.g:2045:1: (a0= 'all' (a1_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:2046:2: a0= 'all' (a1_0= parse_syntax_BoolPriorityOperand2 )
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_syntax_All1436); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createAll();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_16_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:2069:2: (a1_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:2070:3: a1_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_All1454);
            a1_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 58);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 58);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 58);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 58);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_syntax_All_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_All"


    // $ANTLR start "parse_syntax_Any"
    // Constraint.g:2100:1: parse_syntax_Any returns [syntax.Any element = null] : a0= 'any' (a1_0= parse_syntax_BoolPriorityOperand2 ) ;
    public final syntax.Any parse_syntax_Any() throws RecognitionException {
        syntax.Any element =  null;
        int parse_syntax_Any_StartIndex = input.index();
        Token a0=null;
        syntax.BoolPriorityOperand2 a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Constraint.g:2103:1: (a0= 'any' (a1_0= parse_syntax_BoolPriorityOperand2 ) )
            // Constraint.g:2104:2: a0= 'any' (a1_0= parse_syntax_BoolPriorityOperand2 )
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_syntax_Any1487); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createAny();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_17_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Constraint.g:2127:2: (a1_0= parse_syntax_BoolPriorityOperand2 )
            // Constraint.g:2128:3: a1_0= parse_syntax_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Any1505);
            a1_0=parse_syntax_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 60);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 60);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 60);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 60);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_syntax_Any_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Any"


    // $ANTLR start "parse_syntax_More"
    // Constraint.g:2158:1: parse_syntax_More returns [syntax.More element = null] : (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '>' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.More parse_syntax_More() throws RecognitionException {
        syntax.More element =  null;
        int parse_syntax_More_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand2 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Constraint.g:2161:1: ( (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '>' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:2162:2: (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '>' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:2162:2: (a0_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2163:3: a0_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_More1542);
            a0_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_28, 61);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_syntax_More1560); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createMore();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_18_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 62, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              	
            }
            // Constraint.g:2206:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2207:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_More1578);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 63);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 63);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 63);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 63);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_syntax_More_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_More"


    // $ANTLR start "parse_syntax_MoreOrEqual"
    // Constraint.g:2237:1: parse_syntax_MoreOrEqual returns [syntax.MoreOrEqual element = null] : (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '>=' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.MoreOrEqual parse_syntax_MoreOrEqual() throws RecognitionException {
        syntax.MoreOrEqual element =  null;
        int parse_syntax_MoreOrEqual_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand2 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // Constraint.g:2240:1: ( (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '>=' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:2241:2: (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '>=' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:2241:2: (a0_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2242:3: a0_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_MoreOrEqual1615);
            a0_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_29, 64);
              	
            }
            a1=(Token)match(input,26,FOLLOW_26_in_parse_syntax_MoreOrEqual1633); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createMoreOrEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_19_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 65, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              	
            }
            // Constraint.g:2285:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2286:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_MoreOrEqual1651);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 66);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 66);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 66);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 66);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_syntax_MoreOrEqual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_MoreOrEqual"


    // $ANTLR start "parse_syntax_Less"
    // Constraint.g:2316:1: parse_syntax_Less returns [syntax.Less element = null] : (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '<' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.Less parse_syntax_Less() throws RecognitionException {
        syntax.Less element =  null;
        int parse_syntax_Less_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand2 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // Constraint.g:2319:1: ( (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '<' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:2320:2: (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '<' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:2320:2: (a0_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2321:3: a0_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Less1688);
            a0_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_30, 67);
              	
            }
            a1=(Token)match(input,27,FOLLOW_27_in_parse_syntax_Less1706); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createLess();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_20_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 68, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              	
            }
            // Constraint.g:2364:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2365:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Less1724);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 69);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 69);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 69);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 69);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_syntax_Less_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Less"


    // $ANTLR start "parse_syntax_LessOrEqual"
    // Constraint.g:2395:1: parse_syntax_LessOrEqual returns [syntax.LessOrEqual element = null] : (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '<=' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.LessOrEqual parse_syntax_LessOrEqual() throws RecognitionException {
        syntax.LessOrEqual element =  null;
        int parse_syntax_LessOrEqual_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand2 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // Constraint.g:2398:1: ( (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '<=' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:2399:2: (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '<=' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:2399:2: (a0_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2400:3: a0_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_LessOrEqual1761);
            a0_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_31, 70);
              	
            }
            a1=(Token)match(input,28,FOLLOW_28_in_parse_syntax_LessOrEqual1779); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createLessOrEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_21_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 71, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              	
            }
            // Constraint.g:2443:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2444:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_LessOrEqual1797);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 72);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 72);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 72);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 72);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_syntax_LessOrEqual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_LessOrEqual"


    // $ANTLR start "parse_syntax_NotEqual"
    // Constraint.g:2474:1: parse_syntax_NotEqual returns [syntax.NotEqual element = null] : (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '!=' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.NotEqual parse_syntax_NotEqual() throws RecognitionException {
        syntax.NotEqual element =  null;
        int parse_syntax_NotEqual_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand2 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // Constraint.g:2477:1: ( (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '!=' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:2478:2: (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '!=' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:2478:2: (a0_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2479:3: a0_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_NotEqual1834);
            a0_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_32, 73);
              	
            }
            a1=(Token)match(input,29,FOLLOW_29_in_parse_syntax_NotEqual1852); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createNotEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_22_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 74, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              	
            }
            // Constraint.g:2522:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2523:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_NotEqual1870);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 75);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 75);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 75);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 75);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_syntax_NotEqual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_NotEqual"


    // $ANTLR start "parse_syntax_Equal"
    // Constraint.g:2553:1: parse_syntax_Equal returns [syntax.Equal element = null] : (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '==' (a2_0= parse_syntax_NumPriorityOperand2 ) ;
    public final syntax.Equal parse_syntax_Equal() throws RecognitionException {
        syntax.Equal element =  null;
        int parse_syntax_Equal_StartIndex = input.index();
        Token a1=null;
        syntax.NumPriorityOperand2 a0_0 = null;

        syntax.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // Constraint.g:2556:1: ( (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '==' (a2_0= parse_syntax_NumPriorityOperand2 ) )
            // Constraint.g:2557:2: (a0_0= parse_syntax_NumPriorityOperand2 ) a1= '==' (a2_0= parse_syntax_NumPriorityOperand2 )
            {
            // Constraint.g:2557:2: (a0_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2558:3: a0_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Equal1907);
            a0_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_33, 76);
              	
            }
            a1=(Token)match(input,30,FOLLOW_30_in_parse_syntax_Equal1925); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = syntax.SyntaxFactory.eINSTANCE.createEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, syntax.resource.constraint.grammar.ConstraintGrammarInformationProvider.CONSTRAINT_23_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_4, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_5, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_3, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_9, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_5, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_10, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_6, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_8, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_11, 77, syntax.resource.constraint.grammar.ConstraintFollowSetProvider.FEATURE_15);
              	
            }
            // Constraint.g:2601:2: (a2_0= parse_syntax_NumPriorityOperand2 )
            // Constraint.g:2602:3: a2_0= parse_syntax_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Equal1943);
            a2_0=parse_syntax_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_13, 78);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_14, 78);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_16, 78);
              		addExpectedElement(syntax.resource.constraint.grammar.ConstraintFollowSetProvider.TERMINAL_22, 78);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_syntax_Equal_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Equal"


    // $ANTLR start "parse_syntax_SimpleFeature"
    // Constraint.g:2632:1: parse_syntax_SimpleFeature returns [syntax.SimpleFeature element = null] : (a0= TEXT ) ;
    public final syntax.SimpleFeature parse_syntax_SimpleFeature() throws RecognitionException {
        syntax.SimpleFeature element =  null;
        int parse_syntax_SimpleFeature_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // Constraint.g:2635:1: ( (a0= TEXT ) )
            // Constraint.g:2636:2: (a0= TEXT )
            {
            // Constraint.g:2636:2: (a0= TEXT )
            // Constraint.g:2637:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_syntax_SimpleFeature1980); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_syntax_SimpleFeature_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_SimpleFeature"


    // $ANTLR start "parse_syntax_MultipleFeature"
    // Constraint.g:2687:1: parse_syntax_MultipleFeature returns [syntax.MultipleFeature element = null] : ( (a0= TEXT ) | c0= parse_syntax_SimpleFeature );
    public final syntax.MultipleFeature parse_syntax_MultipleFeature() throws RecognitionException {
        syntax.MultipleFeature element =  null;
        int parse_syntax_MultipleFeature_StartIndex = input.index();
        Token a0=null;
        syntax.SimpleFeature c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // Constraint.g:2690:1: ( (a0= TEXT ) | c0= parse_syntax_SimpleFeature )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TEXT) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred7_Constraint()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Constraint.g:2691:2: (a0= TEXT )
                    {
                    // Constraint.g:2691:2: (a0= TEXT )
                    // Constraint.g:2692:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_syntax_MultipleFeature2020); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // Constraint.g:2740:2: c0= parse_syntax_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_MultipleFeature2046);
                    c0=parse_syntax_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_syntax_MultipleFeature_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_MultipleFeature"


    // $ANTLR start "parse_syntax_Number"
    // Constraint.g:2744:1: parse_syntax_Number returns [syntax.Number element = null] : (a0= DIGIT ) ;
    public final syntax.Number parse_syntax_Number() throws RecognitionException {
        syntax.Number element =  null;
        int parse_syntax_Number_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // Constraint.g:2747:1: ( (a0= DIGIT ) )
            // Constraint.g:2748:2: (a0= DIGIT )
            {
            // Constraint.g:2748:2: (a0= DIGIT )
            // Constraint.g:2749:3: a0= DIGIT
            {
            a0=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_parse_syntax_Number2075); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_syntax_Number_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Number"


    // $ANTLR start "parse_syntax_Operand"
    // Constraint.g:2797:1: parse_syntax_Operand returns [syntax.Operand element = null] : (c0= parse_syntax_And | c1= parse_syntax_Or | c2= parse_syntax_Xor | c3= parse_syntax_Implies | c4= parse_syntax_Neg | c5= parse_syntax_Plus | c6= parse_syntax_Minus | c7= parse_syntax_Mul | c8= parse_syntax_Div | c9= parse_syntax_Context | c10= parse_syntax_All | c11= parse_syntax_Any | c12= parse_syntax_More | c13= parse_syntax_MoreOrEqual | c14= parse_syntax_Less | c15= parse_syntax_LessOrEqual | c16= parse_syntax_NotEqual | c17= parse_syntax_Equal | c18= parse_syntax_SimpleFeature | c19= parse_syntax_MultipleFeature | c20= parse_syntax_Number );
    public final syntax.Operand parse_syntax_Operand() throws RecognitionException {
        syntax.Operand element =  null;
        int parse_syntax_Operand_StartIndex = input.index();
        syntax.And c0 = null;

        syntax.Or c1 = null;

        syntax.Xor c2 = null;

        syntax.Implies c3 = null;

        syntax.Neg c4 = null;

        syntax.Plus c5 = null;

        syntax.Minus c6 = null;

        syntax.Mul c7 = null;

        syntax.Div c8 = null;

        syntax.Context c9 = null;

        syntax.All c10 = null;

        syntax.Any c11 = null;

        syntax.More c12 = null;

        syntax.MoreOrEqual c13 = null;

        syntax.Less c14 = null;

        syntax.LessOrEqual c15 = null;

        syntax.NotEqual c16 = null;

        syntax.Equal c17 = null;

        syntax.SimpleFeature c18 = null;

        syntax.MultipleFeature c19 = null;

        syntax.Number c20 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // Constraint.g:2798:1: (c0= parse_syntax_And | c1= parse_syntax_Or | c2= parse_syntax_Xor | c3= parse_syntax_Implies | c4= parse_syntax_Neg | c5= parse_syntax_Plus | c6= parse_syntax_Minus | c7= parse_syntax_Mul | c8= parse_syntax_Div | c9= parse_syntax_Context | c10= parse_syntax_All | c11= parse_syntax_Any | c12= parse_syntax_More | c13= parse_syntax_MoreOrEqual | c14= parse_syntax_Less | c15= parse_syntax_LessOrEqual | c16= parse_syntax_NotEqual | c17= parse_syntax_Equal | c18= parse_syntax_SimpleFeature | c19= parse_syntax_MultipleFeature | c20= parse_syntax_Number )
            int alt8=21;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // Constraint.g:2799:2: c0= parse_syntax_And
                    {
                    pushFollow(FOLLOW_parse_syntax_And_in_parse_syntax_Operand2107);
                    c0=parse_syntax_And();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:2800:4: c1= parse_syntax_Or
                    {
                    pushFollow(FOLLOW_parse_syntax_Or_in_parse_syntax_Operand2117);
                    c1=parse_syntax_Or();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Constraint.g:2801:4: c2= parse_syntax_Xor
                    {
                    pushFollow(FOLLOW_parse_syntax_Xor_in_parse_syntax_Operand2127);
                    c2=parse_syntax_Xor();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Constraint.g:2802:4: c3= parse_syntax_Implies
                    {
                    pushFollow(FOLLOW_parse_syntax_Implies_in_parse_syntax_Operand2137);
                    c3=parse_syntax_Implies();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Constraint.g:2803:4: c4= parse_syntax_Neg
                    {
                    pushFollow(FOLLOW_parse_syntax_Neg_in_parse_syntax_Operand2147);
                    c4=parse_syntax_Neg();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Constraint.g:2804:4: c5= parse_syntax_Plus
                    {
                    pushFollow(FOLLOW_parse_syntax_Plus_in_parse_syntax_Operand2157);
                    c5=parse_syntax_Plus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Constraint.g:2805:4: c6= parse_syntax_Minus
                    {
                    pushFollow(FOLLOW_parse_syntax_Minus_in_parse_syntax_Operand2167);
                    c6=parse_syntax_Minus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // Constraint.g:2806:4: c7= parse_syntax_Mul
                    {
                    pushFollow(FOLLOW_parse_syntax_Mul_in_parse_syntax_Operand2177);
                    c7=parse_syntax_Mul();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 9 :
                    // Constraint.g:2807:4: c8= parse_syntax_Div
                    {
                    pushFollow(FOLLOW_parse_syntax_Div_in_parse_syntax_Operand2187);
                    c8=parse_syntax_Div();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 10 :
                    // Constraint.g:2808:4: c9= parse_syntax_Context
                    {
                    pushFollow(FOLLOW_parse_syntax_Context_in_parse_syntax_Operand2197);
                    c9=parse_syntax_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 11 :
                    // Constraint.g:2809:4: c10= parse_syntax_All
                    {
                    pushFollow(FOLLOW_parse_syntax_All_in_parse_syntax_Operand2207);
                    c10=parse_syntax_All();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 12 :
                    // Constraint.g:2810:4: c11= parse_syntax_Any
                    {
                    pushFollow(FOLLOW_parse_syntax_Any_in_parse_syntax_Operand2217);
                    c11=parse_syntax_Any();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 13 :
                    // Constraint.g:2811:4: c12= parse_syntax_More
                    {
                    pushFollow(FOLLOW_parse_syntax_More_in_parse_syntax_Operand2227);
                    c12=parse_syntax_More();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 14 :
                    // Constraint.g:2812:4: c13= parse_syntax_MoreOrEqual
                    {
                    pushFollow(FOLLOW_parse_syntax_MoreOrEqual_in_parse_syntax_Operand2237);
                    c13=parse_syntax_MoreOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c13; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 15 :
                    // Constraint.g:2813:4: c14= parse_syntax_Less
                    {
                    pushFollow(FOLLOW_parse_syntax_Less_in_parse_syntax_Operand2247);
                    c14=parse_syntax_Less();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c14; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 16 :
                    // Constraint.g:2814:4: c15= parse_syntax_LessOrEqual
                    {
                    pushFollow(FOLLOW_parse_syntax_LessOrEqual_in_parse_syntax_Operand2257);
                    c15=parse_syntax_LessOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c15; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 17 :
                    // Constraint.g:2815:4: c16= parse_syntax_NotEqual
                    {
                    pushFollow(FOLLOW_parse_syntax_NotEqual_in_parse_syntax_Operand2267);
                    c16=parse_syntax_NotEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c16; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 18 :
                    // Constraint.g:2816:4: c17= parse_syntax_Equal
                    {
                    pushFollow(FOLLOW_parse_syntax_Equal_in_parse_syntax_Operand2277);
                    c17=parse_syntax_Equal();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c17; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 19 :
                    // Constraint.g:2817:4: c18= parse_syntax_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_Operand2287);
                    c18=parse_syntax_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c18; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 20 :
                    // Constraint.g:2818:4: c19= parse_syntax_MultipleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_Operand2297);
                    c19=parse_syntax_MultipleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c19; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 21 :
                    // Constraint.g:2819:4: c20= parse_syntax_Number
                    {
                    pushFollow(FOLLOW_parse_syntax_Number_in_parse_syntax_Operand2307);
                    c20=parse_syntax_Number();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c20; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_syntax_Operand_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_Operand"


    // $ANTLR start "parse_syntax_BoolOperand"
    // Constraint.g:2823:1: parse_syntax_BoolOperand returns [syntax.BoolOperand element = null] : (c0= parse_syntax_And | c1= parse_syntax_Or | c2= parse_syntax_Xor | c3= parse_syntax_Implies | c4= parse_syntax_Neg | c5= parse_syntax_Context | c6= parse_syntax_All | c7= parse_syntax_Any | c8= parse_syntax_More | c9= parse_syntax_MoreOrEqual | c10= parse_syntax_Less | c11= parse_syntax_LessOrEqual | c12= parse_syntax_NotEqual | c13= parse_syntax_Equal | c14= parse_syntax_SimpleFeature );
    public final syntax.BoolOperand parse_syntax_BoolOperand() throws RecognitionException {
        syntax.BoolOperand element =  null;
        int parse_syntax_BoolOperand_StartIndex = input.index();
        syntax.And c0 = null;

        syntax.Or c1 = null;

        syntax.Xor c2 = null;

        syntax.Implies c3 = null;

        syntax.Neg c4 = null;

        syntax.Context c5 = null;

        syntax.All c6 = null;

        syntax.Any c7 = null;

        syntax.More c8 = null;

        syntax.MoreOrEqual c9 = null;

        syntax.Less c10 = null;

        syntax.LessOrEqual c11 = null;

        syntax.NotEqual c12 = null;

        syntax.Equal c13 = null;

        syntax.SimpleFeature c14 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // Constraint.g:2824:1: (c0= parse_syntax_And | c1= parse_syntax_Or | c2= parse_syntax_Xor | c3= parse_syntax_Implies | c4= parse_syntax_Neg | c5= parse_syntax_Context | c6= parse_syntax_All | c7= parse_syntax_Any | c8= parse_syntax_More | c9= parse_syntax_MoreOrEqual | c10= parse_syntax_Less | c11= parse_syntax_LessOrEqual | c12= parse_syntax_NotEqual | c13= parse_syntax_Equal | c14= parse_syntax_SimpleFeature )
            int alt9=15;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Constraint.g:2825:2: c0= parse_syntax_And
                    {
                    pushFollow(FOLLOW_parse_syntax_And_in_parse_syntax_BoolOperand2328);
                    c0=parse_syntax_And();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:2826:4: c1= parse_syntax_Or
                    {
                    pushFollow(FOLLOW_parse_syntax_Or_in_parse_syntax_BoolOperand2338);
                    c1=parse_syntax_Or();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Constraint.g:2827:4: c2= parse_syntax_Xor
                    {
                    pushFollow(FOLLOW_parse_syntax_Xor_in_parse_syntax_BoolOperand2348);
                    c2=parse_syntax_Xor();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Constraint.g:2828:4: c3= parse_syntax_Implies
                    {
                    pushFollow(FOLLOW_parse_syntax_Implies_in_parse_syntax_BoolOperand2358);
                    c3=parse_syntax_Implies();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Constraint.g:2829:4: c4= parse_syntax_Neg
                    {
                    pushFollow(FOLLOW_parse_syntax_Neg_in_parse_syntax_BoolOperand2368);
                    c4=parse_syntax_Neg();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Constraint.g:2830:4: c5= parse_syntax_Context
                    {
                    pushFollow(FOLLOW_parse_syntax_Context_in_parse_syntax_BoolOperand2378);
                    c5=parse_syntax_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Constraint.g:2831:4: c6= parse_syntax_All
                    {
                    pushFollow(FOLLOW_parse_syntax_All_in_parse_syntax_BoolOperand2388);
                    c6=parse_syntax_All();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // Constraint.g:2832:4: c7= parse_syntax_Any
                    {
                    pushFollow(FOLLOW_parse_syntax_Any_in_parse_syntax_BoolOperand2398);
                    c7=parse_syntax_Any();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 9 :
                    // Constraint.g:2833:4: c8= parse_syntax_More
                    {
                    pushFollow(FOLLOW_parse_syntax_More_in_parse_syntax_BoolOperand2408);
                    c8=parse_syntax_More();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 10 :
                    // Constraint.g:2834:4: c9= parse_syntax_MoreOrEqual
                    {
                    pushFollow(FOLLOW_parse_syntax_MoreOrEqual_in_parse_syntax_BoolOperand2418);
                    c9=parse_syntax_MoreOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 11 :
                    // Constraint.g:2835:4: c10= parse_syntax_Less
                    {
                    pushFollow(FOLLOW_parse_syntax_Less_in_parse_syntax_BoolOperand2428);
                    c10=parse_syntax_Less();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 12 :
                    // Constraint.g:2836:4: c11= parse_syntax_LessOrEqual
                    {
                    pushFollow(FOLLOW_parse_syntax_LessOrEqual_in_parse_syntax_BoolOperand2438);
                    c11=parse_syntax_LessOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 13 :
                    // Constraint.g:2837:4: c12= parse_syntax_NotEqual
                    {
                    pushFollow(FOLLOW_parse_syntax_NotEqual_in_parse_syntax_BoolOperand2448);
                    c12=parse_syntax_NotEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 14 :
                    // Constraint.g:2838:4: c13= parse_syntax_Equal
                    {
                    pushFollow(FOLLOW_parse_syntax_Equal_in_parse_syntax_BoolOperand2458);
                    c13=parse_syntax_Equal();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c13; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 15 :
                    // Constraint.g:2839:4: c14= parse_syntax_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_BoolOperand2468);
                    c14=parse_syntax_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c14; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, parse_syntax_BoolOperand_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_BoolOperand"


    // $ANTLR start "parse_syntax_BoolOperandChoices"
    // Constraint.g:2843:1: parse_syntax_BoolOperandChoices returns [syntax.BoolOperandChoices element = null] : (c0= parse_syntax_Context | c1= parse_syntax_All | c2= parse_syntax_Any | c3= parse_syntax_SimpleFeature );
    public final syntax.BoolOperandChoices parse_syntax_BoolOperandChoices() throws RecognitionException {
        syntax.BoolOperandChoices element =  null;
        int parse_syntax_BoolOperandChoices_StartIndex = input.index();
        syntax.Context c0 = null;

        syntax.All c1 = null;

        syntax.Any c2 = null;

        syntax.SimpleFeature c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // Constraint.g:2844:1: (c0= parse_syntax_Context | c1= parse_syntax_All | c2= parse_syntax_Any | c3= parse_syntax_SimpleFeature )
            int alt10=4;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==21) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=12 && LA10_1<=15)) ) {
                    alt10=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // Constraint.g:2845:2: c0= parse_syntax_Context
                    {
                    pushFollow(FOLLOW_parse_syntax_Context_in_parse_syntax_BoolOperandChoices2489);
                    c0=parse_syntax_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:2846:4: c1= parse_syntax_All
                    {
                    pushFollow(FOLLOW_parse_syntax_All_in_parse_syntax_BoolOperandChoices2499);
                    c1=parse_syntax_All();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Constraint.g:2847:4: c2= parse_syntax_Any
                    {
                    pushFollow(FOLLOW_parse_syntax_Any_in_parse_syntax_BoolOperandChoices2509);
                    c2=parse_syntax_Any();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Constraint.g:2848:4: c3= parse_syntax_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_BoolOperandChoices2519);
                    c3=parse_syntax_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parse_syntax_BoolOperandChoices_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_BoolOperandChoices"


    // $ANTLR start "parse_syntax_NumOperandChoices"
    // Constraint.g:2852:1: parse_syntax_NumOperandChoices returns [syntax.NumOperandChoices element = null] : (c0= parse_syntax_Context | c1= parse_syntax_SimpleFeature | c2= parse_syntax_MultipleFeature | c3= parse_syntax_Number );
    public final syntax.NumOperandChoices parse_syntax_NumOperandChoices() throws RecognitionException {
        syntax.NumOperandChoices element =  null;
        int parse_syntax_NumOperandChoices_StartIndex = input.index();
        syntax.Context c0 = null;

        syntax.SimpleFeature c1 = null;

        syntax.MultipleFeature c2 = null;

        syntax.Number c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // Constraint.g:2853:1: (c0= parse_syntax_Context | c1= parse_syntax_SimpleFeature | c2= parse_syntax_MultipleFeature | c3= parse_syntax_Number )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TEXT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==21) ) {
                    alt11=1;
                }
                else if ( (synpred46_Constraint()) ) {
                    alt11=2;
                }
                else if ( (synpred47_Constraint()) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==DIGIT) ) {
                alt11=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // Constraint.g:2854:2: c0= parse_syntax_Context
                    {
                    pushFollow(FOLLOW_parse_syntax_Context_in_parse_syntax_NumOperandChoices2540);
                    c0=parse_syntax_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:2855:4: c1= parse_syntax_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_NumOperandChoices2550);
                    c1=parse_syntax_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Constraint.g:2856:4: c2= parse_syntax_MultipleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_NumOperandChoices2560);
                    c2=parse_syntax_MultipleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Constraint.g:2857:4: c3= parse_syntax_Number
                    {
                    pushFollow(FOLLOW_parse_syntax_Number_in_parse_syntax_NumOperandChoices2570);
                    c3=parse_syntax_Number();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, parse_syntax_NumOperandChoices_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_NumOperandChoices"


    // $ANTLR start "parse_syntax_NumOperand"
    // Constraint.g:2861:1: parse_syntax_NumOperand returns [syntax.NumOperand element = null] : (c0= parse_syntax_Plus | c1= parse_syntax_Minus | c2= parse_syntax_Mul | c3= parse_syntax_Div | c4= parse_syntax_Context | c5= parse_syntax_SimpleFeature | c6= parse_syntax_MultipleFeature | c7= parse_syntax_Number );
    public final syntax.NumOperand parse_syntax_NumOperand() throws RecognitionException {
        syntax.NumOperand element =  null;
        int parse_syntax_NumOperand_StartIndex = input.index();
        syntax.Plus c0 = null;

        syntax.Minus c1 = null;

        syntax.Mul c2 = null;

        syntax.Div c3 = null;

        syntax.Context c4 = null;

        syntax.SimpleFeature c5 = null;

        syntax.MultipleFeature c6 = null;

        syntax.Number c7 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // Constraint.g:2862:1: (c0= parse_syntax_Plus | c1= parse_syntax_Minus | c2= parse_syntax_Mul | c3= parse_syntax_Div | c4= parse_syntax_Context | c5= parse_syntax_SimpleFeature | c6= parse_syntax_MultipleFeature | c7= parse_syntax_Number )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // Constraint.g:2863:2: c0= parse_syntax_Plus
                    {
                    pushFollow(FOLLOW_parse_syntax_Plus_in_parse_syntax_NumOperand2591);
                    c0=parse_syntax_Plus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Constraint.g:2864:4: c1= parse_syntax_Minus
                    {
                    pushFollow(FOLLOW_parse_syntax_Minus_in_parse_syntax_NumOperand2601);
                    c1=parse_syntax_Minus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Constraint.g:2865:4: c2= parse_syntax_Mul
                    {
                    pushFollow(FOLLOW_parse_syntax_Mul_in_parse_syntax_NumOperand2611);
                    c2=parse_syntax_Mul();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Constraint.g:2866:4: c3= parse_syntax_Div
                    {
                    pushFollow(FOLLOW_parse_syntax_Div_in_parse_syntax_NumOperand2621);
                    c3=parse_syntax_Div();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Constraint.g:2867:4: c4= parse_syntax_Context
                    {
                    pushFollow(FOLLOW_parse_syntax_Context_in_parse_syntax_NumOperand2631);
                    c4=parse_syntax_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Constraint.g:2868:4: c5= parse_syntax_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_NumOperand2641);
                    c5=parse_syntax_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Constraint.g:2869:4: c6= parse_syntax_MultipleFeature
                    {
                    pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_NumOperand2651);
                    c6=parse_syntax_MultipleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // Constraint.g:2870:4: c7= parse_syntax_Number
                    {
                    pushFollow(FOLLOW_parse_syntax_Number_in_parse_syntax_NumOperand2661);
                    c7=parse_syntax_Number();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, parse_syntax_NumOperand_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_syntax_NumOperand"

    // $ANTLR start synpred2_Constraint
    public final void synpred2_Constraint_fragment() throws RecognitionException {   
        syntax.Operand a0_0 = null;


        // Constraint.g:707:2: ( (a0_0= parse_syntax_Operand ) )
        // Constraint.g:707:2: (a0_0= parse_syntax_Operand )
        {
        // Constraint.g:707:2: (a0_0= parse_syntax_Operand )
        // Constraint.g:708:3: a0_0= parse_syntax_Operand
        {
        pushFollow(FOLLOW_parse_syntax_Operand_in_synpred2_Constraint263);
        a0_0=parse_syntax_Operand();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_Constraint

    // $ANTLR start synpred4_Constraint
    public final void synpred4_Constraint_fragment() throws RecognitionException {   
        Token a0=null;
        Token a2=null;
        syntax.BoolOperand a1_0 = null;


        // Constraint.g:905:2: (a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')' )
        // Constraint.g:905:2: a0= '(' (a1_0= parse_syntax_BoolOperand ) a2= ')'
        {
        a0=(Token)match(input,10,FOLLOW_10_in_synpred4_Constraint441); if (state.failed) return ;
        // Constraint.g:927:2: (a1_0= parse_syntax_BoolOperand )
        // Constraint.g:928:3: a1_0= parse_syntax_BoolOperand
        {
        pushFollow(FOLLOW_parse_syntax_BoolOperand_in_synpred4_Constraint459);
        a1_0=parse_syntax_BoolOperand();

        state._fsp--;
        if (state.failed) return ;

        }

        a2=(Token)match(input,11,FOLLOW_11_in_synpred4_Constraint477); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Constraint

    // $ANTLR start synpred6_Constraint
    public final void synpred6_Constraint_fragment() throws RecognitionException {   
        syntax.NumOperand a0_0 = null;


        // Constraint.g:1102:2: ( (a0_0= parse_syntax_NumOperand ) )
        // Constraint.g:1102:2: (a0_0= parse_syntax_NumOperand )
        {
        // Constraint.g:1102:2: (a0_0= parse_syntax_NumOperand )
        // Constraint.g:1103:3: a0_0= parse_syntax_NumOperand
        {
        pushFollow(FOLLOW_parse_syntax_NumOperand_in_synpred6_Constraint627);
        a0_0=parse_syntax_NumOperand();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_Constraint

    // $ANTLR start synpred7_Constraint
    public final void synpred7_Constraint_fragment() throws RecognitionException {   
        Token a0=null;

        // Constraint.g:2691:2: ( (a0= TEXT ) )
        // Constraint.g:2691:2: (a0= TEXT )
        {
        // Constraint.g:2691:2: (a0= TEXT )
        // Constraint.g:2692:3: a0= TEXT
        {
        a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_synpred7_Constraint2020); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_Constraint

    // $ANTLR start synpred8_Constraint
    public final void synpred8_Constraint_fragment() throws RecognitionException {   
        syntax.And c0 = null;


        // Constraint.g:2799:2: (c0= parse_syntax_And )
        // Constraint.g:2799:2: c0= parse_syntax_And
        {
        pushFollow(FOLLOW_parse_syntax_And_in_synpred8_Constraint2107);
        c0=parse_syntax_And();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Constraint

    // $ANTLR start synpred9_Constraint
    public final void synpred9_Constraint_fragment() throws RecognitionException {   
        syntax.Or c1 = null;


        // Constraint.g:2800:4: (c1= parse_syntax_Or )
        // Constraint.g:2800:4: c1= parse_syntax_Or
        {
        pushFollow(FOLLOW_parse_syntax_Or_in_synpred9_Constraint2117);
        c1=parse_syntax_Or();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Constraint

    // $ANTLR start synpred10_Constraint
    public final void synpred10_Constraint_fragment() throws RecognitionException {   
        syntax.Xor c2 = null;


        // Constraint.g:2801:4: (c2= parse_syntax_Xor )
        // Constraint.g:2801:4: c2= parse_syntax_Xor
        {
        pushFollow(FOLLOW_parse_syntax_Xor_in_synpred10_Constraint2127);
        c2=parse_syntax_Xor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_Constraint

    // $ANTLR start synpred11_Constraint
    public final void synpred11_Constraint_fragment() throws RecognitionException {   
        syntax.Implies c3 = null;


        // Constraint.g:2802:4: (c3= parse_syntax_Implies )
        // Constraint.g:2802:4: c3= parse_syntax_Implies
        {
        pushFollow(FOLLOW_parse_syntax_Implies_in_synpred11_Constraint2137);
        c3=parse_syntax_Implies();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Constraint

    // $ANTLR start synpred13_Constraint
    public final void synpred13_Constraint_fragment() throws RecognitionException {   
        syntax.Plus c5 = null;


        // Constraint.g:2804:4: (c5= parse_syntax_Plus )
        // Constraint.g:2804:4: c5= parse_syntax_Plus
        {
        pushFollow(FOLLOW_parse_syntax_Plus_in_synpred13_Constraint2157);
        c5=parse_syntax_Plus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Constraint

    // $ANTLR start synpred14_Constraint
    public final void synpred14_Constraint_fragment() throws RecognitionException {   
        syntax.Minus c6 = null;


        // Constraint.g:2805:4: (c6= parse_syntax_Minus )
        // Constraint.g:2805:4: c6= parse_syntax_Minus
        {
        pushFollow(FOLLOW_parse_syntax_Minus_in_synpred14_Constraint2167);
        c6=parse_syntax_Minus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Constraint

    // $ANTLR start synpred15_Constraint
    public final void synpred15_Constraint_fragment() throws RecognitionException {   
        syntax.Mul c7 = null;


        // Constraint.g:2806:4: (c7= parse_syntax_Mul )
        // Constraint.g:2806:4: c7= parse_syntax_Mul
        {
        pushFollow(FOLLOW_parse_syntax_Mul_in_synpred15_Constraint2177);
        c7=parse_syntax_Mul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Constraint

    // $ANTLR start synpred16_Constraint
    public final void synpred16_Constraint_fragment() throws RecognitionException {   
        syntax.Div c8 = null;


        // Constraint.g:2807:4: (c8= parse_syntax_Div )
        // Constraint.g:2807:4: c8= parse_syntax_Div
        {
        pushFollow(FOLLOW_parse_syntax_Div_in_synpred16_Constraint2187);
        c8=parse_syntax_Div();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Constraint

    // $ANTLR start synpred17_Constraint
    public final void synpred17_Constraint_fragment() throws RecognitionException {   
        syntax.Context c9 = null;


        // Constraint.g:2808:4: (c9= parse_syntax_Context )
        // Constraint.g:2808:4: c9= parse_syntax_Context
        {
        pushFollow(FOLLOW_parse_syntax_Context_in_synpred17_Constraint2197);
        c9=parse_syntax_Context();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Constraint

    // $ANTLR start synpred18_Constraint
    public final void synpred18_Constraint_fragment() throws RecognitionException {   
        syntax.All c10 = null;


        // Constraint.g:2809:4: (c10= parse_syntax_All )
        // Constraint.g:2809:4: c10= parse_syntax_All
        {
        pushFollow(FOLLOW_parse_syntax_All_in_synpred18_Constraint2207);
        c10=parse_syntax_All();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Constraint

    // $ANTLR start synpred19_Constraint
    public final void synpred19_Constraint_fragment() throws RecognitionException {   
        syntax.Any c11 = null;


        // Constraint.g:2810:4: (c11= parse_syntax_Any )
        // Constraint.g:2810:4: c11= parse_syntax_Any
        {
        pushFollow(FOLLOW_parse_syntax_Any_in_synpred19_Constraint2217);
        c11=parse_syntax_Any();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Constraint

    // $ANTLR start synpred20_Constraint
    public final void synpred20_Constraint_fragment() throws RecognitionException {   
        syntax.More c12 = null;


        // Constraint.g:2811:4: (c12= parse_syntax_More )
        // Constraint.g:2811:4: c12= parse_syntax_More
        {
        pushFollow(FOLLOW_parse_syntax_More_in_synpred20_Constraint2227);
        c12=parse_syntax_More();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Constraint

    // $ANTLR start synpred21_Constraint
    public final void synpred21_Constraint_fragment() throws RecognitionException {   
        syntax.MoreOrEqual c13 = null;


        // Constraint.g:2812:4: (c13= parse_syntax_MoreOrEqual )
        // Constraint.g:2812:4: c13= parse_syntax_MoreOrEqual
        {
        pushFollow(FOLLOW_parse_syntax_MoreOrEqual_in_synpred21_Constraint2237);
        c13=parse_syntax_MoreOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Constraint

    // $ANTLR start synpred22_Constraint
    public final void synpred22_Constraint_fragment() throws RecognitionException {   
        syntax.Less c14 = null;


        // Constraint.g:2813:4: (c14= parse_syntax_Less )
        // Constraint.g:2813:4: c14= parse_syntax_Less
        {
        pushFollow(FOLLOW_parse_syntax_Less_in_synpred22_Constraint2247);
        c14=parse_syntax_Less();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Constraint

    // $ANTLR start synpred23_Constraint
    public final void synpred23_Constraint_fragment() throws RecognitionException {   
        syntax.LessOrEqual c15 = null;


        // Constraint.g:2814:4: (c15= parse_syntax_LessOrEqual )
        // Constraint.g:2814:4: c15= parse_syntax_LessOrEqual
        {
        pushFollow(FOLLOW_parse_syntax_LessOrEqual_in_synpred23_Constraint2257);
        c15=parse_syntax_LessOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Constraint

    // $ANTLR start synpred24_Constraint
    public final void synpred24_Constraint_fragment() throws RecognitionException {   
        syntax.NotEqual c16 = null;


        // Constraint.g:2815:4: (c16= parse_syntax_NotEqual )
        // Constraint.g:2815:4: c16= parse_syntax_NotEqual
        {
        pushFollow(FOLLOW_parse_syntax_NotEqual_in_synpred24_Constraint2267);
        c16=parse_syntax_NotEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_Constraint

    // $ANTLR start synpred25_Constraint
    public final void synpred25_Constraint_fragment() throws RecognitionException {   
        syntax.Equal c17 = null;


        // Constraint.g:2816:4: (c17= parse_syntax_Equal )
        // Constraint.g:2816:4: c17= parse_syntax_Equal
        {
        pushFollow(FOLLOW_parse_syntax_Equal_in_synpred25_Constraint2277);
        c17=parse_syntax_Equal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Constraint

    // $ANTLR start synpred26_Constraint
    public final void synpred26_Constraint_fragment() throws RecognitionException {   
        syntax.SimpleFeature c18 = null;


        // Constraint.g:2817:4: (c18= parse_syntax_SimpleFeature )
        // Constraint.g:2817:4: c18= parse_syntax_SimpleFeature
        {
        pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_synpred26_Constraint2287);
        c18=parse_syntax_SimpleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Constraint

    // $ANTLR start synpred27_Constraint
    public final void synpred27_Constraint_fragment() throws RecognitionException {   
        syntax.MultipleFeature c19 = null;


        // Constraint.g:2818:4: (c19= parse_syntax_MultipleFeature )
        // Constraint.g:2818:4: c19= parse_syntax_MultipleFeature
        {
        pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_synpred27_Constraint2297);
        c19=parse_syntax_MultipleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Constraint

    // $ANTLR start synpred28_Constraint
    public final void synpred28_Constraint_fragment() throws RecognitionException {   
        syntax.And c0 = null;


        // Constraint.g:2825:2: (c0= parse_syntax_And )
        // Constraint.g:2825:2: c0= parse_syntax_And
        {
        pushFollow(FOLLOW_parse_syntax_And_in_synpred28_Constraint2328);
        c0=parse_syntax_And();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Constraint

    // $ANTLR start synpred29_Constraint
    public final void synpred29_Constraint_fragment() throws RecognitionException {   
        syntax.Or c1 = null;


        // Constraint.g:2826:4: (c1= parse_syntax_Or )
        // Constraint.g:2826:4: c1= parse_syntax_Or
        {
        pushFollow(FOLLOW_parse_syntax_Or_in_synpred29_Constraint2338);
        c1=parse_syntax_Or();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Constraint

    // $ANTLR start synpred30_Constraint
    public final void synpred30_Constraint_fragment() throws RecognitionException {   
        syntax.Xor c2 = null;


        // Constraint.g:2827:4: (c2= parse_syntax_Xor )
        // Constraint.g:2827:4: c2= parse_syntax_Xor
        {
        pushFollow(FOLLOW_parse_syntax_Xor_in_synpred30_Constraint2348);
        c2=parse_syntax_Xor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Constraint

    // $ANTLR start synpred31_Constraint
    public final void synpred31_Constraint_fragment() throws RecognitionException {   
        syntax.Implies c3 = null;


        // Constraint.g:2828:4: (c3= parse_syntax_Implies )
        // Constraint.g:2828:4: c3= parse_syntax_Implies
        {
        pushFollow(FOLLOW_parse_syntax_Implies_in_synpred31_Constraint2358);
        c3=parse_syntax_Implies();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Constraint

    // $ANTLR start synpred33_Constraint
    public final void synpred33_Constraint_fragment() throws RecognitionException {   
        syntax.Context c5 = null;


        // Constraint.g:2830:4: (c5= parse_syntax_Context )
        // Constraint.g:2830:4: c5= parse_syntax_Context
        {
        pushFollow(FOLLOW_parse_syntax_Context_in_synpred33_Constraint2378);
        c5=parse_syntax_Context();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Constraint

    // $ANTLR start synpred34_Constraint
    public final void synpred34_Constraint_fragment() throws RecognitionException {   
        syntax.All c6 = null;


        // Constraint.g:2831:4: (c6= parse_syntax_All )
        // Constraint.g:2831:4: c6= parse_syntax_All
        {
        pushFollow(FOLLOW_parse_syntax_All_in_synpred34_Constraint2388);
        c6=parse_syntax_All();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Constraint

    // $ANTLR start synpred35_Constraint
    public final void synpred35_Constraint_fragment() throws RecognitionException {   
        syntax.Any c7 = null;


        // Constraint.g:2832:4: (c7= parse_syntax_Any )
        // Constraint.g:2832:4: c7= parse_syntax_Any
        {
        pushFollow(FOLLOW_parse_syntax_Any_in_synpred35_Constraint2398);
        c7=parse_syntax_Any();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Constraint

    // $ANTLR start synpred36_Constraint
    public final void synpred36_Constraint_fragment() throws RecognitionException {   
        syntax.More c8 = null;


        // Constraint.g:2833:4: (c8= parse_syntax_More )
        // Constraint.g:2833:4: c8= parse_syntax_More
        {
        pushFollow(FOLLOW_parse_syntax_More_in_synpred36_Constraint2408);
        c8=parse_syntax_More();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Constraint

    // $ANTLR start synpred37_Constraint
    public final void synpred37_Constraint_fragment() throws RecognitionException {   
        syntax.MoreOrEqual c9 = null;


        // Constraint.g:2834:4: (c9= parse_syntax_MoreOrEqual )
        // Constraint.g:2834:4: c9= parse_syntax_MoreOrEqual
        {
        pushFollow(FOLLOW_parse_syntax_MoreOrEqual_in_synpred37_Constraint2418);
        c9=parse_syntax_MoreOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Constraint

    // $ANTLR start synpred38_Constraint
    public final void synpred38_Constraint_fragment() throws RecognitionException {   
        syntax.Less c10 = null;


        // Constraint.g:2835:4: (c10= parse_syntax_Less )
        // Constraint.g:2835:4: c10= parse_syntax_Less
        {
        pushFollow(FOLLOW_parse_syntax_Less_in_synpred38_Constraint2428);
        c10=parse_syntax_Less();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Constraint

    // $ANTLR start synpred39_Constraint
    public final void synpred39_Constraint_fragment() throws RecognitionException {   
        syntax.LessOrEqual c11 = null;


        // Constraint.g:2836:4: (c11= parse_syntax_LessOrEqual )
        // Constraint.g:2836:4: c11= parse_syntax_LessOrEqual
        {
        pushFollow(FOLLOW_parse_syntax_LessOrEqual_in_synpred39_Constraint2438);
        c11=parse_syntax_LessOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Constraint

    // $ANTLR start synpred40_Constraint
    public final void synpred40_Constraint_fragment() throws RecognitionException {   
        syntax.NotEqual c12 = null;


        // Constraint.g:2837:4: (c12= parse_syntax_NotEqual )
        // Constraint.g:2837:4: c12= parse_syntax_NotEqual
        {
        pushFollow(FOLLOW_parse_syntax_NotEqual_in_synpred40_Constraint2448);
        c12=parse_syntax_NotEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_Constraint

    // $ANTLR start synpred41_Constraint
    public final void synpred41_Constraint_fragment() throws RecognitionException {   
        syntax.Equal c13 = null;


        // Constraint.g:2838:4: (c13= parse_syntax_Equal )
        // Constraint.g:2838:4: c13= parse_syntax_Equal
        {
        pushFollow(FOLLOW_parse_syntax_Equal_in_synpred41_Constraint2458);
        c13=parse_syntax_Equal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Constraint

    // $ANTLR start synpred46_Constraint
    public final void synpred46_Constraint_fragment() throws RecognitionException {   
        syntax.SimpleFeature c1 = null;


        // Constraint.g:2855:4: (c1= parse_syntax_SimpleFeature )
        // Constraint.g:2855:4: c1= parse_syntax_SimpleFeature
        {
        pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_synpred46_Constraint2550);
        c1=parse_syntax_SimpleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_Constraint

    // $ANTLR start synpred47_Constraint
    public final void synpred47_Constraint_fragment() throws RecognitionException {   
        syntax.MultipleFeature c2 = null;


        // Constraint.g:2856:4: (c2= parse_syntax_MultipleFeature )
        // Constraint.g:2856:4: c2= parse_syntax_MultipleFeature
        {
        pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_synpred47_Constraint2560);
        c2=parse_syntax_MultipleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Constraint

    // $ANTLR start synpred48_Constraint
    public final void synpred48_Constraint_fragment() throws RecognitionException {   
        syntax.Plus c0 = null;


        // Constraint.g:2863:2: (c0= parse_syntax_Plus )
        // Constraint.g:2863:2: c0= parse_syntax_Plus
        {
        pushFollow(FOLLOW_parse_syntax_Plus_in_synpred48_Constraint2591);
        c0=parse_syntax_Plus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Constraint

    // $ANTLR start synpred49_Constraint
    public final void synpred49_Constraint_fragment() throws RecognitionException {   
        syntax.Minus c1 = null;


        // Constraint.g:2864:4: (c1= parse_syntax_Minus )
        // Constraint.g:2864:4: c1= parse_syntax_Minus
        {
        pushFollow(FOLLOW_parse_syntax_Minus_in_synpred49_Constraint2601);
        c1=parse_syntax_Minus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Constraint

    // $ANTLR start synpred50_Constraint
    public final void synpred50_Constraint_fragment() throws RecognitionException {   
        syntax.Mul c2 = null;


        // Constraint.g:2865:4: (c2= parse_syntax_Mul )
        // Constraint.g:2865:4: c2= parse_syntax_Mul
        {
        pushFollow(FOLLOW_parse_syntax_Mul_in_synpred50_Constraint2611);
        c2=parse_syntax_Mul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Constraint

    // $ANTLR start synpred51_Constraint
    public final void synpred51_Constraint_fragment() throws RecognitionException {   
        syntax.Div c3 = null;


        // Constraint.g:2866:4: (c3= parse_syntax_Div )
        // Constraint.g:2866:4: c3= parse_syntax_Div
        {
        pushFollow(FOLLOW_parse_syntax_Div_in_synpred51_Constraint2621);
        c3=parse_syntax_Div();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Constraint

    // $ANTLR start synpred52_Constraint
    public final void synpred52_Constraint_fragment() throws RecognitionException {   
        syntax.Context c4 = null;


        // Constraint.g:2867:4: (c4= parse_syntax_Context )
        // Constraint.g:2867:4: c4= parse_syntax_Context
        {
        pushFollow(FOLLOW_parse_syntax_Context_in_synpred52_Constraint2631);
        c4=parse_syntax_Context();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_Constraint

    // $ANTLR start synpred53_Constraint
    public final void synpred53_Constraint_fragment() throws RecognitionException {   
        syntax.SimpleFeature c5 = null;


        // Constraint.g:2868:4: (c5= parse_syntax_SimpleFeature )
        // Constraint.g:2868:4: c5= parse_syntax_SimpleFeature
        {
        pushFollow(FOLLOW_parse_syntax_SimpleFeature_in_synpred53_Constraint2641);
        c5=parse_syntax_SimpleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Constraint

    // $ANTLR start synpred54_Constraint
    public final void synpred54_Constraint_fragment() throws RecognitionException {   
        syntax.MultipleFeature c6 = null;


        // Constraint.g:2869:4: (c6= parse_syntax_MultipleFeature )
        // Constraint.g:2869:4: c6= parse_syntax_MultipleFeature
        {
        pushFollow(FOLLOW_parse_syntax_MultipleFeature_in_synpred54_Constraint2651);
        c6=parse_syntax_MultipleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_Constraint

    // Delegated rules

    public final boolean synpred24_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Constraint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Constraint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA8_eotS =
        "\33\uffff";
    static final String DFA8_eofS =
        "\33\uffff";
    static final String DFA8_minS =
        "\1\4\4\0\1\uffff\1\0\24\uffff";
    static final String DFA8_maxS =
        "\1\30\4\0\1\uffff\1\0\24\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\5\1\uffff\1\1\1\2\1\3\1\4\1\6\1\7\1\10\1\11\1\15\1\16"+
        "\1\17\1\20\1\21\1\22\1\12\1\23\1\24\1\13\1\14\1\25";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\uffff\1\4\24\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\6\4\uffff\1\1\5\uffff\1\5\6\uffff\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "2797:1: parse_syntax_Operand returns [syntax.Operand element = null] : (c0= parse_syntax_And | c1= parse_syntax_Or | c2= parse_syntax_Xor | c3= parse_syntax_Implies | c4= parse_syntax_Neg | c5= parse_syntax_Plus | c6= parse_syntax_Minus | c7= parse_syntax_Mul | c8= parse_syntax_Div | c9= parse_syntax_Context | c10= parse_syntax_All | c11= parse_syntax_Any | c12= parse_syntax_More | c13= parse_syntax_MoreOrEqual | c14= parse_syntax_Less | c15= parse_syntax_LessOrEqual | c16= parse_syntax_NotEqual | c17= parse_syntax_Equal | c18= parse_syntax_SimpleFeature | c19= parse_syntax_MultipleFeature | c20= parse_syntax_Number );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Constraint()) ) {s = 7;}

                        else if ( (synpred9_Constraint()) ) {s = 8;}

                        else if ( (synpred10_Constraint()) ) {s = 9;}

                        else if ( (synpred11_Constraint()) ) {s = 10;}

                        else if ( (synpred13_Constraint()) ) {s = 11;}

                        else if ( (synpred14_Constraint()) ) {s = 12;}

                        else if ( (synpred15_Constraint()) ) {s = 13;}

                        else if ( (synpred16_Constraint()) ) {s = 14;}

                        else if ( (synpred20_Constraint()) ) {s = 15;}

                        else if ( (synpred21_Constraint()) ) {s = 16;}

                        else if ( (synpred22_Constraint()) ) {s = 17;}

                        else if ( (synpred23_Constraint()) ) {s = 18;}

                        else if ( (synpred24_Constraint()) ) {s = 19;}

                        else if ( (synpred25_Constraint()) ) {s = 20;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Constraint()) ) {s = 7;}

                        else if ( (synpred9_Constraint()) ) {s = 8;}

                        else if ( (synpred10_Constraint()) ) {s = 9;}

                        else if ( (synpred11_Constraint()) ) {s = 10;}

                        else if ( (synpred13_Constraint()) ) {s = 11;}

                        else if ( (synpred14_Constraint()) ) {s = 12;}

                        else if ( (synpred15_Constraint()) ) {s = 13;}

                        else if ( (synpred16_Constraint()) ) {s = 14;}

                        else if ( (synpred17_Constraint()) ) {s = 21;}

                        else if ( (synpred20_Constraint()) ) {s = 15;}

                        else if ( (synpred21_Constraint()) ) {s = 16;}

                        else if ( (synpred22_Constraint()) ) {s = 17;}

                        else if ( (synpred23_Constraint()) ) {s = 18;}

                        else if ( (synpred24_Constraint()) ) {s = 19;}

                        else if ( (synpred25_Constraint()) ) {s = 20;}

                        else if ( (synpred26_Constraint()) ) {s = 22;}

                        else if ( (synpred27_Constraint()) ) {s = 23;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Constraint()) ) {s = 7;}

                        else if ( (synpred9_Constraint()) ) {s = 8;}

                        else if ( (synpred10_Constraint()) ) {s = 9;}

                        else if ( (synpred11_Constraint()) ) {s = 10;}

                        else if ( (synpred18_Constraint()) ) {s = 24;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Constraint()) ) {s = 7;}

                        else if ( (synpred9_Constraint()) ) {s = 8;}

                        else if ( (synpred10_Constraint()) ) {s = 9;}

                        else if ( (synpred11_Constraint()) ) {s = 10;}

                        else if ( (synpred19_Constraint()) ) {s = 25;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Constraint()) ) {s = 11;}

                        else if ( (synpred14_Constraint()) ) {s = 12;}

                        else if ( (synpred15_Constraint()) ) {s = 13;}

                        else if ( (synpred16_Constraint()) ) {s = 14;}

                        else if ( (synpred20_Constraint()) ) {s = 15;}

                        else if ( (synpred21_Constraint()) ) {s = 16;}

                        else if ( (synpred22_Constraint()) ) {s = 17;}

                        else if ( (synpred23_Constraint()) ) {s = 18;}

                        else if ( (synpred24_Constraint()) ) {s = 19;}

                        else if ( (synpred25_Constraint()) ) {s = 20;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\25\uffff";
    static final String DFA9_eofS =
        "\25\uffff";
    static final String DFA9_minS =
        "\1\4\4\0\1\uffff\1\0\16\uffff";
    static final String DFA9_maxS =
        "\1\30\4\0\1\uffff\1\0\16\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\5\1\uffff\1\1\1\2\1\3\1\4\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\6\1\17\1\7\1\10";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\uffff\1\4\16\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\6\4\uffff\1\1\5\uffff\1\5\6\uffff\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "2823:1: parse_syntax_BoolOperand returns [syntax.BoolOperand element = null] : (c0= parse_syntax_And | c1= parse_syntax_Or | c2= parse_syntax_Xor | c3= parse_syntax_Implies | c4= parse_syntax_Neg | c5= parse_syntax_Context | c6= parse_syntax_All | c7= parse_syntax_Any | c8= parse_syntax_More | c9= parse_syntax_MoreOrEqual | c10= parse_syntax_Less | c11= parse_syntax_LessOrEqual | c12= parse_syntax_NotEqual | c13= parse_syntax_Equal | c14= parse_syntax_SimpleFeature );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Constraint()) ) {s = 7;}

                        else if ( (synpred29_Constraint()) ) {s = 8;}

                        else if ( (synpred30_Constraint()) ) {s = 9;}

                        else if ( (synpred31_Constraint()) ) {s = 10;}

                        else if ( (synpred36_Constraint()) ) {s = 11;}

                        else if ( (synpred37_Constraint()) ) {s = 12;}

                        else if ( (synpred38_Constraint()) ) {s = 13;}

                        else if ( (synpred39_Constraint()) ) {s = 14;}

                        else if ( (synpred40_Constraint()) ) {s = 15;}

                        else if ( (synpred41_Constraint()) ) {s = 16;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Constraint()) ) {s = 7;}

                        else if ( (synpred29_Constraint()) ) {s = 8;}

                        else if ( (synpred30_Constraint()) ) {s = 9;}

                        else if ( (synpred31_Constraint()) ) {s = 10;}

                        else if ( (synpred33_Constraint()) ) {s = 17;}

                        else if ( (synpred36_Constraint()) ) {s = 11;}

                        else if ( (synpred37_Constraint()) ) {s = 12;}

                        else if ( (synpred38_Constraint()) ) {s = 13;}

                        else if ( (synpred39_Constraint()) ) {s = 14;}

                        else if ( (synpred40_Constraint()) ) {s = 15;}

                        else if ( (synpred41_Constraint()) ) {s = 16;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Constraint()) ) {s = 7;}

                        else if ( (synpred29_Constraint()) ) {s = 8;}

                        else if ( (synpred30_Constraint()) ) {s = 9;}

                        else if ( (synpred31_Constraint()) ) {s = 10;}

                        else if ( (synpred34_Constraint()) ) {s = 19;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Constraint()) ) {s = 7;}

                        else if ( (synpred29_Constraint()) ) {s = 8;}

                        else if ( (synpred30_Constraint()) ) {s = 9;}

                        else if ( (synpred31_Constraint()) ) {s = 10;}

                        else if ( (synpred35_Constraint()) ) {s = 20;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Constraint()) ) {s = 11;}

                        else if ( (synpred37_Constraint()) ) {s = 12;}

                        else if ( (synpred38_Constraint()) ) {s = 13;}

                        else if ( (synpred39_Constraint()) ) {s = 14;}

                        else if ( (synpred40_Constraint()) ) {s = 15;}

                        else if ( (synpred41_Constraint()) ) {s = 16;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\14\uffff";
    static final String DFA12_eofS =
        "\14\uffff";
    static final String DFA12_minS =
        "\1\4\3\0\10\uffff";
    static final String DFA12_maxS =
        "\1\12\3\0\10\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA12_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\4\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "2861:1: parse_syntax_NumOperand returns [syntax.NumOperand element = null] : (c0= parse_syntax_Plus | c1= parse_syntax_Minus | c2= parse_syntax_Mul | c3= parse_syntax_Div | c4= parse_syntax_Context | c5= parse_syntax_SimpleFeature | c6= parse_syntax_MultipleFeature | c7= parse_syntax_Number );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Constraint()) ) {s = 4;}

                        else if ( (synpred49_Constraint()) ) {s = 5;}

                        else if ( (synpred50_Constraint()) ) {s = 6;}

                        else if ( (synpred51_Constraint()) ) {s = 7;}

                        else if ( (synpred52_Constraint()) ) {s = 8;}

                        else if ( (synpred53_Constraint()) ) {s = 9;}

                        else if ( (synpred54_Constraint()) ) {s = 10;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Constraint()) ) {s = 4;}

                        else if ( (synpred49_Constraint()) ) {s = 5;}

                        else if ( (synpred50_Constraint()) ) {s = 6;}

                        else if ( (synpred51_Constraint()) ) {s = 7;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Constraint()) ) {s = 4;}

                        else if ( (synpred49_Constraint()) ) {s = 5;}

                        else if ( (synpred50_Constraint()) ) {s = 6;}

                        else if ( (synpred51_Constraint()) ) {s = 7;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_parse_syntax_Model_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_parse_syntax_Model115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_syntax_Model133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_syntax_Model154 = new BitSet(new long[]{0x0000000001810432L});
    public static final BitSet FOLLOW_parse_syntax_Constraint_in_parse_syntax_Model183 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_syntax_Model211 = new BitSet(new long[]{0x0000000001810432L});
    public static final BitSet FOLLOW_parse_syntax_Operand_in_parse_syntax_Constraint263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_syntax_Constraint285 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_Operand_in_parse_syntax_Constraint303 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_syntax_Constraint321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_syntax_BoolPriorityOperand1350 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolOperand_in_parse_syntax_BoolPriorityOperand1368 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_syntax_BoolPriorityOperand1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_BoolOperandChoices_in_parse_syntax_BoolPriorityOperand1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_syntax_BoolPriorityOperand2441 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolOperand_in_parse_syntax_BoolPriorityOperand2459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_syntax_BoolPriorityOperand2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_BoolOperand_in_parse_syntax_BoolPriorityOperand2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumOperandChoices_in_parse_syntax_NumPriorityOperand1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_syntax_NumPriorityOperand1558 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumOperand_in_parse_syntax_NumPriorityOperand1576 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_syntax_NumPriorityOperand1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumOperand_in_parse_syntax_NumPriorityOperand2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_syntax_NumPriorityOperand2649 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumOperand_in_parse_syntax_NumPriorityOperand2667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_syntax_NumPriorityOperand2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_And718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_syntax_And736 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_And754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_Or791 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_syntax_Or809 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Or827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_Xor864 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_syntax_Xor882 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Xor900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand1_in_parse_syntax_Implies937 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_syntax_Implies955 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Implies973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_syntax_Neg1006 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Neg1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Plus1061 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_syntax_Plus1079 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Plus1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Minus1134 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_syntax_Minus1152 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Minus1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Mul1207 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_syntax_Mul1225 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Mul1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand1_in_parse_syntax_Div1280 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_syntax_Div1298 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Div1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_Context1353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_syntax_Context1371 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_Constraint_in_parse_syntax_Context1389 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_syntax_Context1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_syntax_All1436 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_All1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_syntax_Any1487 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolPriorityOperand2_in_parse_syntax_Any1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_More1542 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_syntax_More1560 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_More1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_MoreOrEqual1615 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_syntax_MoreOrEqual1633 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_MoreOrEqual1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Less1688 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_syntax_Less1706 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Less1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_LessOrEqual1761 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_syntax_LessOrEqual1779 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_LessOrEqual1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_NotEqual1834 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_syntax_NotEqual1852 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_NotEqual1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Equal1907 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_syntax_Equal1925 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_parse_syntax_NumPriorityOperand2_in_parse_syntax_Equal1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_syntax_SimpleFeature1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_syntax_MultipleFeature2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_MultipleFeature2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_parse_syntax_Number2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_And_in_parse_syntax_Operand2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Or_in_parse_syntax_Operand2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Xor_in_parse_syntax_Operand2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Implies_in_parse_syntax_Operand2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Neg_in_parse_syntax_Operand2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Plus_in_parse_syntax_Operand2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Minus_in_parse_syntax_Operand2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Mul_in_parse_syntax_Operand2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Div_in_parse_syntax_Operand2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_parse_syntax_Operand2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_All_in_parse_syntax_Operand2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Any_in_parse_syntax_Operand2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_More_in_parse_syntax_Operand2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MoreOrEqual_in_parse_syntax_Operand2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Less_in_parse_syntax_Operand2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_LessOrEqual_in_parse_syntax_Operand2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NotEqual_in_parse_syntax_Operand2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Equal_in_parse_syntax_Operand2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_Operand2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_Operand2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Number_in_parse_syntax_Operand2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_And_in_parse_syntax_BoolOperand2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Or_in_parse_syntax_BoolOperand2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Xor_in_parse_syntax_BoolOperand2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Implies_in_parse_syntax_BoolOperand2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Neg_in_parse_syntax_BoolOperand2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_parse_syntax_BoolOperand2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_All_in_parse_syntax_BoolOperand2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Any_in_parse_syntax_BoolOperand2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_More_in_parse_syntax_BoolOperand2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MoreOrEqual_in_parse_syntax_BoolOperand2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Less_in_parse_syntax_BoolOperand2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_LessOrEqual_in_parse_syntax_BoolOperand2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NotEqual_in_parse_syntax_BoolOperand2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Equal_in_parse_syntax_BoolOperand2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_BoolOperand2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_parse_syntax_BoolOperandChoices2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_All_in_parse_syntax_BoolOperandChoices2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Any_in_parse_syntax_BoolOperandChoices2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_BoolOperandChoices2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_parse_syntax_NumOperandChoices2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_NumOperandChoices2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_NumOperandChoices2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Number_in_parse_syntax_NumOperandChoices2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Plus_in_parse_syntax_NumOperand2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Minus_in_parse_syntax_NumOperand2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Mul_in_parse_syntax_NumOperand2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Div_in_parse_syntax_NumOperand2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_parse_syntax_NumOperand2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_parse_syntax_NumOperand2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_parse_syntax_NumOperand2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Number_in_parse_syntax_NumOperand2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Operand_in_synpred2_Constraint263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_synpred4_Constraint441 = new BitSet(new long[]{0x0000000001810430L});
    public static final BitSet FOLLOW_parse_syntax_BoolOperand_in_synpred4_Constraint459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred4_Constraint477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NumOperand_in_synpred6_Constraint627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_synpred7_Constraint2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_And_in_synpred8_Constraint2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Or_in_synpred9_Constraint2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Xor_in_synpred10_Constraint2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Implies_in_synpred11_Constraint2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Plus_in_synpred13_Constraint2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Minus_in_synpred14_Constraint2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Mul_in_synpred15_Constraint2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Div_in_synpred16_Constraint2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_synpred17_Constraint2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_All_in_synpred18_Constraint2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Any_in_synpred19_Constraint2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_More_in_synpred20_Constraint2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MoreOrEqual_in_synpred21_Constraint2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Less_in_synpred22_Constraint2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_LessOrEqual_in_synpred23_Constraint2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NotEqual_in_synpred24_Constraint2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Equal_in_synpred25_Constraint2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_synpred26_Constraint2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_synpred27_Constraint2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_And_in_synpred28_Constraint2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Or_in_synpred29_Constraint2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Xor_in_synpred30_Constraint2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Implies_in_synpred31_Constraint2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_synpred33_Constraint2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_All_in_synpred34_Constraint2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Any_in_synpred35_Constraint2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_More_in_synpred36_Constraint2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MoreOrEqual_in_synpred37_Constraint2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Less_in_synpred38_Constraint2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_LessOrEqual_in_synpred39_Constraint2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_NotEqual_in_synpred40_Constraint2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Equal_in_synpred41_Constraint2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_synpred46_Constraint2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_synpred47_Constraint2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Plus_in_synpred48_Constraint2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Minus_in_synpred49_Constraint2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Mul_in_synpred50_Constraint2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Div_in_synpred51_Constraint2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_Context_in_synpred52_Constraint2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_SimpleFeature_in_synpred53_Constraint2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_syntax_MultipleFeature_in_synpred54_Constraint2651 = new BitSet(new long[]{0x0000000000000002L});

}