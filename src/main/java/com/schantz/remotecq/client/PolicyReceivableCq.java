package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyReceivableCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("dueDate")
  private LocalDate dueDate = null;

  @JsonProperty("voucherText")
  private String voucherText = null;

  @JsonProperty("lineNumber")
  private Long lineNumber = null;

  @JsonProperty("percentage")
  private Double percentage = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("actPaymentDate")
  private LocalDate actPaymentDate = null;

  @JsonProperty("billingId")
  private String billingId = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("policyId")
  private String policyId = null;

  @JsonProperty("amountGroupingTypeCq")
  private String amountGroupingTypeCq = null;

  @JsonProperty("amountTypeCq")
  private String amountTypeCq = null;


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public String getVoucherText() {
    return voucherText;
  }

  public void setVoucherText(String voucherText) {
    this.voucherText = voucherText;
  }

  public Long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
  }

  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public LocalDate getActPaymentDate() {
    return actPaymentDate;
  }

  public void setActPaymentDate(LocalDate actPaymentDate) {
    this.actPaymentDate = actPaymentDate;
  }

  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public String getAmountGroupingTypeCq() {
    return amountGroupingTypeCq;
  }

  public void setAmountGroupingTypeCq(String amountGroupingTypeCq) {
    this.amountGroupingTypeCq = amountGroupingTypeCq;
  }

  public String getAmountTypeCq() {
    return amountTypeCq;
  }

  public void setAmountTypeCq(String amountTypeCq) {
    this.amountTypeCq = amountTypeCq;
  }
}

