package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class UncancelRiskBonusGroupCommand implements Serializable {
  @JsonProperty("cancelMe")
  private RiskBonusGroupVersionIdCq cancelMe = null;

  @JsonProperty("uncancelMe")
  private RiskBonusGroupVersionIdCq uncancelMe = null;


  public RiskBonusGroupVersionIdCq getCancelMe() {
    return cancelMe;
  }

  public void setCancelMe(RiskBonusGroupVersionIdCq cancelMe) {
    this.cancelMe = cancelMe;
  }

  public RiskBonusGroupVersionIdCq getUncancelMe() {
    return uncancelMe;
  }

  public void setUncancelMe(RiskBonusGroupVersionIdCq uncancelMe) {
    this.uncancelMe = uncancelMe;
  }
}

