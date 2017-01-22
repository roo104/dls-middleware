package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioInfoEntryCq implements Serializable {
  @JsonProperty("portfolioOwnerCq")
  private PortfolioOwnerCq portfolioOwnerCq = null;

  @JsonProperty("portfolioRuleFrameIdCq")
  private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;

  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;


  public PortfolioOwnerCq getPortfolioOwnerCq() {
    return portfolioOwnerCq;
  }

  public void setPortfolioOwnerCq(PortfolioOwnerCq portfolioOwnerCq) {
    this.portfolioOwnerCq = portfolioOwnerCq;
  }

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

