package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeClauseEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private ChangeClauseEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public ChangeClauseEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(ChangeClauseEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

