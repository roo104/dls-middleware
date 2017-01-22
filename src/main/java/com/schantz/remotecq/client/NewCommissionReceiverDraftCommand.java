package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewCommissionReceiverDraftCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("basedOn")
  private CommissionReceiverVersionIdCq basedOn = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CommissionReceiverVersionIdCq getBasedOn() {
    return basedOn;
  }

  public void setBasedOn(CommissionReceiverVersionIdCq basedOn) {
    this.basedOn = basedOn;
  }
}

