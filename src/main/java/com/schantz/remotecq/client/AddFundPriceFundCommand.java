package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class AddFundPriceFundCommand implements Serializable {
  @JsonProperty("fundId")
  private FundIdCq fundId = null;

  @JsonProperty("valueTime")
  private OffsetDateTime valueTime = null;

  @JsonProperty("buy")
  private Double buy = null;

  @JsonProperty("sell")
  private Double sell = null;

  @JsonProperty("value")
  private Double value = null;

  @JsonProperty("dividend")
  private Double dividend = null;


  public FundIdCq getFundId() {
    return fundId;
  }

  public void setFundId(FundIdCq fundId) {
    this.fundId = fundId;
  }

  public OffsetDateTime getValueTime() {
    return valueTime;
  }

  public void setValueTime(OffsetDateTime valueTime) {
    this.valueTime = valueTime;
  }

  public Double getBuy() {
    return buy;
  }

  public void setBuy(Double buy) {
    this.buy = buy;
  }

  public Double getSell() {
    return sell;
  }

  public void setSell(Double sell) {
    this.sell = sell;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Double getDividend() {
    return dividend;
  }

  public void setDividend(Double dividend) {
    this.dividend = dividend;
  }
}

