package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class NewDefaultPolicyEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private NewDefaultPolicyEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public NewDefaultPolicyEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(NewDefaultPolicyEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

