package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class DkAccountInformationCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("regNo")
  private String regNo = null;

  @JsonProperty("accountNo")
  private String accountNo = null;

  @JsonProperty("paymentTypeCq")
  private String paymentTypeCq = null;

  @JsonProperty("payablesChannelTypeCq")
  private String payablesChannelTypeCq = null;


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

  public String getRegNo() {
    return regNo;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public String getPaymentTypeCq() {
    return paymentTypeCq;
  }

  public void setPaymentTypeCq(String paymentTypeCq) {
    this.paymentTypeCq = paymentTypeCq;
  }

  public String getPayablesChannelTypeCq() {
    return payablesChannelTypeCq;
  }

  public void setPayablesChannelTypeCq(String payablesChannelTypeCq) {
    this.payablesChannelTypeCq = payablesChannelTypeCq;
  }
}

