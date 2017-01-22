package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ActiveVersionIdListAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("versionUniqueIdCollection")
  private List<AgreementVersionUniqueId> versionUniqueIdCollection = new ArrayList<AgreementVersionUniqueId>();

  public ActiveVersionIdListAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ActiveVersionIdListAgreementQueryResult addVersionUniqueIdCollectionItem(AgreementVersionUniqueId versionUniqueIdCollectionItem) {
    this.versionUniqueIdCollection.add(versionUniqueIdCollectionItem);
    return this;
  }

  public List<AgreementVersionUniqueId> getVersionUniqueIdCollection() {
    return versionUniqueIdCollection;
  }

  public void setVersionUniqueIdCollection(List<AgreementVersionUniqueId> versionUniqueIdCollection) {
    this.versionUniqueIdCollection = versionUniqueIdCollection;
  }
}

