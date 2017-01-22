package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class VersionDetailsCommissionRefundRuleQueryVersionDetailsCommissionRefundRuleQueryResult implements Serializable {
  @JsonProperty("commissionRefundRuleVersionIdCq")
  private CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq = null;


  public CommissionRefundRuleVersionIdCq getCommissionRefundRuleVersionIdCq() {
    return commissionRefundRuleVersionIdCq;
  }

  public void setCommissionRefundRuleVersionIdCq(CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq) {
    this.commissionRefundRuleVersionIdCq = commissionRefundRuleVersionIdCq;
  }
}

