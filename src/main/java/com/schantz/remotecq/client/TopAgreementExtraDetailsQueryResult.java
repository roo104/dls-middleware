package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementExtraDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("siblingCollection")
  private List<AgreementVersionIdCq> siblingCollection = new ArrayList<AgreementVersionIdCq>();

  public TopAgreementExtraDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopAgreementExtraDetailsQueryResult addSiblingCollectionItem(AgreementVersionIdCq siblingCollectionItem) {
    this.siblingCollection.add(siblingCollectionItem);
    return this;
  }

  public List<AgreementVersionIdCq> getSiblingCollection() {
    return siblingCollection;
  }

  public void setSiblingCollection(List<AgreementVersionIdCq> siblingCollection) {
    this.siblingCollection = siblingCollection;
  }
}

