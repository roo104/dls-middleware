package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopChangeSettlementFeeEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private TopChangeSettlementFeeEventCq eventCq = null;

  @JsonProperty("policySettlementPeriod")
  private String policySettlementPeriod = null;

  @JsonProperty("topChangeSettlementFeeEventQueryPackageSpecCqCollection")
  private List<TopChangeSettlementFeeEventQueryPackageSpecCq> topChangeSettlementFeeEventQueryPackageSpecCqCollection = new ArrayList<TopChangeSettlementFeeEventQueryPackageSpecCq>();

  public TopChangeSettlementFeeEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TopChangeSettlementFeeEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(TopChangeSettlementFeeEventCq eventCq) {
    this.eventCq = eventCq;
  }

  public String getPolicySettlementPeriod() {
    return policySettlementPeriod;
  }

  public void setPolicySettlementPeriod(String policySettlementPeriod) {
    this.policySettlementPeriod = policySettlementPeriod;
  }
  public TopChangeSettlementFeeEventQueryResult addTopChangeSettlementFeeEventQueryPackageSpecCqCollectionItem(TopChangeSettlementFeeEventQueryPackageSpecCq topChangeSettlementFeeEventQueryPackageSpecCqCollectionItem) {
    this.topChangeSettlementFeeEventQueryPackageSpecCqCollection.add(topChangeSettlementFeeEventQueryPackageSpecCqCollectionItem);
    return this;
  }

  public List<TopChangeSettlementFeeEventQueryPackageSpecCq> getTopChangeSettlementFeeEventQueryPackageSpecCqCollection() {
    return topChangeSettlementFeeEventQueryPackageSpecCqCollection;
  }

  public void setTopChangeSettlementFeeEventQueryPackageSpecCqCollection(List<TopChangeSettlementFeeEventQueryPackageSpecCq> topChangeSettlementFeeEventQueryPackageSpecCqCollection) {
    this.topChangeSettlementFeeEventQueryPackageSpecCqCollection = topChangeSettlementFeeEventQueryPackageSpecCqCollection;
  }
}

