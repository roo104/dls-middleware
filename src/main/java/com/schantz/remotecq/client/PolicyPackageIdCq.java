package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyPackageIdCq implements Serializable {
  @JsonProperty("instanceId")
  private String instanceId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("agreementPackageIdCq")
  private AgreementPackageIdCq agreementPackageIdCq = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;


  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AgreementPackageIdCq getAgreementPackageIdCq() {
    return agreementPackageIdCq;
  }

  public void setAgreementPackageIdCq(AgreementPackageIdCq agreementPackageIdCq) {
    this.agreementPackageIdCq = agreementPackageIdCq;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }
}

