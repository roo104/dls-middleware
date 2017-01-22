package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewCommissionReceiverCommand implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("externReference")
  private String externReference = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("commissionRegulationIdCq")
  private CommissionRegulationIdCq commissionRegulationIdCq = null;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExternReference() {
    return externReference;
  }

  public void setExternReference(String externReference) {
    this.externReference = externReference;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CommissionRegulationIdCq getCommissionRegulationIdCq() {
    return commissionRegulationIdCq;
  }

  public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
    this.commissionRegulationIdCq = commissionRegulationIdCq;
  }
}

