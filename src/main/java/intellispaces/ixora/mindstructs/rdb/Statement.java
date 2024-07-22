package intellispaces.ixora.mindstructs.rdb;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import tech.intellispaces.framework.core.traverse.TraverseTypes;

@Domain("24c32319-367b-4d90-8ff0-307532d7ac0d")
public interface Statement {

  @Transition(value = "b9f8a9d2-cb25-4db2-a94a-7053dd375e3c", type = TraverseTypes.Moving)
  ResultSet executeQuery(String sql);
}
