package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NewDefaultPolicyEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private NewDefaultPolicyEventCq eventCq = null;

  public NewDefaultPolicyEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public NewDefaultPolicyEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(NewDefaultPolicyEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

