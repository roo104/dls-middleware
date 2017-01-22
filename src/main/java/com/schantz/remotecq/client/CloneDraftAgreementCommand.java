package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CloneDraftAgreementCommand implements Serializable {
  @JsonProperty("cancelCreatedClone")
  private Boolean cancelCreatedClone = false;

  @JsonProperty("createCloneOf")
  private AgreementVersionIdCq createCloneOf = null;


  public Boolean getCancelCreatedClone() {
    return cancelCreatedClone;
  }

  public void setCancelCreatedClone(Boolean cancelCreatedClone) {
    this.cancelCreatedClone = cancelCreatedClone;
  }

  public AgreementVersionIdCq getCreateCloneOf() {
    return createCloneOf;
  }

  public void setCreateCloneOf(AgreementVersionIdCq createCloneOf) {
    this.createCloneOf = createCloneOf;
  }
}

