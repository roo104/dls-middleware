package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRefundRuleVersionIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("baseId")
  private CommissionRefundRuleIdCq baseId = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public CommissionRefundRuleIdCq getBaseId() {
    return baseId;
  }

  public void setBaseId(CommissionRefundRuleIdCq baseId) {
    this.baseId = baseId;
  }
}

