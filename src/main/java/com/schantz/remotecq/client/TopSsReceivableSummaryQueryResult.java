package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsReceivableSummaryQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  public TopSsReceivableSummaryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
}
