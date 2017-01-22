package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BulkOnHoldUpdateResultQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("bulkOnHoldUpdateResultDataCqCollection")
  private List<BulkOnHoldUpdateResultDataCq> bulkOnHoldUpdateResultDataCqCollection = new ArrayList<BulkOnHoldUpdateResultDataCq>();

  public BulkOnHoldUpdateResultQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public BulkOnHoldUpdateResultQueryResult addBulkOnHoldUpdateResultDataCqCollectionItem(BulkOnHoldUpdateResultDataCq bulkOnHoldUpdateResultDataCqCollectionItem) {
    this.bulkOnHoldUpdateResultDataCqCollection.add(bulkOnHoldUpdateResultDataCqCollectionItem);
    return this;
  }

  public List<BulkOnHoldUpdateResultDataCq> getBulkOnHoldUpdateResultDataCqCollection() {
    return bulkOnHoldUpdateResultDataCqCollection;
  }

  public void setBulkOnHoldUpdateResultDataCqCollection(List<BulkOnHoldUpdateResultDataCq> bulkOnHoldUpdateResultDataCqCollection) {
    this.bulkOnHoldUpdateResultDataCqCollection = bulkOnHoldUpdateResultDataCqCollection;
  }
}

