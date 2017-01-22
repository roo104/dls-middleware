package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BooleanTripletCq implements Serializable {
  @JsonProperty("localValue")
  private Boolean localValue = false;

  @JsonProperty("parentResolved")
  private Boolean parentResolved = false;

  @JsonProperty("resolvedValue")
  private Boolean resolvedValue = false;


  public Boolean getLocalValue() {
    return localValue;
  }

  public void setLocalValue(Boolean localValue) {
    this.localValue = localValue;
  }

  public Boolean getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(Boolean parentResolved) {
    this.parentResolved = parentResolved;
  }

  public Boolean getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(Boolean resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

