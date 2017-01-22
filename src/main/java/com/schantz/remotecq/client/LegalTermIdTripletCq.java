package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LegalTermIdTripletCq implements Serializable {
  @JsonProperty("localValue")
  private LegalTermIdCq localValue = null;

  @JsonProperty("parentResolved")
  private LegalTermIdCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private LegalTermIdCq resolvedValue = null;


  public LegalTermIdCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(LegalTermIdCq localValue) {
    this.localValue = localValue;
  }

  public LegalTermIdCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(LegalTermIdCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public LegalTermIdCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(LegalTermIdCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

