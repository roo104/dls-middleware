package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionResultCoverBenefitCq implements Serializable {
  @JsonProperty("projectionAge")
  private AgeDateCq projectionAge = null;

  @JsonProperty("benefit")
  private Double benefit = null;

  @JsonProperty("benefitInflated")
  private Double benefitInflated = null;


  public AgeDateCq getProjectionAge() {
    return projectionAge;
  }

  public void setProjectionAge(AgeDateCq projectionAge) {
    this.projectionAge = projectionAge;
  }

  public Double getBenefit() {
    return benefit;
  }

  public void setBenefit(Double benefit) {
    this.benefit = benefit;
  }

  public Double getBenefitInflated() {
    return benefitInflated;
  }

  public void setBenefitInflated(Double benefitInflated) {
    this.benefitInflated = benefitInflated;
  }
}

