package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PingCommand implements Serializable {
  @JsonProperty("message")
  private String message = null;


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

