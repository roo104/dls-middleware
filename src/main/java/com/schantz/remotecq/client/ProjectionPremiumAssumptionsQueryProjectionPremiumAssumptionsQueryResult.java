package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionPremiumAssumptionsQueryProjectionPremiumAssumptionsQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }
}

