package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BasicClaimTreatmentTypeQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("claimTreatmentTypeCq")
  private ClaimTreatmentTypeCq claimTreatmentTypeCq = null;

  public BasicClaimTreatmentTypeQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ClaimTreatmentTypeCq getClaimTreatmentTypeCq() {
    return claimTreatmentTypeCq;
  }

  public void setClaimTreatmentTypeCq(ClaimTreatmentTypeCq claimTreatmentTypeCq) {
    this.claimTreatmentTypeCq = claimTreatmentTypeCq;
  }
}

