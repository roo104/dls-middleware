package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class NoMatchPayment implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("claimVersionIdCq")
  private ClaimVersionIdCq claimVersionIdCq = null;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ClaimVersionIdCq getClaimVersionIdCq() {
    return claimVersionIdCq;
  }

  public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
    this.claimVersionIdCq = claimVersionIdCq;
  }
}

