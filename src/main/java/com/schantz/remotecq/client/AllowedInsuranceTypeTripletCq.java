package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedInsuranceTypeTripletCq implements Serializable {
  @JsonProperty("localValue")
  private InsuranceTypeSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private InsuranceTypeSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private InsuranceTypeSelectionFrameCq resolvedValue = null;


  public InsuranceTypeSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(InsuranceTypeSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public InsuranceTypeSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(InsuranceTypeSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public InsuranceTypeSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(InsuranceTypeSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

