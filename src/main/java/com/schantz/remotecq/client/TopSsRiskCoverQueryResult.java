package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsRiskCoverQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("riskCoverDataCollection")
  private List<TopSsRiskCoverData> riskCoverDataCollection = new ArrayList<TopSsRiskCoverData>();

  public TopSsRiskCoverQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsRiskCoverQueryResult addRiskCoverDataCollectionItem(TopSsRiskCoverData riskCoverDataCollectionItem) {
    this.riskCoverDataCollection.add(riskCoverDataCollectionItem);
    return this;
  }

  public List<TopSsRiskCoverData> getRiskCoverDataCollection() {
    return riskCoverDataCollection;
  }

  public void setRiskCoverDataCollection(List<TopSsRiskCoverData> riskCoverDataCollection) {
    this.riskCoverDataCollection = riskCoverDataCollection;
  }
}

