// $ANTLR ${project.version} ${buildNumber}

	package hydraconstraints.resource.hydraConst.mopp;


import org.antlr.runtime3_3_0.*;

public class HydraConstLexer extends Lexer {
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

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public HydraConstLexer() {;} 
    public HydraConstLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HydraConstLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "HydraConst.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:16:6: ( 'import' )
            // HydraConst.g:16:8: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:17:6: ( ';' )
            // HydraConst.g:17:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:18:7: ( '(' )
            // HydraConst.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:19:7: ( ')' )
            // HydraConst.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:20:7: ( 'and' )
            // HydraConst.g:20:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:21:7: ( 'or' )
            // HydraConst.g:21:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:22:7: ( 'xor' )
            // HydraConst.g:22:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:23:7: ( 'implies' )
            // HydraConst.g:23:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:24:7: ( '!' )
            // HydraConst.g:24:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:25:7: ( '+' )
            // HydraConst.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:26:7: ( '-' )
            // HydraConst.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:27:7: ( '*' )
            // HydraConst.g:27:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:28:7: ( '/' )
            // HydraConst.g:28:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:29:7: ( '[' )
            // HydraConst.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:30:7: ( ']' )
            // HydraConst.g:30:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:31:7: ( 'all' )
            // HydraConst.g:31:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:32:7: ( 'any' )
            // HydraConst.g:32:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:33:7: ( '>' )
            // HydraConst.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:34:7: ( '>=' )
            // HydraConst.g:34:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:35:7: ( '<' )
            // HydraConst.g:35:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:36:7: ( '<=' )
            // HydraConst.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:37:7: ( '!=' )
            // HydraConst.g:37:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:38:7: ( '==' )
            // HydraConst.g:38:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:2874:6: ( ( ( '0' .. '9' )+ ) )
            // HydraConst.g:2875:2: ( ( '0' .. '9' )+ )
            {
            // HydraConst.g:2875:2: ( ( '0' .. '9' )+ )
            // HydraConst.g:2875:3: ( '0' .. '9' )+
            {
            // HydraConst.g:2875:3: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // HydraConst.g:2875:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:2877:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // HydraConst.g:2878:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // HydraConst.g:2878:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // HydraConst.g:2878:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // HydraConst.g:2878:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // HydraConst.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:2880:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // HydraConst.g:2881:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // HydraConst.g:2881:2: ( ( ' ' | '\\t' | '\\f' ) )
            // HydraConst.g:2881:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HydraConst.g:2884:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // HydraConst.g:2885:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // HydraConst.g:2885:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // HydraConst.g:2885:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // HydraConst.g:2885:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\n') ) {
                    alt3=1;
                }
                else {
                    alt3=2;}
            }
            else if ( (LA3_0=='\n') ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // HydraConst.g:2885:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // HydraConst.g:2885:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // HydraConst.g:2885:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // HydraConst.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | DIGIT | TEXT | WHITESPACE | LINEBREAK )
        int alt4=27;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // HydraConst.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // HydraConst.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // HydraConst.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // HydraConst.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // HydraConst.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // HydraConst.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // HydraConst.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // HydraConst.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // HydraConst.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // HydraConst.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // HydraConst.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // HydraConst.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // HydraConst.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // HydraConst.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // HydraConst.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // HydraConst.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // HydraConst.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // HydraConst.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // HydraConst.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // HydraConst.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // HydraConst.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // HydraConst.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // HydraConst.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // HydraConst.g:1:146: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 25 :
                // HydraConst.g:1:152: TEXT
                {
                mTEXT(); 

                }
                break;
            case 26 :
                // HydraConst.g:1:157: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 27 :
                // HydraConst.g:1:168: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\23\3\uffff\3\23\1\34\1\uffff\1\35\4\uffff\1\37\1\41\1"+
        "\uffff\1\42\3\uffff\3\23\1\47\1\23\10\uffff\1\23\1\53\1\54\1\55"+
        "\1\uffff\1\56\2\23\4\uffff\2\23\1\63\1\23\1\uffff\1\65\1\uffff";
    static final String DFA4_eofS =
        "\66\uffff";
    static final String DFA4_minS =
        "\1\11\1\155\3\uffff\1\154\1\162\1\157\1\75\1\uffff\1\55\4\uffff"+
        "\2\75\1\uffff\1\55\3\uffff\1\160\1\144\1\154\1\55\1\162\10\uffff"+
        "\1\154\3\55\1\uffff\1\55\1\162\1\151\4\uffff\1\164\1\145\1\55\1"+
        "\163\1\uffff\1\55\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\155\3\uffff\1\156\1\162\1\157\1\75\1\uffff\1\172\4\uffff"+
        "\2\75\1\uffff\1\172\3\uffff\1\160\1\171\1\154\1\172\1\162\10\uffff"+
        "\1\157\3\172\1\uffff\1\172\1\162\1\151\4\uffff\1\164\1\145\1\172"+
        "\1\163\1\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\4\4\uffff\1\12\1\uffff\1\14\1\15\1\16\1\17\2"+
        "\uffff\1\27\1\uffff\1\31\1\32\1\33\5\uffff\1\26\1\11\1\13\1\23\1"+
        "\22\1\25\1\24\1\30\4\uffff\1\6\3\uffff\1\5\1\21\1\20\1\7\4\uffff"+
        "\1\1\1\uffff\1\10";
    static final String DFA4_specialS =
        "\66\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\24\1\25\1\uffff\1\24\1\25\22\uffff\1\24\1\10\6\uffff\1\3"+
            "\1\4\1\13\1\11\1\uffff\1\12\1\uffff\1\14\12\22\1\uffff\1\2\1"+
            "\20\1\21\1\17\2\uffff\32\23\1\15\1\uffff\1\16\1\uffff\1\23\1"+
            "\uffff\1\5\7\23\1\1\5\23\1\6\10\23\1\7\2\23",
            "\1\26",
            "",
            "",
            "",
            "\1\30\1\uffff\1\27",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "",
            "\1\23\2\uffff\12\22\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
            "\1\43",
            "\1\44\24\uffff\1\45",
            "\1\46",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\2\uffff\1\51",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\64",
            "",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | DIGIT | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}