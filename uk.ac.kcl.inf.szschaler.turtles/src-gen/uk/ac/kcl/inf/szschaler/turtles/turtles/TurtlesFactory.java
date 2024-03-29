/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage
 * @generated
 */
public interface TurtlesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TurtlesFactory eINSTANCE = uk.ac.kcl.inf.szschaler.turtles.turtles.impl.TurtlesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Turtle Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Turtle Program</em>'.
   * @generated
   */
  TurtleProgram createTurtleProgram();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Pen Move Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pen Move Statement</em>'.
   * @generated
   */
  PenMoveStatement createPenMoveStatement();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Statement</em>'.
   * @generated
   */
  LoopStatement createLoopStatement();

  /**
   * Returns a new object of class '<em>Move Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Statement</em>'.
   * @generated
   */
  MoveStatement createMoveStatement();

  /**
   * Returns a new object of class '<em>Turn Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Turn Statement</em>'.
   * @generated
   */
  TurnStatement createTurnStatement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Int Var Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Var Expression</em>'.
   * @generated
   */
  IntVarExpression createIntVarExpression();

  /**
   * Returns a new object of class '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition</em>'.
   * @generated
   */
  Addition createAddition();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TurtlesPackage getTurtlesPackage();

} //TurtlesFactory
