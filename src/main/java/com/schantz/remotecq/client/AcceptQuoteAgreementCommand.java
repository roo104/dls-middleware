package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AcceptQuoteAgreementCommand implements Serializable {
  @JsonProperty("qouteId")
  private AgreementVersionIdCq qouteId = null;

  @JsonProperty("markMeAsCancelled")
  private AgreementVersionIdCq markMeAsCancelled = null;


  public AgreementVersionIdCq getQouteId() {
    return qouteId;
  }

  public void setQouteId(AgreementVersionIdCq qouteId) {
    this.qouteId = qouteId;
  }

  public AgreementVersionIdCq getMarkMeAsCancelled() {
    return markMeAsCancelled;
  }

  public void setMarkMeAsCancelled(AgreementVersionIdCq markMeAsCancelled) {
    this.markMeAsCancelled = markMeAsCancelled;
  }
}

