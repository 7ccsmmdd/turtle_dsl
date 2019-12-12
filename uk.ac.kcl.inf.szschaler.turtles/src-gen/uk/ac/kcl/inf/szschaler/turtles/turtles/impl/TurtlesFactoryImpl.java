/**
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.szschaler.turtles.turtles.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlesFactoryImpl extends EFactoryImpl implements TurtlesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TurtlesFactory init()
  {
    try
    {
      TurtlesFactory theTurtlesFactory = (TurtlesFactory)EPackage.Registry.INSTANCE.getEFactory(TurtlesPackage.eNS_URI);
      if (theTurtlesFactory != null)
      {
        return theTurtlesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TurtlesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtlesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TurtlesPackage.TURTLE_PROGRAM: return createTurtleProgram();
      case TurtlesPackage.STATEMENT: return createStatement();
      case TurtlesPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case TurtlesPackage.LOOP_STATEMENT: return createLoopStatement();
      case TurtlesPackage.MOVE_STATEMENT: return createMoveStatement();
      case TurtlesPackage.TURN_STATEMENT: return createTurnStatement();
      case TurtlesPackage.INT_EXPRESSION: return createIntExpression();
      case TurtlesPackage.INT_LITERAL: return createIntLiteral();
      case TurtlesPackage.INT_VAR_EXPRESSION: return createIntVarExpression();
      case TurtlesPackage.ADDITION: return createAddition();
      case TurtlesPackage.MULTIPLICATION: return createMultiplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TurtlesPackage.MOVE_COMMAND:
        return createMoveCommandFromString(eDataType, initialValue);
      case TurtlesPackage.TURN_COMMAND:
        return createTurnCommandFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TurtlesPackage.MOVE_COMMAND:
        return convertMoveCommandToString(eDataType, instanceValue);
      case TurtlesPackage.TURN_COMMAND:
        return convertTurnCommandToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TurtleProgram createTurtleProgram()
  {
    TurtleProgramImpl turtleProgram = new TurtleProgramImpl();
    return turtleProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoopStatement createLoopStatement()
  {
    LoopStatementImpl loopStatement = new LoopStatementImpl();
    return loopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveStatement createMoveStatement()
  {
    MoveStatementImpl moveStatement = new MoveStatementImpl();
    return moveStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TurnStatement createTurnStatement()
  {
    TurnStatementImpl turnStatement = new TurnStatementImpl();
    return turnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntExpression createIntExpression()
  {
    IntExpressionImpl intExpression = new IntExpressionImpl();
    return intExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntVarExpression createIntVarExpression()
  {
    IntVarExpressionImpl intVarExpression = new IntVarExpressionImpl();
    return intVarExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveCommand createMoveCommandFromString(EDataType eDataType, String initialValue)
  {
    MoveCommand result = MoveCommand.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMoveCommandToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnCommand createTurnCommandFromString(EDataType eDataType, String initialValue)
  {
    TurnCommand result = TurnCommand.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTurnCommandToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TurtlesPackage getTurtlesPackage()
  {
    return (TurtlesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TurtlesPackage getPackage()
  {
    return TurtlesPackage.eINSTANCE;
  }

} //TurtlesFactoryImpl
