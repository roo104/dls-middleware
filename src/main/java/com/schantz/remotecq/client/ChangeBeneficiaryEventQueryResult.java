package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeBeneficiaryEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private ChangeBeneficiaryEventCq eventCq = null;

  public ChangeBeneficiaryEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ChangeBeneficiaryEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(ChangeBeneficiaryEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

