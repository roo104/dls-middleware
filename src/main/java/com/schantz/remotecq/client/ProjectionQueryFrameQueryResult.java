package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionQueryFrameQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("projectionQueryFrame")
  private ProjectionQueryFrame projectionQueryFrame = null;

  public ProjectionQueryFrameQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ProjectionQueryFrame getProjectionQueryFrame() {
    return projectionQueryFrame;
  }

  public void setProjectionQueryFrame(ProjectionQueryFrame projectionQueryFrame) {
    this.projectionQueryFrame = projectionQueryFrame;
  }
}

