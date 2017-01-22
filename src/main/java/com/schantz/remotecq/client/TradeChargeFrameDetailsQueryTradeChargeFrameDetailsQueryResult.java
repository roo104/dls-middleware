package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TradeChargeFrameDetailsQueryTradeChargeFrameDetailsQueryResult implements Serializable {
  @JsonProperty("viewAt")
  private LocalDate viewAt = null;

  @JsonProperty("tradeChargeFrameIdCq")
  private TradeChargeFrameIdCq tradeChargeFrameIdCq = null;


  public LocalDate getViewAt() {
    return viewAt;
  }

  public void setViewAt(LocalDate viewAt) {
    this.viewAt = viewAt;
  }

  public TradeChargeFrameIdCq getTradeChargeFrameIdCq() {
    return tradeChargeFrameIdCq;
  }

  public void setTradeChargeFrameIdCq(TradeChargeFrameIdCq tradeChargeFrameIdCq) {
    this.tradeChargeFrameIdCq = tradeChargeFrameIdCq;
  }
}

