package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ErrorResponse implements Serializable {
  @JsonProperty("errorCode")
  private Integer errorCode = null;

  @JsonProperty("message")
  private String message = null;

  public Integer getErrorCode() {
    return errorCode;
  }
  public String getMessage() {
    return message;
  }
}

