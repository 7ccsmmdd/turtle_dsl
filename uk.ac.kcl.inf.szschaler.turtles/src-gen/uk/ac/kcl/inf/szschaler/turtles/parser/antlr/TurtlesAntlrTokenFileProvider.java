/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.szschaler.turtles.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TurtlesAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/szschaler/turtles/parser/antlr/internal/InternalTurtles.tokens");
	}
}
