package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TargetSplitPortfolioQueryTargetSplitPortfolioQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("portfolioId")
  private PortfolioIdCq portfolioId = null;

  @JsonProperty("isHistoricDetails")
  private Boolean isHistoricDetails = false;


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

  public Boolean getIsHistoricDetails() {
    return isHistoricDetails;
  }

  public void setIsHistoricDetails(Boolean isHistoricDetails) {
    this.isHistoricDetails = isHistoricDetails;
  }
}

