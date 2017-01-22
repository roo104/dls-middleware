package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class StartableLifeCaseTypeQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("startableLifeCaseTypeCqCollection")
  private List<StartableLifeCaseTypeCq> startableLifeCaseTypeCqCollection = new ArrayList<StartableLifeCaseTypeCq>();

  public StartableLifeCaseTypeQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public StartableLifeCaseTypeQueryResult addStartableLifeCaseTypeCqCollectionItem(StartableLifeCaseTypeCq startableLifeCaseTypeCqCollectionItem) {
    this.startableLifeCaseTypeCqCollection.add(startableLifeCaseTypeCqCollectionItem);
    return this;
  }

  public List<StartableLifeCaseTypeCq> getStartableLifeCaseTypeCqCollection() {
    return startableLifeCaseTypeCqCollection;
  }

  public void setStartableLifeCaseTypeCqCollection(List<StartableLifeCaseTypeCq> startableLifeCaseTypeCqCollection) {
    this.startableLifeCaseTypeCqCollection = startableLifeCaseTypeCqCollection;
  }
}

