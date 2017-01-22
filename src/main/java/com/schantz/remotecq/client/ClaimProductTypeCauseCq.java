package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimProductTypeCauseCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("claimProductTypeCauseIdCq")
  private ClaimProductTypeCauseIdCq claimProductTypeCauseIdCq = null;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimProductTypeCauseIdCq getClaimProductTypeCauseIdCq() {
    return claimProductTypeCauseIdCq;
  }

  public void setClaimProductTypeCauseIdCq(ClaimProductTypeCauseIdCq claimProductTypeCauseIdCq) {
    this.claimProductTypeCauseIdCq = claimProductTypeCauseIdCq;
  }
}

