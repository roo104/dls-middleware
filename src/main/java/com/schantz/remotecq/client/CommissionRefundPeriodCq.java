package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRefundPeriodCq implements Serializable {
  @JsonProperty("fromValue")
  private Long fromValue = null;

  @JsonProperty("toValue")
  private Long toValue = null;

  @JsonProperty("pct")
  private Double pct = null;


  public Long getFromValue() {
    return fromValue;
  }

  public void setFromValue(Long fromValue) {
    this.fromValue = fromValue;
  }

  public Long getToValue() {
    return toValue;
  }

  public void setToValue(Long toValue) {
    this.toValue = toValue;
  }

  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }
}

