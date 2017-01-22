package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class InsuranceTypeSummaryPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("insuranceTypeEntryCqCollection")
  private List<InsuranceTypeEntryCq> insuranceTypeEntryCqCollection = new ArrayList<InsuranceTypeEntryCq>();

  public InsuranceTypeSummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public InsuranceTypeSummaryPolicyQueryResult addInsuranceTypeEntryCqCollectionItem(InsuranceTypeEntryCq insuranceTypeEntryCqCollectionItem) {
    this.insuranceTypeEntryCqCollection.add(insuranceTypeEntryCqCollectionItem);
    return this;
  }

  public List<InsuranceTypeEntryCq> getInsuranceTypeEntryCqCollection() {
    return insuranceTypeEntryCqCollection;
  }

  public void setInsuranceTypeEntryCqCollection(List<InsuranceTypeEntryCq> insuranceTypeEntryCqCollection) {
    this.insuranceTypeEntryCqCollection = insuranceTypeEntryCqCollection;
  }
}

