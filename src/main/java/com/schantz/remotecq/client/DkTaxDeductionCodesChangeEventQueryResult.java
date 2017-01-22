package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DkTaxDeductionCodesChangeEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private DkTaxDeductionCodesChangeEventCq eventCq = null;

  public DkTaxDeductionCodesChangeEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DkTaxDeductionCodesChangeEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DkTaxDeductionCodesChangeEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

