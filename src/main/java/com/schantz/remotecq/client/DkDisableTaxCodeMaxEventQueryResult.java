package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DkDisableTaxCodeMaxEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private DkDisableTaxCodeMaxEventCq eventCq = null;

  public DkDisableTaxCodeMaxEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DkDisableTaxCodeMaxEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DkDisableTaxCodeMaxEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

