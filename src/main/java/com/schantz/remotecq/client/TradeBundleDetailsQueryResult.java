package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TradeBundleDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("tradeBundleFundDetailsCqCollection")
  private List<TradeBundleFundDetailsCq> tradeBundleFundDetailsCqCollection = new ArrayList<TradeBundleFundDetailsCq>();

  public TradeBundleDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TradeBundleDetailsQueryResult addTradeBundleFundDetailsCqCollectionItem(TradeBundleFundDetailsCq tradeBundleFundDetailsCqCollectionItem) {
    this.tradeBundleFundDetailsCqCollection.add(tradeBundleFundDetailsCqCollectionItem);
    return this;
  }

  public List<TradeBundleFundDetailsCq> getTradeBundleFundDetailsCqCollection() {
    return tradeBundleFundDetailsCqCollection;
  }

  public void setTradeBundleFundDetailsCqCollection(List<TradeBundleFundDetailsCq> tradeBundleFundDetailsCqCollection) {
    this.tradeBundleFundDetailsCqCollection = tradeBundleFundDetailsCqCollection;
  }
}

