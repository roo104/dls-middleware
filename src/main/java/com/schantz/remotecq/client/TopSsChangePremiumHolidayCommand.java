package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsChangePremiumHolidayCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;

  @JsonProperty("premiumHolidayTypeCq")
  private String premiumHolidayTypeCq = null;


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

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }

  public String getPremiumHolidayTypeCq() {
    return premiumHolidayTypeCq;
  }

  public void setPremiumHolidayTypeCq(String premiumHolidayTypeCq) {
    this.premiumHolidayTypeCq = premiumHolidayTypeCq;
  }
}

