package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TradeChargeFrameDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("tradeChargeFrameVersionCqCollection")
  private List<TradeChargeFrameVersionCq> tradeChargeFrameVersionCqCollection = new ArrayList<TradeChargeFrameVersionCq>();

  public TradeChargeFrameDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TradeChargeFrameDetailsQueryResult addTradeChargeFrameVersionCqCollectionItem(TradeChargeFrameVersionCq tradeChargeFrameVersionCqCollectionItem) {
    this.tradeChargeFrameVersionCqCollection.add(tradeChargeFrameVersionCqCollectionItem);
    return this;
  }

  public List<TradeChargeFrameVersionCq> getTradeChargeFrameVersionCqCollection() {
    return tradeChargeFrameVersionCqCollection;
  }

  public void setTradeChargeFrameVersionCqCollection(List<TradeChargeFrameVersionCq> tradeChargeFrameVersionCqCollection) {
    this.tradeChargeFrameVersionCqCollection = tradeChargeFrameVersionCqCollection;
  }
}

