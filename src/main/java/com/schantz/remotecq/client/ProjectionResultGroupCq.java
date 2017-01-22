package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionResultGroupCq implements Serializable {
  @JsonProperty("lifeCoverStateCq")
  private String lifeCoverStateCq = null;

  @JsonProperty("projectionResultSectionCqCollection")
  private List<ProjectionResultSectionCq> projectionResultSectionCqCollection = new ArrayList<ProjectionResultSectionCq>();


  public String getLifeCoverStateCq() {
    return lifeCoverStateCq;
  }

  public void setLifeCoverStateCq(String lifeCoverStateCq) {
    this.lifeCoverStateCq = lifeCoverStateCq;
  }
  public ProjectionResultGroupCq addProjectionResultSectionCqCollectionItem(ProjectionResultSectionCq projectionResultSectionCqCollectionItem) {
    this.projectionResultSectionCqCollection.add(projectionResultSectionCqCollectionItem);
    return this;
  }

  public List<ProjectionResultSectionCq> getProjectionResultSectionCqCollection() {
    return projectionResultSectionCqCollection;
  }

  public void setProjectionResultSectionCqCollection(List<ProjectionResultSectionCq> projectionResultSectionCqCollection) {
    this.projectionResultSectionCqCollection = projectionResultSectionCqCollection;
  }
}

