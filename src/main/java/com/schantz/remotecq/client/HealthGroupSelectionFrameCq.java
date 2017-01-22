package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupSelectionFrameCq implements Serializable {
  @JsonProperty("frameId")
  private String frameId = null;

  @JsonProperty("defaultOption")
  private HealthGroupIdCq defaultOption = null;

  @JsonProperty("optionCollection")
  private List<HealthGroupIdCq> optionCollection = new ArrayList<HealthGroupIdCq>();

  @JsonProperty("isAllowEmpty")
  private Boolean isAllowEmpty = false;

  @JsonProperty("isMandatory")
  private Boolean isMandatory = false;


  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public HealthGroupIdCq getDefaultOption() {
    return defaultOption;
  }

  public void setDefaultOption(HealthGroupIdCq defaultOption) {
    this.defaultOption = defaultOption;
  }
  public HealthGroupSelectionFrameCq addOptionCollectionItem(HealthGroupIdCq optionCollectionItem) {
    this.optionCollection.add(optionCollectionItem);
    return this;
  }

  public List<HealthGroupIdCq> getOptionCollection() {
    return optionCollection;
  }

  public void setOptionCollection(List<HealthGroupIdCq> optionCollection) {
    this.optionCollection = optionCollection;
  }

  public Boolean getIsAllowEmpty() {
    return isAllowEmpty;
  }

  public void setIsAllowEmpty(Boolean isAllowEmpty) {
    this.isAllowEmpty = isAllowEmpty;
  }

  public Boolean getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }
}

