package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SuspendProcessInstanceCommand implements Serializable {
  @JsonProperty("processInstanceIdCq")
  private ProcessInstanceIdCq processInstanceIdCq = null;

  @JsonProperty("resume")
  private Boolean resume = false;


  public ProcessInstanceIdCq getProcessInstanceIdCq() {
    return processInstanceIdCq;
  }

  public void setProcessInstanceIdCq(ProcessInstanceIdCq processInstanceIdCq) {
    this.processInstanceIdCq = processInstanceIdCq;
  }

  public Boolean getResume() {
    return resume;
  }

  public void setResume(Boolean resume) {
    this.resume = resume;
  }
}

