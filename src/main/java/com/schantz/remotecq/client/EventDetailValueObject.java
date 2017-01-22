package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EventDetailValueObject implements Serializable {
  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("type")
  private String type = null;


  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

