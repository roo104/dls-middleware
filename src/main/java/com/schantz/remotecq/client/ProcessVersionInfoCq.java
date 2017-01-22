package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessVersionInfoCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("transactionalStart")
  private OffsetDateTime transactionalStart = null;

  @JsonProperty("transactionalEnd")
  private OffsetDateTime transactionalEnd = null;

  @JsonProperty("draft")
  private Boolean draft = false;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("processVersionIdCq")
  private ProcessVersionIdCq processVersionIdCq = null;


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

  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProcessVersionIdCq getProcessVersionIdCq() {
    return processVersionIdCq;
  }

  public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
    this.processVersionIdCq = processVersionIdCq;
  }
}

