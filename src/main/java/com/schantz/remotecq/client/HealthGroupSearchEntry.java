package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupSearchEntry implements Serializable {
  @JsonProperty("healthGroupIdCq")
  private HealthGroupIdCq healthGroupIdCq = null;

  @JsonProperty("defaultVersion")
  private HealthGroupVersionIdCq defaultVersion = null;


  public HealthGroupIdCq getHealthGroupIdCq() {
    return healthGroupIdCq;
  }

  public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
    this.healthGroupIdCq = healthGroupIdCq;
  }

  public HealthGroupVersionIdCq getDefaultVersion() {
    return defaultVersion;
  }

  public void setDefaultVersion(HealthGroupVersionIdCq defaultVersion) {
    this.defaultVersion = defaultVersion;
  }
}

