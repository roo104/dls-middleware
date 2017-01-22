package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DkEligibleForPalEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private DkEligibleForPalEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public DkEligibleForPalEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DkEligibleForPalEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

