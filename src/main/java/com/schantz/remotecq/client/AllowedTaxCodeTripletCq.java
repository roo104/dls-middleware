package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedTaxCodeTripletCq implements Serializable {
  @JsonProperty("localValue")
  private TaxCodeSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private TaxCodeSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private TaxCodeSelectionFrameCq resolvedValue = null;


  public TaxCodeSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(TaxCodeSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public TaxCodeSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(TaxCodeSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public TaxCodeSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(TaxCodeSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

