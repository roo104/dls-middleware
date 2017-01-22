package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ConvertedPolicyDataCq implements Serializable {
  @JsonProperty("originalStartDate")
  private LocalDate originalStartDate = null;

  @JsonProperty("policyStartDate")
  private LocalDate policyStartDate = null;

  @JsonProperty("primaryBillingMonth")
  private Long primaryBillingMonth = null;

  @JsonProperty("selectedPremiumFrequency")
  private String selectedPremiumFrequency = null;

  @JsonProperty("lifePolicyStatus")
  private String lifePolicyStatus = null;


  public LocalDate getOriginalStartDate() {
    return originalStartDate;
  }

  public void setOriginalStartDate(LocalDate originalStartDate) {
    this.originalStartDate = originalStartDate;
  }

  public LocalDate getPolicyStartDate() {
    return policyStartDate;
  }

  public void setPolicyStartDate(LocalDate policyStartDate) {
    this.policyStartDate = policyStartDate;
  }

  public Long getPrimaryBillingMonth() {
    return primaryBillingMonth;
  }

  public void setPrimaryBillingMonth(Long primaryBillingMonth) {
    this.primaryBillingMonth = primaryBillingMonth;
  }

  public String getSelectedPremiumFrequency() {
    return selectedPremiumFrequency;
  }

  public void setSelectedPremiumFrequency(String selectedPremiumFrequency) {
    this.selectedPremiumFrequency = selectedPremiumFrequency;
  }

  public String getLifePolicyStatus() {
    return lifePolicyStatus;
  }

  public void setLifePolicyStatus(String lifePolicyStatus) {
    this.lifePolicyStatus = lifePolicyStatus;
  }
}

