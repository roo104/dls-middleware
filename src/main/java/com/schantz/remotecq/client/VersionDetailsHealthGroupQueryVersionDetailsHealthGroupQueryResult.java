package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class VersionDetailsHealthGroupQueryVersionDetailsHealthGroupQueryResult implements Serializable {
  @JsonProperty("healthGroupVersionIdCq")
  private HealthGroupVersionIdCq healthGroupVersionIdCq = null;


  public HealthGroupVersionIdCq getHealthGroupVersionIdCq() {
    return healthGroupVersionIdCq;
  }

  public void setHealthGroupVersionIdCq(HealthGroupVersionIdCq healthGroupVersionIdCq) {
    this.healthGroupVersionIdCq = healthGroupVersionIdCq;
  }
}

