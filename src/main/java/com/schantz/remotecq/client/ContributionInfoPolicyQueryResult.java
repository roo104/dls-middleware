package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionInfoPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("contributionParameterInfoCqCollection")
  private List<ContributionParameterInfoCq> contributionParameterInfoCqCollection = new ArrayList<ContributionParameterInfoCq>();

  @JsonProperty("historicContributionParameterInfoCqCollection")
  private List<ContributionParameterHistoryCq> historicContributionParameterInfoCqCollection = new ArrayList<ContributionParameterHistoryCq>();

  public ContributionInfoPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ContributionInfoPolicyQueryResult addContributionParameterInfoCqCollectionItem(ContributionParameterInfoCq contributionParameterInfoCqCollectionItem) {
    this.contributionParameterInfoCqCollection.add(contributionParameterInfoCqCollectionItem);
    return this;
  }

  public List<ContributionParameterInfoCq> getContributionParameterInfoCqCollection() {
    return contributionParameterInfoCqCollection;
  }

  public void setContributionParameterInfoCqCollection(List<ContributionParameterInfoCq> contributionParameterInfoCqCollection) {
    this.contributionParameterInfoCqCollection = contributionParameterInfoCqCollection;
  }
  public ContributionInfoPolicyQueryResult addHistoricContributionParameterInfoCqCollectionItem(ContributionParameterHistoryCq historicContributionParameterInfoCqCollectionItem) {
    this.historicContributionParameterInfoCqCollection.add(historicContributionParameterInfoCqCollectionItem);
    return this;
  }

  public List<ContributionParameterHistoryCq> getHistoricContributionParameterInfoCqCollection() {
    return historicContributionParameterInfoCqCollection;
  }

  public void setHistoricContributionParameterInfoCqCollection(List<ContributionParameterHistoryCq> historicContributionParameterInfoCqCollection) {
    this.historicContributionParameterInfoCqCollection = historicContributionParameterInfoCqCollection;
  }
}

