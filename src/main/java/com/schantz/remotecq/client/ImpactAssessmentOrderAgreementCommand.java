package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactAssessmentOrderAgreementCommand implements Serializable {
  @JsonProperty("draftId")
  private AgreementVersionIdCq draftId = null;


  public AgreementVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(AgreementVersionIdCq draftId) {
    this.draftId = draftId;
  }
}

