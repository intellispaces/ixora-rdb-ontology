package intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("f8dd8d22-dd1e-445e-a40f-ee8884a4cef5")
public interface JdbcDataSource extends DataSource {

  @Transition("4107d254-1863-49a0-a5d0-f27795680762")
  JdbcDataSourceProperties properties();
}
