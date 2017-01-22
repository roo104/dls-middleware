package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class FundPriceCq implements Serializable {
  @JsonProperty("buy")
  private Double buy = null;

  @JsonProperty("sell")
  private Double sell = null;

  @JsonProperty("value")
  private Double value = null;

  @JsonProperty("valueDateTime")
  private OffsetDateTime valueDateTime = null;

  @JsonProperty("dividend")
  private Double dividend = null;


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

  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public Double getDividend() {
    return dividend;
  }

  public void setDividend(Double dividend) {
    this.dividend = dividend;
  }
}

