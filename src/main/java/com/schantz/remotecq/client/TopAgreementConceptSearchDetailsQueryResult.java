package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementConceptSearchDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("topAgreementConceptSearchResultCq")
  private TopAgreementConceptSearchResultCq topAgreementConceptSearchResultCq = null;

  @JsonProperty("topAgreementConceptSearchParametersCq")
  private TopAgreementConceptSearchParametersCq topAgreementConceptSearchParametersCq = null;

  @JsonProperty("searchData")
  private TopCVRAgreementSearchDataCq searchData = null;

  public TopAgreementConceptSearchDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TopAgreementConceptSearchResultCq getTopAgreementConceptSearchResultCq() {
    return topAgreementConceptSearchResultCq;
  }

  public void setTopAgreementConceptSearchResultCq(TopAgreementConceptSearchResultCq topAgreementConceptSearchResultCq) {
    this.topAgreementConceptSearchResultCq = topAgreementConceptSearchResultCq;
  }

  public TopAgreementConceptSearchParametersCq getTopAgreementConceptSearchParametersCq() {
    return topAgreementConceptSearchParametersCq;
  }

  public void setTopAgreementConceptSearchParametersCq(TopAgreementConceptSearchParametersCq topAgreementConceptSearchParametersCq) {
    this.topAgreementConceptSearchParametersCq = topAgreementConceptSearchParametersCq;
  }

  public TopCVRAgreementSearchDataCq getSearchData() {
    return searchData;
  }

  public void setSearchData(TopCVRAgreementSearchDataCq searchData) {
    this.searchData = searchData;
  }
}

