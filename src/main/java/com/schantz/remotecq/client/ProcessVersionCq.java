package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessVersionCq implements Serializable {
  @JsonProperty("startingPoint")
  private StartWfc2Cq startingPoint = null;

  @JsonProperty("configurationElementsCollection")
  private List<AbstractWfc2Cq> configurationElementsCollection = new ArrayList<AbstractWfc2Cq>();

  @JsonProperty("processCq")
  private ProcessCq processCq = null;

  @JsonProperty("processVersionInfoCq")
  private ProcessVersionInfoCq processVersionInfoCq = null;


  public StartWfc2Cq getStartingPoint() {
    return startingPoint;
  }

  public void setStartingPoint(StartWfc2Cq startingPoint) {
    this.startingPoint = startingPoint;
  }
  public ProcessVersionCq addConfigurationElementsCollectionItem(AbstractWfc2Cq configurationElementsCollectionItem) {
    this.configurationElementsCollection.add(configurationElementsCollectionItem);
    return this;
  }

  public List<AbstractWfc2Cq> getConfigurationElementsCollection() {
    return configurationElementsCollection;
  }

  public void setConfigurationElementsCollection(List<AbstractWfc2Cq> configurationElementsCollection) {
    this.configurationElementsCollection = configurationElementsCollection;
  }

  public ProcessCq getProcessCq() {
    return processCq;
  }

  public void setProcessCq(ProcessCq processCq) {
    this.processCq = processCq;
  }

  public ProcessVersionInfoCq getProcessVersionInfoCq() {
    return processVersionInfoCq;
  }

  public void setProcessVersionInfoCq(ProcessVersionInfoCq processVersionInfoCq) {
    this.processVersionInfoCq = processVersionInfoCq;
  }
}

