package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class BeneficiarySummaryEntryCq implements Serializable {
  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("share")
  private Double share = null;

  @JsonProperty("specText")
  private String specText = null;

  @JsonProperty("unretractable")
  private Boolean unretractable = false;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("beneficiaryTypeCq")
  private String beneficiaryTypeCq = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;


  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Double getShare() {
    return share;
  }

  public void setShare(Double share) {
    this.share = share;
  }

  public String getSpecText() {
    return specText;
  }

  public void setSpecText(String specText) {
    this.specText = specText;
  }

  public Boolean getUnretractable() {
    return unretractable;
  }

  public void setUnretractable(Boolean unretractable) {
    this.unretractable = unretractable;
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

  public String getBeneficiaryTypeCq() {
    return beneficiaryTypeCq;
  }

  public void setBeneficiaryTypeCq(String beneficiaryTypeCq) {
    this.beneficiaryTypeCq = beneficiaryTypeCq;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }
}

