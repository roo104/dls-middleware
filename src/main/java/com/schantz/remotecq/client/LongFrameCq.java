package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LongFrameCq implements Serializable {
  @JsonProperty("frameId")
  private String frameId = null;

  @JsonProperty("defaultValue")
  private Long defaultValue = null;

  @JsonProperty("minValue")
  private Long minValue = null;

  @JsonProperty("maxValue")
  private Long maxValue = null;

  @JsonProperty("isMandatory")
  private Boolean isMandatory = false;


  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public Long getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Long getMinValue() {
    return minValue;
  }

  public void setMinValue(Long minValue) {
    this.minValue = minValue;
  }

  public Long getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Long maxValue) {
    this.maxValue = maxValue;
  }

  public Boolean getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }
}

