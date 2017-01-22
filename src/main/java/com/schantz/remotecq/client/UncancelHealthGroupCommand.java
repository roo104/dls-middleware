package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class UncancelHealthGroupCommand implements Serializable {
  @JsonProperty("cancelMe")
  private HealthGroupVersionIdCq cancelMe = null;

  @JsonProperty("uncancelMe")
  private HealthGroupVersionIdCq uncancelMe = null;


  public HealthGroupVersionIdCq getCancelMe() {
    return cancelMe;
  }

  public void setCancelMe(HealthGroupVersionIdCq cancelMe) {
    this.cancelMe = cancelMe;
  }

  public HealthGroupVersionIdCq getUncancelMe() {
    return uncancelMe;
  }

  public void setUncancelMe(HealthGroupVersionIdCq uncancelMe) {
    this.uncancelMe = uncancelMe;
  }
}

