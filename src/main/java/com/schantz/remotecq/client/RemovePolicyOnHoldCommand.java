package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RemovePolicyOnHoldCommand implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("onHoldTypeCq")
  private String onHoldTypeCq = null;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getOnHoldTypeCq() {
    return onHoldTypeCq;
  }

  public void setOnHoldTypeCq(String onHoldTypeCq) {
    this.onHoldTypeCq = onHoldTypeCq;
  }
}

