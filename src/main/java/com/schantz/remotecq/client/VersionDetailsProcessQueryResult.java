package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class VersionDetailsProcessQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("processVersionCq")
  private ProcessVersionCq processVersionCq = null;

  public VersionDetailsProcessQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ProcessVersionCq getProcessVersionCq() {
    return processVersionCq;
  }

  public void setProcessVersionCq(ProcessVersionCq processVersionCq) {
    this.processVersionCq = processVersionCq;
  }
}

