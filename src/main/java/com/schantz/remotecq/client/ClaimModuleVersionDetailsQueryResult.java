package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimModuleVersionDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimModuleVersionCq")
  private ClaimModuleVersionCq claimModuleVersionCq = null;

  public ClaimModuleVersionDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ClaimModuleVersionCq getClaimModuleVersionCq() {
    return claimModuleVersionCq;
  }

  public void setClaimModuleVersionCq(ClaimModuleVersionCq claimModuleVersionCq) {
    this.claimModuleVersionCq = claimModuleVersionCq;
  }
}

