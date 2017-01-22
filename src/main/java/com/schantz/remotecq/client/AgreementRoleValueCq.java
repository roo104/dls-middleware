package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementRoleValueCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("cancelTime")
  private OffsetDateTime cancelTime = null;

  @JsonProperty("cancelUser")
  private String cancelUser = null;

  @JsonProperty("agreementRoleValueIdCq")
  private AgreementRoleValueIdCq agreementRoleValueIdCq = null;


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
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

  public OffsetDateTime getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(OffsetDateTime cancelTime) {
    this.cancelTime = cancelTime;
  }

  public String getCancelUser() {
    return cancelUser;
  }

  public void setCancelUser(String cancelUser) {
    this.cancelUser = cancelUser;
  }

  public AgreementRoleValueIdCq getAgreementRoleValueIdCq() {
    return agreementRoleValueIdCq;
  }

  public void setAgreementRoleValueIdCq(AgreementRoleValueIdCq agreementRoleValueIdCq) {
    this.agreementRoleValueIdCq = agreementRoleValueIdCq;
  }
}

