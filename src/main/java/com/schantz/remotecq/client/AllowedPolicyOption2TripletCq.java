package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedPolicyOption2TripletCq implements Serializable {
  @JsonProperty("localValue")
  private PolicyOption2SelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private PolicyOption2SelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PolicyOption2SelectionFrameCq resolvedValue = null;


  public PolicyOption2SelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PolicyOption2SelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public PolicyOption2SelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PolicyOption2SelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PolicyOption2SelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PolicyOption2SelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

