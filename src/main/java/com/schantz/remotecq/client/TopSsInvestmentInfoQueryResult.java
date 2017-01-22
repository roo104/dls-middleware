package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsInvestmentInfoQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("investmentInfoCqCollection")
  private List<InvestmentInfoCq> investmentInfoCqCollection = new ArrayList<InvestmentInfoCq>();

  public TopSsInvestmentInfoQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsInvestmentInfoQueryResult addInvestmentInfoCqCollectionItem(InvestmentInfoCq investmentInfoCqCollectionItem) {
    this.investmentInfoCqCollection.add(investmentInfoCqCollectionItem);
    return this;
  }

  public List<InvestmentInfoCq> getInvestmentInfoCqCollection() {
    return investmentInfoCqCollection;
  }

  public void setInvestmentInfoCqCollection(List<InvestmentInfoCq> investmentInfoCqCollection) {
    this.investmentInfoCqCollection = investmentInfoCqCollection;
  }
}

