package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPaymentProfileOptionsQueryTopSsPaymentProfileOptionsQueryResult implements Serializable {
  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;


  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }
}

