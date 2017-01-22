package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class OnHoldCq implements Serializable {
  @JsonProperty("onHold")
  private Boolean onHold = false;

  @JsonProperty("creationTime")
  private OffsetDateTime creationTime = null;

  @JsonProperty("creationUser")
  private String creationUser = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("endUser")
  private String endUser = null;

  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("onHoldReason")
  private NoticeCq onHoldReason = null;

  @JsonProperty("onHoldTypeCq")
  private String onHoldTypeCq = null;

  @JsonProperty("onHoldReasonTypeCq")
  private String onHoldReasonTypeCq = null;

  @JsonProperty("onHoldLevelCq")
  private OnHoldLevelCq onHoldLevelCq = null;

  @JsonProperty("endOnHoldReason")
  private NoticeCq endOnHoldReason = null;


  public Boolean getOnHold() {
    return onHold;
  }

  public void setOnHold(Boolean onHold) {
    this.onHold = onHold;
  }

  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public String getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(String creationUser) {
    this.creationUser = creationUser;
  }

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public String getEndUser() {
    return endUser;
  }

  public void setEndUser(String endUser) {
    this.endUser = endUser;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public NoticeCq getOnHoldReason() {
    return onHoldReason;
  }

  public void setOnHoldReason(NoticeCq onHoldReason) {
    this.onHoldReason = onHoldReason;
  }

  public String getOnHoldTypeCq() {
    return onHoldTypeCq;
  }

  public void setOnHoldTypeCq(String onHoldTypeCq) {
    this.onHoldTypeCq = onHoldTypeCq;
  }

  public String getOnHoldReasonTypeCq() {
    return onHoldReasonTypeCq;
  }

  public void setOnHoldReasonTypeCq(String onHoldReasonTypeCq) {
    this.onHoldReasonTypeCq = onHoldReasonTypeCq;
  }

  public OnHoldLevelCq getOnHoldLevelCq() {
    return onHoldLevelCq;
  }

  public void setOnHoldLevelCq(OnHoldLevelCq onHoldLevelCq) {
    this.onHoldLevelCq = onHoldLevelCq;
  }

  public NoticeCq getEndOnHoldReason() {
    return endOnHoldReason;
  }

  public void setEndOnHoldReason(NoticeCq endOnHoldReason) {
    this.endOnHoldReason = endOnHoldReason;
  }
}

