package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopChangeSettlementFeeEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private TopChangeSettlementFeeEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public TopChangeSettlementFeeEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(TopChangeSettlementFeeEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

