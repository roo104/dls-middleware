package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyOption2TripletCq implements Serializable {
  @JsonProperty("localValue")
  private String localValue = null;

  @JsonProperty("parentResolved")
  private String parentResolved = null;

  @JsonProperty("resolvedValue")
  private String resolvedValue = null;


  public String getLocalValue() {
    return localValue;
  }

  public void setLocalValue(String localValue) {
    this.localValue = localValue;
  }

  public String getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(String parentResolved) {
    this.parentResolved = parentResolved;
  }

  public String getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(String resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

