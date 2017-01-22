package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementSelectionFrameCq implements Serializable {
  @JsonProperty("frameId")
  private String frameId = null;

  @JsonProperty("defaultOption")
  private AgreementIdCq defaultOption = null;

  @JsonProperty("optionCollection")
  private List<AgreementIdCq> optionCollection = new ArrayList<AgreementIdCq>();

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

  public AgreementIdCq getDefaultOption() {
    return defaultOption;
  }

  public void setDefaultOption(AgreementIdCq defaultOption) {
    this.defaultOption = defaultOption;
  }
  public TopAgreementSelectionFrameCq addOptionCollectionItem(AgreementIdCq optionCollectionItem) {
    this.optionCollection.add(optionCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getOptionCollection() {
    return optionCollection;
  }

  public void setOptionCollection(List<AgreementIdCq> optionCollection) {
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

