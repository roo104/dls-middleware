package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyStatusQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("policyStatusEntryCqCollection")
  private List<PolicyStatusEntryCq> policyStatusEntryCqCollection = new ArrayList<PolicyStatusEntryCq>();

  public PolicyStatusQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public PolicyStatusQueryResult addPolicyStatusEntryCqCollectionItem(PolicyStatusEntryCq policyStatusEntryCqCollectionItem) {
    this.policyStatusEntryCqCollection.add(policyStatusEntryCqCollectionItem);
    return this;
  }

  public List<PolicyStatusEntryCq> getPolicyStatusEntryCqCollection() {
    return policyStatusEntryCqCollection;
  }

  public void setPolicyStatusEntryCqCollection(List<PolicyStatusEntryCq> policyStatusEntryCqCollection) {
    this.policyStatusEntryCqCollection = policyStatusEntryCqCollection;
  }
}

