package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PartialRetirementEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private PartialRetirementEventCq eventCq = null;

  @JsonProperty("partialRetirementAnnexSpecCqCollection")
  private List<PartialRetirementAnnexSpecCq> partialRetirementAnnexSpecCqCollection = new ArrayList<PartialRetirementAnnexSpecCq>();

  @JsonProperty("actualizedEventQueryInfoCollection")
  private List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection = new ArrayList<ActualizedEventQueryInfo>();

  public PartialRetirementEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public PartialRetirementEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(PartialRetirementEventCq eventCq) {
    this.eventCq = eventCq;
  }
  public PartialRetirementEventQueryResult addPartialRetirementAnnexSpecCqCollectionItem(PartialRetirementAnnexSpecCq partialRetirementAnnexSpecCqCollectionItem) {
    this.partialRetirementAnnexSpecCqCollection.add(partialRetirementAnnexSpecCqCollectionItem);
    return this;
  }

  public List<PartialRetirementAnnexSpecCq> getPartialRetirementAnnexSpecCqCollection() {
    return partialRetirementAnnexSpecCqCollection;
  }

  public void setPartialRetirementAnnexSpecCqCollection(List<PartialRetirementAnnexSpecCq> partialRetirementAnnexSpecCqCollection) {
    this.partialRetirementAnnexSpecCqCollection = partialRetirementAnnexSpecCqCollection;
  }
  public PartialRetirementEventQueryResult addActualizedEventQueryInfoCollectionItem(ActualizedEventQueryInfo actualizedEventQueryInfoCollectionItem) {
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

