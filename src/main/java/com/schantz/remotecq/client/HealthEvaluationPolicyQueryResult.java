package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HealthEvaluationPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("healthEvaluationPolicyDataCqCollection")
  private List<HealthEvaluationPolicyDataCq> healthEvaluationPolicyDataCqCollection = new ArrayList<HealthEvaluationPolicyDataCq>();

  public HealthEvaluationPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public HealthEvaluationPolicyQueryResult addHealthEvaluationPolicyDataCqCollectionItem(HealthEvaluationPolicyDataCq healthEvaluationPolicyDataCqCollectionItem) {
    this.healthEvaluationPolicyDataCqCollection.add(healthEvaluationPolicyDataCqCollectionItem);
    return this;
  }

  public List<HealthEvaluationPolicyDataCq> getHealthEvaluationPolicyDataCqCollection() {
    return healthEvaluationPolicyDataCqCollection;
  }

  public void setHealthEvaluationPolicyDataCqCollection(List<HealthEvaluationPolicyDataCq> healthEvaluationPolicyDataCqCollection) {
    this.healthEvaluationPolicyDataCqCollection = healthEvaluationPolicyDataCqCollection;
  }
}

