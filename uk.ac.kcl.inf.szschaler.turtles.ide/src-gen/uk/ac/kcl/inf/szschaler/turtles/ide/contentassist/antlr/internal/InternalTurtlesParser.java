package uk.ac.kcl.inf.szschaler.turtles.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.szschaler.turtles.services.TurtlesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtlesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forward'", "'backward'", "'left'", "'right'", "'('", "')'", "'turn'", "'by'", "'degrees'"
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
    public static final int RULE_ML_COMMENT=7;

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

    	public void setGrammarAccess(TurtlesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTurtleProgram"
    // InternalTurtles.g:53:1: entryRuleTurtleProgram : ruleTurtleProgram EOF ;
    public final void entryRuleTurtleProgram() throws RecognitionException {
        try {
            // InternalTurtles.g:54:1: ( ruleTurtleProgram EOF )
            // InternalTurtles.g:55:1: ruleTurtleProgram EOF
            {
             before(grammarAccess.getTurtleProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleTurtleProgram();

            state._fsp--;

             after(grammarAccess.getTurtleProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurtleProgram"


    // $ANTLR start "ruleTurtleProgram"
    // InternalTurtles.g:62:1: ruleTurtleProgram : ( ( rule__TurtleProgram__StatementsAssignment )* ) ;
    public final void ruleTurtleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:66:2: ( ( ( rule__TurtleProgram__StatementsAssignment )* ) )
            // InternalTurtles.g:67:2: ( ( rule__TurtleProgram__StatementsAssignment )* )
            {
            // InternalTurtles.g:67:2: ( ( rule__TurtleProgram__StatementsAssignment )* )
            // InternalTurtles.g:68:3: ( rule__TurtleProgram__StatementsAssignment )*
            {
             before(grammarAccess.getTurtleProgramAccess().getStatementsAssignment()); 
            // InternalTurtles.g:69:3: ( rule__TurtleProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTurtles.g:69:4: rule__TurtleProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TurtleProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTurtleProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurtleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTurtles.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTurtles.g:79:1: ( ruleStatement EOF )
            // InternalTurtles.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTurtles.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalTurtles.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalTurtles.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalTurtles.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalTurtles.g:94:3: ( rule__Statement__Alternatives )
            // InternalTurtles.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalTurtles.g:103:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalTurtles.g:104:1: ( ruleMoveStatement EOF )
            // InternalTurtles.g:105:1: ruleMoveStatement EOF
            {
             before(grammarAccess.getMoveStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveStatement();

            state._fsp--;

             after(grammarAccess.getMoveStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveStatement"


    // $ANTLR start "ruleMoveStatement"
    // InternalTurtles.g:112:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:116:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalTurtles.g:117:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalTurtles.g:117:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalTurtles.g:118:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalTurtles.g:119:3: ( rule__MoveStatement__Group__0 )
            // InternalTurtles.g:119:4: rule__MoveStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveStatement"


    // $ANTLR start "entryRuleTurnStatement"
    // InternalTurtles.g:128:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalTurtles.g:129:1: ( ruleTurnStatement EOF )
            // InternalTurtles.g:130:1: ruleTurnStatement EOF
            {
             before(grammarAccess.getTurnStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnStatement();

            state._fsp--;

             after(grammarAccess.getTurnStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnStatement"


    // $ANTLR start "ruleTurnStatement"
    // InternalTurtles.g:137:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:141:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalTurtles.g:142:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalTurtles.g:142:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalTurtles.g:143:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalTurtles.g:144:3: ( rule__TurnStatement__Group__0 )
            // InternalTurtles.g:144:4: rule__TurnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnStatement"


    // $ANTLR start "ruleMoveCommand"
    // InternalTurtles.g:153:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:157:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalTurtles.g:158:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalTurtles.g:158:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalTurtles.g:159:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalTurtles.g:160:3: ( rule__MoveCommand__Alternatives )
            // InternalTurtles.g:160:4: rule__MoveCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoveCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveCommand"


    // $ANTLR start "ruleTurnCommand"
    // InternalTurtles.g:169:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:173:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalTurtles.g:174:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalTurtles.g:174:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalTurtles.g:175:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalTurtles.g:176:3: ( rule__TurnCommand__Alternatives )
            // InternalTurtles.g:176:4: rule__TurnCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TurnCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTurnCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnCommand"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTurtles.g:184:1: rule__Statement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:188:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTurtles.g:189:2: ( ruleMoveStatement )
                    {
                    // InternalTurtles.g:189:2: ( ruleMoveStatement )
                    // InternalTurtles.g:190:3: ruleMoveStatement
                    {
                     before(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:195:2: ( ruleTurnStatement )
                    {
                    // InternalTurtles.g:195:2: ( ruleTurnStatement )
                    // InternalTurtles.g:196:3: ruleTurnStatement
                    {
                     before(grammarAccess.getStatementAccess().getTurnStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTurnStatementParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__MoveCommand__Alternatives"
    // InternalTurtles.g:205:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:209:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTurtles.g:210:2: ( ( 'forward' ) )
                    {
                    // InternalTurtles.g:210:2: ( ( 'forward' ) )
                    // InternalTurtles.g:211:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalTurtles.g:212:3: ( 'forward' )
                    // InternalTurtles.g:212:4: 'forward'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:216:2: ( ( 'backward' ) )
                    {
                    // InternalTurtles.g:216:2: ( ( 'backward' ) )
                    // InternalTurtles.g:217:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalTurtles.g:218:3: ( 'backward' )
                    // InternalTurtles.g:218:4: 'backward'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCommand__Alternatives"


    // $ANTLR start "rule__TurnCommand__Alternatives"
    // InternalTurtles.g:226:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:230:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtles.g:231:2: ( ( 'left' ) )
                    {
                    // InternalTurtles.g:231:2: ( ( 'left' ) )
                    // InternalTurtles.g:232:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalTurtles.g:233:3: ( 'left' )
                    // InternalTurtles.g:233:4: 'left'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtles.g:237:2: ( ( 'right' ) )
                    {
                    // InternalTurtles.g:237:2: ( ( 'right' ) )
                    // InternalTurtles.g:238:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalTurtles.g:239:3: ( 'right' )
                    // InternalTurtles.g:239:4: 'right'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCommand__Alternatives"


    // $ANTLR start "rule__MoveStatement__Group__0"
    // InternalTurtles.g:247:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:251:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalTurtles.g:252:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MoveStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__0"


    // $ANTLR start "rule__MoveStatement__Group__0__Impl"
    // InternalTurtles.g:259:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:263:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalTurtles.g:264:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalTurtles.g:264:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalTurtles.g:265:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalTurtles.g:266:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalTurtles.g:266:3: rule__MoveStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__0__Impl"


    // $ANTLR start "rule__MoveStatement__Group__1"
    // InternalTurtles.g:274:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:278:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalTurtles.g:279:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MoveStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__1"


    // $ANTLR start "rule__MoveStatement__Group__1__Impl"
    // InternalTurtles.g:286:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:290:1: ( ( '(' ) )
            // InternalTurtles.g:291:1: ( '(' )
            {
            // InternalTurtles.g:291:1: ( '(' )
            // InternalTurtles.g:292:2: '('
            {
             before(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__1__Impl"


    // $ANTLR start "rule__MoveStatement__Group__2"
    // InternalTurtles.g:301:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:305:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalTurtles.g:306:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MoveStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__2"


    // $ANTLR start "rule__MoveStatement__Group__2__Impl"
    // InternalTurtles.g:313:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:317:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalTurtles.g:318:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalTurtles.g:318:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalTurtles.g:319:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalTurtles.g:320:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalTurtles.g:320:3: rule__MoveStatement__StepsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__StepsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__2__Impl"


    // $ANTLR start "rule__MoveStatement__Group__3"
    // InternalTurtles.g:328:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:332:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalTurtles.g:333:2: rule__MoveStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__3"


    // $ANTLR start "rule__MoveStatement__Group__3__Impl"
    // InternalTurtles.g:339:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:343:1: ( ( ')' ) )
            // InternalTurtles.g:344:1: ( ')' )
            {
            // InternalTurtles.g:344:1: ( ')' )
            // InternalTurtles.g:345:2: ')'
            {
             before(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__3__Impl"


    // $ANTLR start "rule__TurnStatement__Group__0"
    // InternalTurtles.g:355:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:359:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalTurtles.g:360:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TurnStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__0"


    // $ANTLR start "rule__TurnStatement__Group__0__Impl"
    // InternalTurtles.g:367:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:371:1: ( ( 'turn' ) )
            // InternalTurtles.g:372:1: ( 'turn' )
            {
            // InternalTurtles.g:372:1: ( 'turn' )
            // InternalTurtles.g:373:2: 'turn'
            {
             before(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__0__Impl"


    // $ANTLR start "rule__TurnStatement__Group__1"
    // InternalTurtles.g:382:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2 ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:386:1: ( rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2 )
            // InternalTurtles.g:387:2: rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TurnStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__1"


    // $ANTLR start "rule__TurnStatement__Group__1__Impl"
    // InternalTurtles.g:394:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:398:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalTurtles.g:399:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalTurtles.g:399:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalTurtles.g:400:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalTurtles.g:401:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalTurtles.g:401:3: rule__TurnStatement__CommandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__CommandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__1__Impl"


    // $ANTLR start "rule__TurnStatement__Group__2"
    // InternalTurtles.g:409:1: rule__TurnStatement__Group__2 : rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3 ;
    public final void rule__TurnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:413:1: ( rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3 )
            // InternalTurtles.g:414:2: rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TurnStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__2"


    // $ANTLR start "rule__TurnStatement__Group__2__Impl"
    // InternalTurtles.g:421:1: rule__TurnStatement__Group__2__Impl : ( 'by' ) ;
    public final void rule__TurnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:425:1: ( ( 'by' ) )
            // InternalTurtles.g:426:1: ( 'by' )
            {
            // InternalTurtles.g:426:1: ( 'by' )
            // InternalTurtles.g:427:2: 'by'
            {
             before(grammarAccess.getTurnStatementAccess().getByKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__2__Impl"


    // $ANTLR start "rule__TurnStatement__Group__3"
    // InternalTurtles.g:436:1: rule__TurnStatement__Group__3 : rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4 ;
    public final void rule__TurnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:440:1: ( rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4 )
            // InternalTurtles.g:441:2: rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__TurnStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__3"


    // $ANTLR start "rule__TurnStatement__Group__3__Impl"
    // InternalTurtles.g:448:1: rule__TurnStatement__Group__3__Impl : ( ( rule__TurnStatement__DegreesAssignment_3 ) ) ;
    public final void rule__TurnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:452:1: ( ( ( rule__TurnStatement__DegreesAssignment_3 ) ) )
            // InternalTurtles.g:453:1: ( ( rule__TurnStatement__DegreesAssignment_3 ) )
            {
            // InternalTurtles.g:453:1: ( ( rule__TurnStatement__DegreesAssignment_3 ) )
            // InternalTurtles.g:454:2: ( rule__TurnStatement__DegreesAssignment_3 )
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); 
            // InternalTurtles.g:455:2: ( rule__TurnStatement__DegreesAssignment_3 )
            // InternalTurtles.g:455:3: rule__TurnStatement__DegreesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__DegreesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__3__Impl"


    // $ANTLR start "rule__TurnStatement__Group__4"
    // InternalTurtles.g:463:1: rule__TurnStatement__Group__4 : rule__TurnStatement__Group__4__Impl ;
    public final void rule__TurnStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:467:1: ( rule__TurnStatement__Group__4__Impl )
            // InternalTurtles.g:468:2: rule__TurnStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__4"


    // $ANTLR start "rule__TurnStatement__Group__4__Impl"
    // InternalTurtles.g:474:1: rule__TurnStatement__Group__4__Impl : ( 'degrees' ) ;
    public final void rule__TurnStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:478:1: ( ( 'degrees' ) )
            // InternalTurtles.g:479:1: ( 'degrees' )
            {
            // InternalTurtles.g:479:1: ( 'degrees' )
            // InternalTurtles.g:480:2: 'degrees'
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getDegreesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__4__Impl"


    // $ANTLR start "rule__TurtleProgram__StatementsAssignment"
    // InternalTurtles.g:490:1: rule__TurtleProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TurtleProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:494:1: ( ( ruleStatement ) )
            // InternalTurtles.g:495:2: ( ruleStatement )
            {
            // InternalTurtles.g:495:2: ( ruleStatement )
            // InternalTurtles.g:496:3: ruleStatement
            {
             before(grammarAccess.getTurtleProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTurtleProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleProgram__StatementsAssignment"


    // $ANTLR start "rule__MoveStatement__CommandAssignment_0"
    // InternalTurtles.g:505:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:509:1: ( ( ruleMoveCommand ) )
            // InternalTurtles.g:510:2: ( ruleMoveCommand )
            {
            // InternalTurtles.g:510:2: ( ruleMoveCommand )
            // InternalTurtles.g:511:3: ruleMoveCommand
            {
             before(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMoveCommand();

            state._fsp--;

             after(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__CommandAssignment_0"


    // $ANTLR start "rule__MoveStatement__StepsAssignment_2"
    // InternalTurtles.g:520:1: rule__MoveStatement__StepsAssignment_2 : ( RULE_INT ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:524:1: ( ( RULE_INT ) )
            // InternalTurtles.g:525:2: ( RULE_INT )
            {
            // InternalTurtles.g:525:2: ( RULE_INT )
            // InternalTurtles.g:526:3: RULE_INT
            {
             before(grammarAccess.getMoveStatementAccess().getStepsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getStepsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__StepsAssignment_2"


    // $ANTLR start "rule__TurnStatement__CommandAssignment_1"
    // InternalTurtles.g:535:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:539:1: ( ( ruleTurnCommand ) )
            // InternalTurtles.g:540:2: ( ruleTurnCommand )
            {
            // InternalTurtles.g:540:2: ( ruleTurnCommand )
            // InternalTurtles.g:541:3: ruleTurnCommand
            {
             before(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnCommand();

            state._fsp--;

             after(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__CommandAssignment_1"


    // $ANTLR start "rule__TurnStatement__DegreesAssignment_3"
    // InternalTurtles.g:550:1: rule__TurnStatement__DegreesAssignment_3 : ( RULE_INT ) ;
    public final void rule__TurnStatement__DegreesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtles.g:554:1: ( ( RULE_INT ) )
            // InternalTurtles.g:555:2: ( RULE_INT )
            {
            // InternalTurtles.g:555:2: ( RULE_INT )
            // InternalTurtles.g:556:3: RULE_INT
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getDegreesINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__DegreesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000021802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}