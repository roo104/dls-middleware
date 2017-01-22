package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RetrieveAllClaimRejectionCauseAsListQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimRejectionCauseCqCollection")
  private List<ClaimRejectionCauseCq> claimRejectionCauseCqCollection = new ArrayList<ClaimRejectionCauseCq>();

  public RetrieveAllClaimRejectionCauseAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RetrieveAllClaimRejectionCauseAsListQueryResult addClaimRejectionCauseCqCollectionItem(ClaimRejectionCauseCq claimRejectionCauseCqCollectionItem) {
    this.claimRejectionCauseCqCollection.add(claimRejectionCauseCqCollectionItem);
    return this;
  }

  public List<ClaimRejectionCauseCq> getClaimRejectionCauseCqCollection() {
    return claimRejectionCauseCqCollection;
  }

  public void setClaimRejectionCauseCqCollection(List<ClaimRejectionCauseCq> claimRejectionCauseCqCollection) {
    this.claimRejectionCauseCqCollection = claimRejectionCauseCqCollection;
  }
}

