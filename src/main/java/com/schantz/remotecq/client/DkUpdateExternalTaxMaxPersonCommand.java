package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DkUpdateExternalTaxMaxPersonCommand implements Serializable {
  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("externalReferenceId")
  private String externalReferenceId = null;

  @JsonProperty("year")
  private Long year = null;

  @JsonProperty("yearlyPremiumNotPosted")
  private Double yearlyPremiumNotPosted = null;

  @JsonProperty("yearlyPremium")
  private Double yearlyPremium = null;

  @JsonProperty("dkTaxCodeCq")
  private String dkTaxCodeCq = null;

  @JsonProperty("dkRunningTotalIndexationTypeCq")
  private String dkRunningTotalIndexationTypeCq = null;


  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public String getExternalReferenceId() {
    return externalReferenceId;
  }

  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }

  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public Double getYearlyPremiumNotPosted() {
    return yearlyPremiumNotPosted;
  }

  public void setYearlyPremiumNotPosted(Double yearlyPremiumNotPosted) {
    this.yearlyPremiumNotPosted = yearlyPremiumNotPosted;
  }

  public Double getYearlyPremium() {
    return yearlyPremium;
  }

  public void setYearlyPremium(Double yearlyPremium) {
    this.yearlyPremium = yearlyPremium;
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
}

