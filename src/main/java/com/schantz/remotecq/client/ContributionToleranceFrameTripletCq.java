package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionToleranceFrameTripletCq implements Serializable {
  @JsonProperty("localValue")
  private ContributionToleranceFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private ContributionToleranceFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private ContributionToleranceFrameCq resolvedValue = null;


  public ContributionToleranceFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(ContributionToleranceFrameCq localValue) {
    this.localValue = localValue;
  }

  public ContributionToleranceFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(ContributionToleranceFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public ContributionToleranceFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(ContributionToleranceFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

