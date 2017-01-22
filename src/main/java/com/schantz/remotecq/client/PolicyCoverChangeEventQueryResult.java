package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyCoverChangeEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private PolicyCoverChangeEventCq eventCq = null;

  public PolicyCoverChangeEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public PolicyCoverChangeEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(PolicyCoverChangeEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

