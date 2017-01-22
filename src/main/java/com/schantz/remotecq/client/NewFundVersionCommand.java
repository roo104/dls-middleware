package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewFundVersionCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("cloneSourceId")
  private FundVersionIdCq cloneSourceId = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public FundVersionIdCq getCloneSourceId() {
    return cloneSourceId;
  }

  public void setCloneSourceId(FundVersionIdCq cloneSourceId) {
    this.cloneSourceId = cloneSourceId;
  }
}

