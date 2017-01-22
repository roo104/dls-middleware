package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DkDepositEventQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("eventCq")
  private DkDepositEventCq eventCq = null;

  @JsonProperty("oiAccountReceivableCompanyIdCq")
  private CompanyIdCq oiAccountReceivableCompanyIdCq = null;

  public DkDepositEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DkDepositEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DkDepositEventCq eventCq) {
    this.eventCq = eventCq;
  }

  public CompanyIdCq getOiAccountReceivableCompanyIdCq() {
    return oiAccountReceivableCompanyIdCq;
  }

  public void setOiAccountReceivableCompanyIdCq(CompanyIdCq oiAccountReceivableCompanyIdCq) {
    this.oiAccountReceivableCompanyIdCq = oiAccountReceivableCompanyIdCq;
  }
}

