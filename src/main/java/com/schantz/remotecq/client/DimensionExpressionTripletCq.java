package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DimensionExpressionTripletCq implements Serializable {
  @JsonProperty("localValue")
  private DimensionExpressionCq localValue = null;

  @JsonProperty("parentResolved")
  private DimensionExpressionCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private DimensionExpressionCq resolvedValue = null;


  public DimensionExpressionCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(DimensionExpressionCq localValue) {
    this.localValue = localValue;
  }

  public DimensionExpressionCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(DimensionExpressionCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public DimensionExpressionCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(DimensionExpressionCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

