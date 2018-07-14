package ch.aquint;

import org.redisson.api.annotation.REntity;
import org.redisson.api.annotation.RId;

@REntity
public class MyLiveObject {

  @RId
  private String name = "my-live-object";
  private String value = null;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
