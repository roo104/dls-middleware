package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeHealthRegistrationEventResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private ChangeHealthRegistrationEventCq eventCq = null;

  public ChangeHealthRegistrationEventResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ChangeHealthRegistrationEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(ChangeHealthRegistrationEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

