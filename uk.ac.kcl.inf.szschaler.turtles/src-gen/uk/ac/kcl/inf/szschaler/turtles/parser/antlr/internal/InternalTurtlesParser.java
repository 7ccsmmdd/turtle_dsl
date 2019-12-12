package uk.ac.kcl.inf.szschaler.turtles.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.szschaler.turtles.services.TurtlesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtlesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'times'", "'do'", "'end'", "'('", "')'", "'turn'", "'by'", "'degrees'", "'.'", "'forward'", "'backward'", "'left'", "'right'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTurtlesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTurtlesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTurtlesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTurtles.g"; }



     	private TurtlesGrammarAccess grammarAccess;

        public InternalTurtlesParser(TokenStream input, TurtlesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TurtleProgram";
       	}

       	@Override
       	protected TurtlesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTurtleProgram"
    // InternalTurtles.g:65:1: entryRuleTurtleProgram returns [EObject current=null] : iv_ruleTurtleProgram= ruleTurtleProgram EOF ;
    public final EObject entryRuleTurtleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurtleProgram = null;


        try {
            // InternalTurtles.g:65:54: (iv_ruleTurtleProgram= ruleTurtleProgram EOF )
            // InternalTurtles.g:66:2: iv_ruleTurtleProgram= ruleTurtleProgram EOF
            {
             newCompositeNode(grammarAccess.getTurtleProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurtleProgram=ruleTurtleProgram();

            state._fsp--;

             current =iv_ruleTurtleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurtleProgram"


    // $ANTLR start "ruleTurtleProgram"
    // InternalTurtles.g:72:1: ruleTurtleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleTurtleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalTurtles.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalTurtles.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11||LA1_0==18||(LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTurtles.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalTurtles.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalTurtles.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getTurtleProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTurtleProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.szschaler.turtles.Turtles.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurtleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTurtles.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTurtles.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTurtles.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTurtles.g:108:1: ruleStatement returns [EObject current=null] : (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStatement_0 = null;

        EObject this_TurnStatement_1 = null;

        EObject this_LoopStatement_2 = null;

        EObject this_VariableDeclaration_3 = null;



        	enterRule();

        try {
            // InternalTurtles.g:114:2: ( (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration ) )
            // InternalTurtles.g:115:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration )
            {
            // InternalTurtles.g:115:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTurtles.g:116:3: this_MoveStatement_0= ruleMoveStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveStatement_0=ruleMoveStatement();

                    state._fsp--;


                    			current = this_MoveStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtles.g:125:3: this_TurnStatement_1= ruleTurnStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTurnStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnStatement_1=ruleTurnStatement();

                    state._fsp--;


                    			current = this_TurnStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTurtles.g:134:3: this_LoopStatement_2= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_2=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTurtles.g:143:3: this_VariableDeclaration_3= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTurtles.g:155:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTurtles.g:155:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTurtles.g:156:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTurtles.g:162:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTurtles.g:168:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalTurtles.g:169:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalTurtles.g:169:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalTurtles.g:170:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTurtles.g:174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTurtles.g:175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTurtles.g:175:4: (lv_name_1_0= RULE_ID )
            // InternalTurtles.g:176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalTurtles.g:196:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalTurtles.g:197:4: (lv_value_3_0= RULE_INT )
            {
            // InternalTurtles.g:197:4: (lv_value_3_0= RULE_INT )
            // InternalTurtles.g:198:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTurtles.g:218:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTurtles.g:218:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTurtles.g:219:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalTurtles.g:225:1: ruleLoopStatement returns [EObject current=null] : ( ( (lv_count_0_0= ruleIntExpression ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_count_0_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:231:2: ( ( ( (lv_count_0_0= ruleIntExpression ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) )
            // InternalTurtles.g:232:2: ( ( (lv_count_0_0= ruleIntExpression ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            {
            // InternalTurtles.g:232:2: ( ( (lv_count_0_0= ruleIntExpression ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            // InternalTurtles.g:233:3: ( (lv_count_0_0= ruleIntExpression ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end'
            {
            // InternalTurtles.g:233:3: ( (lv_count_0_0= ruleIntExpression ) )
            // InternalTurtles.g:234:4: (lv_count_0_0= ruleIntExpression )
            {
            // InternalTurtles.g:234:4: (lv_count_0_0= ruleIntExpression )
            // InternalTurtles.g:235:5: lv_count_0_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountIntExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_count_0_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_0_0,
            						"uk.ac.kcl.inf.szschaler.turtles.Turtles.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getDoKeyword_2());
            		
            // InternalTurtles.g:260:3: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==11||LA3_0==18||(LA3_0>=22 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTurtles.g:261:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalTurtles.g:261:4: (lv_statements_3_0= ruleStatement )
            	    // InternalTurtles.g:262:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"uk.ac.kcl.inf.szschaler.turtles.Turtles.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopStatementAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalTurtles.g:287:1: entryRuleMoveStatement returns [EObject current=null] : iv_ruleMoveStatement= ruleMoveStatement EOF ;
    public final EObject entryRuleMoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStatement = null;


        try {
            // InternalTurtles.g:287:54: (iv_ruleMoveStatement= ruleMoveStatement EOF )
            // InternalTurtles.g:288:2: iv_ruleMoveStatement= ruleMoveStatement EOF
            {
             newCompositeNode(grammarAccess.getMoveStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveStatement=ruleMoveStatement();

            state._fsp--;

             current =iv_ruleMoveStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveStatement"


    // $ANTLR start "ruleMoveStatement"
    // InternalTurtles.g:294:1: ruleMoveStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleIntExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleMoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:300:2: ( ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleIntExpression ) ) otherlv_3= ')' ) )
            // InternalTurtles.g:301:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleIntExpression ) ) otherlv_3= ')' )
            {
            // InternalTurtles.g:301:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleIntExpression ) ) otherlv_3= ')' )
            // InternalTurtles.g:302:3: ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleIntExpression ) ) otherlv_3= ')'
            {
            // InternalTurtles.g:302:3: ( (lv_command_0_0= ruleMoveCommand ) )
            // InternalTurtles.g:303:4: (lv_command_0_0= ruleMoveCommand )
            {
            // InternalTurtles.g:303:4: (lv_command_0_0= ruleMoveCommand )
            // InternalTurtles.g:304:5: lv_command_0_0= ruleMoveCommand
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_command_0_0=ruleMoveCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"uk.ac.kcl.inf.szschaler.turtles.Turtles.MoveCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTurtles.g:325:3: ( (lv_steps_2_0= ruleIntExpression ) )
            // InternalTurtles.g:326:4: (lv_steps_2_0= ruleIntExpression )
            {
            // InternalTurtles.g:326:4: (lv_steps_2_0= ruleIntExpression )
            // InternalTurtles.g:327:5: lv_steps_2_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getStepsIntExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_steps_2_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStatementRule());
            					}
            					set(
            						current,
            						"steps",
            						lv_steps_2_0,
            						"uk.ac.kcl.inf.szschaler.turtles.Turtles.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveStatement"


    // $ANTLR start "entryRuleTurnStatement"
    // InternalTurtles.g:352:1: entryRuleTurnStatement returns [EObject current=null] : iv_ruleTurnStatement= ruleTurnStatement EOF ;
    public final EObject entryRuleTurnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnStatement = null;


        try {
            // InternalTurtles.g:352:54: (iv_ruleTurnStatement= ruleTurnStatement EOF )
            // InternalTurtles.g:353:2: iv_ruleTurnStatement= ruleTurnStatement EOF
            {
             newCompositeNode(grammarAccess.getTurnStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnStatement=ruleTurnStatement();

            state._fsp--;

             current =iv_ruleTurnStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnStatement"


    // $ANTLR start "ruleTurnStatement"
    // InternalTurtles.g:359:1: ruleTurnStatement returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleREAL ) ) otherlv_4= 'degrees' ) ;
    public final EObject ruleTurnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_command_1_0 = null;

        AntlrDatatypeRuleToken lv_degrees_3_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:365:2: ( (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleREAL ) ) otherlv_4= 'degrees' ) )
            // InternalTurtles.g:366:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleREAL ) ) otherlv_4= 'degrees' )
            {
            // InternalTurtles.g:366:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleREAL ) ) otherlv_4= 'degrees' )
            // InternalTurtles.g:367:3: otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleREAL ) ) otherlv_4= 'degrees'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnStatementAccess().getTurnKeyword_0());
            		
            // InternalTurtles.g:371:3: ( (lv_command_1_0= ruleTurnCommand ) )
            // InternalTurtles.g:372:4: (lv_command_1_0= ruleTurnCommand )
            {
            // InternalTurtles.g:372:4: (lv_command_1_0= ruleTurnCommand )
            // InternalTurtles.g:373:5: lv_command_1_0= ruleTurnCommand
            {

            					newCompositeNode(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_command_1_0=ruleTurnCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_1_0,
            						"uk.ac.kcl.inf.szschaler.turtles.Turtles.TurnCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnStatementAccess().getByKeyword_2());
            		
            // InternalTurtles.g:394:3: ( (lv_degrees_3_0= ruleREAL ) )
            // InternalTurtles.g:395:4: (lv_degrees_3_0= ruleREAL )
            {
            // InternalTurtles.g:395:4: (lv_degrees_3_0= ruleREAL )
            // InternalTurtles.g:396:5: lv_degrees_3_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getTurnStatementAccess().getDegreesREALParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_degrees_3_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnStatementRule());
            					}
            					set(
            						current,
            						"degrees",
            						lv_degrees_3_0,
            						"uk.ac.kcl.inf.szschaler.turtles.Turtles.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTurnStatementAccess().getDegreesKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnStatement"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTurtles.g:421:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalTurtles.g:421:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalTurtles.g:422:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
             newCompositeNode(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;

             current =iv_ruleIntExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTurtles.g:428:1: ruleIntExpression returns [EObject current=null] : ( ( (lv_val_0_0= RULE_INT ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTurtles.g:434:2: ( ( ( (lv_val_0_0= RULE_INT ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalTurtles.g:435:2: ( ( (lv_val_0_0= RULE_INT ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalTurtles.g:435:2: ( ( (lv_val_0_0= RULE_INT ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtles.g:436:3: ( (lv_val_0_0= RULE_INT ) )
                    {
                    // InternalTurtles.g:436:3: ( (lv_val_0_0= RULE_INT ) )
                    // InternalTurtles.g:437:4: (lv_val_0_0= RULE_INT )
                    {
                    // InternalTurtles.g:437:4: (lv_val_0_0= RULE_INT )
                    // InternalTurtles.g:438:5: lv_val_0_0= RULE_INT
                    {
                    lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_val_0_0, grammarAccess.getIntExpressionAccess().getValINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:455:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalTurtles.g:455:3: ( (otherlv_1= RULE_ID ) )
                    // InternalTurtles.g:456:4: (otherlv_1= RULE_ID )
                    {
                    // InternalTurtles.g:456:4: (otherlv_1= RULE_ID )
                    // InternalTurtles.g:457:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntExpressionRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getIntExpressionAccess().getVarVariableDeclarationCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalTurtles.g:472:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTurtles.g:474:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTurtles.g:475:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTurtles.g:484:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTurtles.g:491:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTurtles.g:492:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTurtles.g:492:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTurtles.g:493:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTurtles.g:493:3: (this_INT_0= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTurtles.g:494:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,21,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleMoveCommand"
    // InternalTurtles.g:521:1: ruleMoveCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleMoveCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTurtles.g:527:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalTurtles.g:528:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalTurtles.g:528:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTurtles.g:529:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalTurtles.g:529:3: (enumLiteral_0= 'forward' )
                    // InternalTurtles.g:530:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:537:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalTurtles.g:537:3: (enumLiteral_1= 'backward' )
                    // InternalTurtles.g:538:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveCommand"


    // $ANTLR start "ruleTurnCommand"
    // InternalTurtles.g:548:1: ruleTurnCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTurnCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTurtles.g:554:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalTurtles.g:555:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalTurtles.g:555:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTurtles.g:556:3: (enumLiteral_0= 'left' )
                    {
                    // InternalTurtles.g:556:3: (enumLiteral_0= 'left' )
                    // InternalTurtles.g:557:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:564:3: (enumLiteral_1= 'right' )
                    {
                    // InternalTurtles.g:564:3: (enumLiteral_1= 'right' )
                    // InternalTurtles.g:565:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C40832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C48830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});

}