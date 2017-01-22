package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DetailsHumanTaskQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("humanTaskInstanceStateCq")
  private HumanTaskInstanceStateCq humanTaskInstanceStateCq = null;

  public DetailsHumanTaskQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public HumanTaskInstanceStateCq getHumanTaskInstanceStateCq() {
    return humanTaskInstanceStateCq;
  }

  public void setHumanTaskInstanceStateCq(HumanTaskInstanceStateCq humanTaskInstanceStateCq) {
    this.humanTaskInstanceStateCq = humanTaskInstanceStateCq;
  }
}

