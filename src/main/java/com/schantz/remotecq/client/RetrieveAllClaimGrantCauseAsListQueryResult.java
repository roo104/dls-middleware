package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RetrieveAllClaimGrantCauseAsListQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimGrantCauseCqCollection")
  private List<ClaimGrantCauseCq> claimGrantCauseCqCollection = new ArrayList<ClaimGrantCauseCq>();

  public RetrieveAllClaimGrantCauseAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RetrieveAllClaimGrantCauseAsListQueryResult addClaimGrantCauseCqCollectionItem(ClaimGrantCauseCq claimGrantCauseCqCollectionItem) {
    this.claimGrantCauseCqCollection.add(claimGrantCauseCqCollectionItem);
    return this;
  }

  public List<ClaimGrantCauseCq> getClaimGrantCauseCqCollection() {
    return claimGrantCauseCqCollection;
  }

  public void setClaimGrantCauseCqCollection(List<ClaimGrantCauseCq> claimGrantCauseCqCollection) {
    this.claimGrantCauseCqCollection = claimGrantCauseCqCollection;
  }
}

