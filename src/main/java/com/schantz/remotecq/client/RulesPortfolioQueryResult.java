package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RulesPortfolioQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("defaultRebalancingFrequency")
  private String defaultRebalancingFrequency = null;

  @JsonProperty("allowedRebalancingFrequencyCollection")
  private List<String> allowedRebalancingFrequencyCollection = new ArrayList<String>();

  @JsonProperty("ruleFundCqCollection")
  private List<RuleFundCq> ruleFundCqCollection = new ArrayList<RuleFundCq>();

  public RulesPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDefaultRebalancingFrequency() {
    return defaultRebalancingFrequency;
  }

  public void setDefaultRebalancingFrequency(String defaultRebalancingFrequency) {
    this.defaultRebalancingFrequency = defaultRebalancingFrequency;
  }
  public RulesPortfolioQueryResult addAllowedRebalancingFrequencyCollectionItem(String allowedRebalancingFrequencyCollectionItem) {
    this.allowedRebalancingFrequencyCollection.add(allowedRebalancingFrequencyCollectionItem);
    return this;
  }

  public List<String> getAllowedRebalancingFrequencyCollection() {
    return allowedRebalancingFrequencyCollection;
  }

  public void setAllowedRebalancingFrequencyCollection(List<String> allowedRebalancingFrequencyCollection) {
    this.allowedRebalancingFrequencyCollection = allowedRebalancingFrequencyCollection;
  }
  public RulesPortfolioQueryResult addRuleFundCqCollectionItem(RuleFundCq ruleFundCqCollectionItem) {
    this.ruleFundCqCollection.add(ruleFundCqCollectionItem);
    return this;
  }

  public List<RuleFundCq> getRuleFundCqCollection() {
    return ruleFundCqCollection;
  }

  public void setRuleFundCqCollection(List<RuleFundCq> ruleFundCqCollection) {
    this.ruleFundCqCollection = ruleFundCqCollection;
  }
}

