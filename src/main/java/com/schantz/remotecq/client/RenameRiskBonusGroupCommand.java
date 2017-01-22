package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RenameRiskBonusGroupCommand implements Serializable {
  @JsonProperty("riskBonusGroupIdCq")
  private RiskBonusGroupIdCq riskBonusGroupIdCq = null;

  @JsonProperty("name")
  private String name = null;


  public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
    return riskBonusGroupIdCq;
  }

  public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
    this.riskBonusGroupIdCq = riskBonusGroupIdCq;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

