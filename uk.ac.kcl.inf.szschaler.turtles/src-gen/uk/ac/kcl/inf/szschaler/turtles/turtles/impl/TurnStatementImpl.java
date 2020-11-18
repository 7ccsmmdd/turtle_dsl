/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnCommand;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.impl.TurnStatementImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.impl.TurnStatementImpl#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnStatementImpl extends StatementImpl implements TurnStatement
{
  /**
   * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected static final TurnCommand COMMAND_EDEFAULT = TurnCommand.LEFT;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected TurnCommand command = COMMAND_EDEFAULT;

  /**
   * The default value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegrees()
   * @generated
   * @ordered
   */
  protected static final int DEGREES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegrees()
   * @generated
   * @ordered
   */
  protected int degrees = DEGREES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TurnStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TurtlesPackage.Literals.TURN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TurnCommand getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommand(TurnCommand newCommand)
  {
    TurnCommand oldCommand = command;
    command = newCommand == null ? COMMAND_EDEFAULT : newCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlesPackage.TURN_STATEMENT__COMMAND, oldCommand, command));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDegrees()
  {
    return degrees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDegrees(int newDegrees)
  {
    int oldDegrees = degrees;
    degrees = newDegrees;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlesPackage.TURN_STATEMENT__DEGREES, oldDegrees, degrees));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TurtlesPackage.TURN_STATEMENT__COMMAND:
        return getCommand();
      case TurtlesPackage.TURN_STATEMENT__DEGREES:
        return getDegrees();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TurtlesPackage.TURN_STATEMENT__COMMAND:
        setCommand((TurnCommand)newValue);
        return;
      case TurtlesPackage.TURN_STATEMENT__DEGREES:
        setDegrees((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TurtlesPackage.TURN_STATEMENT__COMMAND:
        setCommand(COMMAND_EDEFAULT);
        return;
      case TurtlesPackage.TURN_STATEMENT__DEGREES:
        setDegrees(DEGREES_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TurtlesPackage.TURN_STATEMENT__COMMAND:
        return command != COMMAND_EDEFAULT;
      case TurtlesPackage.TURN_STATEMENT__DEGREES:
        return degrees != DEGREES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (command: ");
    result.append(command);
    result.append(", degrees: ");
    result.append(degrees);
    result.append(')');
    return result.toString();
  }

} //TurnStatementImpl
