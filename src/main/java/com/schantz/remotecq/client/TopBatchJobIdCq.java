package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopBatchJobIdCq implements Serializable {
  @JsonProperty("activityRequestUid")
  private String activityRequestUid = null;


  public String getActivityRequestUid() {
    return activityRequestUid;
  }

  public void setActivityRequestUid(String activityRequestUid) {
    this.activityRequestUid = activityRequestUid;
  }
}

