package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EventNavigationQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventNavigationCq")
  private EventNavigationCq eventNavigationCq = null;

  public EventNavigationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public EventNavigationCq getEventNavigationCq() {
    return eventNavigationCq;
  }

  public void setEventNavigationCq(EventNavigationCq eventNavigationCq) {
    this.eventNavigationCq = eventNavigationCq;
  }
}

