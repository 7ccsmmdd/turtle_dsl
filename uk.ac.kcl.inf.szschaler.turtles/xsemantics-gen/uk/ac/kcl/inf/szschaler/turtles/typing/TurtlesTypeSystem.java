package uk.ac.kcl.inf.szschaler.turtles.typing;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsProvider;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.szschaler.turtles.turtles.Addition;
import uk.ac.kcl.inf.szschaler.turtles.turtles.Expression;
import uk.ac.kcl.inf.szschaler.turtles.turtles.IntLiteral;
import uk.ac.kcl.inf.szschaler.turtles.turtles.IntVarExpression;
import uk.ac.kcl.inf.szschaler.turtles.turtles.LoopStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.MoveStatement;
import uk.ac.kcl.inf.szschaler.turtles.turtles.Multiplication;
import uk.ac.kcl.inf.szschaler.turtles.turtles.RealLiteral;
import uk.ac.kcl.inf.szschaler.turtles.turtles.TurnStatement;
import uk.ac.kcl.inf.szschaler.turtles.typing.TurtlesType;

@SuppressWarnings("all")
public class TurtlesTypeSystem extends XsemanticsRuntimeSystem {
  public static final String TYPEEXPRESSIONS = "uk.ac.kcl.inf.szschaler.turtles.typing.TypeExpressions";
  
  public static final String TINTLIT = "uk.ac.kcl.inf.szschaler.turtles.typing.TIntLit";
  
  public static final String TREALLIT = "uk.ac.kcl.inf.szschaler.turtles.typing.TRealLit";
  
  public static final String TVARREF = "uk.ac.kcl.inf.szschaler.turtles.typing.TVarRef";
  
  public static final String TMULTIPLICATION = "uk.ac.kcl.inf.szschaler.turtles.typing.TMultiplication";
  
  public static final String TADDITION = "uk.ac.kcl.inf.szschaler.turtles.typing.TAddition";
  
  public static final String SUBTYPING = "uk.ac.kcl.inf.szschaler.turtles.typing.SubTyping";
  
  private PolymorphicDispatcher<TurtlesType> typeExpressionsDispatcher;
  
  private PolymorphicDispatcher<Result<TurtlesType>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> subTypeDispatcher;
  
