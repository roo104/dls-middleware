package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class StartableProcessCq implements Serializable {
  @JsonProperty("processVersionIdCq")
  private ProcessVersionIdCq processVersionIdCq = null;

  @JsonProperty("configurationFieldCqCollection")
  private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();


  public ProcessVersionIdCq getProcessVersionIdCq() {
    return processVersionIdCq;
  }

  public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
    this.processVersionIdCq = processVersionIdCq;
  }
  public StartableProcessCq addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
    this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
    return this;
  }

  public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
    return configurationFieldCqCollection;
  }

  public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
    this.configurationFieldCqCollection = configurationFieldCqCollection;
  }
}

