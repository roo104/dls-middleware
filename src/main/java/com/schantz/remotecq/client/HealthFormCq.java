package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthFormCq implements Serializable {
  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("validityNoOfPeriods")
  private Long validityNoOfPeriods = null;

  @JsonProperty("healthFormId")
  private HealthFormIdCq healthFormId = null;

  @JsonProperty("validityNoOfPeriodLenght")
  private String validityNoOfPeriodLenght = null;


  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Long getValidityNoOfPeriods() {
    return validityNoOfPeriods;
  }

  public void setValidityNoOfPeriods(Long validityNoOfPeriods) {
    this.validityNoOfPeriods = validityNoOfPeriods;
  }

  public HealthFormIdCq getHealthFormId() {
    return healthFormId;
  }

  public void setHealthFormId(HealthFormIdCq healthFormId) {
    this.healthFormId = healthFormId;
  }

  public String getValidityNoOfPeriodLenght() {
    return validityNoOfPeriodLenght;
  }

  public void setValidityNoOfPeriodLenght(String validityNoOfPeriodLenght) {
    this.validityNoOfPeriodLenght = validityNoOfPeriodLenght;
  }
}

