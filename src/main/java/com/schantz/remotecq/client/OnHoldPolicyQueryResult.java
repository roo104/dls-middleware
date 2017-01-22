package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class OnHoldPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("currentCollection")
  private List<OnHoldCq> currentCollection = new ArrayList<OnHoldCq>();

  @JsonProperty("historicCollection")
  private List<OnHoldCq> historicCollection = new ArrayList<OnHoldCq>();

  public OnHoldPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public OnHoldPolicyQueryResult addCurrentCollectionItem(OnHoldCq currentCollectionItem) {
    this.currentCollection.add(currentCollectionItem);
    return this;
  }

  public List<OnHoldCq> getCurrentCollection() {
    return currentCollection;
  }

  public void setCurrentCollection(List<OnHoldCq> currentCollection) {
    this.currentCollection = currentCollection;
  }
  public OnHoldPolicyQueryResult addHistoricCollectionItem(OnHoldCq historicCollectionItem) {
    this.historicCollection.add(historicCollectionItem);
    return this;
  }

  public List<OnHoldCq> getHistoricCollection() {
    return historicCollection;
  }

  public void setHistoricCollection(List<OnHoldCq> historicCollection) {
    this.historicCollection = historicCollection;
  }
}

