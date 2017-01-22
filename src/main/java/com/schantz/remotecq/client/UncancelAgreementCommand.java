package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class UncancelAgreementCommand implements Serializable {
  @JsonProperty("markAsCancelled")
  private AgreementVersionIdCq markAsCancelled = null;

  @JsonProperty("uncancelMe")
  private AgreementVersionIdCq uncancelMe = null;


  public AgreementVersionIdCq getMarkAsCancelled() {
    return markAsCancelled;
  }

  public void setMarkAsCancelled(AgreementVersionIdCq markAsCancelled) {
    this.markAsCancelled = markAsCancelled;
  }

  public AgreementVersionIdCq getUncancelMe() {
    return uncancelMe;
  }

  public void setUncancelMe(AgreementVersionIdCq uncancelMe) {
    this.uncancelMe = uncancelMe;
  }
}

