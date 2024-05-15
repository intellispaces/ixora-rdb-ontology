package intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.AutoGeneration;
import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("8f174862-2fab-48cb-af12-b8e264f19257")
@AutoGeneration(enabled = false)
public interface Transaction {

  @Transition("038c69e9-7231-49e1-9a71-156018ea026b")
  Connection connection();

  @Transition("8f3720d1-f451-41c0-bac6-d9d1c4c11448")
  Transaction sameTransactionAfterCommit();

  @Transition("68ea2724-07be-463f-8f61-b9102a91efea")
  Transaction sameTransactionAfterRollback();

  @Transition()
  Transaction sameTransactionAfterExecute(String sql);

  @Transition()
  ResultSet query(String sql);

  @Transition()
  <T> Cursor<T> query(Class<T> aClass, String sql);
}
