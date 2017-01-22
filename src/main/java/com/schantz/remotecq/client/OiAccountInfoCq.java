package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class OiAccountInfoCq implements Serializable {
  @JsonProperty("balanceAmount")
  private Double balanceAmount = null;

  @JsonProperty("oiAccountTypeCq")
  private String oiAccountTypeCq = null;

  @JsonProperty("oiAccountId")
  private OiAccountIdCq oiAccountId = null;


  public Double getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(Double balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public String getOiAccountTypeCq() {
    return oiAccountTypeCq;
  }

  public void setOiAccountTypeCq(String oiAccountTypeCq) {
    this.oiAccountTypeCq = oiAccountTypeCq;
  }

  public OiAccountIdCq getOiAccountId() {
    return oiAccountId;
  }

  public void setOiAccountId(OiAccountIdCq oiAccountId) {
    this.oiAccountId = oiAccountId;
  }
}

