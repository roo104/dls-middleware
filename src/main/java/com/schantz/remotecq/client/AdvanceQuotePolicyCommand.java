package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class AdvanceQuotePolicyCommand implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }
}

