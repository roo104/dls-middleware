package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DetailedImpactEntityQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("lifeProductVersionImpactEntityCq")
  private LifeProductVersionImpactEntityCq lifeProductVersionImpactEntityCq = null;

  public DetailedImpactEntityQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public LifeProductVersionImpactEntityCq getLifeProductVersionImpactEntityCq() {
    return lifeProductVersionImpactEntityCq;
  }

  public void setLifeProductVersionImpactEntityCq(LifeProductVersionImpactEntityCq lifeProductVersionImpactEntityCq) {
    this.lifeProductVersionImpactEntityCq = lifeProductVersionImpactEntityCq;
  }
}

