package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SurplusDistributionSelectionCq implements Serializable {
  @JsonProperty("share")
  private Double share = null;

  @JsonProperty("surplusDistributionMethodCq")
  private String surplusDistributionMethodCq = null;


  public Double getShare() {
    return share;
  }

  public void setShare(Double share) {
    this.share = share;
  }

  public String getSurplusDistributionMethodCq() {
    return surplusDistributionMethodCq;
  }

  public void setSurplusDistributionMethodCq(String surplusDistributionMethodCq) {
    this.surplusDistributionMethodCq = surplusDistributionMethodCq;
  }
}

