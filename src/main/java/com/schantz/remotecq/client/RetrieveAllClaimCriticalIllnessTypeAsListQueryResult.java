package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RetrieveAllClaimCriticalIllnessTypeAsListQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimCriticalIllnessProductCqCollection")
  private List<ClaimCriticalIllnessProductCq> claimCriticalIllnessProductCqCollection = new ArrayList<ClaimCriticalIllnessProductCq>();

  public RetrieveAllClaimCriticalIllnessTypeAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RetrieveAllClaimCriticalIllnessTypeAsListQueryResult addClaimCriticalIllnessProductCqCollectionItem(ClaimCriticalIllnessProductCq claimCriticalIllnessProductCqCollectionItem) {
    this.claimCriticalIllnessProductCqCollection.add(claimCriticalIllnessProductCqCollectionItem);
    return this;
  }

  public List<ClaimCriticalIllnessProductCq> getClaimCriticalIllnessProductCqCollection() {
    return claimCriticalIllnessProductCqCollection;
  }

  public void setClaimCriticalIllnessProductCqCollection(List<ClaimCriticalIllnessProductCq> claimCriticalIllnessProductCqCollection) {
    this.claimCriticalIllnessProductCqCollection = claimCriticalIllnessProductCqCollection;
  }
}

