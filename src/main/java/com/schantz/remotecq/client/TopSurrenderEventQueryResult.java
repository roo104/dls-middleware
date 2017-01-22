package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSurrenderEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private SurrenderEventCq eventCq = null;

  @JsonProperty("surrenderAnnexSpecCqCollection")
  private List<SurrenderAnnexSpecCq> surrenderAnnexSpecCqCollection = new ArrayList<SurrenderAnnexSpecCq>();

  @JsonProperty("surrenderEventPalCq")
  private SurrenderEventPalCq surrenderEventPalCq = null;

  @JsonProperty("topAnnexTotals")
  private SurrenderAnnexSpecCq topAnnexTotals = null;

  public TopSurrenderEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public SurrenderEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(SurrenderEventCq eventCq) {
    this.eventCq = eventCq;
  }
  public TopSurrenderEventQueryResult addSurrenderAnnexSpecCqCollectionItem(SurrenderAnnexSpecCq surrenderAnnexSpecCqCollectionItem) {
    this.surrenderAnnexSpecCqCollection.add(surrenderAnnexSpecCqCollectionItem);
    return this;
  }

  public List<SurrenderAnnexSpecCq> getSurrenderAnnexSpecCqCollection() {
    return surrenderAnnexSpecCqCollection;
  }

  public void setSurrenderAnnexSpecCqCollection(List<SurrenderAnnexSpecCq> surrenderAnnexSpecCqCollection) {
    this.surrenderAnnexSpecCqCollection = surrenderAnnexSpecCqCollection;
  }

  public SurrenderEventPalCq getSurrenderEventPalCq() {
    return surrenderEventPalCq;
  }

  public void setSurrenderEventPalCq(SurrenderEventPalCq surrenderEventPalCq) {
    this.surrenderEventPalCq = surrenderEventPalCq;
  }

  public SurrenderAnnexSpecCq getTopAnnexTotals() {
    return topAnnexTotals;
  }

  public void setTopAnnexTotals(SurrenderAnnexSpecCq topAnnexTotals) {
    this.topAnnexTotals = topAnnexTotals;
  }
}

