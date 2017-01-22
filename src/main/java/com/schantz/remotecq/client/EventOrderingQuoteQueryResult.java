package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EventOrderingQuoteQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("inclusionGroupCollection")
  private List<EventInclusionGroupCq> inclusionGroupCollection = new ArrayList<EventInclusionGroupCq>();

  public EventOrderingQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public EventOrderingQuoteQueryResult addInclusionGroupCollectionItem(EventInclusionGroupCq inclusionGroupCollectionItem) {
    this.inclusionGroupCollection.add(inclusionGroupCollectionItem);
    return this;
  }

  public List<EventInclusionGroupCq> getInclusionGroupCollection() {
    return inclusionGroupCollection;
  }

  public void setInclusionGroupCollection(List<EventInclusionGroupCq> inclusionGroupCollection) {
    this.inclusionGroupCollection = inclusionGroupCollection;
  }
}

