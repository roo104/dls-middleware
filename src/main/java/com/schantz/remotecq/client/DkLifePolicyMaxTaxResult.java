package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DkLifePolicyMaxTaxResult implements Serializable {
  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;

  @JsonProperty("dkMaxTaxData")
  private DkMaxTaxData dkMaxTaxData = null;


  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }

  public DkMaxTaxData getDkMaxTaxData() {
    return dkMaxTaxData;
  }

  public void setDkMaxTaxData(DkMaxTaxData dkMaxTaxData) {
    this.dkMaxTaxData = dkMaxTaxData;
  }
}

