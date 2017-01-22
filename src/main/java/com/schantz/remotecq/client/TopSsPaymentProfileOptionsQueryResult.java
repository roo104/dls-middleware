package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPaymentProfileOptionsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("fundSelectCqCollection")
  private List<FundSelectCq> fundSelectCqCollection = new ArrayList<FundSelectCq>();

  public TopSsPaymentProfileOptionsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsPaymentProfileOptionsQueryResult addFundSelectCqCollectionItem(FundSelectCq fundSelectCqCollectionItem) {
    this.fundSelectCqCollection.add(fundSelectCqCollectionItem);
    return this;
  }

  public List<FundSelectCq> getFundSelectCqCollection() {
    return fundSelectCqCollection;
  }

  public void setFundSelectCqCollection(List<FundSelectCq> fundSelectCqCollection) {
    this.fundSelectCqCollection = fundSelectCqCollection;
  }
}

