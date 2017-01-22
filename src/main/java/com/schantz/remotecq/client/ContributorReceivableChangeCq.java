package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ContributorReceivableChangeCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("changeCode")
  private String changeCode = null;

  @JsonProperty("contributorChangeTypeCq")
  private String contributorChangeTypeCq = null;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public String getChangeCode() {
    return changeCode;
  }

  public void setChangeCode(String changeCode) {
    this.changeCode = changeCode;
  }

  public String getContributorChangeTypeCq() {
    return contributorChangeTypeCq;
  }

  public void setContributorChangeTypeCq(String contributorChangeTypeCq) {
    this.contributorChangeTypeCq = contributorChangeTypeCq;
  }
}

