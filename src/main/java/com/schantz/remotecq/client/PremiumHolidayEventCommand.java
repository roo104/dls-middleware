package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PremiumHolidayEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("eventCq")
  private PremiumHolidayEventCq eventCq = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public PremiumHolidayEventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(PremiumHolidayEventCq eventCq) {
    this.eventCq = eventCq;
  }
}

