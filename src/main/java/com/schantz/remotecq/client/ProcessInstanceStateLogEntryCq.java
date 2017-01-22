package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessInstanceStateLogEntryCq implements Serializable {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("cause")
  private String cause = null;

  @JsonProperty("processInstanceStateLogEntryTypeCq")
  private String processInstanceStateLogEntryTypeCq = null;


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public String getProcessInstanceStateLogEntryTypeCq() {
    return processInstanceStateLogEntryTypeCq;
  }

  public void setProcessInstanceStateLogEntryTypeCq(String processInstanceStateLogEntryTypeCq) {
    this.processInstanceStateLogEntryTypeCq = processInstanceStateLogEntryTypeCq;
  }
}

