package tech.intellispaces.ixora.rdb;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import tech.intellispaces.framework.core.traverse.TraverseTypes;

@Domain("ce213223-d283-42e5-b6bf-23ba0af5d4bc")
public interface ConnectionPool {

  @Transition("1b07e8c0-98de-43cc-8cf2-1af72dde0966")
  DataSource dataSource();

  @Transition(value = "ee0c2efb-719f-4bed-9c05-5ad32b37292d", type = TraverseTypes.MovingAndBacklash)
  Connection getConnection();

  @Transition(value = "194fa1ce-bad0-4d45-adab-df940ed70c74", type = TraverseTypes.Moving)
  ConnectionPool releaseConnection(Connection connection);
}
