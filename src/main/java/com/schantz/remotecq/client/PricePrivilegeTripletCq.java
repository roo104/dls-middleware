package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PricePrivilegeTripletCq implements Serializable {
  @JsonProperty("localValue")
  private PricePrivilgeCq localValue = null;

  @JsonProperty("parentResolved")
  private PricePrivilgeCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PricePrivilgeCq resolvedValue = null;


  public PricePrivilgeCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PricePrivilgeCq localValue) {
    this.localValue = localValue;
  }

  public PricePrivilgeCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PricePrivilgeCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PricePrivilgeCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PricePrivilgeCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

