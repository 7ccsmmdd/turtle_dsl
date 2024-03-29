/*
 * generated by Xtext 2.20.0
 */
grammar InternalTurtles;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.szschaler.turtles.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTurtleProgram
entryRuleTurtleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurtleProgramRule()); }
	iv_ruleTurtleProgram=ruleTurtleProgram
	{ $current=$iv_ruleTurtleProgram.current; }
	EOF;

// Rule TurtleProgram
ruleTurtleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTurtleProgramAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTurtleProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"uk.ac.kcl.inf.szschaler.turtles.Turtles.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_0());
		}
		this_MoveStatement_0=ruleMoveStatement
		{
			$current = $this_MoveStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getTurnStatementParserRuleCall_1());
		}
		this_TurnStatement_1=ruleTurnStatement
		{
			$current = $this_TurnStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2());
		}
		this_LoopStatement_2=ruleLoopStatement
		{
			$current = $this_LoopStatement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getPenMoveStatementParserRuleCall_3());
		}
		this_PenMoveStatement_3=rulePenMoveStatement
		{
			$current = $this_PenMoveStatement_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_4());
		}
		this_VariableDeclaration_4=ruleVariableDeclaration
		{
			$current = $this_VariableDeclaration_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePenMoveStatement
entryRulePenMoveStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPenMoveStatementRule()); }
	iv_rulePenMoveStatement=rulePenMoveStatement
	{ $current=$iv_rulePenMoveStatement.current; }
	EOF;

// Rule PenMoveStatement
rulePenMoveStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='pen'
		{
			newLeafNode(otherlv_0, grammarAccess.getPenMoveStatementAccess().getPenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPenMoveStatementAccess().getStatePenStateEnumRuleCall_1_0());
				}
				lv_state_1_0=rulePenState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPenMoveStatementRule());
					}
					set(
						$current,
						"state",
						lv_state_1_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.PenState");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableDeclarationRule()); }
	iv_ruleVariableDeclaration=ruleVariableDeclaration
	{ $current=$iv_ruleVariableDeclaration.current; }
	EOF;

// Rule VariableDeclaration
ruleVariableDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_INT
				{
					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleLoopStatement
entryRuleLoopStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopStatementRule()); }
	iv_ruleLoopStatement=ruleLoopStatement
	{ $current=$iv_ruleLoopStatement.current; }
	EOF;

// Rule LoopStatement
ruleLoopStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0());
				}
				lv_count_0_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopStatementRule());
					}
					set(
						$current,
						"count",
						lv_count_0_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='times'
		{
			newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getTimesKeyword_1());
		}
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopStatementRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getLoopStatementAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRuleMoveStatement
entryRuleMoveStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveStatementRule()); }
	iv_ruleMoveStatement=ruleMoveStatement
	{ $current=$iv_ruleMoveStatement.current; }
	EOF;

// Rule MoveStatement
ruleMoveStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0());
				}
				lv_command_0_0=ruleMoveCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMoveStatementRule());
					}
					set(
						$current,
						"command",
						lv_command_0_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.MoveCommand");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0());
				}
				lv_steps_2_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMoveStatementRule());
					}
					set(
						$current,
						"steps",
						lv_steps_2_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleTurnStatement
entryRuleTurnStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnStatementRule()); }
	iv_ruleTurnStatement=ruleTurnStatement
	{ $current=$iv_ruleTurnStatement.current; }
	EOF;

// Rule TurnStatement
ruleTurnStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='turn'
		{
			newLeafNode(otherlv_0, grammarAccess.getTurnStatementAccess().getTurnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0());
				}
				lv_command_1_0=ruleTurnCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTurnStatementRule());
					}
					set(
						$current,
						"command",
						lv_command_1_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.TurnCommand");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='by'
		{
			newLeafNode(otherlv_2, grammarAccess.getTurnStatementAccess().getByKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTurnStatementAccess().getDegreesAdditionParserRuleCall_3_0());
				}
				lv_degrees_3_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTurnStatementRule());
					}
					set(
						$current,
						"degrees",
						lv_degrees_3_0,
						"uk.ac.kcl.inf.szschaler.turtles.Turtles.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='degrees'
		{
			newLeafNode(otherlv_4, grammarAccess.getTurnStatementAccess().getDegreesKeyword_4());
		}
	)
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
		}
		this_Multiplication_0=ruleMultiplication
		{
			$current = $this_Multiplication_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operator_2_1='+'
						{
							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdditionRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_1, null);
						}
						    |
						lv_operator_2_2='-'
						{
							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdditionRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplication
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditionRule());
						}
						add(
							$current,
							"right",
							lv_right_3_0,
							"uk.ac.kcl.inf.szschaler.turtles.Turtles.Multiplication");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	iv_ruleMultiplication=ruleMultiplication
	{ $current=$iv_ruleMultiplication.current; }
	EOF;

// Rule Multiplication
ruleMultiplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operator_2_1='*'
						{
							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicationRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_1, null);
						}
						    |
						lv_operator_2_2='/'
						{
							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicationRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
						}
						add(
							$current,
							"right",
							lv_right_3_0,
							"uk.ac.kcl.inf.szschaler.turtles.Turtles.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
		}
		this_IntLiteral_0=ruleIntLiteral
		{
			$current = $this_IntLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1());
		}
		this_IntVarExpression_1=ruleIntVarExpression
		{
			$current = $this_IntVarExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2());
		}
		this_RealLiteral_2=ruleRealLiteral
		{
			$current = $this_RealLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
			}
			this_Addition_4=ruleAddition
			{
				$current = $this_Addition_4.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
			}
		)
	)
;

// Entry rule entryRuleIntLiteral
entryRuleIntLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntLiteralRule()); }
	iv_ruleIntLiteral=ruleIntLiteral
	{ $current=$iv_ruleIntLiteral.current; }
	EOF;

// Rule IntLiteral
ruleIntLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_INT
			{
				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleRealLiteral
entryRuleRealLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealLiteralRule()); }
	iv_ruleRealLiteral=ruleRealLiteral
	{ $current=$iv_ruleRealLiteral.current; }
	EOF;

// Rule RealLiteral
ruleRealLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
			}
			lv_val_0_0=ruleREAL
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRealLiteralRule());
				}
				set(
					$current,
					"val",
					lv_val_0_0,
					"uk.ac.kcl.inf.szschaler.turtles.Turtles.REAL");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleIntVarExpression
entryRuleIntVarExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntVarExpressionRule()); }
	iv_ruleIntVarExpression=ruleIntVarExpression
	{ $current=$iv_ruleIntVarExpression.current; }
	EOF;

// Rule IntVarExpression
ruleIntVarExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntVarExpressionRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getREALRule()); }
	iv_ruleREAL=ruleREAL
	{ $current=$iv_ruleREAL.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Rule PenState
rulePenState returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='up'
			{
				$current = grammarAccess.getPenStateAccess().getUpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPenStateAccess().getUpEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='down'
			{
				$current = grammarAccess.getPenStateAccess().getDownEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPenStateAccess().getDownEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule MoveCommand
ruleMoveCommand returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='forward'
			{
				$current = grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='backward'
			{
				$current = grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TurnCommand
ruleTurnCommand returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='left'
			{
				$current = grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='right'
			{
				$current = grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
