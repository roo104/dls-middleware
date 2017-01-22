package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionStateQuoteQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("contributionParameterHistoryCqCollection")
  private List<ContributionParameterHistoryCq> contributionParameterHistoryCqCollection = new ArrayList<ContributionParameterHistoryCq>();

  @JsonProperty("changeContributionEventCq")
  private ChangeContributionEventCq changeContributionEventCq = null;

  @JsonProperty("billingInfoHistoryCqCollection")
  private List<BillingInfoHistoryCq> billingInfoHistoryCqCollection = new ArrayList<BillingInfoHistoryCq>();

  public ContributionStateQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ContributionStateQuoteQueryResult addContributionParameterHistoryCqCollectionItem(ContributionParameterHistoryCq contributionParameterHistoryCqCollectionItem) {
    this.contributionParameterHistoryCqCollection.add(contributionParameterHistoryCqCollectionItem);
    return this;
  }

  public List<ContributionParameterHistoryCq> getContributionParameterHistoryCqCollection() {
    return contributionParameterHistoryCqCollection;
  }

  public void setContributionParameterHistoryCqCollection(List<ContributionParameterHistoryCq> contributionParameterHistoryCqCollection) {
    this.contributionParameterHistoryCqCollection = contributionParameterHistoryCqCollection;
  }

  public ChangeContributionEventCq getChangeContributionEventCq() {
    return changeContributionEventCq;
  }

  public void setChangeContributionEventCq(ChangeContributionEventCq changeContributionEventCq) {
    this.changeContributionEventCq = changeContributionEventCq;
  }
  public ContributionStateQuoteQueryResult addBillingInfoHistoryCqCollectionItem(BillingInfoHistoryCq billingInfoHistoryCqCollectionItem) {
    this.billingInfoHistoryCqCollection.add(billingInfoHistoryCqCollectionItem);
    return this;
  }

  public List<BillingInfoHistoryCq> getBillingInfoHistoryCqCollection() {
    return billingInfoHistoryCqCollection;
  }

  public void setBillingInfoHistoryCqCollection(List<BillingInfoHistoryCq> billingInfoHistoryCqCollection) {
    this.billingInfoHistoryCqCollection = billingInfoHistoryCqCollection;
  }
}

