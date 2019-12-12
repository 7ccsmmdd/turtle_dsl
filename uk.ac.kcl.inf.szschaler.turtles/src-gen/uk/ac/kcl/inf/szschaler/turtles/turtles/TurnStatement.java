/**
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement#getCommand <em>Command</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage#getTurnStatement()
 * @model
 * @generated
 */
public interface TurnStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.szschaler.turtles.turtles.TurnCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurnCommand
   * @see #setCommand(TurnCommand)
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage#getTurnStatement_Command()
   * @model
   * @generated
   */
  TurnCommand getCommand();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurnCommand
   * @see #getCommand()
   * @generated
   */
  void setCommand(TurnCommand value);

  /**
   * Returns the value of the '<em><b>Degrees</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degrees</em>' attribute.
   * @see #setDegrees(float)
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage#getTurnStatement_Degrees()
   * @model
   * @generated
   */
  float getDegrees();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement#getDegrees <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degrees</em>' attribute.
   * @see #getDegrees()
   * @generated
   */
  void setDegrees(float value);

} // TurnStatement
