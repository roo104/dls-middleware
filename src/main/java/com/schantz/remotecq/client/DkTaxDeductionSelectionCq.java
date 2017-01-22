package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class DkTaxDeductionSelectionCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("dkTaxCodeDeductionCodeCq")
  private String dkTaxCodeDeductionCodeCq = null;

  @JsonProperty("dkTaxCodeCq")
  private String dkTaxCodeCq = null;

  @JsonProperty("isCompany")
  private Boolean isCompany = false;


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

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getDkTaxCodeDeductionCodeCq() {
    return dkTaxCodeDeductionCodeCq;
  }

  public void setDkTaxCodeDeductionCodeCq(String dkTaxCodeDeductionCodeCq) {
    this.dkTaxCodeDeductionCodeCq = dkTaxCodeDeductionCodeCq;
  }

  public String getDkTaxCodeCq() {
    return dkTaxCodeCq;
  }

  public void setDkTaxCodeCq(String dkTaxCodeCq) {
    this.dkTaxCodeCq = dkTaxCodeCq;
  }

  public Boolean getIsCompany() {
    return isCompany;
  }

  public void setIsCompany(Boolean isCompany) {
    this.isCompany = isCompany;
  }
}

