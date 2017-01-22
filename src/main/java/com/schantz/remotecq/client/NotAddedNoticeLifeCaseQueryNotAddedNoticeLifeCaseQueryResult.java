package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class NotAddedNoticeLifeCaseQueryNotAddedNoticeLifeCaseQueryResult implements Serializable {
  @JsonProperty("lifeCaseIdCq")
  private LifeCaseIdCq lifeCaseIdCq = null;


  public LifeCaseIdCq getLifeCaseIdCq() {
    return lifeCaseIdCq;
  }

  public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
    this.lifeCaseIdCq = lifeCaseIdCq;
  }
}

