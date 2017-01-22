package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class StopPaymentEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private StopPaymentEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public StopPaymentEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(StopPaymentEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

