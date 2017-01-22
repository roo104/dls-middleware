package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CompleteTaskInstanceCommand implements Serializable {
  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;


  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }
}

