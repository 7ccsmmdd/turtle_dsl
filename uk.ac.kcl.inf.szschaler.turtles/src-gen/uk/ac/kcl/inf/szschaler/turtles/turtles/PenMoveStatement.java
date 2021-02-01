/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pen Move Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.turtles.turtles.PenMoveStatement#getState <em>State</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage#getPenMoveStatement()
 * @model
 * @generated
 */
public interface PenMoveStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.szschaler.turtles.turtles.PenState}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.PenState
   * @see #setState(PenState)
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage#getPenMoveStatement_State()
   * @model
   * @generated
   */
  PenState getState();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.turtles.turtles.PenMoveStatement#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.PenState
   * @see #getState()
   * @generated
   */
  void setState(PenState value);

} // PenMoveStatement