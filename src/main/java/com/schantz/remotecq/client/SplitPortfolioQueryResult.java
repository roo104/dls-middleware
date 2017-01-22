package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class SplitPortfolioQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("fundSplitCqCollection")
  private List<FundSplitCq> fundSplitCqCollection = new ArrayList<FundSplitCq>();

  public SplitPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public SplitPortfolioQueryResult addFundSplitCqCollectionItem(FundSplitCq fundSplitCqCollectionItem) {
    this.fundSplitCqCollection.add(fundSplitCqCollectionItem);
    return this;
  }

  public List<FundSplitCq> getFundSplitCqCollection() {
    return fundSplitCqCollection;
  }

  public void setFundSplitCqCollection(List<FundSplitCq> fundSplitCqCollection) {
    this.fundSplitCqCollection = fundSplitCqCollection;
  }
}

