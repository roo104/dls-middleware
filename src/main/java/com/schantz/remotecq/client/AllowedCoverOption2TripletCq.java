package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedCoverOption2TripletCq implements Serializable {
  @JsonProperty("localValue")
  private CoverOption2SelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private CoverOption2SelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private CoverOption2SelectionFrameCq resolvedValue = null;


  public CoverOption2SelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(CoverOption2SelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public CoverOption2SelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(CoverOption2SelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public CoverOption2SelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(CoverOption2SelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

