package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupVersionInfoCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createBy")
  private String createBy = null;

  @JsonProperty("healthGroupVersionIdCq")
  private HealthGroupVersionIdCq healthGroupVersionIdCq = null;


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public HealthGroupVersionIdCq getHealthGroupVersionIdCq() {
    return healthGroupVersionIdCq;
  }

  public void setHealthGroupVersionIdCq(HealthGroupVersionIdCq healthGroupVersionIdCq) {
    this.healthGroupVersionIdCq = healthGroupVersionIdCq;
  }
}

