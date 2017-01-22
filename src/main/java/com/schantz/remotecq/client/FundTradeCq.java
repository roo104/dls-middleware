package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class FundTradeCq implements Serializable {
  @JsonProperty("createdDate")
  private LocalDate createdDate = null;

  @JsonProperty("fundPriceDate")
  private LocalDate fundPriceDate = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("fundPrice")
  private Double fundPrice = null;

  @JsonProperty("units")
  private Double units = null;


  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public LocalDate getFundPriceDate() {
    return fundPriceDate;
  }

  public void setFundPriceDate(LocalDate fundPriceDate) {
    this.fundPriceDate = fundPriceDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getFundPrice() {
    return fundPrice;
  }

  public void setFundPrice(Double fundPrice) {
    this.fundPrice = fundPrice;
  }

  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }
}

