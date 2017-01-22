package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EmployeeDetailsPolicyEntry implements Serializable {
  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("lifePolicyStatusCq")
  private String lifePolicyStatusCq = null;

  @JsonProperty("agreementTypeCq")
  private String agreementTypeCq = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;


  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public String getLifePolicyStatusCq() {
    return lifePolicyStatusCq;
  }

  public void setLifePolicyStatusCq(String lifePolicyStatusCq) {
    this.lifePolicyStatusCq = lifePolicyStatusCq;
  }

  public String getAgreementTypeCq() {
    return agreementTypeCq;
  }

  public void setAgreementTypeCq(String agreementTypeCq) {
    this.agreementTypeCq = agreementTypeCq;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }
}

