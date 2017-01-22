package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DeleteRiskBonusGroupCommand implements Serializable {
  @JsonProperty("riskBonusGroupIdCq")
  private RiskBonusGroupIdCq riskBonusGroupIdCq = null;


  public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
    return riskBonusGroupIdCq;
  }

  public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
    this.riskBonusGroupIdCq = riskBonusGroupIdCq;
  }
}

