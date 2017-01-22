package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DisabilityDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("entryCollection")
  private List<ClaimGrantDisabilityVersionCq> entryCollection = new ArrayList<ClaimGrantDisabilityVersionCq>();

  @JsonProperty("sortOrderCq")
  private String sortOrderCq = null;

  @JsonProperty("pagingInfoCq")
  private PagingInfoCq pagingInfoCq = null;

  public DisabilityDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public DisabilityDetailsQueryResult addEntryCollectionItem(ClaimGrantDisabilityVersionCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<ClaimGrantDisabilityVersionCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<ClaimGrantDisabilityVersionCq> entryCollection) {
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
}

