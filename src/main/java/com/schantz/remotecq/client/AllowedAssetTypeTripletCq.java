package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedAssetTypeTripletCq implements Serializable {
  @JsonProperty("localValue")
  private AssetTypeSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private AssetTypeSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private AssetTypeSelectionFrameCq resolvedValue = null;


  public AssetTypeSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(AssetTypeSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public AssetTypeSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(AssetTypeSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public AssetTypeSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(AssetTypeSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
}

