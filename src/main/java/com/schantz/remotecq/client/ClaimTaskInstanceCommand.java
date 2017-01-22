package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimTaskInstanceCommand implements Serializable {
  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;

  @JsonProperty("claimed")
  private Boolean claimed = false;


  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }

  public Boolean getClaimed() {
    return claimed;
  }

  public void setClaimed(Boolean claimed) {
    this.claimed = claimed;
  }
}

