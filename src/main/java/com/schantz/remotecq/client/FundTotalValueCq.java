package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class FundTotalValueCq implements Serializable {
  @JsonProperty("totalUnits")
  private Double totalUnits = null;

  @JsonProperty("totalValue")
  private Double totalValue = null;

  @JsonProperty("valueDateTime")
  private OffsetDateTime valueDateTime = null;

  @JsonProperty("fundPrice")
  private Double fundPrice = null;

  @JsonProperty("totalAccounts")
  private Long totalAccounts = null;


  public Double getTotalUnits() {
    return totalUnits;
  }

  public void setTotalUnits(Double totalUnits) {
    this.totalUnits = totalUnits;
  }

  public Double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }

  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public Double getFundPrice() {
    return fundPrice;
  }

  public void setFundPrice(Double fundPrice) {
    this.fundPrice = fundPrice;
  }

  public Long getTotalAccounts() {
    return totalAccounts;
  }

  public void setTotalAccounts(Long totalAccounts) {
    this.totalAccounts = totalAccounts;
  }
}

