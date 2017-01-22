package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeHealthRegistrationEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private ChangeHealthRegistrationEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public ChangeHealthRegistrationEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(ChangeHealthRegistrationEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

