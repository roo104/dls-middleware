package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedBenefitTriggerEventTripletCq implements Serializable {
  @JsonProperty("localValue")
  private BenefitTriggerEventSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private BenefitTriggerEventSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private BenefitTriggerEventSelectionFrameCq resolvedValue = null;


  public BenefitTriggerEventSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(BenefitTriggerEventSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public BenefitTriggerEventSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(BenefitTriggerEventSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public BenefitTriggerEventSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(BenefitTriggerEventSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

