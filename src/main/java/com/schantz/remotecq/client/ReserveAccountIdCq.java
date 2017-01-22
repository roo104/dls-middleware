package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ReserveAccountIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

