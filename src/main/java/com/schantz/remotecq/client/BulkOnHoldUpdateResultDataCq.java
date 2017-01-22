package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BulkOnHoldUpdateResultDataCq implements Serializable {
  @JsonProperty("message")
  private CqMessageKey message = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;

  @JsonProperty("onHoldTypeCq")
  private String onHoldTypeCq = null;


  public CqMessageKey getMessage() {
    return message;
  }

  public void setMessage(CqMessageKey message) {
    this.message = message;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }

  public String getOnHoldTypeCq() {
    return onHoldTypeCq;
  }

  public void setOnHoldTypeCq(String onHoldTypeCq) {
    this.onHoldTypeCq = onHoldTypeCq;
  }
}

