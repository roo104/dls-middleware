package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TaxLumpSumCq implements Serializable {
  @JsonProperty("originalLumpsumSavings")
  private Long originalLumpsumSavings = null;

  @JsonProperty("totalAmount")
  private Long totalAmount = null;

  @JsonProperty("taxableAmount")
  private Long taxableAmount = null;

  @JsonProperty("lumpsumPaidUp72")
  private Long lumpsumPaidUp72 = null;

  @JsonProperty("lumpsumUltimo79")
  private Long lumpsumUltimo79 = null;

  @JsonProperty("undeductedDeposits")
  private Long undeductedDeposits = null;

  @JsonProperty("employeeInterestAfter79")
  private Long employeeInterestAfter79 = null;

  @JsonProperty("employeePaidUp72")
  private Long employeePaidUp72 = null;

  @JsonProperty("originalLumpsumInsurance")
  private Long originalLumpsumInsurance = null;

  @JsonProperty("pct60")
  private Long pct60 = null;

  @JsonProperty("pct40")
  private Long pct40 = null;

  @JsonProperty("pct25")
  private Long pct25 = null;

  @JsonProperty("pct35")
  private Long pct35 = null;

  @JsonProperty("totalTaxAmount")
  private Long totalTaxAmount = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("policyPayoutDate")
  private LocalDate policyPayoutDate = null;

  @JsonProperty("isPartialPayOut")
  private Boolean isPartialPayOut = false;


  public Long getOriginalLumpsumSavings() {
    return originalLumpsumSavings;
  }

  public void setOriginalLumpsumSavings(Long originalLumpsumSavings) {
    this.originalLumpsumSavings = originalLumpsumSavings;
  }

  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Long getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Long taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public Long getLumpsumPaidUp72() {
    return lumpsumPaidUp72;
  }

  public void setLumpsumPaidUp72(Long lumpsumPaidUp72) {
    this.lumpsumPaidUp72 = lumpsumPaidUp72;
  }

  public Long getLumpsumUltimo79() {
    return lumpsumUltimo79;
  }

  public void setLumpsumUltimo79(Long lumpsumUltimo79) {
    this.lumpsumUltimo79 = lumpsumUltimo79;
  }

  public Long getUndeductedDeposits() {
    return undeductedDeposits;
  }

  public void setUndeductedDeposits(Long undeductedDeposits) {
    this.undeductedDeposits = undeductedDeposits;
  }

  public Long getEmployeeInterestAfter79() {
    return employeeInterestAfter79;
  }

  public void setEmployeeInterestAfter79(Long employeeInterestAfter79) {
    this.employeeInterestAfter79 = employeeInterestAfter79;
  }

  public Long getEmployeePaidUp72() {
    return employeePaidUp72;
  }

  public void setEmployeePaidUp72(Long employeePaidUp72) {
    this.employeePaidUp72 = employeePaidUp72;
  }

  public Long getOriginalLumpsumInsurance() {
    return originalLumpsumInsurance;
  }

  public void setOriginalLumpsumInsurance(Long originalLumpsumInsurance) {
    this.originalLumpsumInsurance = originalLumpsumInsurance;
  }

  public Long getPct60() {
    return pct60;
  }

  public void setPct60(Long pct60) {
    this.pct60 = pct60;
  }

  public Long getPct40() {
    return pct40;
  }

  public void setPct40(Long pct40) {
    this.pct40 = pct40;
  }

  public Long getPct25() {
    return pct25;
  }

  public void setPct25(Long pct25) {
    this.pct25 = pct25;
  }

  public Long getPct35() {
    return pct35;
  }

  public void setPct35(Long pct35) {
    this.pct35 = pct35;
  }

  public Long getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public LocalDate getPolicyPayoutDate() {
    return policyPayoutDate;
  }

  public void setPolicyPayoutDate(LocalDate policyPayoutDate) {
    this.policyPayoutDate = policyPayoutDate;
  }

  public Boolean getIsPartialPayOut() {
    return isPartialPayOut;
  }

  public void setIsPartialPayOut(Boolean isPartialPayOut) {
    this.isPartialPayOut = isPartialPayOut;
  }
}

