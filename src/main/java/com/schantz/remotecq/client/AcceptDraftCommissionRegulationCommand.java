package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AcceptDraftCommissionRegulationCommand implements Serializable {
  @JsonProperty("draftId")
  private CommissionRegulationVersionIdCq draftId = null;

  @JsonProperty("markMeAsCancelled")
  private CommissionRegulationVersionIdCq markMeAsCancelled = null;


  public CommissionRegulationVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(CommissionRegulationVersionIdCq draftId) {
    this.draftId = draftId;
  }

  public CommissionRegulationVersionIdCq getMarkMeAsCancelled() {
    return markMeAsCancelled;
  }

  public void setMarkMeAsCancelled(CommissionRegulationVersionIdCq markMeAsCancelled) {
    this.markMeAsCancelled = markMeAsCancelled;
  }
}

