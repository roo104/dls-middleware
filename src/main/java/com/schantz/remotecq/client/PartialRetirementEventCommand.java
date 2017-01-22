package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PartialRetirementEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private PartialRetirementEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public PartialRetirementEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(PartialRetirementEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

