package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AbsAmountFrameCq implements Serializable {
  @JsonProperty("frameId")
  private String frameId = null;

  @JsonProperty("defaultValue")
  private Double defaultValue = null;

  @JsonProperty("minValue")
  private Double minValue = null;

  @JsonProperty("maxValue")
  private Double maxValue = null;

  @JsonProperty("isMandatory")
  private Boolean isMandatory = false;


  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public Double getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Double defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public Boolean getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }
}

