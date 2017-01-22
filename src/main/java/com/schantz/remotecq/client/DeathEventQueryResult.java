package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DeathEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private DeathEventCq eventCq = null;

  @JsonProperty("deathAnnexSpecCqCollection")
  private List<DeathAnnexSpecCq> deathAnnexSpecCqCollection = new ArrayList<DeathAnnexSpecCq>();

  @JsonProperty("actualizedEventQueryInfoCollection")
  private List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection = new ArrayList<ActualizedEventQueryInfo>();

  public DeathEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DeathEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DeathEventCq eventCq) {
    this.eventCq = eventCq;
  }
  public DeathEventQueryResult addDeathAnnexSpecCqCollectionItem(DeathAnnexSpecCq deathAnnexSpecCqCollectionItem) {
    this.deathAnnexSpecCqCollection.add(deathAnnexSpecCqCollectionItem);
    return this;
  }

  public List<DeathAnnexSpecCq> getDeathAnnexSpecCqCollection() {
    return deathAnnexSpecCqCollection;
  }

  public void setDeathAnnexSpecCqCollection(List<DeathAnnexSpecCq> deathAnnexSpecCqCollection) {
    this.deathAnnexSpecCqCollection = deathAnnexSpecCqCollection;
  }
  public DeathEventQueryResult addActualizedEventQueryInfoCollectionItem(ActualizedEventQueryInfo actualizedEventQueryInfoCollectionItem) {
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

