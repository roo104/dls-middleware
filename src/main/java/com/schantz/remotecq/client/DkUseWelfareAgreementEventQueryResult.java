package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DkUseWelfareAgreementEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private DkUseWelfareAgreementEventCq eventCq = null;

  public DkUseWelfareAgreementEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DkUseWelfareAgreementEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DkUseWelfareAgreementEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

