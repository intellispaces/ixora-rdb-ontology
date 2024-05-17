package intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Factory;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("8a1c0f79-78f2-4757-8f30-8a0fdeea4b93")
public interface DataSource {

  @Factory
  @Transition("7465cd7c-94bd-4aac-b220-1520907c4e9b")
  Connection getConnection();
}
