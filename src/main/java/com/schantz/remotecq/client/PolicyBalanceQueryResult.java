package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyBalanceQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("currentBalance")
  private Double currentBalance = null;

  @JsonProperty("interestYearToDate")
  private Double interestYearToDate = null;

  public PolicyBalanceQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Double getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(Double currentBalance) {
    this.currentBalance = currentBalance;
  }

  public Double getInterestYearToDate() {
    return interestYearToDate;
  }

  public void setInterestYearToDate(Double interestYearToDate) {
    this.interestYearToDate = interestYearToDate;
  }
}

