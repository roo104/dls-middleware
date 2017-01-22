package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopBatchJobStartCommand implements Serializable {
  @JsonProperty("scheduleId")
  private String scheduleId = null;


  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }
}

