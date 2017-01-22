package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicySearchConfigurationQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("lifePolicyStatusFrameCq")
  private LifePolicyStatusFrameCq lifePolicyStatusFrameCq = null;

  public PolicySearchConfigurationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public LifePolicyStatusFrameCq getLifePolicyStatusFrameCq() {
    return lifePolicyStatusFrameCq;
  }

  public void setLifePolicyStatusFrameCq(LifePolicyStatusFrameCq lifePolicyStatusFrameCq) {
    this.lifePolicyStatusFrameCq = lifePolicyStatusFrameCq;
  }
}

