package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterSeriesCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type")
  private ParameterSeriesTypeCq type = null;

  @JsonProperty("id")
  private ParameterSeriesIdCq id = null;

  @JsonProperty("frequencyRule")
  private String frequencyRule = null;

  @JsonProperty("isAllowProjected")
  private Boolean isAllowProjected = false;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ParameterSeriesTypeCq getType() {
    return type;
  }

  public void setType(ParameterSeriesTypeCq type) {
    this.type = type;
  }

  public ParameterSeriesIdCq getId() {
    return id;
  }

  public void setId(ParameterSeriesIdCq id) {
    this.id = id;
  }

  public String getFrequencyRule() {
    return frequencyRule;
  }

  public void setFrequencyRule(String frequencyRule) {
    this.frequencyRule = frequencyRule;
  }

  public Boolean getIsAllowProjected() {
    return isAllowProjected;
  }

  public void setIsAllowProjected(Boolean isAllowProjected) {
    this.isAllowProjected = isAllowProjected;
  }
}

