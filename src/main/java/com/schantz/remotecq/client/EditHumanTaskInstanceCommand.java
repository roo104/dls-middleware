package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditHumanTaskInstanceCommand implements Serializable {
  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;

  @JsonProperty("configurationFieldCqCollection")
  private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();


  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }
  public EditHumanTaskInstanceCommand addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
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

