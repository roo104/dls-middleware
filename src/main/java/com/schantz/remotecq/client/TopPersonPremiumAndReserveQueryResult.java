package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopPersonPremiumAndReserveQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("topPersonPremiumAndReserveInfoCollection")
  private List<TopPersonPremiumAndReserveInfo> topPersonPremiumAndReserveInfoCollection = new ArrayList<TopPersonPremiumAndReserveInfo>();

  public TopPersonPremiumAndReserveQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopPersonPremiumAndReserveQueryResult addTopPersonPremiumAndReserveInfoCollectionItem(TopPersonPremiumAndReserveInfo topPersonPremiumAndReserveInfoCollectionItem) {
    this.topPersonPremiumAndReserveInfoCollection.add(topPersonPremiumAndReserveInfoCollectionItem);
    return this;
  }

  public List<TopPersonPremiumAndReserveInfo> getTopPersonPremiumAndReserveInfoCollection() {
    return topPersonPremiumAndReserveInfoCollection;
  }

  public void setTopPersonPremiumAndReserveInfoCollection(List<TopPersonPremiumAndReserveInfo> topPersonPremiumAndReserveInfoCollection) {
    this.topPersonPremiumAndReserveInfoCollection = topPersonPremiumAndReserveInfoCollection;
  }
}

