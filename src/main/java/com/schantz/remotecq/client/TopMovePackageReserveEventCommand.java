package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopMovePackageReserveEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private TopMovePackageReserveEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public TopMovePackageReserveEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(TopMovePackageReserveEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

