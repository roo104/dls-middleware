package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EventPlacementCq implements Serializable {
  @JsonProperty("placementType")
  private String placementType = null;

  @JsonProperty("relativeToInclusionId")
  private EventInclusionIdCq relativeToInclusionId = null;


  public String getPlacementType() {
    return placementType;
  }

  public void setPlacementType(String placementType) {
    this.placementType = placementType;
  }

  public EventInclusionIdCq getRelativeToInclusionId() {
    return relativeToInclusionId;
  }

  public void setRelativeToInclusionId(EventInclusionIdCq relativeToInclusionId) {
    this.relativeToInclusionId = relativeToInclusionId;
  }
}

