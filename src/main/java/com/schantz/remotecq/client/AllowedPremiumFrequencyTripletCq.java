package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedPremiumFrequencyTripletCq implements Serializable {
  @JsonProperty("localValue")
  private PeriodLengthFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private PeriodLengthFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PeriodLengthFrameCq resolvedValue = null;


  public PeriodLengthFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PeriodLengthFrameCq localValue) {
    this.localValue = localValue;
  }

  public PeriodLengthFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PeriodLengthFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PeriodLengthFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PeriodLengthFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

