package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CreateHealthFormCommand implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("validityNoOfPeriods")
  private Long validityNoOfPeriods = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("validityPeriodLength")
  private String validityPeriodLength = null;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getValidityNoOfPeriods() {
    return validityNoOfPeriods;
  }

  public void setValidityNoOfPeriods(Long validityNoOfPeriods) {
    this.validityNoOfPeriods = validityNoOfPeriods;
  }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public String getValidityPeriodLength() {
    return validityPeriodLength;
  }

  public void setValidityPeriodLength(String validityPeriodLength) {
    this.validityPeriodLength = validityPeriodLength;
  }
}

