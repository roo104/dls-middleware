package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementRuleTripletCq implements Serializable {
  @JsonProperty("localValue")
  private AgreementRuleCq localValue = null;

  @JsonProperty("parentResolved")
  private AgreementRuleCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private AgreementRuleCq resolvedValue = null;


  public AgreementRuleCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(AgreementRuleCq localValue) {
    this.localValue = localValue;
  }

  public AgreementRuleCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(AgreementRuleCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public AgreementRuleCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(AgreementRuleCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

