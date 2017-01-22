package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TimeFrameTripletCq implements Serializable {
  @JsonProperty("localValue")
  private TimeFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private TimeFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private TimeFrameCq resolvedValue = null;


  public TimeFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(TimeFrameCq localValue) {
    this.localValue = localValue;
  }

  public TimeFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(TimeFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public TimeFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(TimeFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

