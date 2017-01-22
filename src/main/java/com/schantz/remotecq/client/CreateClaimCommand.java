package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CreateClaimCommand implements Serializable {
  @JsonProperty("claimCq")
  private ClaimCq claimCq = null;


  public ClaimCq getClaimCq() {
    return claimCq;
  }

  public void setClaimCq(ClaimCq claimCq) {
    this.claimCq = claimCq;
  }
}

