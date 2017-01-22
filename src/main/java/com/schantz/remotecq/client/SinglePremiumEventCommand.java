package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SinglePremiumEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private SinglePremiumEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public SinglePremiumEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(SinglePremiumEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

