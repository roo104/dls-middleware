package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusGroupIdCq implements Serializable {
  @JsonProperty("riskBonusGroupUid")
  private String riskBonusGroupUid = null;

  @JsonProperty("riskBonusGroupId")
  private String riskBonusGroupId = null;

  @JsonProperty("riskBonusGroupName")
  private String riskBonusGroupName = null;


  public String getRiskBonusGroupUid() {
    return riskBonusGroupUid;
  }

  public void setRiskBonusGroupUid(String riskBonusGroupUid) {
    this.riskBonusGroupUid = riskBonusGroupUid;
  }

  public String getRiskBonusGroupId() {
    return riskBonusGroupId;
  }

  public void setRiskBonusGroupId(String riskBonusGroupId) {
    this.riskBonusGroupId = riskBonusGroupId;
  }

  public String getRiskBonusGroupName() {
    return riskBonusGroupName;
  }

  public void setRiskBonusGroupName(String riskBonusGroupName) {
    this.riskBonusGroupName = riskBonusGroupName;
  }
}

