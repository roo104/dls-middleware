package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HierarchyAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("up")
  private AgreementGraphNodeCq up = null;

  @JsonProperty("down")
  private AgreementGraphNodeCq down = null;

  public HierarchyAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public AgreementGraphNodeCq getUp() {
    return up;
  }

  public void setUp(AgreementGraphNodeCq up) {
    this.up = up;
  }

  public AgreementGraphNodeCq getDown() {
    return down;
  }

  public void setDown(AgreementGraphNodeCq down) {
    this.down = down;
  }
}

