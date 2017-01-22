package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyOnHoldQueryResultDataCq implements Serializable {
  @JsonProperty("onHoldCq")
  private OnHoldCq onHoldCq = null;

  @JsonProperty("policySearchEntry")
  private PolicySearchEntry policySearchEntry = null;


  public OnHoldCq getOnHoldCq() {
    return onHoldCq;
  }

  public void setOnHoldCq(OnHoldCq onHoldCq) {
    this.onHoldCq = onHoldCq;
  }

  public PolicySearchEntry getPolicySearchEntry() {
    return policySearchEntry;
  }

  public void setPolicySearchEntry(PolicySearchEntry policySearchEntry) {
    this.policySearchEntry = policySearchEntry;
  }
}

