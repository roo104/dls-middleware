package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionToleranceConsequenceEventCq implements Serializable {
  @JsonProperty("expectedPremium")
  private Double expectedPremium = null;

  @JsonProperty("lowerPremium")
  private Double lowerPremium = null;

  @JsonProperty("upperPremium")
  private Double upperPremium = null;

  @JsonProperty("isPositivePctActive")
  private Boolean isPositivePctActive = false;

  @JsonProperty("isNegativePctActive")
  private Boolean isNegativePctActive = false;


  public Double getExpectedPremium() {
    return expectedPremium;
  }

  public void setExpectedPremium(Double expectedPremium) {
    this.expectedPremium = expectedPremium;
  }

  public Double getLowerPremium() {
    return lowerPremium;
  }

  public void setLowerPremium(Double lowerPremium) {
    this.lowerPremium = lowerPremium;
  }

  public Double getUpperPremium() {
    return upperPremium;
  }

  public void setUpperPremium(Double upperPremium) {
    this.upperPremium = upperPremium;
  }

  public Boolean getIsPositivePctActive() {
    return isPositivePctActive;
  }

  public void setIsPositivePctActive(Boolean isPositivePctActive) {
    this.isPositivePctActive = isPositivePctActive;
  }

  public Boolean getIsNegativePctActive() {
    return isNegativePctActive;
  }

  public void setIsNegativePctActive(Boolean isNegativePctActive) {
    this.isNegativePctActive = isNegativePctActive;
  }
}

