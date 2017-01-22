package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TradeBundleUlOwnerQueryTradeBundleUlOwnerQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("ownerId")
  private UnitLinkedOwnerIdCq ownerId = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;


  public OffsetDateTime getViewAtTime() {
    return viewAtTime;
  }

  public void setViewAtTime(OffsetDateTime viewAtTime) {
    this.viewAtTime = viewAtTime;
  }

  public UnitLinkedOwnerIdCq getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UnitLinkedOwnerIdCq ownerId) {
    this.ownerId = ownerId;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
}

