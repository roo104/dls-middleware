package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class FundDetailsQueryFundDetailsQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("fundId")
  private FundIdCq fundId = null;


  public OffsetDateTime getViewAtTime() {
    return viewAtTime;
  }

  public void setViewAtTime(OffsetDateTime viewAtTime) {
    this.viewAtTime = viewAtTime;
  }

  public FundIdCq getFundId() {
    return fundId;
  }

  public void setFundId(FundIdCq fundId) {
    this.fundId = fundId;
  }
}

