package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class FundTradesQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("fundTradeCqCollection")
  private List<FundTradeCq> fundTradeCqCollection = new ArrayList<FundTradeCq>();

  public FundTradesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public FundTradesQueryResult addFundTradeCqCollectionItem(FundTradeCq fundTradeCqCollectionItem) {
    this.fundTradeCqCollection.add(fundTradeCqCollectionItem);
    return this;
  }

  public List<FundTradeCq> getFundTradeCqCollection() {
    return fundTradeCqCollection;
  }

  public void setFundTradeCqCollection(List<FundTradeCq> fundTradeCqCollection) {
    this.fundTradeCqCollection = fundTradeCqCollection;
  }
}

