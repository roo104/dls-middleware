package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeBeneficiaryEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private ChangeBeneficiaryEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public ChangeBeneficiaryEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(ChangeBeneficiaryEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

