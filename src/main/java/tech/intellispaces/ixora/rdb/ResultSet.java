package tech.intellispaces.ixora.rdb;

import tech.intellispacesframework.core.annotation.AutoGeneration;
import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

@Domain("80898b0a-6a68-4693-bc86-17d7c5bb6a64")
@AutoGeneration(enabled = false)
public interface ResultSet {

  @Transition("a0b049ef-9ff2-4611-95b4-b500673afa55")
  ResultSet sameResultSetAfterShift();

  @Transition("4630f73e-df55-4535-9cb4-93978773cf3d")
  boolean hasNext();
}
