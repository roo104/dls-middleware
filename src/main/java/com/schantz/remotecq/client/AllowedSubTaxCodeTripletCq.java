package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedSubTaxCodeTripletCq implements Serializable {
  @JsonProperty("localValue")
  private SubTaxCodeSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private SubTaxCodeSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private SubTaxCodeSelectionFrameCq resolvedValue = null;


  public SubTaxCodeSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(SubTaxCodeSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public SubTaxCodeSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(SubTaxCodeSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public SubTaxCodeSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(SubTaxCodeSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

