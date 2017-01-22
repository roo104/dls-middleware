package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPolicySearchQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("policySearchEntryCollection")
  private List<PolicySearchEntry> policySearchEntryCollection = new ArrayList<PolicySearchEntry>();

  public TopSsPolicySearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsPolicySearchQueryResult addPolicySearchEntryCollectionItem(PolicySearchEntry policySearchEntryCollectionItem) {
    this.policySearchEntryCollection.add(policySearchEntryCollectionItem);
    return this;
  }

  public List<PolicySearchEntry> getPolicySearchEntryCollection() {
    return policySearchEntryCollection;
  }

  public void setPolicySearchEntryCollection(List<PolicySearchEntry> policySearchEntryCollection) {
    this.policySearchEntryCollection = policySearchEntryCollection;
  }
}

