package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("ageDateCqCollection")
  private List<AgeDateCq> ageDateCqCollection = new ArrayList<AgeDateCq>();

  @JsonProperty("projectionResultGroupCqCollection")
  private List<ProjectionResultGroupCq> projectionResultGroupCqCollection = new ArrayList<ProjectionResultGroupCq>();

  public ProjectionQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ProjectionQueryResult addAgeDateCqCollectionItem(AgeDateCq ageDateCqCollectionItem) {
    this.ageDateCqCollection.add(ageDateCqCollectionItem);
    return this;
  }

  public List<AgeDateCq> getAgeDateCqCollection() {
    return ageDateCqCollection;
  }

  public void setAgeDateCqCollection(List<AgeDateCq> ageDateCqCollection) {
    this.ageDateCqCollection = ageDateCqCollection;
  }
  public ProjectionQueryResult addProjectionResultGroupCqCollectionItem(ProjectionResultGroupCq projectionResultGroupCqCollectionItem) {
    this.projectionResultGroupCqCollection.add(projectionResultGroupCqCollectionItem);
    return this;
  }

  public List<ProjectionResultGroupCq> getProjectionResultGroupCqCollection() {
    return projectionResultGroupCqCollection;
  }

  public void setProjectionResultGroupCqCollection(List<ProjectionResultGroupCq> projectionResultGroupCqCollection) {
    this.projectionResultGroupCqCollection = projectionResultGroupCqCollection;
  }
}

