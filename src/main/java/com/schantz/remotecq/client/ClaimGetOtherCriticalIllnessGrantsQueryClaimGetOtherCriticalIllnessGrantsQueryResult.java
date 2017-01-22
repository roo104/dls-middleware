package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimGetOtherCriticalIllnessGrantsQueryClaimGetOtherCriticalIllnessGrantsQueryResult implements Serializable {
  @JsonProperty("claimVersionIdCq")
  private ClaimVersionIdCq claimVersionIdCq = null;


  public ClaimVersionIdCq getClaimVersionIdCq() {
    return claimVersionIdCq;
  }

  public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
    this.claimVersionIdCq = claimVersionIdCq;
  }
}

