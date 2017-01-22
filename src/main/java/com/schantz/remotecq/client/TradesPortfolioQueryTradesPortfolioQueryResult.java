package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TradesPortfolioQueryTradesPortfolioQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("portfolioId")
  private PortfolioIdCq portfolioId = null;

  @JsonProperty("maxExecutedTradesCount")
  private Long maxExecutedTradesCount = null;


  public OffsetDateTime getViewAtTime() {
    return viewAtTime;
  }

  public void setViewAtTime(OffsetDateTime viewAtTime) {
    this.viewAtTime = viewAtTime;
  }

  public PortfolioIdCq getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(PortfolioIdCq portfolioId) {
    this.portfolioId = portfolioId;
  }

  public Long getMaxExecutedTradesCount() {
    return maxExecutedTradesCount;
  }

  public void setMaxExecutedTradesCount(Long maxExecutedTradesCount) {
    this.maxExecutedTradesCount = maxExecutedTradesCount;
  }
}

