package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class MultiProcessInstanceStateCommand implements Serializable {
  @JsonProperty("processInstanceStateCommandCollection")
  private List<ProcessInstanceStateCommand> processInstanceStateCommandCollection = new ArrayList<ProcessInstanceStateCommand>();

  public MultiProcessInstanceStateCommand addProcessInstanceStateCommandCollectionItem(ProcessInstanceStateCommand processInstanceStateCommandCollectionItem) {
    this.processInstanceStateCommandCollection.add(processInstanceStateCommandCollectionItem);
    return this;
  }

  public List<ProcessInstanceStateCommand> getProcessInstanceStateCommandCollection() {
    return processInstanceStateCommandCollection;
  }

  public void setProcessInstanceStateCommandCollection(List<ProcessInstanceStateCommand> processInstanceStateCommandCollection) {
    this.processInstanceStateCommandCollection = processInstanceStateCommandCollection;
  }
}

