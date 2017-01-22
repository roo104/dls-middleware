package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RemoveValidationOverrideFromEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("overrideId")
  private ValidationOverrideIdCq overrideId = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public ValidationOverrideIdCq getOverrideId() {
    return overrideId;
  }

  public void setOverrideId(ValidationOverrideIdCq overrideId) {
    this.overrideId = overrideId;
  }
}

