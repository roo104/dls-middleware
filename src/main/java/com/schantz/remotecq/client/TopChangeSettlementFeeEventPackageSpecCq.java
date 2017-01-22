package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopChangeSettlementFeeEventPackageSpecCq implements Serializable {
  @JsonProperty("topChangeSettlementFeeEventPackageSpecActionCq")
  private String topChangeSettlementFeeEventPackageSpecActionCq = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;


  public String getTopChangeSettlementFeeEventPackageSpecActionCq() {
    return topChangeSettlementFeeEventPackageSpecActionCq;
  }

  public void setTopChangeSettlementFeeEventPackageSpecActionCq(String topChangeSettlementFeeEventPackageSpecActionCq) {
    this.topChangeSettlementFeeEventPackageSpecActionCq = topChangeSettlementFeeEventPackageSpecActionCq;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }
}

