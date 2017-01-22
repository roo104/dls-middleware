package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AcceptDraftHealthGroupCommand implements Serializable {
  @JsonProperty("markMeAsCancelled")
  private HealthGroupVersionIdCq markMeAsCancelled = null;

  @JsonProperty("draftId")
  private HealthGroupVersionIdCq draftId = null;


  public HealthGroupVersionIdCq getMarkMeAsCancelled() {
    return markMeAsCancelled;
  }

  public void setMarkMeAsCancelled(HealthGroupVersionIdCq markMeAsCancelled) {
    this.markMeAsCancelled = markMeAsCancelled;
  }

  public HealthGroupVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(HealthGroupVersionIdCq draftId) {
    this.draftId = draftId;
  }
}

