package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementSearchEntry implements Serializable {
  @JsonProperty("agreementTypeCq")
  private String agreementTypeCq = null;

  @JsonProperty("defaultToShow")
  private AgreementVersionIdCq defaultToShow = null;

  @JsonProperty("agreementStateCq")
  private String agreementStateCq = null;

  @JsonProperty("agreementSearchTypeCq")
  private String agreementSearchTypeCq = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("policiesOnAgreementStateCq")
  private String policiesOnAgreementStateCq = null;

  @JsonProperty("periodLength")
  private String periodLength = null;


  public String getAgreementTypeCq() {
    return agreementTypeCq;
  }

  public void setAgreementTypeCq(String agreementTypeCq) {
    this.agreementTypeCq = agreementTypeCq;
  }

  public AgreementVersionIdCq getDefaultToShow() {
    return defaultToShow;
  }

  public void setDefaultToShow(AgreementVersionIdCq defaultToShow) {
    this.defaultToShow = defaultToShow;
  }

  public String getAgreementStateCq() {
    return agreementStateCq;
  }

  public void setAgreementStateCq(String agreementStateCq) {
    this.agreementStateCq = agreementStateCq;
  }

  public String getAgreementSearchTypeCq() {
    return agreementSearchTypeCq;
  }

  public void setAgreementSearchTypeCq(String agreementSearchTypeCq) {
    this.agreementSearchTypeCq = agreementSearchTypeCq;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }

  public String getPoliciesOnAgreementStateCq() {
    return policiesOnAgreementStateCq;
  }

  public void setPoliciesOnAgreementStateCq(String policiesOnAgreementStateCq) {
    this.policiesOnAgreementStateCq = policiesOnAgreementStateCq;
  }

  public String getPeriodLength() {
    return periodLength;
  }

  public void setPeriodLength(String periodLength) {
    this.periodLength = periodLength;
  }
}

