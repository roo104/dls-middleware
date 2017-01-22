package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TradesPortfolioQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("executedTradesCollection")
  private List<TradePortfolioCq> executedTradesCollection = new ArrayList<TradePortfolioCq>();

  @JsonProperty("nonExecutedTradesCollection")
  private List<TradePortfolioCq> nonExecutedTradesCollection = new ArrayList<TradePortfolioCq>();

  public TradesPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TradesPortfolioQueryResult addExecutedTradesCollectionItem(TradePortfolioCq executedTradesCollectionItem) {
    this.executedTradesCollection.add(executedTradesCollectionItem);
    return this;
  }

  public List<TradePortfolioCq> getExecutedTradesCollection() {
    return executedTradesCollection;
  }

  public void setExecutedTradesCollection(List<TradePortfolioCq> executedTradesCollection) {
    this.executedTradesCollection = executedTradesCollection;
  }
  public TradesPortfolioQueryResult addNonExecutedTradesCollectionItem(TradePortfolioCq nonExecutedTradesCollectionItem) {
    this.nonExecutedTradesCollection.add(nonExecutedTradesCollectionItem);
    return this;
  }

  public List<TradePortfolioCq> getNonExecutedTradesCollection() {
    return nonExecutedTradesCollection;
  }

  public void setNonExecutedTradesCollection(List<TradePortfolioCq> nonExecutedTradesCollection) {
    this.nonExecutedTradesCollection = nonExecutedTradesCollection;
  }
}

