package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LongTripletCq implements Serializable {
  @JsonProperty("localValue")
  private Long localValue = null;

  @JsonProperty("parentResolved")
  private Long parentResolved = null;

  @JsonProperty("resolvedValue")
  private Long resolvedValue = null;


  public Long getLocalValue() {
    return localValue;
  }

  public void setLocalValue(Long localValue) {
    this.localValue = localValue;
  }

  public Long getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(Long parentResolved) {
    this.parentResolved = parentResolved;
  }

  public Long getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(Long resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

