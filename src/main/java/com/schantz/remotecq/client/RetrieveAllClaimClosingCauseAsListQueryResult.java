package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RetrieveAllClaimClosingCauseAsListQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimClosingCauseCqCollection")
  private List<ClaimClosingCauseCq> claimClosingCauseCqCollection = new ArrayList<ClaimClosingCauseCq>();

  public RetrieveAllClaimClosingCauseAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RetrieveAllClaimClosingCauseAsListQueryResult addClaimClosingCauseCqCollectionItem(ClaimClosingCauseCq claimClosingCauseCqCollectionItem) {
    this.claimClosingCauseCqCollection.add(claimClosingCauseCqCollectionItem);
    return this;
  }

  public List<ClaimClosingCauseCq> getClaimClosingCauseCqCollection() {
    return claimClosingCauseCqCollection;
  }

  public void setClaimClosingCauseCqCollection(List<ClaimClosingCauseCq> claimClosingCauseCqCollection) {
    this.claimClosingCauseCqCollection = claimClosingCauseCqCollection;
  }
}

