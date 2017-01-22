package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactAssessmentOrderCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("draftName")
  private String draftName = null;

  @JsonProperty("agreementVersionIdCq")
  private AgreementVersionIdCq agreementVersionIdCq = null;

  @JsonProperty("impactAssessmentCq")
  private ImpactAssessmentCq impactAssessmentCq = null;

  @JsonProperty("assessmentStatus")
  private String assessmentStatus = null;


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

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getDraftName() {
    return draftName;
  }

  public void setDraftName(String draftName) {
    this.draftName = draftName;
  }

  public AgreementVersionIdCq getAgreementVersionIdCq() {
    return agreementVersionIdCq;
  }

  public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
    this.agreementVersionIdCq = agreementVersionIdCq;
  }

  public ImpactAssessmentCq getImpactAssessmentCq() {
    return impactAssessmentCq;
  }

  public void setImpactAssessmentCq(ImpactAssessmentCq impactAssessmentCq) {
    this.impactAssessmentCq = impactAssessmentCq;
  }

  public String getAssessmentStatus() {
    return assessmentStatus;
  }

  public void setAssessmentStatus(String assessmentStatus) {
    this.assessmentStatus = assessmentStatus;
  }
}

