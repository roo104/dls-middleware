package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RetrieveAllClaimTreatmentTypeAsListQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimTreatmentProductCqCollection")
  private List<ClaimTreatmentProductCq> claimTreatmentProductCqCollection = new ArrayList<ClaimTreatmentProductCq>();

  public RetrieveAllClaimTreatmentTypeAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RetrieveAllClaimTreatmentTypeAsListQueryResult addClaimTreatmentProductCqCollectionItem(ClaimTreatmentProductCq claimTreatmentProductCqCollectionItem) {
    this.claimTreatmentProductCqCollection.add(claimTreatmentProductCqCollectionItem);
    return this;
  }

  public List<ClaimTreatmentProductCq> getClaimTreatmentProductCqCollection() {
    return claimTreatmentProductCqCollection;
  }

  public void setClaimTreatmentProductCqCollection(List<ClaimTreatmentProductCq> claimTreatmentProductCqCollection) {
    this.claimTreatmentProductCqCollection = claimTreatmentProductCqCollection;
  }
}

