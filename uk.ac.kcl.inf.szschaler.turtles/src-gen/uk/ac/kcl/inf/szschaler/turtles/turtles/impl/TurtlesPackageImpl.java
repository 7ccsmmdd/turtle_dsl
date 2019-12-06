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

import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveCommand;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.Statement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnCommand;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtleProgram;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesFactory;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurtlesPackage;

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
  public EAttribute getMoveStatement_Steps()
  {
    return (EAttribute)moveStatementEClass.getEStructuralFeatures().get(1);
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

    moveStatementEClass = createEClass(MOVE_STATEMENT);
    createEAttribute(moveStatementEClass, MOVE_STATEMENT__COMMAND);
    createEAttribute(moveStatementEClass, MOVE_STATEMENT__STEPS);

    turnStatementEClass = createEClass(TURN_STATEMENT);
    createEAttribute(turnStatementEClass, TURN_STATEMENT__COMMAND);
    createEAttribute(turnStatementEClass, TURN_STATEMENT__DEGREES);

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
    moveStatementEClass.getESuperTypes().add(this.getStatement());
    turnStatementEClass.getESuperTypes().add(this.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(turtleProgramEClass, TurtleProgram.class, "TurtleProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTurtleProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, TurtleProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moveStatementEClass, MoveStatement.class, "MoveStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMoveStatement_Command(), this.getMoveCommand(), "command", null, 0, 1, MoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMoveStatement_Steps(), ecorePackage.getEInt(), "steps", null, 0, 1, MoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(turnStatementEClass, TurnStatement.class, "TurnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTurnStatement_Command(), this.getTurnCommand(), "command", null, 0, 1, TurnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTurnStatement_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, TurnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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