package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SubEventTransCq implements Serializable {
  @JsonProperty("type")
  private String type = null;


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

