package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditProcessVersionCommand implements Serializable {
  @JsonProperty("configurationFieldTypeCqCollection")
  private List<ConfigurationFieldTypeCq> configurationFieldTypeCqCollection = new ArrayList<ConfigurationFieldTypeCq>();

  public EditProcessVersionCommand addConfigurationFieldTypeCqCollectionItem(ConfigurationFieldTypeCq configurationFieldTypeCqCollectionItem) {
    this.configurationFieldTypeCqCollection.add(configurationFieldTypeCqCollectionItem);
    return this;
  }

  public List<ConfigurationFieldTypeCq> getConfigurationFieldTypeCqCollection() {
    return configurationFieldTypeCqCollection;
  }

  public void setConfigurationFieldTypeCqCollection(List<ConfigurationFieldTypeCq> configurationFieldTypeCqCollection) {
    this.configurationFieldTypeCqCollection = configurationFieldTypeCqCollection;
  }
}

