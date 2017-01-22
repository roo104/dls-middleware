package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AmountFrameTripletCq implements Serializable {
  @JsonProperty("localValue")
  private AmountFrameCqObject localValue = null;

  @JsonProperty("parentResolved")
  private AmountFrameCqObject parentResolved = null;

  @JsonProperty("resolvedValue")
  private AmountFrameCqObject resolvedValue = null;


  public AmountFrameCqObject getLocalValue() {
    return localValue;
  }

  public void setLocalValue(AmountFrameCqObject localValue) {
    this.localValue = localValue;
  }

  public AmountFrameCqObject getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(AmountFrameCqObject parentResolved) {
    this.parentResolved = parentResolved;
  }

  public AmountFrameCqObject getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(AmountFrameCqObject resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

