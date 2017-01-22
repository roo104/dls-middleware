package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessCq implements Serializable {
  @JsonProperty("currentVersionHistoryCollection")
  private List<ProcessVersionInfoCq> currentVersionHistoryCollection = new ArrayList<ProcessVersionInfoCq>();

  @JsonProperty("processIdCq")
  private ProcessIdCq processIdCq = null;

  public ProcessCq addCurrentVersionHistoryCollectionItem(ProcessVersionInfoCq currentVersionHistoryCollectionItem) {
    this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
    return this;
  }

  public List<ProcessVersionInfoCq> getCurrentVersionHistoryCollection() {
    return currentVersionHistoryCollection;
  }

  public void setCurrentVersionHistoryCollection(List<ProcessVersionInfoCq> currentVersionHistoryCollection) {
    this.currentVersionHistoryCollection = currentVersionHistoryCollection;
  }

  public ProcessIdCq getProcessIdCq() {
    return processIdCq;
  }

  public void setProcessIdCq(ProcessIdCq processIdCq) {
    this.processIdCq = processIdCq;
  }
}

