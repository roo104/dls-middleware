package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class DateTripletCq implements Serializable {
  @JsonProperty("localValue")
  private LocalDate localValue = null;

  @JsonProperty("parentResolved")
  private LocalDate parentResolved = null;

  @JsonProperty("resolvedValue")
  private LocalDate resolvedValue = null;


  public LocalDate getLocalValue() {
    return localValue;
  }

  public void setLocalValue(LocalDate localValue) {
    this.localValue = localValue;
  }

  public LocalDate getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(LocalDate parentResolved) {
    this.parentResolved = parentResolved;
  }

  public LocalDate getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(LocalDate resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

