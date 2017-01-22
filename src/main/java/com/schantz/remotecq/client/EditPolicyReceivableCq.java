package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EditPolicyReceivableCq implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("dueDate")
  private LocalDate dueDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("percentage")
  private Double percentage = null;

  @JsonProperty("policyId")
  private String policyId = null;

  @JsonProperty("amountTypeCq")
  private String amountTypeCq = null;

  @JsonProperty("replacePolicyReceivableIdCq")
  private PolicyReceivableIdCq replacePolicyReceivableIdCq = null;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public String getAmountTypeCq() {
    return amountTypeCq;
  }

  public void setAmountTypeCq(String amountTypeCq) {
    this.amountTypeCq = amountTypeCq;
  }

  public PolicyReceivableIdCq getReplacePolicyReceivableIdCq() {
    return replacePolicyReceivableIdCq;
  }

  public void setReplacePolicyReceivableIdCq(PolicyReceivableIdCq replacePolicyReceivableIdCq) {
    this.replacePolicyReceivableIdCq = replacePolicyReceivableIdCq;
  }
}

