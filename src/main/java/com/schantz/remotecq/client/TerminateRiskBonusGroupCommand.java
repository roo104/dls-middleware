package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TerminateRiskBonusGroupCommand implements Serializable {
  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("riskBonusGroupVersionIdCq")
  private RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq = null;


  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }

  public RiskBonusGroupVersionIdCq getRiskBonusGroupVersionIdCq() {
    return riskBonusGroupVersionIdCq;
  }

  public void setRiskBonusGroupVersionIdCq(RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq) {
    this.riskBonusGroupVersionIdCq = riskBonusGroupVersionIdCq;
  }
}

