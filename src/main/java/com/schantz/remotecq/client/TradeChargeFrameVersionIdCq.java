package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TradeChargeFrameVersionIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("tradeChargeFrameIdCq")
  private TradeChargeFrameIdCq tradeChargeFrameIdCq = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public TradeChargeFrameIdCq getTradeChargeFrameIdCq() {
    return tradeChargeFrameIdCq;
  }

  public void setTradeChargeFrameIdCq(TradeChargeFrameIdCq tradeChargeFrameIdCq) {
    this.tradeChargeFrameIdCq = tradeChargeFrameIdCq;
  }
}

