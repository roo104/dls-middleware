package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CopyRiskBonusGroupCommand implements Serializable {
  @JsonProperty("riskBonusGroupName")
  private String riskBonusGroupName = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("copyMe")
  private RiskBonusGroupVersionIdCq copyMe = null;


  public String getRiskBonusGroupName() {
    return riskBonusGroupName;
  }

  public void setRiskBonusGroupName(String riskBonusGroupName) {
    this.riskBonusGroupName = riskBonusGroupName;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }

  public RiskBonusGroupVersionIdCq getCopyMe() {
    return copyMe;
  }

  public void setCopyMe(RiskBonusGroupVersionIdCq copyMe) {
    this.copyMe = copyMe;
  }
}

