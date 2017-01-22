package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EventInclusionIdCq implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("lifeEventType")
  private LifeEventTypeCq lifeEventType = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public LifeEventTypeCq getLifeEventType() {
    return lifeEventType;
  }

  public void setLifeEventType(LifeEventTypeCq lifeEventType) {
    this.lifeEventType = lifeEventType;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }
}

