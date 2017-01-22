package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPalTaxQueryTopSsPalTaxQueryResult implements Serializable {
  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;


  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }
}

