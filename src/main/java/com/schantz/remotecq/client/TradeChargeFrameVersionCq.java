package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TradeChargeFrameVersionCq implements Serializable {
  @JsonProperty("noOfFreeTrades")
  private Long noOfFreeTrades = null;

  @JsonProperty("tradeChargePct")
  private Double tradeChargePct = null;

  @JsonProperty("tradeChargeAmount")
  private Double tradeChargeAmount = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("draft")
  private Boolean draft = false;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("cancelled")
  private Boolean cancelled = false;

  @JsonProperty("useBuySellFundPrice")
  private Boolean useBuySellFundPrice = false;

  @JsonProperty("tradeChargeFrameVersionIdCq")
  private TradeChargeFrameVersionIdCq tradeChargeFrameVersionIdCq = null;

  @JsonProperty("freeTradePeriodeLength")
  private String freeTradePeriodeLength = null;


  public Long getNoOfFreeTrades() {
    return noOfFreeTrades;
  }

  public void setNoOfFreeTrades(Long noOfFreeTrades) {
    this.noOfFreeTrades = noOfFreeTrades;
  }

  public Double getTradeChargePct() {
    return tradeChargePct;
  }

  public void setTradeChargePct(Double tradeChargePct) {
    this.tradeChargePct = tradeChargePct;
  }

  public Double getTradeChargeAmount() {
    return tradeChargeAmount;
  }

  public void setTradeChargeAmount(Double tradeChargeAmount) {
    this.tradeChargeAmount = tradeChargeAmount;
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

  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public Boolean getCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public Boolean getUseBuySellFundPrice() {
    return useBuySellFundPrice;
  }

  public void setUseBuySellFundPrice(Boolean useBuySellFundPrice) {
    this.useBuySellFundPrice = useBuySellFundPrice;
  }

  public TradeChargeFrameVersionIdCq getTradeChargeFrameVersionIdCq() {
    return tradeChargeFrameVersionIdCq;
  }

  public void setTradeChargeFrameVersionIdCq(TradeChargeFrameVersionIdCq tradeChargeFrameVersionIdCq) {
    this.tradeChargeFrameVersionIdCq = tradeChargeFrameVersionIdCq;
  }

  public String getFreeTradePeriodeLength() {
    return freeTradePeriodeLength;
  }

  public void setFreeTradePeriodeLength(String freeTradePeriodeLength) {
    this.freeTradePeriodeLength = freeTradePeriodeLength;
  }
}

