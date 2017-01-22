package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HumanTaskInstanceFilterQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("humanTaskInstanceFilterCqCollection")
  private List<HumanTaskInstanceFilterCq> humanTaskInstanceFilterCqCollection = new ArrayList<HumanTaskInstanceFilterCq>();

  public HumanTaskInstanceFilterQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public HumanTaskInstanceFilterQueryResult addHumanTaskInstanceFilterCqCollectionItem(HumanTaskInstanceFilterCq humanTaskInstanceFilterCqCollectionItem) {
    this.humanTaskInstanceFilterCqCollection.add(humanTaskInstanceFilterCqCollectionItem);
    return this;
  }

  public List<HumanTaskInstanceFilterCq> getHumanTaskInstanceFilterCqCollection() {
    return humanTaskInstanceFilterCqCollection;
  }

  public void setHumanTaskInstanceFilterCqCollection(List<HumanTaskInstanceFilterCq> humanTaskInstanceFilterCqCollection) {
    this.humanTaskInstanceFilterCqCollection = humanTaskInstanceFilterCqCollection;
  }
}

