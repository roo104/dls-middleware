package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopLegalPartySearchQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("entryCollection")
  private List<TopLegalPartySearchEntry> entryCollection = new ArrayList<TopLegalPartySearchEntry>();

  @JsonProperty("sortOrderCq")
  private String sortOrderCq = null;

  @JsonProperty("pagingInfoCq")
  private PagingInfoCq pagingInfoCq = null;

  @JsonProperty("limitedResult")
  private Boolean limitedResult = false;

  @JsonProperty("errorMessage")
  private TopSearchResultMessageCq errorMessage = null;

  @JsonProperty("resultMessage")
  private TopSearchResultMessageCq resultMessage = null;

  public TopLegalPartySearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopLegalPartySearchQueryResult addEntryCollectionItem(TopLegalPartySearchEntry entryCollectionItem) {
    this.entryCollection.add(entryCollectionItem);
    return this;
  }

  public List<TopLegalPartySearchEntry> getEntryCollection() {
    return entryCollection;
  }

  public void setEntryCollection(List<TopLegalPartySearchEntry> entryCollection) {
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

  public Boolean getLimitedResult() {
    return limitedResult;
  }

  public void setLimitedResult(Boolean limitedResult) {
    this.limitedResult = limitedResult;
  }

  public TopSearchResultMessageCq getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(TopSearchResultMessageCq errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TopSearchResultMessageCq getResultMessage() {
    return resultMessage;
  }

  public void setResultMessage(TopSearchResultMessageCq resultMessage) {
    this.resultMessage = resultMessage;
  }
}

