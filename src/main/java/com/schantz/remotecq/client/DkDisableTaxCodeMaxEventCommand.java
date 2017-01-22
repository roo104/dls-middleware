package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DkDisableTaxCodeMaxEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private DkDisableTaxCodeMaxEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public DkDisableTaxCodeMaxEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(DkDisableTaxCodeMaxEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

