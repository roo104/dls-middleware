package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRegulationVersionDetailsCq implements Serializable {
  @JsonProperty("commissionRegulationVersionCq")
  private CommissionRegulationVersionCq commissionRegulationVersionCq = null;

  @JsonProperty("commissionRegulationCq")
  private CommissionRegulationCq commissionRegulationCq = null;


  public CommissionRegulationVersionCq getCommissionRegulationVersionCq() {
    return commissionRegulationVersionCq;
  }

  public void setCommissionRegulationVersionCq(CommissionRegulationVersionCq commissionRegulationVersionCq) {
    this.commissionRegulationVersionCq = commissionRegulationVersionCq;
  }

  public CommissionRegulationCq getCommissionRegulationCq() {
    return commissionRegulationCq;
  }

  public void setCommissionRegulationCq(CommissionRegulationCq commissionRegulationCq) {
    this.commissionRegulationCq = commissionRegulationCq;
  }
}

