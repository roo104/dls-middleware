package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupIdResultEntryCq implements Serializable {
  @JsonProperty("healthGroupUid")
  private String healthGroupUid = null;

  @JsonProperty("name")
  private String name = null;


  public String getHealthGroupUid() {
    return healthGroupUid;
  }

  public void setHealthGroupUid(String healthGroupUid) {
    this.healthGroupUid = healthGroupUid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

