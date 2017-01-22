package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LifeEventTypesQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("lifeEventTypeCqCollection")
  private List<LifeEventTypeCq> lifeEventTypeCqCollection = new ArrayList<LifeEventTypeCq>();

  public LifeEventTypesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public LifeEventTypesQueryResult addLifeEventTypeCqCollectionItem(LifeEventTypeCq lifeEventTypeCqCollectionItem) {
    this.lifeEventTypeCqCollection.add(lifeEventTypeCqCollectionItem);
    return this;
  }

  public List<LifeEventTypeCq> getLifeEventTypeCqCollection() {
    return lifeEventTypeCqCollection;
  }

  public void setLifeEventTypeCqCollection(List<LifeEventTypeCq> lifeEventTypeCqCollection) {
    this.lifeEventTypeCqCollection = lifeEventTypeCqCollection;
  }
}

