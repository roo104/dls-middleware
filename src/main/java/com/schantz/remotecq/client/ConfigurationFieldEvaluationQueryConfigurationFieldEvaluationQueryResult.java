package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ConfigurationFieldEvaluationQueryConfigurationFieldEvaluationQueryResult implements Serializable {
  @JsonProperty("configurationFieldCqCollection")
  private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();

  @JsonProperty("evaluationContextCq")
  private EvaluationContextCq evaluationContextCq = null;

  public ConfigurationFieldEvaluationQueryConfigurationFieldEvaluationQueryResult addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
    this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
    return this;
  }

  public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
    return configurationFieldCqCollection;
  }

  public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
    this.configurationFieldCqCollection = configurationFieldCqCollection;
  }

  public EvaluationContextCq getEvaluationContextCq() {
    return evaluationContextCq;
  }

  public void setEvaluationContextCq(EvaluationContextCq evaluationContextCq) {
    this.evaluationContextCq = evaluationContextCq;
  }
}

