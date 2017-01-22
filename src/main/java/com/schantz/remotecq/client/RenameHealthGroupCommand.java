package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RenameHealthGroupCommand implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("healthGroupIdCq")
  private HealthGroupIdCq healthGroupIdCq = null;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthGroupIdCq getHealthGroupIdCq() {
    return healthGroupIdCq;
  }

  public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
    this.healthGroupIdCq = healthGroupIdCq;
  }
}

