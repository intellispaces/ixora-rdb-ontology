package tech.intellispaces.ixora.rdb;

import tech.intellispaces.ixora.structures.collection.Cursor;
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

  @Transition("5dce771b-2908-444b-ba15-6c0b2167fe33")
  Transaction sameTransactionAfterExecute(String sql);

  @Transition("580e6c95-881e-47f3-a43e-bce3dd2c628d")
  ResultSet query(String sql);

  @Transition("562a0437-6e55-492b-ac35-70ca1ddf57f0")
  <T> Cursor<T> query(Class<T> aClass, String sql);
}
