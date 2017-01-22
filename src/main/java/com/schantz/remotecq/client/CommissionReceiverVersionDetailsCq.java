package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionReceiverVersionDetailsCq implements Serializable {
  @JsonProperty("cancelTime")
  private OffsetDateTime cancelTime = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("externReference")
  private String externReference = null;

  @JsonProperty("commissionRegulationIdCq")
  private CommissionRegulationIdCq commissionRegulationIdCq = null;

  @JsonProperty("commissionReceiverVersionIdCq")
  private CommissionReceiverVersionIdCq commissionReceiverVersionIdCq = null;

  @JsonProperty("commissionReceiverIdCq")
  private CommissionReceiverIdCq commissionReceiverIdCq = null;

  @JsonProperty("isCancelled")
  private Boolean isCancelled = false;

  @JsonProperty("isActive")
  private Boolean isActive = false;

  @JsonProperty("isDraft")
  private Boolean isDraft = false;


  public OffsetDateTime getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(OffsetDateTime cancelTime) {
    this.cancelTime = cancelTime;
  }

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

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getExternReference() {
    return externReference;
  }

  public void setExternReference(String externReference) {
    this.externReference = externReference;
  }

  public CommissionRegulationIdCq getCommissionRegulationIdCq() {
    return commissionRegulationIdCq;
  }

  public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
    this.commissionRegulationIdCq = commissionRegulationIdCq;
  }

  public CommissionReceiverVersionIdCq getCommissionReceiverVersionIdCq() {
    return commissionReceiverVersionIdCq;
  }

  public void setCommissionReceiverVersionIdCq(CommissionReceiverVersionIdCq commissionReceiverVersionIdCq) {
    this.commissionReceiverVersionIdCq = commissionReceiverVersionIdCq;
  }

  public CommissionReceiverIdCq getCommissionReceiverIdCq() {
    return commissionReceiverIdCq;
  }

  public void setCommissionReceiverIdCq(CommissionReceiverIdCq commissionReceiverIdCq) {
    this.commissionReceiverIdCq = commissionReceiverIdCq;
  }

  public Boolean getIsCancelled() {
    return isCancelled;
  }

  public void setIsCancelled(Boolean isCancelled) {
    this.isCancelled = isCancelled;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }
}

