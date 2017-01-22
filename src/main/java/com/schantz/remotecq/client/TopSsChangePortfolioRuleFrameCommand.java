package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsChangePortfolioRuleFrameCommand implements Serializable {
  @JsonProperty("portfolioRuleFrameIdCq")
  private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;

  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;


  public PortfolioRuleFrameIdCq getPortfolioRuleFrameIdCq() {
    return portfolioRuleFrameIdCq;
  }

  public void setPortfolioRuleFrameIdCq(PortfolioRuleFrameIdCq portfolioRuleFrameIdCq) {
    this.portfolioRuleFrameIdCq = portfolioRuleFrameIdCq;
  }

  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }
}

