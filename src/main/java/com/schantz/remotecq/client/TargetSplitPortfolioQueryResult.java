package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TargetSplitPortfolioQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("currentDetails")
  private TargetSplitPortfolioDetails currentDetails = null;

  @JsonProperty("historicDetailsCollection")
  private List<TargetSplitPortfolioDetails> historicDetailsCollection = new ArrayList<TargetSplitPortfolioDetails>();

  public TargetSplitPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TargetSplitPortfolioDetails getCurrentDetails() {
    return currentDetails;
  }

  public void setCurrentDetails(TargetSplitPortfolioDetails currentDetails) {
    this.currentDetails = currentDetails;
  }
  public TargetSplitPortfolioQueryResult addHistoricDetailsCollectionItem(TargetSplitPortfolioDetails historicDetailsCollectionItem) {
    this.historicDetailsCollection.add(historicDetailsCollectionItem);
    return this;
  }

  public List<TargetSplitPortfolioDetails> getHistoricDetailsCollection() {
    return historicDetailsCollection;
  }

  public void setHistoricDetailsCollection(List<TargetSplitPortfolioDetails> historicDetailsCollection) {
    this.historicDetailsCollection = historicDetailsCollection;
  }
}

