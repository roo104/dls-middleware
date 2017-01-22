package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SinglePremiumEventTaxCodeSplit implements Serializable {
  @JsonProperty("contributionActual")
  private Double contributionActual = null;

  @JsonProperty("contributionExpected")
  private Double contributionExpected = null;

  @JsonProperty("calculatedPremium")
  private Double calculatedPremium = null;

  @JsonProperty("calculatedCharge")
  private Double calculatedCharge = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;


  public Double getContributionActual() {
    return contributionActual;
  }

  public void setContributionActual(Double contributionActual) {
    this.contributionActual = contributionActual;
  }

  public Double getContributionExpected() {
    return contributionExpected;
  }

  public void setContributionExpected(Double contributionExpected) {
    this.contributionExpected = contributionExpected;
  }

  public Double getCalculatedPremium() {
    return calculatedPremium;
  }

  public void setCalculatedPremium(Double calculatedPremium) {
    this.calculatedPremium = calculatedPremium;
  }

  public Double getCalculatedCharge() {
    return calculatedCharge;
  }

  public void setCalculatedCharge(Double calculatedCharge) {
    this.calculatedCharge = calculatedCharge;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }
}

