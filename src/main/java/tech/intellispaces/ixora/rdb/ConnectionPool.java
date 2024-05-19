package tech.intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("ce213223-d283-42e5-b6bf-23ba0af5d4bc")
public interface ConnectionPool extends DataSource {

  @Transition("1b07e8c0-98de-43cc-8cf2-1af72dde0966")
  DataSource dataSource();
}
