package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimRejectionCauseCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("claimRejectionCauseIdCq")
  private ClaimRejectionCauseIdCq claimRejectionCauseIdCq = null;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimRejectionCauseIdCq getClaimRejectionCauseIdCq() {
    return claimRejectionCauseIdCq;
  }

  public void setClaimRejectionCauseIdCq(ClaimRejectionCauseIdCq claimRejectionCauseIdCq) {
    this.claimRejectionCauseIdCq = claimRejectionCauseIdCq;
  }
}

