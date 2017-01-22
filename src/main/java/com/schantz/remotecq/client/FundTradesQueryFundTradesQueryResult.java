package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class FundTradesQueryFundTradesQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("portfolioIdCollection")
  private List<PortfolioIdCq> portfolioIdCollection = new ArrayList<PortfolioIdCq>();

  @JsonProperty("portfolioId")
  private PortfolioIdCq portfolioId = null;

  @JsonProperty("fundId")
  private FundIdCq fundId = null;


  public OffsetDateTime getViewAtTime() {
    return viewAtTime;
  }

  public void setViewAtTime(OffsetDateTime viewAtTime) {
    this.viewAtTime = viewAtTime;
  }
  public FundTradesQueryFundTradesQueryResult addPortfolioIdCollectionItem(PortfolioIdCq portfolioIdCollectionItem) {
    this.portfolioIdCollection.add(portfolioIdCollectionItem);
    return this;
  }

  public List<PortfolioIdCq> getPortfolioIdCollection() {
    return portfolioIdCollection;
  }

  public void setPortfolioIdCollection(List<PortfolioIdCq> portfolioIdCollection) {
    this.portfolioIdCollection = portfolioIdCollection;
  }

  public PortfolioIdCq getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(PortfolioIdCq portfolioId) {
    this.portfolioId = portfolioId;
  }

  public FundIdCq getFundId() {
    return fundId;
  }

  public void setFundId(FundIdCq fundId) {
    this.fundId = fundId;
  }
}

