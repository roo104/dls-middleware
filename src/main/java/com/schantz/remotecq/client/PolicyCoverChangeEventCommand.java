package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyCoverChangeEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private PolicyCoverChangeEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public PolicyCoverChangeEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(PolicyCoverChangeEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

