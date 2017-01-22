package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PriceGroupIdTripletCq implements Serializable {
  @JsonProperty("localValue")
  private PriceGroupIdCq localValue = null;

  @JsonProperty("parentResolved")
  private PriceGroupIdCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PriceGroupIdCq resolvedValue = null;


  public PriceGroupIdCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PriceGroupIdCq localValue) {
    this.localValue = localValue;
  }

  public PriceGroupIdCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PriceGroupIdCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PriceGroupIdCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PriceGroupIdCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

