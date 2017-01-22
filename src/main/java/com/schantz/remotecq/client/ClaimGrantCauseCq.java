package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimGrantCauseCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("claimGrantCauseIdCq")
  private ClaimGrantCauseIdCq claimGrantCauseIdCq = null;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimGrantCauseIdCq getClaimGrantCauseIdCq() {
    return claimGrantCauseIdCq;
  }

  public void setClaimGrantCauseIdCq(ClaimGrantCauseIdCq claimGrantCauseIdCq) {
    this.claimGrantCauseIdCq = claimGrantCauseIdCq;
  }
}

