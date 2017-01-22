package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TimeSpecFrameCq implements Serializable {
  @JsonProperty("frameId")
  private String frameId = null;

  @JsonProperty("noOfPeriods")
  private TimeFrameCq noOfPeriods = null;

  @JsonProperty("startAge")
  private TimeFrameCq startAge = null;

  @JsonProperty("endAge")
  private TimeFrameCq endAge = null;

  @JsonProperty("isMandatory")
  private Boolean isMandatory = false;


  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public TimeFrameCq getNoOfPeriods() {
    return noOfPeriods;
  }

  public void setNoOfPeriods(TimeFrameCq noOfPeriods) {
    this.noOfPeriods = noOfPeriods;
  }

  public TimeFrameCq getStartAge() {
    return startAge;
  }

  public void setStartAge(TimeFrameCq startAge) {
    this.startAge = startAge;
  }

  public TimeFrameCq getEndAge() {
    return endAge;
  }

  public void setEndAge(TimeFrameCq endAge) {
    this.endAge = endAge;
  }

  public Boolean getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }
}

