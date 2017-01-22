package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusGroupSearchEntry implements Serializable {
  @JsonProperty("defaultVersion")
  private RiskBonusGroupVersionIdCq defaultVersion = null;

  @JsonProperty("riskBonusGroupIdCq")
  private RiskBonusGroupIdCq riskBonusGroupIdCq = null;


  public RiskBonusGroupVersionIdCq getDefaultVersion() {
    return defaultVersion;
  }

  public void setDefaultVersion(RiskBonusGroupVersionIdCq defaultVersion) {
    this.defaultVersion = defaultVersion;
  }

  public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
    return riskBonusGroupIdCq;
  }

  public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
    this.riskBonusGroupIdCq = riskBonusGroupIdCq;
  }
}

