package intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Factory;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("f8dd8d22-dd1e-445e-a40f-ee8884a4cef5")
public interface DataSource {

  @Factory
  @Transition("7465cd7c-94bd-4aac-b220-1520907c4e9b")
  Connection getConnection();
}
