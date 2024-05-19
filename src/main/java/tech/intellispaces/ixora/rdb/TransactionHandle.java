package tech.intellispaces.ixora.rdb;

import tech.intellispacesframework.commons.action.Getter;
import tech.intellispacesframework.commons.exception.ExceptionFunctions;
import tech.intellispacesframework.core.exception.TraverseException;
import tech.intellispacesframework.core.guide.n0.Mover0;
import tech.intellispacesframework.core.object.MovableObjectHandle;
import tech.intellispacesframework.core.space.transition.TransitionFunctions;
import tech.intellispacesframework.core.system.Modules;
import tech.intellispacesframework.core.transition.TransitionMethod1;

import static tech.intellispacesframework.commons.action.ActionBuilders.cachedLazyGetter;

public abstract class TransactionHandle implements MovableObjectHandle<Transaction>, Transaction {

  @Override
  public abstract TransactionHandle sameTransactionAfterCommit();

  @Override
  public abstract TransactionHandle sameTransactionAfterRollback();

  @Override
  public abstract <Q> TransactionHandle moveThru(String tid, Q qualifier) throws TraverseException;

  @Override
  public abstract <Q> TransactionHandle moveThru(TransitionMethod1<Transaction, Transaction, Q> transitionMethod, Q qualifier) throws TraverseException;

  public TransactionHandle commit() {
    Mover0<TransactionHandle> mover = SAME_TRANSACTION_AFTER_COMMIT_GETTER.get();
    return ExceptionFunctions.coverException(mover::move, this);
  }

  public TransactionHandle rollback() {
    Mover0<TransactionHandle> mover = SAME_TRANSACTION_AFTER_ROLLBACK_GETTER.get();
    return ExceptionFunctions.coverException(mover::move, this);
  }

  private static final Getter<Mover0<TransactionHandle>> SAME_TRANSACTION_AFTER_COMMIT_GETTER = cachedLazyGetter(() -> {
    String tid = TransitionFunctions.getTransitionId(Transaction.class, Transaction::sameTransactionAfterCommit);
    return Modules.activeModule().autoMoverThruTransition0(TransactionHandle.class, tid);
  });

  private static final Getter<Mover0<TransactionHandle>> SAME_TRANSACTION_AFTER_ROLLBACK_GETTER = cachedLazyGetter(() -> {
    String tid = TransitionFunctions.getTransitionId(Transaction.class, Transaction::sameTransactionAfterRollback);
    return Modules.activeModule().autoMoverThruTransition0(TransactionHandle.class, tid);
  });
}
