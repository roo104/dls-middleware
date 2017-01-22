package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupIdCq implements Serializable {
  @JsonProperty("healthGroupId")
  private String healthGroupId = null;

  @JsonProperty("healthGroupUid")
  private String healthGroupUid = null;

  @JsonProperty("healthGroupName")
  private String healthGroupName = null;


  public String getHealthGroupId() {
    return healthGroupId;
  }

  public void setHealthGroupId(String healthGroupId) {
    this.healthGroupId = healthGroupId;
  }

  public String getHealthGroupUid() {
    return healthGroupUid;
  }

  public void setHealthGroupUid(String healthGroupUid) {
    this.healthGroupUid = healthGroupUid;
  }

  public String getHealthGroupName() {
    return healthGroupName;
  }

  public void setHealthGroupName(String healthGroupName) {
    this.healthGroupName = healthGroupName;
  }
}

