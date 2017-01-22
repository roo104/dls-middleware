package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PersonEmployeeEntry implements Serializable {
  @JsonProperty("privatePolicy")
  private Boolean privatePolicy = false;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;


  public Boolean getPrivatePolicy() {
    return privatePolicy;
  }

  public void setPrivatePolicy(Boolean privatePolicy) {
    this.privatePolicy = privatePolicy;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }
}

