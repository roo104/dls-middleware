package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BasicClaimTreatmentTypeQueryBasicClaimTreatmentTypeQueryResult implements Serializable {
  @JsonProperty("claimTreatmentTypeId")
  private ClaimTreatmentTypeIdCq claimTreatmentTypeId = null;


  public ClaimTreatmentTypeIdCq getClaimTreatmentTypeId() {
    return claimTreatmentTypeId;
  }

  public void setClaimTreatmentTypeId(ClaimTreatmentTypeIdCq claimTreatmentTypeId) {
    this.claimTreatmentTypeId = claimTreatmentTypeId;
  }
}

