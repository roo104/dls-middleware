package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CancelFundVersionCommand implements Serializable {
  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("fundVersionIdCq")
  private FundVersionIdCq fundVersionIdCq = null;


  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public FundVersionIdCq getFundVersionIdCq() {
    return fundVersionIdCq;
  }

  public void setFundVersionIdCq(FundVersionIdCq fundVersionIdCq) {
    this.fundVersionIdCq = fundVersionIdCq;
  }
}

