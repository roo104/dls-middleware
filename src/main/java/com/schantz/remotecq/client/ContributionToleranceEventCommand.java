package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionToleranceEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private ContributionToleranceEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public ContributionToleranceEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(ContributionToleranceEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

