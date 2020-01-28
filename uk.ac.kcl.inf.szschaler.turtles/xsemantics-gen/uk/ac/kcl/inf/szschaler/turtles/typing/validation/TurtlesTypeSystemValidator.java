package uk.ac.kcl.inf.szschaler.turtles.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.inf.szschaler.turtles.turtles.LoopStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement;
import uk.ac.kcl.inf.szschaler.turtles.typing.TurtlesTypeSystem;
import uk.ac.kcl.inf.szschaler.turtles.validation.AbstractTurtlesValidator;

@SuppressWarnings("all")
public class TurtlesTypeSystemValidator extends AbstractTurtlesValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected TurtlesTypeSystem xsemanticsSystem;
  
  protected TurtlesTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void checkMoveStatement(final MoveStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkMoveStatement(stmt),
    		stmt);
  }
  
  @Check
  public void checkLoopStatement(final LoopStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkLoopStatement(stmt),
    		stmt);
  }
  
  @Check
  public void checkTurnStatement(final TurnStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkTurnStatement(stmt),
    		stmt);
  }
}
