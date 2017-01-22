package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BasicInfoPortfolioQueryBasicInfoPortfolioQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("portfolioIdCollection")
  private List<PortfolioIdCq> portfolioIdCollection = new ArrayList<PortfolioIdCq>();

  @JsonProperty("isHistoricDetails")
  private Boolean isHistoricDetails = false;


  public OffsetDateTime getViewAtTime() {
    return viewAtTime;
  }

  public void setViewAtTime(OffsetDateTime viewAtTime) {
    this.viewAtTime = viewAtTime;
  }
  public BasicInfoPortfolioQueryBasicInfoPortfolioQueryResult addPortfolioIdCollectionItem(PortfolioIdCq portfolioIdCollectionItem) {
    this.portfolioIdCollection.add(portfolioIdCollectionItem);
    return this;
  }

  public List<PortfolioIdCq> getPortfolioIdCollection() {
    return portfolioIdCollection;
  }

  public void setPortfolioIdCollection(List<PortfolioIdCq> portfolioIdCollection) {
    this.portfolioIdCollection = portfolioIdCollection;
  }

  public Boolean getIsHistoricDetails() {
    return isHistoricDetails;
  }

  public void setIsHistoricDetails(Boolean isHistoricDetails) {
    this.isHistoricDetails = isHistoricDetails;
  }
}

