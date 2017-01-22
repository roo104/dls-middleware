package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class VersionDetailsCommissionRegulationQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("commissionRegulationVersionDetailsCq")
  private CommissionRegulationVersionDetailsCq commissionRegulationVersionDetailsCq = null;

  public VersionDetailsCommissionRegulationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public CommissionRegulationVersionDetailsCq getCommissionRegulationVersionDetailsCq() {
    return commissionRegulationVersionDetailsCq;
  }

  public void setCommissionRegulationVersionDetailsCq(CommissionRegulationVersionDetailsCq commissionRegulationVersionDetailsCq) {
    this.commissionRegulationVersionDetailsCq = commissionRegulationVersionDetailsCq;
  }
}

