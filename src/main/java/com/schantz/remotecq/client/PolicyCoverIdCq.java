package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyCoverIdCq implements Serializable {
  @JsonProperty("instanceId")
  private String instanceId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("agreementCoverVariantIdCq")
  private AgreementCoverVariantIdCq agreementCoverVariantIdCq = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;


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

  public AgreementCoverVariantIdCq getAgreementCoverVariantIdCq() {
    return agreementCoverVariantIdCq;
  }

  public void setAgreementCoverVariantIdCq(AgreementCoverVariantIdCq agreementCoverVariantIdCq) {
    this.agreementCoverVariantIdCq = agreementCoverVariantIdCq;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }
}

