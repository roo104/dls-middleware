package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ActualSplitPortfolioQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("actualFundSplitCqCollection")
  private List<ActualFundSplitCq> actualFundSplitCqCollection = new ArrayList<ActualFundSplitCq>();

  public ActualSplitPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ActualSplitPortfolioQueryResult addActualFundSplitCqCollectionItem(ActualFundSplitCq actualFundSplitCqCollectionItem) {
    this.actualFundSplitCqCollection.add(actualFundSplitCqCollectionItem);
    return this;
  }

  public List<ActualFundSplitCq> getActualFundSplitCqCollection() {
    return actualFundSplitCqCollection;
  }

  public void setActualFundSplitCqCollection(List<ActualFundSplitCq> actualFundSplitCqCollection) {
    this.actualFundSplitCqCollection = actualFundSplitCqCollection;
  }
}