  public TurtlesTypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    subTypeDispatcher = buildPolymorphicDispatcher1(
    	"subTypeImpl", 4, "|-", "<:");
    typeExpressionsDispatcher = buildPolymorphicDispatcher(
    	"typeExpressionsImpl", 2);
  }
  
  public TurtlesType typeExpressions(final Iterable<Expression> exps) throws RuleFailedException {
    return typeExpressions(null, exps);
  }
  
  public TurtlesType typeExpressions(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	return typeExpressionsInternal(_trace_, exps);
    } catch (Exception _e_typeExpressions) {
    	throw extractRuleFailedException(_e_typeExpressions);
    }
  }
  
  public Result<TurtlesType> type(final Expression exp) {
    return type(new RuleEnvironment(), null, exp);
  }
  
  public Result<TurtlesType> type(final RuleEnvironment _environment_, final Expression exp) {
    return type(_environment_, null, exp);
  }
  
  public Result<TurtlesType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<TurtlesType>>(_environment_, _trace_) {
    		public Result<TurtlesType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }
  
  public Result<Boolean> subType(final TurtlesType left, final TurtlesType right) {
    return subType(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final TurtlesType left, final TurtlesType right) {
    return subType(_environment_, null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TurtlesType left, final TurtlesType right) {
    try {
    	return subTypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	return resultForFailure(_e_subType);
    }
  }
  
  public Boolean subTypeSucceeded(final TurtlesType left, final TurtlesType right) {
    return subTypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final TurtlesType left, final TurtlesType right) {
    return subTypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TurtlesType left, final TurtlesType right) {
    try {
    	subTypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subType) {
    	return false;
    }
  }
  
  public Result<Boolean> checkMoveStatement(final MoveStatement stmt) {
    return checkMoveStatement(null, stmt);
  }
  
  public Result<Boolean> checkMoveStatement(final RuleApplicationTrace _trace_, final MoveStatement stmt) {
    try {
    	return checkMoveStatementInternal(_trace_, stmt);
    } catch (Exception _e_checkMoveStatement) {
    	return resultForFailure(_e_checkMoveStatement);
    }
  }
  
  protected Result<Boolean> checkMoveStatementInternal(final RuleApplicationTrace _trace_, final MoveStatement stmt) throws RuleFailedException {
    /* empty |- stmt.steps : var TurtlesType stepsType */
    Expression _steps = stmt.getSteps();
    TurtlesType stepsType = null;
    Result<TurtlesType> result = typeInternal(emptyEnvironment(), _trace_, _steps);
    checkAssignableTo(result.getFirst(), TurtlesType.class);
    stepsType = (TurtlesType) result.getFirst();
    
    /* empty |- stepsType <: TurtlesType.INT */
    subTypeInternal(emptyEnvironment(), _trace_, stepsType, TurtlesType.INT);
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkLoopStatement(final LoopStatement stmt) {
    return checkLoopStatement(null, stmt);
  }
  
  public Result<Boolean> checkLoopStatement(final RuleApplicationTrace _trace_, final LoopStatement stmt) {
    try {
    	return checkLoopStatementInternal(_trace_, stmt);
    } catch (Exception _e_checkLoopStatement) {
    	return resultForFailure(_e_checkLoopStatement);
    }
  }
  
  protected Result<Boolean> checkLoopStatementInternal(final RuleApplicationTrace _trace_, final LoopStatement stmt) throws RuleFailedException {
    /* empty |- stmt.count : var TurtlesType countType */
    Expression _count = stmt.getCount();
    TurtlesType countType = null;
    Result<TurtlesType> result = typeInternal(emptyEnvironment(), _trace_, _count);
    checkAssignableTo(result.getFirst(), TurtlesType.class);
    countType = (TurtlesType) result.getFirst();
    
    /* empty |- countType <: TurtlesType.INT */
    subTypeInternal(emptyEnvironment(), _trace_, countType, TurtlesType.INT);
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkTurnStatement(final TurnStatement stmt) {
    return checkTurnStatement(null, stmt);
  }
  
  public Result<Boolean> checkTurnStatement(final RuleApplicationTrace _trace_, final TurnStatement stmt) {
    try {
    	return checkTurnStatementInternal(_trace_, stmt);
    } catch (Exception _e_checkTurnStatement) {
    	return resultForFailure(_e_checkTurnStatement);
    }
  }
  
  protected Result<Boolean> checkTurnStatementInternal(final RuleApplicationTrace _trace_, final TurnStatement stmt) throws RuleFailedException {
    /* empty |- stmt.degrees : var TurtlesType degreesType */
    Expression _degrees = stmt.getDegrees();
    TurtlesType degreesType = null;
    Result<TurtlesType> result = typeInternal(emptyEnvironment(), _trace_, _degrees);
    checkAssignableTo(result.getFirst(), TurtlesType.class);
    degreesType = (TurtlesType) result.getFirst();
    
    /* empty |- degreesType <: TurtlesType.REAL */
    subTypeInternal(emptyEnvironment(), _trace_, degreesType, TurtlesType.REAL);
    return new Result<Boolean>(true);
  }
  
  protected TurtlesType typeExpressionsInternal(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) {
    return getFromCache("typeExpressionsInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<TurtlesType>(null, _trace_) {
    		public TurtlesType doGet() {
    			try {
    				checkParamsNotNull(exps);
    				return typeExpressionsDispatcher.invoke(_trace_, exps);
    			} catch (Exception _e_typeExpressions) {
    				sneakyThrowRuleFailedException(_e_typeExpressions);
    				return null;
    			}
    		}
    	}, exps);
  }
  
  protected void typeExpressionsThrowException(final String _error, final String _issue, final Exception _ex, final Iterable<Expression> exps, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<TurtlesType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<TurtlesType>>(_environment_, _trace_) {
    		public Result<TurtlesType> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Expression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> subTypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TurtlesType left, final TurtlesType right) {
    try {
    	checkParamsNotNull(left, right);
    	return subTypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	sneakyThrowRuleFailedException(_e_subType);
    	return null;
    }
  }
  
  protected void subTypeThrowException(final String _error, final String _issue, final Exception _ex, final TurtlesType left, final TurtlesType right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + " is not a subtype of ");
    String _stringRep_1 = this.stringRep(right);
    String _plus_1 = (_plus + _stringRep_1);
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected TurtlesType typeExpressionsImpl(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final TurtlesType _result_ = applyAuxFunTypeExpressions(_subtrace_, exps);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("typeExpressions") + "(" + stringRep(exps)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunTypeExpressions) {
    	typeExpressionsThrowException(auxFunName("typeExpressions") + "(" + stringRep(exps)+ ")",
    		TYPEEXPRESSIONS,
    		e_applyAuxFunTypeExpressions, exps, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected TurtlesType applyAuxFunTypeExpressions(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    final Function1<Expression, Boolean> _function = (Expression exp) -> {
      boolean _xblockexpression = false;
      {
        /* empty |- exp : var TurtlesType exp2Type */
        TurtlesType exp2Type = null;
        Result<TurtlesType> result = typeInternal(emptyEnvironment(), _trace_, exp);
        checkAssignableTo(result.getFirst(), TurtlesType.class);
        exp2Type = (TurtlesType) result.getFirst();
        
        _xblockexpression = (exp2Type == TurtlesType.INT);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    boolean _forall = IterableExtensions.<Expression>forall(exps, _function);
    if (_forall) {
      return TurtlesType.INT;
    } else {
      return TurtlesType.REAL;
    }
  }
  
  protected Result<TurtlesType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TurtlesType> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TurtlesType",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TurtlesType> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    
    return new Result<TurtlesType>(_applyRuleTIntLit_1(G, exp));
  }
  
  private TurtlesType _applyRuleTIntLit_1(final RuleEnvironment G, final IntLiteral exp) throws RuleFailedException {
    return TurtlesType.INT;
  }
  
  protected Result<TurtlesType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TurtlesType> _result_ = applyRuleTRealLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTRealLit) {
    	typeThrowException(ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TurtlesType",
    		TREALLIT,
    		e_applyRuleTRealLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TurtlesType> applyRuleTRealLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    
    return new Result<TurtlesType>(_applyRuleTRealLit_1(G, exp));
  }
  
  private TurtlesType _applyRuleTRealLit_1(final RuleEnvironment G, final RealLiteral exp) throws RuleFailedException {
    return TurtlesType.REAL;
  }
  
  protected Result<TurtlesType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntVarExpression exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TurtlesType> _result_ = applyRuleTVarRef(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TVarRef") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTVarRef) {
    	typeThrowException(ruleName("TVarRef") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TurtlesType",
    		TVARREF,
    		e_applyRuleTVarRef, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TurtlesType> applyRuleTVarRef(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntVarExpression exp) throws RuleFailedException {
    
    return new Result<TurtlesType>(_applyRuleTVarRef_1(G, exp));
  }
  
  private TurtlesType _applyRuleTVarRef_1(final RuleEnvironment G, final IntVarExpression exp) throws RuleFailedException {
    return TurtlesType.INT;
  }
  
  protected Result<TurtlesType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TurtlesType> _result_ = applyRuleTMultiplication(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTMultiplication) {
    	typeThrowException(ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TurtlesType",
    		TMULTIPLICATION,
    		e_applyRuleTMultiplication, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TurtlesType> applyRuleTMultiplication(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    TurtlesType t = null; // output parameter
    EList<Expression> _right = exp.getRight();
    Expression _left = exp.getLeft();
    t = this.typeExpressionsInternal(_trace_, Iterables.<Expression>concat(_right, Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left))));
    return new Result<TurtlesType>(t);
  }
  
  protected Result<TurtlesType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TurtlesType> _result_ = applyRuleTAddition(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddition) {
    	typeThrowException(ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TurtlesType",
    		TADDITION,
    		e_applyRuleTAddition, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TurtlesType> applyRuleTAddition(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    TurtlesType t = null; // output parameter
    EList<Expression> _right = exp.getRight();
    Expression _left = exp.getLeft();
    t = this.typeExpressionsInternal(_trace_, Iterables.<Expression>concat(_right, Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left))));
    return new Result<TurtlesType>(t);
  }
  
  protected Result<Boolean> subTypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final TurtlesType left, final TurtlesType right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleSubTyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleSubTyping) {
    	subTypeThrowException(ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		SUBTYPING,
    		e_applyRuleSubTyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected Result<Boolean> applyRuleSubTyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final TurtlesType left, final TurtlesType right) throws RuleFailedException {
    /* right === TurtlesType.REAL or left === right */
    {
      RuleFailedException previousFailure = null;
      try {
        /* right === TurtlesType.REAL */
        if (!(right == TurtlesType.REAL)) {
          sneakyThrowRuleFailedException("right === TurtlesType.REAL");
        }
      } catch (Exception e) {
        previousFailure = extractRuleFailedException(e);
        /* left === right */
        if (!(left == right)) {
          sneakyThrowRuleFailedException("left === right");
        }
      }
    }
    return new Result<Boolean>(true);
  }
}
