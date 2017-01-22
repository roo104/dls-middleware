package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EditEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("handleReceivables")
  private Boolean handleReceivables = false;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public Boolean getHandleReceivables() {
    return handleReceivables;
  }

  public void setHandleReceivables(Boolean handleReceivables) {
    this.handleReceivables = handleReceivables;
  }
}

