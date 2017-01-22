package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedPolicyOption1TripletCq implements Serializable {
  @JsonProperty("localValue")
  private PolicyOption1SelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private PolicyOption1SelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PolicyOption1SelectionFrameCq resolvedValue = null;


  public PolicyOption1SelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PolicyOption1SelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public PolicyOption1SelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PolicyOption1SelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PolicyOption1SelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PolicyOption1SelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

