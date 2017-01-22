package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactAssessmentOrderSummaryCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("draftName")
  private String draftName = null;

  @JsonProperty("autochangedAgreements")
  private Long autochangedAgreements = null;

  @JsonProperty("unchangedAgreements")
  private Long unchangedAgreements = null;

  @JsonProperty("invalidAgreements")
  private Long invalidAgreements = null;

  @JsonProperty("failedAgreemnts")
  private Long failedAgreemnts = null;

  @JsonProperty("autochangedPolicies")
  private Long autochangedPolicies = null;

  @JsonProperty("calculationChangePolicies")
  private Long calculationChangePolicies = null;

  @JsonProperty("failedPolicies")
  private Long failedPolicies = null;

  @JsonProperty("invalidPolicies")
  private Long invalidPolicies = null;

  @JsonProperty("skippedPolicies")
  private Long skippedPolicies = null;

  @JsonProperty("unchangedPolicies")
  private Long unchangedPolicies = null;

  @JsonProperty("impactAssessmentIdCq")
  private ImpactAssessmentIdCq impactAssessmentIdCq = null;

  @JsonProperty("agreementVersionIdCq")
  private AgreementVersionIdCq agreementVersionIdCq = null;

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

  public Long getAutochangedAgreements() {
    return autochangedAgreements;
  }

  public void setAutochangedAgreements(Long autochangedAgreements) {
    this.autochangedAgreements = autochangedAgreements;
  }

  public Long getUnchangedAgreements() {
    return unchangedAgreements;
  }

  public void setUnchangedAgreements(Long unchangedAgreements) {
    this.unchangedAgreements = unchangedAgreements;
  }

  public Long getInvalidAgreements() {
    return invalidAgreements;
  }

  public void setInvalidAgreements(Long invalidAgreements) {
    this.invalidAgreements = invalidAgreements;
  }

  public Long getFailedAgreemnts() {
    return failedAgreemnts;
  }

  public void setFailedAgreemnts(Long failedAgreemnts) {
    this.failedAgreemnts = failedAgreemnts;
  }

  public Long getAutochangedPolicies() {
    return autochangedPolicies;
  }

  public void setAutochangedPolicies(Long autochangedPolicies) {
    this.autochangedPolicies = autochangedPolicies;
  }

  public Long getCalculationChangePolicies() {
    return calculationChangePolicies;
  }

  public void setCalculationChangePolicies(Long calculationChangePolicies) {
    this.calculationChangePolicies = calculationChangePolicies;
  }

  public Long getFailedPolicies() {
    return failedPolicies;
  }

  public void setFailedPolicies(Long failedPolicies) {
    this.failedPolicies = failedPolicies;
  }

  public Long getInvalidPolicies() {
    return invalidPolicies;
  }

  public void setInvalidPolicies(Long invalidPolicies) {
    this.invalidPolicies = invalidPolicies;
  }

  public Long getSkippedPolicies() {
    return skippedPolicies;
  }

  public void setSkippedPolicies(Long skippedPolicies) {
    this.skippedPolicies = skippedPolicies;
  }

  public Long getUnchangedPolicies() {
    return unchangedPolicies;
  }

  public void setUnchangedPolicies(Long unchangedPolicies) {
    this.unchangedPolicies = unchangedPolicies;
  }

  public ImpactAssessmentIdCq getImpactAssessmentIdCq() {
    return impactAssessmentIdCq;
  }

  public void setImpactAssessmentIdCq(ImpactAssessmentIdCq impactAssessmentIdCq) {
    this.impactAssessmentIdCq = impactAssessmentIdCq;
  }

  public AgreementVersionIdCq getAgreementVersionIdCq() {
    return agreementVersionIdCq;
  }

  public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
    this.agreementVersionIdCq = agreementVersionIdCq;
  }

  public String getAssessmentStatus() {
    return assessmentStatus;
  }

  public void setAssessmentStatus(String assessmentStatus) {
    this.assessmentStatus = assessmentStatus;
  }
}

