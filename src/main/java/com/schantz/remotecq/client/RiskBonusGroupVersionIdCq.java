package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusGroupVersionIdCq implements Serializable {
  @JsonProperty("riskBonusGroupVersionUid")
  private String riskBonusGroupVersionUid = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("riskBonusGroupIdCq")
  private RiskBonusGroupIdCq riskBonusGroupIdCq = null;

  @JsonProperty("isTerminated")
  private Boolean isTerminated = false;

  @JsonProperty("isCancelled")
  private Boolean isCancelled = false;

  @JsonProperty("isDraft")
  private Boolean isDraft = false;


  public String getRiskBonusGroupVersionUid() {
    return riskBonusGroupVersionUid;
  }

  public void setRiskBonusGroupVersionUid(String riskBonusGroupVersionUid) {
    this.riskBonusGroupVersionUid = riskBonusGroupVersionUid;
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

  public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
    return riskBonusGroupIdCq;
  }

  public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
    this.riskBonusGroupIdCq = riskBonusGroupIdCq;
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

