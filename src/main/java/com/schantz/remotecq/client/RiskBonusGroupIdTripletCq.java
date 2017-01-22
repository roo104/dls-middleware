package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusGroupIdTripletCq implements Serializable {
  @JsonProperty("localValue")
  private RiskBonusGroupIdCq localValue = null;

  @JsonProperty("parentResolved")
  private RiskBonusGroupIdCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private RiskBonusGroupIdCq resolvedValue = null;


  public RiskBonusGroupIdCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(RiskBonusGroupIdCq localValue) {
    this.localValue = localValue;
  }

  public RiskBonusGroupIdCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(RiskBonusGroupIdCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public RiskBonusGroupIdCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(RiskBonusGroupIdCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

