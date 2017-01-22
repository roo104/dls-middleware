package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class FundSelectCq implements Serializable {
  @JsonProperty("fundIdCq")
  private FundIdCq fundIdCq = null;

  @JsonProperty("fundName")
  private String fundName = null;


  public FundIdCq getFundIdCq() {
    return fundIdCq;
  }

  public void setFundIdCq(FundIdCq fundIdCq) {
    this.fundIdCq = fundIdCq;
  }

  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }
}

