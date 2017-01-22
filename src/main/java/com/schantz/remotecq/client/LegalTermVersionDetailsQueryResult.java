package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LegalTermVersionDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("legalTermVersionCq")
  private LegalTermVersionCq legalTermVersionCq = null;

  public LegalTermVersionDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public LegalTermVersionCq getLegalTermVersionCq() {
    return legalTermVersionCq;
  }

  public void setLegalTermVersionCq(LegalTermVersionCq legalTermVersionCq) {
    this.legalTermVersionCq = legalTermVersionCq;
  }
}

