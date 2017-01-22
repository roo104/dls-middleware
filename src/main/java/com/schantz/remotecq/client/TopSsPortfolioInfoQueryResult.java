package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPortfolioInfoQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("portfolioInfoEntryCqCollection")
  private List<PortfolioInfoEntryCq> portfolioInfoEntryCqCollection = new ArrayList<PortfolioInfoEntryCq>();

  public TopSsPortfolioInfoQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsPortfolioInfoQueryResult addPortfolioInfoEntryCqCollectionItem(PortfolioInfoEntryCq portfolioInfoEntryCqCollectionItem) {
    this.portfolioInfoEntryCqCollection.add(portfolioInfoEntryCqCollectionItem);
    return this;
  }

  public List<PortfolioInfoEntryCq> getPortfolioInfoEntryCqCollection() {
    return portfolioInfoEntryCqCollection;
  }

  public void setPortfolioInfoEntryCqCollection(List<PortfolioInfoEntryCq> portfolioInfoEntryCqCollection) {
    this.portfolioInfoEntryCqCollection = portfolioInfoEntryCqCollection;
  }
}

