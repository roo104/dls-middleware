package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ConfigurationFieldTypeCq implements Serializable {
  @JsonProperty("configurationFieldTypeIdCq")
  private ConfigurationFieldTypeIdCq configurationFieldTypeIdCq = null;


  public ConfigurationFieldTypeIdCq getConfigurationFieldTypeIdCq() {
    return configurationFieldTypeIdCq;
  }

  public void setConfigurationFieldTypeIdCq(ConfigurationFieldTypeIdCq configurationFieldTypeIdCq) {
    this.configurationFieldTypeIdCq = configurationFieldTypeIdCq;
  }
}

