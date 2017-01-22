package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AdvancePolicyCommand implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("ignoreOnHold")
  private Boolean ignoreOnHold = false;

  @JsonProperty("forceAdvance")
  private Boolean forceAdvance = false;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public Boolean getIgnoreOnHold() {
    return ignoreOnHold;
  }

  public void setIgnoreOnHold(Boolean ignoreOnHold) {
    this.ignoreOnHold = ignoreOnHold;
  }

  public Boolean getForceAdvance() {
    return forceAdvance;
  }

  public void setForceAdvance(Boolean forceAdvance) {
    this.forceAdvance = forceAdvance;
  }
}

