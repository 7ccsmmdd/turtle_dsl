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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'times'", "'do'", "'end'", "'('", "')'", "'turn'", "'by'", "'degrees'", "'forward'", "'backward'", "'left'", "'right'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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

                if ( (LA1_0==RULE_INT||LA1_0==16||(LA1_0>=19 && LA1_0<=20)) ) {
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
    // InternalTurtles.g:108:1: ruleStatement returns [EObject current=null] : (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStatement_0 = null;

        EObject this_TurnStatement_1 = null;

        EObject this_LoopStatement_2 = null;



        	enterRule();

        try {
            // InternalTurtles.g:114:2: ( (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement ) )
            // InternalTurtles.g:115:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement )
            {
            // InternalTurtles.g:115:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                alt2=3;
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


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTurtles.g:146:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTurtles.g:146:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTurtles.g:147:2: iv_ruleLoopStatement= ruleLoopStatement EOF
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
    // InternalTurtles.g:153:1: ruleLoopStatement returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:159:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) )
            // InternalTurtles.g:160:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            {
            // InternalTurtles.g:160:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            // InternalTurtles.g:161:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end'
            {
            // InternalTurtles.g:161:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalTurtles.g:162:4: (lv_count_0_0= RULE_INT )
            {
            // InternalTurtles.g:162:4: (lv_count_0_0= RULE_INT )
            // InternalTurtles.g:163:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_count_0_0, grammarAccess.getLoopStatementAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getDoKeyword_2());
            		
            // InternalTurtles.g:187:3: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT||LA3_0==16||(LA3_0>=19 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTurtles.g:188:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalTurtles.g:188:4: (lv_statements_3_0= ruleStatement )
            	    // InternalTurtles.g:189:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalTurtles.g:214:1: entryRuleMoveStatement returns [EObject current=null] : iv_ruleMoveStatement= ruleMoveStatement EOF ;
    public final EObject entryRuleMoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStatement = null;


        try {
            // InternalTurtles.g:214:54: (iv_ruleMoveStatement= ruleMoveStatement EOF )
            // InternalTurtles.g:215:2: iv_ruleMoveStatement= ruleMoveStatement EOF
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
    // InternalTurtles.g:221:1: ruleMoveStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleMoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_steps_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:227:2: ( ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalTurtles.g:228:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalTurtles.g:228:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalTurtles.g:229:3: ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // InternalTurtles.g:229:3: ( (lv_command_0_0= ruleMoveCommand ) )
            // InternalTurtles.g:230:4: (lv_command_0_0= ruleMoveCommand )
            {
            // InternalTurtles.g:230:4: (lv_command_0_0= ruleMoveCommand )
            // InternalTurtles.g:231:5: lv_command_0_0= ruleMoveCommand
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTurtles.g:252:3: ( (lv_steps_2_0= RULE_INT ) )
            // InternalTurtles.g:253:4: (lv_steps_2_0= RULE_INT )
            {
            // InternalTurtles.g:253:4: (lv_steps_2_0= RULE_INT )
            // InternalTurtles.g:254:5: lv_steps_2_0= RULE_INT
            {
            lv_steps_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_steps_2_0, grammarAccess.getMoveStatementAccess().getStepsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"steps",
            						lv_steps_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTurtles.g:278:1: entryRuleTurnStatement returns [EObject current=null] : iv_ruleTurnStatement= ruleTurnStatement EOF ;
    public final EObject entryRuleTurnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnStatement = null;


        try {
            // InternalTurtles.g:278:54: (iv_ruleTurnStatement= ruleTurnStatement EOF )
            // InternalTurtles.g:279:2: iv_ruleTurnStatement= ruleTurnStatement EOF
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
    // InternalTurtles.g:285:1: ruleTurnStatement returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= RULE_INT ) ) otherlv_4= 'degrees' ) ;
    public final EObject ruleTurnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_degrees_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_command_1_0 = null;



        	enterRule();

        try {
            // InternalTurtles.g:291:2: ( (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= RULE_INT ) ) otherlv_4= 'degrees' ) )
            // InternalTurtles.g:292:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= RULE_INT ) ) otherlv_4= 'degrees' )
            {
            // InternalTurtles.g:292:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= RULE_INT ) ) otherlv_4= 'degrees' )
            // InternalTurtles.g:293:3: otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= RULE_INT ) ) otherlv_4= 'degrees'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnStatementAccess().getTurnKeyword_0());
            		
            // InternalTurtles.g:297:3: ( (lv_command_1_0= ruleTurnCommand ) )
            // InternalTurtles.g:298:4: (lv_command_1_0= ruleTurnCommand )
            {
            // InternalTurtles.g:298:4: (lv_command_1_0= ruleTurnCommand )
            // InternalTurtles.g:299:5: lv_command_1_0= ruleTurnCommand
            {

            					newCompositeNode(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnStatementAccess().getByKeyword_2());
            		
            // InternalTurtles.g:320:3: ( (lv_degrees_3_0= RULE_INT ) )
            // InternalTurtles.g:321:4: (lv_degrees_3_0= RULE_INT )
            {
            // InternalTurtles.g:321:4: (lv_degrees_3_0= RULE_INT )
            // InternalTurtles.g:322:5: lv_degrees_3_0= RULE_INT
            {
            lv_degrees_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_degrees_3_0, grammarAccess.getTurnStatementAccess().getDegreesINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "ruleMoveCommand"
    // InternalTurtles.g:346:1: ruleMoveCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleMoveCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTurtles.g:352:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalTurtles.g:353:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalTurtles.g:353:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtles.g:354:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalTurtles.g:354:3: (enumLiteral_0= 'forward' )
                    // InternalTurtles.g:355:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:362:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalTurtles.g:362:3: (enumLiteral_1= 'backward' )
                    // InternalTurtles.g:363:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

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
    // InternalTurtles.g:373:1: ruleTurnCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTurnCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTurtles.g:379:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalTurtles.g:380:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalTurtles.g:380:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTurtles.g:381:3: (enumLiteral_0= 'left' )
                    {
                    // InternalTurtles.g:381:3: (enumLiteral_0= 'left' )
                    // InternalTurtles.g:382:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:389:3: (enumLiteral_1= 'right' )
                    {
                    // InternalTurtles.g:389:3: (enumLiteral_1= 'right' )
                    // InternalTurtles.g:390:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000190012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000192010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}