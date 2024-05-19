package tech.intellispaces.ixora.rdb;

import tech.intellispaces.ixora.rdb.exception.TransactionException;
import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Factory;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("1931adca-ed62-4b0f-af4f-6d7dee9b7822")
public interface TransactionFactory {

  @Transition("42c35449-eb32-4683-ba40-9ded4a1d38f4")
  JdbcDataSource dataSource();

  @Factory
  @Transition("03e420fb-2cf3-49ea-a1f3-8adff39e738b")
  Transaction getTransaction() throws TransactionException;
}
