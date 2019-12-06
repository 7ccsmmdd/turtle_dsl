/**
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.turtles.turtles.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.szschaler.turtles.turtles.IntExpression;
import uk.ac.kcl.inf.szschaler.turtles.turtles.LoopStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveCommand;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.Statement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnCommand;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtleProgram;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesFactory;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage;
import uk.ac.kcl.inf.szschaler.turtles.turtles.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlesPackageImpl extends EPackageImpl implements TurtlesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass turtleProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass turnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum moveCommandEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum turnCommandEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TurtlesPackageImpl()
  {
    super(eNS_URI, TurtlesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TurtlesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TurtlesPackage init()
  {
    if (isInited) return (TurtlesPackage)EPackage.Registry.INSTANCE.getEPackage(TurtlesPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTurtlesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TurtlesPackageImpl theTurtlesPackage = registeredTurtlesPackage instanceof TurtlesPackageImpl ? (TurtlesPackageImpl)registeredTurtlesPackage : new TurtlesPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTurtlesPackage.createPackageContents();

    // Initialize created meta-data
    theTurtlesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTurtlesPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TurtlesPackage.eNS_URI, theTurtlesPackage);
    return theTurtlesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTurtleProgram()
  {
    return turtleProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTurtleProgram_Statements()
  {
    return (EReference)turtleProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariableDeclaration_Value()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLoopStatement()
  {
    return loopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLoopStatement_Count()
  {
    return (EReference)loopStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLoopStatement_Statements()
  {
    return (EReference)loopStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMoveStatement()
  {
    return moveStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMoveStatement_Command()
  {
    return (EAttribute)moveStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMoveStatement_Steps()
  {
    return (EReference)moveStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTurnStatement()
  {
    return turnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTurnStatement_Command()
  {
    return (EAttribute)turnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTurnStatement_Degrees()
  {
    return (EAttribute)turnStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntExpression()
  {
    return intExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntExpression_Val()
  {
    return (EAttribute)intExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntExpression_Var()
  {
    return (EReference)intExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getMoveCommand()
  {
    return moveCommandEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTurnCommand()
  {
    return turnCommandEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TurtlesFactory getTurtlesFactory()
  {
    return (TurtlesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    turtleProgramEClass = createEClass(TURTLE_PROGRAM);
    createEReference(turtleProgramEClass, TURTLE_PROGRAM__STATEMENTS);

    statementEClass = createEClass(STATEMENT);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__VALUE);

    loopStatementEClass = createEClass(LOOP_STATEMENT);
    createEReference(loopStatementEClass, LOOP_STATEMENT__COUNT);
    createEReference(loopStatementEClass, LOOP_STATEMENT__STATEMENTS);

    moveStatementEClass = createEClass(MOVE_STATEMENT);
    createEAttribute(moveStatementEClass, MOVE_STATEMENT__COMMAND);
    createEReference(moveStatementEClass, MOVE_STATEMENT__STEPS);

    turnStatementEClass = createEClass(TURN_STATEMENT);
    createEAttribute(turnStatementEClass, TURN_STATEMENT__COMMAND);
    createEAttribute(turnStatementEClass, TURN_STATEMENT__DEGREES);

    intExpressionEClass = createEClass(INT_EXPRESSION);
    createEAttribute(intExpressionEClass, INT_EXPRESSION__VAL);
    createEReference(intExpressionEClass, INT_EXPRESSION__VAR);

    // Create enums
    moveCommandEEnum = createEEnum(MOVE_COMMAND);
    turnCommandEEnum = createEEnum(TURN_COMMAND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    variableDeclarationEClass.getESuperTypes().add(this.getStatement());
    loopStatementEClass.getESuperTypes().add(this.getStatement());
    moveStatementEClass.getESuperTypes().add(this.getStatement());
    turnStatementEClass.getESuperTypes().add(this.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(turtleProgramEClass, TurtleProgram.class, "TurtleProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTurtleProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, TurtleProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Value(), ecorePackage.getEInt(), "value", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopStatementEClass, LoopStatement.class, "LoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoopStatement_Count(), this.getIntExpression(), null, "count", null, 0, 1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoopStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveStatementEClass, MoveStatement.class, "MoveStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMoveStatement_Command(), this.getMoveCommand(), "command", null, 0, 1, MoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMoveStatement_Steps(), this.getIntExpression(), null, "steps", null, 0, 1, MoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(turnStatementEClass, TurnStatement.class, "TurnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTurnStatement_Command(), this.getTurnCommand(), "command", null, 0, 1, TurnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTurnStatement_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, TurnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intExpressionEClass, IntExpression.class, "IntExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntExpression_Val(), ecorePackage.getEInt(), "val", null, 0, 1, IntExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntExpression_Var(), this.getVariableDeclaration(), null, "var", null, 0, 1, IntExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(moveCommandEEnum, MoveCommand.class, "MoveCommand");
    addEEnumLiteral(moveCommandEEnum, MoveCommand.FORWARD);
    addEEnumLiteral(moveCommandEEnum, MoveCommand.BACKWARD);

    initEEnum(turnCommandEEnum, TurnCommand.class, "TurnCommand");
    addEEnumLiteral(turnCommandEEnum, TurnCommand.LEFT);
    addEEnumLiteral(turnCommandEEnum, TurnCommand.RIGHT);

    // Create resource
    createResource(eNS_URI);
  }

} //TurtlesPackageImpl
