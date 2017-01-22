package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsContributionInfoPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("topContributionParameterInfoCqCollection")
  private List<TopContributionParameterInfoCq> topContributionParameterInfoCqCollection = new ArrayList<TopContributionParameterInfoCq>();

  public TopSsContributionInfoPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsContributionInfoPolicyQueryResult addTopContributionParameterInfoCqCollectionItem(TopContributionParameterInfoCq topContributionParameterInfoCqCollectionItem) {
    this.topContributionParameterInfoCqCollection.add(topContributionParameterInfoCqCollectionItem);
    return this;
  }

  public List<TopContributionParameterInfoCq> getTopContributionParameterInfoCqCollection() {
    return topContributionParameterInfoCqCollection;
  }

  public void setTopContributionParameterInfoCqCollection(List<TopContributionParameterInfoCq> topContributionParameterInfoCqCollection) {
    this.topContributionParameterInfoCqCollection = topContributionParameterInfoCqCollection;
  }
}

