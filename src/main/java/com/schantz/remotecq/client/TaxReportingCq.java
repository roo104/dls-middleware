package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TaxReportingCq implements Serializable {
  @JsonProperty("amountT0014")
  private Long amountT0014 = null;

  @JsonProperty("amountT0015")
  private Long amountT0015 = null;

  @JsonProperty("amountT0200")
  private Long amountT0200 = null;

  @JsonProperty("amountT0038")
  private Long amountT0038 = null;

  @JsonProperty("amountT0088")
  private Long amountT0088 = null;

  @JsonProperty("sign")
  private String sign = null;


  public Long getAmountT0014() {
    return amountT0014;
  }

  public void setAmountT0014(Long amountT0014) {
    this.amountT0014 = amountT0014;
  }

  public Long getAmountT0015() {
    return amountT0015;
  }

  public void setAmountT0015(Long amountT0015) {
    this.amountT0015 = amountT0015;
  }

  public Long getAmountT0200() {
    return amountT0200;
  }

  public void setAmountT0200(Long amountT0200) {
    this.amountT0200 = amountT0200;
  }

  public Long getAmountT0038() {
    return amountT0038;
  }

  public void setAmountT0038(Long amountT0038) {
    this.amountT0038 = amountT0038;
  }

  public Long getAmountT0088() {
    return amountT0088;
  }

  public void setAmountT0088(Long amountT0088) {
    this.amountT0088 = amountT0088;
  }

  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }
}

