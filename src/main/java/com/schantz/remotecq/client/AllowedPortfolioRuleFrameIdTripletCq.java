package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AllowedPortfolioRuleFrameIdTripletCq implements Serializable {
  @JsonProperty("localValue")
  private PortfolioRuleFrameSelectionFrameCq localValue = null;

  @JsonProperty("parentResolved")
  private PortfolioRuleFrameSelectionFrameCq parentResolved = null;

  @JsonProperty("resolvedValue")
  private PortfolioRuleFrameSelectionFrameCq resolvedValue = null;

  @JsonProperty("availableSpecialPortfolioRuleFramesCollection")
  private List<PortfolioRuleFrameIdCq> availableSpecialPortfolioRuleFramesCollection = new ArrayList<PortfolioRuleFrameIdCq>();

  @JsonProperty("availablePortfolioRuleFramesCollection")
  private List<PortfolioRuleFrameIdCq> availablePortfolioRuleFramesCollection = new ArrayList<PortfolioRuleFrameIdCq>();


  public PortfolioRuleFrameSelectionFrameCq getLocalValue() {
    return localValue;
  }

  public void setLocalValue(PortfolioRuleFrameSelectionFrameCq localValue) {
    this.localValue = localValue;
  }

  public PortfolioRuleFrameSelectionFrameCq getParentResolved() {
    return parentResolved;
  }

  public void setParentResolved(PortfolioRuleFrameSelectionFrameCq parentResolved) {
    this.parentResolved = parentResolved;
  }

  public PortfolioRuleFrameSelectionFrameCq getResolvedValue() {
    return resolvedValue;
  }

  public void setResolvedValue(PortfolioRuleFrameSelectionFrameCq resolvedValue) {
    this.resolvedValue = resolvedValue;
  }
  public AllowedPortfolioRuleFrameIdTripletCq addAvailableSpecialPortfolioRuleFramesCollectionItem(PortfolioRuleFrameIdCq availableSpecialPortfolioRuleFramesCollectionItem) {
    this.availableSpecialPortfolioRuleFramesCollection.add(availableSpecialPortfolioRuleFramesCollectionItem);
    return this;
  }

  public List<PortfolioRuleFrameIdCq> getAvailableSpecialPortfolioRuleFramesCollection() {
    return availableSpecialPortfolioRuleFramesCollection;
  }

  public void setAvailableSpecialPortfolioRuleFramesCollection(List<PortfolioRuleFrameIdCq> availableSpecialPortfolioRuleFramesCollection) {
    this.availableSpecialPortfolioRuleFramesCollection = availableSpecialPortfolioRuleFramesCollection;
  }
  public AllowedPortfolioRuleFrameIdTripletCq addAvailablePortfolioRuleFramesCollectionItem(PortfolioRuleFrameIdCq availablePortfolioRuleFramesCollectionItem) {
    this.availablePortfolioRuleFramesCollection.add(availablePortfolioRuleFramesCollectionItem);
    return this;
  }

  public List<PortfolioRuleFrameIdCq> getAvailablePortfolioRuleFramesCollection() {
    return availablePortfolioRuleFramesCollection;
  }

  public void setAvailablePortfolioRuleFramesCollection(List<PortfolioRuleFrameIdCq> availablePortfolioRuleFramesCollection) {
    this.availablePortfolioRuleFramesCollection = availablePortfolioRuleFramesCollection;
  }
}

