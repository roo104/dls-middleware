package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AddValidationOverrideToEventCommand implements Serializable {
  @JsonProperty("eventInclusionUid")
  private String eventInclusionUid = null;

  @JsonProperty("exceptionKey")
  private CqMessageKey exceptionKey = null;

  @JsonProperty("exceptionKeyText")
  private String exceptionKeyText = null;

  @JsonProperty("overrideReason")
  private String overrideReason = null;


  public String getEventInclusionUid() {
    return eventInclusionUid;
  }

  public void setEventInclusionUid(String eventInclusionUid) {
    this.eventInclusionUid = eventInclusionUid;
  }

  public CqMessageKey getExceptionKey() {
    return exceptionKey;
  }

  public void setExceptionKey(CqMessageKey exceptionKey) {
    this.exceptionKey = exceptionKey;
  }

  public String getExceptionKeyText() {
    return exceptionKeyText;
  }

  public void setExceptionKeyText(String exceptionKeyText) {
    this.exceptionKeyText = exceptionKeyText;
  }

  public String getOverrideReason() {
    return overrideReason;
  }

  public void setOverrideReason(String overrideReason) {
    this.overrideReason = overrideReason;
  }
}

