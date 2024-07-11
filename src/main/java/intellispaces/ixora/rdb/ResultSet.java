package intellispaces.ixora.rdb;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import tech.intellispaces.framework.core.traverse.TraverseTypes;

@Domain("80898b0a-6a68-4693-bc86-17d7c5bb6a64")
public interface ResultSet {

  @Transition(value = "a0b049ef-9ff2-4611-95b4-b500673afa55", type = TraverseTypes.Moving)
  ResultSet next();

  @Transition("4630f73e-df55-4535-9cb4-93978773cf3d")
  boolean hasNext();

  @Transition("77aeebe4-6c9f-4067-a1be-fe7633558a13")
  Integer integerColumnValueByName(String name);

  @Transition("0fb39956-45e1-4b78-afdf-aa0b4922ed86")
  String stringColumnValueByName(String name);

  @Transition("d280d0b1-16d9-4d3a-a172-a0ad39c63de7")
  <T> T columnValue(Class<T> domain);
}
