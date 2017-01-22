package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsChangeAgreementCommand implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }
}

