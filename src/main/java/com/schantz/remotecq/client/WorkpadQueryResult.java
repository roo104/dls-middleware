package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class WorkpadQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("oiAccountItemCqCollection")
  private List<OiAccountItemCq> oiAccountItemCqCollection = new ArrayList<OiAccountItemCq>();

  @JsonProperty("reserveAccountItemCqCollection")
  private List<ReserveAccountItemCq> reserveAccountItemCqCollection = new ArrayList<ReserveAccountItemCq>();

  public WorkpadQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public WorkpadQueryResult addOiAccountItemCqCollectionItem(OiAccountItemCq oiAccountItemCqCollectionItem) {
    this.oiAccountItemCqCollection.add(oiAccountItemCqCollectionItem);
    return this;
  }

  public List<OiAccountItemCq> getOiAccountItemCqCollection() {
    return oiAccountItemCqCollection;
  }

  public void setOiAccountItemCqCollection(List<OiAccountItemCq> oiAccountItemCqCollection) {
    this.oiAccountItemCqCollection = oiAccountItemCqCollection;
  }
  public WorkpadQueryResult addReserveAccountItemCqCollectionItem(ReserveAccountItemCq reserveAccountItemCqCollectionItem) {
    this.reserveAccountItemCqCollection.add(reserveAccountItemCqCollectionItem);
    return this;
  }

  public List<ReserveAccountItemCq> getReserveAccountItemCqCollection() {
    return reserveAccountItemCqCollection;
  }

  public void setReserveAccountItemCqCollection(List<ReserveAccountItemCq> reserveAccountItemCqCollection) {
    this.reserveAccountItemCqCollection = reserveAccountItemCqCollection;
  }
}

