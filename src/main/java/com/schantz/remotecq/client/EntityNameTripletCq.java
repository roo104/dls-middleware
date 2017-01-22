package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EntityNameTripletCq implements Serializable {
  @JsonProperty("localValue")
  private EntityNameCq localValue = null;

  @JsonProperty("parentResolved")
  private EntityNameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private EntityNameCq resolvedValue = null;


  public EntityNameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(EntityNameCq localValue) {
    this.localValue = localValue;
  }

  public EntityNameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(EntityNameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public EntityNameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(EntityNameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

