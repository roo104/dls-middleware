package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioEntryCq implements Serializable {
  @JsonProperty("lifeCycle")
  private Boolean lifeCycle = false;

  @JsonProperty("portfolioId")
  private PortfolioIdCq portfolioId = null;


  public Boolean getLifeCycle() {
    return lifeCycle;
  }

  public void setLifeCycle(Boolean lifeCycle) {
    this.lifeCycle = lifeCycle;
  }

  public PortfolioIdCq getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(PortfolioIdCq portfolioId) {
    this.portfolioId = portfolioId;
  }
}

