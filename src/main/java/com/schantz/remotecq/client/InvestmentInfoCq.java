package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class InvestmentInfoCq implements Serializable {
  @JsonProperty("portfolioOwnerCq")
  private PortfolioOwnerCq portfolioOwnerCq = null;

  @JsonProperty("actualFundSplitCqCollection")
  private List<ActualFundSplitCq> actualFundSplitCqCollection = new ArrayList<ActualFundSplitCq>();

  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;


  public PortfolioOwnerCq getPortfolioOwnerCq() {
    return portfolioOwnerCq;
  }

  public void setPortfolioOwnerCq(PortfolioOwnerCq portfolioOwnerCq) {
    this.portfolioOwnerCq = portfolioOwnerCq;
  }
  public InvestmentInfoCq addActualFundSplitCqCollectionItem(ActualFundSplitCq actualFundSplitCqCollectionItem) {
    this.actualFundSplitCqCollection.add(actualFundSplitCqCollectionItem);
    return this;
  }

  public List<ActualFundSplitCq> getActualFundSplitCqCollection() {
    return actualFundSplitCqCollection;
  }

  public void setActualFundSplitCqCollection(List<ActualFundSplitCq> actualFundSplitCqCollection) {
    this.actualFundSplitCqCollection = actualFundSplitCqCollection;
  }

  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }
}

