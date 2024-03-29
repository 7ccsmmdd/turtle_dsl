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
   * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegrees()
   * @generated
   * @ordered
   */
  protected Expression degrees;

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
  public Expression getDegrees()
  {
    return degrees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDegrees(Expression newDegrees, NotificationChain msgs)
  {
    Expression oldDegrees = degrees;
    degrees = newDegrees;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurtlesPackage.TURN_STATEMENT__DEGREES, oldDegrees, newDegrees);
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
  public void setDegrees(Expression newDegrees)
  {
    if (newDegrees != degrees)
    {
      NotificationChain msgs = null;
      if (degrees != null)
        msgs = ((InternalEObject)degrees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurtlesPackage.TURN_STATEMENT__DEGREES, null, msgs);
      if (newDegrees != null)
        msgs = ((InternalEObject)newDegrees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurtlesPackage.TURN_STATEMENT__DEGREES, null, msgs);
      msgs = basicSetDegrees(newDegrees, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlesPackage.TURN_STATEMENT__DEGREES, newDegrees, newDegrees));
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
      case TurtlesPackage.TURN_STATEMENT__DEGREES:
        return basicSetDegrees(null, msgs);
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
        setDegrees((Expression)newValue);
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
        setDegrees((Expression)null);
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
        return degrees != null;
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

} //TurnStatementImpl
