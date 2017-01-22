package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TaxInformationSummaryPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("taxInformationEntryCqCollection")
  private List<TaxInformationEntryCq> taxInformationEntryCqCollection = new ArrayList<TaxInformationEntryCq>();

  public TaxInformationSummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TaxInformationSummaryPolicyQueryResult addTaxInformationEntryCqCollectionItem(TaxInformationEntryCq taxInformationEntryCqCollectionItem) {
    this.taxInformationEntryCqCollection.add(taxInformationEntryCqCollectionItem);
    return this;
  }

  public List<TaxInformationEntryCq> getTaxInformationEntryCqCollection() {
    return taxInformationEntryCqCollection;
  }

  public void setTaxInformationEntryCqCollection(List<TaxInformationEntryCq> taxInformationEntryCqCollection) {
    this.taxInformationEntryCqCollection = taxInformationEntryCqCollection;
  }
}

