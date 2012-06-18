// $ANTLR ${project.version} ${buildNumber}

	package hydraconstraints.resource.hydraConst.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class HydraConstParser extends HydraConstANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIRECCION", "TEXT", "DIGIT", "WHITESPACE", "LINEBREAK", "'import'", "';'", "'('", "')'", "'and'", "'or'", "'xor'", "'implies'", "'!'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'all'", "'any'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='"
    };
    public static final int EOF=-1;
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
    public static final int T__31=31;
    public static final int DIRECCION=4;
    public static final int TEXT=5;
    public static final int DIGIT=6;
    public static final int WHITESPACE=7;
    public static final int LINEBREAK=8;

    // delegates
    // delegators


        public HydraConstParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public HydraConstParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[87+1];
             
             
        }
        

    public String[] getTokenNames() { return HydraConstParser.tokenNames; }
    public String getGrammarFileName() { return "HydraConst.g"; }


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
    	



    // $ANTLR start "start"
    // HydraConst.g:541:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_hydraconstraints_Model ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        hydraconstraints.Model c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // HydraConst.g:542:1: ( (c0= parse_hydraconstraints_Model ) EOF )
            // HydraConst.g:543:2: (c0= parse_hydraconstraints_Model ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // HydraConst.g:548:2: (c0= parse_hydraconstraints_Model )
            // HydraConst.g:549:3: c0= parse_hydraconstraints_Model
            {
            pushFollow(FOLLOW_parse_hydraconstraints_Model_in_start82);
            c0=parse_hydraconstraints_Model();

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


    // $ANTLR start "parse_hydraconstraints_Model"
    // HydraConst.g:557:1: parse_hydraconstraints_Model returns [hydraconstraints.Model element = null] : a0= 'import' (a1= DIRECCION ) a2= ';' ( ( (a3_0= parse_hydraconstraints_Constraint ) a4= ';' ) )* ;
    public final hydraconstraints.Model parse_hydraconstraints_Model() throws RecognitionException {
        hydraconstraints.Model element =  null;
        int parse_hydraconstraints_Model_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        hydraconstraints.Constraint a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // HydraConst.g:560:1: (a0= 'import' (a1= DIRECCION ) a2= ';' ( ( (a3_0= parse_hydraconstraints_Constraint ) a4= ';' ) )* )
            // HydraConst.g:561:2: a0= 'import' (a1= DIRECCION ) a2= ';' ( ( (a3_0= parse_hydraconstraints_Constraint ) a4= ';' ) )*
            {
            a0=(Token)match(input,9,FOLLOW_9_in_parse_hydraconstraints_Model115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_1, 1);
              	
            }
            // HydraConst.g:575:2: (a1= DIRECCION )
            // HydraConst.g:576:3: a1= DIRECCION
            {
            a1=(Token)match(input,DIRECCION,FOLLOW_DIRECCION_in_parse_hydraconstraints_Model133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new hydraconstraints.resource.hydraConst.mopp.HydraConstTerminateParsingException();
              			}
              			if (element == null) {
              				element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIRECCION");
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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_2, 2);
              	
            }
            a2=(Token)match(input,10,FOLLOW_10_in_parse_hydraconstraints_Model154); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:634:2: ( ( (a3_0= parse_hydraconstraints_Constraint ) a4= ';' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=TEXT && LA1_0<=DIGIT)||LA1_0==11||LA1_0==17||(LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // HydraConst.g:635:3: ( (a3_0= parse_hydraconstraints_Constraint ) a4= ';' )
            	    {
            	    // HydraConst.g:635:3: ( (a3_0= parse_hydraconstraints_Constraint ) a4= ';' )
            	    // HydraConst.g:636:4: (a3_0= parse_hydraconstraints_Constraint ) a4= ';'
            	    {
            	    // HydraConst.g:636:4: (a3_0= parse_hydraconstraints_Constraint )
            	    // HydraConst.g:637:5: a3_0= parse_hydraconstraints_Constraint
            	    {
            	    pushFollow(FOLLOW_parse_hydraconstraints_Constraint_in_parse_hydraconstraints_Model183);
            	    a3_0=parse_hydraconstraints_Constraint();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 4);
            	      			
            	    }
            	    a4=(Token)match(input,10,FOLLOW_10_in_parse_hydraconstraints_Model211); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createModel();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_0_0_0_3_0_0_1, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_hydraconstraints_Model_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Model"


    // $ANTLR start "parse_hydraconstraints_Constraint"
    // HydraConst.g:703:1: parse_hydraconstraints_Constraint returns [hydraconstraints.Constraint element = null] : ( (a0_0= parse_hydraconstraints_Operand ) | a1= '(' (a2_0= parse_hydraconstraints_Operand ) a3= ')' );
    public final hydraconstraints.Constraint parse_hydraconstraints_Constraint() throws RecognitionException {
        hydraconstraints.Constraint element =  null;
        int parse_hydraconstraints_Constraint_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        hydraconstraints.Operand a0_0 = null;

        hydraconstraints.Operand a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // HydraConst.g:706:1: ( (a0_0= parse_hydraconstraints_Operand ) | a1= '(' (a2_0= parse_hydraconstraints_Operand ) a3= ')' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_HydraConst()) ) {
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
            else if ( ((LA2_0>=TEXT && LA2_0<=DIGIT)||LA2_0==17||(LA2_0>=24 && LA2_0<=25)) ) {
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
                    // HydraConst.g:707:2: (a0_0= parse_hydraconstraints_Operand )
                    {
                    // HydraConst.g:707:2: (a0_0= parse_hydraconstraints_Operand )
                    // HydraConst.g:708:3: a0_0= parse_hydraconstraints_Operand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Operand_in_parse_hydraconstraints_Constraint263);
                    a0_0=parse_hydraconstraints_Operand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 7);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 7);
                      	
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:735:4: a1= '(' (a2_0= parse_hydraconstraints_Operand ) a3= ')'
                    {
                    a1=(Token)match(input,11,FOLLOW_11_in_parse_hydraconstraints_Constraint285); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createConstraint();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_1_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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
                    // HydraConst.g:757:2: (a2_0= parse_hydraconstraints_Operand )
                    // HydraConst.g:758:3: a2_0= parse_hydraconstraints_Operand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Operand_in_parse_hydraconstraints_Constraint303);
                    a2_0=parse_hydraconstraints_Operand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_15, 9);
                      	
                    }
                    a3=(Token)match(input,12,FOLLOW_12_in_parse_hydraconstraints_Constraint321); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createConstraint();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_1_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 10);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 10);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 3, parse_hydraconstraints_Constraint_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Constraint"


    // $ANTLR start "parse_hydraconstraints_BoolPriorityOperand1"
    // HydraConst.g:800:1: parse_hydraconstraints_BoolPriorityOperand1 returns [hydraconstraints.BoolPriorityOperand1 element = null] : (a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')' | (a3_0= parse_hydraconstraints_BoolOperandChoices ) );
    public final hydraconstraints.BoolPriorityOperand1 parse_hydraconstraints_BoolPriorityOperand1() throws RecognitionException {
        hydraconstraints.BoolPriorityOperand1 element =  null;
        int parse_hydraconstraints_BoolPriorityOperand1_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        hydraconstraints.BoolOperand a1_0 = null;

        hydraconstraints.BoolOperandChoices a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // HydraConst.g:803:1: (a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')' | (a3_0= parse_hydraconstraints_BoolOperandChoices ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==TEXT||(LA3_0>=24 && LA3_0<=25)) ) {
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
                    // HydraConst.g:804:2: a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')'
                    {
                    a0=(Token)match(input,11,FOLLOW_11_in_parse_hydraconstraints_BoolPriorityOperand1350); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_2_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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
                    // HydraConst.g:826:2: (a1_0= parse_hydraconstraints_BoolOperand )
                    // HydraConst.g:827:3: a1_0= parse_hydraconstraints_BoolOperand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_BoolOperand_in_parse_hydraconstraints_BoolPriorityOperand1368);
                    a1_0=parse_hydraconstraints_BoolOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 12);
                      	
                    }
                    a2=(Token)match(input,12,FOLLOW_12_in_parse_hydraconstraints_BoolPriorityOperand1386); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_2_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_17, 13);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_18, 13);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_19, 13);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_20, 13);
                      	
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:870:4: (a3_0= parse_hydraconstraints_BoolOperandChoices )
                    {
                    // HydraConst.g:870:4: (a3_0= parse_hydraconstraints_BoolOperandChoices )
                    // HydraConst.g:871:3: a3_0= parse_hydraconstraints_BoolOperandChoices
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_BoolOperandChoices_in_parse_hydraconstraints_BoolPriorityOperand1408);
                    a3_0=parse_hydraconstraints_BoolOperandChoices();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_17, 14);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_18, 14);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_19, 14);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_20, 14);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 4, parse_hydraconstraints_BoolPriorityOperand1_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_BoolPriorityOperand1"


    // $ANTLR start "parse_hydraconstraints_BoolPriorityOperand2"
    // HydraConst.g:901:1: parse_hydraconstraints_BoolPriorityOperand2 returns [hydraconstraints.BoolPriorityOperand2 element = null] : (a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')' | (a3_0= parse_hydraconstraints_BoolOperand ) );
    public final hydraconstraints.BoolPriorityOperand2 parse_hydraconstraints_BoolPriorityOperand2() throws RecognitionException {
        hydraconstraints.BoolPriorityOperand2 element =  null;
        int parse_hydraconstraints_BoolPriorityOperand2_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        hydraconstraints.BoolOperand a1_0 = null;

        hydraconstraints.BoolOperand a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // HydraConst.g:904:1: (a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')' | (a3_0= parse_hydraconstraints_BoolOperand ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4_HydraConst()) ) {
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
            else if ( ((LA4_0>=TEXT && LA4_0<=DIGIT)||LA4_0==17||(LA4_0>=24 && LA4_0<=25)) ) {
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
                    // HydraConst.g:905:2: a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')'
                    {
                    a0=(Token)match(input,11,FOLLOW_11_in_parse_hydraconstraints_BoolPriorityOperand2441); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_3_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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
                    // HydraConst.g:927:2: (a1_0= parse_hydraconstraints_BoolOperand )
                    // HydraConst.g:928:3: a1_0= parse_hydraconstraints_BoolOperand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_BoolOperand_in_parse_hydraconstraints_BoolPriorityOperand2459);
                    a1_0=parse_hydraconstraints_BoolOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 16);
                      	
                    }
                    a2=(Token)match(input,12,FOLLOW_12_in_parse_hydraconstraints_BoolPriorityOperand2477); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createBoolPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_3_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 17);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 17);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 17);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 17);
                      	
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:971:4: (a3_0= parse_hydraconstraints_BoolOperand )
                    {
                    // HydraConst.g:971:4: (a3_0= parse_hydraconstraints_BoolOperand )
                    // HydraConst.g:972:3: a3_0= parse_hydraconstraints_BoolOperand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_BoolOperand_in_parse_hydraconstraints_BoolPriorityOperand2499);
                    a3_0=parse_hydraconstraints_BoolOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 18);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 18);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 18);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 18);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 5, parse_hydraconstraints_BoolPriorityOperand2_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_BoolPriorityOperand2"


    // $ANTLR start "parse_hydraconstraints_NumPriorityOperand1"
    // HydraConst.g:1002:1: parse_hydraconstraints_NumPriorityOperand1 returns [hydraconstraints.NumPriorityOperand1 element = null] : ( (a0_0= parse_hydraconstraints_NumOperandChoices ) | a1= '(' (a2_0= parse_hydraconstraints_NumOperand ) a3= ')' );
    public final hydraconstraints.NumPriorityOperand1 parse_hydraconstraints_NumPriorityOperand1() throws RecognitionException {
        hydraconstraints.NumPriorityOperand1 element =  null;
        int parse_hydraconstraints_NumPriorityOperand1_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        hydraconstraints.NumOperandChoices a0_0 = null;

        hydraconstraints.NumOperand a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // HydraConst.g:1005:1: ( (a0_0= parse_hydraconstraints_NumOperandChoices ) | a1= '(' (a2_0= parse_hydraconstraints_NumOperand ) a3= ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=TEXT && LA5_0<=DIGIT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
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
                    // HydraConst.g:1006:2: (a0_0= parse_hydraconstraints_NumOperandChoices )
                    {
                    // HydraConst.g:1006:2: (a0_0= parse_hydraconstraints_NumOperandChoices )
                    // HydraConst.g:1007:3: a0_0= parse_hydraconstraints_NumOperandChoices
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_NumOperandChoices_in_parse_hydraconstraints_NumPriorityOperand1536);
                    a0_0=parse_hydraconstraints_NumOperandChoices();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 19);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 19);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 19);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 19);
                      	
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:1036:4: a1= '(' (a2_0= parse_hydraconstraints_NumOperand ) a3= ')'
                    {
                    a1=(Token)match(input,11,FOLLOW_11_in_parse_hydraconstraints_NumPriorityOperand1558); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_4_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 20, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5);
                      	
                    }
                    // HydraConst.g:1053:2: (a2_0= parse_hydraconstraints_NumOperand )
                    // HydraConst.g:1054:3: a2_0= parse_hydraconstraints_NumOperand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_NumOperand_in_parse_hydraconstraints_NumPriorityOperand1576);
                    a2_0=parse_hydraconstraints_NumOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_27, 21);
                      	
                    }
                    a3=(Token)match(input,12,FOLLOW_12_in_parse_hydraconstraints_NumPriorityOperand1594); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand1();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_4_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 22);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 22);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 22);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 22);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 6, parse_hydraconstraints_NumPriorityOperand1_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_NumPriorityOperand1"


    // $ANTLR start "parse_hydraconstraints_NumPriorityOperand2"
    // HydraConst.g:1098:1: parse_hydraconstraints_NumPriorityOperand2 returns [hydraconstraints.NumPriorityOperand2 element = null] : ( (a0_0= parse_hydraconstraints_NumOperand ) | a1= '(' (a2_0= parse_hydraconstraints_NumOperand ) a3= ')' );
    public final hydraconstraints.NumPriorityOperand2 parse_hydraconstraints_NumPriorityOperand2() throws RecognitionException {
        hydraconstraints.NumPriorityOperand2 element =  null;
        int parse_hydraconstraints_NumPriorityOperand2_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        hydraconstraints.NumOperand a0_0 = null;

        hydraconstraints.NumOperand a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // HydraConst.g:1101:1: ( (a0_0= parse_hydraconstraints_NumOperand ) | a1= '(' (a2_0= parse_hydraconstraints_NumOperand ) a3= ')' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=TEXT && LA6_0<=DIGIT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                int LA6_3 = input.LA(2);

                if ( (synpred6_HydraConst()) ) {
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
                    // HydraConst.g:1102:2: (a0_0= parse_hydraconstraints_NumOperand )
                    {
                    // HydraConst.g:1102:2: (a0_0= parse_hydraconstraints_NumOperand )
                    // HydraConst.g:1103:3: a0_0= parse_hydraconstraints_NumOperand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_NumOperand_in_parse_hydraconstraints_NumPriorityOperand2627);
                    a0_0=parse_hydraconstraints_NumOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // HydraConst.g:1137:4: a1= '(' (a2_0= parse_hydraconstraints_NumOperand ) a3= ')'
                    {
                    a1=(Token)match(input,11,FOLLOW_11_in_parse_hydraconstraints_NumPriorityOperand2649); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_5_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 24, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8);
                      	
                    }
                    // HydraConst.g:1154:2: (a2_0= parse_hydraconstraints_NumOperand )
                    // HydraConst.g:1155:3: a2_0= parse_hydraconstraints_NumOperand
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_NumOperand_in_parse_hydraconstraints_NumPriorityOperand2667);
                    a2_0=parse_hydraconstraints_NumOperand();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_34, 25);
                      	
                    }
                    a3=(Token)match(input,12,FOLLOW_12_in_parse_hydraconstraints_NumPriorityOperand2685); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNumPriorityOperand2();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_5_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_hydraconstraints_NumPriorityOperand2_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_NumPriorityOperand2"


    // $ANTLR start "parse_hydraconstraints_And"
    // HydraConst.g:1204:1: parse_hydraconstraints_And returns [hydraconstraints.And element = null] : (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'and' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.And parse_hydraconstraints_And() throws RecognitionException {
        hydraconstraints.And element =  null;
        int parse_hydraconstraints_And_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.BoolPriorityOperand1 a0_0 = null;

        hydraconstraints.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // HydraConst.g:1207:1: ( (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'and' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:1208:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'and' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            // HydraConst.g:1208:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 )
            // HydraConst.g:1209:3: a0_0= parse_hydraconstraints_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_And718);
            a0_0=parse_hydraconstraints_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_17, 27);
              	
            }
            a1=(Token)match(input,13,FOLLOW_13_in_parse_hydraconstraints_And736); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAnd();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:1257:2: (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:1258:3: a2_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_And754);
            a2_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 29);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 29);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 29);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 29);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_hydraconstraints_And_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_And"


    // $ANTLR start "parse_hydraconstraints_Or"
    // HydraConst.g:1288:1: parse_hydraconstraints_Or returns [hydraconstraints.Or element = null] : (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'or' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.Or parse_hydraconstraints_Or() throws RecognitionException {
        hydraconstraints.Or element =  null;
        int parse_hydraconstraints_Or_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.BoolPriorityOperand1 a0_0 = null;

        hydraconstraints.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // HydraConst.g:1291:1: ( (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'or' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:1292:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'or' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            // HydraConst.g:1292:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 )
            // HydraConst.g:1293:3: a0_0= parse_hydraconstraints_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_Or791);
            a0_0=parse_hydraconstraints_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_18, 30);
              	
            }
            a1=(Token)match(input,14,FOLLOW_14_in_parse_hydraconstraints_Or809); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createOr();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_7_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:1341:2: (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:1342:3: a2_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Or827);
            a2_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 32);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 32);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 32);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 32);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_hydraconstraints_Or_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Or"


    // $ANTLR start "parse_hydraconstraints_Xor"
    // HydraConst.g:1372:1: parse_hydraconstraints_Xor returns [hydraconstraints.Xor element = null] : (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'xor' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.Xor parse_hydraconstraints_Xor() throws RecognitionException {
        hydraconstraints.Xor element =  null;
        int parse_hydraconstraints_Xor_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.BoolPriorityOperand1 a0_0 = null;

        hydraconstraints.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // HydraConst.g:1375:1: ( (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'xor' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:1376:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'xor' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            // HydraConst.g:1376:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 )
            // HydraConst.g:1377:3: a0_0= parse_hydraconstraints_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_Xor864);
            a0_0=parse_hydraconstraints_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_19, 33);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_hydraconstraints_Xor882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createXor();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_8_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:1425:2: (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:1426:3: a2_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Xor900);
            a2_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 35);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 35);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 35);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 35);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_hydraconstraints_Xor_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Xor"


    // $ANTLR start "parse_hydraconstraints_Implies"
    // HydraConst.g:1456:1: parse_hydraconstraints_Implies returns [hydraconstraints.Implies element = null] : (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'implies' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.Implies parse_hydraconstraints_Implies() throws RecognitionException {
        hydraconstraints.Implies element =  null;
        int parse_hydraconstraints_Implies_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.BoolPriorityOperand1 a0_0 = null;

        hydraconstraints.BoolPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // HydraConst.g:1459:1: ( (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'implies' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:1460:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 ) a1= 'implies' (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            // HydraConst.g:1460:2: (a0_0= parse_hydraconstraints_BoolPriorityOperand1 )
            // HydraConst.g:1461:3: a0_0= parse_hydraconstraints_BoolPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_Implies937);
            a0_0=parse_hydraconstraints_BoolPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_20, 36);
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_hydraconstraints_Implies955); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createImplies();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_9_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:1509:2: (a2_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:1510:3: a2_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Implies973);
            a2_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 38);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 38);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 38);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 38);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_hydraconstraints_Implies_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Implies"


    // $ANTLR start "parse_hydraconstraints_Neg"
    // HydraConst.g:1540:1: parse_hydraconstraints_Neg returns [hydraconstraints.Neg element = null] : a0= '!' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.Neg parse_hydraconstraints_Neg() throws RecognitionException {
        hydraconstraints.Neg element =  null;
        int parse_hydraconstraints_Neg_StartIndex = input.index();
        Token a0=null;
        hydraconstraints.BoolPriorityOperand2 a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // HydraConst.g:1543:1: (a0= '!' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:1544:2: a0= '!' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_hydraconstraints_Neg1006); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNeg();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_10_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:1567:2: (a1_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:1568:3: a1_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Neg1024);
            a1_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 40);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 40);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 40);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 40);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_hydraconstraints_Neg_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Neg"


    // $ANTLR start "parse_hydraconstraints_Plus"
    // HydraConst.g:1598:1: parse_hydraconstraints_Plus returns [hydraconstraints.Plus element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '+' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.Plus parse_hydraconstraints_Plus() throws RecognitionException {
        hydraconstraints.Plus element =  null;
        int parse_hydraconstraints_Plus_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand1 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // HydraConst.g:1601:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '+' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:1602:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '+' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:1602:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 )
            // HydraConst.g:1603:3: a0_0= parse_hydraconstraints_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Plus1061);
            a0_0=parse_hydraconstraints_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_23, 41);
              	
            }
            a1=(Token)match(input,18,FOLLOW_18_in_parse_hydraconstraints_Plus1079); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createPlus();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_11_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 42, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              	
            }
            // HydraConst.g:1646:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:1647:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Plus1097);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_hydraconstraints_Plus_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Plus"


    // $ANTLR start "parse_hydraconstraints_Minus"
    // HydraConst.g:1682:1: parse_hydraconstraints_Minus returns [hydraconstraints.Minus element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '-' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.Minus parse_hydraconstraints_Minus() throws RecognitionException {
        hydraconstraints.Minus element =  null;
        int parse_hydraconstraints_Minus_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand1 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // HydraConst.g:1685:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '-' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:1686:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '-' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:1686:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 )
            // HydraConst.g:1687:3: a0_0= parse_hydraconstraints_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Minus1134);
            a0_0=parse_hydraconstraints_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_24, 44);
              	
            }
            a1=(Token)match(input,19,FOLLOW_19_in_parse_hydraconstraints_Minus1152); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMinus();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_12_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 45, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              	
            }
            // HydraConst.g:1730:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:1731:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Minus1170);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_hydraconstraints_Minus_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Minus"


    // $ANTLR start "parse_hydraconstraints_Mul"
    // HydraConst.g:1766:1: parse_hydraconstraints_Mul returns [hydraconstraints.Mul element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '*' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.Mul parse_hydraconstraints_Mul() throws RecognitionException {
        hydraconstraints.Mul element =  null;
        int parse_hydraconstraints_Mul_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand1 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // HydraConst.g:1769:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '*' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:1770:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '*' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:1770:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 )
            // HydraConst.g:1771:3: a0_0= parse_hydraconstraints_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Mul1207);
            a0_0=parse_hydraconstraints_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_25, 47);
              	
            }
            a1=(Token)match(input,20,FOLLOW_20_in_parse_hydraconstraints_Mul1225); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMul();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_13_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 48, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              	
            }
            // HydraConst.g:1814:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:1815:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Mul1243);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_hydraconstraints_Mul_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Mul"


    // $ANTLR start "parse_hydraconstraints_Div"
    // HydraConst.g:1850:1: parse_hydraconstraints_Div returns [hydraconstraints.Div element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '/' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.Div parse_hydraconstraints_Div() throws RecognitionException {
        hydraconstraints.Div element =  null;
        int parse_hydraconstraints_Div_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand1 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // HydraConst.g:1853:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '/' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:1854:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 ) a1= '/' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:1854:2: (a0_0= parse_hydraconstraints_NumPriorityOperand1 )
            // HydraConst.g:1855:3: a0_0= parse_hydraconstraints_NumPriorityOperand1
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Div1280);
            a0_0=parse_hydraconstraints_NumPriorityOperand1();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_26, 50);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_hydraconstraints_Div1298); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createDiv();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_14_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 51, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_12);
              	
            }
            // HydraConst.g:1898:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:1899:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Div1316);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_hydraconstraints_Div_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Div"


    // $ANTLR start "parse_hydraconstraints_Context"
    // HydraConst.g:1934:1: parse_hydraconstraints_Context returns [hydraconstraints.Context element = null] : (a0_0= parse_hydraconstraints_MultipleFeature ) a1= '[' (a2_0= parse_hydraconstraints_Constraint ) a3= ']' ;
    public final hydraconstraints.Context parse_hydraconstraints_Context() throws RecognitionException {
        hydraconstraints.Context element =  null;
        int parse_hydraconstraints_Context_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        hydraconstraints.MultipleFeature a0_0 = null;

        hydraconstraints.Constraint a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // HydraConst.g:1937:1: ( (a0_0= parse_hydraconstraints_MultipleFeature ) a1= '[' (a2_0= parse_hydraconstraints_Constraint ) a3= ']' )
            // HydraConst.g:1938:2: (a0_0= parse_hydraconstraints_MultipleFeature ) a1= '[' (a2_0= parse_hydraconstraints_Constraint ) a3= ']'
            {
            // HydraConst.g:1938:2: (a0_0= parse_hydraconstraints_MultipleFeature )
            // HydraConst.g:1939:3: a0_0= parse_hydraconstraints_MultipleFeature
            {
            pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_Context1353);
            a0_0=parse_hydraconstraints_MultipleFeature();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_35, 53);
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_hydraconstraints_Context1371); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createContext();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_15_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:1987:2: (a2_0= parse_hydraconstraints_Constraint )
            // HydraConst.g:1988:3: a2_0= parse_hydraconstraints_Constraint
            {
            pushFollow(FOLLOW_parse_hydraconstraints_Constraint_in_parse_hydraconstraints_Context1389);
            a2_0=parse_hydraconstraints_Constraint();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 55);
              	
            }
            a3=(Token)match(input,23,FOLLOW_23_in_parse_hydraconstraints_Context1407); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createContext();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_15_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_hydraconstraints_Context_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Context"


    // $ANTLR start "parse_hydraconstraints_All"
    // HydraConst.g:2042:1: parse_hydraconstraints_All returns [hydraconstraints.All element = null] : a0= 'all' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.All parse_hydraconstraints_All() throws RecognitionException {
        hydraconstraints.All element =  null;
        int parse_hydraconstraints_All_StartIndex = input.index();
        Token a0=null;
        hydraconstraints.BoolPriorityOperand2 a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // HydraConst.g:2045:1: (a0= 'all' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:2046:2: a0= 'all' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_hydraconstraints_All1436); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAll();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_16_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:2069:2: (a1_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:2070:3: a1_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_All1454);
            a1_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 58);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 58);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 58);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 58);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_hydraconstraints_All_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_All"


    // $ANTLR start "parse_hydraconstraints_Any"
    // HydraConst.g:2100:1: parse_hydraconstraints_Any returns [hydraconstraints.Any element = null] : a0= 'any' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 ) ;
    public final hydraconstraints.Any parse_hydraconstraints_Any() throws RecognitionException {
        hydraconstraints.Any element =  null;
        int parse_hydraconstraints_Any_StartIndex = input.index();
        Token a0=null;
        hydraconstraints.BoolPriorityOperand2 a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // HydraConst.g:2103:1: (a0= 'any' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 ) )
            // HydraConst.g:2104:2: a0= 'any' (a1_0= parse_hydraconstraints_BoolPriorityOperand2 )
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_hydraconstraints_Any1487); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createAny();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_17_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // HydraConst.g:2127:2: (a1_0= parse_hydraconstraints_BoolPriorityOperand2 )
            // HydraConst.g:2128:3: a1_0= parse_hydraconstraints_BoolPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Any1505);
            a1_0=parse_hydraconstraints_BoolPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 60);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 60);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 60);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 60);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_hydraconstraints_Any_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Any"


    // $ANTLR start "parse_hydraconstraints_More"
    // HydraConst.g:2158:1: parse_hydraconstraints_More returns [hydraconstraints.More element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '>' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.More parse_hydraconstraints_More() throws RecognitionException {
        hydraconstraints.More element =  null;
        int parse_hydraconstraints_More_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand2 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // HydraConst.g:2161:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '>' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:2162:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '>' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:2162:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2163:3: a0_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_More1542);
            a0_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_28, 61);
              	
            }
            a1=(Token)match(input,26,FOLLOW_26_in_parse_hydraconstraints_More1560); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMore();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_18_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 62, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              	
            }
            // HydraConst.g:2206:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2207:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_More1578);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 63);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 63);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 63);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 63);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_hydraconstraints_More_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_More"


    // $ANTLR start "parse_hydraconstraints_MoreOrEqual"
    // HydraConst.g:2237:1: parse_hydraconstraints_MoreOrEqual returns [hydraconstraints.MoreOrEqual element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '>=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.MoreOrEqual parse_hydraconstraints_MoreOrEqual() throws RecognitionException {
        hydraconstraints.MoreOrEqual element =  null;
        int parse_hydraconstraints_MoreOrEqual_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand2 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // HydraConst.g:2240:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '>=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:2241:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '>=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:2241:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2242:3: a0_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_MoreOrEqual1615);
            a0_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_29, 64);
              	
            }
            a1=(Token)match(input,27,FOLLOW_27_in_parse_hydraconstraints_MoreOrEqual1633); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createMoreOrEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_19_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 65, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              	
            }
            // HydraConst.g:2285:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2286:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_MoreOrEqual1651);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 66);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 66);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 66);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 66);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_hydraconstraints_MoreOrEqual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_MoreOrEqual"


    // $ANTLR start "parse_hydraconstraints_Less"
    // HydraConst.g:2316:1: parse_hydraconstraints_Less returns [hydraconstraints.Less element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '<' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.Less parse_hydraconstraints_Less() throws RecognitionException {
        hydraconstraints.Less element =  null;
        int parse_hydraconstraints_Less_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand2 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // HydraConst.g:2319:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '<' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:2320:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '<' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:2320:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2321:3: a0_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Less1688);
            a0_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_30, 67);
              	
            }
            a1=(Token)match(input,28,FOLLOW_28_in_parse_hydraconstraints_Less1706); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLess();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_20_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 68, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              	
            }
            // HydraConst.g:2364:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2365:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Less1724);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 69);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 69);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 69);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 69);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_hydraconstraints_Less_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Less"


    // $ANTLR start "parse_hydraconstraints_LessOrEqual"
    // HydraConst.g:2395:1: parse_hydraconstraints_LessOrEqual returns [hydraconstraints.LessOrEqual element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '<=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.LessOrEqual parse_hydraconstraints_LessOrEqual() throws RecognitionException {
        hydraconstraints.LessOrEqual element =  null;
        int parse_hydraconstraints_LessOrEqual_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand2 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // HydraConst.g:2398:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '<=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:2399:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '<=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:2399:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2400:3: a0_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_LessOrEqual1761);
            a0_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_31, 70);
              	
            }
            a1=(Token)match(input,29,FOLLOW_29_in_parse_hydraconstraints_LessOrEqual1779); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createLessOrEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_21_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 71, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              	
            }
            // HydraConst.g:2443:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2444:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_LessOrEqual1797);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 72);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 72);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 72);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 72);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_hydraconstraints_LessOrEqual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_LessOrEqual"


    // $ANTLR start "parse_hydraconstraints_NotEqual"
    // HydraConst.g:2474:1: parse_hydraconstraints_NotEqual returns [hydraconstraints.NotEqual element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '!=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.NotEqual parse_hydraconstraints_NotEqual() throws RecognitionException {
        hydraconstraints.NotEqual element =  null;
        int parse_hydraconstraints_NotEqual_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand2 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // HydraConst.g:2477:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '!=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:2478:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '!=' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:2478:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2479:3: a0_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_NotEqual1834);
            a0_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_32, 73);
              	
            }
            a1=(Token)match(input,30,FOLLOW_30_in_parse_hydraconstraints_NotEqual1852); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createNotEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_22_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 74, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              	
            }
            // HydraConst.g:2522:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2523:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_NotEqual1870);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 75);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 75);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 75);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 75);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_hydraconstraints_NotEqual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_NotEqual"


    // $ANTLR start "parse_hydraconstraints_Equal"
    // HydraConst.g:2553:1: parse_hydraconstraints_Equal returns [hydraconstraints.Equal element = null] : (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '==' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) ;
    public final hydraconstraints.Equal parse_hydraconstraints_Equal() throws RecognitionException {
        hydraconstraints.Equal element =  null;
        int parse_hydraconstraints_Equal_StartIndex = input.index();
        Token a1=null;
        hydraconstraints.NumPriorityOperand2 a0_0 = null;

        hydraconstraints.NumPriorityOperand2 a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // HydraConst.g:2556:1: ( (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '==' (a2_0= parse_hydraconstraints_NumPriorityOperand2 ) )
            // HydraConst.g:2557:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 ) a1= '==' (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            {
            // HydraConst.g:2557:2: (a0_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2558:3: a0_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Equal1907);
            a0_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_33, 76);
              	
            }
            a1=(Token)match(input,31,FOLLOW_31_in_parse_hydraconstraints_Equal1925); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = hydraconstraints.HydraconstraintsFactory.eINSTANCE.createEqual();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, hydraconstraints.resource.hydraConst.grammar.HydraConstGrammarInformationProvider.HYDRACONST_23_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_4, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_5, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_3, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_9, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_5, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_10, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_6, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_8, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_11, 77, hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.FEATURE_15);
              	
            }
            // HydraConst.g:2601:2: (a2_0= parse_hydraconstraints_NumPriorityOperand2 )
            // HydraConst.g:2602:3: a2_0= parse_hydraconstraints_NumPriorityOperand2
            {
            pushFollow(FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Equal1943);
            a2_0=parse_hydraconstraints_NumPriorityOperand2();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_13, 78);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_14, 78);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_16, 78);
              		addExpectedElement(hydraconstraints.resource.hydraConst.grammar.HydraConstFollowSetProvider.TERMINAL_22, 78);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_hydraconstraints_Equal_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Equal"


    // $ANTLR start "parse_hydraconstraints_SimpleFeature"
    // HydraConst.g:2632:1: parse_hydraconstraints_SimpleFeature returns [hydraconstraints.SimpleFeature element = null] : (a0= TEXT ) ;
    public final hydraconstraints.SimpleFeature parse_hydraconstraints_SimpleFeature() throws RecognitionException {
        hydraconstraints.SimpleFeature element =  null;
        int parse_hydraconstraints_SimpleFeature_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // HydraConst.g:2635:1: ( (a0= TEXT ) )
            // HydraConst.g:2636:2: (a0= TEXT )
            {
            // HydraConst.g:2636:2: (a0= TEXT )
            // HydraConst.g:2637:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_hydraconstraints_SimpleFeature1980); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_hydraconstraints_SimpleFeature_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_SimpleFeature"


    // $ANTLR start "parse_hydraconstraints_MultipleFeature"
    // HydraConst.g:2687:1: parse_hydraconstraints_MultipleFeature returns [hydraconstraints.MultipleFeature element = null] : ( (a0= TEXT ) | c0= parse_hydraconstraints_SimpleFeature );
    public final hydraconstraints.MultipleFeature parse_hydraconstraints_MultipleFeature() throws RecognitionException {
        hydraconstraints.MultipleFeature element =  null;
        int parse_hydraconstraints_MultipleFeature_StartIndex = input.index();
        Token a0=null;
        hydraconstraints.SimpleFeature c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // HydraConst.g:2690:1: ( (a0= TEXT ) | c0= parse_hydraconstraints_SimpleFeature )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TEXT) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred7_HydraConst()) ) {
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
                    // HydraConst.g:2691:2: (a0= TEXT )
                    {
                    // HydraConst.g:2691:2: (a0= TEXT )
                    // HydraConst.g:2692:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_hydraconstraints_MultipleFeature2020); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // HydraConst.g:2740:2: c0= parse_hydraconstraints_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_MultipleFeature2046);
                    c0=parse_hydraconstraints_SimpleFeature();

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
            if ( state.backtracking>0 ) { memoize(input, 27, parse_hydraconstraints_MultipleFeature_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_MultipleFeature"


    // $ANTLR start "parse_hydraconstraints_Number"
    // HydraConst.g:2744:1: parse_hydraconstraints_Number returns [hydraconstraints.Number element = null] : (a0= DIGIT ) ;
    public final hydraconstraints.Number parse_hydraconstraints_Number() throws RecognitionException {
        hydraconstraints.Number element =  null;
        int parse_hydraconstraints_Number_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // HydraConst.g:2747:1: ( (a0= DIGIT ) )
            // HydraConst.g:2748:2: (a0= DIGIT )
            {
            // HydraConst.g:2748:2: (a0= DIGIT )
            // HydraConst.g:2749:3: a0= DIGIT
            {
            a0=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_parse_hydraconstraints_Number2075); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_hydraconstraints_Number_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Number"


    // $ANTLR start "parse_hydraconstraints_Operand"
    // HydraConst.g:2797:1: parse_hydraconstraints_Operand returns [hydraconstraints.Operand element = null] : (c0= parse_hydraconstraints_And | c1= parse_hydraconstraints_Or | c2= parse_hydraconstraints_Xor | c3= parse_hydraconstraints_Implies | c4= parse_hydraconstraints_Neg | c5= parse_hydraconstraints_Plus | c6= parse_hydraconstraints_Minus | c7= parse_hydraconstraints_Mul | c8= parse_hydraconstraints_Div | c9= parse_hydraconstraints_Context | c10= parse_hydraconstraints_All | c11= parse_hydraconstraints_Any | c12= parse_hydraconstraints_More | c13= parse_hydraconstraints_MoreOrEqual | c14= parse_hydraconstraints_Less | c15= parse_hydraconstraints_LessOrEqual | c16= parse_hydraconstraints_NotEqual | c17= parse_hydraconstraints_Equal | c18= parse_hydraconstraints_SimpleFeature | c19= parse_hydraconstraints_MultipleFeature | c20= parse_hydraconstraints_Number );
    public final hydraconstraints.Operand parse_hydraconstraints_Operand() throws RecognitionException {
        hydraconstraints.Operand element =  null;
        int parse_hydraconstraints_Operand_StartIndex = input.index();
        hydraconstraints.And c0 = null;

        hydraconstraints.Or c1 = null;

        hydraconstraints.Xor c2 = null;

        hydraconstraints.Implies c3 = null;

        hydraconstraints.Neg c4 = null;

        hydraconstraints.Plus c5 = null;

        hydraconstraints.Minus c6 = null;

        hydraconstraints.Mul c7 = null;

        hydraconstraints.Div c8 = null;

        hydraconstraints.Context c9 = null;

        hydraconstraints.All c10 = null;

        hydraconstraints.Any c11 = null;

        hydraconstraints.More c12 = null;

        hydraconstraints.MoreOrEqual c13 = null;

        hydraconstraints.Less c14 = null;

        hydraconstraints.LessOrEqual c15 = null;

        hydraconstraints.NotEqual c16 = null;

        hydraconstraints.Equal c17 = null;

        hydraconstraints.SimpleFeature c18 = null;

        hydraconstraints.MultipleFeature c19 = null;

        hydraconstraints.Number c20 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // HydraConst.g:2798:1: (c0= parse_hydraconstraints_And | c1= parse_hydraconstraints_Or | c2= parse_hydraconstraints_Xor | c3= parse_hydraconstraints_Implies | c4= parse_hydraconstraints_Neg | c5= parse_hydraconstraints_Plus | c6= parse_hydraconstraints_Minus | c7= parse_hydraconstraints_Mul | c8= parse_hydraconstraints_Div | c9= parse_hydraconstraints_Context | c10= parse_hydraconstraints_All | c11= parse_hydraconstraints_Any | c12= parse_hydraconstraints_More | c13= parse_hydraconstraints_MoreOrEqual | c14= parse_hydraconstraints_Less | c15= parse_hydraconstraints_LessOrEqual | c16= parse_hydraconstraints_NotEqual | c17= parse_hydraconstraints_Equal | c18= parse_hydraconstraints_SimpleFeature | c19= parse_hydraconstraints_MultipleFeature | c20= parse_hydraconstraints_Number )
            int alt8=21;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // HydraConst.g:2799:2: c0= parse_hydraconstraints_And
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_And_in_parse_hydraconstraints_Operand2107);
                    c0=parse_hydraconstraints_And();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:2800:4: c1= parse_hydraconstraints_Or
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Or_in_parse_hydraconstraints_Operand2117);
                    c1=parse_hydraconstraints_Or();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // HydraConst.g:2801:4: c2= parse_hydraconstraints_Xor
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Xor_in_parse_hydraconstraints_Operand2127);
                    c2=parse_hydraconstraints_Xor();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // HydraConst.g:2802:4: c3= parse_hydraconstraints_Implies
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Implies_in_parse_hydraconstraints_Operand2137);
                    c3=parse_hydraconstraints_Implies();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // HydraConst.g:2803:4: c4= parse_hydraconstraints_Neg
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Neg_in_parse_hydraconstraints_Operand2147);
                    c4=parse_hydraconstraints_Neg();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // HydraConst.g:2804:4: c5= parse_hydraconstraints_Plus
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Plus_in_parse_hydraconstraints_Operand2157);
                    c5=parse_hydraconstraints_Plus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // HydraConst.g:2805:4: c6= parse_hydraconstraints_Minus
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Minus_in_parse_hydraconstraints_Operand2167);
                    c6=parse_hydraconstraints_Minus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // HydraConst.g:2806:4: c7= parse_hydraconstraints_Mul
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Mul_in_parse_hydraconstraints_Operand2177);
                    c7=parse_hydraconstraints_Mul();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 9 :
                    // HydraConst.g:2807:4: c8= parse_hydraconstraints_Div
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Div_in_parse_hydraconstraints_Operand2187);
                    c8=parse_hydraconstraints_Div();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 10 :
                    // HydraConst.g:2808:4: c9= parse_hydraconstraints_Context
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_Operand2197);
                    c9=parse_hydraconstraints_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 11 :
                    // HydraConst.g:2809:4: c10= parse_hydraconstraints_All
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_All_in_parse_hydraconstraints_Operand2207);
                    c10=parse_hydraconstraints_All();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 12 :
                    // HydraConst.g:2810:4: c11= parse_hydraconstraints_Any
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Any_in_parse_hydraconstraints_Operand2217);
                    c11=parse_hydraconstraints_Any();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 13 :
                    // HydraConst.g:2811:4: c12= parse_hydraconstraints_More
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_More_in_parse_hydraconstraints_Operand2227);
                    c12=parse_hydraconstraints_More();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 14 :
                    // HydraConst.g:2812:4: c13= parse_hydraconstraints_MoreOrEqual
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_MoreOrEqual_in_parse_hydraconstraints_Operand2237);
                    c13=parse_hydraconstraints_MoreOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c13; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 15 :
                    // HydraConst.g:2813:4: c14= parse_hydraconstraints_Less
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Less_in_parse_hydraconstraints_Operand2247);
                    c14=parse_hydraconstraints_Less();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c14; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 16 :
                    // HydraConst.g:2814:4: c15= parse_hydraconstraints_LessOrEqual
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_LessOrEqual_in_parse_hydraconstraints_Operand2257);
                    c15=parse_hydraconstraints_LessOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c15; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 17 :
                    // HydraConst.g:2815:4: c16= parse_hydraconstraints_NotEqual
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_NotEqual_in_parse_hydraconstraints_Operand2267);
                    c16=parse_hydraconstraints_NotEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c16; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 18 :
                    // HydraConst.g:2816:4: c17= parse_hydraconstraints_Equal
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Equal_in_parse_hydraconstraints_Operand2277);
                    c17=parse_hydraconstraints_Equal();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c17; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 19 :
                    // HydraConst.g:2817:4: c18= parse_hydraconstraints_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_Operand2287);
                    c18=parse_hydraconstraints_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c18; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 20 :
                    // HydraConst.g:2818:4: c19= parse_hydraconstraints_MultipleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_Operand2297);
                    c19=parse_hydraconstraints_MultipleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c19; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 21 :
                    // HydraConst.g:2819:4: c20= parse_hydraconstraints_Number
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Number_in_parse_hydraconstraints_Operand2307);
                    c20=parse_hydraconstraints_Number();

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
            if ( state.backtracking>0 ) { memoize(input, 29, parse_hydraconstraints_Operand_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_Operand"


    // $ANTLR start "parse_hydraconstraints_BoolOperand"
    // HydraConst.g:2823:1: parse_hydraconstraints_BoolOperand returns [hydraconstraints.BoolOperand element = null] : (c0= parse_hydraconstraints_And | c1= parse_hydraconstraints_Or | c2= parse_hydraconstraints_Xor | c3= parse_hydraconstraints_Implies | c4= parse_hydraconstraints_Neg | c5= parse_hydraconstraints_Context | c6= parse_hydraconstraints_All | c7= parse_hydraconstraints_Any | c8= parse_hydraconstraints_More | c9= parse_hydraconstraints_MoreOrEqual | c10= parse_hydraconstraints_Less | c11= parse_hydraconstraints_LessOrEqual | c12= parse_hydraconstraints_NotEqual | c13= parse_hydraconstraints_Equal | c14= parse_hydraconstraints_SimpleFeature );
    public final hydraconstraints.BoolOperand parse_hydraconstraints_BoolOperand() throws RecognitionException {
        hydraconstraints.BoolOperand element =  null;
        int parse_hydraconstraints_BoolOperand_StartIndex = input.index();
        hydraconstraints.And c0 = null;

        hydraconstraints.Or c1 = null;

        hydraconstraints.Xor c2 = null;

        hydraconstraints.Implies c3 = null;

        hydraconstraints.Neg c4 = null;

        hydraconstraints.Context c5 = null;

        hydraconstraints.All c6 = null;

        hydraconstraints.Any c7 = null;

        hydraconstraints.More c8 = null;

        hydraconstraints.MoreOrEqual c9 = null;

        hydraconstraints.Less c10 = null;

        hydraconstraints.LessOrEqual c11 = null;

        hydraconstraints.NotEqual c12 = null;

        hydraconstraints.Equal c13 = null;

        hydraconstraints.SimpleFeature c14 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // HydraConst.g:2824:1: (c0= parse_hydraconstraints_And | c1= parse_hydraconstraints_Or | c2= parse_hydraconstraints_Xor | c3= parse_hydraconstraints_Implies | c4= parse_hydraconstraints_Neg | c5= parse_hydraconstraints_Context | c6= parse_hydraconstraints_All | c7= parse_hydraconstraints_Any | c8= parse_hydraconstraints_More | c9= parse_hydraconstraints_MoreOrEqual | c10= parse_hydraconstraints_Less | c11= parse_hydraconstraints_LessOrEqual | c12= parse_hydraconstraints_NotEqual | c13= parse_hydraconstraints_Equal | c14= parse_hydraconstraints_SimpleFeature )
            int alt9=15;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // HydraConst.g:2825:2: c0= parse_hydraconstraints_And
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_And_in_parse_hydraconstraints_BoolOperand2328);
                    c0=parse_hydraconstraints_And();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:2826:4: c1= parse_hydraconstraints_Or
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Or_in_parse_hydraconstraints_BoolOperand2338);
                    c1=parse_hydraconstraints_Or();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // HydraConst.g:2827:4: c2= parse_hydraconstraints_Xor
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Xor_in_parse_hydraconstraints_BoolOperand2348);
                    c2=parse_hydraconstraints_Xor();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // HydraConst.g:2828:4: c3= parse_hydraconstraints_Implies
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Implies_in_parse_hydraconstraints_BoolOperand2358);
                    c3=parse_hydraconstraints_Implies();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // HydraConst.g:2829:4: c4= parse_hydraconstraints_Neg
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Neg_in_parse_hydraconstraints_BoolOperand2368);
                    c4=parse_hydraconstraints_Neg();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // HydraConst.g:2830:4: c5= parse_hydraconstraints_Context
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_BoolOperand2378);
                    c5=parse_hydraconstraints_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // HydraConst.g:2831:4: c6= parse_hydraconstraints_All
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_All_in_parse_hydraconstraints_BoolOperand2388);
                    c6=parse_hydraconstraints_All();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // HydraConst.g:2832:4: c7= parse_hydraconstraints_Any
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Any_in_parse_hydraconstraints_BoolOperand2398);
                    c7=parse_hydraconstraints_Any();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 9 :
                    // HydraConst.g:2833:4: c8= parse_hydraconstraints_More
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_More_in_parse_hydraconstraints_BoolOperand2408);
                    c8=parse_hydraconstraints_More();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 10 :
                    // HydraConst.g:2834:4: c9= parse_hydraconstraints_MoreOrEqual
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_MoreOrEqual_in_parse_hydraconstraints_BoolOperand2418);
                    c9=parse_hydraconstraints_MoreOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 11 :
                    // HydraConst.g:2835:4: c10= parse_hydraconstraints_Less
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Less_in_parse_hydraconstraints_BoolOperand2428);
                    c10=parse_hydraconstraints_Less();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 12 :
                    // HydraConst.g:2836:4: c11= parse_hydraconstraints_LessOrEqual
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_LessOrEqual_in_parse_hydraconstraints_BoolOperand2438);
                    c11=parse_hydraconstraints_LessOrEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 13 :
                    // HydraConst.g:2837:4: c12= parse_hydraconstraints_NotEqual
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_NotEqual_in_parse_hydraconstraints_BoolOperand2448);
                    c12=parse_hydraconstraints_NotEqual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 14 :
                    // HydraConst.g:2838:4: c13= parse_hydraconstraints_Equal
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Equal_in_parse_hydraconstraints_BoolOperand2458);
                    c13=parse_hydraconstraints_Equal();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c13; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 15 :
                    // HydraConst.g:2839:4: c14= parse_hydraconstraints_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_BoolOperand2468);
                    c14=parse_hydraconstraints_SimpleFeature();

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
            if ( state.backtracking>0 ) { memoize(input, 30, parse_hydraconstraints_BoolOperand_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_BoolOperand"


    // $ANTLR start "parse_hydraconstraints_BoolOperandChoices"
    // HydraConst.g:2843:1: parse_hydraconstraints_BoolOperandChoices returns [hydraconstraints.BoolOperandChoices element = null] : (c0= parse_hydraconstraints_Context | c1= parse_hydraconstraints_All | c2= parse_hydraconstraints_Any | c3= parse_hydraconstraints_SimpleFeature );
    public final hydraconstraints.BoolOperandChoices parse_hydraconstraints_BoolOperandChoices() throws RecognitionException {
        hydraconstraints.BoolOperandChoices element =  null;
        int parse_hydraconstraints_BoolOperandChoices_StartIndex = input.index();
        hydraconstraints.Context c0 = null;

        hydraconstraints.All c1 = null;

        hydraconstraints.Any c2 = null;

        hydraconstraints.SimpleFeature c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // HydraConst.g:2844:1: (c0= parse_hydraconstraints_Context | c1= parse_hydraconstraints_All | c2= parse_hydraconstraints_Any | c3= parse_hydraconstraints_SimpleFeature )
            int alt10=4;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=13 && LA10_1<=16)) ) {
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
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
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
                    // HydraConst.g:2845:2: c0= parse_hydraconstraints_Context
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_BoolOperandChoices2489);
                    c0=parse_hydraconstraints_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:2846:4: c1= parse_hydraconstraints_All
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_All_in_parse_hydraconstraints_BoolOperandChoices2499);
                    c1=parse_hydraconstraints_All();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // HydraConst.g:2847:4: c2= parse_hydraconstraints_Any
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Any_in_parse_hydraconstraints_BoolOperandChoices2509);
                    c2=parse_hydraconstraints_Any();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // HydraConst.g:2848:4: c3= parse_hydraconstraints_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_BoolOperandChoices2519);
                    c3=parse_hydraconstraints_SimpleFeature();

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
            if ( state.backtracking>0 ) { memoize(input, 31, parse_hydraconstraints_BoolOperandChoices_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_BoolOperandChoices"


    // $ANTLR start "parse_hydraconstraints_NumOperandChoices"
    // HydraConst.g:2852:1: parse_hydraconstraints_NumOperandChoices returns [hydraconstraints.NumOperandChoices element = null] : (c0= parse_hydraconstraints_Context | c1= parse_hydraconstraints_SimpleFeature | c2= parse_hydraconstraints_MultipleFeature | c3= parse_hydraconstraints_Number );
    public final hydraconstraints.NumOperandChoices parse_hydraconstraints_NumOperandChoices() throws RecognitionException {
        hydraconstraints.NumOperandChoices element =  null;
        int parse_hydraconstraints_NumOperandChoices_StartIndex = input.index();
        hydraconstraints.Context c0 = null;

        hydraconstraints.SimpleFeature c1 = null;

        hydraconstraints.MultipleFeature c2 = null;

        hydraconstraints.Number c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // HydraConst.g:2853:1: (c0= parse_hydraconstraints_Context | c1= parse_hydraconstraints_SimpleFeature | c2= parse_hydraconstraints_MultipleFeature | c3= parse_hydraconstraints_Number )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TEXT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==22) ) {
                    alt11=1;
                }
                else if ( (synpred46_HydraConst()) ) {
                    alt11=2;
                }
                else if ( (synpred47_HydraConst()) ) {
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
                    // HydraConst.g:2854:2: c0= parse_hydraconstraints_Context
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_NumOperandChoices2540);
                    c0=parse_hydraconstraints_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:2855:4: c1= parse_hydraconstraints_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_NumOperandChoices2550);
                    c1=parse_hydraconstraints_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // HydraConst.g:2856:4: c2= parse_hydraconstraints_MultipleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_NumOperandChoices2560);
                    c2=parse_hydraconstraints_MultipleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // HydraConst.g:2857:4: c3= parse_hydraconstraints_Number
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Number_in_parse_hydraconstraints_NumOperandChoices2570);
                    c3=parse_hydraconstraints_Number();

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
            if ( state.backtracking>0 ) { memoize(input, 32, parse_hydraconstraints_NumOperandChoices_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_NumOperandChoices"


    // $ANTLR start "parse_hydraconstraints_NumOperand"
    // HydraConst.g:2861:1: parse_hydraconstraints_NumOperand returns [hydraconstraints.NumOperand element = null] : (c0= parse_hydraconstraints_Plus | c1= parse_hydraconstraints_Minus | c2= parse_hydraconstraints_Mul | c3= parse_hydraconstraints_Div | c4= parse_hydraconstraints_Context | c5= parse_hydraconstraints_SimpleFeature | c6= parse_hydraconstraints_MultipleFeature | c7= parse_hydraconstraints_Number );
    public final hydraconstraints.NumOperand parse_hydraconstraints_NumOperand() throws RecognitionException {
        hydraconstraints.NumOperand element =  null;
        int parse_hydraconstraints_NumOperand_StartIndex = input.index();
        hydraconstraints.Plus c0 = null;

        hydraconstraints.Minus c1 = null;

        hydraconstraints.Mul c2 = null;

        hydraconstraints.Div c3 = null;

        hydraconstraints.Context c4 = null;

        hydraconstraints.SimpleFeature c5 = null;

        hydraconstraints.MultipleFeature c6 = null;

        hydraconstraints.Number c7 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // HydraConst.g:2862:1: (c0= parse_hydraconstraints_Plus | c1= parse_hydraconstraints_Minus | c2= parse_hydraconstraints_Mul | c3= parse_hydraconstraints_Div | c4= parse_hydraconstraints_Context | c5= parse_hydraconstraints_SimpleFeature | c6= parse_hydraconstraints_MultipleFeature | c7= parse_hydraconstraints_Number )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // HydraConst.g:2863:2: c0= parse_hydraconstraints_Plus
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Plus_in_parse_hydraconstraints_NumOperand2591);
                    c0=parse_hydraconstraints_Plus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // HydraConst.g:2864:4: c1= parse_hydraconstraints_Minus
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Minus_in_parse_hydraconstraints_NumOperand2601);
                    c1=parse_hydraconstraints_Minus();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // HydraConst.g:2865:4: c2= parse_hydraconstraints_Mul
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Mul_in_parse_hydraconstraints_NumOperand2611);
                    c2=parse_hydraconstraints_Mul();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // HydraConst.g:2866:4: c3= parse_hydraconstraints_Div
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Div_in_parse_hydraconstraints_NumOperand2621);
                    c3=parse_hydraconstraints_Div();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // HydraConst.g:2867:4: c4= parse_hydraconstraints_Context
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_NumOperand2631);
                    c4=parse_hydraconstraints_Context();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // HydraConst.g:2868:4: c5= parse_hydraconstraints_SimpleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_NumOperand2641);
                    c5=parse_hydraconstraints_SimpleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // HydraConst.g:2869:4: c6= parse_hydraconstraints_MultipleFeature
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_NumOperand2651);
                    c6=parse_hydraconstraints_MultipleFeature();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // HydraConst.g:2870:4: c7= parse_hydraconstraints_Number
                    {
                    pushFollow(FOLLOW_parse_hydraconstraints_Number_in_parse_hydraconstraints_NumOperand2661);
                    c7=parse_hydraconstraints_Number();

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
            if ( state.backtracking>0 ) { memoize(input, 33, parse_hydraconstraints_NumOperand_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_hydraconstraints_NumOperand"

    // $ANTLR start synpred2_HydraConst
    public final void synpred2_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Operand a0_0 = null;


        // HydraConst.g:707:2: ( (a0_0= parse_hydraconstraints_Operand ) )
        // HydraConst.g:707:2: (a0_0= parse_hydraconstraints_Operand )
        {
        // HydraConst.g:707:2: (a0_0= parse_hydraconstraints_Operand )
        // HydraConst.g:708:3: a0_0= parse_hydraconstraints_Operand
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Operand_in_synpred2_HydraConst263);
        a0_0=parse_hydraconstraints_Operand();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_HydraConst

    // $ANTLR start synpred4_HydraConst
    public final void synpred4_HydraConst_fragment() throws RecognitionException {   
        Token a0=null;
        Token a2=null;
        hydraconstraints.BoolOperand a1_0 = null;


        // HydraConst.g:905:2: (a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')' )
        // HydraConst.g:905:2: a0= '(' (a1_0= parse_hydraconstraints_BoolOperand ) a2= ')'
        {
        a0=(Token)match(input,11,FOLLOW_11_in_synpred4_HydraConst441); if (state.failed) return ;
        // HydraConst.g:927:2: (a1_0= parse_hydraconstraints_BoolOperand )
        // HydraConst.g:928:3: a1_0= parse_hydraconstraints_BoolOperand
        {
        pushFollow(FOLLOW_parse_hydraconstraints_BoolOperand_in_synpred4_HydraConst459);
        a1_0=parse_hydraconstraints_BoolOperand();

        state._fsp--;
        if (state.failed) return ;

        }

        a2=(Token)match(input,12,FOLLOW_12_in_synpred4_HydraConst477); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_HydraConst

    // $ANTLR start synpred6_HydraConst
    public final void synpred6_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.NumOperand a0_0 = null;


        // HydraConst.g:1102:2: ( (a0_0= parse_hydraconstraints_NumOperand ) )
        // HydraConst.g:1102:2: (a0_0= parse_hydraconstraints_NumOperand )
        {
        // HydraConst.g:1102:2: (a0_0= parse_hydraconstraints_NumOperand )
        // HydraConst.g:1103:3: a0_0= parse_hydraconstraints_NumOperand
        {
        pushFollow(FOLLOW_parse_hydraconstraints_NumOperand_in_synpred6_HydraConst627);
        a0_0=parse_hydraconstraints_NumOperand();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_HydraConst

    // $ANTLR start synpred7_HydraConst
    public final void synpred7_HydraConst_fragment() throws RecognitionException {   
        Token a0=null;

        // HydraConst.g:2691:2: ( (a0= TEXT ) )
        // HydraConst.g:2691:2: (a0= TEXT )
        {
        // HydraConst.g:2691:2: (a0= TEXT )
        // HydraConst.g:2692:3: a0= TEXT
        {
        a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_synpred7_HydraConst2020); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_HydraConst

    // $ANTLR start synpred8_HydraConst
    public final void synpred8_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.And c0 = null;


        // HydraConst.g:2799:2: (c0= parse_hydraconstraints_And )
        // HydraConst.g:2799:2: c0= parse_hydraconstraints_And
        {
        pushFollow(FOLLOW_parse_hydraconstraints_And_in_synpred8_HydraConst2107);
        c0=parse_hydraconstraints_And();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_HydraConst

    // $ANTLR start synpred9_HydraConst
    public final void synpred9_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Or c1 = null;


        // HydraConst.g:2800:4: (c1= parse_hydraconstraints_Or )
        // HydraConst.g:2800:4: c1= parse_hydraconstraints_Or
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Or_in_synpred9_HydraConst2117);
        c1=parse_hydraconstraints_Or();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_HydraConst

    // $ANTLR start synpred10_HydraConst
    public final void synpred10_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Xor c2 = null;


        // HydraConst.g:2801:4: (c2= parse_hydraconstraints_Xor )
        // HydraConst.g:2801:4: c2= parse_hydraconstraints_Xor
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Xor_in_synpred10_HydraConst2127);
        c2=parse_hydraconstraints_Xor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_HydraConst

    // $ANTLR start synpred11_HydraConst
    public final void synpred11_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Implies c3 = null;


        // HydraConst.g:2802:4: (c3= parse_hydraconstraints_Implies )
        // HydraConst.g:2802:4: c3= parse_hydraconstraints_Implies
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Implies_in_synpred11_HydraConst2137);
        c3=parse_hydraconstraints_Implies();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_HydraConst

    // $ANTLR start synpred13_HydraConst
    public final void synpred13_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Plus c5 = null;


        // HydraConst.g:2804:4: (c5= parse_hydraconstraints_Plus )
        // HydraConst.g:2804:4: c5= parse_hydraconstraints_Plus
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Plus_in_synpred13_HydraConst2157);
        c5=parse_hydraconstraints_Plus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_HydraConst

    // $ANTLR start synpred14_HydraConst
    public final void synpred14_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Minus c6 = null;


        // HydraConst.g:2805:4: (c6= parse_hydraconstraints_Minus )
        // HydraConst.g:2805:4: c6= parse_hydraconstraints_Minus
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Minus_in_synpred14_HydraConst2167);
        c6=parse_hydraconstraints_Minus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_HydraConst

    // $ANTLR start synpred15_HydraConst
    public final void synpred15_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Mul c7 = null;


        // HydraConst.g:2806:4: (c7= parse_hydraconstraints_Mul )
        // HydraConst.g:2806:4: c7= parse_hydraconstraints_Mul
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Mul_in_synpred15_HydraConst2177);
        c7=parse_hydraconstraints_Mul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_HydraConst

    // $ANTLR start synpred16_HydraConst
    public final void synpred16_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Div c8 = null;


        // HydraConst.g:2807:4: (c8= parse_hydraconstraints_Div )
        // HydraConst.g:2807:4: c8= parse_hydraconstraints_Div
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Div_in_synpred16_HydraConst2187);
        c8=parse_hydraconstraints_Div();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_HydraConst

    // $ANTLR start synpred17_HydraConst
    public final void synpred17_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Context c9 = null;


        // HydraConst.g:2808:4: (c9= parse_hydraconstraints_Context )
        // HydraConst.g:2808:4: c9= parse_hydraconstraints_Context
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Context_in_synpred17_HydraConst2197);
        c9=parse_hydraconstraints_Context();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_HydraConst

    // $ANTLR start synpred18_HydraConst
    public final void synpred18_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.All c10 = null;


        // HydraConst.g:2809:4: (c10= parse_hydraconstraints_All )
        // HydraConst.g:2809:4: c10= parse_hydraconstraints_All
        {
        pushFollow(FOLLOW_parse_hydraconstraints_All_in_synpred18_HydraConst2207);
        c10=parse_hydraconstraints_All();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_HydraConst

    // $ANTLR start synpred19_HydraConst
    public final void synpred19_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Any c11 = null;


        // HydraConst.g:2810:4: (c11= parse_hydraconstraints_Any )
        // HydraConst.g:2810:4: c11= parse_hydraconstraints_Any
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Any_in_synpred19_HydraConst2217);
        c11=parse_hydraconstraints_Any();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_HydraConst

    // $ANTLR start synpred20_HydraConst
    public final void synpred20_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.More c12 = null;


        // HydraConst.g:2811:4: (c12= parse_hydraconstraints_More )
        // HydraConst.g:2811:4: c12= parse_hydraconstraints_More
        {
        pushFollow(FOLLOW_parse_hydraconstraints_More_in_synpred20_HydraConst2227);
        c12=parse_hydraconstraints_More();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_HydraConst

    // $ANTLR start synpred21_HydraConst
    public final void synpred21_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.MoreOrEqual c13 = null;


        // HydraConst.g:2812:4: (c13= parse_hydraconstraints_MoreOrEqual )
        // HydraConst.g:2812:4: c13= parse_hydraconstraints_MoreOrEqual
        {
        pushFollow(FOLLOW_parse_hydraconstraints_MoreOrEqual_in_synpred21_HydraConst2237);
        c13=parse_hydraconstraints_MoreOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_HydraConst

    // $ANTLR start synpred22_HydraConst
    public final void synpred22_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Less c14 = null;


        // HydraConst.g:2813:4: (c14= parse_hydraconstraints_Less )
        // HydraConst.g:2813:4: c14= parse_hydraconstraints_Less
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Less_in_synpred22_HydraConst2247);
        c14=parse_hydraconstraints_Less();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_HydraConst

    // $ANTLR start synpred23_HydraConst
    public final void synpred23_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.LessOrEqual c15 = null;


        // HydraConst.g:2814:4: (c15= parse_hydraconstraints_LessOrEqual )
        // HydraConst.g:2814:4: c15= parse_hydraconstraints_LessOrEqual
        {
        pushFollow(FOLLOW_parse_hydraconstraints_LessOrEqual_in_synpred23_HydraConst2257);
        c15=parse_hydraconstraints_LessOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_HydraConst

    // $ANTLR start synpred24_HydraConst
    public final void synpred24_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.NotEqual c16 = null;


        // HydraConst.g:2815:4: (c16= parse_hydraconstraints_NotEqual )
        // HydraConst.g:2815:4: c16= parse_hydraconstraints_NotEqual
        {
        pushFollow(FOLLOW_parse_hydraconstraints_NotEqual_in_synpred24_HydraConst2267);
        c16=parse_hydraconstraints_NotEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_HydraConst

    // $ANTLR start synpred25_HydraConst
    public final void synpred25_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Equal c17 = null;


        // HydraConst.g:2816:4: (c17= parse_hydraconstraints_Equal )
        // HydraConst.g:2816:4: c17= parse_hydraconstraints_Equal
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Equal_in_synpred25_HydraConst2277);
        c17=parse_hydraconstraints_Equal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_HydraConst

    // $ANTLR start synpred26_HydraConst
    public final void synpred26_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.SimpleFeature c18 = null;


        // HydraConst.g:2817:4: (c18= parse_hydraconstraints_SimpleFeature )
        // HydraConst.g:2817:4: c18= parse_hydraconstraints_SimpleFeature
        {
        pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_synpred26_HydraConst2287);
        c18=parse_hydraconstraints_SimpleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_HydraConst

    // $ANTLR start synpred27_HydraConst
    public final void synpred27_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.MultipleFeature c19 = null;


        // HydraConst.g:2818:4: (c19= parse_hydraconstraints_MultipleFeature )
        // HydraConst.g:2818:4: c19= parse_hydraconstraints_MultipleFeature
        {
        pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_synpred27_HydraConst2297);
        c19=parse_hydraconstraints_MultipleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_HydraConst

    // $ANTLR start synpred28_HydraConst
    public final void synpred28_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.And c0 = null;


        // HydraConst.g:2825:2: (c0= parse_hydraconstraints_And )
        // HydraConst.g:2825:2: c0= parse_hydraconstraints_And
        {
        pushFollow(FOLLOW_parse_hydraconstraints_And_in_synpred28_HydraConst2328);
        c0=parse_hydraconstraints_And();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_HydraConst

    // $ANTLR start synpred29_HydraConst
    public final void synpred29_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Or c1 = null;


        // HydraConst.g:2826:4: (c1= parse_hydraconstraints_Or )
        // HydraConst.g:2826:4: c1= parse_hydraconstraints_Or
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Or_in_synpred29_HydraConst2338);
        c1=parse_hydraconstraints_Or();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_HydraConst

    // $ANTLR start synpred30_HydraConst
    public final void synpred30_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Xor c2 = null;


        // HydraConst.g:2827:4: (c2= parse_hydraconstraints_Xor )
        // HydraConst.g:2827:4: c2= parse_hydraconstraints_Xor
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Xor_in_synpred30_HydraConst2348);
        c2=parse_hydraconstraints_Xor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_HydraConst

    // $ANTLR start synpred31_HydraConst
    public final void synpred31_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Implies c3 = null;


        // HydraConst.g:2828:4: (c3= parse_hydraconstraints_Implies )
        // HydraConst.g:2828:4: c3= parse_hydraconstraints_Implies
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Implies_in_synpred31_HydraConst2358);
        c3=parse_hydraconstraints_Implies();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_HydraConst

    // $ANTLR start synpred33_HydraConst
    public final void synpred33_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Context c5 = null;


        // HydraConst.g:2830:4: (c5= parse_hydraconstraints_Context )
        // HydraConst.g:2830:4: c5= parse_hydraconstraints_Context
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Context_in_synpred33_HydraConst2378);
        c5=parse_hydraconstraints_Context();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_HydraConst

    // $ANTLR start synpred34_HydraConst
    public final void synpred34_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.All c6 = null;


        // HydraConst.g:2831:4: (c6= parse_hydraconstraints_All )
        // HydraConst.g:2831:4: c6= parse_hydraconstraints_All
        {
        pushFollow(FOLLOW_parse_hydraconstraints_All_in_synpred34_HydraConst2388);
        c6=parse_hydraconstraints_All();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_HydraConst

    // $ANTLR start synpred35_HydraConst
    public final void synpred35_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Any c7 = null;


        // HydraConst.g:2832:4: (c7= parse_hydraconstraints_Any )
        // HydraConst.g:2832:4: c7= parse_hydraconstraints_Any
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Any_in_synpred35_HydraConst2398);
        c7=parse_hydraconstraints_Any();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_HydraConst

    // $ANTLR start synpred36_HydraConst
    public final void synpred36_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.More c8 = null;


        // HydraConst.g:2833:4: (c8= parse_hydraconstraints_More )
        // HydraConst.g:2833:4: c8= parse_hydraconstraints_More
        {
        pushFollow(FOLLOW_parse_hydraconstraints_More_in_synpred36_HydraConst2408);
        c8=parse_hydraconstraints_More();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_HydraConst

    // $ANTLR start synpred37_HydraConst
    public final void synpred37_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.MoreOrEqual c9 = null;


        // HydraConst.g:2834:4: (c9= parse_hydraconstraints_MoreOrEqual )
        // HydraConst.g:2834:4: c9= parse_hydraconstraints_MoreOrEqual
        {
        pushFollow(FOLLOW_parse_hydraconstraints_MoreOrEqual_in_synpred37_HydraConst2418);
        c9=parse_hydraconstraints_MoreOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_HydraConst

    // $ANTLR start synpred38_HydraConst
    public final void synpred38_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Less c10 = null;


        // HydraConst.g:2835:4: (c10= parse_hydraconstraints_Less )
        // HydraConst.g:2835:4: c10= parse_hydraconstraints_Less
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Less_in_synpred38_HydraConst2428);
        c10=parse_hydraconstraints_Less();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_HydraConst

    // $ANTLR start synpred39_HydraConst
    public final void synpred39_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.LessOrEqual c11 = null;


        // HydraConst.g:2836:4: (c11= parse_hydraconstraints_LessOrEqual )
        // HydraConst.g:2836:4: c11= parse_hydraconstraints_LessOrEqual
        {
        pushFollow(FOLLOW_parse_hydraconstraints_LessOrEqual_in_synpred39_HydraConst2438);
        c11=parse_hydraconstraints_LessOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_HydraConst

    // $ANTLR start synpred40_HydraConst
    public final void synpred40_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.NotEqual c12 = null;


        // HydraConst.g:2837:4: (c12= parse_hydraconstraints_NotEqual )
        // HydraConst.g:2837:4: c12= parse_hydraconstraints_NotEqual
        {
        pushFollow(FOLLOW_parse_hydraconstraints_NotEqual_in_synpred40_HydraConst2448);
        c12=parse_hydraconstraints_NotEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_HydraConst

    // $ANTLR start synpred41_HydraConst
    public final void synpred41_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Equal c13 = null;


        // HydraConst.g:2838:4: (c13= parse_hydraconstraints_Equal )
        // HydraConst.g:2838:4: c13= parse_hydraconstraints_Equal
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Equal_in_synpred41_HydraConst2458);
        c13=parse_hydraconstraints_Equal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_HydraConst

    // $ANTLR start synpred46_HydraConst
    public final void synpred46_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.SimpleFeature c1 = null;


        // HydraConst.g:2855:4: (c1= parse_hydraconstraints_SimpleFeature )
        // HydraConst.g:2855:4: c1= parse_hydraconstraints_SimpleFeature
        {
        pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_synpred46_HydraConst2550);
        c1=parse_hydraconstraints_SimpleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_HydraConst

    // $ANTLR start synpred47_HydraConst
    public final void synpred47_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.MultipleFeature c2 = null;


        // HydraConst.g:2856:4: (c2= parse_hydraconstraints_MultipleFeature )
        // HydraConst.g:2856:4: c2= parse_hydraconstraints_MultipleFeature
        {
        pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_synpred47_HydraConst2560);
        c2=parse_hydraconstraints_MultipleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_HydraConst

    // $ANTLR start synpred48_HydraConst
    public final void synpred48_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Plus c0 = null;


        // HydraConst.g:2863:2: (c0= parse_hydraconstraints_Plus )
        // HydraConst.g:2863:2: c0= parse_hydraconstraints_Plus
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Plus_in_synpred48_HydraConst2591);
        c0=parse_hydraconstraints_Plus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_HydraConst

    // $ANTLR start synpred49_HydraConst
    public final void synpred49_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Minus c1 = null;


        // HydraConst.g:2864:4: (c1= parse_hydraconstraints_Minus )
        // HydraConst.g:2864:4: c1= parse_hydraconstraints_Minus
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Minus_in_synpred49_HydraConst2601);
        c1=parse_hydraconstraints_Minus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_HydraConst

    // $ANTLR start synpred50_HydraConst
    public final void synpred50_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Mul c2 = null;


        // HydraConst.g:2865:4: (c2= parse_hydraconstraints_Mul )
        // HydraConst.g:2865:4: c2= parse_hydraconstraints_Mul
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Mul_in_synpred50_HydraConst2611);
        c2=parse_hydraconstraints_Mul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_HydraConst

    // $ANTLR start synpred51_HydraConst
    public final void synpred51_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Div c3 = null;


        // HydraConst.g:2866:4: (c3= parse_hydraconstraints_Div )
        // HydraConst.g:2866:4: c3= parse_hydraconstraints_Div
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Div_in_synpred51_HydraConst2621);
        c3=parse_hydraconstraints_Div();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_HydraConst

    // $ANTLR start synpred52_HydraConst
    public final void synpred52_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.Context c4 = null;


        // HydraConst.g:2867:4: (c4= parse_hydraconstraints_Context )
        // HydraConst.g:2867:4: c4= parse_hydraconstraints_Context
        {
        pushFollow(FOLLOW_parse_hydraconstraints_Context_in_synpred52_HydraConst2631);
        c4=parse_hydraconstraints_Context();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_HydraConst

    // $ANTLR start synpred53_HydraConst
    public final void synpred53_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.SimpleFeature c5 = null;


        // HydraConst.g:2868:4: (c5= parse_hydraconstraints_SimpleFeature )
        // HydraConst.g:2868:4: c5= parse_hydraconstraints_SimpleFeature
        {
        pushFollow(FOLLOW_parse_hydraconstraints_SimpleFeature_in_synpred53_HydraConst2641);
        c5=parse_hydraconstraints_SimpleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_HydraConst

    // $ANTLR start synpred54_HydraConst
    public final void synpred54_HydraConst_fragment() throws RecognitionException {   
        hydraconstraints.MultipleFeature c6 = null;


        // HydraConst.g:2869:4: (c6= parse_hydraconstraints_MultipleFeature )
        // HydraConst.g:2869:4: c6= parse_hydraconstraints_MultipleFeature
        {
        pushFollow(FOLLOW_parse_hydraconstraints_MultipleFeature_in_synpred54_HydraConst2651);
        c6=parse_hydraconstraints_MultipleFeature();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_HydraConst

    // Delegated rules

    public final boolean synpred49_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_HydraConst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_HydraConst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_HydraConst_fragment(); // can never throw exception
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
        "\1\5\4\0\1\uffff\1\0\24\uffff";
    static final String DFA8_maxS =
        "\1\31\4\0\1\uffff\1\0\24\uffff";
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
            return "2797:1: parse_hydraconstraints_Operand returns [hydraconstraints.Operand element = null] : (c0= parse_hydraconstraints_And | c1= parse_hydraconstraints_Or | c2= parse_hydraconstraints_Xor | c3= parse_hydraconstraints_Implies | c4= parse_hydraconstraints_Neg | c5= parse_hydraconstraints_Plus | c6= parse_hydraconstraints_Minus | c7= parse_hydraconstraints_Mul | c8= parse_hydraconstraints_Div | c9= parse_hydraconstraints_Context | c10= parse_hydraconstraints_All | c11= parse_hydraconstraints_Any | c12= parse_hydraconstraints_More | c13= parse_hydraconstraints_MoreOrEqual | c14= parse_hydraconstraints_Less | c15= parse_hydraconstraints_LessOrEqual | c16= parse_hydraconstraints_NotEqual | c17= parse_hydraconstraints_Equal | c18= parse_hydraconstraints_SimpleFeature | c19= parse_hydraconstraints_MultipleFeature | c20= parse_hydraconstraints_Number );";
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
                        if ( (synpred8_HydraConst()) ) {s = 7;}

                        else if ( (synpred9_HydraConst()) ) {s = 8;}

                        else if ( (synpred10_HydraConst()) ) {s = 9;}

                        else if ( (synpred11_HydraConst()) ) {s = 10;}

                        else if ( (synpred13_HydraConst()) ) {s = 11;}

                        else if ( (synpred14_HydraConst()) ) {s = 12;}

                        else if ( (synpred15_HydraConst()) ) {s = 13;}

                        else if ( (synpred16_HydraConst()) ) {s = 14;}

                        else if ( (synpred20_HydraConst()) ) {s = 15;}

                        else if ( (synpred21_HydraConst()) ) {s = 16;}

                        else if ( (synpred22_HydraConst()) ) {s = 17;}

                        else if ( (synpred23_HydraConst()) ) {s = 18;}

                        else if ( (synpred24_HydraConst()) ) {s = 19;}

                        else if ( (synpred25_HydraConst()) ) {s = 20;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_HydraConst()) ) {s = 7;}

                        else if ( (synpred9_HydraConst()) ) {s = 8;}

                        else if ( (synpred10_HydraConst()) ) {s = 9;}

                        else if ( (synpred11_HydraConst()) ) {s = 10;}

                        else if ( (synpred13_HydraConst()) ) {s = 11;}

                        else if ( (synpred14_HydraConst()) ) {s = 12;}

                        else if ( (synpred15_HydraConst()) ) {s = 13;}

                        else if ( (synpred16_HydraConst()) ) {s = 14;}

                        else if ( (synpred17_HydraConst()) ) {s = 21;}

                        else if ( (synpred20_HydraConst()) ) {s = 15;}

                        else if ( (synpred21_HydraConst()) ) {s = 16;}

                        else if ( (synpred22_HydraConst()) ) {s = 17;}

                        else if ( (synpred23_HydraConst()) ) {s = 18;}

                        else if ( (synpred24_HydraConst()) ) {s = 19;}

                        else if ( (synpred25_HydraConst()) ) {s = 20;}

                        else if ( (synpred26_HydraConst()) ) {s = 22;}

                        else if ( (synpred27_HydraConst()) ) {s = 23;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_HydraConst()) ) {s = 7;}

                        else if ( (synpred9_HydraConst()) ) {s = 8;}

                        else if ( (synpred10_HydraConst()) ) {s = 9;}

                        else if ( (synpred11_HydraConst()) ) {s = 10;}

                        else if ( (synpred18_HydraConst()) ) {s = 24;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_HydraConst()) ) {s = 7;}

                        else if ( (synpred9_HydraConst()) ) {s = 8;}

                        else if ( (synpred10_HydraConst()) ) {s = 9;}

                        else if ( (synpred11_HydraConst()) ) {s = 10;}

                        else if ( (synpred19_HydraConst()) ) {s = 25;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_HydraConst()) ) {s = 11;}

                        else if ( (synpred14_HydraConst()) ) {s = 12;}

                        else if ( (synpred15_HydraConst()) ) {s = 13;}

                        else if ( (synpred16_HydraConst()) ) {s = 14;}

                        else if ( (synpred20_HydraConst()) ) {s = 15;}

                        else if ( (synpred21_HydraConst()) ) {s = 16;}

                        else if ( (synpred22_HydraConst()) ) {s = 17;}

                        else if ( (synpred23_HydraConst()) ) {s = 18;}

                        else if ( (synpred24_HydraConst()) ) {s = 19;}

                        else if ( (synpred25_HydraConst()) ) {s = 20;}

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
        "\1\5\4\0\1\uffff\1\0\16\uffff";
    static final String DFA9_maxS =
        "\1\31\4\0\1\uffff\1\0\16\uffff";
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
            return "2823:1: parse_hydraconstraints_BoolOperand returns [hydraconstraints.BoolOperand element = null] : (c0= parse_hydraconstraints_And | c1= parse_hydraconstraints_Or | c2= parse_hydraconstraints_Xor | c3= parse_hydraconstraints_Implies | c4= parse_hydraconstraints_Neg | c5= parse_hydraconstraints_Context | c6= parse_hydraconstraints_All | c7= parse_hydraconstraints_Any | c8= parse_hydraconstraints_More | c9= parse_hydraconstraints_MoreOrEqual | c10= parse_hydraconstraints_Less | c11= parse_hydraconstraints_LessOrEqual | c12= parse_hydraconstraints_NotEqual | c13= parse_hydraconstraints_Equal | c14= parse_hydraconstraints_SimpleFeature );";
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
                        if ( (synpred28_HydraConst()) ) {s = 7;}

                        else if ( (synpred29_HydraConst()) ) {s = 8;}

                        else if ( (synpred30_HydraConst()) ) {s = 9;}

                        else if ( (synpred31_HydraConst()) ) {s = 10;}

                        else if ( (synpred36_HydraConst()) ) {s = 11;}

                        else if ( (synpred37_HydraConst()) ) {s = 12;}

                        else if ( (synpred38_HydraConst()) ) {s = 13;}

                        else if ( (synpred39_HydraConst()) ) {s = 14;}

                        else if ( (synpred40_HydraConst()) ) {s = 15;}

                        else if ( (synpred41_HydraConst()) ) {s = 16;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_HydraConst()) ) {s = 7;}

                        else if ( (synpred29_HydraConst()) ) {s = 8;}

                        else if ( (synpred30_HydraConst()) ) {s = 9;}

                        else if ( (synpred31_HydraConst()) ) {s = 10;}

                        else if ( (synpred33_HydraConst()) ) {s = 17;}

                        else if ( (synpred36_HydraConst()) ) {s = 11;}

                        else if ( (synpred37_HydraConst()) ) {s = 12;}

                        else if ( (synpred38_HydraConst()) ) {s = 13;}

                        else if ( (synpred39_HydraConst()) ) {s = 14;}

                        else if ( (synpred40_HydraConst()) ) {s = 15;}

                        else if ( (synpred41_HydraConst()) ) {s = 16;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_HydraConst()) ) {s = 7;}

                        else if ( (synpred29_HydraConst()) ) {s = 8;}

                        else if ( (synpred30_HydraConst()) ) {s = 9;}

                        else if ( (synpred31_HydraConst()) ) {s = 10;}

                        else if ( (synpred34_HydraConst()) ) {s = 19;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_HydraConst()) ) {s = 7;}

                        else if ( (synpred29_HydraConst()) ) {s = 8;}

                        else if ( (synpred30_HydraConst()) ) {s = 9;}

                        else if ( (synpred31_HydraConst()) ) {s = 10;}

                        else if ( (synpred35_HydraConst()) ) {s = 20;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_HydraConst()) ) {s = 11;}

                        else if ( (synpred37_HydraConst()) ) {s = 12;}

                        else if ( (synpred38_HydraConst()) ) {s = 13;}

                        else if ( (synpred39_HydraConst()) ) {s = 14;}

                        else if ( (synpred40_HydraConst()) ) {s = 15;}

                        else if ( (synpred41_HydraConst()) ) {s = 16;}

                         
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
        "\1\5\3\0\10\uffff";
    static final String DFA12_maxS =
        "\1\13\3\0\10\uffff";
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
            return "2861:1: parse_hydraconstraints_NumOperand returns [hydraconstraints.NumOperand element = null] : (c0= parse_hydraconstraints_Plus | c1= parse_hydraconstraints_Minus | c2= parse_hydraconstraints_Mul | c3= parse_hydraconstraints_Div | c4= parse_hydraconstraints_Context | c5= parse_hydraconstraints_SimpleFeature | c6= parse_hydraconstraints_MultipleFeature | c7= parse_hydraconstraints_Number );";
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
                        if ( (synpred48_HydraConst()) ) {s = 4;}

                        else if ( (synpred49_HydraConst()) ) {s = 5;}

                        else if ( (synpred50_HydraConst()) ) {s = 6;}

                        else if ( (synpred51_HydraConst()) ) {s = 7;}

                        else if ( (synpred52_HydraConst()) ) {s = 8;}

                        else if ( (synpred53_HydraConst()) ) {s = 9;}

                        else if ( (synpred54_HydraConst()) ) {s = 10;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_HydraConst()) ) {s = 4;}

                        else if ( (synpred49_HydraConst()) ) {s = 5;}

                        else if ( (synpred50_HydraConst()) ) {s = 6;}

                        else if ( (synpred51_HydraConst()) ) {s = 7;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_HydraConst()) ) {s = 4;}

                        else if ( (synpred49_HydraConst()) ) {s = 5;}

                        else if ( (synpred50_HydraConst()) ) {s = 6;}

                        else if ( (synpred51_HydraConst()) ) {s = 7;}

                         
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
 

    public static final BitSet FOLLOW_parse_hydraconstraints_Model_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_parse_hydraconstraints_Model115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DIRECCION_in_parse_hydraconstraints_Model133 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hydraconstraints_Model154 = new BitSet(new long[]{0x0000000003020862L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Constraint_in_parse_hydraconstraints_Model183 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hydraconstraints_Model211 = new BitSet(new long[]{0x0000000003020862L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Operand_in_parse_hydraconstraints_Constraint263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_hydraconstraints_Constraint285 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Operand_in_parse_hydraconstraints_Constraint303 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hydraconstraints_Constraint321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_hydraconstraints_BoolPriorityOperand1350 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolOperand_in_parse_hydraconstraints_BoolPriorityOperand1368 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hydraconstraints_BoolPriorityOperand1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolOperandChoices_in_parse_hydraconstraints_BoolPriorityOperand1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_hydraconstraints_BoolPriorityOperand2441 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolOperand_in_parse_hydraconstraints_BoolPriorityOperand2459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hydraconstraints_BoolPriorityOperand2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolOperand_in_parse_hydraconstraints_BoolPriorityOperand2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumOperandChoices_in_parse_hydraconstraints_NumPriorityOperand1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_hydraconstraints_NumPriorityOperand1558 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumOperand_in_parse_hydraconstraints_NumPriorityOperand1576 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hydraconstraints_NumPriorityOperand1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumOperand_in_parse_hydraconstraints_NumPriorityOperand2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_hydraconstraints_NumPriorityOperand2649 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumOperand_in_parse_hydraconstraints_NumPriorityOperand2667 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hydraconstraints_NumPriorityOperand2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_And718 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_hydraconstraints_And736 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_And754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_Or791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_hydraconstraints_Or809 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Or827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_Xor864 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_hydraconstraints_Xor882 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Xor900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand1_in_parse_hydraconstraints_Implies937 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hydraconstraints_Implies955 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Implies973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_hydraconstraints_Neg1006 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Neg1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Plus1061 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_hydraconstraints_Plus1079 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Plus1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Minus1134 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_hydraconstraints_Minus1152 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Minus1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Mul1207 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_hydraconstraints_Mul1225 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Mul1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand1_in_parse_hydraconstraints_Div1280 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_hydraconstraints_Div1298 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Div1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_Context1353 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_hydraconstraints_Context1371 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Constraint_in_parse_hydraconstraints_Context1389 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_hydraconstraints_Context1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_hydraconstraints_All1436 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_All1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_hydraconstraints_Any1487 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolPriorityOperand2_in_parse_hydraconstraints_Any1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_More1542 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_hydraconstraints_More1560 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_More1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_MoreOrEqual1615 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_hydraconstraints_MoreOrEqual1633 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_MoreOrEqual1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Less1688 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_hydraconstraints_Less1706 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Less1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_LessOrEqual1761 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_hydraconstraints_LessOrEqual1779 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_LessOrEqual1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_NotEqual1834 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_hydraconstraints_NotEqual1852 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_NotEqual1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Equal1907 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_hydraconstraints_Equal1925 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumPriorityOperand2_in_parse_hydraconstraints_Equal1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_hydraconstraints_SimpleFeature1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_hydraconstraints_MultipleFeature2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_MultipleFeature2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_parse_hydraconstraints_Number2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_And_in_parse_hydraconstraints_Operand2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Or_in_parse_hydraconstraints_Operand2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Xor_in_parse_hydraconstraints_Operand2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Implies_in_parse_hydraconstraints_Operand2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Neg_in_parse_hydraconstraints_Operand2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Plus_in_parse_hydraconstraints_Operand2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Minus_in_parse_hydraconstraints_Operand2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Mul_in_parse_hydraconstraints_Operand2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Div_in_parse_hydraconstraints_Operand2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_Operand2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_All_in_parse_hydraconstraints_Operand2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Any_in_parse_hydraconstraints_Operand2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_More_in_parse_hydraconstraints_Operand2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MoreOrEqual_in_parse_hydraconstraints_Operand2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Less_in_parse_hydraconstraints_Operand2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_LessOrEqual_in_parse_hydraconstraints_Operand2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NotEqual_in_parse_hydraconstraints_Operand2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Equal_in_parse_hydraconstraints_Operand2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_Operand2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_Operand2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Number_in_parse_hydraconstraints_Operand2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_And_in_parse_hydraconstraints_BoolOperand2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Or_in_parse_hydraconstraints_BoolOperand2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Xor_in_parse_hydraconstraints_BoolOperand2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Implies_in_parse_hydraconstraints_BoolOperand2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Neg_in_parse_hydraconstraints_BoolOperand2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_BoolOperand2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_All_in_parse_hydraconstraints_BoolOperand2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Any_in_parse_hydraconstraints_BoolOperand2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_More_in_parse_hydraconstraints_BoolOperand2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MoreOrEqual_in_parse_hydraconstraints_BoolOperand2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Less_in_parse_hydraconstraints_BoolOperand2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_LessOrEqual_in_parse_hydraconstraints_BoolOperand2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NotEqual_in_parse_hydraconstraints_BoolOperand2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Equal_in_parse_hydraconstraints_BoolOperand2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_BoolOperand2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_BoolOperandChoices2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_All_in_parse_hydraconstraints_BoolOperandChoices2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Any_in_parse_hydraconstraints_BoolOperandChoices2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_BoolOperandChoices2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_NumOperandChoices2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_NumOperandChoices2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_NumOperandChoices2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Number_in_parse_hydraconstraints_NumOperandChoices2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Plus_in_parse_hydraconstraints_NumOperand2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Minus_in_parse_hydraconstraints_NumOperand2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Mul_in_parse_hydraconstraints_NumOperand2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Div_in_parse_hydraconstraints_NumOperand2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_parse_hydraconstraints_NumOperand2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_parse_hydraconstraints_NumOperand2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_parse_hydraconstraints_NumOperand2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Number_in_parse_hydraconstraints_NumOperand2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Operand_in_synpred2_HydraConst263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred4_HydraConst441 = new BitSet(new long[]{0x0000000003020860L});
    public static final BitSet FOLLOW_parse_hydraconstraints_BoolOperand_in_synpred4_HydraConst459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred4_HydraConst477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NumOperand_in_synpred6_HydraConst627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_synpred7_HydraConst2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_And_in_synpred8_HydraConst2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Or_in_synpred9_HydraConst2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Xor_in_synpred10_HydraConst2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Implies_in_synpred11_HydraConst2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Plus_in_synpred13_HydraConst2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Minus_in_synpred14_HydraConst2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Mul_in_synpred15_HydraConst2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Div_in_synpred16_HydraConst2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_synpred17_HydraConst2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_All_in_synpred18_HydraConst2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Any_in_synpred19_HydraConst2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_More_in_synpred20_HydraConst2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MoreOrEqual_in_synpred21_HydraConst2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Less_in_synpred22_HydraConst2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_LessOrEqual_in_synpred23_HydraConst2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NotEqual_in_synpred24_HydraConst2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Equal_in_synpred25_HydraConst2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_synpred26_HydraConst2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_synpred27_HydraConst2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_And_in_synpred28_HydraConst2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Or_in_synpred29_HydraConst2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Xor_in_synpred30_HydraConst2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Implies_in_synpred31_HydraConst2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_synpred33_HydraConst2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_All_in_synpred34_HydraConst2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Any_in_synpred35_HydraConst2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_More_in_synpred36_HydraConst2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MoreOrEqual_in_synpred37_HydraConst2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Less_in_synpred38_HydraConst2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_LessOrEqual_in_synpred39_HydraConst2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_NotEqual_in_synpred40_HydraConst2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Equal_in_synpred41_HydraConst2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_synpred46_HydraConst2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_synpred47_HydraConst2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Plus_in_synpred48_HydraConst2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Minus_in_synpred49_HydraConst2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Mul_in_synpred50_HydraConst2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Div_in_synpred51_HydraConst2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_Context_in_synpred52_HydraConst2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_SimpleFeature_in_synpred53_HydraConst2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hydraconstraints_MultipleFeature_in_synpred54_HydraConst2651 = new BitSet(new long[]{0x0000000000000002L});

}