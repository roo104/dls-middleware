package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TaxContributionCq implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("year")
  private Long year = null;

  @JsonProperty("premium")
  private Long premium = null;

  @JsonProperty("taxIdNumber")
  private String taxIdNumber = null;

  @JsonProperty("ownerStatusCode")
  private String ownerStatusCode = null;

  @JsonProperty("correctionCode")
  private String correctionCode = null;

  @JsonProperty("taxReportingCode")
  private String taxReportingCode = null;

  @JsonProperty("isCompanyPaid")
  private Boolean isCompanyPaid = false;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public Long getPremium() {
    return premium;
  }

  public void setPremium(Long premium) {
    this.premium = premium;
  }

  public String getTaxIdNumber() {
    return taxIdNumber;
  }

  public void setTaxIdNumber(String taxIdNumber) {
    this.taxIdNumber = taxIdNumber;
  }

  public String getOwnerStatusCode() {
    return ownerStatusCode;
  }

  public void setOwnerStatusCode(String ownerStatusCode) {
    this.ownerStatusCode = ownerStatusCode;
  }

  public String getCorrectionCode() {
    return correctionCode;
  }

  public void setCorrectionCode(String correctionCode) {
    this.correctionCode = correctionCode;
  }

  public String getTaxReportingCode() {
    return taxReportingCode;
  }

  public void setTaxReportingCode(String taxReportingCode) {
    this.taxReportingCode = taxReportingCode;
  }

  public Boolean getIsCompanyPaid() {
    return isCompanyPaid;
  }

  public void setIsCompanyPaid(Boolean isCompanyPaid) {
    this.isCompanyPaid = isCompanyPaid;
  }
}

