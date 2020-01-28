/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.szschaler.turtles.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.inf.szschaler.turtles.ide.contentassist.antlr.internal.InternalTurtlesParser;
import uk.ac.kcl.inf.szschaler.turtles.services.TurtlesGrammarAccess;

public class TurtlesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TurtlesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TurtlesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0(), "rule__Addition__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0(), "rule__Multiplication__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getPenStateAccess().getAlternatives(), "rule__PenState__Alternatives");
			builder.put(grammarAccess.getMoveCommandAccess().getAlternatives(), "rule__MoveCommand__Alternatives");
			builder.put(grammarAccess.getTurnCommandAccess().getAlternatives(), "rule__TurnCommand__Alternatives");
			builder.put(grammarAccess.getPenMoveStatementAccess().getGroup(), "rule__PenMoveStatement__Group__0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
			builder.put(grammarAccess.getLoopStatementAccess().getGroup(), "rule__LoopStatement__Group__0");
			builder.put(grammarAccess.getMoveStatementAccess().getGroup(), "rule__MoveStatement__Group__0");
			builder.put(grammarAccess.getTurnStatementAccess().getGroup(), "rule__TurnStatement__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getTurtleProgramAccess().getStatementsAssignment(), "rule__TurtleProgram__StatementsAssignment");
			builder.put(grammarAccess.getPenMoveStatementAccess().getStateAssignment_1(), "rule__PenMoveStatement__StateAssignment_1");
			builder.put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3(), "rule__VariableDeclaration__ValueAssignment_3");
			builder.put(grammarAccess.getLoopStatementAccess().getCountAssignment_0(), "rule__LoopStatement__CountAssignment_0");
			builder.put(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3(), "rule__LoopStatement__StatementsAssignment_3");
			builder.put(grammarAccess.getMoveStatementAccess().getCommandAssignment_0(), "rule__MoveStatement__CommandAssignment_0");
			builder.put(grammarAccess.getMoveStatementAccess().getStepsAssignment_2(), "rule__MoveStatement__StepsAssignment_2");
			builder.put(grammarAccess.getTurnStatementAccess().getCommandAssignment_1(), "rule__TurnStatement__CommandAssignment_1");
			builder.put(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3(), "rule__TurnStatement__DegreesAssignment_3");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1(), "rule__Addition__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1(), "rule__Multiplication__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
			builder.put(grammarAccess.getIntLiteralAccess().getValAssignment(), "rule__IntLiteral__ValAssignment");
			builder.put(grammarAccess.getRealLiteralAccess().getValAssignment(), "rule__RealLiteral__ValAssignment");
			builder.put(grammarAccess.getIntVarExpressionAccess().getVarAssignment(), "rule__IntVarExpression__VarAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TurtlesGrammarAccess grammarAccess;

	@Override
	protected InternalTurtlesParser createParser() {
		InternalTurtlesParser result = new InternalTurtlesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TurtlesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TurtlesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
