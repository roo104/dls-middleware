package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class DetailsClaimQueryDetailsClaimQueryResult implements Serializable {
  @JsonProperty("viewAt")
  private LocalDate viewAt = null;

  @JsonProperty("claimIdCq")
  private ClaimIdCq claimIdCq = null;


  public LocalDate getViewAt() {
    return viewAt;
  }

  public void setViewAt(LocalDate viewAt) {
    this.viewAt = viewAt;
  }

  public ClaimIdCq getClaimIdCq() {
    return claimIdCq;
  }

  public void setClaimIdCq(ClaimIdCq claimIdCq) {
    this.claimIdCq = claimIdCq;
  }
}

