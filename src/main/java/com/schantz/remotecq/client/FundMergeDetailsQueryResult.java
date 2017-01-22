package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class FundMergeDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("entryCollection")
  private List<MergeDetailsCq> entryCollection = new ArrayList<MergeDetailsCq>();

  @JsonProperty("sortOrderCq")
  private String sortOrderCq = null;

  @JsonProperty("pagingInfoCq")
  private PagingInfoCq pagingInfoCq = null;

  @JsonProperty("mergeDetailsCq")
  private MergeDetailsCq mergeDetailsCq = null;

  public FundMergeDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public FundMergeDetailsQueryResult addEntryCollectionItem(MergeDetailsCq entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<MergeDetailsCq> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<MergeDetailsCq> entryCollection) {
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

  public MergeDetailsCq getMergeDetailsCq() {
    return mergeDetailsCq;
  }

  public void setMergeDetailsCq(MergeDetailsCq mergeDetailsCq) {
    this.mergeDetailsCq = mergeDetailsCq;
  }
}

