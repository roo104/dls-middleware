package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionPolicyHistoryQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("commissionDataHistoryCqCollection")
  private List<CommissionDataHistoryCq> commissionDataHistoryCqCollection = new ArrayList<CommissionDataHistoryCq>();

  public CommissionPolicyHistoryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public CommissionPolicyHistoryQueryResult addCommissionDataHistoryCqCollectionItem(CommissionDataHistoryCq commissionDataHistoryCqCollectionItem) {
    this.commissionDataHistoryCqCollection.add(commissionDataHistoryCqCollectionItem);
    return this;
  }

  public List<CommissionDataHistoryCq> getCommissionDataHistoryCqCollection() {
    return commissionDataHistoryCqCollection;
  }

  public void setCommissionDataHistoryCqCollection(List<CommissionDataHistoryCq> commissionDataHistoryCqCollection) {
    this.commissionDataHistoryCqCollection = commissionDataHistoryCqCollection;
  }
}

