package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewFundCommand implements Serializable {
  @JsonProperty("fundId")
  private String fundId = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("ownerId")
  private UnitLinkedOwnerIdCq ownerId = null;


  public String getFundId() {
    return fundId;
  }

  public void setFundId(String fundId) {
    this.fundId = fundId;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public UnitLinkedOwnerIdCq getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UnitLinkedOwnerIdCq ownerId) {
    this.ownerId = ownerId;
  }
}

