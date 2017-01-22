package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DetailsHumanTaskQueryDetailsHumanTaskQueryResult implements Serializable {
  @JsonProperty("taskId")
  private ProcessInstanceStateIdCq taskId = null;


  public ProcessInstanceStateIdCq getTaskId() {
    return taskId;
  }

  public void setTaskId(ProcessInstanceStateIdCq taskId) {
    this.taskId = taskId;
  }
}

