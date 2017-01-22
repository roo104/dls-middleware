package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopDetailsCompanyQueryTopDetailsCompanyQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }

  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }
}

