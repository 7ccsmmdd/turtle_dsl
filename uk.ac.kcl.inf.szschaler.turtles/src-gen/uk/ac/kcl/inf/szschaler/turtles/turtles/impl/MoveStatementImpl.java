/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.szschaler.turtles.turtles.Expression;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveCommand;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.impl.MoveStatementImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.impl.MoveStatementImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveStatementImpl extends StatementImpl implements MoveStatement
{
  /**
   * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected static final MoveCommand COMMAND_EDEFAULT = MoveCommand.FORWARD;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected MoveCommand command = COMMAND_EDEFAULT;

  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected Expression steps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveStatementImpl()
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
    return TurtlesPackage.Literals.MOVE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveCommand getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommand(MoveCommand newCommand)
  {
    MoveCommand oldCommand = command;
    command = newCommand == null ? COMMAND_EDEFAULT : newCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlesPackage.MOVE_STATEMENT__COMMAND, oldCommand, command));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getSteps()
  {
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSteps(Expression newSteps, NotificationChain msgs)
  {
    Expression oldSteps = steps;
    steps = newSteps;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurtlesPackage.MOVE_STATEMENT__STEPS, oldSteps, newSteps);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSteps(Expression newSteps)
  {
    if (newSteps != steps)
    {
      NotificationChain msgs = null;
      if (steps != null)
        msgs = ((InternalEObject)steps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurtlesPackage.MOVE_STATEMENT__STEPS, null, msgs);
      if (newSteps != null)
        msgs = ((InternalEObject)newSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurtlesPackage.MOVE_STATEMENT__STEPS, null, msgs);
      msgs = basicSetSteps(newSteps, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlesPackage.MOVE_STATEMENT__STEPS, newSteps, newSteps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TurtlesPackage.MOVE_STATEMENT__STEPS:
        return basicSetSteps(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TurtlesPackage.MOVE_STATEMENT__COMMAND:
        return getCommand();
      case TurtlesPackage.MOVE_STATEMENT__STEPS:
        return getSteps();
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
      case TurtlesPackage.MOVE_STATEMENT__COMMAND:
        setCommand((MoveCommand)newValue);
        return;
      case TurtlesPackage.MOVE_STATEMENT__STEPS:
        setSteps((Expression)newValue);
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
      case TurtlesPackage.MOVE_STATEMENT__COMMAND:
        setCommand(COMMAND_EDEFAULT);
        return;
      case TurtlesPackage.MOVE_STATEMENT__STEPS:
        setSteps((Expression)null);
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
      case TurtlesPackage.MOVE_STATEMENT__COMMAND:
        return command != COMMAND_EDEFAULT;
      case TurtlesPackage.MOVE_STATEMENT__STEPS:
        return steps != null;
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
    result.append(')');
    return result.toString();
  }

} //MoveStatementImpl
