package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupVersionIdCq implements Serializable {
  @JsonProperty("healthGroupVersionUid")
  private String healthGroupVersionUid = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("healthGroupIdCq")
  private HealthGroupIdCq healthGroupIdCq = null;

  @JsonProperty("isTerminated")
  private Boolean isTerminated = false;

  @JsonProperty("isCancelled")
  private Boolean isCancelled = false;

  @JsonProperty("isDraft")
  private Boolean isDraft = false;


  public String getHealthGroupVersionUid() {
    return healthGroupVersionUid;
  }

  public void setHealthGroupVersionUid(String healthGroupVersionUid) {
    this.healthGroupVersionUid = healthGroupVersionUid;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public HealthGroupIdCq getHealthGroupIdCq() {
    return healthGroupIdCq;
  }

  public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
    this.healthGroupIdCq = healthGroupIdCq;
  }

  public Boolean getIsTerminated() {
    return isTerminated;
  }

  public void setIsTerminated(Boolean isTerminated) {
    this.isTerminated = isTerminated;
  }

  public Boolean getIsCancelled() {
    return isCancelled;
  }

  public void setIsCancelled(Boolean isCancelled) {
    this.isCancelled = isCancelled;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }
}

