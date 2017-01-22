package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class StopPaymentEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private StopPaymentEventCq eventCq = null;

  @JsonProperty("stopPaymentAnnexSpecCqCollection")
  private List<StopPaymentAnnexSpecCq> stopPaymentAnnexSpecCqCollection = new ArrayList<StopPaymentAnnexSpecCq>();

  @JsonProperty("actualizedEventQueryInfoCollection")
  private List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection = new ArrayList<ActualizedEventQueryInfo>();

  public StopPaymentEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public StopPaymentEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(StopPaymentEventCq eventCq) {
    this.eventCq = eventCq;
  }
  public StopPaymentEventQueryResult addStopPaymentAnnexSpecCqCollectionItem(StopPaymentAnnexSpecCq stopPaymentAnnexSpecCqCollectionItem) {
    this.stopPaymentAnnexSpecCqCollection.add(stopPaymentAnnexSpecCqCollectionItem);
    return this;
  }

  public List<StopPaymentAnnexSpecCq> getStopPaymentAnnexSpecCqCollection() {
    return stopPaymentAnnexSpecCqCollection;
  }

  public void setStopPaymentAnnexSpecCqCollection(List<StopPaymentAnnexSpecCq> stopPaymentAnnexSpecCqCollection) {
    this.stopPaymentAnnexSpecCqCollection = stopPaymentAnnexSpecCqCollection;
  }
  public StopPaymentEventQueryResult addActualizedEventQueryInfoCollectionItem(ActualizedEventQueryInfo actualizedEventQueryInfoCollectionItem) {
    this.actualizedEventQueryInfoCollection.add(actualizedEventQueryInfoCollectionItem);
    return this;
  }

  public List<ActualizedEventQueryInfo> getActualizedEventQueryInfoCollection() {
    return actualizedEventQueryInfoCollection;
  }

  public void setActualizedEventQueryInfoCollection(List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection) {
    this.actualizedEventQueryInfoCollection = actualizedEventQueryInfoCollection;
  }
}

