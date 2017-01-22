package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioRuleFrameSelectionFrameCq implements Serializable {
  @JsonProperty("frameId")
  private String frameId = null;

  @JsonProperty("defaultOption")
  private PortfolioRuleFrameIdCq defaultOption = null;

  @JsonProperty("optionCollection")
  private List<PortfolioRuleFrameIdCq> optionCollection = new ArrayList<PortfolioRuleFrameIdCq>();

  @JsonProperty("extraPortfolioRuleFrameCollection")
  private List<PortfolioRuleFrameIdCq> extraPortfolioRuleFrameCollection = new ArrayList<PortfolioRuleFrameIdCq>();

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

  public PortfolioRuleFrameIdCq getDefaultOption() {
    return defaultOption;
  }

  public void setDefaultOption(PortfolioRuleFrameIdCq defaultOption) {
    this.defaultOption = defaultOption;
  }
  public PortfolioRuleFrameSelectionFrameCq addOptionCollectionItem(PortfolioRuleFrameIdCq optionCollectionItem) {
    this.optionCollection.add(optionCollectionItem);
    return this;
  }

  public List<PortfolioRuleFrameIdCq> getOptionCollection() {
    return optionCollection;
  }

  public void setOptionCollection(List<PortfolioRuleFrameIdCq> optionCollection) {
    this.optionCollection = optionCollection;
  }
  public PortfolioRuleFrameSelectionFrameCq addExtraPortfolioRuleFrameCollectionItem(PortfolioRuleFrameIdCq extraPortfolioRuleFrameCollectionItem) {
    this.extraPortfolioRuleFrameCollection.add(extraPortfolioRuleFrameCollectionItem);
    return this;
  }

  public List<PortfolioRuleFrameIdCq> getExtraPortfolioRuleFrameCollection() {
    return extraPortfolioRuleFrameCollection;
  }

  public void setExtraPortfolioRuleFrameCollection(List<PortfolioRuleFrameIdCq> extraPortfolioRuleFrameCollection) {
    this.extraPortfolioRuleFrameCollection = extraPortfolioRuleFrameCollection;
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

