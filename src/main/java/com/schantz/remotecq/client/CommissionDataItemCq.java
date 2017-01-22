package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionDataItemCq implements Serializable {
  @JsonProperty("commissionReceiverIdCq")
  private CommissionReceiverIdCq commissionReceiverIdCq = null;

  @JsonProperty("commissionRoleTypeCq")
  private String commissionRoleTypeCq = null;

  @JsonProperty("currentReceiverVersion")
  private CommissionReceiverVersionDetailsCq currentReceiverVersion = null;


  public CommissionReceiverIdCq getCommissionReceiverIdCq() {
    return commissionReceiverIdCq;
  }

  public void setCommissionReceiverIdCq(CommissionReceiverIdCq commissionReceiverIdCq) {
    this.commissionReceiverIdCq = commissionReceiverIdCq;
  }

  public String getCommissionRoleTypeCq() {
    return commissionRoleTypeCq;
  }

  public void setCommissionRoleTypeCq(String commissionRoleTypeCq) {
    this.commissionRoleTypeCq = commissionRoleTypeCq;
  }

  public CommissionReceiverVersionDetailsCq getCurrentReceiverVersion() {
    return currentReceiverVersion;
  }

  public void setCurrentReceiverVersion(CommissionReceiverVersionDetailsCq currentReceiverVersion) {
    this.currentReceiverVersion = currentReceiverVersion;
  }
}

