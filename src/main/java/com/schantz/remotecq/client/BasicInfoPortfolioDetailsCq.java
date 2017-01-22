package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BasicInfoPortfolioDetailsCq implements Serializable {
  @JsonProperty("rebalancingFrequency")
  private String rebalancingFrequency = null;

  @JsonProperty("portfolioRuleFrameId")
  private PortfolioRuleFrameIdCq portfolioRuleFrameId = null;

  @JsonProperty("portfolioRuleVersionInfoCq")
  private PortfolioRuleVersionInfoCq portfolioRuleVersionInfoCq = null;

  @JsonProperty("isLifeCycle")
  private Boolean isLifeCycle = false;


  public String getRebalancingFrequency() {
    return rebalancingFrequency;
  }

  public void setRebalancingFrequency(String rebalancingFrequency) {
    this.rebalancingFrequency = rebalancingFrequency;
  }

  public PortfolioRuleFrameIdCq getPortfolioRuleFrameId() {
    return portfolioRuleFrameId;
  }

  public void setPortfolioRuleFrameId(PortfolioRuleFrameIdCq portfolioRuleFrameId) {
    this.portfolioRuleFrameId = portfolioRuleFrameId;
  }

  public PortfolioRuleVersionInfoCq getPortfolioRuleVersionInfoCq() {
    return portfolioRuleVersionInfoCq;
  }

  public void setPortfolioRuleVersionInfoCq(PortfolioRuleVersionInfoCq portfolioRuleVersionInfoCq) {
    this.portfolioRuleVersionInfoCq = portfolioRuleVersionInfoCq;
  }

  public Boolean getIsLifeCycle() {
    return isLifeCycle;
  }

  public void setIsLifeCycle(Boolean isLifeCycle) {
    this.isLifeCycle = isLifeCycle;
  }
}

