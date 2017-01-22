package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class FundSplitCq implements Serializable {
  @JsonProperty("pct")
  private Double pct = null;

  @JsonProperty("fundDetailsCq")
  private FundDetailsCq fundDetailsCq = null;


  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public FundDetailsCq getFundDetailsCq() {
    return fundDetailsCq;
  }

  public void setFundDetailsCq(FundDetailsCq fundDetailsCq) {
    this.fundDetailsCq = fundDetailsCq;
  }
}

