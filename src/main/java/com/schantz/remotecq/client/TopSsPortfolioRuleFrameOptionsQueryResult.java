package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPortfolioRuleFrameOptionsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("portfolioRuleFrameIdCqCollection")
  private List<PortfolioRuleFrameIdCq> portfolioRuleFrameIdCqCollection = new ArrayList<PortfolioRuleFrameIdCq>();

  public TopSsPortfolioRuleFrameOptionsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsPortfolioRuleFrameOptionsQueryResult addPortfolioRuleFrameIdCqCollectionItem(PortfolioRuleFrameIdCq portfolioRuleFrameIdCqCollectionItem) {
    this.portfolioRuleFrameIdCqCollection.add(portfolioRuleFrameIdCqCollectionItem);
    return this;
  }

  public List<PortfolioRuleFrameIdCq> getPortfolioRuleFrameIdCqCollection() {
    return portfolioRuleFrameIdCqCollection;
  }

  public void setPortfolioRuleFrameIdCqCollection(List<PortfolioRuleFrameIdCq> portfolioRuleFrameIdCqCollection) {
    this.portfolioRuleFrameIdCqCollection = portfolioRuleFrameIdCqCollection;
  }
}

