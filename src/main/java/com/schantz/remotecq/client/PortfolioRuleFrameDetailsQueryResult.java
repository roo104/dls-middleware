package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioRuleFrameDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("portfolioRuleFrameCq")
  private PortfolioRuleFrameCq portfolioRuleFrameCq = null;

  public PortfolioRuleFrameDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public PortfolioRuleFrameCq getPortfolioRuleFrameCq() {
    return portfolioRuleFrameCq;
  }

  public void setPortfolioRuleFrameCq(PortfolioRuleFrameCq portfolioRuleFrameCq) {
    this.portfolioRuleFrameCq = portfolioRuleFrameCq;
  }
}

