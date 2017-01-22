package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class WorkpadQueryWorkpadQueryResult implements Serializable {
  @JsonProperty("workpadId")
  private WorkpadIdCq workpadId = null;


  public WorkpadIdCq getWorkpadId() {
    return workpadId;
  }

  public void setWorkpadId(WorkpadIdCq workpadId) {
    this.workpadId = workpadId;
  }
}

