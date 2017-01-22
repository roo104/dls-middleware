package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PremiumHolidayFrameTripletCq implements Serializable {
  @JsonProperty("localValue")
  private PremiumHolidayFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private PremiumHolidayFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PremiumHolidayFrameCq resolvedValue = null;


  public PremiumHolidayFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PremiumHolidayFrameCq localValue) {
    this.localValue = localValue;
  }

  public PremiumHolidayFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PremiumHolidayFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PremiumHolidayFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PremiumHolidayFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

