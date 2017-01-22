package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CriticalIllnessPaymentCommand implements Serializable {
  @JsonProperty("criticalIllnessPaymentAction")
  private CriticalIllnessPaymentAction criticalIllnessPaymentAction = null;

  @JsonProperty("claimGrantCriticalIllnessVersionIdCq")
  private ClaimGrantCriticalIllnessVersionIdCq claimGrantCriticalIllnessVersionIdCq = null;


  public CriticalIllnessPaymentAction getCriticalIllnessPaymentAction() {
    return criticalIllnessPaymentAction;
  }

  public void setCriticalIllnessPaymentAction(CriticalIllnessPaymentAction criticalIllnessPaymentAction) {
    this.criticalIllnessPaymentAction = criticalIllnessPaymentAction;
  }

  public ClaimGrantCriticalIllnessVersionIdCq getClaimGrantCriticalIllnessVersionIdCq() {
    return claimGrantCriticalIllnessVersionIdCq;
  }

  public void setClaimGrantCriticalIllnessVersionIdCq(ClaimGrantCriticalIllnessVersionIdCq claimGrantCriticalIllnessVersionIdCq) {
    this.claimGrantCriticalIllnessVersionIdCq = claimGrantCriticalIllnessVersionIdCq;
  }
}

