package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedCalculationFoundationDimensionTripletCq implements Serializable {
  @JsonProperty("localValue")
  private CalculationFoundationDimensionSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private CalculationFoundationDimensionSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private CalculationFoundationDimensionSelectionFrameCq resolvedValue = null;


  public CalculationFoundationDimensionSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(CalculationFoundationDimensionSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public CalculationFoundationDimensionSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(CalculationFoundationDimensionSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public CalculationFoundationDimensionSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(CalculationFoundationDimensionSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

