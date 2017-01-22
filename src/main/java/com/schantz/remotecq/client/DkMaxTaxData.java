package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DkMaxTaxData implements Serializable {
  @JsonProperty("usedLastYear")
  private Double usedLastYear = null;

  @JsonProperty("usedThisYear")
  private Double usedThisYear = null;

  @JsonProperty("reservedThisYear")
  private Double reservedThisYear = null;

  @JsonProperty("yearlyPremium")
  private Double yearlyPremium = null;

  @JsonProperty("premiumNextYear")
  private Double premiumNextYear = null;

  @JsonProperty("dkTaxCodeCq")
  private String dkTaxCodeCq = null;

  @JsonProperty("dkRunningTotalIndexationTypeCq")
  private String dkRunningTotalIndexationTypeCq = null;

  @JsonProperty("isNextYearCalculated")
  private Boolean isNextYearCalculated = false;


  public Double getUsedLastYear() {
    return usedLastYear;
  }

  public void setUsedLastYear(Double usedLastYear) {
    this.usedLastYear = usedLastYear;
  }

  public Double getUsedThisYear() {
    return usedThisYear;
  }

  public void setUsedThisYear(Double usedThisYear) {
    this.usedThisYear = usedThisYear;
  }

  public Double getReservedThisYear() {
    return reservedThisYear;
  }

  public void setReservedThisYear(Double reservedThisYear) {
    this.reservedThisYear = reservedThisYear;
  }

  public Double getYearlyPremium() {
    return yearlyPremium;
  }

  public void setYearlyPremium(Double yearlyPremium) {
    this.yearlyPremium = yearlyPremium;
  }

  public Double getPremiumNextYear() {
    return premiumNextYear;
  }

  public void setPremiumNextYear(Double premiumNextYear) {
    this.premiumNextYear = premiumNextYear;
  }

  public String getDkTaxCodeCq() {
    return dkTaxCodeCq;
  }

  public void setDkTaxCodeCq(String dkTaxCodeCq) {
    this.dkTaxCodeCq = dkTaxCodeCq;
  }

  public String getDkRunningTotalIndexationTypeCq() {
    return dkRunningTotalIndexationTypeCq;
  }

  public void setDkRunningTotalIndexationTypeCq(String dkRunningTotalIndexationTypeCq) {
    this.dkRunningTotalIndexationTypeCq = dkRunningTotalIndexationTypeCq;
  }

  public Boolean getIsNextYearCalculated() {
    return isNextYearCalculated;
  }

  public void setIsNextYearCalculated(Boolean isNextYearCalculated) {
    this.isNextYearCalculated = isNextYearCalculated;
  }
}

