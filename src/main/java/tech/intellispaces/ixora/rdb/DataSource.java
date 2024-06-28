package tech.intellispaces.ixora.rdb;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import tech.intellispaces.framework.core.traverse.TraverseTypes;

@Domain("8a1c0f79-78f2-4757-8f30-8a0fdeea4b93")
public interface DataSource {

  @Transition("ea808587-a507-40e1-9091-0c623dcb6d74")
  DataSourceProperties properties();

  @Transition(value = "7465cd7c-94bd-4aac-b220-1520907c4e9b", type = TraverseTypes.MovingAndBacklash)
  Connection getConnection();
}
