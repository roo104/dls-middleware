package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LifeCoverTypeTripletCq implements Serializable {
  @JsonProperty("localValue")
  private LifeCoverTypeCq localValue = null;

  @JsonProperty("parentResolved")
  private LifeCoverTypeCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private LifeCoverTypeCq resolvedValue = null;


  public LifeCoverTypeCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(LifeCoverTypeCq localValue) {
    this.localValue = localValue;
  }

  public LifeCoverTypeCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(LifeCoverTypeCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public LifeCoverTypeCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(LifeCoverTypeCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

