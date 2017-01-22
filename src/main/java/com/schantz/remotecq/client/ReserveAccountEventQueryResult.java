package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ReserveAccountEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("reserveAccountGroupCqCollection")
  private List<ReserveAccountGroupCq> reserveAccountGroupCqCollection = new ArrayList<ReserveAccountGroupCq>();

  public ReserveAccountEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ReserveAccountEventQueryResult addReserveAccountGroupCqCollectionItem(ReserveAccountGroupCq reserveAccountGroupCqCollectionItem) {
    this.reserveAccountGroupCqCollection.add(reserveAccountGroupCqCollectionItem);
    return this;
  }

  public List<ReserveAccountGroupCq> getReserveAccountGroupCqCollection() {
    return reserveAccountGroupCqCollection;
  }

  public void setReserveAccountGroupCqCollection(List<ReserveAccountGroupCq> reserveAccountGroupCqCollection) {
    this.reserveAccountGroupCqCollection = reserveAccountGroupCqCollection;
  }
}

