package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TradeBundleCq implements Serializable {
  @JsonProperty("bundledTime")
  private OffsetDateTime bundledTime = null;

  @JsonProperty("executedTime")
  private OffsetDateTime executedTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("tradeBundleId")
  private TradeBundleIdCq tradeBundleId = null;


  public OffsetDateTime getBundledTime() {
    return bundledTime;
  }

  public void setBundledTime(OffsetDateTime bundledTime) {
    this.bundledTime = bundledTime;
  }

  public OffsetDateTime getExecutedTime() {
    return executedTime;
  }

  public void setExecutedTime(OffsetDateTime executedTime) {
    this.executedTime = executedTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public TradeBundleIdCq getTradeBundleId() {
    return tradeBundleId;
  }

  public void setTradeBundleId(TradeBundleIdCq tradeBundleId) {
    this.tradeBundleId = tradeBundleId;
  }
}

