package intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.AutoGeneration;
import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

@Domain()
@AutoGeneration(enabled = false)
public interface ResultSet {

  @Transition()
  ResultSet sameResultSetAfterShift();

  @Transition()
  boolean hasNext();
}
