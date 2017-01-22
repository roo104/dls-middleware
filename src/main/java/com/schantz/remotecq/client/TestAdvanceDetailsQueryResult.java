package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TestAdvanceDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("testAdvanceMessageCq")
  private TestAdvanceMessageCq testAdvanceMessageCq = null;

  @JsonProperty("testAdvanceCq")
  private TestAdvanceCq testAdvanceCq = null;

  public TestAdvanceDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TestAdvanceMessageCq getTestAdvanceMessageCq() {
    return testAdvanceMessageCq;
  }

  public void setTestAdvanceMessageCq(TestAdvanceMessageCq testAdvanceMessageCq) {
    this.testAdvanceMessageCq = testAdvanceMessageCq;
  }

  public TestAdvanceCq getTestAdvanceCq() {
    return testAdvanceCq;
  }

  public void setTestAdvanceCq(TestAdvanceCq testAdvanceCq) {
    this.testAdvanceCq = testAdvanceCq;
  }
}

