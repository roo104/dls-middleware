package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementSummaryInfoQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("activePoliciesCount")
  private Long activePoliciesCount = null;

  public TopAgreementSummaryInfoQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Long getActivePoliciesCount() {
    return activePoliciesCount;
  }

  public void setActivePoliciesCount(Long activePoliciesCount) {
    this.activePoliciesCount = activePoliciesCount;
  }
}

