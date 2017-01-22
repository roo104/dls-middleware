package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopCommissionReceiverAkkvisitoerInfoQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("topCommissionReceiverAkkvisitoerInfoCq")
  private TopCommissionReceiverAkkvisitoerInfoCq topCommissionReceiverAkkvisitoerInfoCq = null;

  public TopCommissionReceiverAkkvisitoerInfoQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TopCommissionReceiverAkkvisitoerInfoCq getTopCommissionReceiverAkkvisitoerInfoCq() {
    return topCommissionReceiverAkkvisitoerInfoCq;
  }

  public void setTopCommissionReceiverAkkvisitoerInfoCq(TopCommissionReceiverAkkvisitoerInfoCq topCommissionReceiverAkkvisitoerInfoCq) {
    this.topCommissionReceiverAkkvisitoerInfoCq = topCommissionReceiverAkkvisitoerInfoCq;
  }
}

