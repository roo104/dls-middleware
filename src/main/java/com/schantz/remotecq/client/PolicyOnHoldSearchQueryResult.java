package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyOnHoldSearchQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("entryCollection")
  private List<PolicyOnHoldQueryResultDataCq> entryCollection = new ArrayList<PolicyOnHoldQueryResultDataCq>();

  @JsonProperty("sortOrderCq")
  private String sortOrderCq = null;

  @JsonProperty("pagingInfoCq")
  private PagingInfoCq pagingInfoCq = null;

  @JsonProperty("allKeysCollection")
  private List<String> allKeysCollection = new ArrayList<String>();

  public PolicyOnHoldSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public PolicyOnHoldSearchQueryResult addEntryCollectionItem(PolicyOnHoldQueryResultDataCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<PolicyOnHoldQueryResultDataCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<PolicyOnHoldQueryResultDataCq> entryCollection) {
    this.entryCollection = entryCollection;
  }

  public String getSortOrderCq() {
    return sortOrderCq;
  }

  public void setSortOrderCq(String sortOrderCq) {
    this.sortOrderCq = sortOrderCq;
  }

  public PagingInfoCq getPagingInfoCq() {
    return pagingInfoCq;
  }

  public void setPagingInfoCq(PagingInfoCq pagingInfoCq) {
    this.pagingInfoCq = pagingInfoCq;
  }
  public PolicyOnHoldSearchQueryResult addAllKeysCollectionItem(String allKeysCollectionItem) {
    this.allKeysCollection.add(allKeysCollectionItem);
    return this;
  }

  public List<String> getAllKeysCollection() {
    return allKeysCollection;
  }

  public void setAllKeysCollection(List<String> allKeysCollection) {
    this.allKeysCollection = allKeysCollection;
  }
}

