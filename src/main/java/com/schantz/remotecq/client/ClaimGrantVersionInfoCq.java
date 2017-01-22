package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimGrantVersionInfoCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("transactionalStart")
  private OffsetDateTime transactionalStart = null;

  @JsonProperty("transactionalEnd")
  private OffsetDateTime transactionalEnd = null;

  @JsonProperty("claimGrantVersionIdCq")
  private ClaimGrantVersionIdCq claimGrantVersionIdCq = null;

  @JsonProperty("isCancelled")
  private Boolean isCancelled = false;

  @JsonProperty("isDraft")
  private Boolean isDraft = false;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public OffsetDateTime getTransactionalStart() {
    return transactionalStart;
  }

  public void setTransactionalStart(OffsetDateTime transactionalStart) {
    this.transactionalStart = transactionalStart;
  }

  public OffsetDateTime getTransactionalEnd() {
    return transactionalEnd;
  }

  public void setTransactionalEnd(OffsetDateTime transactionalEnd) {
    this.transactionalEnd = transactionalEnd;
  }

  public ClaimGrantVersionIdCq getClaimGrantVersionIdCq() {
    return claimGrantVersionIdCq;
  }

  public void setClaimGrantVersionIdCq(ClaimGrantVersionIdCq claimGrantVersionIdCq) {
    this.claimGrantVersionIdCq = claimGrantVersionIdCq;
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

