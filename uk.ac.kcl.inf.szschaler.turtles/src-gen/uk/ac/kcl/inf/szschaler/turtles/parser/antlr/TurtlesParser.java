/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.turtles.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.szschaler.turtles.parser.antlr.internal.InternalTurtlesParser;
import uk.ac.kcl.inf.szschaler.turtles.services.TurtlesGrammarAccess;

public class TurtlesParser extends AbstractAntlrParser {

	@Inject
	private TurtlesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTurtlesParser createParser(XtextTokenStream stream) {
		return new InternalTurtlesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TurtleProgram";
	}

	public TurtlesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TurtlesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}