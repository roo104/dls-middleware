package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopMovePackageReserveEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private TopMovePackageReserveEventCq eventCq = null;

  @JsonProperty("marketValueAdjustment")
  private Double marketValueAdjustment = null;

  @JsonProperty("packageInfoCollection")
  private List<TopMovePackageEventPackageInfoCq> packageInfoCollection = new ArrayList<TopMovePackageEventPackageInfoCq>();

  public TopMovePackageReserveEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TopMovePackageReserveEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(TopMovePackageReserveEventCq eventCq) {
    this.eventCq = eventCq;
  }

  public Double getMarketValueAdjustment() {
    return marketValueAdjustment;
  }

  public void setMarketValueAdjustment(Double marketValueAdjustment) {
    this.marketValueAdjustment = marketValueAdjustment;
  }
  public TopMovePackageReserveEventQueryResult addPackageInfoCollectionItem(TopMovePackageEventPackageInfoCq packageInfoCollectionItem) {
    this.packageInfoCollection.add(packageInfoCollectionItem);
    return this;
  }

  public List<TopMovePackageEventPackageInfoCq> getPackageInfoCollection() {
    return packageInfoCollection;
  }

  public void setPackageInfoCollection(List<TopMovePackageEventPackageInfoCq> packageInfoCollection) {
    this.packageInfoCollection = packageInfoCollection;
  }
}

