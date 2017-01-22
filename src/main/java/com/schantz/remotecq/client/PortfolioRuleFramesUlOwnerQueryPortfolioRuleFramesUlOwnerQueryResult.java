package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioRuleFramesUlOwnerQueryPortfolioRuleFramesUlOwnerQueryResult implements Serializable {
  @JsonProperty("viewAtTime")
  private OffsetDateTime viewAtTime = null;

  @JsonProperty("ownerId")
  private UnitLinkedOwnerIdCq ownerId = null;

  @JsonProperty("onlyLifeCycleFrames")
  private Boolean onlyLifeCycleFrames = false;


  public OffsetDateTime getViewAtTime() {
    return viewAtTime;
  }

  public void setViewAtTime(OffsetDateTime viewAtTime) {
    this.viewAtTime = viewAtTime;
  }

  public UnitLinkedOwnerIdCq getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UnitLinkedOwnerIdCq ownerId) {
    this.ownerId = ownerId;
  }

  public Boolean getOnlyLifeCycleFrames() {
    return onlyLifeCycleFrames;
  }

  public void setOnlyLifeCycleFrames(Boolean onlyLifeCycleFrames) {
    this.onlyLifeCycleFrames = onlyLifeCycleFrames;
  }
}

