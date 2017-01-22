package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioUnitsCq implements Serializable {
  @JsonProperty("units")
  private Double units = null;

  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("fundId")
  private FundIdCq fundId = null;


  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }

  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public FundIdCq getFundId() {
    return fundId;
  }

  public void setFundId(FundIdCq fundId) {
    this.fundId = fundId;
  }
}

