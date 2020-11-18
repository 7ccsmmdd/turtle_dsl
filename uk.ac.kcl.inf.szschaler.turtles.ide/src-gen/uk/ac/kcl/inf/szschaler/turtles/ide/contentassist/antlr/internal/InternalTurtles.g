/*
 * generated by Xtext 2.20.0
 */
grammar InternalTurtles;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.szschaler.turtles.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleTurtleProgram
entryRuleTurtleProgram
:
{ before(grammarAccess.getTurtleProgramRule()); }
	 ruleTurtleProgram
{ after(grammarAccess.getTurtleProgramRule()); } 
	 EOF 
;

// Rule TurtleProgram
ruleTurtleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurtleProgramAccess().getStatementsAssignment()); }
		(rule__TurtleProgram__StatementsAssignment)*
		{ after(grammarAccess.getTurtleProgramAccess().getStatementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLoopStatement
entryRuleLoopStatement
:
{ before(grammarAccess.getLoopStatementRule()); }
	 ruleLoopStatement
{ after(grammarAccess.getLoopStatementRule()); } 
	 EOF 
;

// Rule LoopStatement
ruleLoopStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoopStatementAccess().getGroup()); }
		(rule__LoopStatement__Group__0)
		{ after(grammarAccess.getLoopStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveStatement
entryRuleMoveStatement
:
{ before(grammarAccess.getMoveStatementRule()); }
	 ruleMoveStatement
{ after(grammarAccess.getMoveStatementRule()); } 
	 EOF 
;

// Rule MoveStatement
ruleMoveStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveStatementAccess().getGroup()); }
		(rule__MoveStatement__Group__0)
		{ after(grammarAccess.getMoveStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTurnStatement
entryRuleTurnStatement
:
{ before(grammarAccess.getTurnStatementRule()); }
	 ruleTurnStatement
{ after(grammarAccess.getTurnStatementRule()); } 
	 EOF 
;

// Rule TurnStatement
ruleTurnStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurnStatementAccess().getGroup()); }
		(rule__TurnStatement__Group__0)
		{ after(grammarAccess.getTurnStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule MoveCommand
ruleMoveCommand
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveCommandAccess().getAlternatives()); }
		(rule__MoveCommand__Alternatives)
		{ after(grammarAccess.getMoveCommandAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TurnCommand
ruleTurnCommand
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnCommandAccess().getAlternatives()); }
		(rule__TurnCommand__Alternatives)
		{ after(grammarAccess.getTurnCommandAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_0()); }
		ruleMoveStatement
		{ after(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getTurnStatementParserRuleCall_1()); }
		ruleTurnStatement
		{ after(grammarAccess.getStatementAccess().getTurnStatementParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); }
		ruleLoopStatement
		{ after(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveCommand__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); }
		('forward')
		{ after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); }
		('backward')
		{ after(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); }
		('left')
		{ after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); }
		('right')
		{ after(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopStatement__Group__0__Impl
	rule__LoopStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); }
	(rule__LoopStatement__CountAssignment_0)
	{ after(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopStatement__Group__1__Impl
	rule__LoopStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); }
	'times'
	{ after(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopStatement__Group__2__Impl
	rule__LoopStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); }
	'do'
	{ after(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopStatement__Group__3__Impl
	rule__LoopStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); }
		(rule__LoopStatement__StatementsAssignment_3)
		{ after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); }
	)
	(
		{ before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); }
		(rule__LoopStatement__StatementsAssignment_3)*
		{ after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopStatement__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); }
	'end'
	{ after(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveStatement__Group__0__Impl
	rule__MoveStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); }
	(rule__MoveStatement__CommandAssignment_0)
	{ after(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveStatement__Group__1__Impl
	rule__MoveStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveStatement__Group__2__Impl
	rule__MoveStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); }
	(rule__MoveStatement__StepsAssignment_2)
	{ after(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveStatement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurnStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnStatement__Group__0__Impl
	rule__TurnStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); }
	'turn'
	{ after(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnStatement__Group__1__Impl
	rule__TurnStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); }
	(rule__TurnStatement__CommandAssignment_1)
	{ after(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnStatement__Group__2__Impl
	rule__TurnStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnStatementAccess().getByKeyword_2()); }
	'by'
	{ after(grammarAccess.getTurnStatementAccess().getByKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnStatement__Group__3__Impl
	rule__TurnStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); }
	(rule__TurnStatement__DegreesAssignment_3)
	{ after(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnStatement__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnStatementAccess().getDegreesKeyword_4()); }
	'degrees'
	{ after(grammarAccess.getTurnStatementAccess().getDegreesKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurtleProgram__StatementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurtleProgramAccess().getStatementsStatementParserRuleCall_0()); }
		ruleStatement
		{ after(grammarAccess.getTurtleProgramAccess().getStatementsStatementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__CountAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopStatementAccess().getCountINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getLoopStatementAccess().getCountINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopStatement__StatementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0()); }
		ruleStatement
		{ after(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__CommandAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0()); }
		ruleMoveCommand
		{ after(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveStatement__StepsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveStatementAccess().getStepsINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveStatementAccess().getStepsINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__CommandAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0()); }
		ruleTurnCommand
		{ after(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnStatement__DegreesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnStatementAccess().getDegreesINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getTurnStatementAccess().getDegreesINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
