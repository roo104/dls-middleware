package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class MergeCq implements Serializable {
  @JsonProperty("mergeDate")
  private LocalDate mergeDate = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("mergeId")
  private String mergeId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("sourceFundVersion")
  private FundVersionIdCq sourceFundVersion = null;

  @JsonProperty("targetFund")
  private FundIdCq targetFund = null;

  @JsonProperty("isTradeCommandsCreated")
  private Boolean isTradeCommandsCreated = false;


  public LocalDate getMergeDate() {
    return mergeDate;
  }

  public void setMergeDate(LocalDate mergeDate) {
    this.mergeDate = mergeDate;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getMergeId() {
    return mergeId;
  }

  public void setMergeId(String mergeId) {
    this.mergeId = mergeId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FundVersionIdCq getSourceFundVersion() {
    return sourceFundVersion;
  }

  public void setSourceFundVersion(FundVersionIdCq sourceFundVersion) {
    this.sourceFundVersion = sourceFundVersion;
  }

  public FundIdCq getTargetFund() {
    return targetFund;
  }

  public void setTargetFund(FundIdCq targetFund) {
    this.targetFund = targetFund;
  }

  public Boolean getIsTradeCommandsCreated() {
    return isTradeCommandsCreated;
  }

  public void setIsTradeCommandsCreated(Boolean isTradeCommandsCreated) {
    this.isTradeCommandsCreated = isTradeCommandsCreated;
  }
}

