package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TradeBundleOverviewQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("tradeBundleDataCqCollection")
  private List<TradeBundleDataCq> tradeBundleDataCqCollection = new ArrayList<TradeBundleDataCq>();

  public TradeBundleOverviewQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TradeBundleOverviewQueryResult addTradeBundleDataCqCollectionItem(TradeBundleDataCq tradeBundleDataCqCollectionItem) {
    this.tradeBundleDataCqCollection.add(tradeBundleDataCqCollectionItem);
    return this;
  }

  public List<TradeBundleDataCq> getTradeBundleDataCqCollection() {
    return tradeBundleDataCqCollection;
  }

  public void setTradeBundleDataCqCollection(List<TradeBundleDataCq> tradeBundleDataCqCollection) {
    this.tradeBundleDataCqCollection = tradeBundleDataCqCollection;
  }
}

