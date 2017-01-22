package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopPersonPremiumAndReserveDetail implements Serializable {
  @JsonProperty("yearlyPremium")
  private Double yearlyPremium = null;

  @JsonProperty("reserve")
  private Double reserve = null;

  @JsonProperty("dkTaxCodeCq")
  private String dkTaxCodeCq = null;


  public Double getYearlyPremium() {
    return yearlyPremium;
  }

  public void setYearlyPremium(Double yearlyPremium) {
    this.yearlyPremium = yearlyPremium;
  }

  public Double getReserve() {
    return reserve;
  }

  public void setReserve(Double reserve) {
    this.reserve = reserve;
  }

  public String getDkTaxCodeCq() {
    return dkTaxCodeCq;
  }

  public void setDkTaxCodeCq(String dkTaxCodeCq) {
    this.dkTaxCodeCq = dkTaxCodeCq;
  }
}

